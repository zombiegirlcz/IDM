package p3j;

import com.revolut.retail.feature.beneficiary.api.navigation.BeneficiaryCreationKompotInputData;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.BeneficiaryInfoState;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends i implements Function2 {
    public FlowCollector u;
    public BeneficiaryInfoState v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f232754w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f232755x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ BeneficiaryCreationKompotInputData.CreationConfiguration f232756y;
    public final /* synthetic */ b z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(BeneficiaryCreationKompotInputData.CreationConfiguration creationConfiguration, b bVar, Continuation continuation) {
        super(2, continuation);
        this.f232756y = creationConfiguration;
        this.z = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        a aVar = new a(this.f232756y, this.z, continuation);
        aVar.f232755x = obj2;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x010e, code lost:
    
        if (r0 == r11) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01b0, code lost:
    
        if (r10.emit(r0, r6) == r11) goto L89;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008b A[Catch: Exception -> 0x0024, TryCatch #2 {Exception -> 0x0024, blocks: (B:7:0x001f, B:12:0x002b, B:80:0x0177, B:13:0x0033, B:75:0x0161, B:76:0x0163, B:14:0x003a, B:69:0x0147, B:15:0x0041, B:59:0x0112, B:16:0x0048, B:49:0x00e6, B:17:0x004f, B:43:0x00cb, B:18:0x0056, B:37:0x00b2, B:19:0x005c, B:31:0x009b, B:20:0x0062, B:26:0x0085, B:28:0x008b, B:32:0x009f, B:34:0x00a3, B:38:0x00b6, B:40:0x00ba, B:44:0x00cf, B:46:0x00d3, B:50:0x00ea, B:52:0x00ee, B:64:0x011e, B:66:0x0124, B:70:0x014a, B:72:0x014e, B:83:0x0194, B:84:0x0199, B:23:0x0069), top: B:97:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009f A[Catch: Exception -> 0x0024, TryCatch #2 {Exception -> 0x0024, blocks: (B:7:0x001f, B:12:0x002b, B:80:0x0177, B:13:0x0033, B:75:0x0161, B:76:0x0163, B:14:0x003a, B:69:0x0147, B:15:0x0041, B:59:0x0112, B:16:0x0048, B:49:0x00e6, B:17:0x004f, B:43:0x00cb, B:18:0x0056, B:37:0x00b2, B:19:0x005c, B:31:0x009b, B:20:0x0062, B:26:0x0085, B:28:0x008b, B:32:0x009f, B:34:0x00a3, B:38:0x00b6, B:40:0x00ba, B:44:0x00cf, B:46:0x00d3, B:50:0x00ea, B:52:0x00ee, B:64:0x011e, B:66:0x0124, B:70:0x014a, B:72:0x014e, B:83:0x0194, B:84:0x0199, B:23:0x0069), top: B:97:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0193  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p3j.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
