package com.onfido.android.sdk.capture.utils;

import android.content.Context;
import android.content.DialogInterface;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.internal.util.annotation.InternalOnfidoApi;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;
import yhm.j;

/* JADX INFO: loaded from: classes17.dex */
@InternalOnfidoApi
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B5\b\u0002\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\u0004\b\n\u0010\u000bB'\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\n\u0010\u000eB'\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\n\u0010\u0011Jo\u0010\u001e\u001a\u00020\u001b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u00122\b\b\u0003\u0010\u0016\u001a\u00020\u00152\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0019\u001a\u00020\u00182\u0016\b\u0002\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00022\u0014\b\u0002\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u0002¢\u0006\u0004\b\u001e\u0010\u001fJq\u0010\u001e\u001a\u00020\u001b2\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\u00152\b\b\u0001\u0010!\u001a\u00020\u00152\b\b\u0003\u0010\u0016\u001a\u00020\u00152\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0019\u001a\u00020\u00182\u0016\b\u0002\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00022\u0014\b\u0002\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u0002¢\u0006\u0004\b\u001e\u0010\"J\r\u0010#\u001a\u00020\u001b¢\u0006\u0004\b#\u0010$J\u000f\u0010'\u001a\u00020\u0018H\u0001¢\u0006\u0004\b%\u0010&R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010(R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010)R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010*R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00061"}, d2 = {"Lcom/onfido/android/sdk/capture/utils/LifecycleAwareDialog;", "Landroidx/lifecycle/LifecycleObserver;", "Lkotlin/Function1;", "Landroid/content/Context;", "Landroidx/appcompat/app/AlertDialog$Builder;", "dialogBuilder", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lkotlin/Lazy;", "context", "<init>", "(Lkotlin/jvm/functions/Function1;Landroidx/lifecycle/LifecycleOwner;Lkotlin/Lazy;)V", "Landroidx/fragment/app/Fragment;", "fragment", "(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)V", "Landroidx/appcompat/app/AppCompatActivity;", "activity", "(Landroidx/appcompat/app/AppCompatActivity;Lkotlin/jvm/functions/Function1;)V", "", "title", "message", "", "positiveButtonResId", "negativeButtonResId", "", "cancelable", "Landroid/content/DialogInterface;", "", "negativeButtonAction", "positiveButtonAction", "show", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "titleResId", "messageResId", "(Ljava/lang/Integer;IILjava/lang/Integer;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "dismiss", "()V", "isShowing$onfido_capture_sdk_core_release", "()Z", "isShowing", "Lkotlin/jvm/functions/Function1;", "Landroidx/lifecycle/LifecycleOwner;", "Lkotlin/Lazy;", "Landroidx/appcompat/app/AlertDialog;", "dialog", "Landroidx/appcompat/app/AlertDialog;", "Landroidx/lifecycle/LifecycleEventObserver;", "observer", "Landroidx/lifecycle/LifecycleEventObserver;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LifecycleAwareDialog implements LifecycleObserver {

    @NotNull
    private final Lazy context;
    private AlertDialog dialog;

    @NotNull
    private final Function1<Context, AlertDialog.Builder> dialogBuilder;

    @NotNull
    private final LifecycleOwner lifecycleOwner;

    @NotNull
    private final LifecycleEventObserver observer;

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.utils.LifecycleAwareDialog$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/appcompat/app/AlertDialog$Builder;", "it", "Landroid/content/Context;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends u implements Function1<Context, AlertDialog.Builder> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final AlertDialog.Builder invoke(@NotNull Context it8) {
            Intrinsics.checkNotNullParameter(it8, "it");
            return new AlertDialog.Builder(it8);
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.utils.LifecycleAwareDialog$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/appcompat/app/AlertDialog$Builder;", "it", "Landroid/content/Context;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass2 extends u implements Function1<Context, AlertDialog.Builder> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final AlertDialog.Builder invoke(@NotNull Context it8) {
            Intrinsics.checkNotNullParameter(it8, "it");
            return new AlertDialog.Builder(it8);
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.utils.LifecycleAwareDialog$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/content/Context;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass3 extends u implements Function0<Context> {
        final /* synthetic */ Fragment $fragment;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Fragment fragment) {
            super(0);
            this.$fragment = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Context invoke() {
            Context contextRequireContext = this.$fragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            return contextRequireContext;
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.utils.LifecycleAwareDialog$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/appcompat/app/AlertDialog$Builder;", "it", "Landroid/content/Context;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass4 extends u implements Function1<Context, AlertDialog.Builder> {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        public AnonymousClass4() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final AlertDialog.Builder invoke(@NotNull Context it8) {
            Intrinsics.checkNotNullParameter(it8, "it");
            return new AlertDialog.Builder(it8);
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.utils.LifecycleAwareDialog$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/appcompat/app/AppCompatActivity;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass5 extends u implements Function0<AppCompatActivity> {
        final /* synthetic */ AppCompatActivity $activity;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(AppCompatActivity appCompatActivity) {
            super(0);
            this.$activity = appCompatActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final AppCompatActivity invoke() {
            return this.$activity;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Lifecycle.Event.ON_STOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Lifecycle.Event.ON_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Lifecycle.Event.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.utils.LifecycleAwareDialog$show$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C21591 extends u implements Function1<DialogInterface, Unit> {
        public static final C21591 INSTANCE = new C21591();

        public C21591() {
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

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.utils.LifecycleAwareDialog$show$4, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C21604 extends u implements Function1<DialogInterface, Unit> {
        public static final C21604 INSTANCE = new C21604();

        public C21604() {
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

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LifecycleAwareDialog(@NotNull AppCompatActivity activity, @NotNull Function1<? super Context, ? extends AlertDialog.Builder> dialogBuilder) {
        this(dialogBuilder, activity, j.b(new AnonymousClass5(activity)));
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(dialogBuilder, "dialogBuilder");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observer$lambda$0(LifecycleAwareDialog this$0, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        AlertDialog alertDialog;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(event, "event");
        int i = WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
        if (i == 1) {
            AlertDialog alertDialog2 = this$0.dialog;
            if (alertDialog2 != null) {
                alertDialog2.show();
                return;
            }
            return;
        }
        if ((i == 2 || i == 3 || i == 4) && (alertDialog = this$0.dialog) != null) {
            alertDialog.dismiss();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void show$default(LifecycleAwareDialog lifecycleAwareDialog, Integer num, int i, int i2, Integer num2, boolean z, Function1 function1, Function1 function12, int i3, Object obj2) {
        if ((i3 & 1) != 0) {
            num = null;
        }
        if ((i3 & 4) != 0) {
            i2 = R.string.onfido_ok;
        }
        if ((i3 & 8) != 0) {
            num2 = null;
        }
        if ((i3 & 16) != 0) {
            z = false;
        }
        if ((i3 & 32) != 0) {
            function1 = null;
        }
        if ((i3 & 64) != 0) {
            function12 = C21604.INSTANCE;
        }
        lifecycleAwareDialog.show(num, i, i2, num2, z, (Function1<? super DialogInterface, Unit>) function1, (Function1<? super DialogInterface, Unit>) function12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void show$lambda$1(Function1 positiveButtonAction, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(positiveButtonAction, "$positiveButtonAction");
        Intrinsics.h(dialogInterface);
        positiveButtonAction.invoke(dialogInterface);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void show$lambda$3$lambda$2(Function1 function1, DialogInterface dialogInterface, int i) {
        Intrinsics.h(dialogInterface);
        function1.invoke(dialogInterface);
    }

    public final void dismiss() {
        AlertDialog alertDialog = this.dialog;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        this.dialog = null;
    }

    public final boolean isShowing$onfido_capture_sdk_core_release() {
        AlertDialog alertDialog = this.dialog;
        return alertDialog != null && alertDialog.isShowing();
    }

    public final void show(Integer titleResId, int messageResId, int positiveButtonResId, Integer negativeButtonResId, boolean cancelable, Function1<? super DialogInterface, Unit> negativeButtonAction, @NotNull Function1<? super DialogInterface, Unit> positiveButtonAction) {
        Intrinsics.checkNotNullParameter(positiveButtonAction, "positiveButtonAction");
        String string = titleResId != null ? ((Context) this.context.getValue()).getString(titleResId.intValue()) : null;
        String string2 = ((Context) this.context.getValue()).getString(messageResId);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        show(string, string2, positiveButtonResId, negativeButtonResId, cancelable, negativeButtonAction, positiveButtonAction);
    }

    public /* synthetic */ LifecycleAwareDialog(AppCompatActivity appCompatActivity, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(appCompatActivity, (Function1<? super Context, ? extends AlertDialog.Builder>) ((i & 2) != 0 ? AnonymousClass4.INSTANCE : function1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void show$default(LifecycleAwareDialog lifecycleAwareDialog, String str, String str2, int i, Integer num, boolean z, Function1 function1, Function1 function12, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        if ((i2 & 4) != 0) {
            i = R.string.onfido_ok;
        }
        if ((i2 & 8) != 0) {
            num = null;
        }
        if ((i2 & 16) != 0) {
            z = false;
        }
        if ((i2 & 32) != 0) {
            function1 = null;
        }
        if ((i2 & 64) != 0) {
            function12 = C21591.INSTANCE;
        }
        lifecycleAwareDialog.show(str, str2, i, num, z, (Function1<? super DialogInterface, Unit>) function1, (Function1<? super DialogInterface, Unit>) function12);
    }

    public final void show(String title, @NotNull String message, int positiveButtonResId, Integer negativeButtonResId, boolean cancelable, final Function1<? super DialogInterface, Unit> negativeButtonAction, @NotNull final Function1<? super DialogInterface, Unit> positiveButtonAction) {
        AlertDialog alertDialog;
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(positiveButtonAction, "positiveButtonAction");
        AlertDialog.Builder message2 = ((AlertDialog.Builder) this.dialogBuilder.invoke(this.context.getValue())).setTitle(title).setCancelable(cancelable).setMessage(message);
        final int i = 0;
        AlertDialog.Builder positiveButton = message2.setPositiveButton(positiveButtonResId, new DialogInterface.OnClickListener() { // from class: com.onfido.android.sdk.capture.utils.a
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                switch (i) {
                    case 0:
                        LifecycleAwareDialog.show$lambda$1(positiveButtonAction, dialogInterface, i2);
                        break;
                    default:
                        LifecycleAwareDialog.show$lambda$3$lambda$2(positiveButtonAction, dialogInterface, i2);
                        break;
                }
            }
        });
        if (negativeButtonResId != null && negativeButtonAction != null) {
            int iIntValue = negativeButtonResId.intValue();
            final int i2 = 1;
            positiveButton.setNegativeButton(iIntValue, new DialogInterface.OnClickListener() { // from class: com.onfido.android.sdk.capture.utils.a
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i22) {
                    switch (i2) {
                        case 0:
                            LifecycleAwareDialog.show$lambda$1(negativeButtonAction, dialogInterface, i22);
                            break;
                        default:
                            LifecycleAwareDialog.show$lambda$3$lambda$2(negativeButtonAction, dialogInterface, i22);
                            break;
                    }
                }
            });
        }
        this.dialog = positiveButton.create();
        if (this.lifecycleOwner.getLifecycle().getState() != Lifecycle.State.RESUMED || (alertDialog = this.dialog) == null) {
            return;
        }
        alertDialog.show();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LifecycleAwareDialog(@NotNull Fragment fragment, @NotNull Function1<? super Context, ? extends AlertDialog.Builder> dialogBuilder) {
        this(dialogBuilder, fragment, j.b(new AnonymousClass3(fragment)));
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(dialogBuilder, "dialogBuilder");
    }

    public /* synthetic */ LifecycleAwareDialog(Fragment fragment, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(fragment, (Function1<? super Context, ? extends AlertDialog.Builder>) ((i & 2) != 0 ? AnonymousClass2.INSTANCE : function1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private LifecycleAwareDialog(Function1<? super Context, ? extends AlertDialog.Builder> function1, LifecycleOwner lifecycleOwner, Lazy lazy) {
        this.dialogBuilder = function1;
        this.lifecycleOwner = lifecycleOwner;
        this.context = lazy;
        androidx.lifecycle.a aVar = new androidx.lifecycle.a(this, 2);
        this.observer = aVar;
        lifecycleOwner.getLifecycle().addObserver(aVar);
    }

    public /* synthetic */ LifecycleAwareDialog(Function1 function1, LifecycleOwner lifecycleOwner, Lazy lazy, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? AnonymousClass1.INSTANCE : function1, lifecycleOwner, lazy);
    }
}
