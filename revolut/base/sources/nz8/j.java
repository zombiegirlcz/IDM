package nz8;

import com.revolut.feature.learn.shared.models.domain.LearnReward;
import jz8.b1;
import jz8.z0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class j {
    public static final LearnReward a(z0 z0Var) {
        Intrinsics.checkNotNullParameter(z0Var, "<this>");
        b1 b1Var = z0Var.f179683a;
        String str = z0Var.f179685c;
        pz8.e eVar = z0Var.f179684b;
        int i = i.f221003a[b1Var.ordinal()];
        if (i == 1) {
            if (str == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            if (eVar != null) {
                return new LearnReward.ToPocket(cj9.c.P(eVar), str);
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        if (i != 2) {
            if (i == 3) {
                return LearnReward.NoReward.f78027a;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (eVar != null) {
            return new LearnReward.ToInvestAccount(cj9.c.P(eVar));
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final LearnReward b(zz8.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        if (cVar instanceof zz8.a) {
            zz8.a aVar = (zz8.a) cVar;
            return new LearnReward.ToPocket(cj9.c.P(aVar.f326587b), aVar.f326588c);
        }
        if (cVar instanceof zz8.e) {
            return new LearnReward.ToInvestAccount(cj9.c.P(((zz8.e) cVar).f326592b));
        }
        if (Intrinsics.f(cVar, zz8.d.INSTANCE)) {
            return LearnReward.NoReward.f78027a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final z0 c(LearnReward learnReward) {
        Intrinsics.checkNotNullParameter(learnReward, "<this>");
        if (learnReward instanceof LearnReward.ToInvestAccount) {
            b1 b1Var = b1.TO_INVEST_ACCOUNT;
            dj0.d dVar = ((LearnReward.ToInvestAccount) learnReward).f78028a;
            Intrinsics.checkNotNullParameter(dVar, "<this>");
            return new z0(b1Var, new pz8.e(dVar.f115082a, dVar.f115083b.f306286a), null);
        }
        if (!(learnReward instanceof LearnReward.ToPocket)) {
            if (learnReward instanceof LearnReward.NoReward) {
                return new z0(b1.NO_REWARD, null, null);
            }
            throw new NoWhenBranchMatchedException();
        }
        b1 b1Var2 = b1.TO_POCKET;
        LearnReward.ToPocket toPocket = (LearnReward.ToPocket) learnReward;
        dj0.d dVar2 = toPocket.f78029a;
        Intrinsics.checkNotNullParameter(dVar2, "<this>");
        return new z0(b1Var2, new pz8.e(dVar2.f115082a, dVar2.f115083b.f306286a), toPocket.f78030b);
    }
}
