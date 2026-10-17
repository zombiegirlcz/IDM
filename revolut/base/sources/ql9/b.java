package ql9;

import com.revolut.feature.pay_with_smile.api.domain.model.PaymentConfirmationChallenge;
import com.revolut.feature.pay_with_smile.impl.data.network.BiometricPaymentsSettingsService;
import com.revolut.feature.pay_with_smile.impl.domain.model.ConsentRequiredException;
import gim.i;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import pl9.b0;
import pl9.m;
import pl9.p;
import pl9.s;
import retrofit2.HttpException;
import skm.e0;
import vl9.e;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f247555w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f247556x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(d dVar, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f247555w = dVar;
        this.f247556x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.f247555w, this.f247556x, continuation, 0);
            case 1:
                return new b(this.f247555w, this.f247556x, continuation, 1);
            case 2:
                return new b(this.f247555w, this.f247556x, continuation, 2);
            case 3:
                return new b(this.f247555w, this.f247556x, continuation, 3);
            case 4:
                return new b(this.f247555w, this.f247556x, continuation, 4);
            default:
                return new b(this.f247555w, this.f247556x, continuation, 5);
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

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object attempt;
        int i = this.u;
        Continuation continuation = null;
        String str = this.f247556x;
        d dVar = this.f247555w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    BiometricPaymentsSettingsService biometricPaymentsSettingsService = dVar.f247559a;
                    this.v = 1;
                    if (biometricPaymentsSettingsService.confirmAttempt(str, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    BiometricPaymentsSettingsService biometricPaymentsSettingsService2 = dVar.f247559a;
                    this.v = 1;
                    attempt = biometricPaymentsSettingsService2.getAttempt(str, this);
                    if (attempt == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    attempt = obj2;
                }
                pl9.d dVar2 = (pl9.d) attempt;
                Intrinsics.checkNotNullParameter(dVar2, "<this>");
                String attemptId = this.f247556x;
                Intrinsics.checkNotNullParameter(attemptId, "attemptId");
                String str2 = dVar2.f237291a;
                switch (str2.hashCode()) {
                    case -2050886301:
                        if (str2.equals("REQUIRES_APP_FALLBACK_CONFIRMATION")) {
                            p pVar = dVar2.f237292b;
                            if (pVar == null) {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            String str3 = pVar.f237305c;
                            long j2 = pVar.d;
                            String str4 = pVar.e;
                            long j3 = pVar.f237303a;
                            long j5 = pVar.f237304b;
                            s sVar = pVar.f;
                            String str5 = sVar.f237308a;
                            String str6 = sVar.f237309b.f237311a;
                            m mVar = pVar.f237306g;
                            return new vl9.c(new PaymentConfirmationChallenge(attemptId, str3, j2, str4, j3, j5, str5, str6, mVar.f237300a, mVar.f237301b));
                        }
                        break;
                    case -561938327:
                        if (str2.equals("REQUIRES_CONSENT")) {
                            return vl9.d.f290305a;
                        }
                        break;
                    case 35394935:
                        if (str2.equals("PENDING")) {
                            return vl9.b.f290303a;
                        }
                        break;
                    case 1383663147:
                        if (str2.equals("COMPLETED")) {
                            return vl9.a.f290302a;
                        }
                        break;
                }
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException(j6.a.q("Unexpected state = ", dVar2.f237291a));
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
                return e.f290306a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                try {
                    if (i5 == 0) {
                        o.b(obj2);
                        BiometricPaymentsSettingsService biometricPaymentsSettingsService3 = dVar.f247559a;
                        this.v = 1;
                        if (biometricPaymentsSettingsService3.initiateAttempt(str, this) == aVar3) {
                            return aVar3;
                        }
                    } else {
                        if (i5 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                    }
                    return Unit.f186387a;
                } catch (HttpException e) {
                    if (e.code() == 422) {
                        throw new ConsentRequiredException();
                    }
                    throw e;
                }
            case 3:
                Object obj3 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    o.b(obj2);
                    BiometricPaymentsSettingsService biometricPaymentsSettingsService4 = dVar.f247559a;
                    pl9.a aVar4 = new pl9.a(str);
                    this.v = 1;
                    if (biometricPaymentsSettingsService4.acceptConsent(aVar4, this) == obj3) {
                        return obj3;
                    }
                } else {
                    if (i6 != 1) {
                        if (i6 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        return Unit.f186387a;
                    }
                    o.b(obj2);
                }
                this.v = 2;
                Object objG = e0.G(new qc3.c(dVar, continuation, 21), this);
                if (objG != obj3) {
                    objG = Unit.f186387a;
                }
                if (objG == obj3) {
                    return obj3;
                }
                return Unit.f186387a;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    o.b(obj2);
                    BiometricPaymentsSettingsService biometricPaymentsSettingsService5 = dVar.f247559a;
                    this.v = 1;
                    if (biometricPaymentsSettingsService5.rejectAttempt(str, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    o.b(obj2);
                    BiometricPaymentsSettingsService biometricPaymentsSettingsService6 = dVar.f247559a;
                    b0 b0Var = new b0(str);
                    this.v = 1;
                    if (biometricPaymentsSettingsService6.setPasscode(b0Var, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i22 != 1) {
                        if (i22 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        return Unit.f186387a;
                    }
                    o.b(obj2);
                }
                re0.c cVar = dVar.f247561c;
                Unit unit = Unit.f186387a;
                this.v = 2;
                if (cVar.b(unit, true, this) == aVar6) {
                    return aVar6;
                }
                return Unit.f186387a;
        }
    }
}
