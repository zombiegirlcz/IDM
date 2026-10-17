package w01;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import com.google.android.material.snackbar.Snackbar;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public abstract class a {
    public static void a(Snackbar snackbar, Context context, int i) {
        float f = (i & 16) != 0 ? 16.0f : 88.0f;
        Intrinsics.checkNotNullParameter(snackbar, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        ViewGroup.LayoutParams layoutParams = snackbar.getView().getLayoutParams();
        Intrinsics.i(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(kli.a.k(context, 16.0f), kli.a.k(context, 16.0f), kli.a.k(context, 16.0f), kli.a.k(context, f));
        snackbar.getView().setLayoutParams(marginLayoutParams);
        View view = snackbar.getView();
        GradientDrawable gradientDrawableK = v7.k(0);
        gradientDrawableK.setCornerRadius(kli.a.k(context, 4.0f));
        gradientDrawableK.setColor(io0.a.c(context, new Color.Opaque(R$attr.uikit_colorBlack, 0.8f)));
        view.setBackground(gradientDrawableK);
        ViewCompat.setElevation(snackbar.getView(), kli.a.k(context, 6.0f));
    }
}
