package com.revolut.feature.revolutpay.impl.external;

import android.content.Context;
import android.os.Bundle;
import com.google.gson.reflect.TypeToken;
import com.revolut.feature.revolutpay.impl.R$string;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CopyOnWriteArrayList;
import kg.o;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class d {

    @NotNull
    private static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f84460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f84461b;

    public d(Context context, o gson) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(gson, "gson");
        this.f84460a = context;
        this.f84461b = gson;
    }

    public static String b(Bundle bundle, String str) {
        String string;
        if (bundle == null || (string = bundle.getString(str)) == null || d0.W(string)) {
            return null;
        }
        return string;
    }

    public final String a(Bundle bundle) {
        o oVar = this.f84461b;
        try {
            String strB = b(bundle, "modifiers");
            if (strB == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Object objD = oVar.d(strB, new TypeToken<List<? extends b>>() { // from class: com.revolut.feature.revolutpay.impl.external.WebPaymentParametersParser$extractAppLink$1$modifiers$1
            }.getType());
            Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
            String string = this.f84460a.getString(R$string.web_payment_method_name);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            for (Object obj2 : (List) objD) {
                if (((b) obj2).getSupportedMethods().contains(string)) {
                    String appLink = ((a) oVar.c(((b) obj2).getStringifiedData(), a.class)).getAppLink();
                    if (d0.W(appLink)) {
                        return null;
                    }
                    return appLink;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        } catch (Exception e) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
            return null;
        }
    }
}
