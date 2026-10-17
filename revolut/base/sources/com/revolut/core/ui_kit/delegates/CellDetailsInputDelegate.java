package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0002\u0004\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/CellDetailsInputDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/m7;", "Lip0/o7;", "ip0/n7", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CellDetailsInputDelegate extends BaseRecyclerViewDelegate<ip0.m7, ip0.o7> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function2 f51857c;
    public final WeakHashMap d;
    public final ihm.f e;

    public CellDetailsInputDelegate() {
        this(null);
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ip0.o7(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_cell_details_input));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate, koi.k
    public final void onViewRecycled(RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        MaskedTextInputEditText maskedTextInputEditText = ((ip0.o7) holder).f165630g;
        WeakHashMap weakHashMap = this.d;
        yz0.b bVar = (yz0.b) weakHashMap.get(maskedTextInputEditText);
        if (bVar != null) {
            bVar.a();
        }
        weakHashMap.remove(maskedTextInputEditText);
        maskedTextInputEditText.setMaskingDelegate(null);
        Intrinsics.checkNotNullParameter(holder, "holder");
    }

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
    public final void p(ip0.o7 holder, ip0.m7 data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        MaskedTextInputEditText maskedTextInputEditText = holder.f165630g;
        List list = payloads;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it8 = list.iterator();
            while (true) {
                if (it8.hasNext()) {
                    if (!(it8.next() instanceof ip0.n7)) {
                        payloads = null;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (payloads == null) {
            payloads = zhm.f0.f322471a;
        }
        Intrinsics.i(payloads, "null cannot be cast to non-null type kotlin.collections.List<com.revolut.core.ui_kit.delegates.CellDetailsInputDelegate.Payload>");
        boolean zIsEmpty = payloads.isEmpty();
        boolean z = zIsEmpty;
        boolean z3 = z;
        for (ip0.n7 n7Var : payloads) {
            zIsEmpty = zIsEmpty || n7Var.f165460a;
            z = z || n7Var.f165461b;
            z3 = z3 || n7Var.f165462c;
        }
        if (zIsEmpty) {
            or0.b.e(this, data.f165324a, holder.f, null, 12);
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            hx7.b.u(zhm.u.c(hx7.b.f(data.f165324a)), itemView);
        }
        if (z) {
            WeakHashMap weakHashMap = this.d;
            yz0.b bVar = (yz0.b) weakHashMap.get(maskedTextInputEditText);
            if (bVar != null) {
                bVar.a();
            }
            weakHashMap.remove(maskedTextInputEditText);
            maskedTextInputEditText.setMaskingDelegate(null);
            kli.a.b(holder.f165631h, data.f165326c, ty0.f.f275450a);
            Function2 function2 = this.f51857c;
            if (function2 != null) {
                Object obj2 = weakHashMap.get(maskedTextInputEditText);
                if (obj2 == null) {
                    obj2 = (yz0.b) function2.invoke(data, maskedTextInputEditText);
                    weakHashMap.put(maskedTextInputEditText, obj2);
                }
                maskedTextInputEditText.setMaskingDelegate((yz0.b) obj2);
            }
            ip0.l7 l7Var = new ip0.l7(this, data, 0);
            Object tag2 = maskedTextInputEditText.getTag();
            View.OnFocusChangeListener onFocusChangeListener = tag2 instanceof View.OnFocusChangeListener ? (View.OnFocusChangeListener) tag2 : null;
            if (onFocusChangeListener != null) {
                maskedTextInputEditText.b(onFocusChangeListener);
            }
            maskedTextInputEditText.setTag(l7Var);
            maskedTextInputEditText.a(l7Var);
            maskedTextInputEditText.setEnabled(true);
            maskedTextInputEditText.setText(data.f165325b);
        }
        if (z3) {
            View itemView2 = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
            or0.b.c(this, data, itemView2, false, null, 28);
        }
    }

    public CellDetailsInputDelegate(s42.f fVar) {
        super(R$layout.internal_delegate_cell_details_input, new ip0.g4(22));
        this.f51857c = fVar;
        this.d = new WeakHashMap();
        this.e = v0.a.d("create(...)");
    }
}
