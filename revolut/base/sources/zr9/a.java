package zr9;

import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import com.revolut.feature.payments.groups.api.navigation.CreateGroupDestination;
import com.revolut.feature.payments.groups.api.navigation.PaymentsGroupsRedesignFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import efm.d0;
import kotlin.jvm.internal.Intrinsics;
import mq9.f;
import ufm.i;
import zh9.u0;
import zr2.o;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements rq9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f324670a;

    public a(f groupsInteractor, ang.f userInteractor) {
        Intrinsics.checkNotNullParameter(groupsInteractor, "groupsInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f324670a = groupsInteractor;
    }

    public final i a(String groupId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        d0 d0VarD = ((mr9.a) this.f324670a).d(groupId);
        zmg.c cVar = new zmg.c(new o(3), 23);
        d0VarD.getClass();
        i iVar = new i(d0VarD, cVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }

    public final ufm.b b() {
        ufm.b bVarM = d0.m(u0.f(CreateGroupDestination.f79291a));
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }

    public final ufm.b c() {
        ufm.b bVarM = d0.m(new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(t49.a.f267950b, null, null, 6))));
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }

    public final ufm.b d(PaymentGroup group) {
        Intrinsics.checkNotNullParameter(group, "group");
        ufm.b bVarM = d0.m(new FeatureCommand(new PaymentsGroupsRedesignFeatureConfig.GroupDetails(group, false)));
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }

    public final i e(String groupId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        d0 d0VarD = ((mr9.a) this.f324670a).d(groupId);
        zmg.c cVar = new zmg.c(new zhf.f(this, 29), 21);
        d0VarD.getClass();
        i iVar = new i(d0VarD, cVar, 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }

    public final i f(String groupId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        d0 d0VarD = ((mr9.a) this.f324670a).d(groupId);
        zmg.c cVar = new zmg.c(new o(2), 22);
        d0VarD.getClass();
        i iVar = new i(d0VarD, cVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }
}
