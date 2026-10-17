package oa0;

import aa0.d0;
import com.revolut.feature.backend_flow.domain.models.FormScreen;
import com.revolut.feature.backend_flow.domain.models.PermissionInputItem;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.jvm.internal.Intrinsics;
import l3l.m;
import n68.w;

/* JADX INFO: loaded from: classes19.dex */
public final class d extends c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final d0 f223489l;

    public d(d0 permissionInputInteractor) {
        Intrinsics.checkNotNullParameter(permissionInputInteractor, "permissionInputInteractor");
        this.f223489l = permissionInputInteractor;
    }

    @Override // oa0.c
    public final ViewController Z2(FormScreen screen, PermissionInputItem permissionItem, m withResult) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(permissionItem, "permissionItem");
        Intrinsics.checkNotNullParameter(withResult, "withResult");
        ViewController viewControllerO2 = o2(z9.a.f320295a);
        w block = new w(this, screen, permissionItem, withResult, 18);
        Intrinsics.checkNotNullParameter(block, "block");
        viewControllerO2.H = block;
        return viewControllerO2;
    }
}
