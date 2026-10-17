package au0;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.Group;
import com.facebook.shimmer.ShimmerConstraintLayout;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.framelayout.UIKitFrameLayout;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class u1 extends UIKitFrameLayout {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ShimmerConstraintLayout f9381h;
    public final Group i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Group f9382j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public tx0.q2 f9383l;

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u1(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void c() {
        tx0.q2 q2Var = this.f9383l;
        if (q2Var instanceof tx0.o2) {
            setPadding(getPaddingLeft(), 0, getPaddingRight(), 0);
            aw0.d0 d0Var = ((tx0.o2) q2Var).f275217a;
            ut0.a aVar = ut0.a.ADJUST_HEIGHT;
            Context context = this.f9381h.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            setAspectRatio(new nt0.c(d0Var, aVar, tx0.d5.b(context)));
            return;
        }
        if (!(q2Var instanceof tx0.p2)) {
            throw new NoWhenBranchMatchedException();
        }
        int i = this.k;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int iK = kli.a.k(context2, 56.0f) + i;
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        setPadding(getPaddingLeft(), iK, getPaddingRight(), kli.a.k(context3, 18.0f));
        setAspectRatio(null);
    }

    public final void setHeightMode(@NotNull tx0.q2 heightMode) {
        Intrinsics.checkNotNullParameter(heightMode, "heightMode");
        if (Intrinsics.f(this.f9383l, heightMode)) {
            return;
        }
        this.f9383l = heightMode;
        c();
    }

    public final void setTopInset(int i) {
        if (this.k == i) {
            return;
        }
        this.k = i;
        c();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, R$layout.internal_view_header_with_big_tile_loading, this);
        setId(R$id.internal_headerWithBigTileLoading);
        setBackgroundColor(kli.a.s(R$attr.uikit_colorShimmerPhotoHeader, context));
        setReadableAreaGuidelinesEnabled(true);
        this.f9381h = (ShimmerConstraintLayout) findViewById(R$id.headerWithBigTileLoading_shimmer);
        this.i = (Group) findViewById(R$id.headerWithBigTileLoading_centeredGroup);
        this.f9382j = (Group) findViewById(R$id.headerWithBigTileLoading_centeredWithIconGroup);
        this.f9383l = new tx0.o2(0);
        c();
    }
}
