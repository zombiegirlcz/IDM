package zr3;

import com.google.protobuf.w0;
import com.revolut.tracking.v3.CreditApplicationCommonContext;
import ft3.j1;
import grl.m2;
import grl.r2;
import gt3.f;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import rt3.d;
import rt3.e;
import rt3.g;
import rt3.h;
import rt3.i;
import rt3.j;
import rt3.k;
import rt3.l;

/* JADX INFO: loaded from: classes21.dex */
public abstract class b {
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v33, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v35, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v39, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v41, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v45, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v47, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v49, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v53, types: [java.lang.Object, java.util.Map] */
    public static final CreditApplicationCommonContext a(wi0.b countryCode, r2 entryPointType, String applicationId, j1 productType, f fVar, ks3.b pluginName, ks3.c cVar, String str, boolean z) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(entryPointType, "entryPointType");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(productType, "productType");
        Intrinsics.checkNotNullParameter(pluginName, "pluginName");
        CreditApplicationCommonContext.a aVarNewBuilder = CreditApplicationCommonContext.newBuilder();
        Object obj2 = qt3.a.f248929a;
        Intrinsics.checkNotNullParameter(pluginName, "<this>");
        String strG = u1.g(pluginName, qt3.a.f248929a);
        aVarNewBuilder.c();
        ((CreditApplicationCommonContext) aVarNewBuilder.f49761b).setPluginName(strG);
        String strName = null;
        if (entryPointType == r2.UNRECOGNIZED) {
            entryPointType = null;
        }
        if (entryPointType != null) {
            aVarNewBuilder.c();
            ((CreditApplicationCommonContext) aVarNewBuilder.f49761b).setEntryPointType(entryPointType);
        }
        if (cVar != null) {
            Intrinsics.checkNotNullParameter(cVar, "<this>");
            if (cVar instanceof ks3.a) {
                ks3.a aVar = (ks3.a) cVar;
                Object obj3 = rt3.c.f257154a;
                Intrinsics.checkNotNullParameter(aVar, "<this>");
                strName = u1.g(aVar, rt3.c.f257154a);
            } else if (cVar instanceof ns3.a) {
                ns3.a aVar2 = (ns3.a) cVar;
                Map map = rt3.b.f257153a;
                Intrinsics.checkNotNullParameter(aVar2, "<this>");
                strName = u1.g(aVar2, rt3.b.f257153a);
            } else if (cVar instanceof ct3.a) {
                ct3.a aVar3 = (ct3.a) cVar;
                Object obj4 = l.f257163a;
                Intrinsics.checkNotNullParameter(aVar3, "<this>");
                strName = u1.g(aVar3, l.f257163a);
            } else if (cVar instanceof bt3.a) {
                bt3.a aVar4 = (bt3.a) cVar;
                Object obj5 = k.f257162a;
                Intrinsics.checkNotNullParameter(aVar4, "<this>");
                strName = u1.g(aVar4, k.f257162a);
            } else if (cVar instanceof ws3.a) {
                ws3.a aVar5 = (ws3.a) cVar;
                Object obj6 = h.f257159a;
                Intrinsics.checkNotNullParameter(aVar5, "<this>");
                strName = u1.g(aVar5, h.f257159a);
            } else if (cVar instanceof ms3.a) {
                ms3.a aVar6 = (ms3.a) cVar;
                Map map2 = rt3.a.f257152a;
                Intrinsics.checkNotNullParameter(aVar6, "<this>");
                strName = u1.g(aVar6, rt3.a.f257152a);
            } else if (cVar instanceof ts3.a) {
                ts3.a aVar7 = (ts3.a) cVar;
                Object obj7 = rt3.f.f257157a;
                Intrinsics.checkNotNullParameter(aVar7, "<this>");
                strName = u1.g(aVar7, rt3.f.f257157a);
            } else if (cVar instanceof qs3.a) {
                qs3.a aVar8 = (qs3.a) cVar;
                Object obj8 = d.f257155a;
                Intrinsics.checkNotNullParameter(aVar8, "<this>");
                strName = u1.g(aVar8, d.f257155a);
            } else if (cVar instanceof ss3.a) {
                ss3.a aVar9 = (ss3.a) cVar;
                Map map3 = g.f257158a;
                Intrinsics.checkNotNullParameter(aVar9, "<this>");
                strName = u1.g(aVar9, g.f257158a);
            } else if (cVar instanceof at3.a) {
                at3.a aVar10 = (at3.a) cVar;
                Object obj9 = j.f257161a;
                Intrinsics.checkNotNullParameter(aVar10, "<this>");
                strName = u1.g(aVar10, j.f257161a);
            } else if (cVar instanceof ys3.a) {
                ys3.a aVar11 = (ys3.a) cVar;
                Intrinsics.checkNotNullParameter(aVar11, "<this>");
                strName = aVar11.name();
            } else if (cVar instanceof os3.a) {
                os3.a aVar12 = (os3.a) cVar;
                Intrinsics.checkNotNullParameter(aVar12, "<this>");
                strName = aVar12.name();
            } else if (cVar instanceof rs3.a) {
                rs3.a aVar13 = (rs3.a) cVar;
                Object obj10 = e.f257156a;
                Intrinsics.checkNotNullParameter(aVar13, "<this>");
                strName = u1.g(aVar13, e.f257156a);
            } else if (cVar instanceof zs3.a) {
                zs3.a aVar14 = (zs3.a) cVar;
                Map map4 = i.f257160a;
                Intrinsics.checkNotNullParameter(aVar14, "<this>");
                strName = u1.g(aVar14, i.f257160a);
            } else if (cVar instanceof xs3.a) {
                xs3.a aVar15 = (xs3.a) cVar;
                Intrinsics.checkNotNullParameter(aVar15, "<this>");
                strName = aVar15.name();
            } else if (cVar instanceof ps3.a) {
                ps3.a aVar16 = (ps3.a) cVar;
                Intrinsics.checkNotNullParameter(aVar16, "<this>");
                strName = aVar16.name();
            } else if (cVar instanceof vs3.a) {
                vs3.a aVar17 = (vs3.a) cVar;
                Intrinsics.checkNotNullParameter(aVar17, "<this>");
                strName = aVar17.name();
            } else if (cVar instanceof ls3.a) {
                ls3.a aVar18 = (ls3.a) cVar;
                Intrinsics.checkNotNullParameter(aVar18, "<this>");
                strName = aVar18.name();
            }
        }
        if (strName == null) {
            strName = "";
        }
        aVarNewBuilder.c();
        ((CreditApplicationCommonContext) aVarNewBuilder.f49761b).setPluginState(strName);
        aVarNewBuilder.c();
        ((CreditApplicationCommonContext) aVarNewBuilder.f49761b).setApplicationId(applicationId);
        aVarNewBuilder.c();
        ((CreditApplicationCommonContext) aVarNewBuilder.f49761b).setCancellable(z);
        m2 m2VarX = jb3.l.x(productType, fVar);
        aVarNewBuilder.c();
        ((CreditApplicationCommonContext) aVarNewBuilder.f49761b).setProductType(m2VarX);
        String str2 = countryCode.f297794a;
        aVarNewBuilder.c();
        ((CreditApplicationCommonContext) aVarNewBuilder.f49761b).setCountry(str2);
        if (str != null) {
            aVarNewBuilder.c();
            ((CreditApplicationCommonContext) aVarNewBuilder.f49761b).setFrom(str);
        }
        w0 w0VarA = aVarNewBuilder.a();
        Intrinsics.checkNotNullExpressionValue(w0VarA, "build(...)");
        return (CreditApplicationCommonContext) w0VarA;
    }

    public static final CreditApplicationCommonContext b(wi0.b countryCode, r2 entryPointType, String str, it3.d creditApplicationPluginStatus) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(entryPointType, "entryPointType");
        Intrinsics.checkNotNullParameter(creditApplicationPluginStatus, "creditApplicationPluginStatus");
        ks3.b bVar = creditApplicationPluginStatus.f168325c;
        ks3.c cVar = creditApplicationPluginStatus.d;
        return a(countryCode, entryPointType, creditApplicationPluginStatus.f168323a, creditApplicationPluginStatus.f168328j, creditApplicationPluginStatus.k, bVar, cVar, str, creditApplicationPluginStatus.f168327h);
    }

    public static final CreditApplicationCommonContext c(r2 entryPointType, j1 productType, f fVar) {
        Intrinsics.checkNotNullParameter(entryPointType, "entryPointType");
        Intrinsics.checkNotNullParameter(productType, "productType");
        CreditApplicationCommonContext.a aVarNewBuilder = CreditApplicationCommonContext.newBuilder();
        if (entryPointType == r2.UNRECOGNIZED) {
            entryPointType = null;
        }
        if (entryPointType != null) {
            aVarNewBuilder.c();
            ((CreditApplicationCommonContext) aVarNewBuilder.f49761b).setEntryPointType(entryPointType);
        }
        m2 m2VarX = jb3.l.x(productType, fVar);
        aVarNewBuilder.c();
        ((CreditApplicationCommonContext) aVarNewBuilder.f49761b).setProductType(m2VarX);
        w0 w0VarA = aVarNewBuilder.a();
        Intrinsics.checkNotNullExpressionValue(w0VarA, "build(...)");
        return (CreditApplicationCommonContext) w0VarA;
    }
}
