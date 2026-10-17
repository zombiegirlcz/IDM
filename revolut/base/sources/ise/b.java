package ise;

import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f168189a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewBinding f168190b;

    public b(jii.c0 binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f168190b = binding;
    }

    public final ActionFooterView a() {
        switch (this.f168189a) {
            case 0:
                ActionFooterView actionFooterView = ((jii.c0) this.f168190b).f174504b;
                Intrinsics.checkNotNullExpressionValue(actionFooterView, "screenRecyclerNavBarWith…ionFooterActionFooterView");
                return actionFooterView;
            default:
                return null;
        }
    }

    public final NavBarWithBigTile b() {
        switch (this.f168189a) {
            case 0:
                NavBarWithBigTile navBarWithBigTile = ((jii.c0) this.f168190b).f174505c;
                Intrinsics.checkNotNullExpressionValue(navBarWithBigTile, "screenRecyclerNavBarWith…onFooterNavBarWithBigTile");
                return navBarWithBigTile;
            default:
                return null;
        }
    }

    public final LargeActionButton c() {
        switch (this.f168189a) {
            case 0:
                return null;
            default:
                LargeActionButton screenThreeDsVerificationFirstButton = ((wre.a) this.f168190b).f299575b;
                Intrinsics.checkNotNullExpressionValue(screenThreeDsVerificationFirstButton, "screenThreeDsVerificationFirstButton");
                return screenThreeDsVerificationFirstButton;
        }
    }

    public final LargeActionButton d() {
        switch (this.f168189a) {
            case 0:
                return null;
            default:
                LargeActionButton screenThreeDsVerificationSecondButton = ((wre.a) this.f168190b).f299576c;
                Intrinsics.checkNotNullExpressionValue(screenThreeDsVerificationSecondButton, "screenThreeDsVerificationSecondButton");
                return screenThreeDsVerificationSecondButton;
        }
    }

    public b(wre.a binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f168190b = binding;
    }
}
