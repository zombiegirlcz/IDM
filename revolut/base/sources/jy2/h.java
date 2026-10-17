package jy2;

import efm.d0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public interface h {
    pfm.h a();

    default d0 b(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        ufm.c cVarL = d0.l(new UnsupportedOperationException("reactivateCard is not supported"));
        Intrinsics.checkNotNullExpressionValue(cVarL, "error(...)");
        return cVarL;
    }

    default d0 c() {
        ufm.c cVarL = d0.l(new UnsupportedOperationException("validateLinkCard is not supported"));
        Intrinsics.checkNotNullExpressionValue(cVarL, "error(...)");
        return cVarL;
    }
}
