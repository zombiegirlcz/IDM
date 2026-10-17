package gm7;

import boe.k;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.feature.insurance_car.impl.data.model.MtaCreateResult;
import com.revolut.feature.insurance_car.impl.data.model.MtaQuote;
import com.revolut.feature.insurance_car.impl.data.model.MtaQuoteError;
import com.revolut.feature.insurance_car.impl.data.model.MtaState;
import gim.i;
import kl7.x0;
import kl7.y0;
import kl7.z0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;
import yji.n;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends i implements Function2 {
    public int u;
    public final /* synthetic */ d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Function1 f144783w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ i f144784x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(d dVar, Function1 function1, Function1 function12, Continuation continuation) {
        super(2, continuation);
        this.v = dVar;
        this.f144783w = function1;
        this.f144784x = (i) function12;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.v, this.f144783w, this.f144784x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        Object[] objArr = 0;
        d dVar = this.v;
        if (i == 0) {
            o.b(obj2);
            k kVar = new k(7, null, this.f144784x);
            this.u = 1;
            obj2 = d.Z2(dVar, kVar, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        MtaState mtaState = (MtaState) obj2;
        MtaQuote mtaQuote = mtaState.d;
        MtaQuoteError mtaQuoteError = mtaState.e;
        String str = mtaState.f75262b;
        String str2 = mtaState.f75261a;
        Function1 function1 = this.f144783w;
        if (mtaQuote != null) {
            dVar.t2();
            function1.invoke(new MtaCreateResult.Success(str2, mtaState.d, str));
        } else if (mtaQuoteError == null || mtaQuoteError.f75259a != x0.DECLINED) {
            z0 z0Var = mtaState.f75263c;
            if (z0Var != z0.IN_PROGRESS) {
                boolean z = mtaQuote != null;
                x0 x0Var = mtaQuoteError != null ? mtaQuoteError.f75259a : null;
                Boolean boolValueOf = mtaQuoteError != null ? Boolean.valueOf(mtaQuoteError.f75260b) : null;
                y0 y0Var = mtaState.f;
                StringBuilder sbM = v0.a.m("mtaState: mtaId=", str2, ", applicationId=", str, ", status=");
                sbM.append(z0Var);
                sbM.append(", hasQuote=");
                sbM.append(z);
                sbM.append(", quoteErrorReason=");
                sbM.append(x0Var);
                sbM.append(", quoteErrorReferral=");
                sbM.append(boolValueOf);
                sbM.append(", cancellationReason=");
                sbM.append(y0Var);
                throw new IllegalStateException(sbM.toString().toString());
            }
            dVar.getClass();
            n.j2(dVar, dVar.L2(vl7.a.f(new TextLocalisedClause(R$string.car_insurance_mta_quotes_timeout_title, null, null, 14), new TextLocalisedClause(R$string.car_insurance_mta_quotes_timeout_description, null, null, 14), new TextLocalisedClause(R$string.car_insurance_common_try_again, null, null, 14), null)), null, new a9h.a(9, (Object) dVar, (Object) function1, str2, (Continuation) (objArr == true ? 1 : 0)), 3);
        } else {
            dVar.t2();
            function1.invoke(new MtaCreateResult.Decline(mtaQuoteError.f75260b));
        }
        return Unit.f186387a;
    }
}
