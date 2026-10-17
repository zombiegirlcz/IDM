package com.onfido.android.sdk.capture.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatButton;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.ui.widget.RecyclerView;

/* JADX INFO: loaded from: classes17.dex */
public final class OnfidoFragmentCountrySelectionBinding implements ViewBinding {

    @NonNull
    public final AppCompatButton closeButton;

    @NonNull
    public final RecyclerView countriesList;

    @NonNull
    public final FrameLayout countryPopoverSheetHint;

    @NonNull
    public final TextView description;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final AppCompatButton title;

    private OnfidoFragmentCountrySelectionBinding(@NonNull RelativeLayout relativeLayout, @NonNull AppCompatButton appCompatButton, @NonNull RecyclerView recyclerView, @NonNull FrameLayout frameLayout, @NonNull TextView textView, @NonNull AppCompatButton appCompatButton2) {
        this.rootView = relativeLayout;
        this.closeButton = appCompatButton;
        this.countriesList = recyclerView;
        this.countryPopoverSheetHint = frameLayout;
        this.description = textView;
        this.title = appCompatButton2;
    }

    @NonNull
    public static OnfidoFragmentCountrySelectionBinding bind(@NonNull View view) {
        int i = R.id.close_button;
        AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(view, i);
        if (appCompatButton != null) {
            i = R.id.countriesList;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                i = R.id.country_popover_sheet_hint;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                if (frameLayout != null) {
                    i = R.id.description;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        i = R.id.title;
                        AppCompatButton appCompatButton2 = (AppCompatButton) ViewBindings.findChildViewById(view, i);
                        if (appCompatButton2 != null) {
                            return new OnfidoFragmentCountrySelectionBinding((RelativeLayout) view, appCompatButton, recyclerView, frameLayout, textView, appCompatButton2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OnfidoFragmentCountrySelectionBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OnfidoFragmentCountrySelectionBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.onfido_fragment_country_selection, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
