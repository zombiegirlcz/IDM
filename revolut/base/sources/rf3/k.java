package rf3;

import efm.d0;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;
import rfm.m;
import rfm.o;
import rfm.x;
import te0.r;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class k implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f253685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f253686b;

    public /* synthetic */ k(l lVar, int i) {
        this.f253685a = i;
        this.f253686b = lVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f253685a) {
            case 0:
                l lVar = this.f253686b;
                r rVar = lVar.f253690g;
                if (rVar.isInitialized()) {
                    od0.h hVar = od0.i.Companion;
                    String strL = m70.a.l((String) rVar.get());
                    hVar.getClass();
                    ufm.b bVarM = d0.m(od0.h.a(strL));
                    Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                    return bVarM;
                }
                o oVar = new o(new nc0.a(lVar, 25));
                Intrinsics.checkNotNullExpressionValue(oVar, "fromCallable(...)");
                x xVarX = ue0.e.x(oVar);
                m mVar = new m(lVar.d.d.c(), new rea.j(new raf.o(lVar, 16), 3), 0);
                Intrinsics.checkNotNullExpressionValue(mVar, "flatMap(...)");
                m mVar2 = new m(xVarX.m(ue0.e.x(mVar)), new rea.j(new rd3.m(26), 7), 1);
                od0.i.Companion.getClass();
                return mVar2.p(od0.i.f224256b);
            default:
                l lVar2 = this.f253686b;
                r rVar2 = lVar2.f253691h;
                if (!rVar2.isInitialized()) {
                    m mVar3 = new m(lVar2.d.d.c(), new rea.j(new rd3.m(22), 2), 0);
                    Intrinsics.checkNotNullExpressionValue(mVar3, "flatMap(...)");
                    m mVar4 = new m(mVar3, new rea.j(new rd3.m(25), 6), 1);
                    od0.i.Companion.getClass();
                    return mVar4.p(od0.i.f224256b);
                }
                od0.h hVar2 = od0.i.Companion;
                String strL2 = m70.a.l((String) rVar2.get());
                hVar2.getClass();
                ufm.b bVarM2 = d0.m(od0.h.a(strL2));
                Intrinsics.checkNotNullExpressionValue(bVarM2, "just(...)");
                return bVarM2;
        }
    }
}
