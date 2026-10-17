package com.onfido.android.sdk.capture.ui.nfc.scan;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import com.google.android.material.textfield.TextInputEditText;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.common.SdkController;
import com.onfido.android.sdk.capture.databinding.OnfidoFragmentNfcPinEntryBinding;
import com.onfido.android.sdk.capture.internal.service.AnnouncementService;
import com.onfido.android.sdk.capture.ui.nfc.NfcHostViewModel;
import com.onfido.android.sdk.capture.utils.AccessibilityExtensionsKt;
import com.onfido.android.sdk.capture.utils.ContextUtilsKt;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import org.jetbrains.annotations.NotNull;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 02\u00020\u0001:\u00010B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020!H\u0002J\b\u0010#\u001a\u00020!H\u0002J\b\u0010$\u001a\u00020!H\u0002J\b\u0010%\u001a\u00020!H\u0002J\b\u0010&\u001a\u00020!H\u0002J\b\u0010'\u001a\u00020\u0015H\u0002J\b\u0010(\u001a\u00020!H\u0002J\u001a\u0010)\u001a\u00020!2\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\b\u0010.\u001a\u00020!H\u0002J\b\u0010/\u001a\u00020!H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001d\u0010\u000b\u001a\u0004\u0018\u00010\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0016R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0010\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001c\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0010\u001a\u0004\b\u001d\u0010\u001e¨\u00061"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/nfc/scan/NfcPinEntryFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/onfido/android/sdk/capture/databinding/OnfidoFragmentNfcPinEntryBinding;", "announcementService", "Lcom/onfido/android/sdk/capture/internal/service/AnnouncementService;", "getAnnouncementService", "()Lcom/onfido/android/sdk/capture/internal/service/AnnouncementService;", "setAnnouncementService", "(Lcom/onfido/android/sdk/capture/internal/service/AnnouncementService;)V", "attemptsLeft", "", "getAttemptsLeft", "()Ljava/lang/Integer;", "attemptsLeft$delegate", "Lkotlin/Lazy;", "binding", "getBinding", "()Lcom/onfido/android/sdk/capture/databinding/OnfidoFragmentNfcPinEntryBinding;", "isFirstAttempt", "", "()Z", "nfcHostViewModel", "Lcom/onfido/android/sdk/capture/ui/nfc/NfcHostViewModel;", "getNfcHostViewModel", "()Lcom/onfido/android/sdk/capture/ui/nfc/NfcHostViewModel;", "nfcHostViewModel$delegate", "pinLength", "getPinLength", "()I", "pinLength$delegate", "bindContinueButton", "", "bindDescription", "bindEditText", "bindRemainingAttemptsHelper", "bindSkipButton", "bindTitle", "isPinNumberFilled", "onContinueButtonClicked", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "showKeyboard", "updateContinueButtonState", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class NfcPinEntryFragment extends Fragment {
    public static final long KEYBOARD_DELAY_MILLIS = 50;
    private OnfidoFragmentNfcPinEntryBinding _binding;
    public AnnouncementService announcementService;

    /* JADX INFO: renamed from: attemptsLeft$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy attemptsLeft;

    /* JADX INFO: renamed from: nfcHostViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy nfcHostViewModel;

    /* JADX INFO: renamed from: pinLength$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy pinLength;

    @NotNull
    public static final String PIN_LENGTH = "pin_length";

    @NotNull
    public static final String ATTEMPTS_LEFT = "attempts_left";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001d\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/nfc/scan/NfcPinEntryFragment$Companion;", "", "()V", "ATTEMPTS_LEFT", "", "KEYBOARD_DELAY_MILLIS", "", "PIN_LENGTH", "createInstance", "Lcom/onfido/android/sdk/capture/ui/nfc/scan/NfcPinEntryFragment;", "pinLength", "", "attemptsLeft", "(ILjava/lang/Integer;)Lcom/onfido/android/sdk/capture/ui/nfc/scan/NfcPinEntryFragment;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final NfcPinEntryFragment createInstance(int pinLength, Integer attemptsLeft) {
            NfcPinEntryFragment nfcPinEntryFragment = new NfcPinEntryFragment();
            nfcPinEntryFragment.setArguments(BundleKt.bundleOf(new Pair("pin_length", Integer.valueOf(pinLength)), new Pair("attempts_left", attemptsLeft)));
            return nfcPinEntryFragment;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public NfcPinEntryFragment() {
        super(R.layout.onfido_fragment_nfc_pin_entry);
        Lazy lazyC = j.c(k.NONE, new NfcPinEntryFragment$special$$inlined$viewModels$default$1(new NfcPinEntryFragment$nfcHostViewModel$2(this)));
        this.nfcHostViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, o0.f186429a.b(NfcHostViewModel.class), new NfcPinEntryFragment$special$$inlined$viewModels$default$2(lazyC), new NfcPinEntryFragment$special$$inlined$viewModels$default$3(null, lazyC), new NfcPinEntryFragment$special$$inlined$viewModels$default$4(this, lazyC));
        this.pinLength = j.b(new NfcPinEntryFragment$pinLength$2(this));
        this.attemptsLeft = j.b(new NfcPinEntryFragment$attemptsLeft$2(this));
    }

    private final void bindContinueButton() {
        updateContinueButtonState();
        TextInputEditText pinInputEditText = getBinding().pinInputEditText;
        Intrinsics.checkNotNullExpressionValue(pinInputEditText, "pinInputEditText");
        pinInputEditText.addTextChangedListener(new TextWatcher() { // from class: com.onfido.android.sdk.capture.ui.nfc.scan.NfcPinEntryFragment$bindContinueButton$$inlined$addTextChangedListener$default$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s2) {
                this.this$0.updateContinueButtonState();
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence text, int start, int before, int count) {
            }
        });
        getBinding().continueButton.setOnClickListener(new b(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindContinueButton$lambda$3(NfcPinEntryFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onContinueButtonClicked();
    }

    private final void bindDescription() {
        getBinding().description.setText(getString(R.string.onfido_enter_pin_subtitle, Integer.valueOf(getPinLength())));
    }

    private final void bindEditText() {
        getBinding().pinInputEditText.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(getPinLength())});
        getBinding().pinInputEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.onfido.android.sdk.capture.ui.nfc.scan.a
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return NfcPinEntryFragment.bindEditText$lambda$1(this.f50071a, textView, i, keyEvent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean bindEditText$lambda$1(NfcPinEntryFragment this$0, TextView textView, int i, KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i != 6 || !this$0.isPinNumberFilled()) {
            return false;
        }
        this$0.onContinueButtonClicked();
        return true;
    }

    private final void bindRemainingAttemptsHelper() {
        if (isFirstAttempt()) {
            return;
        }
        getBinding().helperLayout.setVisibility(0);
        NfcHostViewModel nfcHostViewModel = getNfcHostViewModel();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        getBinding().helperText.setText(nfcHostViewModel.getPinHelperText(resources, getAttemptsLeft()));
        Integer attemptsLeft = getAttemptsLeft();
        if (attemptsLeft == null || attemptsLeft.intValue() != 1) {
            getBinding().helperIcon.setImageResource(R.drawable.onfido_ic_info_disclaimer_stroke);
            return;
        }
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        int iColorFromAttr = ContextUtilsKt.colorFromAttr(contextRequireContext, R.attr.onfidoColorContentNegative);
        getBinding().helperIcon.setImageResource(R.drawable.onfido_ic_alert);
        getBinding().helperIcon.setImageTintList(ColorStateList.valueOf(iColorFromAttr));
        getBinding().helperText.setTextColor(iColorFromAttr);
    }

    private final void bindSkipButton() {
        TextView btnSkip = getBinding().btnSkip;
        Intrinsics.checkNotNullExpressionValue(btnSkip, "btnSkip");
        btnSkip.setVisibility(getNfcHostViewModel().canSkipPin(getAttemptsLeft()) ? 0 : 8);
        getBinding().btnSkip.setOnClickListener(new b(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindSkipButton$lambda$4(NfcPinEntryFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getNfcHostViewModel().onSkipPinClicked();
    }

    private final void bindTitle() {
        getBinding().title.setText(getString(isFirstAttempt() ? R.string.onfido_enter_pin_title : R.string.onfido_enter_pin_title_incorrect));
        NfcHostViewModel nfcHostViewModel = getNfcHostViewModel();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        String pinHelperText = nfcHostViewModel.getPinHelperText(resources, getAttemptsLeft());
        getBinding().title.setContentDescription(((Object) getBinding().title.getText()) + "\n " + pinHelperText);
    }

    private final Integer getAttemptsLeft() {
        return (Integer) this.attemptsLeft.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OnfidoFragmentNfcPinEntryBinding getBinding() {
        OnfidoFragmentNfcPinEntryBinding onfidoFragmentNfcPinEntryBinding = this._binding;
        Intrinsics.h(onfidoFragmentNfcPinEntryBinding);
        return onfidoFragmentNfcPinEntryBinding;
    }

    private final NfcHostViewModel getNfcHostViewModel() {
        return (NfcHostViewModel) this.nfcHostViewModel.getValue();
    }

    private final int getPinLength() {
        return ((Number) this.pinLength.getValue()).intValue();
    }

    private final boolean isFirstAttempt() {
        return getAttemptsLeft() == null;
    }

    private final boolean isPinNumberFilled() {
        Editable text = getBinding().pinInputEditText.getText();
        return text != null && text.length() == getPinLength();
    }

    private final void onContinueButtonClicked() {
        getNfcHostViewModel().onPinEntered(String.valueOf(getBinding().pinInputEditText.getText()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$0(NfcPinEntryFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        TextView title = this$0.getBinding().title;
        Intrinsics.checkNotNullExpressionValue(title, "title");
        AccessibilityExtensionsKt.sendAccessibilityFocusEvent(title);
    }

    private final void showKeyboard() {
        getBinding().pinInputEditText.requestFocus();
        TextInputEditText pinInputEditText = getBinding().pinInputEditText;
        Intrinsics.checkNotNullExpressionValue(pinInputEditText, "pinInputEditText");
        pinInputEditText.postDelayed(new Runnable() { // from class: com.onfido.android.sdk.capture.ui.nfc.scan.NfcPinEntryFragment$showKeyboard$$inlined$postDelayed$1
            @Override // java.lang.Runnable
            public final void run() {
                Object systemService = this.this$0.requireContext().getSystemService("input_method");
                Intrinsics.i(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                ((InputMethodManager) systemService).showSoftInput(this.this$0.getBinding().pinInputEditText, 1);
            }
        }, 50L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateContinueButtonState() {
        getBinding().continueButton.getAppCompatButton().setEnabled(isPinNumberFilled());
    }

    @NotNull
    public final AnnouncementService getAnnouncementService() {
        AnnouncementService announcementService = this.announcementService;
        if (announcementService != null) {
            return announcementService;
        }
        Intrinsics.r("announcementService");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        SdkController companion = SdkController.INSTANCE.getInstance();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        SdkController.getSdkComponent$default(companion, contextRequireContext, null, 2, null).inject$onfido_capture_sdk_core_release(this);
        super.onViewCreated(view, savedInstanceState);
        this._binding = OnfidoFragmentNfcPinEntryBinding.bind(view);
        bindTitle();
        bindDescription();
        bindEditText();
        bindRemainingAttemptsHelper();
        bindContinueButton();
        bindSkipButton();
        if (getAnnouncementService().isEnabled()) {
            getBinding().getRoot().post(new Runnable() { // from class: com.onfido.android.sdk.capture.ui.nfc.scan.c
                @Override // java.lang.Runnable
                public final void run() {
                    NfcPinEntryFragment.onViewCreated$lambda$0(this.f50074a);
                }
            });
        } else {
            showKeyboard();
        }
    }

    public final void setAnnouncementService(@NotNull AnnouncementService announcementService) {
        Intrinsics.checkNotNullParameter(announcementService, "<set-?>");
        this.announcementService = announcementService;
    }
}
