package ms0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.collection.LruCache;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.OutlineTextView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class b2 extends ConstraintLayout {
    public static final /* synthetic */ int o = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ihm.f f208182b;
    public final LruCache f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LruCache f208183g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final GradientDrawable f208184h;
    public final e8.q i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e8.q f208185j;
    public final e8.q k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e8.q f208186l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e8.q f208187m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e8.q f208188n;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b2(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final ImageView getArrowView() {
        return (ImageView) this.f208186l.f();
    }

    private final ImageView getCircleBackgroundView() {
        return (ImageView) this.k.f();
    }

    private final ImageView getCircleIconView() {
        return (ImageView) this.f208185j.f();
    }

    private final TextView getCircleTextView() {
        return (TextView) this.i.f();
    }

    private final TextView getSubtitleTextView() {
        return (TextView) this.f208188n.f();
    }

    private final OutlineTextView getTitleTextView() {
        return (OutlineTextView) this.f208187m.f();
    }

    public final void setContent(@NotNull y1 circle, Clause clause, Clause clause2, @NotNull z1 type) {
        LruCache lruCache;
        Intrinsics.checkNotNullParameter(circle, "circle");
        Intrinsics.checkNotNullParameter(type, "type");
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iS = kli.a.s(circle.b(), context);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int iS2 = kli.a.s(circle.a(), context2);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        int iK = kli.a.k(context3, type.c());
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        int iK2 = kli.a.k(context4, type.a());
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        int iK3 = kli.a.k(context5, type.b());
        GradientDrawable gradientDrawable = this.f208184h;
        gradientDrawable.setStroke(iK2, iS2);
        gradientDrawable.setColor(iS);
        if (getCircleBackgroundView().getHeight() != iK || getCircleBackgroundView().getWidth() != iK) {
            ImageView circleBackgroundView = getCircleBackgroundView();
            ViewGroup.LayoutParams layoutParams = circleBackgroundView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = iK;
            layoutParams.width = iK;
            circleBackgroundView.setLayoutParams(layoutParams);
        }
        if (getArrowView().getHeight() != iK3) {
            ImageView arrowView = getArrowView();
            ViewGroup.LayoutParams layoutParams2 = arrowView.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams.height = iK3;
            arrowView.setLayoutParams(marginLayoutParams);
        }
        getArrowView().setTranslationY((-iK3) * 0.4f);
        getArrowView().setImageTintList(ColorStateList.valueOf(iS2));
        int i = 8;
        int iK4 = 0;
        if (circle instanceof x1) {
            getCircleTextView().setVisibility(0);
            getCircleIconView().setVisibility(8);
            ty0.c.b(or0.u.k(this).b0(), ((x1) circle).f208483a, getCircleTextView(), null, null, 12);
        } else {
            if (!(circle instanceof w1)) {
                throw new NoWhenBranchMatchedException();
            }
            getCircleTextView().setVisibility(8);
            getCircleIconView().setVisibility(0);
            yv0.b bVar = ((w1) circle).f208475a;
            ResourceImage resourceImage = bVar.f317063a;
            int i2 = a2.f208175a[type.ordinal()];
            if (i2 == 1) {
                lruCache = this.f;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                lruCache = this.f208183g;
            }
            Drawable drawable = (Drawable) lruCache.get(resourceImage);
            if (drawable == null) {
                Context context6 = getContext();
                Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
                int iK5 = kli.a.k(context6, type.c());
                Context context7 = getContext();
                Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
                int iK6 = iK5 - kli.a.k(context7, type.a());
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                yy0.f fVarQ = or0.u.k(this).Q();
                ResourceImage resourceImage2 = bVar.f317063a;
                Context context8 = getContext();
                Intrinsics.checkNotNullExpressionValue(context8, "getContext(...)");
                b79.i iVar = new b79.i(ref$ObjectRef, i);
                yy0.e eVar = yy0.f.Companion;
                fVarQ.c(resourceImage2, context8, iK6, iK6, iVar, null);
                drawable = (Drawable) ref$ObjectRef.f186409a;
                if (drawable != null) {
                    lruCache.put(resourceImage, drawable);
                }
            }
            if (bVar.f317064b) {
                if (type == z1.Marker24) {
                    Context context9 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context9, "getContext(...)");
                    iK4 = kli.a.k(context9, 3.0f);
                } else if (type == z1.Marker40) {
                    Context context10 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context10, "getContext(...)");
                    iK4 = kli.a.k(context10, 5.0f);
                }
            }
            int i3 = iK2 + iK4;
            getCircleIconView().setPadding(i3, i3, i3, i3);
            getCircleIconView().setImageDrawable(drawable);
        }
        kli.a.b(getTitleTextView(), clause, ty0.f.f275450a);
        kli.a.b(getSubtitleTextView(), clause2, ty0.f.f275450a);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b2(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f208182b = v0.a.d("create(...)");
        this.f = new LruCache(10);
        this.f208183g = new LruCache(10);
        this.i = kli.a.J(R$id.mapMarkerView_circleText, this);
        this.f208185j = kli.a.J(R$id.mapMarkerView_icon, this);
        this.k = kli.a.J(R$id.mapMarkerView_circleBackground, this);
        this.f208186l = kli.a.J(R$id.mapMarkerView_bottomArrow, this);
        this.f208187m = kli.a.J(R$id.mapMarkerView_title, this);
        this.f208188n = kli.a.J(R$id.mapMarkerView_subtitle, this);
        View.inflate(context, R$layout.internal_view_map_marker, this);
        setOnClickListener(new ip0.g0(this, 18));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        float[] fArr = new float[8];
        for (int i2 = 0; i2 < 8; i2++) {
            fArr[i2] = 0.0f;
        }
        gradientDrawable.setCornerRadii(fArr);
        this.f208184h = gradientDrawable;
        getCircleBackgroundView().setImageTintMode(PorterDuff.Mode.DST_ATOP);
        getCircleBackgroundView().setImageDrawable(gradientDrawable);
        getTitleTextView().setStrokeWidth(kli.a.B(context, 2.0f));
    }

    public /* synthetic */ b2(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
