package com.revolut.feature.credit.application.plugins.impl.ui.consents_v2.content;

import b74.h;
import cli.y;
import com.revolut.feature.credit.application.plugins.api.models.consent_preferences.ConsentPreferences;
import com.revolut.feature.credit.application.plugins.api.models.consent_preferences.ConsentPreferencesSelection;
import com.revolut.feature.credit.application.plugins.api.models.consent_preferences.ConsentRetention;
import ft3.h1;
import gim.i;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import lu3.c;
import rd0.d;
import vkm.j2;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b74.i f67307w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, b74.i iVar, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
        this.f67307w = iVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, this.f67307w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        ConsentPreferencesSelection consentPreferencesSelection;
        b bVar = this.v;
        y yVar = bVar.f67312t;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            c cVar = (c) ((h74.a) ((j2) yVar.f22677a).getValue()).f149842b.getContent();
            ConsentPreferences consentPreferences = cVar != null ? cVar.f : null;
            if (consentPreferences == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Consent preferences are not available");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
                d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                return Unit.f186387a;
            }
            ConsentRetention consentRetention = ((h) this.f67307w).f12890a;
            if (consentRetention instanceof ConsentRetention.ActiveFacility) {
                consentPreferencesSelection = new ConsentPreferencesSelection((ConsentRetention.ActiveFacility) consentRetention, consentPreferences.f66435b.f66442a);
            } else {
                if (!(consentRetention instanceof ConsentRetention.Application)) {
                    throw new NoWhenBranchMatchedException();
                }
                consentPreferencesSelection = new ConsentPreferencesSelection(consentPreferences.f66434a.f66431a, (ConsentRetention.Application) consentRetention);
            }
            sw3.c cVar2 = bVar.f67308p;
            h1 h1VarA9 = bVar.o.a9();
            this.u = 1;
            obj2 = cVar2.d(h1VarA9, consentPreferencesSelection, null, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        bVar.H2(yVar, new h74.o((c) obj2, 1));
        return Unit.f186387a;
    }
}
