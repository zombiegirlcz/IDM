package com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.initiator.flow;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.credit.application.plugins.api.models.co_borrower.consent.CoBorrower;
import com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.initiator.flow.CoBorrowerConsentInitiatorFlowContract$Step;
import com.revolut.kompot.navigable.TransitionAnimation;
import elm.f;
import ft3.h1;
import gim.i;
import iu3.g;
import iu3.j;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import oki.h;
import skm.e0;
import skm.p0;
import t24.d;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object objJ;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        b bVar = this.v;
        Continuation continuation = null;
        int i2 = 1;
        if (i == 0) {
            o.b(obj2);
            pw3.a aVar2 = bVar.f67223q;
            h1 h1VarA9 = bVar.f67222p.a9();
            this.u = 1;
            d dVar = aVar2.f240317a;
            dVar.getClass();
            t24.b bVar2 = new t24.b(dVar, h1VarA9, continuation, i2);
            p0 p0Var = p0.f264001a;
            objJ = e0.J(f.f127540b, bVar2, this);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            objJ = obj2;
        }
        j jVar = (j) objJ;
        iu3.i iVar = jVar.f168479a;
        g gVar = jVar.f168480b;
        iu3.d dVar2 = gVar.e;
        if (iVar != null) {
            h.t2(bVar, bVar.f67225s, new CoBorrowerConsentInitiatorFlowContract$Step.SelectContact(iVar, gVar), false, TransitionAnimation.FADE.f98392a, false, 8);
        } else if (dVar2 != null) {
            yki.a aVar3 = bVar.f67225s;
            zv3.a aVar4 = zv3.a.CLOSE;
            String str = dVar2.f168464a;
            String str2 = dVar2.f168465b;
            h.t2(bVar, aVar3, new CoBorrowerConsentInitiatorFlowContract$Step.RequestConsent(aVar4, gVar, new CoBorrower.InternalPhone(new ContactImage(str2, (String) null, (String) null, (String) null, (String) null, str, (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4062), str, str2)), false, TransitionAnimation.FADE.f98392a, false, 8);
        } else {
            bVar.K2(null);
        }
        return Unit.f186387a;
    }
}
