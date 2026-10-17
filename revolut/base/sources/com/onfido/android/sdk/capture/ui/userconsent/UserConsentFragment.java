package com.onfido.android.sdk.capture.ui.userconsent;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.common.SdkController;
import com.onfido.android.sdk.capture.databinding.OnfidoFragmentUserConsentScreenBinding;
import com.onfido.android.sdk.capture.ui.BaseFragment;
import com.onfido.android.sdk.capture.ui.userconsent.UserConsentViewModel;
import com.onfido.android.sdk.capture.ui.userconsent.htmlutil.TextViewExtensionKt;
import com.onfido.android.sdk.capture.utils.LifecycleAwareDialog;
import com.onfido.android.sdk.capture.utils.LifecycleDisposableKt;
import com.onfido.android.sdk.capture.utils.LoadingFragment;
import com.onfido.android.sdk.capture.utils.UserExitFlowMenuProvider;
import com.onfido.android.sdk.capture.utils.ViewExtensionsKt;
import com.onfido.javax.inject.Provider;
import igm.g;
import io.reactivex.rxjava3.disposables.Disposable;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.cbeff.ISO781611;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 02\u00020\u0001:\u000201B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0002J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020 H\u0016J\u001a\u0010\"\u001a\u00020 2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u0010\u0010'\u001a\u00020 2\u0006\u0010(\u001a\u00020)H\u0002J\u0010\u0010*\u001a\u00020 2\u0006\u0010+\u001a\u00020,H\u0002J\b\u0010-\u001a\u00020 H\u0002J\u0010\u0010.\u001a\u00020 2\u0006\u0010/\u001a\u00020\u001cH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u00168\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u00062"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/userconsent/UserConsentFragment;", "Lcom/onfido/android/sdk/capture/ui/BaseFragment;", "()V", "_binding", "Lcom/onfido/android/sdk/capture/databinding/OnfidoFragmentUserConsentScreenBinding;", "binding", "getBinding", "()Lcom/onfido/android/sdk/capture/databinding/OnfidoFragmentUserConsentScreenBinding;", "lifecycleAwareDialog", "Lcom/onfido/android/sdk/capture/utils/LifecycleAwareDialog;", "userExitFlowMenuProvider", "Lcom/onfido/android/sdk/capture/utils/UserExitFlowMenuProvider;", "getUserExitFlowMenuProvider", "()Lcom/onfido/android/sdk/capture/utils/UserExitFlowMenuProvider;", "userExitFlowMenuProvider$delegate", "Lkotlin/Lazy;", "viewModel", "Lcom/onfido/android/sdk/capture/ui/userconsent/UserConsentViewModel;", "getViewModel", "()Lcom/onfido/android/sdk/capture/ui/userconsent/UserConsentViewModel;", "viewModel$delegate", "viewModelProvider", "Lcom/onfido/javax/inject/Provider;", "getViewModelProvider", "()Lcom/onfido/javax/inject/Provider;", "setViewModelProvider", "(Lcom/onfido/javax/inject/Provider;)V", "isUserConsentBottomVisible", "", "text", "Landroid/text/Editable;", "onDestroyView", "", "onStart", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "renderState", "state", "Lcom/onfido/android/sdk/capture/ui/userconsent/UserConsentViewModel$ViewState;", "sendResult", "userConsentResult", "Lcom/onfido/android/sdk/capture/ui/userconsent/UserConsentFragment$UserConsentResult;", "setDoNotAcceptButtonListener", "updateUserConsentActionButtons", "isEnabled", "Companion", "UserConsentResult", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class UserConsentFragment extends BaseFragment {
    private OnfidoFragmentUserConsentScreenBinding _binding;

    @NotNull
    private final LifecycleAwareDialog lifecycleAwareDialog;

    /* JADX INFO: renamed from: userExitFlowMenuProvider$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy userExitFlowMenuProvider;

    /* JADX INFO: renamed from: viewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;
    public Provider viewModelProvider;

    @NotNull
    private static final String KEY_RESULT = "key_result";

    @NotNull
    private static final String KEY_REQUEST = "key_request";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/userconsent/UserConsentFragment$Companion;", "", "()V", "KEY_REQUEST", "", "KEY_RESULT", "createInstance", "Lcom/onfido/android/sdk/capture/ui/userconsent/UserConsentFragment;", "resultKey", "getUserConsentResult", "Lcom/onfido/android/sdk/capture/ui/userconsent/UserConsentFragment$UserConsentResult;", "bundle", "Landroid/os/Bundle;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final UserConsentFragment createInstance(@NotNull String resultKey) {
            Intrinsics.checkNotNullParameter(resultKey, "resultKey");
            UserConsentFragment userConsentFragment = new UserConsentFragment();
            userConsentFragment.setArguments(BundleKt.bundleOf(new Pair("key_request", resultKey)));
            return userConsentFragment;
        }

        @NotNull
        public final UserConsentResult getUserConsentResult(@NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Parcelable parcelable = bundle.getParcelable("key_result");
            if (parcelable != null) {
                return (UserConsentResult) parcelable;
            }
            throw new IllegalArgumentException("Required value was null.");
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/userconsent/UserConsentFragment$UserConsentResult;", "Landroid/os/Parcelable;", "()V", "ConsentAccepted", "ConsentExit", "ConsentRejected", "Lcom/onfido/android/sdk/capture/ui/userconsent/UserConsentFragment$UserConsentResult$ConsentAccepted;", "Lcom/onfido/android/sdk/capture/ui/userconsent/UserConsentFragment$UserConsentResult$ConsentExit;", "Lcom/onfido/android/sdk/capture/ui/userconsent/UserConsentFragment$UserConsentResult$ConsentRejected;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class UserConsentResult implements Parcelable {

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/userconsent/UserConsentFragment$UserConsentResult$ConsentAccepted;", "Lcom/onfido/android/sdk/capture/ui/userconsent/UserConsentFragment$UserConsentResult;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ConsentAccepted extends UserConsentResult {

            @NotNull
            public static final ConsentAccepted INSTANCE = new ConsentAccepted();

            @NotNull
            public static final Parcelable.Creator<ConsentAccepted> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ConsentAccepted> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final ConsentAccepted createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return ConsentAccepted.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final ConsentAccepted[] newArray(int i) {
                    return new ConsentAccepted[i];
                }
            }

            private ConsentAccepted() {
                super(null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/userconsent/UserConsentFragment$UserConsentResult$ConsentExit;", "Lcom/onfido/android/sdk/capture/ui/userconsent/UserConsentFragment$UserConsentResult;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ConsentExit extends UserConsentResult {

            @NotNull
            public static final ConsentExit INSTANCE = new ConsentExit();

            @NotNull
            public static final Parcelable.Creator<ConsentExit> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ConsentExit> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final ConsentExit createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return ConsentExit.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final ConsentExit[] newArray(int i) {
                    return new ConsentExit[i];
                }
            }

            private ConsentExit() {
                super(null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/userconsent/UserConsentFragment$UserConsentResult$ConsentRejected;", "Lcom/onfido/android/sdk/capture/ui/userconsent/UserConsentFragment$UserConsentResult;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ConsentRejected extends UserConsentResult {

            @NotNull
            public static final ConsentRejected INSTANCE = new ConsentRejected();

            @NotNull
            public static final Parcelable.Creator<ConsentRejected> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ConsentRejected> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final ConsentRejected createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return ConsentRejected.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final ConsentRejected[] newArray(int i) {
                    return new ConsentRejected[i];
                }
            }

            private ConsentRejected() {
                super(null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        private UserConsentResult() {
        }

        public /* synthetic */ UserConsentResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.userconsent.UserConsentFragment$onViewCreated$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass2 extends u implements Function0<Unit> {
        public AnonymousClass2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m3732invoke();
            return Unit.f186387a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m3732invoke() {
            UserConsentFragment.this.updateUserConsentActionButtons(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UserConsentFragment() {
        super(R.layout.onfido_fragment_user_consent_screen);
        this.lifecycleAwareDialog = new LifecycleAwareDialog((Fragment) this, (Function1) null, 2, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        UserConsentFragment$viewModel$2 userConsentFragment$viewModel$2 = new UserConsentFragment$viewModel$2(this);
        Lazy lazyC = j.c(k.NONE, new UserConsentFragment$special$$inlined$viewModels$default$2(new UserConsentFragment$special$$inlined$viewModels$default$1(this)));
        this.viewModel = FragmentViewModelLazyKt.createViewModelLazy(this, o0.f186429a.b(UserConsentViewModel.class), new UserConsentFragment$special$$inlined$viewModels$default$3(lazyC), new UserConsentFragment$special$$inlined$viewModels$default$4(null, lazyC), userConsentFragment$viewModel$2);
        this.userExitFlowMenuProvider = j.b(new UserConsentFragment$userExitFlowMenuProvider$2(this));
    }

    private final OnfidoFragmentUserConsentScreenBinding getBinding() {
        OnfidoFragmentUserConsentScreenBinding onfidoFragmentUserConsentScreenBinding = this._binding;
        Intrinsics.h(onfidoFragmentUserConsentScreenBinding);
        return onfidoFragmentUserConsentScreenBinding;
    }

    private final UserExitFlowMenuProvider getUserExitFlowMenuProvider() {
        return (UserExitFlowMenuProvider) this.userExitFlowMenuProvider.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UserConsentViewModel getViewModel() {
        return (UserConsentViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isUserConsentBottomVisible(Editable text) {
        return (text == null || d0.W(text) || getBinding().userConsentTextView.canScrollVertically(1) || !isResumed()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$0(UserConsentFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getViewModel().onAcceptClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderState(UserConsentViewModel.ViewState state) {
        UserConsentResult userConsentResult;
        OnfidoFragmentUserConsentScreenBinding binding = getBinding();
        if (state.getLoadingState().isLoading()) {
            showLoadingDialog$onfido_capture_sdk_core_release(new LoadingFragment.Companion.DialogMode.Loading(state.getLoadingState().getLoadingReason()));
        } else {
            dismissLoadingDialog$onfido_capture_sdk_core_release();
        }
        String consentPageString = state.getConsentPageString();
        if (consentPageString != null) {
            binding.userConsentTextView.setMovementMethod(LinkMovementMethod.getInstance());
            TextView userConsentTextView = binding.userConsentTextView;
            Intrinsics.checkNotNullExpressionValue(userConsentTextView, "userConsentTextView");
            TextViewExtensionKt.setTextFromHtml(userConsentTextView, consentPageString);
            LinearLayout userConsentFooterContainer = binding.userConsentFooterContainer;
            Intrinsics.checkNotNullExpressionValue(userConsentFooterContainer, "userConsentFooterContainer");
            ViewExtensionsKt.toVisible$default(userConsentFooterContainer, false, 1, null);
        }
        String errorString = state.getErrorString();
        if (errorString != null) {
            LifecycleAwareDialog.show$default(this.lifecycleAwareDialog, (String) null, errorString, 0, (Integer) null, false, (Function1) null, (Function1) null, ISO781611.SMT_TAG, (Object) null);
        }
        for (UserConsentViewModel.UserConsentUIEvent userConsentUIEvent : state.getUiEvents()) {
            if (Intrinsics.f(userConsentUIEvent, UserConsentViewModel.UserConsentUIEvent.ConsentAccepted.INSTANCE)) {
                userConsentResult = UserConsentResult.ConsentAccepted.INSTANCE;
            } else if (Intrinsics.f(userConsentUIEvent, UserConsentViewModel.UserConsentUIEvent.ConsentRejected.INSTANCE)) {
                userConsentResult = UserConsentResult.ConsentRejected.INSTANCE;
            } else if (Intrinsics.f(userConsentUIEvent, UserConsentViewModel.UserConsentUIEvent.ConsentExit.INSTANCE)) {
                userConsentResult = UserConsentResult.ConsentExit.INSTANCE;
            } else {
                getViewModel().consumeUIEvent(userConsentUIEvent);
            }
            sendResult(userConsentResult);
            getViewModel().consumeUIEvent(userConsentUIEvent);
        }
        if (state.getShowExitFlow()) {
            requireActivity().removeMenuProvider(getUserExitFlowMenuProvider());
            requireActivity().addMenuProvider(getUserExitFlowMenuProvider(), getViewLifecycleOwner());
        }
    }

    private final void sendResult(UserConsentResult userConsentResult) {
        String string = requireArguments().getString("key_request");
        if (string == null) {
            throw new IllegalArgumentException("key_request == null");
        }
        Intrinsics.checkNotNullExpressionValue(string, "requireNotNull(...)");
        getParentFragmentManager().setFragmentResult(string, BundleKt.bundleOf(new Pair("key_result", userConsentResult)));
    }

    private final void setDoNotAcceptButtonListener() {
        getBinding().userConsentDoNotAcceptButton.setOnClickListener(new a(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setDoNotAcceptButtonListener$lambda$2(UserConsentFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        LifecycleAwareDialog lifecycleAwareDialog = this$0.lifecycleAwareDialog;
        int i = R.string.onfido_user_consent_prompt_no_consent_title;
        LifecycleAwareDialog.show$default(lifecycleAwareDialog, Integer.valueOf(i), R.string.onfido_user_consent_prompt_no_consent_detail, R.string.onfido_user_consent_prompt_button_secondary, Integer.valueOf(R.string.onfido_user_consent_prompt_button_primary), false, (Function1) new UserConsentFragment$setDoNotAcceptButtonListener$1$1(this$0), (Function1) UserConsentFragment$setDoNotAcceptButtonListener$1$2.INSTANCE, 16, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateUserConsentActionButtons(boolean isEnabled) {
        getBinding().userConsentAcceptButton.setEnabled(isEnabled);
        getBinding().userConsentDoNotAcceptButton.setEnabled(isEnabled);
    }

    @NotNull
    public final Provider getViewModelProvider() {
        Provider provider = this.viewModelProvider;
        if (provider != null) {
            return provider;
        }
        Intrinsics.r("viewModelProvider");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this._binding = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        getViewModel().onStart();
        Disposable disposableSubscribe = getViewModel().getState().subscribe(new g() { // from class: com.onfido.android.sdk.capture.ui.userconsent.UserConsentFragment.onStart.1
            @Override // igm.g
            public final void accept(@NotNull UserConsentViewModel.ViewState p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                UserConsentFragment.this.renderState(p0);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        LifecycleDisposableKt.disposeOnStop(disposableSubscribe, viewLifecycleOwner);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        SdkController companion = SdkController.INSTANCE.getInstance();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        SdkController.getSdkComponent$default(companion, contextRequireContext, null, 2, null).inject$onfido_capture_sdk_core_release(this);
        super.onViewCreated(view, savedInstanceState);
        this._binding = OnfidoFragmentUserConsentScreenBinding.bind(view);
        LinearLayout userConsentFooterContainer = getBinding().userConsentFooterContainer;
        Intrinsics.checkNotNullExpressionValue(userConsentFooterContainer, "userConsentFooterContainer");
        ViewExtensionsKt.toGone$default(userConsentFooterContainer, false, 1, null);
        getBinding().userConsentAcceptButton.setOnClickListener(new a(this, 0));
        updateUserConsentActionButtons(false);
        getBinding().userConsentScrollView.setBottomScrollListener(new AnonymousClass2());
        TextView userConsentTextView = getBinding().userConsentTextView;
        Intrinsics.checkNotNullExpressionValue(userConsentTextView, "userConsentTextView");
        userConsentTextView.addTextChangedListener(new TextWatcher() { // from class: com.onfido.android.sdk.capture.ui.userconsent.UserConsentFragment$onViewCreated$$inlined$doAfterTextChanged$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s2) {
                if (this.this$0.isUserConsentBottomVisible(s2)) {
                    this.this$0.updateUserConsentActionButtons(true);
                }
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence text, int start, int before, int count) {
            }
        });
        setDoNotAcceptButtonListener();
    }

    public final void setViewModelProvider(@NotNull Provider provider) {
        Intrinsics.checkNotNullParameter(provider, "<set-?>");
        this.viewModelProvider = provider;
    }
}
