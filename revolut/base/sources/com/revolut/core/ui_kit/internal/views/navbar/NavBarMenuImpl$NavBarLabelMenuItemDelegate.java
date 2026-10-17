package com.revolut.core.ui_kit.internal.views.navbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import au0.i3;
import au0.k3;
import au0.w2;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.drawables.RoundedBackgroundDrawable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.LabelNavBarMenuItem;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import fp0.p;
import h30.l;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import or0.m;
import or0.u;
import tx0.s0;
import tx0.u0;
import zhm.f0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"com/revolut/core/ui_kit/internal/views/navbar/NavBarMenuImpl$NavBarLabelMenuItemDelegate", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/views/navbar/LabelNavBarMenuItem;", "Lau0/k3;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NavBarMenuImpl$NavBarLabelMenuItemDelegate extends BaseRecyclerViewDelegate<LabelNavBarMenuItem, k3> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w2 f57317c;
    public final long d;
    public final long e;
    public final float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d f57318g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavBarMenuImpl$NavBarLabelMenuItemDelegate(d dVar, w2 onItemClick) {
        super(R$layout.internal_view_nav_bar_menu_item_label, new akg.d(4));
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        this.f57318g = dVar;
        this.f57317c = onItemClick;
        this.d = 500L;
        this.e = 300L;
        this.f = 32.0f;
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewR = s.r(parent, this.f98535a);
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        d dVar = this.f57318g;
        RoundedBackgroundDrawable roundedBackgroundDrawableC = dVar.c(context, null, null);
        k3 k3Var = new k3(viewR, roundedBackgroundDrawableC);
        k3Var.M().setBackground(roundedBackgroundDrawableC);
        View viewM = k3Var.M();
        Context context2 = viewR.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        u.w(kli.a.k(context2, 44.0f), viewM);
        d.a(dVar, viewR);
        k3Var.I(u0.SECONDARY_ACCENT);
        return k3Var;
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(final k3 holder, LabelNavBarMenuItem data, int i, List list) {
        final NavBarMenuImpl$NavBarLabelMenuItemDelegate navBarMenuImpl$NavBarLabelMenuItemDelegate;
        boolean z;
        List payloads = list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, list);
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (!(payloads.get(i2) instanceof s0)) {
                payloads = null;
                break;
            }
            i2++;
        }
        if (payloads == null) {
            payloads = f0.f322471a;
        }
        boolean zIsEmpty = payloads.isEmpty();
        int size2 = payloads.size();
        boolean z3 = zIsEmpty;
        boolean z4 = z3;
        boolean z6 = z4;
        boolean z11 = z6;
        boolean z12 = z11;
        boolean z29 = z12;
        boolean z31 = z29;
        for (int i3 = 0; i3 < size2; i3++) {
            s0 s0Var = (s0) payloads.get(i3);
            z3 = z3 || s0Var.c();
            z4 = z4 || s0Var.f();
            z11 = z11 || s0Var.a();
            z29 = z29 || s0Var.b();
            z12 = z12 || s0Var.g();
            z31 = z31 || s0Var.d();
            z6 = z6 || s0Var.e();
        }
        boolean zA = data.getF59245h().a();
        p pVarN = holder.N();
        Clause f59243c = data.getF59243c();
        py0.c cVar = f59243c != null ? new py0.c(f59243c) : null;
        p.b(pVarN, zA);
        View view = pVarN.f137029a;
        m.a(view);
        if (zA) {
            z = zA;
            navBarMenuImpl$NavBarLabelMenuItemDelegate = this;
            view.setOnClickListener(new i3(data, cVar, navBarMenuImpl$NavBarLabelMenuItemDelegate, data, 0));
        } else {
            navBarMenuImpl$NavBarLabelMenuItemDelegate = this;
            z = zA;
            u.o(view);
        }
        holder.itemView.setEnabled(z);
        if (z6) {
            holder.I(data.getI());
        }
        if (z12) {
            holder.J(data.getF59244g());
        }
        if (z3) {
            View view2 = holder.itemView;
            yy0.f.e(l.z(view2, "itemView", view2), data.getF59242b(), holder.O(), null, null, 12);
        }
        if (z4) {
            kli.a.b(holder.P(), data.getF59243c(), ty0.f.f275450a);
        }
        if ((z6 || z3 || z12) && data.getI() == u0.PRIMARY_ACCENT) {
            holder.H();
        }
        if (z31) {
            holder.F(data.getF59245h().b());
        }
        if (data.getD()) {
            if (z11 || zIsEmpty) {
                final float fB = data.getF59245h().b();
                View viewM = holder.M();
                ViewGroup.LayoutParams layoutParams = viewM.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                Context context = holder.M().getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                ((ViewGroup.MarginLayoutParams) layoutParams2).width = kli.a.k(context, navBarMenuImpl$NavBarLabelMenuItemDelegate.f);
                layoutParams2.startToStart = -1;
                viewM.setLayoutParams(layoutParams2);
                holder.M().requestLayout();
                holder.P().setAlpha(BitmapDescriptorFactory.HUE_RED);
                holder.O().setAlpha(BitmapDescriptorFactory.HUE_RED);
                holder.M().setScaleX(BitmapDescriptorFactory.HUE_RED);
                holder.M().setScaleY(BitmapDescriptorFactory.HUE_RED);
                holder.M().animate().scaleX(1.0f).scaleY(1.0f).setDuration(navBarMenuImpl$NavBarLabelMenuItemDelegate.d).setInterpolator(new LinearInterpolator()).withEndAction(new Runnable() { // from class: au0.g3
                    @Override // java.lang.Runnable
                    public final void run() {
                        k3 k3Var = holder;
                        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(k3Var.i.getWidth(), k3Var.itemView.getWidth());
                        valueAnimatorOfInt.setDuration(this.f9209a.e);
                        valueAnimatorOfInt.setInterpolator(new AccelerateInterpolator());
                        valueAnimatorOfInt.addUpdateListener(new h3(k3Var, valueAnimatorOfInt, fB));
                        valueAnimatorOfInt.start();
                    }
                }).start();
            }
        } else if (z11 || zIsEmpty) {
            View viewM2 = holder.M();
            ViewGroup.LayoutParams layoutParams3 = viewM2.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
            ((ViewGroup.MarginLayoutParams) layoutParams4).width = 0;
            layoutParams4.startToStart = 0;
            viewM2.setLayoutParams(layoutParams4);
        }
        d dVar = navBarMenuImpl$NavBarLabelMenuItemDelegate.f57318g;
        Integer num = dVar.d;
        boolean zK = holder.K();
        if (z29 || zIsEmpty) {
            holder.U(data.getF());
        }
        if (z29 || z6 || z3 || z12 || zIsEmpty) {
            if (data.getF() && num != null) {
                holder.i(num.intValue());
            } else if (data.getF() && num == null) {
                holder.R();
            } else if (zK && z29) {
                holder.R();
            }
            Integer num2 = data.getF() ? num : null;
            holder.s(dVar.f);
            Integer num3 = dVar.e;
            if (num3 != null) {
                holder.o(num3.intValue(), num2);
            }
        }
        if (zIsEmpty) {
            holder.q(dVar.f57405g);
        }
    }
}
