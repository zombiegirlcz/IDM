package t3l;

import android.R;
import android.app.Activity;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.google.android.material.snackbar.Snackbar;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.common.ui.R$id;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class h extends fsi.c implements d {

    @NotNull
    private static final e Companion = new e();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final fsi.b f267826l = new fsi.b("SNACKBAR_DELEGATE_ID");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Activity f267827h;
    public final ty0.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ihm.f f267828j;
    public WeakReference k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Activity activity, ty0.c clauseDisplayer) {
        super(f267826l);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(clauseDisplayer, "clauseDisplayer");
        this.f267827h = activity;
        this.i = clauseDisplayer;
        this.f267828j = v0.a.d("create(...)");
    }

    public final Snackbar N(SpannableStringBuilder spannableStringBuilder, int i) {
        int i2 = R$id.snackbar_container;
        Activity activity = this.f267827h;
        View viewFindViewById = activity.findViewById(i2);
        if (viewFindViewById == null && (viewFindViewById = activity.findViewById(R.id.content)) == null) {
            viewFindViewById = activity.getWindow().getDecorView();
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "getDecorView(...)");
        }
        Snackbar snackbarMake = Snackbar.make(viewFindViewById, spannableStringBuilder, i);
        Intrinsics.checkNotNullExpressionValue(snackbarMake, "make(...)");
        w01.a.a(snackbarMake, activity, 62);
        Snackbar backgroundTint = snackbarMake.setTextColor(kli.a.s(R$attr.uikit_colorBackground, activity)).setBackgroundTint(kli.a.s(R$attr.uikit_colorForeground, activity));
        Intrinsics.checkNotNullExpressionValue(backgroundTint, "setBackgroundTint(...)");
        return backgroundTint;
    }
}
