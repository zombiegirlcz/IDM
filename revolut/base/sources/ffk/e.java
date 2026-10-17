package ffk;

import com.revolut.feature.pricingplans.models.family.FamilyPlanState;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f134826a = new e();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List invites = (List) obj2;
        Intrinsics.checkNotNullParameter(invites, "invites");
        lha.h hVar = (lha.h) zhm.d0.d0(invites);
        return hVar != null ? new FamilyPlanState.PendingInvite(hVar) : FamilyPlanState.Empty.f81188a;
    }
}
