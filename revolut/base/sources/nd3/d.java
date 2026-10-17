package nd3;

import efm.r;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import n8i.q0;
import org.jetbrains.annotations.NotNull;
import tof.cc;
import tof.e9;
import tof.i7;
import tof.o7;
import tof.qb;
import tof.v6;
import tof.xa;
import tof.y6;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final class d {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wsg.n f214311a;

    public d(wsg.n walletInteractor) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        this.f214311a = walletInteractor;
    }

    public final r a(ArrayList activeSourceTypes) {
        Intrinsics.checkNotNullParameter(activeSourceTypes, "activeSourceTypes");
        ArrayList arrayList = new ArrayList(w.t(activeSourceTypes, 10));
        Iterator it8 = activeSourceTypes.iterator();
        while (it8.hasNext()) {
            arrayList.add(b((uc3.d) it8.next()));
        }
        r rVarZip = r.zip(arrayList, new a(new q0(25), 1));
        Intrinsics.checkNotNullExpressionValue(rVarZip, "zip(...)");
        return rVarZip;
    }

    public final r b(uc3.d cashbackSourceType) {
        Intrinsics.checkNotNullParameter(cashbackSourceType, "cashbackSourceType");
        int i = c.f214310a[cashbackSourceType.ordinal()];
        int i2 = 0;
        wsg.n nVar = this.f214311a;
        i7.r rVar = i7.r.f272824a;
        switch (i) {
            case 1:
                i7.c cVar = i7.Companion;
                i7[] i7VarArr = {rVar, new qb(u.c(v6.COMPLETED)), new cc(u.c(y6.REWARD))};
                cVar.getClass();
                return te0.w.h(i7.c.a(i7VarArr));
            case 2:
                i7.c cVar2 = i7.Companion;
                i7[] i7VarArr2 = {new cc(u.c(y6.REWARD)), new qb(u.c(v6.COMPLETED)), new xa(io3.l.CREDIT)};
                cVar2.getClass();
                return te0.w.h(i7.c.a(i7VarArr2));
            case 3:
            case 4:
                i7.c cVar3 = i7.Companion;
                cc ccVar = new cc(u.c(y6.REWARD));
                qb qbVar = new qb(u.c(v6.COMPLETED));
                i7.k kVar = i7.k.f272817a;
                cVar3.getClass();
                return te0.w.h(i7.c.b(i7.c.a(kVar, ccVar, qbVar), i7.c.a(kVar, new cc(u.c(y6.TRANSFER)), new o7())));
            case 5:
                i7.c cVar4 = i7.Companion;
                i7[] i7VarArr3 = {new xa(io3.l.MERCHANT), new cc(u.c(y6.REWARD)), new qb(u.c(v6.COMPLETED))};
                cVar4.getClass();
                return te0.w.h(i7.c.a(i7VarArr3));
            case 6:
                r map = m70.a.g(osg.b.e(nVar, false, null, null, null, null, null, null, 126), null, new n87.r(17), 1).map(new nae.a(new q0(23), 29));
                Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                return map;
            case 7:
                i7.c cVar5 = i7.Companion;
                i7[] i7VarArr4 = {new e9("Voucher Gift Cashback"), new qb(u.c(v6.COMPLETED))};
                cVar5.getClass();
                return te0.w.h(i7.c.a(i7VarArr4));
            case 8:
                i7.c cVar6 = i7.Companion;
                i7[] i7VarArr5 = {new e9("Reward for"), i7.x.f272829a};
                cVar6.getClass();
                return te0.w.h(i7.c.a(i7.c.b(i7VarArr5), new qb(u.c(v6.COMPLETED))));
            case 9:
                i7.c cVar7 = i7.Companion;
                i7[] i7VarArr6 = {new e9("Experiences cashback"), rVar};
                cVar7.getClass();
                return te0.w.h(i7.c.a(i7.c.b(i7VarArr6), new cc(u.c(y6.REWARD)), new qb(u.c(v6.COMPLETED))));
            case 10:
                r map2 = m70.a.g(osg.b.e(nVar, false, null, null, null, null, null, null, 126), null, new n87.r(18), 1).map(new a(new q0(24), i2));
                Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
                return map2;
            case 11:
                r rVarEmpty = r.empty();
                Intrinsics.checkNotNullExpressionValue(rVarEmpty, "empty(...)");
                return rVarEmpty;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
