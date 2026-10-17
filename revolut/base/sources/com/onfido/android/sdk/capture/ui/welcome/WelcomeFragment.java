package com.onfido.android.sdk.capture.ui.welcome;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.os.BundleKt;
import androidx.core.view.ViewGroupKt;
import au0.b2;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.common.SdkController;
import com.onfido.android.sdk.capture.databinding.OnfidoFragmentBulletedMessageBinding;
import com.onfido.android.sdk.capture.internal.util.logging.Timber;
import com.onfido.android.sdk.capture.ui.BaseFragment;
import com.onfido.android.sdk.capture.ui.BulletStepView;
import com.onfido.android.sdk.capture.ui.NextActionListener;
import com.onfido.android.sdk.capture.ui.options.WelcomeScreenOptions;
import com.onfido.android.sdk.capture.ui.welcome.WelcomePresenter;
import com.onfido.android.sdk.capture.ui.widget.OnfidoButton;
import com.onfido.android.sdk.capture.utils.ContextUtilsKt;
import com.onfido.android.sdk.capture.utils.RxExtensionsKt;
import igm.g;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import nkm.y;
import org.jetbrains.annotations.NotNull;
import yhm.j;
import zhm.v;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 #2\u00020\u0001:\u0001#B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0014\u001a\u00020\u0012H\u0016J\b\u0010\u0015\u001a\u00020\u0012H\u0016J\u001a\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0018\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0014\u0010 \u001a\u00020\u0012*\u00020!2\u0006\u0010\u001e\u001a\u00020\"H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\u000b\u001a\u00020\f8\u0000@\u0000X\u0081.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006$"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/welcome/WelcomeFragment;", "Lcom/onfido/android/sdk/capture/ui/BaseFragment;", "()V", "compositeDisposable", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "presenter", "Lcom/onfido/android/sdk/capture/ui/welcome/WelcomePresenter;", "getPresenter", "()Lcom/onfido/android/sdk/capture/ui/welcome/WelcomePresenter;", "presenter$delegate", "Lkotlin/Lazy;", "presenterFactory", "Lcom/onfido/android/sdk/capture/ui/welcome/WelcomePresenter$Factory;", "getPresenterFactory$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/ui/welcome/WelcomePresenter$Factory;", "setPresenterFactory$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/ui/welcome/WelcomePresenter$Factory;)V", "onDestroyView", "", "onPause", "onResume", "onStart", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "renderState", "binding", "Lcom/onfido/android/sdk/capture/databinding/OnfidoFragmentBulletedMessageBinding;", "state", "Lcom/onfido/android/sdk/capture/ui/welcome/WelcomePresenter$ViewState;", "renderBulletPointState", "Lcom/onfido/android/sdk/capture/ui/BulletStepView;", "Lcom/onfido/android/sdk/capture/ui/welcome/WelcomePresenter$ViewState$BulletPointState;", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class WelcomeFragment extends BaseFragment {

    @NotNull
    private static final String ARG_KEY_WELCOME_SCREEN_OPTIONS = "WELCOME_SCREEN_OPTIONS";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final CompositeDisposable compositeDisposable;

    /* JADX INFO: renamed from: presenter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy presenter;
    public WelcomePresenter.Factory presenterFactory;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/welcome/WelcomeFragment$Companion;", "", "()V", "ARG_KEY_WELCOME_SCREEN_OPTIONS", "", "createInstance", "Lcom/onfido/android/sdk/capture/ui/welcome/WelcomeFragment;", "options", "Lcom/onfido/android/sdk/capture/ui/options/WelcomeScreenOptions;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final WelcomeFragment createInstance(@NotNull WelcomeScreenOptions options) {
            Intrinsics.checkNotNullParameter(options, "options");
            WelcomeFragment welcomeFragment = new WelcomeFragment();
            welcomeFragment.setArguments(BundleKt.bundleOf(new Pair("WELCOME_SCREEN_OPTIONS", options)));
            return welcomeFragment;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.welcome.WelcomeFragment$renderState$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke", "(Landroid/view/View;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C21551 extends u implements Function1<View, Boolean> {
        public static final C21551 INSTANCE = new C21551();

        public C21551() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Boolean invoke(@NotNull View it8) {
            Intrinsics.checkNotNullParameter(it8, "it");
            return Boolean.valueOf(it8.getId() == R.id.listHeader);
        }
    }

    public WelcomeFragment() {
        super(R.layout.onfido_fragment_bulleted_message);
        this.compositeDisposable = new CompositeDisposable();
        this.presenter = j.b(new WelcomeFragment$presenter$2(this));
    }

    @NotNull
    public static final WelcomeFragment createInstance(@NotNull WelcomeScreenOptions welcomeScreenOptions) {
        return INSTANCE.createInstance(welcomeScreenOptions);
    }

    private final WelcomePresenter getPresenter() {
        return (WelcomePresenter) this.presenter.getValue();
    }

    private final void renderBulletPointState(BulletStepView bulletStepView, WelcomePresenter.ViewState.BulletPointState bulletPointState) {
        if (bulletPointState instanceof WelcomePresenter.ViewState.BulletPointState.ArrowBulletPoint) {
            String string = getString(((WelcomePresenter.ViewState.BulletPointState.ArrowBulletPoint) bulletPointState).getStringResId());
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            bulletStepView.setStepInfo(1, string);
            bulletStepView.setIcon(R.drawable.onfido_arrow_forward_white);
            return;
        }
        if (bulletPointState instanceof WelcomePresenter.ViewState.BulletPointState.NumberBulletPoint) {
            WelcomePresenter.ViewState.BulletPointState.NumberBulletPoint numberBulletPoint = (WelcomePresenter.ViewState.BulletPointState.NumberBulletPoint) bulletPointState;
            int index = numberBulletPoint.getIndex();
            String string2 = getString(numberBulletPoint.getStringResId());
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            bulletStepView.setStepInfo(index, string2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderState(OnfidoFragmentBulletedMessageBinding binding, WelcomePresenter.ViewState state) {
        binding.title.setText(getString(state.getTitleResId()));
        binding.subtitle.setText(getString(state.getSubtitleResId()));
        binding.listHeader.setText(getString(state.getListHeaderTitleResId()));
        LinearLayout stepsContainer = binding.stepsContainer;
        Intrinsics.checkNotNullExpressionValue(stepsContainer, "stepsContainer");
        List listJ = y.J(y.o(ViewGroupKt.getChildren(stepsContainer), C21551.INSTANCE));
        LinearLayout stepsContainer2 = binding.stepsContainer;
        Intrinsics.checkNotNullExpressionValue(stepsContainer2, "stepsContainer");
        Iterator it8 = listJ.iterator();
        while (it8.hasNext()) {
            stepsContainer2.removeView((View) it8.next());
        }
        int size = state.getSteps().size() - 1;
        int i = 0;
        for (Object obj2 : state.getSteps()) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            BulletStepView bulletStepView = new BulletStepView(contextRequireContext, null, 0, 6, null);
            renderBulletPointState(bulletStepView, (WelcomePresenter.ViewState.BulletPointState) obj2);
            if (i != size) {
                bulletStepView.hideSeparator(false);
            }
            binding.stepsContainer.addView(bulletStepView);
            i = i2;
        }
        OnfidoButton onfidoButton = binding.next;
        onfidoButton.setText$onfido_capture_sdk_core_release(state.getNextButtonResId());
        onfidoButton.setOnClickListener(new b2(this, 18));
        Context context = onfidoButton.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        onfidoButton.setMaxHeight$onfido_capture_sdk_core_release(ContextUtilsKt.screenHeight(context) / 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderState$lambda$3$lambda$2(WelcomeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        NextActionListener nextActionListener = this$0.getNextActionListener();
        if (nextActionListener != null) {
            nextActionListener.onNext();
        }
    }

    @NotNull
    public final WelcomePresenter.Factory getPresenterFactory$onfido_capture_sdk_core_release() {
        WelcomePresenter.Factory factory = this.presenterFactory;
        if (factory != null) {
            return factory;
        }
        Intrinsics.r("presenterFactory");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.compositeDisposable.d();
    }

    @Override // com.onfido.android.sdk.capture.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        View view = getView();
        if (view == null) {
            return;
        }
        view.setImportantForAccessibility(4);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        View view = getView();
        if (view == null) {
            return;
        }
        view.setImportantForAccessibility(1);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        getPresenter().onStart();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        SdkController companion = SdkController.INSTANCE.getInstance();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        SdkController.getSdkComponent$default(companion, contextRequireContext, null, 2, null).inject$onfido_capture_sdk_core_release(this);
        super.onViewCreated(view, savedInstanceState);
        final OnfidoFragmentBulletedMessageBinding onfidoFragmentBulletedMessageBindingBind = OnfidoFragmentBulletedMessageBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(onfidoFragmentBulletedMessageBindingBind, "bind(...)");
        CompositeDisposable compositeDisposable = this.compositeDisposable;
        Disposable disposableSubscribe = getPresenter().getStateStream().subscribe(new g() { // from class: com.onfido.android.sdk.capture.ui.welcome.WelcomeFragment.onViewCreated.1
            @Override // igm.g
            public final void accept(@NotNull WelcomePresenter.ViewState state) {
                Intrinsics.checkNotNullParameter(state, "state");
                WelcomeFragment.this.renderState(onfidoFragmentBulletedMessageBindingBind, state);
            }
        }, new g() { // from class: com.onfido.android.sdk.capture.ui.welcome.WelcomeFragment.onViewCreated.2
            @Override // igm.g
            public final void accept(@NotNull Throwable throwable) {
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                Timber.INSTANCE.e(throwable, "Failure in state stream", new Object[0]);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        RxExtensionsKt.plusAssign(compositeDisposable, disposableSubscribe);
    }

    public final void setPresenterFactory$onfido_capture_sdk_core_release(@NotNull WelcomePresenter.Factory factory) {
        Intrinsics.checkNotNullParameter(factory, "<set-?>");
        this.presenterFactory = factory;
    }
}
