package tji;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.kompot.R$layout;
import com.revolut.kompot.R$style;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends Dialog implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f271780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f271781b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Activity activity, long j2) {
        super(activity, R$style.LoadingDialog);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f271780a = activity;
        this.f271781b = j2;
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        View decorView;
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            decorView.setSystemUiVisibility(this.f271780a.getWindow().getDecorView().getSystemUiVisibility());
        }
        final View viewInflate = LayoutInflater.from(getContext()).inflate(R$layout.dialog_loading, (ViewGroup) null);
        setContentView(viewInflate);
        setOnShowListener(new DialogInterface.OnShowListener() { // from class: tji.a
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                ObjectAnimator duration = ObjectAnimator.ofFloat(viewInflate, (Property<View, Float>) View.ALPHA, BitmapDescriptorFactory.HUE_RED, 1.0f).setDuration(this.f271781b);
                duration.setInterpolator(new b());
                duration.start();
            }
        });
        setCancelable(false);
    }
}
