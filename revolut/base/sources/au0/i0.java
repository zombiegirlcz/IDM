package au0;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.shimmer.ShimmerConstraintLayout;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.SimpleLimitProgressBarWithText;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class i0 extends ShimmerConstraintLayout {
    public final e8.q k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e8.q f9228l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e8.q f9229m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f9230n;
    public final int o;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i0(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final View getHeaderLoadingImage() {
        return this.k.f();
    }

    private final TextView getHeaderLoadingTitle() {
        return (TextView) this.f9228l.f();
    }

    private final SimpleLimitProgressBarWithText getHeaderSimpleLimitProgressBarWithText() {
        return (SimpleLimitProgressBarWithText) this.f9229m.f();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n0(au0.g0 r14) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: au0.i0.n0(au0.g0):void");
    }

    public final void o0(int i) {
        View headerLoadingImage = getHeaderLoadingImage();
        ViewGroup.LayoutParams layoutParams = headerLoadingImage.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.width = i;
        marginLayoutParams.height = i;
        headerLoadingImage.setLayoutParams(marginLayoutParams);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        this.k = kli.a.J(R$id.headerBottomSheetLoading_image, this);
        this.f9228l = kli.a.J(R$id.headerBottomSheetLoading_title, this);
        this.f9229m = kli.a.J(R$id.headerBottomSheetLoading_progress, this);
        this.f9230n = kli.a.k(context, 16.0f);
        this.o = kli.a.k(context, 12.0f);
        View.inflate(context, R$layout.internal_view_header_bottom_sheet_loading, this);
    }
}
