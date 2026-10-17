package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0005\u0003\u0004\u0005\u0002\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ContainerDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/xc;", "Lip0/zc;", "ip0/sc", "ip0/vc", "ip0/yc", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ContainerDelegate extends BaseRecyclerViewDelegate<ip0.xc, ip0.zc> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f52123c;
    public final Function1 d;
    public final List e;
    public final ihm.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ihm.f f52124g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public rl8.d f52125h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContainerDelegate(List delegates, Function1 function1, int i) {
        super(R$id.containerDelegate_root, new ip0.lb(6));
        function1 = (i & 2) != 0 ? null : function1;
        zhm.f0 itemDecorations = zhm.f0.f322471a;
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        Intrinsics.checkNotNullParameter(itemDecorations, "itemDecorations");
        this.f52123c = delegates;
        this.d = function1;
        this.e = itemDecorations;
        this.f = v0.a.d("create(...)");
        this.f52124g = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.h(context);
        mx0.a5 a5Var = new mx0.a5(context, null, 0, 14);
        a5Var.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return new ip0.zc(this, a5Var);
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate, koi.k
    /* JADX INFO: renamed from: k */
    public final void n(RecyclerView.ViewHolder viewHolder) {
        ip0.zc holder = (ip0.zc) viewHolder;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(holder, "holder");
        rl8.d dVar = this.f52125h;
        if (dVar != null) {
            dVar.invoke(holder.f167442g, Integer.valueOf(holder.getAdapterPosition()));
        }
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void n(koi.b bVar) {
        ip0.zc holder = (ip0.zc) bVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(holder, "holder");
        rl8.d dVar = this.f52125h;
        if (dVar != null) {
            dVar.invoke(holder.f167442g, Integer.valueOf(holder.getAdapterPosition()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0171  */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(ip0.zc r19, ip0.xc r20, int r21, java.util.List r22) {
        /*
            Method dump skipped, instruction units count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.delegates.ContainerDelegate.p(ip0.zc, ip0.xc, int, java.util.List):void");
    }
}
