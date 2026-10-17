package com.revolut.core.ui_kit.storiesdelegates;

import akl.t;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.recyclerview.widget.RecyclerView;
import ap0.f;
import bnj.n;
import bx0.a0;
import bx0.d;
import bx0.o;
import bx0.u;
import ccb.b;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.sticker.StickerView;
import com.revolut.core.ui_kit.views.buttons.CollapsingActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import cui.v;
import cul.n0;
import cx0.c;
import cx0.e;
import ip0.v7;
import java.util.Iterator;
import java.util.List;
import koi.j;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import zhm.c0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00042\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0003\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/storiesdelegates/StickerStoriesPageDelegate;", "Lcom/revolut/core/ui_kit/storiesdelegates/BaseStoriesDelegate;", "Lcom/revolut/core/ui_kit/storiesdelegates/StickerStoriesModel;", "Lbx0/u;", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StickerStoriesPageDelegate extends BaseStoriesDelegate<StickerStoriesModel, u> {
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public t f58258j;
    public final c k;

    public StickerStoriesPageDelegate() {
        this(0);
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        u uVar = new u(s.r(parent, R$layout.internal_sticker_stories_card));
        StickerView.setupRoundedBackground$default(uVar.N(), R$attr.uikit_dp24, 0, 2, null);
        return uVar;
    }

    @Override // com.revolut.core.ui_kit.storiesdelegates.BaseStoriesDelegate
    public final void s(d dVar, j jVar, List payloads) {
        Iterator it8;
        u holder = (u) dVar;
        StickerStoriesModel data = (StickerStoriesModel) jVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        boolean zIsEmpty = payloads.isEmpty();
        boolean z = this.i;
        c cVar = this.k;
        if (!zIsEmpty) {
            Iterator it9 = c0.N(payloads, bx0.t.class).iterator();
            while (it9.hasNext()) {
                bx0.t tVar = (bx0.t) it9.next();
                if (tVar.b()) {
                    StickerView.Content f58256s = data.getF58256s();
                    if (f58256s instanceof StickerView.Content.ImageTitleValue) {
                        f58256s = StickerView.Content.ImageTitleValue.a((StickerView.Content.ImageTitleValue) f58256s);
                    }
                    holder.N().setContent(f58256s, data.getF58206r());
                }
                if (tVar.a()) {
                    CollapsingActionButton view = holder.I();
                    a2.a andThen = new a2.a(data, 3, holder, this);
                    if (z && view.getVisibility() == 0 && data.getF58248h() == null) {
                        cVar.getClass();
                        Intrinsics.checkNotNullParameter(view, "view");
                        Intrinsics.checkNotNullParameter(andThen, "andThen");
                        if (view.getTag() instanceof cx0.d) {
                            it8 = it9;
                            andThen.invoke();
                        } else {
                            view.setAlpha(1.0f);
                            c.a aVar = c.Companion;
                            it8 = it9;
                            ValueAnimator valueAnimatorF = c.f(cVar, 1.0f, BitmapDescriptorFactory.HUE_RED, 300L, 0L, new b(view, 2), andThen, 32);
                            valueAnimatorF.setInterpolator((PathInterpolator) cVar.f109879a.getValue());
                            c.a.a(aVar, valueAnimatorF, view);
                        }
                    } else {
                        it8 = it9;
                        andThen.invoke();
                    }
                } else {
                    it8 = it9;
                }
                it9 = it8;
            }
            return;
        }
        or0.b.e(this, data.getD(), holder.P(), null, 12);
        or0.b.e(this, data.getE(), holder.O(), null, 12);
        or0.b.g(this, data.getF58254q(), holder.J(), new buf.u(this, data, 9));
        BaseStoriesDelegate.p(holder.P(), data.getF58206r().f58277a);
        BaseStoriesDelegate.p(holder.O(), data.getF58206r().f58278b);
        q(data.getO(), holder.I(), holder.M(), holder.R(), true, data.getF58249j(), data.getF(), data.getF58247g(), data.getF58248h(), data.getI(), data.getK(), data.getF58250l(), data.getF58251m(), data.getF58252n(), data);
        StickerView stickerViewN = holder.N();
        n nVar = new n(this, data, 28);
        if (!(data.getF() instanceof a0) || !((a0) data.getF()).f19391b) {
            nVar = null;
        }
        stickerViewN.setBackgroundImageDominantColorListener(nVar);
        holder.N().setContent(data.getF58256s(), data.getF58206r());
        if (data.getU() != null) {
            holder.H().setVisibility(0);
            holder.H().setText(data.getU());
            holder.K().setOnTouchListener(new o(this, data, holder.K().getContext(), 1));
            holder.H().setOnClickListener(new f(this, data, 5));
        } else {
            holder.H().setVisibility(8);
            holder.H().setOnClickListener(null);
            holder.K().setOnTouchListener(null);
        }
        int i = a.f58283a[data.getF58257t().ordinal()];
        if (i == 1) {
            ConstraintLayout constraintLayoutK = holder.K();
            ConstraintSet constraintSetL = v7.l(constraintLayoutK);
            constraintSetL.clear(holder.N().getId(), 3);
            constraintSetL.clear(holder.N().getId(), 4);
            constraintSetL.connect(holder.N().getId(), 3, holder.O().getId(), 4);
            constraintSetL.connect(holder.N().getId(), 4, holder.H().getId(), 3);
            constraintSetL.applyTo(constraintLayoutK);
            StickerView stickerViewN2 = holder.N();
            ViewGroup.LayoutParams layoutParams = stickerViewN2.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = 0;
            stickerViewN2.setLayoutParams(marginLayoutParams);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            ConstraintLayout constraintLayoutK2 = holder.K();
            ConstraintSet constraintSetL2 = v7.l(constraintLayoutK2);
            constraintSetL2.clear(holder.N().getId(), 3);
            constraintSetL2.clear(holder.N().getId(), 4);
            constraintSetL2.connect(holder.N().getId(), 3, holder.O().getId(), 4);
            constraintSetL2.applyTo(constraintLayoutK2);
            StickerView stickerViewN3 = holder.N();
            ViewGroup.LayoutParams layoutParams2 = stickerViewN3.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            Context context = holder.K().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            marginLayoutParams2.topMargin = kli.a.k(context, 40.0f);
            stickerViewN3.setLayoutParams(marginLayoutParams2);
        }
        if (z) {
            return;
        }
        StickerView stickerViewN4 = holder.N();
        cVar.getClass();
        c.b(stickerViewN4);
        c.c(holder.I());
    }

    /* JADX WARN: Type inference failed for: r5v7, types: [cx0.a] */
    public final void u(u uVar) {
        if (this.i) {
            StickerView stickerViewN = uVar.N();
            c cVar = this.k;
            cVar.getClass();
            c.b(stickerViewN);
            c.c(uVar.N());
            final StickerView view = uVar.N();
            Intrinsics.checkNotNullParameter(view, "view");
            if (!(view.getTag() instanceof cx0.d)) {
                view.setScaleX(0.9f);
                view.setScaleY(0.9f);
                view.setAlpha(BitmapDescriptorFactory.HUE_RED);
                c.a aVar = c.Companion;
                AnimatorSet animatorSet = new AnimatorSet();
                ValueAnimator valueAnimatorD = cVar.d(view, 0.9f, 1.0f, 500L, 400L);
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
                shapeDrawable.setShaderFactory(new e());
                shapeDrawable.setIntrinsicHeight(view.getHeight());
                shapeDrawable.setIntrinsicWidth(view.getWidth());
                final ImageView imageView = new ImageView(view.getContext());
                imageView.setLayoutParams(new ConstraintLayout.LayoutParams(-1, -1));
                imageView.setImageDrawable(shapeDrawable);
                imageView.measure(View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(view.getHeight(), 1073741824));
                final int i = 0;
                imageView.layout(0, 0, imageView.getMeasuredWidth(), imageView.getMeasuredHeight());
                final int i2 = 1;
                ValueAnimator valueAnimatorE = c.e(-0.35f, 0.35f, 600L, 450L, new v(imageView, view, 12), new Function0() { // from class: cx0.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i) {
                            case 0:
                                view.getOverlay().add(imageView);
                                break;
                            default:
                                view.getOverlay().remove(imageView);
                                break;
                        }
                        return Unit.f186387a;
                    }
                }, new Function0() { // from class: cx0.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i2) {
                            case 0:
                                view.getOverlay().add(imageView);
                                break;
                            default:
                                view.getOverlay().remove(imageView);
                                break;
                        }
                        return Unit.f186387a;
                    }
                });
                ValueAnimator valueAnimatorF = c.f(cVar, BitmapDescriptorFactory.HUE_RED, 1.0f, 500L, 400L, new n0(view, 18), null, 96);
                valueAnimatorF.setInterpolator((PathInterpolator) cVar.f109879a.getValue());
                animatorSet.playTogether(valueAnimatorD, valueAnimatorE, valueAnimatorF);
                c.a.a(aVar, animatorSet, view);
            }
            cVar.a(uVar.I(), 800L);
        }
    }

    @Override // com.revolut.core.ui_kit.storiesdelegates.BaseStoriesDelegate
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public final void n(u holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.n(holder);
        if (holder.itemView.getHeight() <= 0 || holder.itemView.getWidth() <= 0) {
            holder.N().addOnLayoutChangeListener(new bx0.v(this, holder, 0));
        } else {
            u(holder);
        }
    }

    public StickerStoriesPageDelegate(int i) {
        super(R$layout.internal_sticker_stories_card, new akg.d(14));
        this.i = true;
        this.k = new c();
    }
}
