package bf2;

import chj.j0;
import chj.u0;
import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.error.data.model.ServerErrorParams;
import com.revolut.feature.apm.upi.impl.data.network.UpiService;
import com.revolut.feature.apm.upi.impl.flow.UpiTransferFlowContract$Recipient;
import com.revolut.retail.feature.esim.api.model.EsimContractMetadata;
import com.revolut.retail.feature.esim.impl.network.EsimPhoneNumberService;
import com.revolut.retail.feature.esim.impl.repositories.exceptions.InsufficientFundsException;
import com.revolut.retail.feature.esim.impl.repositories.exceptions.PhoneNumberNoLongerAvailableException;
import com.revolut.retail.feature.esim.impl.repositories.exceptions.PriceChangedException;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import dej.b1;
import dej.e;
import dej.r1;
import dej.z2;
import dj0.d;
import do3.q;
import ef2.f;
import ef2.g;
import gim.i;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import kfj.h4;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.z;
import kotlinx.coroutines.CoroutineScope;
import nfj.n0;
import nii.h;
import retrofit2.HttpException;
import retrofit2.Response;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ String A;
    public Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ int u = 1;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f14894w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f14895x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ d f14896y;
    public final /* synthetic */ boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(u0 u0Var, e eVar, Instant instant, r1 r1Var, String str, String str2, d dVar, EsimContractMetadata esimContractMetadata, boolean z, String str3, Continuation continuation) {
        super(2, continuation);
        this.B = u0Var;
        this.C = eVar;
        this.D = instant;
        this.E = r1Var;
        this.f14894w = str;
        this.f14895x = str2;
        this.f14896y = dVar;
        this.F = esimContractMetadata;
        this.z = z;
        this.A = str3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b((io3.d) this.B, this.z, (UpiTransferFlowContract$Recipient) this.C, this.f14894w, this.f14895x, (Map) this.D, this.f14896y, (TransferScheduleData) this.E, this.A, (c) this.F, continuation);
            case 1:
                return new b((u0) this.B, (e) this.C, (Instant) this.D, (r1) this.E, this.f14894w, this.f14895x, this.f14896y, (EsimContractMetadata) this.F, this.z, this.A, continuation);
            default:
                return new b((nfj.u0) this.C, this.f14894w, this.f14895x, this.A, this.z, this.f14896y, (String) this.D, (xi0.b) this.E, (EsimContractMetadata) this.F, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws IOException {
        ef2.i iVar;
        Object objCreatePayment;
        LocalDate localDateI;
        jli.c cVar;
        ef2.i iVar2;
        Object objU;
        Object objPostSimPhones;
        ServerErrorParams serverErrorParams;
        Long lN;
        Long lN2;
        int i = this.u;
        d dVar = this.f14896y;
        z2 z2Var = null;
        dVar = null;
        d dVar2 = null;
        Object obj3 = this.F;
        Object obj4 = this.E;
        Object obj5 = this.D;
        Object obj6 = this.C;
        switch (i) {
            case 0:
                TransferScheduleData transferScheduleData = (TransferScheduleData) obj4;
                UpiTransferFlowContract$Recipient upiTransferFlowContract$Recipient = (UpiTransferFlowContract$Recipient) obj6;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    ef2.b bVar = new ef2.b(((io3.d) this.B).f163145a);
                    boolean z = upiTransferFlowContract$Recipient instanceof UpiTransferFlowContract$Recipient.UpiMerchant;
                    ef2.a aVar2 = new ef2.a(new f(this.z ? "QR_PAY" : "REGULAR_PAY", !z ? upiTransferFlowContract$Recipient.getId() : null, z ? ((UpiTransferFlowContract$Recipient.UpiMerchant) upiTransferFlowContract$Recipient).f62967a.f61900a : null, this.f14894w, this.f14895x, (Map) obj5));
                    jo3.a aVarP = mo3.a.p(dVar);
                    if (transferScheduleData == null || (cVar = transferScheduleData.f104286b) == null) {
                        iVar = null;
                    } else {
                        Intrinsics.checkNotNullParameter(cVar, "<this>");
                        switch (cf2.a.f23531a[cVar.ordinal()]) {
                            case 1:
                                iVar2 = null;
                                break;
                            case 2:
                                iVar2 = ef2.i.DAILY;
                                break;
                            case 3:
                                iVar2 = ef2.i.WEEKLY;
                                break;
                            case 4:
                                iVar2 = ef2.i.BIWEEKLY;
                                break;
                            case 5:
                                iVar2 = ef2.i.MONTHLY;
                                break;
                            case 6:
                                iVar2 = ef2.i.ANNUAL;
                                break;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                        iVar = iVar2;
                    }
                    ef2.d dVar3 = new ef2.d(bVar, aVar2, aVarP, this.A, (transferScheduleData == null || (localDateI = oc.c.I(transferScheduleData.f104285a)) == null) ? null : localDateI.format(DateTimeFormatter.ISO_LOCAL_DATE), iVar);
                    c cVar2 = (c) obj3;
                    UpiService upiService = cVar2.f14897a;
                    wj0.b bVar2 = cVar2.f14898b.a() ? new wj0.b("payments-upi-transfer") : null;
                    this.v = 1;
                    objCreatePayment = upiService.createPayment(dVar3, bVar2, this);
                    if (objCreatePayment == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objCreatePayment = obj2;
                }
                g upi2 = ((ef2.e) objCreatePayment).getUpi();
                String paymentIntentId = upi2 != null ? upi2.getPaymentIntentId() : null;
                return paymentIntentId == null ? "" : paymentIntentId;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    u0 u0Var = (u0) this.B;
                    j0 j0Var = new j0(u0Var, (e) obj6, (Instant) obj5, (r1) obj4, this.f14894w, this.f14895x, this.f14896y, (EsimContractMetadata) obj3, this.z, this.A, null, 1);
                    this.v = 1;
                    objU = q.u(u0Var, j0Var, this);
                    if (objU == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objU = obj2;
                }
                u0.j3((u0) this.B, (h) objU);
                return Unit.f186387a;
            default:
                nfj.u0 u0Var2 = (nfj.u0) obj6;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    o.b(obj2);
                    EsimPhoneNumberService esimPhoneNumberService = u0Var2.f215052a;
                    xi0.b bVar3 = (xi0.b) obj4;
                    EsimContractMetadata esimContractMetadata = (EsimContractMetadata) obj3;
                    h4 h4Var = new h4(this.f14895x, this.A, this.z, mo3.a.p(dVar), (String) obj5, bVar3 != null ? bVar3.f306286a : null, ffj.a.a(esimContractMetadata.f100203b, esimContractMetadata.f100202a));
                    this.B = u0Var2;
                    this.v = 1;
                    objPostSimPhones = esimPhoneNumberService.postSimPhones(this.f14894w, h4Var, this);
                    if (objPostSimPhones == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u0Var2 = (nfj.u0) this.B;
                    o.b(obj2);
                    objPostSimPhones = obj2;
                }
                Response response = (Response) objPostSimPhones;
                n0 n0Var = nfj.u0.Companion;
                u0Var2.getClass();
                ynj.i iVar3 = u0Var2.d;
                int iCode = response.code();
                mfj.e eVar = (mfj.e) response.body();
                if (200 > iCode || iCode >= 210 || eVar == null) {
                    ServerError serverErrorC = u0Var2.e.c(new HttpException(response));
                    Integer numValueOf = serverErrorC != null ? Integer.valueOf(serverErrorC.f51362a) : null;
                    if (serverErrorC != null && (serverErrorParams = serverErrorC.f51364c) != null) {
                        dVar2 = serverErrorParams.f51370a;
                    }
                    if (numValueOf != null && numValueOf.intValue() == 12400030) {
                        throw new PriceChangedException();
                    }
                    if (numValueOf != null && numValueOf.intValue() == 1006 && dVar2 != null) {
                        throw new InsufficientFundsException(dVar2);
                    }
                    if (numValueOf == null || numValueOf.intValue() != 12400032) {
                        throw new HttpException(response);
                    }
                    throw new PhoneNumberNoLongerAvailableException();
                }
                ulm.u0 u0VarHeaders = response.headers();
                String strA = u0VarHeaders.a("Retry-After");
                long jA = (strA == null || (lN2 = z.n(strA)) == null) ? ynj.i.a(iVar3) : kotlin.time.c.h(Math.abs(lN2.longValue()), pkm.e.SECONDS);
                String strA2 = u0VarHeaders.a("X-Retry-Timeout");
                long jB = (strA2 == null || (lN = z.n(strA2)) == null) ? ynj.i.b(iVar3) : kotlin.time.c.h(Math.abs(lN.longValue()), pkm.e.SECONDS);
                String id10 = eVar.getId();
                String state = eVar.getState();
                z2[] z2VarArrValues = z2.values();
                int length = z2VarArrValues.length;
                int i6 = 0;
                while (true) {
                    if (i6 < length) {
                        z2 z2Var2 = z2VarArrValues[i6];
                        if (a0.z(z2Var2.name(), state, true)) {
                            z2Var = z2Var2;
                        } else {
                            i6++;
                        }
                    }
                }
                if (z2Var == null) {
                    z2Var = z2.UNKNOWN;
                }
                return new b1(id10, z2Var, jA, jB);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(io3.d dVar, boolean z, UpiTransferFlowContract$Recipient upiTransferFlowContract$Recipient, String str, String str2, Map map, d dVar2, TransferScheduleData transferScheduleData, String str3, c cVar, Continuation continuation) {
        super(2, continuation);
        this.B = dVar;
        this.z = z;
        this.C = upiTransferFlowContract$Recipient;
        this.f14894w = str;
        this.f14895x = str2;
        this.D = map;
        this.f14896y = dVar2;
        this.E = transferScheduleData;
        this.A = str3;
        this.F = cVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(nfj.u0 u0Var, String str, String str2, String str3, boolean z, d dVar, String str4, xi0.b bVar, EsimContractMetadata esimContractMetadata, Continuation continuation) {
        super(2, continuation);
        this.C = u0Var;
        this.f14894w = str;
        this.f14895x = str2;
        this.A = str3;
        this.z = z;
        this.f14896y = dVar;
        this.D = str4;
        this.E = bVar;
        this.F = esimContractMetadata;
    }
}
