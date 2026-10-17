package njf;

import aqd.n1;
import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import do3.n;
import do3.q;
import efm.r;
import java.util.List;
import java.util.concurrent.TimeUnit;
import klf.w1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nhg.f0;
import om4.c0;
import s6e.z;
import te0.w;
import tfm.c4;
import tfm.f4;
import tfm.n4;
import vkm.y;
import zhm.r0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f216481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f216482b;

    public /* synthetic */ b(j jVar, int i) {
        this.f216481a = i;
        this.f216482b = jVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        r rVarH;
        switch (this.f216481a) {
            case 0:
                Boolean enabled = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(enabled, "enabled");
                return enabled.booleanValue() ? ue0.e.E(((z) this.f216482b.i).a(), r0.g()) : w.h(r0.g());
            case 1:
                Boolean enabled2 = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(enabled2, "enabled");
                return enabled2.booleanValue() ? ue0.e.E(this.f216482b.f216497h.a(), r0.g()) : w.h(r0.g());
            case 2:
                Boolean enabled3 = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(enabled3, "enabled");
                if (enabled3.booleanValue()) {
                    r rVarStartWith = m70.a.e(nim.a.w(this.f216482b.d.observeSplitBills(true), new f0(25)), new nij.d(9), new nij.d(10)).startWith(r0.g());
                    Intrinsics.checkNotNullExpressionValue(rVarStartWith, "startWith(...)");
                    rVarH = ue0.e.E(rVarStartWith, r0.g());
                } else {
                    rVarH = w.h(r0.g());
                }
                return rVarH.map(new c(new n1(12, enabled3), 5));
            case 3:
                n38.a jointAccount = (n38.a) obj2;
                Intrinsics.checkNotNullParameter(jointAccount, "jointAccount");
                AccountId.Joint jointC = l38.a.c(jointAccount);
                j jVar = this.f216482b;
                return nim.a.w(kli.a.h(osg.b.e(jVar.f216493a, false, null, null, null, null, null, jointC, 62), jVar.f216500m.k(false)), new nc1.j(jointAccount, jointC, 14));
            case 4:
                n user = (n) obj2;
                Intrinsics.checkNotNullParameter(user, "user");
                return rd0.e.c(mo3.a.g(nim.a.v(new y(new w1(2, 10, null), ((c0) this.f216482b.f216503q).a(q.y(user), w4l.h.f294642c)), new f0(27)), null, new nij.d(14), 1), kotlin.coroutines.g.f186406a);
            case 5:
                Boolean enabled4 = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(enabled4, "enabled");
                if (enabled4.booleanValue()) {
                    return this.f216482b.f216498j.g();
                }
                zk5.c.Companion.getClass();
                return w.h(zk5.b.a());
            case 6:
                Boolean isRoboEnabled = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(isRoboEnabled, "isRoboEnabled");
                if (isRoboEnabled.booleanValue()) {
                    return ue0.e.E(m70.a.g(nim.a.w(rd0.e.c(glc.a.c(this.f216482b.f216501n), kotlin.coroutines.g.f186406a), new f0(26)), null, new nij.d(13), 1), r0.g());
                }
                r rVarJust = r.just(r0.g());
                Intrinsics.h(rVarJust);
                return rVarJust;
            case 7:
                AccountId.Joint accountId = (AccountId.Joint) obj2;
                Intrinsics.checkNotNullParameter(accountId, "accountId");
                j jVar2 = this.f216482b;
                r rVarX = jVar2.f216500m.f(false).x();
                Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
                r rVarSwitchMap = jVar2.k.d(wog.a.POCKETS).switchMap(new c(new b(jVar2, 10), 8));
                Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
                r rVarX2 = jVar2.f216493a.E(accountId).x();
                Intrinsics.checkNotNullExpressionValue(rVarX2, "toObservable(...)");
                agm.a aVarReplay = w.s(rVarX, rVarSwitchMap, rVarX2, jVar2.e.a(false), m70.a.g(jVar2.a(), null, new nij.d(6), 1), jVar2.e(), ue0.e.E(m70.a.g(((ypg.b) jVar2.o).c(), null, new nij.d(5), 1), zhm.f0.f322471a), rd0.e.c(jVar2.f216506t.k(), kotlin.coroutines.g.f186406a), jVar2.d()).map(new nd3.a(new f0(19), 25)).distinctUntilChanged().replay(1);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                aVarReplay.getClass();
                efm.c0 c0Var = hhm.f.f152430b;
                mfm.f.e(1, "subscriberCount");
                mfm.f.b(timeUnit, "unit is null");
                mfm.f.b(c0Var, "scheduler is null");
                n4 n4Var = new n4(aVarReplay instanceof c4 ? new f4(((c4) aVarReplay).f270387g) : aVarReplay, 2000L, timeUnit, c0Var);
                Intrinsics.checkNotNullExpressionValue(n4Var, "refCount(...)");
                return n4Var;
            case 8:
                Boolean enabled5 = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(enabled5, "enabled");
                if (!enabled5.booleanValue()) {
                    return w.h(r0.g());
                }
                j jVar3 = this.f216482b;
                r rVarSwitchMap2 = rd0.e.c(bla.b.b(jVar3.f216504r, "YOUTH"), kotlin.coroutines.g.f186406a).map(new c(new f0(23), 2)).switchMap(new c(new b(jVar3, 9), 3));
                Intrinsics.checkNotNullExpressionValue(rVarSwitchMap2, "switchMap(...)");
                return rVarSwitchMap2;
            case 9:
                Boolean enabled6 = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(enabled6, "enabled");
                if (!enabled6.booleanValue()) {
                    return w.h(r0.g());
                }
                j jVar4 = this.f216482b;
                return ue0.e.E(m70.a.g(nim.a.w(kli.a.h(rd0.e.c(((nj8.n) jVar4.f216494b).k(null, w4l.h.f294642c), kotlin.coroutines.g.f186406a), jVar4.f216493a.g0(fo3.d.YOUTH, w4l.j.f294644c, null)), new f0(28)), null, new nij.d(15), 1), r0.g());
            case 10:
                Boolean enabled7 = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(enabled7, "enabled");
                if (!enabled7.booleanValue()) {
                    return w.h(zhm.f0.f322471a);
                }
                j jVar5 = this.f216482b;
                r rVarW = nim.a.w(osg.b.e(jVar5.f216493a, false, null, null, null, null, null, AccountId.Personal.f51414a, 62), new f0(29));
                r rVarSwitchMap3 = jVar5.k.d(wog.a.JUNIOR).switchMap(new c(new b(jVar5, 11), 6));
                Intrinsics.checkNotNullExpressionValue(rVarSwitchMap3, "switchMap(...)");
                g48.r0 r0Var = jVar5.f216499l;
                n38.q[] elements = {n38.q.ACTIVE, n38.q.OFFBOARDING, n38.q.PENDING};
                Intrinsics.checkNotNullParameter(elements, "elements");
                r map = w.m(rVarW, rVarSwitchMap3, pd.b.r(rd0.e.c(r0Var.e(kotlin.collections.d.y0(elements), w4l.h.f294642c), kotlin.coroutines.g.f186406a), new b(jVar5, 12))).map(new c(new f0(24), 4));
                Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                return m70.a.g(zi0.c.J(map), null, new nij.d(7), 1);
            case 11:
                Boolean enabled8 = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(enabled8, "enabled");
                if (!enabled8.booleanValue()) {
                    return w.h(new Data(zhm.f0.f322471a, null, false, 6, null));
                }
                j jVar6 = this.f216482b;
                r rVarSwitchMap4 = rd0.e.c(bla.b.b(jVar6.f216504r, "YOUTH"), kotlin.coroutines.g.f186406a).map(new c(new d(0), 7)).switchMap(new c(new b(jVar6, 13), 9));
                Intrinsics.checkNotNullExpressionValue(rVarSwitchMap4, "switchMap(...)");
                return rVarSwitchMap4;
            case 12:
                od0.i jointOptional = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(jointOptional, "jointOptional");
                if (jointOptional.d()) {
                    return nim.a.w(osg.b.e(this.f216482b.f216493a, false, null, null, null, null, null, l38.a.c((n38.a) jointOptional.c()), 62), new f0(29));
                }
                return zi0.c.j(zhm.f0.f322471a);
            case 13:
                j jVar7 = this.f216482b;
                wsg.n nVar = jVar7.f216493a;
                Boolean enabled9 = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(enabled9, "enabled");
                return enabled9.booleanValue() ? nim.a.w(kli.a.h(nVar.P(), nim.a.w(pd.b.r(nVar.d0(null, w4l.h.f294642c), new b(jVar7, 14)), new d(1))), new d(2)) : w.h(new Data(zhm.f0.f322471a, null, false, 6, null));
            case 14:
                List walletProfiles = (List) obj2;
                Intrinsics.checkNotNullParameter(walletProfiles, "walletProfiles");
                return walletProfiles.isEmpty() ? zi0.c.j(zhm.f0.f322471a) : nim.a.w(rd0.e.c(((nj8.n) this.f216482b.f216494b).k(null, w4l.h.f294642c), kotlin.coroutines.g.f186406a), new e(walletProfiles, 0));
            default:
                Boolean enabled10 = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(enabled10, "enabled");
                return enabled10.booleanValue() ? ue0.e.E(m70.a.e(this.f216482b.f.c(w4l.h.f294642c), new nij.d(11), new nij.d(12)), zhm.f0.f322471a) : w.h(zhm.f0.f322471a);
        }
    }
}
