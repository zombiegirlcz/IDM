package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0005\u0002\u0006\u0007\b\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ActionsDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/z;", "Lip0/b0;", "<init>", "()V", "ip0/a0", "ip0/y", "ip0/x", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ActionsDelegate extends BaseRecyclerViewDelegate<ip0.z, ip0.b0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e01.a f51611c;
    public final e01.a d;
    public final e01.a e;
    public final Object f;

    public ActionsDelegate() {
        super(R$layout.internal_delegate_actions, new ip0.c(6));
        this.f51611c = new e01.a();
        this.d = new e01.a();
        this.e = new e01.a();
        this.f = yhm.j.c(yhm.k.NONE, new il9.p(11));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ip0.b0 b0Var = new ip0.b0(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_actions));
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ColorDrawable colorDrawable = new ColorDrawable(kli.a.s(R$attr.uikit_colorBackground, context));
        Context context2 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        aw0.x8 x8VarD = ix0.s0.d(colorDrawable, context2, aw0.s8.DEFAULT);
        b0Var.f.r(x8VarD.f10609a, x8VarD.f10610b, x8VarD.f10611c, x8VarD.e);
        return b0Var;
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(ip0.b0 holder, ip0.z data, int i, List payloads) {
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        View view = holder.f163510g;
        ActionsView actionsView = holder.f;
        List list = payloads;
        boolean zIsEmpty = list.isEmpty();
        boolean zIsEmpty2 = list.isEmpty();
        boolean zIsEmpty3 = list.isEmpty();
        boolean zIsEmpty4 = list.isEmpty();
        boolean zIsEmpty5 = list.isEmpty();
        Iterator it8 = payloads.iterator();
        while (true) {
            i2 = 0;
            i3 = 1;
            if (!it8.hasNext()) {
                break;
            }
            Object next = it8.next();
            if (next instanceof ip0.a0) {
                zIsEmpty = zIsEmpty || ((ip0.a0) next).f163356a;
                zIsEmpty2 = zIsEmpty2 || ((ip0.a0) next).f163357b;
                zIsEmpty3 = zIsEmpty3 || ((ip0.a0) next).f163358c;
                zIsEmpty4 = zIsEmpty4 || ((ip0.a0) next).d;
                zIsEmpty5 = zIsEmpty5 || ((ip0.a0) next).e;
            }
        }
        if (zIsEmpty) {
            List list2 = data.f167369b;
            mx0.v vVar = data.e ? mx0.u.f210025a : mx0.t.f210002a;
            ActionsView.Companion companion = ActionsView.INSTANCE;
            actionsView.i(list2, vVar, true);
        }
        if (zIsEmpty2) {
            actionsView.setLayoutType(data.d);
        }
        if (data.f) {
            view.setOnClickListener(new ap0.f(this, data, 15));
            Context context = actionsView.getContext();
            Intrinsics.h(context);
            or0.u.l(view, kli.a.w(data.f167376n, context), kli.a.w(data.f167374l, context), kli.a.w(data.o, context), kli.a.w(data.f167375m, context));
        } else {
            view.setOnClickListener(null);
            or0.u.d(view);
        }
        if (zIsEmpty5) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.b.c(this, data, itemView, false, null, 28);
        }
        efm.r map = actionsView.f58296a.f121375b.map(new ihd.c(28, new ip0.v(data, i2)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        this.f51611c.a(map, holder);
        efm.r map2 = actionsView.f58297b.f121375b.map(new ihd.c(29, new ip0.v(data, i3)));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        this.d.a(map2, holder);
        efm.r map3 = actionsView.f58298c.f121375b.map(new ip0.w(new ip0.v(data, 2), i2));
        Intrinsics.checkNotNullExpressionValue(map3, "map(...)");
        this.e.a(map3, holder);
    }
}
