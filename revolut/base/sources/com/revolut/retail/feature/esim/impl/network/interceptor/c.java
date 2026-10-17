package com.revolut.retail.feature.esim.impl.network.interceptor;

import ch.qos.logback.core.util.FileSize;
import com.google.gson.reflect.TypeToken;
import com.revolut.retail.feature.esim.impl.network.interceptor.b;
import com.revolut.retail.feature.esim.impl.repositories.exceptions.EsimRestrictedException;
import eej.d;
import java.util.concurrent.CopyOnWriteArrayList;
import kg.o;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import nfj.n1;
import okhttp3.Interceptor;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import ulm.r1;
import ulm.y0;
import zhm.h0;
import zlm.h;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements Interceptor {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f100575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n1 f100576b;

    public c(o gson, n1 store) {
        Intrinsics.checkNotNullParameter(gson, "gson");
        Intrinsics.checkNotNullParameter(store, "store");
        this.f100575a = gson;
        this.f100576b = store;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(y0 chain) throws EsimRestrictedException {
        Integer code;
        b.a params;
        String title;
        Intrinsics.checkNotNullParameter(chain, "chain");
        h hVar = (h) chain;
        Response responseB = hVar.b(hVar.e);
        if (responseB.d == 403) {
            d restriction = null;
            try {
                r1 r1VarH = responseB.h(FileSize.MB_COEFFICIENT);
                try {
                    b bVar = (b) this.f100575a.b(r1VarH.charStream(), TypeToken.get(b.class));
                    r1VarH.close();
                    if (bVar != null && (code = bVar.getCode()) != null && code.intValue() == 12400035 && (params = bVar.getParams()) != null && (title = params.getTitle()) != null) {
                        if (d0.W(title)) {
                            title = null;
                        }
                        if (title != null) {
                            b.a params2 = bVar.getParams();
                            String countryCode = params2 != null ? params2.getCountryCode() : null;
                            b.a params3 = bVar.getParams();
                            restriction = new d(title, countryCode, params3 != null ? params3.getDescription() : null);
                        }
                    }
                } finally {
                }
            } catch (Exception e) {
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
            }
            if (restriction != null) {
                n1 n1Var = this.f100576b;
                n1Var.getClass();
                Intrinsics.checkNotNullParameter(restriction, "restriction");
                n1Var.f214998a.k(restriction);
                responseB.close();
                Intrinsics.checkNotNullParameter(restriction, "restriction");
                throw new EsimRestrictedException();
            }
        }
        return responseB;
    }
}
