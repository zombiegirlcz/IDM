package com.onfido.android.sdk.capture.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.view.facealignment.FaceAlignmentFrameView;
import com.onfido.android.sdk.capture.ui.widget.WatermarkView;

/* JADX INFO: loaded from: classes17.dex */
public final class OnfidoAvcViewFaceAlignmentBinding implements ViewBinding {

    @NonNull
    public final FaceAlignmentFrameView faceAlignmentViewFrameView;

    @NonNull
    public final TextView faceAlignmentViewInstruction;

    @NonNull
    private final View rootView;

    @NonNull
    public final WatermarkView watermark;

    private OnfidoAvcViewFaceAlignmentBinding(@NonNull View view, @NonNull FaceAlignmentFrameView faceAlignmentFrameView, @NonNull TextView textView, @NonNull WatermarkView watermarkView) {
        this.rootView = view;
        this.faceAlignmentViewFrameView = faceAlignmentFrameView;
        this.faceAlignmentViewInstruction = textView;
        this.watermark = watermarkView;
    }

    @NonNull
    public static OnfidoAvcViewFaceAlignmentBinding bind(@NonNull View view) {
        int i = R.id.faceAlignmentViewFrameView;
        FaceAlignmentFrameView faceAlignmentFrameView = (FaceAlignmentFrameView) ViewBindings.findChildViewById(view, i);
        if (faceAlignmentFrameView != null) {
            i = R.id.faceAlignmentViewInstruction;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.watermark;
                WatermarkView watermarkView = (WatermarkView) ViewBindings.findChildViewById(view, i);
                if (watermarkView != null) {
                    return new OnfidoAvcViewFaceAlignmentBinding(view, faceAlignmentFrameView, textView, watermarkView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OnfidoAvcViewFaceAlignmentBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.onfido_avc_view_face_alignment, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
