package zr3;

import com.google.protobuf.w0;
import com.revolut.tracking.v3.CreditApplicationProductArticleContext;
import ft3.d1;
import grl.m2;
import grl.r2;
import jb3.l;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public abstract class c {
    public static final CreditApplicationProductArticleContext a(wi0.b countryCode, d1 productClassification, r2 entryPointType) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(productClassification, "productClassification");
        Intrinsics.checkNotNullParameter(entryPointType, "entryPointType");
        CreditApplicationProductArticleContext.a aVarNewBuilder = CreditApplicationProductArticleContext.newBuilder();
        String str = countryCode.f297794a;
        aVarNewBuilder.c();
        ((CreditApplicationProductArticleContext) aVarNewBuilder.f49761b).setCountry(str);
        aVarNewBuilder.c();
        ((CreditApplicationProductArticleContext) aVarNewBuilder.f49761b).setEntryPointType(entryPointType);
        m2 m2VarW = l.w(productClassification);
        aVarNewBuilder.c();
        ((CreditApplicationProductArticleContext) aVarNewBuilder.f49761b).setProductType(m2VarW);
        w0 w0VarA = aVarNewBuilder.a();
        Intrinsics.checkNotNullExpressionValue(w0VarA, "build(...)");
        return (CreditApplicationProductArticleContext) w0VarA;
    }
}
