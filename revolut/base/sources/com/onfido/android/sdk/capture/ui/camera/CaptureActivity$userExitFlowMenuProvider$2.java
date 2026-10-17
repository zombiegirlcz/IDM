package com.onfido.android.sdk.capture.ui.camera;

import android.content.DialogInterface;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.utils.UserExitFlowMenuProvider;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/onfido/android/sdk/capture/utils/UserExitFlowMenuProvider;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class CaptureActivity$userExitFlowMenuProvider$2 extends u implements Function0<UserExitFlowMenuProvider> {
    final /* synthetic */ CaptureActivity this$0;

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.CaptureActivity$userExitFlowMenuProvider$2$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends u implements Function0<Unit> {
        final /* synthetic */ CaptureActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CaptureActivity captureActivity) {
            super(0);
            this.this$0 = captureActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m3719invoke();
            return Unit.f186387a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m3719invoke() {
            this.this$0.getPresenter$onfido_capture_sdk_core_release().onFlowUserExit();
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.CaptureActivity$userExitFlowMenuProvider$2$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass2 extends u implements Function1<DialogInterface, Unit> {
        final /* synthetic */ CaptureActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(CaptureActivity captureActivity) {
            super(1);
            this.this$0 = captureActivity;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            invoke((DialogInterface) obj2);
            return Unit.f186387a;
        }

        public final void invoke(@NotNull DialogInterface it8) {
            Intrinsics.checkNotNullParameter(it8, "it");
            this.this$0.getPresenter$onfido_capture_sdk_core_release().onFlowUserExitConfirmed();
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.CaptureActivity$userExitFlowMenuProvider$2$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass3 extends u implements Function1<DialogInterface, Unit> {
        final /* synthetic */ CaptureActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(CaptureActivity captureActivity) {
            super(1);
            this.this$0 = captureActivity;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            invoke((DialogInterface) obj2);
            return Unit.f186387a;
        }

        public final void invoke(@NotNull DialogInterface it8) {
            Intrinsics.checkNotNullParameter(it8, "it");
            this.this$0.getPresenter$onfido_capture_sdk_core_release().onFlowUserExitCancel();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CaptureActivity$userExitFlowMenuProvider$2(CaptureActivity captureActivity) {
        super(0);
        this.this$0 = captureActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final UserExitFlowMenuProvider invoke() {
        return new UserExitFlowMenuProvider(this.this$0.lifecycleAwareDialog, R.menu.onfido_capture_activity_workflow_toolbar_menu, new AnonymousClass1(this.this$0), new AnonymousClass2(this.this$0), new AnonymousClass3(this.this$0));
    }
}
