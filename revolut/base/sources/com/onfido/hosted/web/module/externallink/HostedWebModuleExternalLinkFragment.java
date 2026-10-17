package com.onfido.hosted.web.module.externallink;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.os.BundleKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.databinding.OnfidoHostedWebModuleBottomSheetLayoutBinding;
import com.onfido.hosted.web.module.di.HostedWebModuleComponent;
import com.onfido.hosted.web.module.externallink.HostedWebModuleExternalLinkFragment;
import com.onfido.hosted.web.module.utils.HostedWebModuleExtKt;
import gim.i;
import java.net.URL;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import yhm.j;
import yhm.o;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 *2\u00020\u0001:\u0001*B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0012\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0017J$\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u001a\u0010\"\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u001d2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u001e\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u00112\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00150'H\u0003J\u0010\u0010(\u001a\u00020\u00152\u0006\u0010)\u001a\u00020\u0011H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000e¨\u0006+"}, d2 = {"Lcom/onfido/hosted/web/module/externallink/HostedWebModuleExternalLinkFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "()V", "binding", "Lcom/onfido/android/sdk/capture/databinding/OnfidoHostedWebModuleBottomSheetLayoutBinding;", "component", "Lcom/onfido/hosted/web/module/di/HostedWebModuleComponent;", "getComponent", "()Lcom/onfido/hosted/web/module/di/HostedWebModuleComponent;", "component$delegate", "Lkotlin/Lazy;", "viewModel", "Lcom/onfido/hosted/web/module/externallink/HostedWebModuleExternalLinkViewModel;", "getViewModel", "()Lcom/onfido/hosted/web/module/externallink/HostedWebModuleExternalLinkViewModel;", "viewModel$delegate", "getFullscreenParams", "", "getUrlParams", "Ljava/net/URL;", "handleResult", "", "result", "Lcom/onfido/hosted/web/module/externallink/HostedWebModuleExternalLinkResult;", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "openWebView", "isPdf", "pageFinished", "Lkotlin/Function0;", "setProgressBarVisibility", "isVisible", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class HostedWebModuleExternalLinkFragment extends BottomSheetDialogFragment {
    private OnfidoHostedWebModuleBottomSheetLayoutBinding binding;

    /* JADX INFO: renamed from: component$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy component = j.b(new HostedWebModuleExternalLinkFragment$component$2(this));

    /* JADX INFO: renamed from: viewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel = j.b(new HostedWebModuleExternalLinkFragment$viewModel$2(this));

    @NotNull
    private static final String KEY_URL = "url";

    @NotNull
    private static final String KEY_FULLSCREEN = "fullscreen";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001d\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/onfido/hosted/web/module/externallink/HostedWebModuleExternalLinkFragment$Companion;", "", "()V", "KEY_FULLSCREEN", "", "KEY_URL", "newInstance", "Lcom/onfido/hosted/web/module/externallink/HostedWebModuleExternalLinkFragment;", "url", "fullscreen", "", "(Ljava/lang/String;Ljava/lang/Boolean;)Lcom/onfido/hosted/web/module/externallink/HostedWebModuleExternalLinkFragment;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final HostedWebModuleExternalLinkFragment newInstance(@NotNull String url2, Boolean fullscreen) {
            Intrinsics.checkNotNullParameter(url2, "url");
            HostedWebModuleExternalLinkFragment hostedWebModuleExternalLinkFragment = new HostedWebModuleExternalLinkFragment();
            hostedWebModuleExternalLinkFragment.setArguments(BundleKt.bundleOf(new Pair("url", url2), new Pair("fullscreen", fullscreen)));
            return hostedWebModuleExternalLinkFragment;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.onfido.hosted.web.module.externallink.HostedWebModuleExternalLinkFragment$handleResult$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends u implements Function0<Unit> {
        final /* synthetic */ HostedWebModuleExternalLinkResult $result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HostedWebModuleExternalLinkResult hostedWebModuleExternalLinkResult) {
            super(0);
            this.$result = hostedWebModuleExternalLinkResult;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(HostedWebModuleExternalLinkFragment this$0, String str) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.setProgressBarVisibility(false);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m3742invoke();
            return Unit.f186387a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m3742invoke() {
            OnfidoHostedWebModuleBottomSheetLayoutBinding onfidoHostedWebModuleBottomSheetLayoutBinding = HostedWebModuleExternalLinkFragment.this.binding;
            if (onfidoHostedWebModuleBottomSheetLayoutBinding == null) {
                Intrinsics.r("binding");
                throw null;
            }
            WebView webView = onfidoHostedWebModuleBottomSheetLayoutBinding.onfidoBottomSheetWebView;
            String jsCode = ((PdfSuccess) this.$result).getJsCode();
            final HostedWebModuleExternalLinkFragment hostedWebModuleExternalLinkFragment = HostedWebModuleExternalLinkFragment.this;
            webView.evaluateJavascript(jsCode, new ValueCallback() { // from class: com.onfido.hosted.web.module.externallink.d
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj2) {
                    HostedWebModuleExternalLinkFragment.AnonymousClass1.invoke$lambda$0(hostedWebModuleExternalLinkFragment, (String) obj2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.onfido.hosted.web.module.externallink.HostedWebModuleExternalLinkFragment$handleResult$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass2 extends u implements Function0<Unit> {
        public AnonymousClass2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m3743invoke();
            return Unit.f186387a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m3743invoke() {
            HostedWebModuleExternalLinkFragment.this.setProgressBarVisibility(false);
        }
    }

    /* JADX INFO: renamed from: com.onfido.hosted.web.module.externallink.HostedWebModuleExternalLinkFragment$onViewCreated$1, reason: invalid class name and case insensitive filesystem */
    @gim.d(c = "com.onfido.hosted.web.module.externallink.HostedWebModuleExternalLinkFragment$onViewCreated$1", f = "HostedWebModuleExternalLinkFragment.kt", l = {69}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C21771 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.onfido.hosted.web.module.externallink.HostedWebModuleExternalLinkFragment$onViewCreated$1$1, reason: invalid class name and collision with other inner class name */
        @gim.d(c = "com.onfido.hosted.web.module.externallink.HostedWebModuleExternalLinkFragment$onViewCreated$1$1", f = "HostedWebModuleExternalLinkFragment.kt", l = {70}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class C03891 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ HostedWebModuleExternalLinkFragment this$0;

            /* JADX INFO: renamed from: com.onfido.hosted.web.module.externallink.HostedWebModuleExternalLinkFragment$onViewCreated$1$1$1, reason: invalid class name and collision with other inner class name */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public /* synthetic */ class C03901 extends kotlin.jvm.internal.a implements Function2<HostedWebModuleExternalLinkResult, Continuation<? super Unit>, Object> {
                public C03901(Object obj2) {
                    super(2, 4, HostedWebModuleExternalLinkFragment.class, obj2, "handleResult", "handleResult(Lcom/onfido/hosted/web/module/externallink/HostedWebModuleExternalLinkResult;)V");
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(@NotNull HostedWebModuleExternalLinkResult hostedWebModuleExternalLinkResult, @NotNull Continuation<? super Unit> continuation) {
                    return C03891.invokeSuspend$handleResult((HostedWebModuleExternalLinkFragment) this.receiver, hostedWebModuleExternalLinkResult, continuation);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03891(HostedWebModuleExternalLinkFragment hostedWebModuleExternalLinkFragment, Continuation<? super C03891> continuation) {
                super(2, continuation);
                this.this$0 = hostedWebModuleExternalLinkFragment;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ Object invokeSuspend$handleResult(HostedWebModuleExternalLinkFragment hostedWebModuleExternalLinkFragment, HostedWebModuleExternalLinkResult hostedWebModuleExternalLinkResult, Continuation continuation) {
                hostedWebModuleExternalLinkFragment.handleResult(hostedWebModuleExternalLinkResult);
                return Unit.f186387a;
            }

            @Override // gim.a
            @NotNull
            public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
                return new C03891(this.this$0, continuation);
            }

            @Override // gim.a
            public final Object invokeSuspend(@NotNull Object obj2) {
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    o.b(obj2);
                    StateFlow result = this.this$0.getViewModel().getResult();
                    C03901 c03901 = new C03901(this.this$0);
                    this.label = 1;
                    if (HostedWebModuleExtKt.collectNonNull(result, c03901, this) == aVar) {
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
                return ((C03891) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
            }
        }

        public C21771(Continuation<? super C21771> continuation) {
            super(2, continuation);
        }

        @Override // gim.a
        @NotNull
        public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
            return HostedWebModuleExternalLinkFragment.this.new C21771(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                o.b(obj2);
                LifecycleOwner viewLifecycleOwner = HostedWebModuleExternalLinkFragment.this.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                Lifecycle.State state = Lifecycle.State.CREATED;
                C03891 c03891 = new C03891(HostedWebModuleExternalLinkFragment.this, null);
                this.label = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(viewLifecycleOwner, state, c03891, this) == aVar) {
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
            return ((C21771) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HostedWebModuleComponent getComponent() {
        return (HostedWebModuleComponent) this.component.getValue();
    }

    private final boolean getFullscreenParams() {
        return requireArguments().getBoolean("fullscreen", false);
    }

    private final URL getUrlParams() {
        return new URL(requireArguments().getString("url"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HostedWebModuleExternalLinkViewModel getViewModel() {
        return (HostedWebModuleExternalLinkViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleResult(HostedWebModuleExternalLinkResult result) {
        if (Intrinsics.f(result, Failed.INSTANCE)) {
            dismiss();
            return;
        }
        if (Intrinsics.f(result, Loading.INSTANCE)) {
            setProgressBarVisibility(true);
        } else if (result instanceof PdfSuccess) {
            openWebView(true, new AnonymousClass1(result));
        } else if (Intrinsics.f(result, UrlSuccess.INSTANCE)) {
            openWebView(false, new AnonymousClass2());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateDialog$lambda$3$lambda$2(HostedWebModuleExternalLinkFragment this$0, DialogInterface dialogInterface) {
        final BottomSheetBehavior<FrameLayout> behavior;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Dialog dialog = this$0.getDialog();
        BottomSheetDialog bottomSheetDialog = dialog instanceof BottomSheetDialog ? (BottomSheetDialog) dialog : null;
        if (bottomSheetDialog == null || (behavior = bottomSheetDialog.getBehavior()) == null) {
            return;
        }
        if (this$0.getFullscreenParams()) {
            Dialog dialog2 = this$0.getDialog();
            LinearLayout linearLayout = dialog2 != null ? (LinearLayout) dialog2.findViewById(R.id.hostedWebviewDialogLayout) : null;
            if (linearLayout != null) {
                linearLayout.setMinimumHeight(Resources.getSystem().getDisplayMetrics().heightPixels);
            }
            OnfidoHostedWebModuleBottomSheetLayoutBinding onfidoHostedWebModuleBottomSheetLayoutBinding = this$0.binding;
            if (onfidoHostedWebModuleBottomSheetLayoutBinding == null) {
                Intrinsics.r("binding");
                throw null;
            }
            onfidoHostedWebModuleBottomSheetLayoutBinding.dragHandle.setVisibility(8);
            behavior.setDraggable(false);
            behavior.setState(3);
        } else {
            behavior.setDraggable(true);
            OnfidoHostedWebModuleBottomSheetLayoutBinding onfidoHostedWebModuleBottomSheetLayoutBinding2 = this$0.binding;
            if (onfidoHostedWebModuleBottomSheetLayoutBinding2 == null) {
                Intrinsics.r("binding");
                throw null;
            }
            onfidoHostedWebModuleBottomSheetLayoutBinding2.onfidoBottomSheetWebView.setOnTouchListener(new View.OnTouchListener() { // from class: com.onfido.hosted.web.module.externallink.a
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return HostedWebModuleExternalLinkFragment.onCreateDialog$lambda$3$lambda$2$lambda$0(behavior, view, motionEvent);
                }
            });
        }
        OnfidoHostedWebModuleBottomSheetLayoutBinding onfidoHostedWebModuleBottomSheetLayoutBinding3 = this$0.binding;
        if (onfidoHostedWebModuleBottomSheetLayoutBinding3 != null) {
            onfidoHostedWebModuleBottomSheetLayoutBinding3.buttonClose.setOnClickListener(new View.OnClickListener() { // from class: com.onfido.hosted.web.module.externallink.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HostedWebModuleExternalLinkFragment.onCreateDialog$lambda$3$lambda$2$lambda$1(behavior, view);
                }
            });
        } else {
            Intrinsics.r("binding");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onCreateDialog$lambda$3$lambda$2$lambda$0(BottomSheetBehavior behavior, View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(behavior, "$behavior");
        int action = motionEvent.getAction();
        if (action == 0) {
            behavior.setDraggable(false);
        } else if (action == 1 || action == 3) {
            behavior.setDraggable(true);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateDialog$lambda$3$lambda$2$lambda$1(BottomSheetBehavior behavior, View view) {
        Intrinsics.checkNotNullParameter(behavior, "$behavior");
        behavior.setState(5);
    }

    private final void openWebView(boolean isPdf, final Function0<Unit> pageFinished) {
        OnfidoHostedWebModuleBottomSheetLayoutBinding onfidoHostedWebModuleBottomSheetLayoutBinding = this.binding;
        if (onfidoHostedWebModuleBottomSheetLayoutBinding == null) {
            Intrinsics.r("binding");
            throw null;
        }
        WebView webView = onfidoHostedWebModuleBottomSheetLayoutBinding.onfidoBottomSheetWebView;
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setSupportZoom(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setDisplayZoomControls(false);
        webView.setWebViewClient(new WebViewClient() { // from class: com.onfido.hosted.web.module.externallink.HostedWebModuleExternalLinkFragment$openWebView$1$1
            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView view, String url2) {
                super.onPageFinished(view, url2);
                pageFinished.invoke();
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
                super.onReceivedError(view, request, error);
                this.this$0.dismiss();
            }
        });
        webView.loadUrl(isPdf ? "file:///android_asset/index.html" : getUrlParams().toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setProgressBarVisibility(boolean isVisible) {
        OnfidoHostedWebModuleBottomSheetLayoutBinding onfidoHostedWebModuleBottomSheetLayoutBinding = this.binding;
        if (onfidoHostedWebModuleBottomSheetLayoutBinding != null) {
            onfidoHostedWebModuleBottomSheetLayoutBinding.progressCircular.setVisibility(isVisible ? 0 : 8);
        } else {
            Intrinsics.r("binding");
            throw null;
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    @NotNull
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(requireContext(), getTheme());
        bottomSheetDialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.onfido.hosted.web.module.externallink.c
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                HostedWebModuleExternalLinkFragment.onCreateDialog$lambda$3$lambda$2(this.f50167a, dialogInterface);
            }
        });
        return bottomSheetDialog;
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        if (container != null) {
            container.setBackgroundResource(android.R.color.transparent);
        }
        OnfidoHostedWebModuleBottomSheetLayoutBinding onfidoHostedWebModuleBottomSheetLayoutBindingInflate = OnfidoHostedWebModuleBottomSheetLayoutBinding.inflate(inflater);
        Intrinsics.checkNotNullExpressionValue(onfidoHostedWebModuleBottomSheetLayoutBindingInflate, "inflate(...)");
        this.binding = onfidoHostedWebModuleBottomSheetLayoutBindingInflate;
        if (onfidoHostedWebModuleBottomSheetLayoutBindingInflate == null) {
            Intrinsics.r("binding");
            throw null;
        }
        LinearLayout root = onfidoHostedWebModuleBottomSheetLayoutBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        e0.C(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C21771(null), 3);
        getViewModel().onExternalLinkReceived(getUrlParams());
    }
}
