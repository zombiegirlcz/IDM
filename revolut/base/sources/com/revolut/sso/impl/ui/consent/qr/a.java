package com.revolut.sso.impl.ui.consent.qr;

import akl.m0;
import akl.n0;
import cjl.n;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.sso.api.models.ConsentChallenge;
import com.revolut.sso.impl.ui.consent.qr.QrConsentFlowContract$Step;
import elm.f;
import gim.i;
import gkl.d;
import gkl.e;
import gkl.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import skm.e0;
import skm.p0;
import yhm.o;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ ConsentChallenge.Qr.Delegated.Selection.Identity v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f106475w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ConsentChallenge.Qr f106476x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ConsentChallenge.Qr.Delegated.Selection.Identity identity, b bVar, ConsentChallenge.Qr qr10, Continuation continuation) {
        super(1, continuation);
        this.v = identity;
        this.f106475w = bVar;
        this.f106476x = qr10;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, this.f106475w, this.f106476x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        ConsentChallenge.Qr qr10 = this.f106476x;
        b bVar = this.f106475w;
        ConsentChallenge.Qr.Delegated.Selection.Identity identity = this.v;
        if (i == 0) {
            o.b(obj2);
            String value = identity.f105921a;
            n0 n0Var = bVar.f106480t;
            n nVar = bVar.f106477q.f106466a;
            String f105924a = qr10.getF105924a();
            Intrinsics.checkNotNullParameter(value, "value");
            this.u = 1;
            n0Var.getClass();
            p0 p0Var = p0.f264001a;
            obj2 = e0.J(f.f127540b, new m0(value, n0Var, nVar, f105924a, null), this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        g gVar = (g) obj2;
        if (gVar instanceof e) {
            h.t2(bVar, bVar.v, new QrConsentFlowContract$Step.Confirmation(((e) gVar).f144442a, identity), false, TransitionAnimation.NONE.f98393a, false, 8);
        } else if (gVar instanceof gkl.f) {
            bVar.l2(new ack.o((Object) bVar, (Object) null, false, (Object) qr10.getF105924a(), (Continuation) null, 6), new yi5.b(26));
        } else {
            if (!(gVar instanceof d)) {
                throw new NoWhenBranchMatchedException();
            }
            bVar.M2((d) gVar);
        }
        return Unit.f186387a;
    }
}
