package com.fourthline.core.internal;

import com.fourthline.core.internal.identifiers.PersistedIdentifierProvider;
import java.io.InputStream;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import skm.p0;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class k0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f26362b;

    public /* synthetic */ k0(Object obj2, int i) {
        this.f26361a = i;
        this.f26362b = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f26361a;
        Object obj2 = this.f26362b;
        switch (i) {
            case 0:
                return d0.a((d0) obj2);
            case 1:
                return f0.a((f0) obj2);
            case 2:
                return h.a((h) obj2);
            case 3:
                return h0.a((h0) obj2);
            case 4:
                return PersistedIdentifierProvider.a((PersistedIdentifierProvider) obj2);
            case 5:
                jlm.a aVar = new jlm.a();
                a1m.e.T(aVar, (byte[]) obj2);
                return aVar;
            case 6:
                ArrayList arrayList = (ArrayList) obj2;
                if (arrayList.isEmpty()) {
                    return zhm.f0.f322471a;
                }
                return arrayList.subList((((CharSequence) zhm.d0.b0(arrayList)).length() != 0 || arrayList.size() <= 1) ? 0 : 1, ((CharSequence) zhm.d0.m0(arrayList)).length() == 0 ? zhm.v.j(arrayList) : 1 + zhm.v.j(arrayList));
            default:
                aem.o oVar = (aem.o) ((nem.c) obj2);
                switch (oVar.f3758a) {
                    case 0:
                        return (io.ktor.utils.io.t) oVar.d;
                    default:
                        InputStream inputStream = (InputStream) oVar.d;
                        p0 p0Var = p0.f264001a;
                        elm.f context = elm.f.f127540b;
                        lem.e pool = xem.a.f304716a;
                        Intrinsics.checkNotNullParameter(inputStream, "<this>");
                        Intrinsics.checkNotNullParameter(context, "context");
                        Intrinsics.checkNotNullParameter(pool, "pool");
                        Intrinsics.checkNotNullParameter(inputStream, "<this>");
                        return new wem.c(new jlm.b(inputStream), context);
                }
        }
    }
}
