package rw9;

import efm.d0;
import kotlin.jvm.internal.Intrinsics;
import q06.l;
import xo9.i;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f257853a;

    public a(l deeplinkRouter) {
        Intrinsics.checkNotNullParameter(deeplinkRouter, "deeplinkRouter");
        this.f257853a = deeplinkRouter;
    }

    public static String c(xq2.a aVar) {
        String str = aVar.f308049a;
        String str2 = aVar.f308050b;
        xq2.g gVar = aVar.f308051c;
        xq2.f fVar = aVar.d;
        StringBuilder sbM = v0.a.m("rawValue=", str, ", displayValue=", str2, ", type=");
        sbM.append(gVar);
        sbM.append(", source=");
        sbM.append(fVar);
        return sbM.toString();
    }

    @Override // xo9.i
    public final d0 b(xq2.a code) {
        Intrinsics.checkNotNullParameter(code, "code");
        ufm.c cVar = new ufm.c(new pu9.a(code, this, 17), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        return cVar;
    }
}
