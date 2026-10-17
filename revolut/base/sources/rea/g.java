package rea;

import com.revolut.core.model.account.AccountId;
import e7l.g;
import efm.r;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wsg.n f253567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fk3.a f253568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kbb.c f253569c;
    public final xoj.a d;
    public final y91.b e;

    public g(wsg.n walletInteractor, fk3.a configurationInteractor, kbb.c juniorConfigInteractor, xoj.a featuresInteractor, y91.b accountsProductFeatureChecker) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(juniorConfigInteractor, "juniorConfigInteractor");
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(accountsProductFeatureChecker, "accountsProductFeatureChecker");
        this.f253567a = walletInteractor;
        this.f253568b = configurationInteractor;
        this.f253569c = juniorConfigInteractor;
        this.d = featuresInteractor;
        this.e = accountsProductFeatureChecker;
    }

    public static int a(List list) {
        List list2 = list;
        int i = 0;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return 0;
        }
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            if (cp5.d.A((xi0.b) it8.next()) && (i = i + 1) < 0) {
                v.r();
                throw null;
            }
        }
        return i;
    }

    public static eda.d b(List list, List list2) {
        List list3 = list2;
        int i = 0;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator it8 = list3.iterator();
            while (it8.hasNext()) {
                xi0.b bVarL = z92.f.l((io3.d) it8.next());
                if (cp5.d.A(bVarL)) {
                    xi0.b.Companion.getClass();
                    if (!bVarL.equals(xi0.b.f306279q) && (i = i + 1) < 0) {
                        v.r();
                        throw null;
                    }
                }
            }
        }
        return i < a(list) ? eda.d.CAN_BE_ADDED : eda.d.ALL_ADDED;
    }

    public final r c(AccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        r rVarK = ((ik3.c) this.f253568b).k(g.b.f123407a);
        io3.l lVar = io3.l.CURRENT;
        io3.i iVar = io3.i.INTERNAL;
        wsg.n nVar = this.f253567a;
        return nim.a.w(mif.a.f(rVarK, osg.b.e(nVar, false, lVar, null, iVar, null, null, accountId, 52), osg.b.e(nVar, false, io3.l.MERCHANT, null, iVar, null, null, null, 116), ((cpj.b) this.d).f107969a.b(false)), new f(this, 0));
    }

    public final r d() {
        return nim.a.w(((ik3.c) this.f253568b).l(g.b.f123407a, w4l.h.f294642c), new rd3.m(this));
    }
}
