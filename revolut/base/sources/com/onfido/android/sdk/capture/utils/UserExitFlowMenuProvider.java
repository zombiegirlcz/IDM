package com.onfido.android.sdk.capture.utils;

import android.content.DialogInterface;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.core.view.MenuProvider;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.internal.util.annotation.InternalOnfidoApi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@InternalOnfidoApi
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\t\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001cR \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001dR \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/onfido/android/sdk/capture/utils/UserExitFlowMenuProvider;", "Landroidx/core/view/MenuProvider;", "Lcom/onfido/android/sdk/capture/utils/LifecycleAwareDialog;", "lifecycleAwareDialog", "", "menuResId", "Lkotlin/Function0;", "", "onExitClicked", "Lkotlin/Function1;", "Landroid/content/DialogInterface;", "positiveButtonAction", "negativeButtonAction", "<init>", "(Lcom/onfido/android/sdk/capture/utils/LifecycleAwareDialog;ILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/Menu;", "menu", "Landroid/view/MenuInflater;", "menuInflater", "onCreateMenu", "(Landroid/view/Menu;Landroid/view/MenuInflater;)V", "Landroid/view/MenuItem;", "menuItem", "", "onMenuItemSelected", "(Landroid/view/MenuItem;)Z", "Lcom/onfido/android/sdk/capture/utils/LifecycleAwareDialog;", "I", "Lkotlin/jvm/functions/Function0;", "Lkotlin/jvm/functions/Function1;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class UserExitFlowMenuProvider implements MenuProvider {

    @NotNull
    private final LifecycleAwareDialog lifecycleAwareDialog;
    private final int menuResId;

    @NotNull
    private final Function1<DialogInterface, Unit> negativeButtonAction;

    @NotNull
    private final Function0<Unit> onExitClicked;

    @NotNull
    private final Function1<DialogInterface, Unit> positiveButtonAction;

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.utils.UserExitFlowMenuProvider$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends u implements Function0<Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m3734invoke() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m3734invoke();
            return Unit.f186387a;
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.utils.UserExitFlowMenuProvider$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass2 extends u implements Function1<DialogInterface, Unit> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            invoke((DialogInterface) obj2);
            return Unit.f186387a;
        }

        public final void invoke(@NotNull DialogInterface dialog) {
            Intrinsics.checkNotNullParameter(dialog, "dialog");
            dialog.dismiss();
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.utils.UserExitFlowMenuProvider$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass3 extends u implements Function1<DialogInterface, Unit> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            invoke((DialogInterface) obj2);
            return Unit.f186387a;
        }

        public final void invoke(@NotNull DialogInterface dialog) {
            Intrinsics.checkNotNullParameter(dialog, "dialog");
            dialog.dismiss();
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.utils.UserExitFlowMenuProvider$onMenuItemSelected$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C21641 extends u implements Function1<DialogInterface, Unit> {
        public C21641() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            invoke((DialogInterface) obj2);
            return Unit.f186387a;
        }

        public final void invoke(@NotNull DialogInterface it8) {
            Intrinsics.checkNotNullParameter(it8, "it");
            UserExitFlowMenuProvider.this.negativeButtonAction.invoke(it8);
            UserExitFlowMenuProvider.this.lifecycleAwareDialog.dismiss();
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.utils.UserExitFlowMenuProvider$onMenuItemSelected$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C21652 extends u implements Function1<DialogInterface, Unit> {
        public C21652() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            invoke((DialogInterface) obj2);
            return Unit.f186387a;
        }

        public final void invoke(@NotNull DialogInterface it8) {
            Intrinsics.checkNotNullParameter(it8, "it");
            UserExitFlowMenuProvider.this.positiveButtonAction.invoke(it8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UserExitFlowMenuProvider(@NotNull LifecycleAwareDialog lifecycleAwareDialog, int i, @NotNull Function0<Unit> onExitClicked, @NotNull Function1<? super DialogInterface, Unit> positiveButtonAction, @NotNull Function1<? super DialogInterface, Unit> negativeButtonAction) {
        Intrinsics.checkNotNullParameter(lifecycleAwareDialog, "lifecycleAwareDialog");
        Intrinsics.checkNotNullParameter(onExitClicked, "onExitClicked");
        Intrinsics.checkNotNullParameter(positiveButtonAction, "positiveButtonAction");
        Intrinsics.checkNotNullParameter(negativeButtonAction, "negativeButtonAction");
        this.lifecycleAwareDialog = lifecycleAwareDialog;
        this.menuResId = i;
        this.onExitClicked = onExitClicked;
        this.positiveButtonAction = positiveButtonAction;
        this.negativeButtonAction = negativeButtonAction;
    }

    @Override // androidx.core.view.MenuProvider
    public void onCreateMenu(@NotNull Menu menu, @NotNull MenuInflater menuInflater) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(menuInflater, "menuInflater");
        menuInflater.inflate(this.menuResId, menu);
    }

    @Override // androidx.core.view.MenuProvider
    public /* bridge */ /* synthetic */ void onMenuClosed(Menu menu) {
        super.onMenuClosed(menu);
    }

    @Override // androidx.core.view.MenuProvider
    public boolean onMenuItemSelected(@NotNull MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(menuItem, "menuItem");
        if (menuItem.getItemId() != R.id.action_exit_flow) {
            return false;
        }
        LifecycleAwareDialog lifecycleAwareDialog = this.lifecycleAwareDialog;
        int i = R.string.onfido_generic_close_sdk_title;
        LifecycleAwareDialog.show$default(lifecycleAwareDialog, Integer.valueOf(i), R.string.onfido_generic_close_sdk_subtitle, R.string.onfido_generic_close_sdk_exit, Integer.valueOf(R.string.onfido_generic_close_sdk_cancel), false, (Function1) new C21641(), (Function1) new C21652(), 16, (Object) null);
        this.onExitClicked.invoke();
        return true;
    }

    @Override // androidx.core.view.MenuProvider
    public /* bridge */ /* synthetic */ void onPrepareMenu(Menu menu) {
        super.onPrepareMenu(menu);
    }

    public /* synthetic */ UserExitFlowMenuProvider(LifecycleAwareDialog lifecycleAwareDialog, int i, Function0 function0, Function1 function1, Function1 function12, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(lifecycleAwareDialog, (i2 & 2) != 0 ? R.menu.onfido_activity_workflow_toolbar_menu : i, (i2 & 4) != 0 ? AnonymousClass1.INSTANCE : function0, (i2 & 8) != 0 ? AnonymousClass2.INSTANCE : function1, (i2 & 16) != 0 ? AnonymousClass3.INSTANCE : function12);
    }
}
