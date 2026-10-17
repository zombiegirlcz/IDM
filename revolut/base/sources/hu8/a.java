package hu8;

import a0.d;
import aw0.o9;
import ce9.m;
import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import com.revolut.core.ui_kit.delegates.CellDetailsListDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CountryImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import ez0.e;
import ip0.pb0;
import ip0.q7;
import ip0.vd0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import koi.j;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import my8.l;
import vim.f;
import yp0.b;
import zhm.d0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class a {
    private a() {
    }

    public static LayeredImage a(int i) {
        return LayeredImage.Companion.b(LayeredImage.INSTANCE, i, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 12.0f, Float.valueOf(56.0f), null, 32);
    }

    public static List b() {
        IntRange intRange = new IntRange(0, 1, 1);
        ArrayList arrayList = new ArrayList(w.t(intRange, 10));
        f it8 = intRange.iterator();
        while (it8.f289625c) {
            arrayList.add(new pb0(d.n("loading_items_id_", it8.nextInt())));
        }
        b.k(arrayList, R$attr.uikit_dp0, R$attr.uikit_dp4, 0, 0, 28);
        return arrayList;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int c(l lVar) {
        String str = lVar.f210384b.f77926a;
        switch (str.hashCode()) {
            case -1963344920:
                if (str.equals("HOUSING_AGREEMENT")) {
                    return R$drawable.uikit_icn_24_utilities;
                }
                break;
            case -1834772724:
                if (str.equals("BANK_STATEMENT")) {
                    return R$drawable.uikit_icn_24_bank;
                }
                break;
            case -1808063079:
                if (str.equals("DRIVING_LICENCE")) {
                    return R$drawable.uikit_icn_24_driving_licence;
                }
                break;
            case -1371330790:
                if (str.equals("UTILITY_BILL")) {
                    return R$drawable.uikit_icn_24_document;
                }
                break;
            case -1159707028:
                if (str.equals("GOVERNMENT_ISSUED_LETTER")) {
                    return R$drawable.uikit_icn_24_documents_pair;
                }
                break;
            case 2634817:
                if (str.equals("VISA")) {
                    return R$drawable.uikit_icn_24_visa_document;
                }
                break;
            case 1305942932:
                if (str.equals("RESIDENCE_PERMIT")) {
                    return R$drawable.uikit_icn_24_residence_permit;
                }
                break;
            case 1999404050:
                if (str.equals("PASSPORT")) {
                    return R$drawable.uikit_icn_24_passport;
                }
                break;
        }
        return R$drawable.uikit_icn_24_national_id;
    }

    public static ArrayList d(List docs, l lVar, boolean z) {
        j model;
        Intrinsics.checkNotNullParameter(docs, "docs");
        List<l> list = docs;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (l lVar2 : list) {
            boolean z3 = lVar != null && lVar.equals(lVar2);
            if (z) {
                String str = lVar2.f210386g;
                model = new CellDetailsListDelegate.Model(lVar2.f210383a, a(c(lVar2)), u.c(new q7(str != null ? new CompositeClause(v.k(new TextClause(lVar2.e, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause("\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(str, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124)), null, null, null, 14) : new TextClause(lVar2.e, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new CountryImage(lVar2.f210385c.f297794a, (Integer) null, (e) null, 14))), null, null, lVar2, YearClass.CLASS_2008);
            } else {
                String str2 = lVar2.f210383a;
                LayeredImage layeredImageA = a(c(lVar2));
                TextClause textClause = new TextClause(lVar2.e, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                String str3 = lVar2.f210386g;
                model = new RowDelegate.Model(str2, layeredImageA, null, null, textClause, str3 != null ? new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, null, null, 0, null, false, false, null, null, null, null, null, lVar2, null, 0, 0, 0, 0, 1056964460);
                lVar2 = lVar2;
            }
            arrayList.add(new SelectableDelegate.Model(lVar2.f210383a, model, z3, null, vd0.RADIO, 131048));
        }
        return arrayList;
    }

    public static ArrayList e(List sequences, List selectedDocs) throws IOException {
        Intrinsics.checkNotNullParameter(sequences, "sequences");
        Intrinsics.checkNotNullParameter(selectedDocs, "selectedDocs");
        ArrayList<List> arrayListG = m.G(sequences);
        ArrayList arrayList = new ArrayList(w.t(arrayListG, 10));
        for (List list : arrayListG) {
            List<l> list2 = list;
            ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                arrayList2.add(((l) it8.next()).f210383a);
            }
            String strK0 = d0.k0(arrayList2, "|", null, null, 0, null, 62);
            LayeredImage layeredImageA = a(R$drawable.uikit_icn_24_documents_pair);
            ArrayList arrayList3 = new ArrayList(w.t(list2, 10));
            for (l lVar : list2) {
                arrayList3.add(new q7(new TextClause(lVar.e, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new CountryImage(lVar.f210385c.f297794a, (Integer) null, (e) null, 14)));
            }
            arrayList.add(new SelectableDelegate.Model(strK0, new CellDetailsListDelegate.Model(strK0, layeredImageA, arrayList3, null, null, list, YearClass.CLASS_2008), Intrinsics.f(list, selectedDocs), null, vd0.RADIO, 131048));
        }
        return arrayList;
    }
}
