package ir9;

import efm.d0;
import ip0.w10;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import sri.m;
import wp5.y;
import yui.v;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements rq9.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f168025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rq9.a f168026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mq9.f f168027c;

    public c(m navigator, rq9.a groupBillsNaviCommandProvider, mq9.f groupsInteractor) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(groupBillsNaviCommandProvider, "groupBillsNaviCommandProvider");
        Intrinsics.checkNotNullParameter(groupsInteractor, "groupsInteractor");
        this.f168025a = navigator;
        this.f168026b = groupBillsNaviCommandProvider;
        this.f168027c = groupsInteractor;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "group-bills");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x007a, code lost:
    
        if (r11 == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00aa, code lost:
    
        if (r11 == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00db, code lost:
    
        if (r11 == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r10, kotlin.coroutines.Continuation r11) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ir9.c.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        d0 d0VarF;
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        l lVarA = d.a(deeplink);
        boolean zEquals = lVarA.equals(i.f168035a);
        rq9.a aVar = this.f168026b;
        if (zEquals) {
            d0VarF = ((zr9.a) aVar).c();
        } else if (lVarA instanceof j) {
            d0VarF = ((zr9.a) aVar).e(((j) lVarA).f168036a);
        } else if (lVarA instanceof k) {
            d0VarF = ((zr9.a) aVar).f(((k) lVarA).f168037a);
        } else {
            if (!(lVarA instanceof h)) {
                throw new NoWhenBranchMatchedException();
            }
            h hVar = (h) lVarA;
            String groupId = hVar.f168033a;
            String billId = hVar.f168034b;
            Intrinsics.checkNotNullParameter(groupId, "groupId");
            Intrinsics.checkNotNullParameter(billId, "billId");
            d0 d0VarD = ((mr9.a) ((zr9.a) aVar).f324670a).d(groupId);
            zmg.c cVar = new zmg.c(new v(billId, 28), 20);
            d0VarD.getClass();
            ufm.i iVar = new ufm.i(d0VarD, cVar, 1);
            Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
            d0VarF = iVar;
        }
        ufm.i iVar2 = new ufm.i(d0VarF, new a(new w10(this, 28), 0), 1);
        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
        return ue0.e.F(iVar2, Boolean.TRUE);
    }
}
