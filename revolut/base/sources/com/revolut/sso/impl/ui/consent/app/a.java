package com.revolut.sso.impl.ui.consent.app;

import bjl.c;
import bjl.d;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.sso.api.R$string;
import com.revolut.sso.api.models.ConsentChallenge;
import com.revolut.sso.impl.ui.consent.app.AppConsentFlowContract$Step;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import nii.y0;
import nii.z;
import oki.h;
import x0f.g;
import xll.e;
import yhm.o;
import yji.l;
import zh9.u0;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends i implements Function2 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f106448w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ConsentChallenge f106449x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, String str, ConsentChallenge consentChallenge, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
        this.f106448w = str;
        this.f106449x = consentChallenge;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.v, this.f106448w, this.f106449x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objB0;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        b bVar = this.v;
        if (i == 0) {
            o.b(obj2);
            e eVar = new e(bVar, this.f106449x, null, 0);
            this.u = 1;
            objB0 = u0.b0(bVar.X(), this.f106448w, eVar, this);
            if (objB0 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            objB0 = obj2;
        }
        d dVar = (d) objB0;
        if (dVar instanceof bjl.a) {
            bVar.I2();
            h.D2(bVar.v);
        } else if (dVar instanceof bjl.b) {
            h.t2(bVar, bVar.v, new AppConsentFlowContract$Step.DelegatedAuthentication(((bjl.b) dVar).f16158a), false, null, false, 12);
        } else {
            if (!(dVar instanceof c)) {
                throw new NoWhenBranchMatchedException();
            }
            l.a1(bVar, bVar.X1(new y0("CHALLENGE_NO_LONGER_AVAILABLE", new z(new TextLocalisedClause(R$string.revolut_sso_login_confirmation_challenge_expired_title, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_login_confirmation_challenge_expired_description, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_common_actions_got_it, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 4)), null, null, new g(bVar, null, 26), 3);
        }
        return Unit.f186387a;
    }
}
