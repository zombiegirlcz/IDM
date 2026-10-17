package cvh;

import com.revolut.shared.feature.workflow.engine.api.models.eligibility.exceptions.UnrecognisedContractException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import zhm.r0;

/* JADX INFO: loaded from: classes10.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f109460a = r0.k(new Pair("IDENTITY_DECLARATION", ril.b.IDENTITY_DECLARATION), new Pair("DOCUMENTS", ril.b.DOCUMENTS), new Pair("TAX_RESIDENCY", ril.b.TAX_RESIDENCY), new Pair("QES", ril.b.QES), new Pair("ELIGIBILITY_STEPS", ril.b.ELIGIBILITY_STEPS), new Pair("SDK_FLOW", ril.b.SDK_FLOW), new Pair("FORM", ril.b.FORM), new Pair("DECLARATION", ril.b.DECLARATION), new Pair("ONBOARDING_STEP", ril.b.ONBOARDING_STEP), new Pair("CREDIT_ONBOARDING_VIEW", ril.b.CREDIT_ONBOARDING_VIEW), new Pair("WORKFLOW", ril.b.WORKFLOW), new Pair("LOADING_STEP", ril.b.LOADING_STEP), new Pair("NAVIGATION_HUB", ril.b.NAVIGATION_HUB));

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public static final ril.b a(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        ril.b bVar = (ril.b) u1.v(str, f109460a);
        if (bVar != null) {
            return bVar;
        }
        throw new UnrecognisedContractException(j6.a.q("Unknown step name: ", str));
    }
}
