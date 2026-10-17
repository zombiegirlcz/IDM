package ly7;

import com.revolut.feature.insurance_pet.impl.ui.edit.details.PetEditDetailsContract$PetEditResult;
import com.revolut.feature.insurance_pet.impl.ui.edit.review.PetEditReviewChangesContract$Configuration;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import okl.m;
import org.jetbrains.annotations.NotNull;
import zhm.q0;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements b {

    @NotNull
    private static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ln.a f200737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f01.c f200738b;

    public j(ln.a navigationCommandsDispatcher, f01.c uiKitResources) {
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f200737a = navigationCommandsDispatcher;
        this.f200738b = uiKitResources;
    }

    public final efm.b a() {
        return m.w(null, null, null, 7, this.f200737a);
    }

    public final efm.b b(PetEditDetailsContract$PetEditResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        return this.f200737a.a(new FinishCommand(-1, q0.c(new Pair("editResultBundleKey", result)), null, 4));
    }

    public final efm.b c(String petId) {
        Intrinsics.checkNotNullParameter(petId, "petId");
        ty7.f.Companion.getClass();
        return this.f200737a.a(new ActivityNavigateCommand(ty7.c.f275493b, new PetEditReviewChangesContract$Configuration(petId), null, null, 0, null, null, null, null, false, 1020));
    }
}
