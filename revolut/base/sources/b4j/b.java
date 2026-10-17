package b4j;

import com.revolut.domain.models.banktransfer.AccountFieldType;
import com.revolut.retail.feature.beneficiary.api.navigation.BeneficiaryCreationKompotInputData;
import g2e.t;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import zhm.q0;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f12385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i4j.f f12386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n4j.h f12387c;
    public final com.revolut.retail.feature.beneficiary.impl.expansion.a d;
    public final p96.a e;

    public b(t routeDetailsInteractor, i4j.f countryCurrencyInteractor, n4j.h fieldDefinitionTransformer, com.revolut.retail.feature.beneficiary.impl.expansion.a expansionFieldDefinitionInteractor, p96.a initialStateUtils) {
        Intrinsics.checkNotNullParameter(routeDetailsInteractor, "routeDetailsInteractor");
        Intrinsics.checkNotNullParameter(countryCurrencyInteractor, "countryCurrencyInteractor");
        Intrinsics.checkNotNullParameter(fieldDefinitionTransformer, "fieldDefinitionTransformer");
        Intrinsics.checkNotNullParameter(expansionFieldDefinitionInteractor, "expansionFieldDefinitionInteractor");
        Intrinsics.checkNotNullParameter(initialStateUtils, "initialStateUtils");
        this.f12385a = routeDetailsInteractor;
        this.f12386b = countryCurrencyInteractor;
        this.f12387c = fieldDefinitionTransformer;
        this.d = expansionFieldDefinitionInteractor;
        this.e = initialStateUtils;
    }

    public final Object a(BeneficiaryCreationKompotInputData.CreationConfiguration.DefaultCreation defaultCreation, p3j.a aVar) {
        String str = defaultCreation.f99633a;
        String str2 = defaultCreation.f99634b;
        wi0.b bVar = defaultCreation.f99635c;
        xi0.b bVar2 = defaultCreation.d;
        Map map = defaultCreation.e;
        LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(((AccountFieldType) entry.getKey()).name(), entry.getValue());
        }
        return b(str, str2, null, bVar, bVar2, linkedHashMap, defaultCreation.f, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r19, java.lang.String r20, java.lang.String r21, wi0.b r22, xi0.b r23, java.util.Map r24, u2j.d r25, gim.c r26) {
        /*
            Method dump skipped, instruction units count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b4j.b.b(java.lang.String, java.lang.String, java.lang.String, wi0.b, xi0.b, java.util.Map, u2j.d, gim.c):java.lang.Object");
    }
}
