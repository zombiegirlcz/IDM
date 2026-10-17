package u90;

import com.revolut.feature.backend_flow.domain.models.BackendItem;
import com.revolut.feature.backend_flow.domain.models.CheckboxTextInputItem;
import com.revolut.feature.backend_flow.domain.models.MoneyInputItem;
import com.revolut.feature.backend_flow.domain.models.RadioButtonTextInputItem;
import com.revolut.feature.backend_flow.domain.models.SelectedTransaction;
import com.revolut.feature.backend_flow.domain.models.SelectionStyle;
import com.revolut.feature.backend_flow.domain.models.SignatureInputItem;
import com.revolut.feature.backend_flow.domain.models.TransactionsSelectionItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import q90.d4;
import q90.e3;
import q90.e4;
import q90.f4;
import q90.g4;
import q90.i3;
import q90.k3;
import q90.l2;
import q90.o2;
import q90.q3;

/* JADX INFO: loaded from: classes19.dex */
public final class k extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f278321a;

    public k(t90.l selectionStyleMapper) {
        this.f278321a = 4;
        Intrinsics.checkNotNullParameter(selectionStyleMapper, "selectionStyleMapper");
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0253 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01ee A[SYNTHETIC] */
    @Override // u90.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.feature.backend_flow.domain.models.BackendItem a(q90.v r21, java.util.List r22) {
        /*
            Method dump skipped, instruction units count: 720
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u90.k.a(q90.v, java.util.List):com.revolut.feature.backend_flow.domain.models.BackendItem");
    }

    @Override // u90.c
    public final q90.v b(BackendItem backendItem) {
        e3 e3Var;
        String str;
        e3 e3Var2;
        String str2;
        switch (this.f278321a) {
            case 0:
                CheckboxTextInputItem item = (CheckboxTextInputItem) backendItem;
                Intrinsics.checkNotNullParameter(item, "item");
                String str3 = item.f63352a;
                boolean z = item.f63353b;
                String str4 = item.d;
                String str5 = item.e;
                boolean z3 = item.f63354c;
                if (z3) {
                    String str6 = item.f;
                    if (str6 == null) {
                        str6 = "";
                    }
                    e3Var = new e3(z3, new q3(str6));
                } else {
                    e3Var = null;
                }
                return new k3(str3, z, null, str4, str5, e3Var);
            case 1:
                MoneyInputItem item2 = (MoneyInputItem) backendItem;
                Intrinsics.checkNotNullParameter(item2, "item");
                String str7 = item2.f63529a;
                ArrayList arrayList = item2.f63530b;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                Iterator it8 = arrayList.iterator();
                while (it8.hasNext()) {
                    arrayList2.add(((xi0.b) it8.next()).f306286a);
                }
                Long l2 = item2.f63531c;
                o2 o2Var = l2 != null ? new o2(l2.longValue(), item2.d.f306286a) : null;
                xl2.w style = item2.e;
                Intrinsics.checkNotNullParameter(style, "style");
                int i = t90.k.f268943a[style.ordinal()];
                if (i == 1) {
                    str = "DEFAULT";
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "WITHOUT_CURRENCY_CODE";
                }
                return new l2(str7, o2Var, arrayList2, str, item2.f, item2.f63532g, Boolean.valueOf(item2.f63533h));
            case 2:
                RadioButtonTextInputItem item3 = (RadioButtonTextInputItem) backendItem;
                Intrinsics.checkNotNullParameter(item3, "item");
                String str8 = item3.f63593a;
                boolean z4 = item3.f63594b;
                Integer num = item3.f63595c;
                String str9 = item3.e;
                String str10 = item3.f;
                boolean z6 = item3.d;
                if (z6) {
                    String str11 = item3.f63596g;
                    if (str11 == null) {
                        str11 = "";
                    }
                    e3Var2 = new e3(z6, new q3(str11));
                } else {
                    e3Var2 = null;
                }
                return new k3(str8, z4, num, str9, str10, e3Var2);
            case 3:
                SignatureInputItem item4 = (SignatureInputItem) backendItem;
                Intrinsics.checkNotNullParameter(item4, "item");
                String str12 = item4.f63627a;
                String str13 = item4.f63628b;
                return new i3(str12, str13 != null ? new q3(str13) : null, item4.e, item4.f, item4.f63630g, item4.d, item4.i);
            default:
                TransactionsSelectionItem item5 = (TransactionsSelectionItem) backendItem;
                Intrinsics.checkNotNullParameter(item5, "item");
                String str14 = item5.f63704a;
                boolean z11 = item5.f63705b;
                SelectionStyle style2 = item5.f63707g;
                Integer numB = t90.l.b(style2);
                String str15 = item5.f63706c;
                d4 d4Var = new d4(item5.e);
                Set set = item5.d;
                ArrayList arrayList3 = new ArrayList(zhm.w.t(set, 10));
                for (Iterator it9 = set.iterator(); it9.hasNext(); it9 = it9) {
                    SelectedTransaction selectedTransaction = (SelectedTransaction) it9.next();
                    String str16 = selectedTransaction.f63604a;
                    String str17 = selectedTransaction.f63605b;
                    dj0.d dVar = selectedTransaction.f63606c;
                    arrayList3.add(new f4(str16, str17, new o2(dVar.f115082a, dVar.f115083b.f306286a), selectedTransaction.d));
                    str14 = str14;
                }
                String str18 = str14;
                g4 g4Var = new g4(arrayList3);
                String str19 = (String) zhm.d0.c0(item5.f);
                Intrinsics.checkNotNullParameter(style2, "style");
                if (style2 instanceof SelectionStyle.SingleSelection) {
                    str2 = "SINGLE_SELECTION";
                } else {
                    if (!(style2 instanceof SelectionStyle.MultiSelection)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str2 = "MULTI_SELECTION";
                }
                return new e4(str18, z11, numB, str15, d4Var, g4Var, str19, str2);
        }
    }

    public k(g0 moneyValidationMapper) {
        this.f278321a = 1;
        Intrinsics.checkNotNullParameter(moneyValidationMapper, "moneyValidationMapper");
    }

    public k(z0 validationMapper, int i) {
        this.f278321a = i;
        switch (i) {
            case 2:
                Intrinsics.checkNotNullParameter(validationMapper, "validationMapper");
                break;
            case 3:
                Intrinsics.checkNotNullParameter(validationMapper, "validationMapper");
                break;
            default:
                Intrinsics.checkNotNullParameter(validationMapper, "validationMapper");
                break;
        }
    }
}
