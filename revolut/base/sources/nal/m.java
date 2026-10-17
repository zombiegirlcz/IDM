package nal;

import com.revolut.shared.feature.suspicious_transaction.api.models.Action;
import com.revolut.shared.feature.suspicious_transaction.impl.data.service.SuspiciousTransactionService;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pfm.r;
import pfm.t;
import te0.w;

/* JADX INFO: loaded from: classes12.dex */
public final class m extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.shared.feature.suspicious_transaction.impl.flow.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Action.Request f213936w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.revolut.shared.feature.suspicious_transaction.impl.flow.a aVar, Action.Request request, Continuation continuation) {
        super(1, continuation);
        this.v = aVar;
        this.f213936w = request;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new m(this.v, this.f213936w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((m) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        efm.b bVarExecutePostRequest;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            fal.b bVar = this.v.f105004y;
            Action.Request request = this.f213936w;
            com.revolut.shared.feature.suspicious_transaction.api.models.a method = request.f104896a;
            String path = request.f104897b;
            pal.a aVar2 = (pal.a) bVar;
            aVar2.getClass();
            Intrinsics.checkNotNullParameter(method, "method");
            Intrinsics.checkNotNullParameter(path, "path");
            ial.f fVar = (ial.f) aVar2.f234578a;
            SuspiciousTransactionService suspiciousTransactionService = fVar.f160059a;
            Intrinsics.checkNotNullParameter(method, "method");
            Intrinsics.checkNotNullParameter(path, "path");
            int i2 = ial.e.f160058b[method.ordinal()];
            if (i2 == 1) {
                bVarExecutePostRequest = suspiciousTransactionService.executePostRequest(path);
            } else if (i2 == 2) {
                bVarExecutePostRequest = suspiciousTransactionService.executePutRequest(path);
            } else if (i2 == 3) {
                bVarExecutePostRequest = suspiciousTransactionService.executePatchRequest(path);
            } else {
                if (i2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                bVarExecutePostRequest = suspiciousTransactionService.executeDeleteRequest(path);
            }
            t tVarL = bVarExecutePostRequest.l(new i1i.a(fVar, 1));
            Intrinsics.checkNotNullExpressionValue(tVarL, "doOnComplete(...)");
            r rVarG0 = w.g0(tVarL);
            this.u = 1;
            if (nim.a.a(rVarG0, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}
