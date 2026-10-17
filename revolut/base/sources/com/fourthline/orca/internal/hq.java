package com.fourthline.orca.internal;

import com.fourthline.core.CountryNetworkModelKt;
import com.fourthline.core.DocumentType;
import com.fourthline.orca.internal.er;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes23.dex */
public final class hq implements bh {
    @Override // com.fourthline.orca.internal.bh
    public Object a(md1 md1Var, nd1 nd1Var, Continuation continuation) {
        ArrayList arrayList = new ArrayList();
        String strD = nd1Var != null ? nd1Var.d() : null;
        if (strD != null && !a(md1Var, strD)) {
            arrayList.add(er.f.f28240a);
        }
        if (strD != null && !a(md1Var, nd1Var.c(), strD)) {
            arrayList.add(er.d.f28236a);
        }
        return arrayList;
    }

    private final boolean a(md1 md1Var, String str) {
        String strC;
        pd1 pd1VarB = md1Var.b();
        if (pd1VarB == null || (strC = pd1VarB.c()) == null) {
            return true;
        }
        return strC.equalsIgnoreCase(str);
    }

    private final boolean a(md1 md1Var, DocumentType documentType, String str) {
        String strB;
        pd1 pd1VarB = md1Var.b();
        return pd1VarB == null || (strB = pd1VarB.b()) == null || a(CountryNetworkModelKt.toDocumentType(strB, str)) == a(documentType);
    }

    private final DocumentType a(DocumentType documentType) {
        return documentType == DocumentType.FRENCH_ID_CARD ? DocumentType.ID_CARD : documentType;
    }
}
