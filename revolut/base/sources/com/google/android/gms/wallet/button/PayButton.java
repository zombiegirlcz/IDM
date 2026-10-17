package com.google.android.gms.wallet.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.wallet.R;
import com.google.android.gms.wallet.button.ButtonOptions;

/* JADX INFO: loaded from: classes16.dex */
public final class PayButton extends FrameLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private View.OnClickListener f48957zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private ButtonOptions.Builder f48958zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private View f48959zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final zzf f48960zzd;

    public PayButton(@NonNull Context context) {
        this(context, null);
    }

    public void initialize(@NonNull ButtonOptions buttonOptions) {
        Drawable rippleDrawable;
        ButtonOptions.Builder builder = this.f48958zzb;
        if (buttonOptions.getButtonType() != 0) {
            ButtonOptions.this.f48951zza = buttonOptions.getButtonType();
        }
        if (buttonOptions.getButtonTheme() != 0) {
            ButtonOptions.this.f48952zzb = buttonOptions.getButtonTheme();
        }
        if (buttonOptions.f48955zze) {
            builder.setCornerRadius(buttonOptions.getCornerRadius());
        }
        if (buttonOptions.getAllowedPaymentMethods() != null) {
            ButtonOptions.this.f48954zzd = buttonOptions.getAllowedPaymentMethods();
        }
        removeAllViews();
        ButtonOptions buttonOptionsBuild = this.f48958zzb.build();
        if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(getContext(), 232100000) == 0) {
            if (TextUtils.isEmpty(buttonOptionsBuild.getAllowedPaymentMethods())) {
                return;
            }
            View viewZza = zzf.zza((Context) Preconditions.checkNotNull(getContext()), buttonOptionsBuild);
            this.f48959zzc = viewZza;
            if (viewZza == null) {
                return;
            }
            addView(viewZza);
            this.f48959zzc.setOnClickListener(this);
            return;
        }
        zzg zzgVar = new zzg(new ContextThemeWrapper(getContext(), buttonOptionsBuild.getButtonTheme() == 2 ? R.style.PayButtonGenericLightTheme : R.style.PayButtonGenericDarkTheme), null);
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(zzgVar.getContext()).inflate(R.layout.paybutton_generic, (ViewGroup) zzgVar, true).findViewById(R.id.pay_button_view);
        Context context = zzgVar.getContext();
        int cornerRadius = buttonOptionsBuild.getCornerRadius();
        GradientDrawable gradientDrawable = (GradientDrawable) zzh.zza(context, R.attr.payButtonGenericBackground).mutate();
        float f = cornerRadius;
        gradientDrawable.setCornerRadius(f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new TypedValue().data, new int[]{R.attr.payButtonGenericRippleColor});
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(color);
        if (PlatformVersion.isAtLeastLollipop()) {
            rippleDrawable = new RippleDrawable(colorStateListValueOf, gradientDrawable, null);
        } else {
            GradientDrawable gradientDrawable2 = (GradientDrawable) zzh.zza(context, R.attr.payButtonGenericRippleMask).mutate();
            gradientDrawable2.setCornerRadius(f);
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, gradientDrawable2});
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, layerDrawable);
            stateListDrawable.addState(new int[0], gradientDrawable);
            rippleDrawable = stateListDrawable;
        }
        linearLayout.setBackground(rippleDrawable);
        zzgVar.setContentDescription(zzgVar.getContext().getString(R.string.gpay_logo_description));
        this.f48959zzc = zzgVar;
        addView(zzgVar);
        this.f48959zzc.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@NonNull View view) {
        View.OnClickListener onClickListener = this.f48957zza;
        if (onClickListener == null || view != this.f48959zzc) {
            return;
        }
        onClickListener.onClick(this);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f48957zza = onClickListener;
    }

    public PayButton(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PayButton(@NonNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ButtonOptions.Builder builderNewBuilder = ButtonOptions.newBuilder();
        this.f48958zzb = builderNewBuilder;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.PayButtonAttributes);
        int i2 = typedArrayObtainStyledAttributes.getInt(R.styleable.PayButtonAttributes_buttonTheme, 1);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.PayButtonAttributes_cornerRadius, (int) TypedValue.applyDimension(1, 100.0f, Resources.getSystem().getDisplayMetrics()));
        ButtonOptions buttonOptions = ButtonOptions.this;
        buttonOptions.f48952zzb = i2;
        buttonOptions.f48953zzc = dimensionPixelSize;
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.PayButtonAttributes_cornerRadius)) {
            ButtonOptions.this.f48955zze = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        builderNewBuilder.setButtonType(1);
        this.f48960zzd = new zzf();
    }
}
