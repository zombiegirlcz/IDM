package com.revolut.core.ui_kit.internal.views;

import a82.r;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import au0.b5;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.R$styleable;
import com.revolut.core.ui_kit.internal.drawables.RoundedBackgroundDrawable;
import com.revolut.core.ui_kit.internal.views.tag.TagView;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.internal.views.videoplayer.UiKitPlayerView;
import com.revolut.core.ui_kit_resources.R$attr;
import efm.d0;
import ix0.c0;
import ix0.h2;
import jv0.s;
import kl.b0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import ms0.b3;
import ms0.e3;
import ms0.g3;
import ms0.h3;
import ms0.i3;
import ms0.j0;
import ms0.j2;
import ms0.j3;
import ms0.l2;
import ms0.m2;
import ms0.o2;
import ms0.p2;
import ms0.q2;
import ms0.r2;
import ms0.s2;
import ms0.t2;
import mx0.d2;
import org.jetbrains.annotations.NotNull;
import te0.w;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u0000 \u001d2\u00020\u00012\u00020\u0002:\n\u001e\u001f\u0010 \u0003!\"#\u0015$J!\u0010\n\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006%"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/ProductIntroView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lms0/j2;", "Lms0/t2;", "model", "", "restartFinishedIntro", "", "setModel$ui_kit_components_release", "(Lms0/t2;Z)V", "setModel", "Ljv0/s;", "behavior", "setVideoPlayerDetachBehaviour$ui_kit_components_release", "(Ljv0/s;)V", "setVideoPlayerDetachBehaviour", "Lms0/m2;", "behaviour", "setInterruptionBehaviour$ui_kit_components_release", "(Lms0/m2;)V", "setInterruptionBehaviour", "Lms0/l2;", "b", "Lms0/l2;", "getErrorStateBehaviour", "()Lms0/l2;", "setErrorStateBehaviour", "(Lms0/l2;)V", "errorStateBehaviour", "Companion", "ms0/u2", "ms0/b3", "ms0/h3", "lal/a", "ms0/i3", "kl/b0", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ProductIntroView extends ConstraintLayout implements j2 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public final b3 A;
    public ValueAnimator B;
    public final i3 C;
    public final float D;
    public final int E;
    public boolean F;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public l2 errorStateBehaviour;
    public m2 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f56300g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ConstraintLayout f56301h;
    public final ShimmerFrameLayout i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LinearLayout f56302j;
    public final TextView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TextView f56303l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final UiKitPlayerView f56304m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final View f56305n;
    public final View o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TagView f56306p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final TextView f56307q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TextView f56308r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ProgressPagingIndicatorView f56309s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public lal.a f56310t;
    public lal.a u;
    public final s2 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public h3 f56311w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ihm.b f56312x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ihm.f f56313y;
    public final ihm.f z;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.internal.views.ProductIntroView$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProductIntroView(@NotNull Context context) {
        this(context, null, 0, null, 14);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ void setModel$ui_kit_components_release$default(ProductIntroView productIntroView, t2 t2Var, boolean z, int i, Object obj2) throws Throwable {
        if ((i & 2) != 0) {
            z = false;
        }
        productIntroView.setModel$ui_kit_components_release(t2Var, z);
    }

    public final void d0(int i) {
        t2 t2VarN = this.f56311w.n();
        o2 o2Var = t2VarN instanceof o2 ? (o2) t2VarN : null;
        if ((o2Var != null ? o2Var.d : null) == d2.FULLSCREEN_VIDEO_DARK) {
            i = 0;
        }
        if (i == this.f56300g) {
            return;
        }
        this.f56300g = i;
        setPadding(getPaddingLeft(), i, getPaddingRight(), getPaddingBottom());
    }

    public final void f0(g3 g3Var) {
        r2 r2Var = g3Var.f208261b;
        TagViewData tagViewData = r2Var.d;
        TagView tagView = this.f56306p;
        if (tagViewData != null) {
            tagView.setContent(tagViewData);
        } else {
            tagView.setContent(new TagViewData(null, null, new TagViewData.TagBackground.Solid(new Color.Solid(R$attr.uikit_colorTransparent)), null, new TagViewData.TagOutline.Solid(R$attr.uikit_colorTransparent), false, null, null, null, 0, null, 2024));
        }
        TextView title = this.f56307q;
        Intrinsics.checkNotNullExpressionValue(title, "title");
        kli.a.b(title, r2Var.f208393a, ty0.f.f275450a);
        TextView subtitle = this.f56308r;
        Intrinsics.checkNotNullExpressionValue(subtitle, "subtitle");
        kli.a.e(subtitle, r2Var.f208394b, new mm7.h(1, this.z, ihm.f.class, "onNext", "onNext(Ljava/lang/Object;)V", 0, 15), null, 0, 12);
    }

    public final void g0(int i, int i2) {
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this);
        constraintSet.connect(i, 3, i2, 3);
        constraintSet.connect(i, 4, i2, 4);
        constraintSet.connect(i, 6, i2, 6);
        constraintSet.connect(i, 7, i2, 7);
        constraintSet.applyTo(this);
    }

    @NotNull
    public final l2 getErrorStateBehaviour() {
        return this.errorStateBehaviour;
    }

    public final rfm.l h0(d0 d0Var, long j2) {
        rfm.l lVarD = d0Var.f(Object.class).d(w.a0(this.f56304m.f57715r, new mqg.b(19)).startWith(Boolean.TRUE).distinctUntilChanged().switchMap(new j0(new r(j2, 26), 4)).doOnNext(new j0(new r(j2, 27), 5)).singleOrError());
        Intrinsics.checkNotNullExpressionValue(lVarD, "ambWith(...)");
        return lVarD;
    }

    public final lal.a i0(s2 s2Var, h3 h3Var) {
        boolean zI;
        boolean z;
        h2 h2Var;
        h2 h2Var2;
        char c2;
        int i;
        int i2 = j3.f208299a[s2Var.ordinal()];
        TextView subtitle = this.f56308r;
        TextView title = this.f56307q;
        TagView badge = this.f56306p;
        View textPlaceholder = this.o;
        UiKitPlayerView videoPlayer = this.f56304m;
        View videoPlaceholder = this.f56305n;
        TextView tryAgainButton = this.f56303l;
        TextView errorTitle = this.k;
        LinearLayout errorState = this.f56302j;
        ConstraintLayout shimmeringView = this.f56301h;
        ProgressPagingIndicatorView pageIndicator = this.f56309s;
        if (i2 == 1) {
            lal.a aVar = this.f56310t;
            if (aVar != null) {
                return aVar;
            }
            Intrinsics.checkNotNullExpressionValue(pageIndicator, "pageIndicator");
            h2 h2Var3 = new h2(pageIndicator);
            Intrinsics.checkNotNullExpressionValue(shimmeringView, "shimmeringView");
            h2 h2Var4 = new h2(shimmeringView);
            Intrinsics.checkNotNullExpressionValue(errorState, "errorState");
            Intrinsics.checkNotNullExpressionValue(errorTitle, "errorTitle");
            Intrinsics.checkNotNullExpressionValue(tryAgainButton, "tryAgainButton");
            h2 h2Var5 = new h2(errorState, errorTitle, tryAgainButton);
            Intrinsics.checkNotNullExpressionValue(videoPlaceholder, "videoPlaceholder");
            Intrinsics.checkNotNullExpressionValue(videoPlayer, "videoPlayer");
            Intrinsics.checkNotNullExpressionValue(textPlaceholder, "textPlaceholder");
            Intrinsics.checkNotNullExpressionValue(badge, "badge");
            Intrinsics.checkNotNullExpressionValue(title, "title");
            Intrinsics.checkNotNullExpressionValue(subtitle, "subtitle");
            lal.a aVar2 = new lal.a(h2Var3, h2Var4, new h2(videoPlaceholder, videoPlayer, textPlaceholder, badge, title, subtitle), h2Var5);
            this.f56310t = aVar2;
            return aVar2;
        }
        if (i2 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        t2 t2VarN = h3Var.n();
        if (t2VarN instanceof o2) {
            o2 o2Var = (o2) t2VarN;
            zI = o2Var.f208353c && o2Var.f208351a.size() > 1;
        } else if (t2VarN instanceof p2) {
            lal.a aVar3 = this.u;
            View[] viewArr = aVar3 != null ? ((h2) aVar3.f193426b).f169242a : null;
            if (viewArr == null) {
                viewArr = new View[0];
            }
            zI = kotlin.collections.d.I(viewArr, pageIndicator);
        } else {
            if (!(t2VarN instanceof q2) && t2VarN != null) {
                throw new NoWhenBranchMatchedException();
            }
        }
        if (zI) {
            z = zI;
            h2Var = new h2(new View[0]);
        } else {
            z = zI;
            Intrinsics.checkNotNullExpressionValue(pageIndicator, "pageIndicator");
            h2Var = new h2(pageIndicator);
        }
        if (z) {
            Intrinsics.checkNotNullExpressionValue(videoPlaceholder, "videoPlaceholder");
            Intrinsics.checkNotNullExpressionValue(videoPlayer, "videoPlayer");
            Intrinsics.checkNotNullExpressionValue(textPlaceholder, "textPlaceholder");
            Intrinsics.checkNotNullExpressionValue(badge, "badge");
            Intrinsics.checkNotNullExpressionValue(title, "title");
            Intrinsics.checkNotNullExpressionValue(subtitle, "subtitle");
            Intrinsics.checkNotNullExpressionValue(pageIndicator, "pageIndicator");
            h2Var2 = new h2(videoPlaceholder, videoPlayer, textPlaceholder, badge, title, subtitle, pageIndicator);
            i = 1;
            c2 = 0;
        } else {
            Intrinsics.checkNotNullExpressionValue(videoPlaceholder, "videoPlaceholder");
            Intrinsics.checkNotNullExpressionValue(videoPlayer, "videoPlayer");
            Intrinsics.checkNotNullExpressionValue(textPlaceholder, "textPlaceholder");
            Intrinsics.checkNotNullExpressionValue(badge, "badge");
            Intrinsics.checkNotNullExpressionValue(title, "title");
            Intrinsics.checkNotNullExpressionValue(subtitle, "subtitle");
            c2 = 0;
            i = 1;
            h2Var2 = new h2(videoPlaceholder, videoPlayer, textPlaceholder, badge, title, subtitle);
        }
        Intrinsics.checkNotNullExpressionValue(shimmeringView, "shimmeringView");
        View[] viewArr2 = new View[i];
        viewArr2[c2] = shimmeringView;
        h2 h2Var6 = new h2(viewArr2);
        Intrinsics.checkNotNullExpressionValue(errorState, "errorState");
        Intrinsics.checkNotNullExpressionValue(errorTitle, "errorTitle");
        Intrinsics.checkNotNullExpressionValue(tryAgainButton, "tryAgainButton");
        View[] viewArr3 = new View[3];
        viewArr3[c2] = errorState;
        viewArr3[i] = errorTitle;
        viewArr3[2] = tryAgainButton;
        lal.a aVar4 = new lal.a(h2Var, h2Var6, h2Var2, new h2(viewArr3));
        this.u = aVar4;
        return aVar4;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j0(ms0.h3 r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1145
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.internal.views.ProductIntroView.j0(ms0.h3):void");
    }

    public final ufm.n l0() {
        d0 d0VarFirstOrError = this.f56304m.f57715r.doOnNext(new j0(new mqg.b(17), 3)).filter(new j0(new mqg.b(16), 2)).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        return o70.a.i(h0(d0VarFirstOrError, 5000L));
    }

    public final void m0(boolean z) {
        float f = this.D;
        ValueAnimator valueAnimatorOfFloat = z ? ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, f) : ValueAnimator.ofFloat(f, BitmapDescriptorFactory.HUE_RED);
        this.B = valueAnimatorOfFloat;
        if (valueAnimatorOfFloat != null) {
            valueAnimatorOfFloat.setDuration(600L);
        }
        ValueAnimator valueAnimator = this.B;
        if (valueAnimator != null) {
            valueAnimator.setInterpolator(rr0.k.f256628a);
        }
        ValueAnimator valueAnimator2 = this.B;
        if (valueAnimator2 != null) {
            valueAnimator2.addUpdateListener(new b5(this, 25));
        }
        ValueAnimator valueAnimator3 = this.B;
        if (valueAnimator3 != null) {
            valueAnimator3.start();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.B;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.B = null;
        i3 i3Var = this.C;
        ValueAnimator valueAnimator2 = i3Var.f208281b;
        if (valueAnimator2 != null) {
            valueAnimator2.end();
        }
        i3Var.f208281b = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        i3 i3Var = this.C;
        UiKitPlayerView uiKitPlayerView = i3Var.f208287m;
        Paint paint = i3Var.f208284h;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Bitmap bitmap = i3Var.i;
        if (bitmap != null) {
            d2 d2VarA = i3Var.a();
            d2 d2Var = d2.NORMAL;
            paint.setAlpha(d2VarA == d2Var ? 255 : rim.d.c((1.0f - i3Var.f) * 255));
            canvas.drawBitmap(bitmap, uiKitPlayerView.getLeft() + (i3Var.a() == d2Var ? i3Var.b(false) : BitmapDescriptorFactory.HUE_RED), uiKitPlayerView.getTop(), paint);
        }
        Bitmap bitmap2 = i3Var.f208285j;
        if (bitmap2 != null) {
            if (!i3Var.d && !i3Var.f208282c) {
                bitmap2 = null;
            }
            if (bitmap2 != null) {
                paint.setAlpha(rim.d.c((1.0f - i3Var.f) * 255));
                canvas.drawBitmap(bitmap2, ((-i3Var.f208286l) * i3Var.e) + 0 + 0, i3Var.o.getTop(), paint);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i5) {
        super.onLayout(z, i, i2, i3, i5);
        int i6 = i5 - i2;
        int i21 = this.E + this.f56300g;
        int i22 = -(i6 < i21 ? (i21 - i6) / 2 : 0);
        this.f56305n.offsetTopAndBottom(i22);
        this.o.offsetTopAndBottom(i22);
        this.f56306p.offsetTopAndBottom(i22);
        this.f56307q.offsetTopAndBottom(i22);
        this.f56308r.offsetTopAndBottom(i22);
        this.f56309s.offsetTopAndBottom(i22);
    }

    @Override // ms0.j2
    public final void pause() {
        this.F = true;
        this.f56304m.h();
    }

    @Override // ms0.j2
    public final void resume() {
        this.F = false;
        this.f56304m.i();
    }

    public final void setErrorStateBehaviour(@NotNull l2 l2Var) {
        Intrinsics.checkNotNullParameter(l2Var, "<set-?>");
        this.errorStateBehaviour = l2Var;
    }

    public final void setInterruptionBehaviour$ui_kit_components_release(@NotNull m2 behaviour) {
        Intrinsics.checkNotNullParameter(behaviour, "behaviour");
        this.f = behaviour;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:83:0x018c  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setModel$ui_kit_components_release(@org.jetbrains.annotations.NotNull ms0.t2 r21, boolean r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.internal.views.ProductIntroView.setModel$ui_kit_components_release(ms0.t2, boolean):void");
    }

    public final void setVideoPlayerDetachBehaviour$ui_kit_components_release(@NotNull s behavior) {
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        this.f56304m.setDetachBehavior(behavior);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProductIntroView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, null, 12);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProductIntroView(@NotNull Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, null, 8);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ProductIntroView(Context context, AttributeSet attributeSet, int i, s2 s2Var, int i2) {
        attributeSet = (i2 & 2) != 0 ? null : attributeSet;
        i = (i2 & 4) != 0 ? 0 : i;
        s2Var = (i2 & 8) != 0 ? null : s2Var;
        Intrinsics.checkNotNullParameter(context, "context");
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R$layout.internal_view_product_intro, this);
        this.errorStateBehaviour = l2.SHOW;
        this.f = m2.IGNORE;
        lx0.j jVar = new lx0.j(lx0.g.f200511a.a(context));
        this.f56301h = (ConstraintLayout) findViewById(R$id.productIntro_shimmeringView);
        ShimmerFrameLayout shimmeringTextContainer = (ShimmerFrameLayout) findViewById(R$id.productIntroShimmering_textContainer);
        this.i = shimmeringTextContainer;
        this.f56302j = (LinearLayout) findViewById(R$id.productIntro_errorState);
        this.k = (TextView) findViewById(R$id.productIntro_errorTitle);
        this.f56303l = (TextView) findViewById(R$id.productIntro_tryAgainButton);
        this.f56304m = (UiKitPlayerView) findViewById(R$id.productIntro_videoPlayer);
        this.f56305n = findViewById(R$id.productIntro_videoPlayerPlaceholder);
        this.o = findViewById(R$id.productIntro_textPlaceholder);
        this.f56306p = (TagView) findViewById(R$id.productIntro_badge);
        TextView title = (TextView) findViewById(R$id.productIntro_title);
        this.f56307q = title;
        this.f56308r = (TextView) findViewById(R$id.productIntro_subtitle);
        this.f56309s = (ProgressPagingIndicatorView) findViewById(R$id.productIntro_pageIndicator);
        this.f56311w = e3.f208238a;
        this.f56312x = j6.a.h("create(...)");
        this.f56313y = v0.a.d("create(...)");
        this.z = v0.a.d("create(...)");
        this.A = new b3(context, jVar, new b0(this, 17));
        this.C = new i3(this);
        this.D = kli.a.l(context, -20.0f);
        this.E = kli.a.k(context, 380.0f);
        Intrinsics.checkNotNullExpressionValue(title, "title");
        jb3.l.e(title, R$attr.internal_textAppearanceMarketingDisplay2_noXmlUsage);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.internal_ProductIntroView, i, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.v = s2Var == null ? (s2) s2.a().get(typedArrayObtainStyledAttributes.getInt(R$styleable.internal_ProductIntroView_internal_variant, s2.REGULAR.ordinal())) : s2Var;
        Unit unit = Unit.f186387a;
        typedArrayObtainStyledAttributes.recycle();
        setClipToPadding(false);
        int iS = kli.a.s(R$attr.uikit_colorGreyTone8, context);
        Intrinsics.checkNotNullExpressionValue(shimmeringTextContainer, "shimmeringTextContainer");
        int childCount = shimmeringTextContainer.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = shimmeringTextContainer.getChildAt(i3);
            RoundedBackgroundDrawable.Companion companion = RoundedBackgroundDrawable.INSTANCE;
            Context context2 = childAt.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            companion.getClass();
            childAt.setBackground(RoundedBackgroundDrawable.Companion.c(iS, context2));
        }
        ShimmerFrameLayout shimmeringTextContainer2 = this.i;
        Intrinsics.checkNotNullExpressionValue(shimmeringTextContainer2, "shimmeringTextContainer");
        ifk.b.q(shimmeringTextContainer2, null, 3);
        this.f56304m.setDetachBehavior(s.PAUSE_ON_DETACH);
        this.f56308r.setMovementMethod(c0.f169220a);
        int childCount2 = getChildCount();
        for (int i5 = 0; i5 < childCount2; i5++) {
            getChildAt(i5).setVisibility(8);
        }
    }
}
