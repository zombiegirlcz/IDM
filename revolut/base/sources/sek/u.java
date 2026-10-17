package sek;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.feature.pod_nominees.api.navigation.PodNomineesFlowUseCase;
import com.revolut.retail.feature.pod_nominees.impl.R$string;
import com.revolut.retail.feature.pod_nominees.impl.pod_nominees_list.PodNomineesListScreenContract$InputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class u implements cli.n {

    @NotNull
    public static final s Companion = new s();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PodNomineesListScreenContract$InputData f262222a;

    public u(PodNomineesListScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f262222a = inputData;
    }

    public static j b() {
        return new j(new TextLocalisedClause(R$string.pod_nominees_list_title, null, null, 14), new TextLocalisedClause(R$string.pod_nominees_list_subtitle, null, null, 14));
    }

    public final h a() {
        boolean z;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_continue, null, null, 14);
        PodNomineesFlowUseCase podNomineesFlowUseCase = this.f262222a.f102622a;
        if (Intrinsics.f(podNomineesFlowUseCase, PodNomineesFlowUseCase.Profile.LegacyProfile.f102582a)) {
            z = false;
        } else {
            if (!(podNomineesFlowUseCase instanceof PodNomineesFlowUseCase.Onboarding) && !(podNomineesFlowUseCase instanceof PodNomineesFlowUseCase.Profile.WorkflowProfile)) {
                throw new NoWhenBranchMatchedException();
            }
            z = true;
        }
        return new h(textLocalisedClause, z);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        i domainState = (i) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (n) iii.c.f(domainState.f262206a, new scl.e(this, 14), new scl.h(this, 6), new sa5.b(this, 4));
    }
}
