package com.revolut.retail.feature.payments.bank_transfer.api.navigation;

import com.revolut.retail.feature.payments.bank_transfer.api.navigation.TransferNote;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.d0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public abstract class b {
    public static final String a(TransferNote transferNote) {
        Collection collectionValues;
        Intrinsics.checkNotNullParameter(transferNote, "<this>");
        if (transferNote instanceof TransferNote.SimpleNote) {
            return ((TransferNote.SimpleNote) transferNote).f101983a;
        }
        if (transferNote instanceof TransferNote.NewZealandNote) {
            TransferNote.NewZealandNote newZealandNote = (TransferNote.NewZealandNote) transferNote;
            List listK = v.k(newZealandNote.f101980a, newZealandNote.f101981b, newZealandNote.f101982c);
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listK) {
                if (!d0.W((String) obj2)) {
                    arrayList.add(obj2);
                }
            }
            return zhm.d0.k0(arrayList, ", ", null, null, 0, null, 62);
        }
        if (!(transferNote instanceof TransferNote.StructuredNote)) {
            throw new NoWhenBranchMatchedException();
        }
        Map mapB = ((TransferNote.StructuredNote) transferNote).b();
        if (mapB != null && (collectionValues = mapB.values()) != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : collectionValues) {
                if (!d0.W(((TransferNote.StructuredNote.ReferenceValue) obj3).f101986a)) {
                    arrayList2.add(obj3);
                }
            }
            ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
            Iterator it8 = arrayList2.iterator();
            while (it8.hasNext()) {
                arrayList3.add(((TransferNote.StructuredNote.ReferenceValue) it8.next()).f101987b);
            }
            String strK0 = zhm.d0.k0(arrayList3, m70.a.o(t0.f186434a), null, null, 0, null, 62);
            if (strK0 != null) {
                return strK0;
            }
        }
        m70.a.c(t0.f186434a);
        return "";
    }

    public static final String b(TransferNote transferNote) {
        Intrinsics.checkNotNullParameter(transferNote, "<this>");
        if (transferNote instanceof TransferNote.SimpleNote) {
            String value = ((TransferNote.SimpleNote) transferNote).f101983a;
            Intrinsics.checkNotNullParameter(value, "value");
            return value;
        }
        if (!(transferNote instanceof TransferNote.NewZealandNote)) {
            if (transferNote instanceof TransferNote.StructuredNote) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        TransferNote.NewZealandNote newZealandNote = (TransferNote.NewZealandNote) transferNote;
        String value2 = zhm.d0.k0(v.k(newZealandNote.f101980a, newZealandNote.f101981b, newZealandNote.f101982c), "{::}", null, null, 0, null, 62);
        Intrinsics.checkNotNullParameter(value2, "value");
        return value2;
    }
}
