package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.drawables.PassCardPunchDrawable;
import com.revolut.core.ui_kit.internal.views.PassCardDetailsContainer;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.a00;
import ip0.b00;
import ip0.c00;
import ip0.d00;
import ip0.tz;
import ip0.yz;
import ip0.zz;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0003\u0002\u0007\bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/PassCardDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/fa;", "Lip0/d00;", "<init>", "()V", "Companion", "b", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PassCardDelegate extends BaseRecyclerViewDelegate<fa, d00> {

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f52887a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f52888b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f52889c;
        public final boolean d;
        public final boolean e;

        public b() {
            this(false, false, false, false, false);
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return this.f52887a == bVar.f52887a && this.f52888b == bVar.f52888b && this.f52889c == bVar.f52889c && this.d == bVar.d && this.e == bVar.e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.e) + j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f52887a) * 31, 31, this.f52888b), 31, this.f52889c), 31, this.d);
        }

        public b(boolean z, boolean z3, boolean z4, boolean z6, boolean z11) {
            this.f52887a = z;
            this.f52888b = z3;
            this.f52889c = z4;
            this.d = z6;
            this.e = z11;
        }
    }

    public PassCardDelegate() {
        super(R$layout.internal_delegate_pass_card, new tz(2));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new d00(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_pass_card));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [com.revolut.core.ui_kit_core.displayers.image.Image] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r7v5, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(d00 holder, fa data, int i, List list) {
        boolean z;
        String str;
        ?? r142;
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
            if (!(payloads.get(i2) instanceof b)) {
                payloads = null;
                break;
            }
            i2++;
        }
        if (payloads == null) {
            payloads = zhm.f0.f322471a;
        }
        boolean zIsEmpty = payloads.isEmpty();
        int size2 = payloads.size();
        boolean z3 = zIsEmpty;
        boolean z4 = z3;
        boolean z6 = z4;
        boolean z11 = z6;
        int i3 = 0;
        while (true) {
            z = true;
            if (i3 >= size2) {
                break;
            }
            b bVar = (b) payloads.get(i3);
            zIsEmpty = zIsEmpty || bVar.f52887a;
            z3 = z3 || bVar.f52888b;
            z4 = z4 || bVar.f52889c;
            z6 = z6 || bVar.d;
            z11 = z11 || bVar.e;
            i3++;
        }
        if (zIsEmpty) {
            CdnImage logo = data.f54151b;
            Intrinsics.checkNotNullParameter(logo, "logo");
            zi0.c.g(holder.f163815g, logo);
        }
        if (z3) {
            a00 a00Var = data.f54152c;
            kli.a.b(holder.f163816h, a00Var != null ? a00Var.f163359a : null, ty0.f.f275450a);
            kli.a.b(holder.i, a00Var != null ? a00Var.f163360b : null, ty0.f.f275450a);
            zi0.c.g(holder.f163817j, a00Var != null ? a00Var.f163361c : null);
        }
        if (z4) {
            zz zzVar = data.d;
            ImageView imageView = holder.f163818l;
            View view = holder.k;
            if (zzVar instanceof yz) {
                str = "1:1";
                r142 = ((yz) zzVar).f167367a;
            } else {
                if (zzVar != null) {
                    throw new NoWhenBranchMatchedException();
                }
                z = false;
                str = null;
                r142 = 0;
            }
            view.setVisibility(zzVar != null ? 0 : 8);
            imageView.setVisibility(z ? 0 : 8);
            holder.f163819m.setVisibility(8);
            if (str != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                layoutParams2.dimensionRatio = str;
                ((ViewGroup.MarginLayoutParams) layoutParams2).height = 0;
                view.setLayoutParams(layoutParams2);
            } else {
                ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
                if (layoutParams3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
                layoutParams4.dimensionRatio = null;
                ((ViewGroup.MarginLayoutParams) layoutParams4).height = -2;
                view.setLayoutParams(layoutParams4);
            }
            if (r142 != 0) {
                yy0.f.e(or0.u.k(imageView).Q(), r142, holder.f163818l, null, null, 12);
            }
        }
        if (z6) {
            List details = data.e;
            Intrinsics.checkNotNullParameter(details, "details");
            PassCardDetailsContainer passCardDetailsContainer = holder.f163820n;
            passCardDetailsContainer.removeAllViews();
            int size3 = details.size();
            for (int i5 = 0; i5 < size3; i5++) {
                b00 b00Var = (b00) details.get(i5);
                View viewInflate = LayoutInflater.from(holder.itemView.getContext()).inflate(R$layout.internal_view_pass_card_labeled_text, (ViewGroup) passCardDetailsContainer, false);
                View viewFindViewById = viewInflate.findViewById(R$id.passCardLabeledText_title);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
                View viewFindViewById2 = viewInflate.findViewById(R$id.passCardLabeledText_value);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
                kli.a.b((TextView) viewFindViewById, b00Var.f163511a, ty0.f.f275450a);
                kli.a.b((TextView) viewFindViewById2, b00Var.f163512b, ty0.f.f275450a);
                passCardDetailsContainer.addView(viewInflate);
            }
        }
        if (z11) {
            or0.b.c(this, data, holder.f, false, null, 28);
            float fA = r6.b.a(holder.itemView, "getContext(...)", 9.0f);
            Context context = holder.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            holder.f.setBackground(new PassCardPunchDrawable(kli.a.s(R$attr.uikit_colorWidgetBackground, context), fA, new c00(holder, r6.b.a(holder.itemView, "getContext(...)", 33.0f), r6.b.a(holder.itemView, "getContext(...)", 17.0f), 0)));
        }
    }
}
