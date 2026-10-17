package knl;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.permissions.flow.PermissionsController;
import com.revolut.feature.permissions.flow.PermissionsControllerContract$Explanation;
import com.revolut.feature.permissions.flow.PermissionsControllerContract$InputData;
import com.revolut.feature.permissions.flow.PermissionsControllerContract$Permission;
import com.revolut.sso.api.R$string;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vkm.z1;
import yji.n;
import zhm.u;

/* JADX INFO: loaded from: classes12.dex */
public final class h extends n implements d {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final s70.a f186196l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final y80.a f186197m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final w39.b f186198n;
    public final z1 o;

    public h(s70.a intentProvider, y80.a permissionProvider, w39.b locationInteractor) {
        Intrinsics.checkNotNullParameter(intentProvider, "intentProvider");
        Intrinsics.checkNotNullParameter(permissionProvider, "permissionProvider");
        Intrinsics.checkNotNullParameter(locationInteractor, "locationInteractor");
        this.f186196l = intentProvider;
        this.f186197m = permissionProvider;
        this.f186198n = locationInteractor;
        this.o = ta6.a.a(1);
    }

    public final PermissionsController Z2(Function1 onResult) {
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        PermissionsController permissionsController = new PermissionsController(new PermissionsControllerContract$InputData(u.c(new PermissionsControllerContract$Permission("android.permission.ACCESS_FINE_LOCATION", new PermissionsControllerContract$Explanation.PromptScreen(new TextLocalisedClause(R$string.revolut_sso_location_access_title, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_location_access_subtitle, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_location_access_action, null, null, 14), com.revolut.core.ui_kit_core.displayers.image.models.b.c("3d025", null, null, null, 30), null), null, true, 4))));
        k79.b block = new k79.b(this, onResult, 28);
        Intrinsics.checkNotNullParameter(block, "block");
        permissionsController.H = block;
        return permissionsController;
    }
}
