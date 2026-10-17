package com.revolut.core.ui_kit.internal.views.navbar;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import au0.b3;
import au0.g2;
import au0.o3;
import au0.w2;
import au0.x2;
import au0.y2;
import au0.z2;
import aw0.t1;
import aw0.v1;
import com.revolut.core.ui_kit.internal.drawables.RoundedBackgroundDrawable;
import efm.r;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import or0.u;
import org.jetbrains.annotations.NotNull;
import z4l.j;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes.dex */
public final class d implements g2, ur0.a {

    @NotNull
    public static final z2 Companion = new z2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecyclerView f57402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ihm.f f57403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y2 f57404c;
    public Integer d;
    public Integer e;
    public v1 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f57405g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public v1 f57406h;
    public final j i;

    public d(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.f57402a = recyclerView;
        this.f57403b = v0.a.d("create(...)");
        y2 y2Var = new y2(this, recyclerView);
        this.f57404c = y2Var;
        t1 t1Var = v1.Companion;
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        t1Var.getClass();
        this.f = t1.a(context);
        this.f57405g = true;
        j jVar = new j(new koi.c(v.k(new NavBarMenuImpl$NavBarIconMenuItemDelegate(this, new w2(this, 0)), new NavBarMenuImpl$NavBarTextMenuItemDelegate(this, new w2(this, 1)), new NavBarMenuImpl$NavBarActionMenuItemDelegate(this, new w2(this, 2)), new NavBarMenuImpl$NavBarPlusActionMenuItemDelegate(this, y2Var, new w2(this, 3)), new NavBarMenuImpl$NavBarLabelMenuItemDelegate(this, new w2(this, 4)), new NavBarMenuImpl$NavBarAvatarMenuItemDelegate(new w2(this, 5)), new NavBarMenuImpl$NavBarAvatarModelMenuItemDelegate(new w2(this, 6)))), false, 6);
        this.i = jVar;
        recyclerView.setOverScrollMode(2);
        recyclerView.setAdapter(jVar);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, true));
        recyclerView.setItemAnimator(null);
        recyclerView.addItemDecoration(new b3());
        Context context2 = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        knm.b.w(kli.a.k(context2, 12.0f), recyclerView);
    }

    public static final void a(d dVar, View view) {
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        u.w(kli.a.k(context, 44.0f), view);
        u.z(view, 0, 0, 0, 0, false, 16);
        view.setPaddingRelative(0, 0, 0, 0);
    }

    @Override // au0.g2
    public final r b() {
        throw null;
    }

    public final RoundedBackgroundDrawable c(Context context, Integer num, Integer num2) {
        RoundedBackgroundDrawable roundedBackgroundDrawableB;
        if (num == null || num2 == null) {
            roundedBackgroundDrawableB = RoundedBackgroundDrawable.Companion.b(RoundedBackgroundDrawable.INSTANCE, context, 0, 6);
        } else {
            RoundedBackgroundDrawable.Companion companion = RoundedBackgroundDrawable.INSTANCE;
            int iIntValue = num.intValue();
            int iIntValue2 = num2.intValue();
            companion.getClass();
            roundedBackgroundDrawableB = RoundedBackgroundDrawable.Companion.a(context, iIntValue, iIntValue2);
        }
        roundedBackgroundDrawableB.q(this.f57405g);
        return roundedBackgroundDrawableB;
    }

    public final void d(boolean z) {
        this.f57405g = z;
        RecyclerView recyclerView = this.f57402a;
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            Object childViewHolder = recyclerView.getChildViewHolder(recyclerView.getChildAt(i));
            Intrinsics.checkNotNullExpressionValue(childViewHolder, "getChildViewHolder(...)");
            dr0.v vVar = childViewHolder instanceof dr0.v ? (dr0.v) childViewHolder : null;
            if (vVar != null) {
                vVar.q(z);
            }
        }
    }

    public final void e(v1 colorScheme, Integer num, int i) {
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        this.f = colorScheme;
        this.d = num;
        this.e = Integer.valueOf(i);
        RecyclerView recyclerView = this.f57402a;
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            Object childViewHolder = recyclerView.getChildViewHolder(recyclerView.getChildAt(i2));
            Intrinsics.checkNotNullExpressionValue(childViewHolder, "getChildViewHolder(...)");
            boolean z = childViewHolder instanceof x2;
            x2 x2Var = z ? (x2) childViewHolder : null;
            if (x2Var != null) {
                x2Var.s(colorScheme);
            }
            x2 x2Var2 = z ? (x2) childViewHolder : null;
            if (x2Var2 != null) {
                x2Var2.o(i, num);
            }
            if (num != null) {
                int iIntValue = num.intValue();
                o3 o3Var = childViewHolder instanceof o3 ? (o3) childViewHolder : null;
                if (o3Var != null) {
                    o3Var.i(iIntValue);
                }
            }
        }
    }

    public final void f(int i, int i2) {
        if (((Boolean) jo0.g.j().getValue()).booleanValue()) {
            return;
        }
        this.d = Integer.valueOf(i);
        this.e = Integer.valueOf(i2);
        RecyclerView recyclerView = this.f57402a;
        int childCount = recyclerView.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            Object childViewHolder = recyclerView.getChildViewHolder(recyclerView.getChildAt(i3));
            Intrinsics.checkNotNullExpressionValue(childViewHolder, "getChildViewHolder(...)");
            o3 o3Var = childViewHolder instanceof o3 ? (o3) childViewHolder : null;
            if (o3Var != null) {
                o3Var.i(i);
            }
            x2 x2Var = childViewHolder instanceof x2 ? (x2) childViewHolder : null;
            if (x2Var != null) {
                x2Var.o(i2, Integer.valueOf(i));
            }
        }
    }

    @Override // ur0.a
    public final void r(v1 colorScheme, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        if (this.f57406h == colorScheme) {
            return;
        }
        this.f57406h = colorScheme;
        if (((Boolean) jo0.g.j().getValue()).booleanValue()) {
            Context context = this.f57402a.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Integer numValueOf = Integer.valueOf(kli.a.s(colorScheme.a(), context));
            Integer num = this.e;
            e(colorScheme, numValueOf, num != null ? num.intValue() : 0);
        }
    }

    @Override // au0.g2
    public final void setMenuItems(List menuItems) {
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.i.c(d0.I0(menuItems));
    }
}
