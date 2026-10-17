package com.onfido.hosted.web.module;

import android.R;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.onfido.android.sdk.capture.common.permissions.PermissionResult;
import com.onfido.android.sdk.capture.common.permissions.PermissionsManagementFragment;
import com.onfido.android.sdk.capture.flow.CaptureStepDataBundle;
import com.onfido.android.sdk.capture.flow.FlowStepDirection;
import com.onfido.android.sdk.capture.internal.util.FragmentManagerExtKt;
import com.onfido.android.sdk.capture.ui.CaptureType;
import com.onfido.hosted.web.module.PermissionDelegate;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0016\u001a\u00020\b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001c\u001a\u00020\b2\u0016\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\b0\u0018j\u0002`\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"R*\u0010#\u001a\u0016\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\b\u0018\u00010\u0018j\u0004\u0018\u0001`\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/onfido/hosted/web/module/FragmentPermissionDelegate;", "Lcom/onfido/hosted/web/module/PermissionDelegate;", "Landroidx/fragment/app/Fragment;", "hostFragment", "Landroidx/fragment/app/FragmentManager;", "parentFragmentManager", "<init>", "(Landroidx/fragment/app/Fragment;Landroidx/fragment/app/FragmentManager;)V", "", "showPermissionsManagementFragment", "()V", "fragment", "", "shouldAddToBackStack", "setFragment", "(Landroidx/fragment/app/Fragment;Z)V", "Landroidx/fragment/app/FragmentTransaction;", "getFragmentReplacementTransaction", "(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;", "", "", "permissions", "requestPermission", "([Ljava/lang/String;)V", "Lkotlin/Function1;", "Lcom/onfido/android/sdk/capture/common/permissions/PermissionResult;", "Lcom/onfido/hosted/web/module/PermissionCallback;", "callback", "registerForResult", "(Lkotlin/jvm/functions/Function1;)V", "permission", "hasPermission", "(Ljava/lang/String;)Z", "Landroidx/fragment/app/Fragment;", "Landroidx/fragment/app/FragmentManager;", "permissionCallback", "Lkotlin/jvm/functions/Function1;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FragmentPermissionDelegate implements PermissionDelegate {

    @NotNull
    private final Fragment hostFragment;

    @NotNull
    private final FragmentManager parentFragmentManager;
    private Function1<? super PermissionResult, Unit> permissionCallback;

    /* JADX INFO: renamed from: com.onfido.hosted.web.module.FragmentPermissionDelegate$showPermissionsManagementFragment$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "requestKey", "", "bundle", "Landroid/os/Bundle;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends u implements Function2<String, Bundle, Unit> {
        public AnonymousClass1() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
            invoke((String) obj2, (Bundle) obj3);
            return Unit.f186387a;
        }

        public final void invoke(@NotNull String requestKey, @NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(requestKey, "requestKey");
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            if (Intrinsics.f(requestKey, "KEY_RESULT_PERMISSIONS_MANAGEMENT")) {
                FragmentPermissionDelegate.this.parentFragmentManager.popBackStack();
                PermissionResult result = PermissionsManagementFragment.INSTANCE.getResult(bundle);
                Function1 function1 = FragmentPermissionDelegate.this.permissionCallback;
                if (function1 != null) {
                    function1.invoke(result);
                }
            }
        }
    }

    public FragmentPermissionDelegate(@NotNull Fragment hostFragment, @NotNull FragmentManager parentFragmentManager) {
        Intrinsics.checkNotNullParameter(hostFragment, "hostFragment");
        Intrinsics.checkNotNullParameter(parentFragmentManager, "parentFragmentManager");
        this.hostFragment = hostFragment;
        this.parentFragmentManager = parentFragmentManager;
    }

    private final FragmentTransaction getFragmentReplacementTransaction(Fragment fragment) {
        FragmentTransaction fragmentTransactionBeginTransaction = this.parentFragmentManager.beginTransaction();
        FlowStepDirection flowStepDirection = FlowStepDirection.RIGHT_TO_LEFT;
        Integer slideInAnimation = flowStepDirection.getSlideInAnimation();
        Intrinsics.h(slideInAnimation);
        int iIntValue = slideInAnimation.intValue();
        Integer slideOutAnimation = flowStepDirection.getSlideOutAnimation();
        Intrinsics.h(slideOutAnimation);
        fragmentTransactionBeginTransaction.setCustomAnimations(iIntValue, slideOutAnimation.intValue(), R.anim.slide_in_left, R.anim.slide_out_right);
        ViewParent parent = this.hostFragment.requireView().getParent();
        Intrinsics.i(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        FragmentTransaction fragmentTransactionAdd = fragmentTransactionBeginTransaction.add(((ViewGroup) parent).getId(), fragment, "TAG_PERMISSIONS_MANAGEMENT");
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionAdd, "add(...)");
        return fragmentTransactionAdd;
    }

    private final void setFragment(Fragment fragment, boolean shouldAddToBackStack) {
        FragmentTransaction fragmentReplacementTransaction = getFragmentReplacementTransaction(fragment);
        if (shouldAddToBackStack) {
            fragmentReplacementTransaction.addToBackStack(null);
        }
        fragmentReplacementTransaction.commit();
    }

    public static /* synthetic */ void setFragment$default(FragmentPermissionDelegate fragmentPermissionDelegate, Fragment fragment, boolean z, int i, Object obj2) {
        if ((i & 2) != 0) {
            z = true;
        }
        fragmentPermissionDelegate.setFragment(fragment, z);
    }

    private final void showPermissionsManagementFragment() {
        setFragment$default(this, PermissionsManagementFragment.INSTANCE.createInstance("KEY_RESULT_PERMISSIONS_MANAGEMENT", new CaptureStepDataBundle(CaptureType.FACE, null, null, null, null, null, null, 126, null)), false, 2, null);
        FragmentManager fragmentManager = this.parentFragmentManager;
        FragmentActivity fragmentActivityRequireActivity = this.hostFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        FragmentManagerExtKt.setFragmentResultsListeners(fragmentManager, fragmentActivityRequireActivity, new String[]{"KEY_RESULT_PERMISSIONS_MANAGEMENT"}, new AnonymousClass1());
    }

    @Override // com.onfido.hosted.web.module.PermissionDelegate
    public boolean hasPermission(@NotNull String permission) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        return ContextCompat.checkSelfPermission(this.hostFragment.requireContext(), permission) == 0;
    }

    @Override // com.onfido.hosted.web.module.PermissionDelegate
    public void registerForPermission(@NotNull String[] strArr, @NotNull Function1<? super PermissionResult, Unit> function1) {
        PermissionDelegate.DefaultImpls.registerForPermission(this, strArr, function1);
    }

    @Override // com.onfido.hosted.web.module.PermissionDelegate
    public void registerForResult(@NotNull Function1<? super PermissionResult, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.permissionCallback = callback;
    }

    @Override // com.onfido.hosted.web.module.PermissionDelegate
    public void requestPermission(@NotNull String[] permissions) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Fragment fragmentFindFragmentByTag = this.parentFragmentManager.findFragmentByTag("TAG_PERMISSIONS_MANAGEMENT");
        if ((fragmentFindFragmentByTag instanceof PermissionsManagementFragment ? (PermissionsManagementFragment) fragmentFindFragmentByTag : null) == null) {
            showPermissionsManagementFragment();
        }
    }
}
