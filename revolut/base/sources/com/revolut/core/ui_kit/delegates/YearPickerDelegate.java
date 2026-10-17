package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.gridselector.GridHeaderView;
import com.revolut.core.ui_kit.internal.views.gridselector.GridSelectorView;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.fg0;
import ip0.qn0;
import ip0.rp0;
import ip0.up0;
import ip0.vp0;
import ip0.w10;
import ip0.wk;
import ip0.wp0;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0006\u0002\u0007\b\t\u0003\nB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u000b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/YearPickerDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/up0;", "Lip0/wp0;", "<init>", "()V", "Companion", "ip0/sp0", "ip0/vp0", "ip0/tp0", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class YearPickerDelegate extends BaseRecyclerViewDelegate<up0, wp0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e01.a f53650c;
    public final e01.a d;
    public final Custom e;
    public final Custom f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Custom f53651g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Custom f53652h;

    public YearPickerDelegate() {
        super(R$layout.internal_delegate_year_picker, new qn0(13));
        this.f53650c = new e01.a();
        this.d = new e01.a();
        this.e = new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254);
        this.f = new Custom(Integer.valueOf(R$attr.uikit_colorWhite), false, null, false, null, 254);
        this.f53651g = new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254);
        this.f53652h = new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone20), false, null, false, null, 254);
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new wp0(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_month_picker));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(java.util.List r35, ip0.up0 r36, ip0.wp0 r37) {
        /*
            Method dump skipped, instruction units count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.delegates.YearPickerDelegate.p(java.util.List, ip0.up0, ip0.wp0):void");
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void p(wp0 holder, up0 data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        p(payloads, data, holder);
        GridSelectorView gridSelectorView = holder.f;
        efm.r map = gridSelectorView.f57204a.p().map(new fg0(new w10(data, 23), 25));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        this.f53650c.a(map, holder);
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.f186408a = data.f166713b;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.f186409a = data.f166714c;
        efm.r map2 = gridSelectorView.f57204a.p().map(new fg0(new rp0(ref$ObjectRef, ref$IntRef, data), 26));
        GridHeaderView gridHeaderView = holder.f167055g;
        efm.r rVarDoOnNext = efm.r.merge(map2, gridHeaderView.f57197b.map(new fg0(new rp0(ref$IntRef, data, ref$ObjectRef, 1), 27)), gridHeaderView.f.map(new fg0(new rp0(ref$IntRef, data, ref$ObjectRef, 2), 28))).doOnNext(new fg0(new wk(this, holder, 14), 24));
        Intrinsics.h(rVarDoOnNext);
        this.d.a(rVarDoOnNext, holder);
        if (!payloads.isEmpty()) {
            List list = payloads;
            if ((list instanceof Collection) && list.isEmpty()) {
                return;
            }
            for (Object obj2 : list) {
                Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.core.ui_kit.delegates.YearPickerDelegate.Payload");
                if (((vp0) obj2).e) {
                }
            }
            return;
        }
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        or0.b.c(this, data, itemView, false, null, 28);
    }
}
