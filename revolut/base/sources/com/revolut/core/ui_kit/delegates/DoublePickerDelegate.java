package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.PickerView;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import com.youTransactor.uCube.rpc.Constants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0005\u0002\u0006\u0007\b\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/DoublePickerDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/re;", "Lip0/ve;", "<init>", "()V", "ip0/se", "ip0/ue", "ip0/te", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DoublePickerDelegate extends BaseRecyclerViewDelegate<ip0.re, ip0.ve> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f52193c;
    public final ihm.f d;

    public DoublePickerDelegate() {
        super(R$layout.internal_delegate_double_picker, new ip0.lb(22));
        this.f52193c = v0.a.d("create(...)");
        this.d = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ip0.ve(kotlin.jvm.internal.s.r(parent, this.f98535a));
    }

    /* JADX WARN: Type inference failed for: r13v1, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v12, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v19, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v5, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(ip0.ve holder, ip0.re data, int i, List payloads) {
        Integer num;
        Integer num2;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        PickerView pickerView = holder.f;
        TextView textView = holder.i;
        TextView textView2 = holder.f166809h;
        pickerView.setOnValueChangedListener(new ip0.qe(this, data, 0));
        PickerView pickerView2 = holder.f166808g;
        pickerView2.setOnValueChangedListener(new ip0.qe(this, data, 1));
        if (payloads.isEmpty()) {
            pickerView.setMaxValue(0);
            ip0.te teVar = data.f166162b;
            ip0.te teVar2 = data.f166163c;
            ArrayList<ip0.ue> arrayList = teVar.f166510b;
            ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
            for (ip0.ue ueVar : arrayList) {
                ty0.c cVarB0 = or0.u.k(pickerView).b0();
                ?? r142 = ueVar.f166646a;
                Context context = pickerView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                arrayList2.add(ty0.c.a(cVarB0, r142, context, null, null, null, null, Constants.TAG_FC_SPEED_MODE).toString());
            }
            pickerView.setDisplayedValues((String[]) arrayList2.toArray(new String[0]));
            pickerView.setMaxValue(teVar.d);
            pickerView.setMinValue(0);
            Integer num3 = teVar.f166511c;
            if (num3 != null) {
                pickerView.setValue(num3.intValue());
            }
            kli.a.b(textView2, teVar.f166509a, ty0.f.f275450a);
            pickerView2.setMaxValue(0);
            ArrayList<ip0.ue> arrayList3 = teVar2.f166510b;
            ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
            for (ip0.ue ueVar2 : arrayList3) {
                ty0.c cVarB02 = or0.u.k(pickerView2).b0();
                ?? r132 = ueVar2.f166646a;
                Context context2 = pickerView2.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                arrayList4.add(ty0.c.a(cVarB02, r132, context2, null, null, null, null, Constants.TAG_FC_SPEED_MODE).toString());
            }
            pickerView2.setDisplayedValues((String[]) arrayList4.toArray(new String[0]));
            pickerView2.setMaxValue(teVar2.d);
            pickerView2.setMinValue(0);
            Integer num4 = teVar2.f166511c;
            if (num4 != null) {
                pickerView2.setValue(num4.intValue());
            }
            kli.a.b(textView, teVar2.f166509a, ty0.f.f275450a);
        } else {
            for (Object obj2 : payloads) {
                Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.core.ui_kit.delegates.DoublePickerDelegate.Payload");
                ip0.se seVar = (ip0.se) obj2;
                if (seVar.d) {
                    pickerView.setMaxValue(0);
                    ArrayList<ip0.ue> arrayList5 = data.f166162b.f166510b;
                    ArrayList arrayList6 = new ArrayList(zhm.w.t(arrayList5, 10));
                    for (ip0.ue ueVar3 : arrayList5) {
                        ty0.c cVarB03 = or0.u.k(pickerView).b0();
                        ?? r143 = ueVar3.f166646a;
                        Context context3 = pickerView.getContext();
                        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                        arrayList6.add(ty0.c.a(cVarB03, r143, context3, null, null, null, null, Constants.TAG_FC_SPEED_MODE).toString());
                    }
                    pickerView.setDisplayedValues((String[]) arrayList6.toArray(new String[0]));
                    pickerView.setMaxValue(data.f166162b.d);
                }
                if (seVar.f166339b) {
                    pickerView.setMaxValue(data.f166162b.d);
                }
                if (seVar.f166340c) {
                    ip0.te teVar3 = data.f166162b;
                    pickerView.setMinValue(0);
                }
                if (seVar.f166338a && (num2 = data.f166162b.f166511c) != null) {
                    pickerView.setValue(num2.intValue());
                }
                if (seVar.i) {
                    pickerView2.setMaxValue(0);
                    ArrayList<ip0.ue> arrayList7 = data.f166163c.f166510b;
                    ArrayList arrayList8 = new ArrayList(zhm.w.t(arrayList7, 10));
                    for (ip0.ue ueVar4 : arrayList7) {
                        ty0.c cVarB04 = or0.u.k(pickerView2).b0();
                        ?? r144 = ueVar4.f166646a;
                        Context context4 = pickerView2.getContext();
                        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                        arrayList8.add(ty0.c.a(cVarB04, r144, context4, null, null, null, null, Constants.TAG_FC_SPEED_MODE).toString());
                    }
                    pickerView2.setDisplayedValues((String[]) arrayList8.toArray(new String[0]));
                    pickerView2.setMaxValue(data.f166163c.d);
                }
                if (seVar.f166341g) {
                    pickerView2.setMaxValue(data.f166163c.d);
                }
                if (seVar.f166342h) {
                    ip0.te teVar4 = data.f166163c;
                    pickerView2.setMinValue(0);
                }
                if (seVar.f && (num = data.f166163c.f166511c) != null) {
                    pickerView2.setValue(num.intValue());
                }
                if (seVar.e) {
                    kli.a.b(textView2, data.f166162b.f166509a, ty0.f.f275450a);
                }
                if (seVar.f166343j) {
                    kli.a.b(textView, data.f166163c.f166509a, ty0.f.f275450a);
                }
            }
        }
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        or0.b.c(this, data, itemView, false, null, 28);
    }
}
