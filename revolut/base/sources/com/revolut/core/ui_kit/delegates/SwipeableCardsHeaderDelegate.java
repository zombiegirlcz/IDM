package com.revolut.core.ui_kit.delegates;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.swipeablecards.SwipeableCardContentHeaderView;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.ij0;
import ip0.jj0;
import ip0.kj0;
import ip0.ri0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0003\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/SwipeableCardsHeaderDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/jj0;", "Lip0/kj0;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SwipeableCardsHeaderDelegate extends BaseRecyclerViewDelegate<jj0, kj0> {
    public SwipeableCardsHeaderDelegate() {
        super(R$layout.internal_delegate_swipeable_cards_header, new ri0(3));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new kj0(kotlin.jvm.internal.s.r(parent, this.f98535a));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
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
    public final void p(kj0 holder, jj0 data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        SwipeableCardContentHeaderView swipeableCardContentHeaderView = holder.f;
        ArrayList<ij0> arrayList = new ArrayList();
        for (Object obj2 : payloads) {
            if (obj2 instanceof ij0) {
                arrayList.add(obj2);
            }
        }
        if (arrayList.isEmpty()) {
            swipeableCardContentHeaderView.setSmallTitleStart(data.f164850b);
            swipeableCardContentHeaderView.setSmallTitleEnd(data.f164851c);
            swipeableCardContentHeaderView.setBigTitle(data.d);
            return;
        }
        for (ij0 ij0Var : arrayList) {
            if (ij0Var.f164705a) {
                swipeableCardContentHeaderView.setSmallTitleStart(data.f164850b);
            }
            if (ij0Var.f164706b) {
                swipeableCardContentHeaderView.setSmallTitleEnd(data.f164851c);
            }
            if (ij0Var.f164707c) {
                swipeableCardContentHeaderView.setBigTitle(data.d);
            }
        }
    }
}
