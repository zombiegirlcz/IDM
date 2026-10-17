package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.R$string;
import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.core.ui_kit.internal.delegates.SuggestionDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.e70;
import ip0.ep0;
import ip0.fp0;
import ip0.gp0;
import ip0.hp0;
import ip0.ip0;
import ip0.lh0;
import ip0.qn0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0003\u0002\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/WeekdayPickerDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/fp0;", "Lip0/hp0;", "<init>", "()V", "ip0/ep0", "ip0/gp0", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WeekdayPickerDelegate extends BaseRecyclerViewDelegate<fp0, hp0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f53639c;

    public WeekdayPickerDelegate() {
        super(R$layout.internal_delegate_weekday_picker, new qn0(9));
        this.f53639c = te0.w.y0(new e70(18));
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewR = kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_weekday_picker);
        z4l.j jVar = new z4l.j(new koi.c(zhm.u.c((SuggestionDelegate) this.f53639c.getValue())), false, 14);
        ((RecyclerView) viewR.findViewById(R$id.weekdayPicker_recyclerView)).setAdapter(jVar);
        hp0 hp0Var = new hp0(viewR, jVar);
        RecyclerView recyclerView = hp0Var.f164588h;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        return hp0Var;
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(hp0 holder, fp0 data, int i, List payloads) {
        List list;
        int i2;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        List list2 = payloads;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            list = payloads;
        } else {
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                if (!(it8.next() instanceof gp0)) {
                    list = null;
                    break;
                }
            }
            list = payloads;
        }
        if (list == null) {
            list = zhm.f0.f322471a;
        }
        Intrinsics.i(list, "null cannot be cast to non-null type kotlin.collections.List<com.revolut.core.ui_kit.delegates.WeekdayPickerDelegate.Payload>");
        boolean zIsEmpty = list.isEmpty();
        int size = payloads.size();
        boolean z = zIsEmpty;
        boolean z3 = z;
        for (int i3 = 0; i3 < size; i3++) {
            gp0 gp0Var = (gp0) list.get(i3);
            zIsEmpty = zIsEmpty || gp0Var.f164460a;
            z = z || gp0Var.f164461b;
            z3 = z3 || gp0Var.f164462c;
        }
        if (zIsEmpty) {
            TextView textView = holder.f164587g;
            data.getClass();
            kli.a.b(textView, null, ty0.f.f275450a);
        }
        if (z) {
            z4l.j jVar = holder.f;
            ep0[] ep0VarArrValues = ep0.values();
            ArrayList arrayList = new ArrayList(ep0VarArrValues.length);
            int length = ep0VarArrValues.length;
            for (int i5 = 0; i5 < length; i5++) {
                ep0 ep0Var = ep0VarArrValues[i5];
                String strName = ep0Var.name();
                switch (ip0.f164733a[ep0Var.ordinal()]) {
                    case 1:
                        i2 = R$string.uikit_weekday_monday_short;
                        break;
                    case 2:
                        i2 = R$string.uikit_weekday_tuesday_short;
                        break;
                    case 3:
                        i2 = R$string.uikit_weekday_wednesday_short;
                        break;
                    case 4:
                        i2 = R$string.uikit_weekday_thursday_short;
                        break;
                    case 5:
                        i2 = R$string.uikit_weekday_friday_short;
                        break;
                    case 6:
                        i2 = R$string.uikit_weekday_saturday_short;
                        break;
                    case 7:
                        i2 = R$string.uikit_weekday_sunday_short;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                arrayList.add(new SuggestionsBarDelegate.Suggestion(strName, new TextLocalisedClause(i2, null, null, 14), null, data.f164294a == ep0Var ? lh0.ACCENT : lh0.SEMIACCENT, null, false, ep0Var, null, 372));
            }
            ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
            Iterator it9 = arrayList.iterator();
            while (it9.hasNext()) {
                arrayList2.add(new com.revolut.core.ui_kit.internal.delegates.a((SuggestionsBarDelegate.Suggestion) it9.next()));
            }
            jVar.c(arrayList2);
        }
        if (z3) {
            TextView textView2 = holder.i;
            data.getClass();
            kli.a.b(textView2, null, ty0.f.f275450a);
        }
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        or0.b.c(this, data, itemView, false, null, 28);
    }
}
