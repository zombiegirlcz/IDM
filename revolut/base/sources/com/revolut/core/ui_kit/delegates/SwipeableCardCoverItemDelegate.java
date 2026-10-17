package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.UiKitMediaView;
import com.revolut.core.ui_kit.internal.views.swipeablecards.cover.SwipeableCardCoverHeaderView;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.fg0;
import ip0.fi0;
import ip0.ii0;
import ip0.je0;
import ip0.ji0;
import ip0.ki0;
import ip0.li0;
import ip0.ws;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0003\u0002\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/SwipeableCardCoverItemDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/ii0;", "Lip0/ki0;", "<init>", "()V", "ip0/ji0", "ip0/hi0", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SwipeableCardCoverItemDelegate extends BaseRecyclerViewDelegate<ii0, ki0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f53509c;
    public final ihm.f d;
    public final e01.a e;
    public final e01.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e01.a f53510g;

    public SwipeableCardCoverItemDelegate() {
        super(R$layout.internal_delegate_swipeable_card_cover, new je0(28));
        this.f53509c = v0.a.d("create(...)");
        this.d = v0.a.d("create(...)");
        this.e = new e01.a();
        this.f = new e01.a();
        this.f53510g = new e01.a();
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ki0(kotlin.jvm.internal.s.r(parent, this.f98535a));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v13, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v15, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
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
    public final void p(ki0 holder, ii0 data, int i, List payloads) {
        boolean z;
        boolean z3;
        boolean z4;
        boolean z6;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        UiKitMediaView uiKitMediaView = holder.f;
        View view = holder.itemView;
        SwipeableCardCoverHeaderView swipeableCardCoverHeaderView = holder.f165023g;
        view.setOnClickListener(new ws(this, data, 23));
        View view2 = holder.itemView;
        int i2 = 0;
        view2.setOnTouchListener(new li0(this, view2.getContext(), i2));
        ActionFooterView actionFooterView = holder.f165024h;
        efm.r map = actionFooterView.f.map(new fg0(new fi0(data, i2), 5));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        this.e.a(map, holder);
        efm.r map2 = actionFooterView.f58955g.map(new fg0(new fi0(data, 1), 6));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        this.f.a(map2, holder);
        this.f53510g.a(actionFooterView.e, holder);
        int size = payloads.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                break;
            }
            if (!(payloads.get(i3) instanceof ji0)) {
                payloads = null;
                break;
            }
            i3++;
        }
        List list = payloads;
        boolean z11 = list == null || list.isEmpty();
        if (payloads != null) {
            int size2 = payloads.size();
            z = z11;
            z3 = z;
            z4 = z3;
            z6 = z4;
            for (int i5 = 0; i5 < size2; i5++) {
                ji0 ji0Var = (ji0) payloads.get(i5);
                z11 = z11 || ji0Var.f164844a;
                z = z || ji0Var.f164845b.f164426a;
                z3 = z3 || ji0Var.f164845b.f164427b;
                z4 = z4 || ji0Var.f164845b.f164428c;
                z6 = z6 || ji0Var.f164846c;
            }
        } else {
            z = z11;
            z3 = z;
            z4 = z3;
            z6 = z4;
        }
        if (z11) {
            ((jz0.b) or0.u.k(uiKitMediaView).a0()).b(data.f164697b, uiKitMediaView, null);
        }
        if (z) {
            swipeableCardCoverHeaderView.setSmallTitle(data.f164698c.f164564a);
        }
        if (z3) {
            swipeableCardCoverHeaderView.setBigTitle(data.f164698c.f164565b);
        }
        if (z4) {
            swipeableCardCoverHeaderView.setSubtitle(data.f164698c.f164566c);
        }
        if (z6) {
            if (data.d == null) {
                actionFooterView.setVisibility(8);
            } else {
                actionFooterView.setVisibility(0);
                actionFooterView.setModel(data.d);
            }
        }
    }
}
