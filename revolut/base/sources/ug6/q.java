package ug6;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.external_accounts.impl.R$string;
import com.revolut.feature.external_accounts.models.ExternalAccountTopupPayload;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.g0;
import nii.y0;
import rfm.w;
import rfm.y;

/* JADX INFO: loaded from: classes3.dex */
public final class q extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ ExternalAccountTopupPayload.OneOffPayload v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ v f279964w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(ExternalAccountTopupPayload.OneOffPayload oneOffPayload, Continuation continuation, v vVar) {
        super(1, continuation);
        this.v = oneOffPayload;
        this.f279964w = vVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new q(this.v, continuation, this.f279964w);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((q) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        v vVar = this.f279964w;
        if (i == 0) {
            yhm.o.b(obj2);
            ExternalAccountTopupPayload.OneOffPayload oneOffPayload = this.v;
            int i2 = p.f279963a[oneOffPayload.f73109c.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    v.b3(vVar);
                } else {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    tji.f fVarQ2 = vVar.q2();
                    ((nh6.a) vVar.f279968l).getClass();
                    fVarQ2.d(new y0(null, new g0(new TextLocalisedClause(R$string.external_institutions_topup_oauth_pending_title, null, null, 14), new TextLocalisedClause(R$string.external_institutions_topup_oauth_pending_description, null, null, 14), null, null, null, null, null, null, false, null, false, null, 16380), false, 5));
                }
                return Unit.f186387a;
            }
            String institutionId = oneOffPayload.f73107a;
            if (institutionId == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            xg6.j jVar = (xg6.j) vVar.f279969m;
            jVar.getClass();
            Intrinsics.checkNotNullParameter(institutionId, "institutionId");
            w21.o oVar = (w21.o) jVar.f305582a;
            Intrinsics.checkNotNullParameter(institutionId, "institutionId");
            Intrinsics.checkNotNullParameter(institutionId, "institutionId");
            rfm.o oVar2 = new rfm.o(new to7.f(oVar, institutionId, 23));
            Intrinsics.checkNotNullExpressionValue(oVar2, "fromCallable(...)");
            w wVarH0 = te0.w.h0(oVar2);
            vz4.c cVar = new vz4.c(new w21.b(oVar, institutionId, 0), 16);
            dfm.c cVar2 = mfm.f.d;
            rfm.s sVar = new rfm.s(new y(wVarH0, cVar2, cVar, cVar2, mfm.f.f205043c));
            Intrinsics.checkNotNullExpressionValue(sVar, "ignoreElement(...)");
            pfm.r rVarG0 = te0.w.g0(sVar);
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
        vVar.d3();
        return Unit.f186387a;
    }
}
