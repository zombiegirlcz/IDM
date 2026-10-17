package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0003\u0002\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/CellDetailsPriceDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/y7;", "Lip0/a8;", "<init>", "()V", "ip0/z7", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CellDetailsPriceDelegate extends BaseRecyclerViewDelegate<ip0.y7, ip0.a8> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f51887c;
    public final ihm.f d;

    public CellDetailsPriceDelegate() {
        super(R$layout.internal_delegate_cell_details_price, new ip0.g4(27));
        this.f51887c = v0.a.d("create(...)");
        Intrinsics.checkNotNullExpressionValue(new ihm.f(), "create(...)");
        ihm.f fVar = new ihm.f();
        Intrinsics.checkNotNullExpressionValue(fVar, "create(...)");
        this.d = fVar;
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ip0.a8(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_cell_details_price));
    }

    public final void p(ip0.y7 y7Var, ip0.a8 a8Var) {
        TextView textView = a8Var.i;
        y7Var.getClass();
        pd.b.h(textView, true);
        or0.b.e(this, null, a8Var.i, new i4g.g(1, this.d, ihm.f.class, "onNext", "onNext(Ljava/lang/Object;)V", 0, 15), 8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [android.view.View$OnClickListener] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6, types: [com.revolut.core.ui_kit_core.displayers.image.Image] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r1v3, types: [gq0.d[], java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v25, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [android.view.View, android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r3v11, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v5, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [android.view.View, android.widget.ImageView, androidx.appcompat.widget.AppCompatImageView] */
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
    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void p(ip0.a8 holder, ip0.y7 data, int i, List payloads) {
        ?? r132;
        ty0.d dVar;
        ?? r133;
        int i2;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        TextView textView = holder.f163406h;
        TextView textView2 = holder.f163405g;
        ?? r92 = holder.f163407j;
        LinearLayout linearLayout = holder.k;
        TextView textView3 = holder.f;
        boolean zIsEmpty = payloads.isEmpty();
        int i3 = 4;
        ty0.d dVar2 = ty0.d.f275448a;
        ?? r56 = 0;
        if (zIsEmpty) {
            r132 = 0;
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.b.c(this, data, itemView, false, null, 28);
            or0.b.e(this, data.f167260b, textView2, null, 4);
            or0.b.e(this, data.f167261c, textView3, null, 12);
            kli.a.b(textView, data.d, dVar2);
            int i5 = data.e;
            if (i5 != 0) {
                textView3.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, i5, 0);
            }
            r(data, holder);
            zi0.c.g(r92, null);
            p(data, holder);
            linearLayout.setVisibility(8);
        } else {
            List list = payloads;
            ArrayList<ip0.z7> arrayList = new ArrayList(zhm.w.t(list, 10));
            for (Object obj2 : list) {
                Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.core.ui_kit.delegates.CellDetailsPriceDelegate.Payload");
                arrayList.add((ip0.z7) obj2);
            }
            for (ip0.z7 z7Var : arrayList) {
                if (z7Var.f167407a || z7Var.d) {
                    or0.b.e(this, data.f167260b, textView2, r56, i3);
                    int i6 = data.e;
                    if (i6 != 0) {
                        textView3.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, i6, 0);
                    }
                    r(data, holder);
                }
                if (z7Var.f167409c) {
                    kli.a.b(textView, data.d, dVar2);
                }
                if (z7Var.f167408b) {
                    or0.b.e(this, data.f167261c, textView3, r56, 12);
                }
                if (z7Var.e) {
                    View itemView2 = holder.itemView;
                    Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
                    r133 = r56;
                    dVar = dVar2;
                    or0.b.c(this, data, itemView2, false, null, 28);
                } else {
                    dVar = dVar2;
                    r133 = r56;
                }
                if (z7Var.f || z7Var.f167411h) {
                    p(data, holder);
                    i2 = 8;
                    linearLayout.setVisibility(8);
                } else {
                    i2 = 8;
                }
                if (z7Var.f167410g) {
                    data.getClass();
                    zi0.c.g(r92, r133);
                    linearLayout.setVisibility(i2);
                }
                r56 = r133;
                dVar2 = dVar;
                i3 = 4;
            }
            r132 = r56;
        }
        data.getClass();
        r92.setOnClickListener(r132);
        holder.i.setOnClickListener(r132);
        View itemView3 = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView3, "itemView");
        gq0.b bVarF = hx7.b.f(data.f167261c);
        gq0.b bVarF2 = hx7.b.f(data.f167260b);
        Clause clause = data.d;
        ?? elements = {bVarF, bVarF2, clause != null ? hx7.b.f(clause) : r132, r132};
        Intrinsics.checkNotNullParameter(elements, "elements");
        hx7.b.u(kotlin.collections.d.L(elements), itemView3);
    }

    public final void r(ip0.y7 y7Var, ip0.a8 a8Var) {
        TextView textView = a8Var.f;
        pd.b.h(textView, y7Var.e != 0);
        if (y7Var.e != 0) {
            textView.setOnClickListener(new ap0.f(this, y7Var, 19));
        } else {
            textView.setOnClickListener(null);
        }
    }
}
