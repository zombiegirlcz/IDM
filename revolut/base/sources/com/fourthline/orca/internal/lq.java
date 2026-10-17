package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class lq {

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DocumentType.values().length];
            try {
                iArr[DocumentType.FRENCH_ID_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final boolean a(di selectedDocument, Date expirationDate) {
        Intrinsics.checkNotNullParameter(selectedDocument, "selectedDocument");
        Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
        Date dateB = selectedDocument.b();
        return (a.$EnumSwitchMapping$0[selectedDocument.c().ordinal()] == 1 || dateB == null || expirationDate.compareTo(dateB) < 0) ? false : true;
    }
}
