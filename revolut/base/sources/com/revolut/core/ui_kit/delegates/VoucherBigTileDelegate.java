package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.flexbox.FlexboxLayout;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.qn0;
import ip0.rn0;
import ip0.sn0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0002\u0006\u0007\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/VoucherBigTileDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/vi;", "Lip0/sn0;", "<init>", "()V", "a", "ip0/rn0", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@yhm.d
public final class VoucherBigTileDelegate extends BaseRecyclerViewDelegate<vi, sn0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f53592c;

    public static abstract class a {

        /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.VoucherBigTileDelegate$a$a, reason: collision with other inner class name */
        public static final class C0429a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0429a f53593a = new C0429a();

            private C0429a() {
            }
        }

        public static final class b extends a {
            private b() {
            }
        }

        private a() {
        }
    }

    public VoucherBigTileDelegate() {
        super(R$layout.internal_delegate_voucher_big_tile, new qn0(0));
        this.f53592c = v0.a.d("create(...)");
    }

    public static void q(vi viVar, sn0 sn0Var) {
        ComplexImage.Regular regular = viVar.f54886a;
        sn0Var.f166372g.setVisibility(0);
        sn0Var.f166373h.setVisibility(8);
        sn0Var.i.setVisibility(8);
        sn0Var.f166374j.d(false);
        sn0Var.f.setClipChildren(true);
        View view = sn0Var.itemView;
        yy0.f.e(h30.l.z(view, "itemView", view), regular.f55837a, sn0Var.f166372g, null, null, 12);
    }

    public static void r(vi viVar, sn0 sn0Var) {
        viVar.getClass();
        Context context = sn0Var.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iC = io0.a.c(context, new Color.Opaque(R$attr.uikit_colorGrey50, 0.1f));
        View view = sn0Var.f166375l;
        view.setBackgroundColor(iC);
        view.setVisibility(8);
        sn0Var.k.setVisibility(8);
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new sn0(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_voucher_big_tile));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(sn0 holder, vi data, int i, List payloads) {
        vi viVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        TextView textView = holder.f166377n;
        FlexboxLayout flexboxLayout = holder.f166376m;
        if (payloads.isEmpty()) {
            q(data, holder);
            r(data, holder);
            flexboxLayout.removeAllViews();
            flexboxLayout.setVisibility(8);
            or0.b.e(this, null, textView, null, 12);
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            viVar = data;
            or0.b.c(this, viVar, itemView, false, null, 28);
        } else {
            List list = payloads;
            ArrayList<rn0> arrayList = new ArrayList(zhm.w.t(list, 10));
            for (Object obj2 : list) {
                Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.core.ui_kit.delegates.VoucherBigTileDelegate.Payload");
                arrayList.add((rn0) obj2);
            }
            for (rn0 rn0Var : arrayList) {
                if (rn0Var.f166215a) {
                    q(data, holder);
                }
                if (rn0Var.f166216b) {
                    r(data, holder);
                }
                if (rn0Var.f166217c) {
                    data.getClass();
                    flexboxLayout.removeAllViews();
                    flexboxLayout.setVisibility(8);
                    or0.b.e(this, null, textView, null, 12);
                }
            }
            viVar = data;
        }
        fp0.p pVar = holder.o;
        fp0.p.b(pVar, true);
        View view = pVar.f137029a;
        or0.m.a(view);
        view.setOnClickListener(new au0.r2(this, viVar, 11));
    }
}
