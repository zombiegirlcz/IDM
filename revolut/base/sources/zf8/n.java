package zf8;

import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import efm.r;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import q97.g3;
import vkm.q;
import zh9.u0;

/* JADX INFO: loaded from: classes13.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final te8.e f321908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hj8.a f321909b;

    public n(hj8.a juniorProfileInteractor, te8.e juniorAccountInteractor) {
        Intrinsics.checkNotNullParameter(juniorAccountInteractor, "juniorAccountInteractor");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        this.f321908a = juniorAccountInteractor;
        this.f321909b = juniorProfileInteractor;
    }

    public static sf8.o b(mf8.e eVar) {
        Iterator it8 = eVar.a().iterator();
        while (it8.hasNext()) {
            int i = m.d[((mf8.b) it8.next()).ordinal()];
            if (i == 1) {
                return sf8.o.PLACE_OF_BIRTH;
            }
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return sf8.o.NOT_PROVIDED;
    }

    public final sf8.h a(JuniorBankingProfile juniorProfile, mf8.e juniorKyc) {
        Intrinsics.checkNotNullParameter(juniorProfile, "juniorProfile");
        Intrinsics.checkNotNullParameter(juniorKyc, "juniorKyc");
        int i = m.f321905a[juniorProfile.getF77104l().ordinal()];
        if (i == 1) {
            return sf8.d.f262353a;
        }
        if (i == 2) {
            return sf8.e.f262354a;
        }
        if (i == 3) {
            return sf8.b.f262351a;
        }
        if (i != 4 && i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        int i2 = m.f321906b[juniorKyc.c().ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                return new sf8.g(b(juniorKyc));
            }
            if (i2 == 3) {
                return sf8.a.f262350a;
            }
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            mf8.c cVarB = juniorKyc.b();
            int i3 = cVarB == null ? -1 : m.f321907c[cVarB.ordinal()];
            if (i3 != -1) {
                if (i3 == 1) {
                    return sf8.f.f262355a;
                }
                if (i3 != 2 && i3 != 3 && i3 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        return sf8.c.f262352a;
    }

    public final akg.n c(String juniorId, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(u0.m(hj8.a.a(this.f321909b, juniorId, loadingStrategy), this.f321908a.a(juniorId, loadingStrategy)), new l(this, 0));
    }

    public final r d(String str, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        wkm.l lVarK = ((nj8.n) this.f321909b).k(str, loadingStrategy);
        kotlin.coroutines.g gVar = kotlin.coroutines.g.f186406a;
        r rVarC = rd0.e.c(lVarK, gVar);
        te8.e eVar = this.f321908a;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.w(u1.d(rVarC, rd0.e.c(q.Q(str != null ? new go.g(str, 2) : new g3(mo3.a.g(eVar.f270062a.j(loadingStrategy), null, new tc6.b(9), 1), 17), new sdi.a(null, eVar, loadingStrategy, 4)), gVar)), new l(this, 1));
    }
}
