package bqi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AlertDialog;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit_core.displayers.image.models.LottieImage;
import com.revolut.core_ui_custom_font.TypefaceTextView;
import com.revolut.retail.common.ui.R$id;
import com.revolut.retail.common.ui.R$layout;
import com.revolut.uicomponent.transactions.CircleProgressBar;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yy0.f;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends fsi.c implements d {

    @NotNull
    public static final b Companion = new b();
    public static final fsi.b k = new fsi.b("PROGRESS_DIALOG_DELEGATE_ID");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Context f17841h;
    public final f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public AlertDialog f17842j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, f imageDisplayer) {
        super(k);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imageDisplayer, "imageDisplayer");
        this.f17841h = context;
        this.i = imageDisplayer;
    }

    public final void N(String str, String str2, LottieImage lottieImage, Float f, boolean z) {
        View viewInflate;
        AlertDialog alertDialog = this.f17842j;
        Context context = this.f17841h;
        if (alertDialog == null || (viewInflate = alertDialog.findViewById(R$id.dialogRoot)) == null) {
            viewInflate = LayoutInflater.from(context).inflate(R$layout.layout_progress_dialog, (ViewGroup) null);
        }
        if (this.f17842j == null) {
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setView(viewInflate);
            this.f17842j = builder.show();
        }
        AlertDialog alertDialog2 = this.f17842j;
        if (alertDialog2 != null) {
            alertDialog2.setCancelable(z);
        }
        AlertDialog alertDialog3 = this.f17842j;
        if (alertDialog3 != null) {
            alertDialog3.setOnDismissListener(new a(this, 0));
        }
        Intrinsics.h(viewInflate);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) viewInflate.findViewById(R$id.lottieView);
        TypefaceTextView typefaceTextView = (TypefaceTextView) viewInflate.findViewById(R$id.circleProgressTitle);
        TypefaceTextView typefaceTextView2 = (TypefaceTextView) viewInflate.findViewById(R$id.circleProgressSubtitle);
        CircleProgressBar circleProgressBar = (CircleProgressBar) viewInflate.findViewById(R$id.circleProgressBar);
        TypefaceTextView typefaceTextView3 = (TypefaceTextView) viewInflate.findViewById(R$id.circleProgressText);
        lottieAnimationView.cancelAnimation();
        if (lottieImage != null) {
            f.e(this.i, lottieImage, lottieAnimationView, null, new bc1.a(lottieImage, lottieAnimationView, 20), 4);
        } else {
            lottieAnimationView.setImageDrawable(null);
        }
        typefaceTextView.setText(str);
        if (str2 != null) {
            typefaceTextView2.setVisibility(0);
            typefaceTextView2.setText(str2);
        } else {
            typefaceTextView2.setVisibility(8);
        }
        if (f == null) {
            circleProgressBar.setVisibility(4);
            typefaceTextView3.setVisibility(4);
            return;
        }
        if (f.floatValue() < BitmapDescriptorFactory.HUE_RED || f.floatValue() > 1.0f) {
            throw new IllegalArgumentException("Progress should be between 0 and 1");
        }
        float fFloatValue = f.floatValue() * 100;
        circleProgressBar.setVisibility(0);
        typefaceTextView3.setVisibility(0);
        circleProgressBar.setProgressWithAnimation(fFloatValue, 300L);
        typefaceTextView3.setText(((int) fFloatValue) + "%");
    }
}
