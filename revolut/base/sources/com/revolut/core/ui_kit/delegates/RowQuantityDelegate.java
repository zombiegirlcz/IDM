package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.ac0;
import ip0.e70;
import ip0.lb0;
import ip0.t90;
import ip0.wb0;
import ip0.xb0;
import ip0.yb0;
import ip0.zb0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0002\u0006\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/RowQuantityDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/bg;", "Lip0/ac0;", "<init>", "()V", "ip0/zb0", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RowQuantityDelegate extends BaseRecyclerViewDelegate<bg, ac0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RowDelegate f53275c;
    public final Object d;
    public final Object e;

    public RowQuantityDelegate() {
        super(R$layout.internal_row_quantity_layout, new t90(17));
        this.f53275c = new RowDelegate(null, null, 7);
        yhm.k kVar = yhm.k.NONE;
        this.d = yhm.j.c(kVar, new e70(7));
        this.e = yhm.j.c(kVar, new e70(8));
    }

    public static void p(SmallActionButton smallActionButton, xb0 xb0Var) {
        smallActionButton.setVisibility(0);
        smallActionButton.i(xb0Var.f167120b);
        smallActionButton.setState(xb0Var.f167121c);
        smallActionButton.setIcon(xb0Var.f167119a);
        Context context = smallActionButton.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        smallActionButton.setContentPadding(kli.a.w(xb0Var.d, context));
    }

    public static void r(ac0 ac0Var, bg bgVar) {
        int iA;
        View view;
        View view2;
        float f;
        ViewGroup.LayoutParams layoutParams = ac0Var.f163418g.getLayoutParams();
        Intrinsics.i(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        RowDelegate.Model.MainImage mainImage = bgVar.f53730b.f53229b;
        if (mainImage instanceof RowDelegate.Model.MainImage.CountdownTimer) {
            view2 = ac0Var.itemView;
            f = 44.0f;
        } else {
            if (!(mainImage instanceof RowDelegate.Model.MainImage.Image24)) {
                if (mainImage instanceof RowDelegate.Model.MainImage.Image40) {
                    view = ac0Var.itemView;
                } else if (mainImage instanceof RowDelegate.Model.MainImage.Image56) {
                    view2 = ac0Var.itemView;
                    f = 72.0f;
                } else {
                    if (!(mainImage instanceof RowDelegate.Model.MainImage.NestedImage) && !(mainImage instanceof RowDelegate.Model.MainImage.IndentedImage) && !(mainImage instanceof RowDelegate.Model.MainImage.Avatar)) {
                        if (mainImage != null) {
                            throw new NoWhenBranchMatchedException();
                        }
                        iA = 0;
                        marginLayoutParams.setMarginStart(iA);
                    }
                    view = ac0Var.itemView;
                }
                iA = com.google.android.gms.internal.mlkit_vision_face.a.a(view, "getContext(...)", 56.0f);
                marginLayoutParams.setMarginStart(iA);
            }
            view2 = ac0Var.itemView;
            f = 40.0f;
        }
        iA = com.google.android.gms.internal.mlkit_vision_face.a.a(view2, "getContext(...)", f);
        marginLayoutParams.setMarginStart(iA);
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewR = kotlin.jvm.internal.s.r(parent, this.f98535a);
        View viewFindViewById = viewR.findViewById(R$id.rowQuantity_container);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f53275c.getClass();
        ac0 ac0Var = new ac0(viewR, RowDelegate.A((ViewGroup) viewFindViewById));
        ac0Var.f163420j.addView(ac0Var.f.itemView);
        return ac0Var;
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void p(ac0 holder, bg data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        TextView textView = holder.i;
        zf zfVar = holder.f;
        RowDelegate.Model model = data.f53730b;
        yb0 yb0Var = data.f53731c;
        int i2 = R$attr.uikit_dp0;
        RowDelegate.Model modelX = RowDelegate.Model.x(model, null, null, null, null, null, 0, null, false, null, null, i2, i2, i2, i2, null, 536870911, 14);
        boolean zIsEmpty = payloads.isEmpty();
        RowDelegate rowDelegate = this.f53275c;
        if (zIsEmpty) {
            rowDelegate.p(zfVar, modelX, i, zhm.f0.f322471a);
            t(holder, data);
            s(holder, data);
            or0.b.e(this, yb0Var.f167296a, textView, null, 4);
            r(holder, data);
        } else {
            List list = payloads;
            ArrayList<zb0> arrayList = new ArrayList(zhm.w.t(list, 10));
            for (Object obj2 : list) {
                Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.core.ui_kit.delegates.RowQuantityDelegate.Payload");
                arrayList.add((zb0) obj2);
            }
            for (zb0 zb0Var : arrayList) {
                rowDelegate.p(zfVar, modelX, i, zhm.v.l(zb0Var.d));
                if (zb0Var.f167441c) {
                    or0.b.e(this, yb0Var.f167296a, textView, null, 4);
                }
                if (zb0Var.f167440b) {
                    t(holder, data);
                }
                if (zb0Var.f167439a) {
                    s(holder, data);
                }
                lb0 lb0Var = zb0Var.d;
                if (pd.b.j(lb0Var != null ? Boolean.valueOf(lb0Var.f165168a) : null)) {
                    r(holder, data);
                }
            }
        }
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        or0.b.c(this, data, itemView, false, null, 28);
    }

    public final void s(ac0 ac0Var, bg bgVar) {
        xb0 xb0Var = bgVar.f53731c.f167297b;
        SmallActionButton smallActionButton = ac0Var.f163418g;
        p(smallActionButton, xb0Var);
        ms0.e4 e4Var = xb0Var.f167121c;
        if (e4Var == ms0.e4.EnabledClickable || e4Var == ms0.e4.DisabledClickable) {
            smallActionButton.setOnClickListener(new wb0(this, bgVar, 1));
        }
    }

    public final void t(ac0 ac0Var, bg bgVar) {
        xb0 xb0Var = bgVar.f53731c.f167298c;
        SmallActionButton smallActionButton = ac0Var.f163419h;
        p(smallActionButton, xb0Var);
        ms0.e4 e4Var = xb0Var.f167121c;
        if (e4Var == ms0.e4.EnabledClickable || e4Var == ms0.e4.DisabledClickable) {
            smallActionButton.setOnClickListener(new wb0(this, bgVar, 0));
        }
    }
}
