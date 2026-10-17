package ry2;

import ha1.s;
import ha3.p;
import ha3.x;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import skm.p0;
import te0.w;
import ufm.f;
import ufm.i;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f258205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ py2.c f258206b;

    public /* synthetic */ c(py2.c cVar, int i) {
        this.f258205a = i;
        this.f258206b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String cardNumber = (String) obj2;
        switch (this.f258205a) {
            case 0:
                Intrinsics.checkNotNullParameter(cardNumber, "cardNumber");
                x xVar = (x) this.f258206b.d;
                xVar.getClass();
                Intrinsics.checkNotNullParameter(cardNumber, "cardNumber");
                i iVar = new i(new f(((am0.b) xVar.f150434c).a(cardNumber), new s(16, new p(xVar, 0)), 3), new s(23, new p(xVar, 2)), 0);
                Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                return iVar;
            default:
                Intrinsics.checkNotNullParameter(cardNumber, "cardNumber");
                return w.o0(p0.f264003c, new rm6.c(this.f258206b, cardNumber, null, 24));
        }
    }
}
