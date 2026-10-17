package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.UIKitTextView;
import com.revolut.core.ui_kit.views.slider.RangeSliderTitledView;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.l40;
import ip0.r70;
import ip0.s70;
import ip0.t70;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0002\u0003\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/RangeSliderTitleDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/r70;", "Lip0/t70;", "<init>", "()V", "ip0/s70", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RangeSliderTitleDelegate extends BaseRecyclerViewDelegate<r70, t70> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f53139c;

    public RangeSliderTitleDelegate() {
        super(R$layout.internal_delegate_range_slider_title, new l40(21));
        this.f53139c = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new t70(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_range_slider_title));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v16, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v17, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v21, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(t70 holder, r70 data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        UIKitTextView uIKitTextView = holder.f166474h;
        UIKitTextView uIKitTextView2 = holder.f166473g;
        RangeSliderTitledView rangeSliderTitledView = holder.f;
        if (payloads.isEmpty()) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.b.c(this, data, itemView, false, null, 28);
            kli.a.b(uIKitTextView2, data.f166130b, ty0.f.f275450a);
            kli.a.b(uIKitTextView, data.f166131c, ty0.f.f275450a);
            rangeSliderTitledView.setRange(data.f, data.f166132g);
            rangeSliderTitledView.setSelectionRange(data.f166133h, data.i);
            rangeSliderTitledView.setStartLabel(data.d);
            rangeSliderTitledView.setEndLabel(data.e);
        } else {
            List list = payloads;
            ArrayList<s70> arrayList = new ArrayList(zhm.w.t(list, 10));
            for (Object obj2 : list) {
                Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.core.ui_kit.delegates.RangeSliderTitleDelegate.Payload");
                arrayList.add((s70) obj2);
            }
            for (s70 s70Var : arrayList) {
                if (s70Var.f166316a) {
                    kli.a.b(uIKitTextView2, data.f166130b, ty0.f.f275450a);
                }
                if (s70Var.f166317b) {
                    kli.a.b(uIKitTextView, data.f166131c, ty0.f.f275450a);
                }
                if (s70Var.e || s70Var.f) {
                    rangeSliderTitledView.setRange(data.f, data.f166132g);
                }
                if (s70Var.f166319g) {
                    rangeSliderTitledView.setSelectionRange(data.f166133h, data.i);
                }
                if (s70Var.f166318c) {
                    rangeSliderTitledView.setStartLabel(data.d);
                }
                if (s70Var.d) {
                    rangeSliderTitledView.setEndLabel(data.e);
                }
                if (s70Var.f166320h) {
                    View itemView2 = holder.itemView;
                    Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
                    or0.b.c(this, data, itemView2, false, null, 28);
                }
            }
        }
        rangeSliderTitledView.setOnRangeSelectionChangeListener(new fb.c(this, data, 19));
    }
}
