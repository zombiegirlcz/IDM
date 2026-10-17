package com.revolut.feature.tab.accounts.impl.ui.tab;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.wh;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.tab.accounts.impl.ui.tab.ParcelableAccountSections;
import com.youTransactor.uCube.rpc.Constants;
import ip0.i10;
import ip0.k10;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import qv0.o;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public abstract class a {
    public static final ArrayList a(ParcelableAccountSections parcelableAccountSections) {
        o whVar;
        Intrinsics.checkNotNullParameter(parcelableAccountSections, "<this>");
        ArrayList<ParcelableAccountSections.ParcelableItem> arrayList = parcelableAccountSections.f89663a;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (ParcelableAccountSections.ParcelableItem parcelableItem : arrayList) {
            if (parcelableItem instanceof ParcelableAccountSections.ParcelableButton) {
                ParcelableAccountSections.ParcelableButton parcelableButton = (ParcelableAccountSections.ParcelableButton) parcelableItem;
                whVar = new LargeActionButtonDelegate.Model(parcelableButton.f89664a, parcelableButton.d, parcelableButton.f89666c, parcelableButton.f89665b, false, null, null, parcelableButton.e, null, 744);
            } else if (parcelableItem instanceof ParcelableAccountSections.ParcelablePlaceholderRow) {
                ParcelableAccountSections.ParcelablePlaceholderRow parcelablePlaceholderRow = (ParcelableAccountSections.ParcelablePlaceholderRow) parcelableItem;
                whVar = new k10(parcelablePlaceholderRow.f89667a, parcelablePlaceholderRow.f89668b, new i10(parcelablePlaceholderRow.f89669c));
            } else {
                if (!(parcelableItem instanceof ParcelableAccountSections.ParcelableRow)) {
                    throw new NoWhenBranchMatchedException();
                }
                ParcelableAccountSections.ParcelableRow parcelableRow = (ParcelableAccountSections.ParcelableRow) parcelableItem;
                String str = parcelableRow.f89670a;
                RowDelegate.Model.MainImage mainImage = parcelableRow.f89671b;
                Clause clause = parcelableRow.f89672c;
                Clause clause2 = parcelableRow.d;
                Clause clause3 = parcelableRow.e;
                RowDelegate.Model.c.b bVar = (clause3 == null && parcelableRow.f == null) ? null : new RowDelegate.Model.c.b(clause3, parcelableRow.f, null, false, 124);
                ParcelableAccountSections.ParcelableRow.ParcelableTransactionDescriptor parcelableTransactionDescriptor = parcelableRow.f89673g;
                whVar = new wh(str, new RowDelegate.Model(str, mainImage, clause, null, 0, clause2, null, null, 0, bVar, false, null, false, null, null, null, null, null, null, new k71.d(parcelableTransactionDescriptor.f89674a, parcelableTransactionDescriptor.f89675b), null, 0, 0, 0, 0, 532675544), f0.f322471a, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
            }
            arrayList2.add(whVar);
        }
        yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.revolut.feature.tab.accounts.impl.ui.tab.ParcelableAccountSections.ParcelableItem b(koi.j r10) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.tab.accounts.impl.ui.tab.a.b(koi.j):com.revolut.feature.tab.accounts.impl.ui.tab.ParcelableAccountSections$ParcelableItem");
    }
}
