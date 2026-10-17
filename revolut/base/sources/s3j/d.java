package s3j;

import g2e.t;
import kotlin.jvm.internal.Intrinsics;
import n4j.h;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f259702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f259703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.revolut.retail.feature.beneficiary.impl.expansion.a f259704c;
    public final e d;

    public d(t routeDetailsInteractor, h fieldDefinitionTransformer, com.revolut.retail.feature.beneficiary.impl.expansion.a expansionFieldDefinitionInteractor, e accountTypePatcher, n4j.c beneficiaryCreationUtils) {
        Intrinsics.checkNotNullParameter(routeDetailsInteractor, "routeDetailsInteractor");
        Intrinsics.checkNotNullParameter(fieldDefinitionTransformer, "fieldDefinitionTransformer");
        Intrinsics.checkNotNullParameter(expansionFieldDefinitionInteractor, "expansionFieldDefinitionInteractor");
        Intrinsics.checkNotNullParameter(accountTypePatcher, "accountTypePatcher");
        Intrinsics.checkNotNullParameter(beneficiaryCreationUtils, "beneficiaryCreationUtils");
        this.f259702a = routeDetailsInteractor;
        this.f259703b = fieldDefinitionTransformer;
        this.f259704c = expansionFieldDefinitionInteractor;
        this.d = accountTypePatcher;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a1, code lost:
    
        if (r8 == u2j.d.PERSONAL) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ac, code lost:
    
        if (r8 == u2j.d.BUSINESS) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b3, code lost:
    
        return new s3j.a(r1, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b4, code lost:
    
        r6 = r1.getE().f99726a;
        r5 = r1.getD().f99723a;
        r9.u = r1;
        r9.v = r8;
        r9.f259699w = r6;
        r9.f259700x = r5;
        r9.G = 1;
        r2 = r24.f259704c.a(r5, r6, null, r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d1, code lost:
    
        if (r2 != r3) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d5, code lost:
    
        r6 = r5;
        r5 = r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x012d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.BeneficiaryInfoState r25, java.lang.String r26, gim.c r27) {
        /*
            Method dump skipped, instruction units count: 503
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s3j.d.a(com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.BeneficiaryInfoState, java.lang.String, gim.c):java.lang.Object");
    }
}
