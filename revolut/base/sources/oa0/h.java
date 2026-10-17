package oa0;

import aa0.d0;
import com.revolut.core.backend_flow.impl.flow.permission.FormPermissionFlow;
import com.revolut.core.backend_flow.impl.flow.permission.FormPermissionFlowContract$InputData;
import com.revolut.feature.backend_flow.domain.models.FormScreen;
import com.revolut.feature.backend_flow.domain.models.PermissionInputItem;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n68.w;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class h implements e {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f223491a;

    public h(d0 permissionInputInteractor) {
        Intrinsics.checkNotNullParameter(permissionInputInteractor, "permissionInputInteractor");
        this.f223491a = permissionInputInteractor;
    }

    public final FormPermissionFlow a(FormScreen screen, Function1 withResult) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(withResult, "withResult");
        Object objB0 = zhm.d0.b0(screen.getItems());
        Intrinsics.i(objB0, "null cannot be cast to non-null type com.revolut.feature.backend_flow.domain.models.PermissionInputItem");
        PermissionInputItem permissionInputItem = (PermissionInputItem) objB0;
        FormPermissionFlow formPermissionFlow = new FormPermissionFlow(new FormPermissionFlowContract$InputData(permissionInputItem));
        w block = new w(this, screen, permissionInputItem, withResult, 19);
        Intrinsics.checkNotNullParameter(block, "block");
        formPermissionFlow.H = block;
        return formPermissionFlow;
    }
}
