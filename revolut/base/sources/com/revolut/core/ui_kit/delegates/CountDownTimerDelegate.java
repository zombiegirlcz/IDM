package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.timer.CountDownTimerView;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0003\u0002\u0007\bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/CountDownTimerDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/id;", "Lip0/kd;", "<init>", "()V", "Companion", "ip0/jd", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CountDownTimerDelegate extends BaseRecyclerViewDelegate<ip0.id, ip0.kd> {
    public CountDownTimerDelegate() {
        super(R$layout.internal_delegate_count_down_timer, new ip0.lb(11));
    }

    public static void p(ip0.kd kdVar, ip0.id idVar) {
        idVar.getClass();
        kdVar.f.setVisibility(8);
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ip0.kd(kotlin.jvm.internal.s.r(parent, this.f98535a));
    }

    public final void q(TextLocalisedClause textLocalisedClause, TextView textView, ev0.d dVar) {
        int iS;
        Context context = textView.getContext();
        int i = ip0.ld.f165188a[dVar.ordinal()];
        if (i == 1) {
            Intrinsics.h(context);
            iS = kli.a.s(R$attr.uikit_colorForeground, context);
        } else if (i == 2) {
            Intrinsics.h(context);
            iS = kli.a.s(R$attr.uikit_colorBlack, context);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            Intrinsics.h(context);
            iS = kli.a.s(R$attr.uikit_colorWhite, context);
        }
        textView.setTextColor(iS);
        or0.b.e(this, textLocalisedClause, textView, null, 12);
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final void p(ip0.kd holder, ip0.id data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        View view = holder.f164995j;
        TextView textView = holder.i;
        TextView textView2 = holder.f164994h;
        CountDownTimerView countDownTimerView = holder.f164993g;
        if (payloads.isEmpty()) {
            ev0.c cVar = data.f164674c;
            ev0.d dVar = data.e;
            countDownTimerView.setMode(cVar);
            countDownTimerView.setLabels(data.d);
            countDownTimerView.setTheme(dVar);
            ip0.gd gdVar = data.f164673b;
            if (gdVar == null) {
                throw new NoWhenBranchMatchedException();
            }
            countDownTimerView.setExpirationTime(Long.valueOf(gdVar.f164399a));
            q(data.f, textView2, dVar);
            q(null, textView, dVar);
            p(holder, data);
            view.setVisibility(8);
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.b.c(this, data, itemView, false, null, 28);
            return;
        }
        List list = payloads;
        ArrayList<ip0.jd> arrayList = new ArrayList(zhm.w.t(list, 10));
        for (Object obj2 : list) {
            Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.core.ui_kit.delegates.CountDownTimerDelegate.Payload");
            arrayList.add((ip0.jd) obj2);
        }
        for (ip0.jd jdVar : arrayList) {
            if (jdVar.e) {
                q(data.f, textView2, data.e);
            }
            if (jdVar.f) {
                data.getClass();
                q(null, textView, data.e);
            }
            if (jdVar.f164818g) {
                p(holder, data);
            }
            if (jdVar.f164819h) {
                data.getClass();
                view.setVisibility(8);
            }
            if (jdVar.f164816b) {
                countDownTimerView.setMode(data.f164674c);
            }
            if (jdVar.f164817c) {
                countDownTimerView.setLabels(data.d);
            }
            if (jdVar.d) {
                countDownTimerView.setTheme(data.e);
            }
            if (jdVar.f164815a) {
                ip0.gd gdVar2 = data.f164673b;
                if (gdVar2 == null) {
                    throw new NoWhenBranchMatchedException();
                }
                countDownTimerView.setExpirationTime(Long.valueOf(gdVar2.f164399a));
            }
            if (jdVar.i) {
                View itemView2 = holder.itemView;
                Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
                or0.b.c(this, data, itemView2, false, null, 28);
            }
        }
    }
}
