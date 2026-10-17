package m3j;

import aw0.o9;
import aw0.u0;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.domain.models.banktransfer.AccountFieldType;
import com.revolut.retail.feature.beneficiary.impl.R$string;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.cbeff.ISO781611;
import zhm.a0;
import zhm.f0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class h implements y2j.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n8b.a f202574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t70.g f202575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f202576c;

    public h(n8b.a countryInteractor, t70.g localization, d accountFieldStringsProvider, f enricher) {
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        Intrinsics.checkNotNullParameter(localization, "localization");
        Intrinsics.checkNotNullParameter(accountFieldStringsProvider, "accountFieldStringsProvider");
        Intrinsics.checkNotNullParameter(enricher, "enricher");
        this.f202574a = countryInteractor;
        this.f202575b = localization;
        this.f202576c = accountFieldStringsProvider;
    }

    public final ArrayList a(f5j.a beneficiary, boolean z) {
        Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
        ArrayList arrayList = new ArrayList();
        List listA = f.a(beneficiary);
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        for (Object obj2 : listA) {
            int i2 = i + 1;
            Object model = null;
            if (i < 0) {
                v.s();
                throw null;
            }
            Pair pair = (Pair) obj2;
            String str = (String) pair.f186385a;
            String str2 = (String) pair.f186386b;
            f5j.r rVar = beneficiary.f132335l;
            boolean z3 = z && i == 0;
            String strE = e(rVar, str);
            String strB = this.f202576c.b(str, str2);
            if (strE.length() != 0 && strB.length() != 0) {
                model = z3 ? new CellDetailsActionDelegate.Model("ID_EXTRAS_BENEFICIARY_FIELD".concat(str), new TextClause(strE, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, new ResourceImage(R$drawable.uikit_icn_24_pencil, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextClause(strB, (Style) null, Integer.valueOf(R$attr.uikit_colorAccent), false, (o9) null, (List) null, 122), false, false, u0.LARGE, null, 0, 0, ISO781611.BIOMETRIC_INFORMATION_TEMPLATE_TAG) : new CellDetailsDelegate.Model("ID_EXTRAS_BENEFICIARY_FIELD".concat(str), new TextClause(strE, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(strB, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, null, null, null, u0.LARGE, null, false, 0, 0, 32632);
            }
            if (model != null) {
                arrayList2.add(model);
            }
            i = i2;
        }
        a0.x(arrayList2, arrayList);
        arrayList.addAll(d(beneficiary.o, beneficiary.f132337n));
        return arrayList;
    }

    public final List b(Map map) {
        if (map == null) {
            return f0.f322471a;
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            d dVar = this.f202576c;
            arrayList.add(new CellDetailsDelegate.Model("ID_EXTRAS_BENEFICIARY_FIELD".concat(str), new TextClause(dVar.a(str), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(dVar.b(str, str2), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, null, null, null, u0.MEDIUM, null, false, 0, 0, 32632));
        }
        return arrayList;
    }

    public final String c(f5j.a beneficiary) {
        Map map;
        Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
        f5j.r rVar = beneficiary.f132335l;
        if ((rVar == null ? -1 : g.f202573a[rVar.ordinal()]) != 1 || (map = beneficiary.u) == null) {
            return null;
        }
        return (String) map.get("ALIAS_VALUE");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List d(java.lang.String r20, java.lang.String r21) {
        /*
            r19 = this;
            r0 = r20
            r1 = 14
            r2 = 0
            if (r0 == 0) goto L3f
            int r3 = r0.length()
            if (r3 <= 0) goto Lf
            r3 = r0
            goto L10
        Lf:
            r3 = r2
        L10:
            if (r3 == 0) goto L3f
            com.revolut.core.ui_kit.delegates.CellDetailsDelegate$Model r4 = new com.revolut.core.ui_kit.delegates.CellDetailsDelegate$Model
            com.revolut.core.ui_kit.models.TextLocalisedClause r6 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r3 = com.revolut.retail.feature.beneficiary.impl.R$string.bank_transfer_beneficiary_country_title
            r6.<init>(r3, r2, r2, r1)
            com.revolut.core.ui_kit.models.TextClause r7 = new com.revolut.core.ui_kit.models.TextClause
            r3 = r19
            n8b.a r5 = r3.f202574a
            o8b.c r5 = (o8b.c) r5
            java.lang.String r8 = r5.b(r0)
            r13 = 0
            r14 = 126(0x7e, float:1.77E-43)
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            r16 = 0
            r17 = 32760(0x7ff8, float:4.5907E-41)
            java.lang.String r5 = "ID_EXTRAS_BENEFICIARY_COUNTRY"
            r8 = 0
            r11 = 0
            r14 = 0
            r15 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            goto L42
        L3f:
            r3 = r19
            r4 = r2
        L42:
            if (r21 == 0) goto L76
            int r0 = r21.length()
            if (r0 <= 0) goto L4d
            r0 = r21
            goto L4e
        L4d:
            r0 = r2
        L4e:
            if (r0 == 0) goto L76
            com.revolut.core.ui_kit.delegates.CellDetailsDelegate$Model r5 = new com.revolut.core.ui_kit.delegates.CellDetailsDelegate$Model
            com.revolut.core.ui_kit.models.TextLocalisedClause r7 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r0 = com.revolut.retail.feature.beneficiary.impl.R$string.bank_transfer_beneficiary_currency_title
            r7.<init>(r0, r2, r2, r1)
            com.revolut.core.ui_kit.models.TextClause r8 = new com.revolut.core.ui_kit.models.TextClause
            r14 = 0
            r15 = 126(0x7e, float:1.77E-43)
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r9 = r21
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            r17 = 0
            r18 = 32760(0x7ff8, float:4.5907E-41)
            java.lang.String r6 = "ID_EXTRAS_BENEFICIARY_CURRENCY"
            r9 = 0
            r12 = 0
            r15 = 0
            r16 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r2 = r5
        L76:
            com.revolut.core.ui_kit.delegates.CellDetailsDelegate$Model[] r0 = new com.revolut.core.ui_kit.delegates.CellDetailsDelegate.Model[]{r4, r2}
            java.lang.String r1 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.util.List r0 = kotlin.collections.d.L(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m3j.h.d(java.lang.String, java.lang.String):java.util.List");
    }

    public final String e(f5j.r rVar, String str) {
        return (rVar == f5j.r.PAYID_ALIAS && Intrinsics.f(str, "ALIAS_VALUE")) ? this.f202575b.getString(R$string.transfer_review_alias_value_payid_name) : this.f202576c.a(str);
    }

    public final List f(f5j.a aVar, List list, Function2 function2) {
        Object next;
        Map map = aVar.u;
        if (map == null) {
            return f0.f322471a;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(((AccountFieldType) it8.next()).name());
        }
        Iterator it9 = arrayList.iterator();
        while (true) {
            if (!it9.hasNext()) {
                next = null;
                break;
            }
            next = it9.next();
            if (map.containsKey((String) next)) {
                break;
            }
        }
        String str = (String) next;
        if (str == null) {
            str = "";
        }
        String str2 = (String) map.get(str);
        List list3 = str2 != null ? (List) function2.invoke(str, str2) : null;
        if (list3 != null) {
            return list3;
        }
        List listA = f.a(aVar);
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        for (Object obj2 : listA) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            Pair pair = (Pair) obj2;
            List list4 = (List) function2.invoke((String) pair.f186385a, (String) pair.f186386b);
            if (list4 != null) {
                arrayList2.add(list4);
            }
            i = i2;
        }
        return w.u(arrayList2);
    }
}
