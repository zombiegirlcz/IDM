package sa6;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f261339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f261340b;

    public /* synthetic */ p(t tVar, int i) {
        this.f261339a = i;
        this.f261340b = tVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f261339a) {
            case 0:
                ba6.l charity = (ba6.l) obj2;
                Intrinsics.checkNotNullParameter(charity, "charity");
                return nim.a.w(xvh.c.c(this.f261340b.f261347c, null, w4l.i.f294643c, 1), new s78.d(charity, 15));
            case 1:
                xvh.c.a(this.f261340b.f261347c);
                return Unit.f186387a;
            default:
                qua.p recurring = (qua.p) obj2;
                Intrinsics.checkNotNullParameter(recurring, "recurring");
                if (recurring.f249316b == ibd.f.ACTIVE) {
                    return efm.d0.m(recurring);
                }
                return ((yua.q) this.f261340b.f261346b).f(recurring.f249314a.f160150a);
        }
    }
}
