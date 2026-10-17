package tz6;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.freelancer.impl.R$string;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pfm.r;
import te0.w;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o f275882w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f275883x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(o oVar, String str, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f275882w = oVar;
        this.f275883x = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new m(this.f275882w, this.f275883x, continuation, 0);
            case 1:
                return new m(this.f275882w, this.f275883x, continuation, 1);
            default:
                return new m(this.f275882w, this.f275883x, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((m) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                String str = this.f275883x;
                o oVar = this.f275882w;
                l lVar = new l(oVar, str, null);
                this.v = 1;
                Object objP2 = oVar.p2(this, lVar);
                return objP2 == aVar ? aVar : objP2;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                o oVar2 = this.f275882w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    ugc.g gVar = (ugc.g) oVar2.o;
                    gVar.getClass();
                    String perkId = this.f275883x;
                    Intrinsics.checkNotNullParameter(perkId, "perkId");
                    phc.j jVar = (phc.j) gVar.f280008b;
                    Intrinsics.checkNotNullParameter(perkId, "perkId");
                    r rVarG0 = w.g0(jVar.f236272a.redeemViaEmail(perkId));
                    this.v = 1;
                    if (nim.a.a(rVarG0, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return oVar2.X1(new mii.k("SUCCESS_DIALOG_ID_EMAIL_SENT", new TextLocalisedClause(R$string.freelancer_perks_perk_action_email_confirmation, null, null, 14), null, null, null, 28));
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                o oVar3 = this.f275882w;
                m mVar = new m(oVar3, this.f275883x, null, 1);
                this.v = 1;
                Object objP22 = oVar3.p2(this, mVar);
                return objP22 == aVar3 ? aVar3 : objP22;
        }
    }
}
