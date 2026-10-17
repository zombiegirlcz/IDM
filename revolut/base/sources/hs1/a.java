package hs1;

import b02.h;
import com.revolut.feature.apm.bizum.impl.data.network.BizumService;
import com.revolut.feature.apm.core.models.bizum.BizumRegistrationStatus;
import gim.i;
import js1.e;
import js1.f;
import js1.g;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f154856w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(c cVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f154856w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new a(this.f154856w, continuation, 0);
            default:
                return new a(this.f154856w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object remediation;
        h hVar;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    BizumService bizumService = this.f154856w.f154859a;
                    this.v = 1;
                    obj2 = bizumService.getBizumUserRegistrationStatus(this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                e eVar = (e) obj2;
                Intrinsics.checkNotNullParameter(eVar, "<this>");
                String status = eVar.getStatus();
                switch (status.hashCode()) {
                    case -1395063325:
                        if (status.equals("NOT_ELIGIBLE")) {
                            js1.c details = eVar.getDetails();
                            if (details == null) {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            f terms = eVar.getTerms();
                            if (terms == null) {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            String phone = details.getPhone();
                            String name = details.getName();
                            String accountNumber = details.getAccountNumber();
                            String bic2 = details.getBic();
                            String uri2 = terms.getUri();
                            String id10 = terms.getId();
                            Boolean spanishIbanAdded = eVar.getSpanishIbanAdded();
                            boolean zBooleanValue = spanishIbanAdded != null ? spanishIbanAdded.booleanValue() : false;
                            String workflowId = eVar.getWorkflowId();
                            if (workflowId == null) {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            remediation = new BizumRegistrationStatus.NotRegistered.Remediation(phone, name, accountNumber, bic2, uri2, id10, zBooleanValue, workflowId);
                            return remediation;
                        }
                        throw new IllegalArgumentException(j6.a.q("Unknown Bizum user registration status: ", eVar.getStatus()));
                    case -526380146:
                        if (status.equals("NOT_REGISTERED")) {
                            js1.c details2 = eVar.getDetails();
                            if (details2 == null) {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            f terms2 = eVar.getTerms();
                            if (terms2 == null) {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            String phone2 = details2.getPhone();
                            String name2 = details2.getName();
                            String accountNumber2 = details2.getAccountNumber();
                            String bic3 = details2.getBic();
                            String uri3 = terms2.getUri();
                            String id11 = terms2.getId();
                            Boolean spanishIbanAdded2 = eVar.getSpanishIbanAdded();
                            remediation = new BizumRegistrationStatus.NotRegistered.Standard(phone2, name2, accountNumber2, bic3, uri3, id11, spanishIbanAdded2 != null ? spanishIbanAdded2.booleanValue() : false);
                            return remediation;
                        }
                        throw new IllegalArgumentException(j6.a.q("Unknown Bizum user registration status: ", eVar.getStatus()));
                    case 769741001:
                        if (status.equals("REQUIRED_PORTABILITY")) {
                            js1.c details3 = eVar.getDetails();
                            if (details3 == null) {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            f terms3 = eVar.getTerms();
                            if (terms3 == null) {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            String phone3 = details3.getPhone();
                            String name3 = details3.getName();
                            String accountNumber3 = details3.getAccountNumber();
                            String bic4 = details3.getBic();
                            String uri4 = terms3.getUri();
                            String id12 = terms3.getId();
                            Boolean spanishIbanAdded3 = eVar.getSpanishIbanAdded();
                            remediation = new BizumRegistrationStatus.NotRegistered.Portability(phone3, name3, accountNumber3, bic4, uri4, id12, spanishIbanAdded3 != null ? spanishIbanAdded3.booleanValue() : false);
                            return remediation;
                        }
                        throw new IllegalArgumentException(j6.a.q("Unknown Bizum user registration status: ", eVar.getStatus()));
                    case 1925346054:
                        if (status.equals("ACTIVE")) {
                            return BizumRegistrationStatus.Active.f61908a;
                        }
                        throw new IllegalArgumentException(j6.a.q("Unknown Bizum user registration status: ", eVar.getStatus()));
                    default:
                        throw new IllegalArgumentException(j6.a.q("Unknown Bizum user registration status: ", eVar.getStatus()));
                }
            default:
                Object eVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    BizumService bizumService2 = this.f154856w.f154859a;
                    this.v = 1;
                    obj2 = bizumService2.getBizumSettings(this);
                    if (obj2 != eVar2) {
                    }
                    return eVar2;
                }
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
                g gVar = (g) obj2;
                Intrinsics.checkNotNullParameter(gVar, "<this>");
                b02.g gVar2 = h.Companion;
                String onlinePurchasesState = gVar.getOnlinePurchasesState();
                gVar2.getClass();
                h[] hVarArrValues = h.values();
                int length = hVarArrValues.length;
                int i3 = 0;
                while (true) {
                    if (i3 < length) {
                        hVar = hVarArrValues[i3];
                        if (!Intrinsics.f(hVar.a(), onlinePurchasesState)) {
                            i3++;
                        }
                    } else {
                        hVar = null;
                    }
                }
                if (hVar == null) {
                    throw new IllegalStateException(j6.a.q("Unknown BizumSettingsState: ", onlinePurchasesState));
                }
                eVar2 = new b02.e(hVar);
                return eVar2;
        }
    }
}
