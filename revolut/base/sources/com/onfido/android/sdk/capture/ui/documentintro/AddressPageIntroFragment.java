package com.onfido.android.sdk.capture.ui.documentintro;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.internal.util.annotation.InternalOnfidoApi;
import com.onfido.android.sdk.capture.ui.BulletStepView;
import com.onfido.android.sdk.capture.ui.BulletedMessageFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes17.dex */
@InternalOnfidoApi
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u001a\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000e"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/documentintro/AddressPageIntroFragment;", "Lcom/onfido/android/sdk/capture/ui/BulletedMessageFragment;", "()V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AddressPageIntroFragment extends BulletedMessageFragment {
    @Override // com.onfido.android.sdk.capture.ui.BulletedMessageFragment, androidx.fragment.app.Fragment
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        String string = getString(R.string.onfido_doc_intro_address_page_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = getString(R.string.onfido_doc_intro_address_page_subtitle);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        BulletedMessageFragment.setInfo$onfido_capture_sdk_core_release$default(this, "address_page_intro", string, string2, v.k(getString(R.string.onfido_doc_intro_address_page_option_1), getString(R.string.onfido_doc_intro_address_page_option_2)), false, true, null, Integer.valueOf(R.drawable.onfido_address_page_illustration), getString(R.string.onfido_doc_intro_address_page_illustration_accessibility), 80, null);
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getBinding().next.setText(getString(R.string.onfido_doc_intro_address_page_continue_button));
        View childAt = getBinding().stepsContainer.getChildAt(1);
        Intrinsics.i(childAt, "null cannot be cast to non-null type com.onfido.android.sdk.capture.ui.BulletStepView");
        ((BulletStepView) childAt).setIcon(R.drawable.onfido_address_page_option_1);
        View childAt2 = getBinding().stepsContainer.getChildAt(2);
        Intrinsics.i(childAt2, "null cannot be cast to non-null type com.onfido.android.sdk.capture.ui.BulletStepView");
        ((BulletStepView) childAt2).setIcon(R.drawable.onfido_address_page_option_2);
    }
}
