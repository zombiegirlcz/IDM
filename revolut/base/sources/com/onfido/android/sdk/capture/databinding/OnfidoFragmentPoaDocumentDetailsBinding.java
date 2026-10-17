package com.onfido.android.sdk.capture.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.ui.widget.OnfidoButton;
import com.onfido.android.sdk.capture.ui.widget.ShadowedScrollView;
import com.onfido.android.sdk.capture.ui.widget.WatermarkView;

/* JADX INFO: loaded from: classes17.dex */
public final class OnfidoFragmentPoaDocumentDetailsBinding implements ViewBinding {

    @NonNull
    public final LinearLayout poaButtonsContainer;

    @NonNull
    public final TextView poaCaptureBullet1;

    @NonNull
    public final TextView poaCaptureBullet2;

    @NonNull
    public final TextView poaCaptureBullet3;

    @NonNull
    public final TextView poaCaptureBullet4;

    @NonNull
    public final TextView poaCaptureTv;

    @NonNull
    public final TextView poaDocumentDetailsSubTitle;

    @NonNull
    public final TextView poaDocumentDetailsTitle;

    @NonNull
    public final ImageView poaInfoIcon;

    @NonNull
    public final WatermarkView poaWatermark;

    @NonNull
    private final ShadowedScrollView rootView;

    @NonNull
    public final OnfidoButton takePhotoButton;

    @NonNull
    public final OnfidoButton uploadButton;

    private OnfidoFragmentPoaDocumentDetailsBinding(@NonNull ShadowedScrollView shadowedScrollView, @NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull ImageView imageView, @NonNull WatermarkView watermarkView, @NonNull OnfidoButton onfidoButton, @NonNull OnfidoButton onfidoButton2) {
        this.rootView = shadowedScrollView;
        this.poaButtonsContainer = linearLayout;
        this.poaCaptureBullet1 = textView;
        this.poaCaptureBullet2 = textView2;
        this.poaCaptureBullet3 = textView3;
        this.poaCaptureBullet4 = textView4;
        this.poaCaptureTv = textView5;
        this.poaDocumentDetailsSubTitle = textView6;
        this.poaDocumentDetailsTitle = textView7;
        this.poaInfoIcon = imageView;
        this.poaWatermark = watermarkView;
        this.takePhotoButton = onfidoButton;
        this.uploadButton = onfidoButton2;
    }

    @NonNull
    public static OnfidoFragmentPoaDocumentDetailsBinding bind(@NonNull View view) {
        int i = R.id.poaButtonsContainer;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.poaCaptureBullet1;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.poaCaptureBullet2;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    i = R.id.poaCaptureBullet3;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView3 != null) {
                        i = R.id.poaCaptureBullet4;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView4 != null) {
                            i = R.id.poaCaptureTv;
                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView5 != null) {
                                i = R.id.poaDocumentDetailsSubTitle;
                                TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView6 != null) {
                                    i = R.id.poaDocumentDetailsTitle;
                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView7 != null) {
                                        i = R.id.poaInfoIcon;
                                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                                        if (imageView != null) {
                                            i = R.id.poaWatermark;
                                            WatermarkView watermarkView = (WatermarkView) ViewBindings.findChildViewById(view, i);
                                            if (watermarkView != null) {
                                                i = R.id.takePhotoButton;
                                                OnfidoButton onfidoButton = (OnfidoButton) ViewBindings.findChildViewById(view, i);
                                                if (onfidoButton != null) {
                                                    i = R.id.uploadButton;
                                                    OnfidoButton onfidoButton2 = (OnfidoButton) ViewBindings.findChildViewById(view, i);
                                                    if (onfidoButton2 != null) {
                                                        return new OnfidoFragmentPoaDocumentDetailsBinding((ShadowedScrollView) view, linearLayout, textView, textView2, textView3, textView4, textView5, textView6, textView7, imageView, watermarkView, onfidoButton, onfidoButton2);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OnfidoFragmentPoaDocumentDetailsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OnfidoFragmentPoaDocumentDetailsBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.onfido_fragment_poa_document_details, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ShadowedScrollView getRoot() {
        return this.rootView;
    }
}
