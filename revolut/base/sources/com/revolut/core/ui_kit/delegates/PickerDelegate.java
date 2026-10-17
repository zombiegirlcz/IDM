package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.PickerView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import com.youTransactor.uCube.rpc.Constants;
import ip0.a10;
import ip0.b10;
import ip0.c10;
import ip0.d10;
import ip0.tz;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0006\u0002\u0007\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/PickerDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/a10;", "Lip0/d10;", "<init>", "()V", "ip0/b10", "ip0/c10", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PickerDelegate extends BaseRecyclerViewDelegate<a10, d10> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f52922c;

    public PickerDelegate() {
        super(R$layout.internal_delegate_picker, new tz(10));
        this.f52922c = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new d10(kotlin.jvm.internal.s.r(parent, this.f98535a));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(d10 holder, a10 data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        PickerView pickerView = holder.f;
        pickerView.setOnValueChangedListener(new ip0.qe(this, data, 2));
        if (payloads.isEmpty()) {
            pickerView.setMaxValue(0);
            List<c10> list = data.f163364b;
            ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
            for (c10 c10Var : list) {
                ty0.c cVarB0 = or0.u.k(pickerView).b0();
                Clause clause = c10Var.f163672a;
                Context context = pickerView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                arrayList.add(ty0.c.a(cVarB0, clause, context, null, null, null, null, Constants.TAG_FC_SPEED_MODE).toString());
            }
            pickerView.setDisplayedValues((String[]) arrayList.toArray(new String[0]));
            pickerView.setMaxValue(data.d);
            pickerView.setMinValue(0);
            pickerView.setValue(data.f163365c);
        } else {
            for (Object obj2 : payloads) {
                Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.core.ui_kit.delegates.PickerDelegate.Payload");
                b10 b10Var = (b10) obj2;
                if (b10Var.d) {
                    pickerView.setMaxValue(0);
                    List<c10> list2 = data.f163364b;
                    ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                    for (c10 c10Var2 : list2) {
                        ty0.c cVarB02 = or0.u.k(pickerView).b0();
                        Clause clause2 = c10Var2.f163672a;
                        Context context2 = pickerView.getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                        arrayList2.add(ty0.c.a(cVarB02, clause2, context2, null, null, null, null, Constants.TAG_FC_SPEED_MODE).toString());
                    }
                    pickerView.setDisplayedValues((String[]) arrayList2.toArray(new String[0]));
                    pickerView.setMaxValue(data.d);
                }
                if (b10Var.f163515b) {
                    pickerView.setMaxValue(data.d);
                }
                if (b10Var.f163516c) {
                    data.getClass();
                    pickerView.setMinValue(0);
                }
                if (b10Var.f163514a) {
                    pickerView.setValue(data.f163365c);
                }
            }
        }
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        or0.b.c(this, data, itemView, false, null, 28);
    }
}
