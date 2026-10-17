package ah3;

import com.revolut.feature.checklist_challenges_ui.impl.navigation.ChecklistStepDetailsDestination;
import efm.d0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import q06.h;
import sri.m;
import wp5.y;

/* JADX INFO: loaded from: classes21.dex */
public final class g implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f4882a;

    public g(m navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f4882a = navigator;
    }

    public static ChecklistStepDetailsDestination b(jf0.c cVar) {
        String strE = cVar.e(3);
        String strE2 = cVar.e(4);
        if (strE.length() <= 0 || strE2.length() <= 0) {
            return null;
        }
        return new ChecklistStepDetailsDestination(strE, strE2);
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "checklist") && Intrinsics.f(cVar.e(2), "step-details") && b(cVar) != null;
    }

    @Override // q06.k
    public final Object e(jf0.c cVar, Continuation continuation) {
        ChecklistStepDetailsDestination checklistStepDetailsDestinationB = b(cVar);
        if (checklistStepDetailsDestinationB != null) {
            return new h(checklistStepDetailsDestinationB, null);
        }
        return null;
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        ufm.c cVar = new ufm.c(new a6j.b(this, deeplink, z, 2), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        return ue0.e.F(cVar, Boolean.FALSE);
    }
}
