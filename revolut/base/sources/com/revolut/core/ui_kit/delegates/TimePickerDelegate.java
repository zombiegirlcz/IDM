package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.timepicker.TimePickerView;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.cl0;
import ip0.dl0;
import ip0.el0;
import ip0.ri0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0002\u0006\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/TimePickerDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/cl0;", "Lip0/el0;", "<init>", "()V", "ip0/dl0", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TimePickerDelegate extends BaseRecyclerViewDelegate<cl0, el0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f53554c;

    public TimePickerDelegate() {
        super(R$layout.internal_delegate_time_picker, new ri0(12));
        this.f53554c = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new el0(kotlin.jvm.internal.s.r(parent, this.f98535a));
    }

    public final efm.r p() {
        efm.r rVarHide = this.f53554c.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
        return rVarHide;
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void p(el0 holder, cl0 data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        TimePickerView timePickerView = holder.f;
        boolean zIsEmpty = payloads.isEmpty();
        boolean zIsEmpty2 = payloads.isEmpty();
        for (Object obj2 : payloads) {
            Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.core.ui_kit.delegates.TimePickerDelegate.Payload");
            dl0 dl0Var = (dl0) obj2;
            zIsEmpty = zIsEmpty || dl0Var.f163920a;
            zIsEmpty2 = zIsEmpty2 || dl0Var.f163921b;
        }
        if (zIsEmpty) {
            timePickerView.setTime(data.f163754b);
        }
        if (zIsEmpty2) {
            aw0.ma maVar = data.f163755c;
            if (maVar != null) {
                timePickerView.setTimeFormat(maVar);
            } else {
                timePickerView.setTimeFormatForCurrentLocale();
            }
        }
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        or0.b.c(this, data, itemView, false, null, 28);
        timePickerView.setOnTimeChangedListener(new abf.c(this, data, 25));
    }
}
