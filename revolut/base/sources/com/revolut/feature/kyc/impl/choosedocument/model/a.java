package com.revolut.feature.kyc.impl.choosedocument.model;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;
import my8.l;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {
    public static final l a(SelectedKycDocs selectedKycDocs) {
        Object next;
        Intrinsics.checkNotNullParameter(selectedKycDocs, "<this>");
        Iterator it8 = selectedKycDocs.f77598a.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((l) next).f210383a, selectedKycDocs.f77600c)) {
                break;
            }
        }
        return (l) next;
    }

    public static final l b(SelectedKycDocs selectedKycDocs) {
        int iNextIndex;
        String str = selectedKycDocs.f77600c;
        List list = selectedKycDocs.f77598a;
        if (str != null) {
            ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    iNextIndex = -1;
                    break;
                }
                if (Intrinsics.f(((l) listIterator.previous()).f210383a, str)) {
                    iNextIndex = listIterator.nextIndex();
                    break;
                }
            }
            Integer numValueOf = Integer.valueOf(iNextIndex + 1);
            if (list.size() <= numValueOf.intValue()) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                return (l) d0.e0(numValueOf.intValue(), list);
            }
        }
        return null;
    }

    public static final SelectedKycDocs c(SelectedKycDocs selectedKycDocs, l doc2) {
        Intrinsics.checkNotNullParameter(selectedKycDocs, "<this>");
        Intrinsics.checkNotNullParameter(doc2, "doc");
        return SelectedKycDocs.a(selectedKycDocs, u.c(doc2), doc2.f210383a, 2);
    }

    public static final SelectedKycDocs d(SelectedKycDocs selectedKycDocs, List docs) {
        Intrinsics.checkNotNullParameter(selectedKycDocs, "<this>");
        Intrinsics.checkNotNullParameter(docs, "docs");
        return SelectedKycDocs.a(selectedKycDocs, docs, ((l) d0.b0(docs)).f210383a, 2);
    }
}
