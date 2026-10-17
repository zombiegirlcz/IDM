package com.onfido.hosted.web.module;

import a41.h0;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.LinearLayout;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.view.OnBackPressedCallback;
import ap0.f;
import ch.qos.logback.core.net.SyslogConstants;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.core.config.FlowFragment;
import com.onfido.android.sdk.capture.databinding.OnfidoHostedWebModuleFragmentLayoutBinding;
import com.onfido.android.sdk.capture.internal.util.annotation.InternalOnfidoApi;
import com.onfido.android.sdk.capture.internal.util.logging.Timber;
import com.onfido.android.sdk.capture.utils.LifecycleAwareDialog;
import com.onfido.android.sdk.capture.utils.webview.OnfidoWebViewClient;
import com.onfido.hosted.web.module.HostedWebModuleViewModel;
import com.onfido.hosted.web.module.di.HostedWebModuleComponent;
import com.onfido.hosted.web.module.externallink.HostedWebModuleExternalLinkFragment;
import com.onfido.hosted.web.module.model.CaptureSDKExternalLinkResponse;
import com.onfido.hosted.web.module.model.HostedWebModuleCancelled;
import com.onfido.hosted.web.module.model.HostedWebModuleExit;
import com.onfido.hosted.web.module.model.HostedWebModuleFailed;
import com.onfido.hosted.web.module.model.HostedWebModuleModuleInfo;
import com.onfido.hosted.web.module.model.HostedWebModuleResult;
import com.onfido.hosted.web.module.model.HostedWebModuleScriptState;
import com.onfido.hosted.web.module.model.HostedWebModuleSuccess;
import com.onfido.hosted.web.module.utils.HostedWebModuleExtKt;
import gim.d;
import gim.i;
import java.net.MalformedURLException;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.StateFlow;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.cbeff.ISO781611;
import skm.e0;
import yhm.j;
import yhm.o;

/* JADX INFO: loaded from: classes17.dex */
@InternalOnfidoApi
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 C2\u00020\u0001:\u0001CB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u001f\u001a\u00020 H\u0002J\b\u0010!\u001a\u00020 H\u0002J\b\u0010\"\u001a\u00020#H\u0002J\b\u0010$\u001a\u00020 H\u0002J\u0010\u0010%\u001a\u00020 2\u0006\u0010&\u001a\u00020'H\u0002J\u0010\u0010(\u001a\u00020 2\u0006\u0010)\u001a\u00020*H\u0016J$\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u0001002\b\u00101\u001a\u0004\u0018\u000102H\u0016J\b\u00103\u001a\u00020 H\u0016J\u001a\u00104\u001a\u00020 2\u0006\u00105\u001a\u00020,2\b\u00101\u001a\u0004\u0018\u000102H\u0017J\u0010\u00106\u001a\u00020 2\u0006\u00107\u001a\u000208H\u0002J\u0010\u00109\u001a\u00020 2\u0006\u0010:\u001a\u00020;H\u0002J\u0010\u0010<\u001a\u00020 2\u0006\u0010=\u001a\u00020>H\u0002J\b\u0010?\u001a\u00020 H\u0002J\b\u0010@\u001a\u00020 H\u0002J\b\u0010A\u001a\u00020 H\u0002J\u0010\u0010B\u001a\u00020 2\u0006\u0010=\u001a\u00020>H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\n\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\n\u001a\u0004\b\u001c\u0010\u001d¨\u0006D"}, d2 = {"Lcom/onfido/hosted/web/module/HostedWebModuleFragment;", "Lcom/onfido/android/sdk/capture/core/config/FlowFragment;", "()V", "binding", "Lcom/onfido/android/sdk/capture/databinding/OnfidoHostedWebModuleFragmentLayoutBinding;", "component", "Lcom/onfido/hosted/web/module/di/HostedWebModuleComponent;", "getComponent", "()Lcom/onfido/hosted/web/module/di/HostedWebModuleComponent;", "component$delegate", "Lkotlin/Lazy;", "lifecycleAwareDialog", "Lcom/onfido/android/sdk/capture/utils/LifecycleAwareDialog;", "getLifecycleAwareDialog", "()Lcom/onfido/android/sdk/capture/utils/LifecycleAwareDialog;", "lifecycleAwareDialog$delegate", "permissionDelegate", "Lcom/onfido/hosted/web/module/FragmentPermissionDelegate;", "getPermissionDelegate", "()Lcom/onfido/hosted/web/module/FragmentPermissionDelegate;", "permissionDelegate$delegate", "pickerDelegate", "Lcom/onfido/hosted/web/module/DocumentPickerDelegate;", "getPickerDelegate", "()Lcom/onfido/hosted/web/module/DocumentPickerDelegate;", "pickerDelegate$delegate", "viewModel", "Lcom/onfido/hosted/web/module/HostedWebModuleViewModel;", "getViewModel", "()Lcom/onfido/hosted/web/module/HostedWebModuleViewModel;", "viewModel$delegate", "closeExternalTab", "", "evaluateBootstrapScript", "getModuleInfo", "Lcom/onfido/hosted/web/module/model/HostedWebModuleModuleInfo;", "handleBackNavigation", "handleExternalLinkCommand", "externalNavigationLinkCommand", "Lcom/onfido/hosted/web/module/HostedWebModuleViewModel$ExternalNavigationLinkCommand;", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDetach", "onViewCreated", "view", "openNewTab", "externalNavigationLink", "Lcom/onfido/hosted/web/module/HostedWebModuleViewModel$OpenExternalNavigationLink;", "setActionBarVisibility", "isVisible", "", "setFragmentResult", "result", "Lcom/onfido/hosted/web/module/model/HostedWebModuleResult;", "setupWebView", "showErrorScreen", "showExitDialog", "submitResult", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class HostedWebModuleFragment extends FlowFragment {
    private OnfidoHostedWebModuleFragmentLayoutBinding binding;

    /* JADX INFO: renamed from: component$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy component;

    /* JADX INFO: renamed from: lifecycleAwareDialog$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy lifecycleAwareDialog;

    /* JADX INFO: renamed from: permissionDelegate$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy permissionDelegate;

    /* JADX INFO: renamed from: pickerDelegate$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy pickerDelegate;

    /* JADX INFO: renamed from: viewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    @NotNull
    public static final String WEB_VIEW_RESULT_KEY = "web_view_result_key";

    @NotNull
    public static final String KEY_CAPTURE_SDK_BRIDGE_URL = "capture-sdk-bridge-url";

    @NotNull
    public static final String CAPTURE_SDK_INTERFACE_NAME = "callbackHandler";

    @NotNull
    public static final String KEY_CAPTURE_SDK_MODULE_INFO = "module_info";

    @NotNull
    public static final String KEY_DARK_MODE_ENABLED = "is_dark_mode_key";

    @NotNull
    public static final String REQUEST_KEY = "web_view_request_key";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @InternalOnfidoApi
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J*\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0014\u001a\u00020\u0015H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/onfido/hosted/web/module/HostedWebModuleFragment$Companion;", "", "()V", "CAPTURE_SDK_INTERFACE_NAME", "", "KEY_CAPTURE_SDK_BRIDGE_URL", "KEY_CAPTURE_SDK_MODULE_INFO", "KEY_DARK_MODE_ENABLED", "REQUEST_KEY", "WEB_VIEW_RESULT_KEY", "getResult", "Lcom/onfido/hosted/web/module/model/HostedWebModuleResult;", "bundle", "Landroid/os/Bundle;", "newInstance", "Lcom/onfido/hosted/web/module/HostedWebModuleFragment;", "requestKey", "moduleInfo", "Lcom/onfido/hosted/web/module/model/HostedWebModuleModuleInfo;", "captureSDKBridgeUrl", "isDarkMode", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @InternalOnfidoApi
        @NotNull
        public final HostedWebModuleResult getResult(@NotNull Bundle bundle) {
            Parcelable parcelable;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) h0.z(bundle);
            } else {
                Parcelable parcelable2 = bundle.getParcelable("web_view_result_key");
                if (!(parcelable2 instanceof HostedWebModuleResult)) {
                    parcelable2 = null;
                }
                parcelable = (HostedWebModuleResult) parcelable2;
            }
            if (parcelable != null) {
                return (HostedWebModuleResult) parcelable;
            }
            throw new IllegalArgumentException("Required value was null.");
        }

        @InternalOnfidoApi
        @NotNull
        public final HostedWebModuleFragment newInstance(@NotNull String requestKey, @NotNull HostedWebModuleModuleInfo moduleInfo, String captureSDKBridgeUrl, boolean isDarkMode) {
            Intrinsics.checkNotNullParameter(requestKey, "requestKey");
            Intrinsics.checkNotNullParameter(moduleInfo, "moduleInfo");
            HostedWebModuleFragment hostedWebModuleFragment = new HostedWebModuleFragment();
            hostedWebModuleFragment.setArguments(BundleKt.bundleOf(new Pair("is_dark_mode_key", Boolean.valueOf(isDarkMode)), new Pair("module_info", moduleInfo), new Pair("capture-sdk-bridge-url", captureSDKBridgeUrl), new Pair("web_view_request_key", requestKey)));
            return hostedWebModuleFragment;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.onfido.hosted.web.module.HostedWebModuleFragment$handleBackNavigation$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/onfido/hosted/web/module/HostedWebModuleFragment$handleBackNavigation$1", "Landroidx/activity/OnBackPressedCallback;", "handleOnBackPressed", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends OnBackPressedCallback {
        public AnonymousClass1() {
            super(true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void handleOnBackPressed$lambda$0(HostedWebModuleFragment this$0, String str) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            if (Intrinsics.f(str, "false") && this$0.getModuleInfo().getStudioInfo() == null) {
                this$0.getParentFragmentManager().popBackStack();
                this$0.setFragmentResult(HostedWebModuleCancelled.INSTANCE);
            }
        }

        @Override // androidx.view.OnBackPressedCallback
        public void handleOnBackPressed() {
            OnfidoHostedWebModuleFragmentLayoutBinding onfidoHostedWebModuleFragmentLayoutBinding = HostedWebModuleFragment.this.binding;
            if (onfidoHostedWebModuleFragmentLayoutBinding != null) {
                onfidoHostedWebModuleFragmentLayoutBinding.onfidoWebView.evaluateJavascript(HostedWebModuleFragment.this.getViewModel().getNavigateBackScript(), new b(HostedWebModuleFragment.this, 1));
            } else {
                Intrinsics.r("binding");
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: com.onfido.hosted.web.module.HostedWebModuleFragment$onViewCreated$2, reason: invalid class name */
    @d(c = "com.onfido.hosted.web.module.HostedWebModuleFragment$onViewCreated$2", f = "HostedWebModuleFragment.kt", l = {114}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass2 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.onfido.hosted.web.module.HostedWebModuleFragment$onViewCreated$2$1, reason: invalid class name */
        @d(c = "com.onfido.hosted.web.module.HostedWebModuleFragment$onViewCreated$2$1", f = "HostedWebModuleFragment.kt", l = {ISO781611.DISCRETIONARY_DATA_FOR_PAYLOAD_CONSTRUCTED_TAG}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class AnonymousClass1 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ HostedWebModuleFragment this$0;

            /* JADX INFO: renamed from: com.onfido.hosted.web.module.HostedWebModuleFragment$onViewCreated$2$1$1, reason: invalid class name and collision with other inner class name */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public /* synthetic */ class C03861 extends kotlin.jvm.internal.a implements Function2<HostedWebModuleResult, Continuation<? super Unit>, Object> {
                public C03861(Object obj2) {
                    super(2, 4, HostedWebModuleFragment.class, obj2, "submitResult", "submitResult(Lcom/onfido/hosted/web/module/model/HostedWebModuleResult;)V");
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(@NotNull HostedWebModuleResult hostedWebModuleResult, @NotNull Continuation<? super Unit> continuation) {
                    return AnonymousClass1.invokeSuspend$submitResult((HostedWebModuleFragment) this.receiver, hostedWebModuleResult, continuation);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(HostedWebModuleFragment hostedWebModuleFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = hostedWebModuleFragment;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ Object invokeSuspend$submitResult(HostedWebModuleFragment hostedWebModuleFragment, HostedWebModuleResult hostedWebModuleResult, Continuation continuation) {
                hostedWebModuleFragment.submitResult(hostedWebModuleResult);
                return Unit.f186387a;
            }

            @Override // gim.a
            @NotNull
            public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // gim.a
            public final Object invokeSuspend(@NotNull Object obj2) {
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    o.b(obj2);
                    StateFlow result$onfido_capture_sdk_core_release = this.this$0.getViewModel().getResult();
                    C03861 c03861 = new C03861(this.this$0);
                    this.label = 1;
                    if (HostedWebModuleExtKt.collectNonNull(result$onfido_capture_sdk_core_release, c03861, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                throw new KotlinNothingValueException();
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
            }
        }

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // gim.a
        @NotNull
        public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
            return HostedWebModuleFragment.this.new AnonymousClass2(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                o.b(obj2);
                LifecycleOwner viewLifecycleOwner = HostedWebModuleFragment.this.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                Lifecycle.State state = Lifecycle.State.STARTED;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(HostedWebModuleFragment.this, null);
                this.label = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(viewLifecycleOwner, state, anonymousClass1, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
            }
            return Unit.f186387a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX INFO: renamed from: com.onfido.hosted.web.module.HostedWebModuleFragment$onViewCreated$3, reason: invalid class name */
    @d(c = "com.onfido.hosted.web.module.HostedWebModuleFragment$onViewCreated$3", f = "HostedWebModuleFragment.kt", l = {SyslogConstants.LOG_CLOCK}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass3 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.onfido.hosted.web.module.HostedWebModuleFragment$onViewCreated$3$1, reason: invalid class name */
        @d(c = "com.onfido.hosted.web.module.HostedWebModuleFragment$onViewCreated$3$1", f = "HostedWebModuleFragment.kt", l = {121}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class AnonymousClass1 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ HostedWebModuleFragment this$0;

            /* JADX INFO: renamed from: com.onfido.hosted.web.module.HostedWebModuleFragment$onViewCreated$3$1$1, reason: invalid class name and collision with other inner class name */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public /* synthetic */ class C03871 extends kotlin.jvm.internal.a implements Function2<HostedWebModuleViewModel.ExternalNavigationLinkCommand, Continuation<? super Unit>, Object> {
                public C03871(Object obj2) {
                    super(2, 4, HostedWebModuleFragment.class, obj2, "handleExternalLinkCommand", "handleExternalLinkCommand(Lcom/onfido/hosted/web/module/HostedWebModuleViewModel$ExternalNavigationLinkCommand;)V");
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(@NotNull HostedWebModuleViewModel.ExternalNavigationLinkCommand externalNavigationLinkCommand, @NotNull Continuation<? super Unit> continuation) {
                    return AnonymousClass1.invokeSuspend$handleExternalLinkCommand((HostedWebModuleFragment) this.receiver, externalNavigationLinkCommand, continuation);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(HostedWebModuleFragment hostedWebModuleFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = hostedWebModuleFragment;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ Object invokeSuspend$handleExternalLinkCommand(HostedWebModuleFragment hostedWebModuleFragment, HostedWebModuleViewModel.ExternalNavigationLinkCommand externalNavigationLinkCommand, Continuation continuation) {
                hostedWebModuleFragment.handleExternalLinkCommand(externalNavigationLinkCommand);
                return Unit.f186387a;
            }

            @Override // gim.a
            @NotNull
            public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // gim.a
            public final Object invokeSuspend(@NotNull Object obj2) {
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    o.b(obj2);
                    StateFlow externalLinkCommand$onfido_capture_sdk_core_release = this.this$0.getViewModel().getExternalLinkCommand();
                    C03871 c03871 = new C03871(this.this$0);
                    this.label = 1;
                    if (HostedWebModuleExtKt.collectNonNull(externalLinkCommand$onfido_capture_sdk_core_release, c03871, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                throw new KotlinNothingValueException();
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
            }
        }

        public AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
        }

        @Override // gim.a
        @NotNull
        public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
            return HostedWebModuleFragment.this.new AnonymousClass3(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                o.b(obj2);
                LifecycleOwner viewLifecycleOwner = HostedWebModuleFragment.this.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                Lifecycle.State state = Lifecycle.State.STARTED;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(HostedWebModuleFragment.this, null);
                this.label = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(viewLifecycleOwner, state, anonymousClass1, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
            }
            return Unit.f186387a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX INFO: renamed from: com.onfido.hosted.web.module.HostedWebModuleFragment$onViewCreated$4, reason: invalid class name */
    @d(c = "com.onfido.hosted.web.module.HostedWebModuleFragment$onViewCreated$4", f = "HostedWebModuleFragment.kt", l = {126}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass4 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.onfido.hosted.web.module.HostedWebModuleFragment$onViewCreated$4$1, reason: invalid class name */
        @d(c = "com.onfido.hosted.web.module.HostedWebModuleFragment$onViewCreated$4$1", f = "HostedWebModuleFragment.kt", l = {CertificateBody.profileType}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class AnonymousClass1 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ HostedWebModuleFragment this$0;

            /* JADX INFO: renamed from: com.onfido.hosted.web.module.HostedWebModuleFragment$onViewCreated$4$1$1, reason: invalid class name and collision with other inner class name */
            @d(c = "com.onfido.hosted.web.module.HostedWebModuleFragment$onViewCreated$4$1$1", f = "HostedWebModuleFragment.kt", l = {}, m = "invokeSuspend")
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "scriptState", "Lcom/onfido/hosted/web/module/model/HostedWebModuleScriptState;"}, k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class C03881 extends i implements Function2<HostedWebModuleScriptState, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ HostedWebModuleFragment this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C03881(HostedWebModuleFragment hostedWebModuleFragment, Continuation<? super C03881> continuation) {
                    super(2, continuation);
                    this.this$0 = hostedWebModuleFragment;
                }

                @Override // gim.a
                @NotNull
                public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
                    C03881 c03881 = new C03881(this.this$0, continuation);
                    c03881.L$0 = obj2;
                    return c03881;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(@NotNull HostedWebModuleScriptState hostedWebModuleScriptState, Continuation<? super Unit> continuation) {
                    return ((C03881) create(hostedWebModuleScriptState, continuation)).invokeSuspend(Unit.f186387a);
                }

                @Override // gim.a
                public final Object invokeSuspend(@NotNull Object obj2) {
                    fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    if (((HostedWebModuleScriptState) this.L$0) == HostedWebModuleScriptState.SHOULD_EVALUATE) {
                        this.this$0.evaluateBootstrapScript();
                    }
                    return Unit.f186387a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(HostedWebModuleFragment hostedWebModuleFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = hostedWebModuleFragment;
            }

            @Override // gim.a
            @NotNull
            public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // gim.a
            public final Object invokeSuspend(@NotNull Object obj2) {
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    o.b(obj2);
                    StateFlow shouldEvaluateScript$onfido_capture_sdk_core_release = this.this$0.getViewModel().getShouldEvaluateScript();
                    C03881 c03881 = new C03881(this.this$0, null);
                    this.label = 1;
                    if (HostedWebModuleExtKt.collectNonNull(shouldEvaluateScript$onfido_capture_sdk_core_release, c03881, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                throw new KotlinNothingValueException();
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
            }
        }

        public AnonymousClass4(Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
        }

        @Override // gim.a
        @NotNull
        public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
            return HostedWebModuleFragment.this.new AnonymousClass4(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                o.b(obj2);
                LifecycleOwner viewLifecycleOwner = HostedWebModuleFragment.this.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                Lifecycle.State state = Lifecycle.State.STARTED;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(HostedWebModuleFragment.this, null);
                this.label = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(viewLifecycleOwner, state, anonymousClass1, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
            }
            return Unit.f186387a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX INFO: renamed from: com.onfido.hosted.web.module.HostedWebModuleFragment$showExitDialog$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C21751 extends u implements Function1<DialogInterface, Unit> {
        public C21751() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            invoke((DialogInterface) obj2);
            return Unit.f186387a;
        }

        public final void invoke(@NotNull DialogInterface it8) {
            Intrinsics.checkNotNullParameter(it8, "it");
            HostedWebModuleFragment.this.getViewModel().flowUserExitCanceled(HostedWebModuleFragment.this.getModuleInfo());
            HostedWebModuleFragment.this.getLifecycleAwareDialog().dismiss();
        }
    }

    /* JADX INFO: renamed from: com.onfido.hosted.web.module.HostedWebModuleFragment$showExitDialog$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C21762 extends u implements Function1<DialogInterface, Unit> {
        public C21762() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            invoke((DialogInterface) obj2);
            return Unit.f186387a;
        }

        public final void invoke(@NotNull DialogInterface it8) {
            Intrinsics.checkNotNullParameter(it8, "it");
            HostedWebModuleFragment.this.getViewModel().flowUserExitConfirmed(HostedWebModuleFragment.this.getModuleInfo());
            String string = HostedWebModuleFragment.this.requireArguments().getString("web_view_request_key");
            if (string == null) {
                string = "";
            }
            HostedWebModuleFragment.this.getParentFragmentManager().setFragmentResult(string, BundleKt.bundleOf(new Pair("web_view_result_key", new HostedWebModuleExit())));
        }
    }

    public HostedWebModuleFragment() {
        super(R.layout.onfido_hosted_web_module_fragment_layout);
        this.component = j.b(new HostedWebModuleFragment$component$2(this));
        this.viewModel = j.b(new HostedWebModuleFragment$viewModel$2(this));
        this.lifecycleAwareDialog = j.b(new HostedWebModuleFragment$lifecycleAwareDialog$2(this));
        this.pickerDelegate = j.b(new HostedWebModuleFragment$pickerDelegate$2(this));
        this.permissionDelegate = j.b(new HostedWebModuleFragment$permissionDelegate$2(this));
    }

    private final void closeExternalTab() {
        getViewModel().onCaptureSDKExternalLinkCommandExecuted$onfido_capture_sdk_core_release();
        Fragment fragmentFindFragmentByTag = requireActivity().getSupportFragmentManager().findFragmentByTag("BOTTOM_SHEET_DIALOG");
        HostedWebModuleExternalLinkFragment hostedWebModuleExternalLinkFragment = fragmentFindFragmentByTag instanceof HostedWebModuleExternalLinkFragment ? (HostedWebModuleExternalLinkFragment) fragmentFindFragmentByTag : null;
        if (hostedWebModuleExternalLinkFragment != null) {
            hostedWebModuleExternalLinkFragment.dismiss();
        } else {
            Timber.INSTANCE.w("Attempting to close external tab, but no external tab is open", new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void evaluateBootstrapScript() {
        boolean z = requireArguments().getBoolean("is_dark_mode_key");
        HostedWebModuleViewModel viewModel = getViewModel();
        HostedWebModuleModuleInfo moduleInfo = getModuleInfo();
        WebModuleThemeBuilder webModuleThemeBuilder = WebModuleThemeBuilder.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        String captureSDKConfigScript = viewModel.getCaptureSDKConfigScript(moduleInfo, webModuleThemeBuilder.build(contextRequireContext, z));
        OnfidoHostedWebModuleFragmentLayoutBinding onfidoHostedWebModuleFragmentLayoutBinding = this.binding;
        if (onfidoHostedWebModuleFragmentLayoutBinding != null) {
            onfidoHostedWebModuleFragmentLayoutBinding.onfidoWebView.evaluateJavascript(captureSDKConfigScript, new b(this, 0));
        } else {
            Intrinsics.r("binding");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void evaluateBootstrapScript$lambda$3(HostedWebModuleFragment this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getViewModel().onScriptEvaluated();
        Timber.INSTANCE.d(j6.a.q("Script has been evaluated: ", str), new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HostedWebModuleComponent getComponent() {
        return (HostedWebModuleComponent) this.component.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LifecycleAwareDialog getLifecycleAwareDialog() {
        return (LifecycleAwareDialog) this.lifecycleAwareDialog.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HostedWebModuleModuleInfo getModuleInfo() {
        Parcelable parcelable;
        Bundle bundleRequireArguments = requireArguments();
        Intrinsics.checkNotNullExpressionValue(bundleRequireArguments, "requireArguments(...)");
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = (Parcelable) h0.w(bundleRequireArguments);
        } else {
            Parcelable parcelable2 = bundleRequireArguments.getParcelable("module_info");
            if (!(parcelable2 instanceof HostedWebModuleModuleInfo)) {
                parcelable2 = null;
            }
            parcelable = (HostedWebModuleModuleInfo) parcelable2;
        }
        if (parcelable != null) {
            return (HostedWebModuleModuleInfo) parcelable;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final FragmentPermissionDelegate getPermissionDelegate() {
        return (FragmentPermissionDelegate) this.permissionDelegate.getValue();
    }

    private final DocumentPickerDelegate getPickerDelegate() {
        return (DocumentPickerDelegate) this.pickerDelegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HostedWebModuleViewModel getViewModel() {
        return (HostedWebModuleViewModel) this.viewModel.getValue();
    }

    private final void handleBackNavigation() {
        requireActivity().getOnBackPressedDispatcher().addCallback(getViewLifecycleOwner(), new AnonymousClass1());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleExternalLinkCommand(HostedWebModuleViewModel.ExternalNavigationLinkCommand externalNavigationLinkCommand) {
        if (externalNavigationLinkCommand instanceof HostedWebModuleViewModel.OpenExternalNavigationLink) {
            openNewTab((HostedWebModuleViewModel.OpenExternalNavigationLink) externalNavigationLinkCommand);
        } else if (externalNavigationLinkCommand instanceof HostedWebModuleViewModel.CloseExternalNavigationLink) {
            closeExternalTab();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$1$lambda$0(HostedWebModuleFragment this$0, OnfidoHostedWebModuleFragmentLayoutBinding this_with, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        this$0.getViewModel().onErrorRetried$onfido_capture_sdk_core_release();
        this_with.onfidoWebView.reload();
    }

    private final void openNewTab(HostedWebModuleViewModel.OpenExternalNavigationLink externalNavigationLink) {
        try {
            getViewModel().onCaptureSDKExternalLinkCommandExecuted$onfido_capture_sdk_core_release();
            if (externalNavigationLink.getTarget() != null && externalNavigationLink.getTarget() != CaptureSDKExternalLinkResponse.LinkTarget.OVERLAY) {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse(externalNavigationLink.getUrl())));
                return;
            }
            HostedWebModuleExternalLinkFragment.INSTANCE.newInstance(externalNavigationLink.getUrl(), externalNavigationLink.getFullscreen()).show(requireActivity().getSupportFragmentManager(), "BOTTOM_SHEET_DIALOG");
        } catch (MalformedURLException unused) {
            Timber.INSTANCE.e("CaptureSDK wrong external link: " + externalNavigationLink.getUrl(), new Object[0]);
        }
    }

    private final void setActionBarVisibility(boolean isVisible) {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.i(fragmentActivityRequireActivity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        ActionBar supportActionBar = ((AppCompatActivity) fragmentActivityRequireActivity).getSupportActionBar();
        if (supportActionBar != null) {
            if (isVisible) {
                supportActionBar.show();
            } else {
                supportActionBar.hide();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setFragmentResult(HostedWebModuleResult result) {
        String string = requireArguments().getString("web_view_request_key");
        if (string == null) {
            string = "";
        }
        getParentFragmentManager().setFragmentResult(string, BundleKt.bundleOf(new Pair("web_view_result_key", result)));
    }

    private final void setupWebView() {
        String string = requireArguments().getString("capture-sdk-bridge-url");
        if (string == null) {
            string = "";
        }
        HostedWebModuleListener hostedWebModuleListener = new HostedWebModuleListener(getViewModel());
        OnfidoHostedWebModuleFragmentLayoutBinding onfidoHostedWebModuleFragmentLayoutBinding = this.binding;
        if (onfidoHostedWebModuleFragmentLayoutBinding == null) {
            Intrinsics.r("binding");
            throw null;
        }
        String bridgeUrl$onfido_capture_sdk_core_release = getViewModel().getBridgeUrl$onfido_capture_sdk_core_release(string);
        onfidoHostedWebModuleFragmentLayoutBinding.onfidoWebView.getSettings().setJavaScriptEnabled(true);
        onfidoHostedWebModuleFragmentLayoutBinding.onfidoWebView.getSettings().setMediaPlaybackRequiresUserGesture(false);
        onfidoHostedWebModuleFragmentLayoutBinding.onfidoWebView.getSettings().setSupportZoom(false);
        onfidoHostedWebModuleFragmentLayoutBinding.onfidoWebView.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.onfido_transparent));
        WebView webView = onfidoHostedWebModuleFragmentLayoutBinding.onfidoWebView;
        FragmentPermissionDelegate permissionDelegate = getPermissionDelegate();
        DocumentPickerDelegate pickerDelegate = getPickerDelegate();
        Uri uri2 = Uri.parse(bridgeUrl$onfido_capture_sdk_core_release);
        Intrinsics.checkNotNullExpressionValue(uri2, "parse(this)");
        webView.setWebChromeClient(new ChromeClient(permissionDelegate, pickerDelegate, uri2));
        onfidoHostedWebModuleFragmentLayoutBinding.onfidoWebView.setWebViewClient(new OnfidoWebViewClient(new HostedWebModuleFragment$setupWebView$1$1(this), new HostedWebModuleFragment$setupWebView$1$2(onfidoHostedWebModuleFragmentLayoutBinding), new HostedWebModuleFragment$setupWebView$1$3(this)));
        onfidoHostedWebModuleFragmentLayoutBinding.onfidoWebView.addJavascriptInterface(hostedWebModuleListener, "callbackHandler");
        onfidoHostedWebModuleFragmentLayoutBinding.onfidoWebView.loadUrl(bridgeUrl$onfido_capture_sdk_core_release);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showErrorScreen() {
        OnfidoHostedWebModuleFragmentLayoutBinding onfidoHostedWebModuleFragmentLayoutBinding = this.binding;
        if (onfidoHostedWebModuleFragmentLayoutBinding == null) {
            Intrinsics.r("binding");
            throw null;
        }
        onfidoHostedWebModuleFragmentLayoutBinding.webViewErrorLayout.setVisibility(0);
        OnfidoHostedWebModuleFragmentLayoutBinding onfidoHostedWebModuleFragmentLayoutBinding2 = this.binding;
        if (onfidoHostedWebModuleFragmentLayoutBinding2 != null) {
            onfidoHostedWebModuleFragmentLayoutBinding2.onfidoWebView.setVisibility(8);
        } else {
            Intrinsics.r("binding");
            throw null;
        }
    }

    private final void showExitDialog() {
        getViewModel().flowUserExit(getModuleInfo());
        LifecycleAwareDialog lifecycleAwareDialog = getLifecycleAwareDialog();
        int i = R.string.onfido_generic_close_sdk_title;
        LifecycleAwareDialog.show$default(lifecycleAwareDialog, Integer.valueOf(i), R.string.onfido_generic_close_sdk_subtitle, R.string.onfido_generic_close_sdk_exit, Integer.valueOf(R.string.onfido_generic_close_sdk_cancel), false, (Function1) new C21751(), (Function1) new C21762(), 16, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void submitResult(HostedWebModuleResult result) {
        if (result instanceof HostedWebModuleExit) {
            showExitDialog();
            return;
        }
        if (!(result instanceof HostedWebModuleFailed)) {
            if (result instanceof HostedWebModuleCancelled) {
                getParentFragmentManager().popBackStack();
                setFragmentResult(result);
                return;
            } else if (!(result instanceof HostedWebModuleSuccess)) {
                return;
            }
        }
        setFragmentResult(result);
    }

    @Override // com.onfido.android.sdk.capture.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        setActionBarVisibility(false);
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        OnfidoHostedWebModuleFragmentLayoutBinding onfidoHostedWebModuleFragmentLayoutBindingInflate = OnfidoHostedWebModuleFragmentLayoutBinding.inflate(inflater);
        Intrinsics.checkNotNullExpressionValue(onfidoHostedWebModuleFragmentLayoutBindingInflate, "inflate(...)");
        this.binding = onfidoHostedWebModuleFragmentLayoutBindingInflate;
        if (onfidoHostedWebModuleFragmentLayoutBindingInflate == null) {
            Intrinsics.r("binding");
            throw null;
        }
        LinearLayout root = onfidoHostedWebModuleFragmentLayoutBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // com.onfido.android.sdk.capture.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onDetach() {
        setActionBarVisibility(true);
        super.onDetach();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        WebView.setWebContentsDebuggingEnabled(false);
        OnfidoHostedWebModuleFragmentLayoutBinding onfidoHostedWebModuleFragmentLayoutBinding = this.binding;
        if (onfidoHostedWebModuleFragmentLayoutBinding == null) {
            Intrinsics.r("binding");
            throw null;
        }
        onfidoHostedWebModuleFragmentLayoutBinding.reloadButton.setOnClickListener(new f(this, onfidoHostedWebModuleFragmentLayoutBinding, 11));
        setupWebView();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        e0.C(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new AnonymousClass2(null), 3);
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        e0.C(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2), null, null, new AnonymousClass3(null), 3);
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        e0.C(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner3), null, null, new AnonymousClass4(null), 3);
        handleBackNavigation();
    }
}
