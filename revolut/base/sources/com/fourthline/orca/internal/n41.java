package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class n41 implements bh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function0 f31326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function0 f31327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final hq f31328c;

    public n41(Function0 selectedDocumentTypeProvider, Function0 selectedIssuingCountryProvider, hq validator) {
        Intrinsics.checkNotNullParameter(selectedDocumentTypeProvider, "selectedDocumentTypeProvider");
        Intrinsics.checkNotNullParameter(selectedIssuingCountryProvider, "selectedIssuingCountryProvider");
        Intrinsics.checkNotNullParameter(validator, "validator");
        this.f31326a = selectedDocumentTypeProvider;
        this.f31327b = selectedIssuingCountryProvider;
        this.f31328c = validator;
    }

    @Override // com.fourthline.orca.internal.bh
    public Object a(md1 md1Var, nd1 nd1Var, Continuation continuation) {
        fd fdVar = (fd) this.f31327b.invoke();
        nd1 nd1Var2 = null;
        String strC = fdVar != null ? fdVar.c() : null;
        DocumentType documentType = (DocumentType) this.f31326a.invoke();
        if (strC != null && documentType != null) {
            nd1Var2 = new nd1(strC, documentType, null, Boolean.FALSE);
        }
        return this.f31328c.a(md1Var, nd1Var2, continuation);
    }
}
