package com.revolut.feature.card_order_new.impl.kompot.screen.extra_security;

import com.revolut.feature.card_order_new.impl.kompot.screen.extra_security.CardExtraSecurityControllerContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import gim.i;
import ha3.x;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import rd0.e;
import v6l.b1;
import vkm.j2;
import vkm.q;
import w4l.h;
import yhm.o;
import z6l.s;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends i implements Function1 {
    public String u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f65197w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(1, continuation);
        this.f65197w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.f65197w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        b bVar = this.f65197w;
        if (i == 0) {
            o.b(obj2);
            String str2 = ((j33.i) ((j2) bVar.f65200r.f22677a).getValue()).f170943g;
            if (str2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            x xVar = (x) bVar.f65199q;
            xVar.getClass();
            h loadingStrategy = h.f294642c;
            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            s sVar = xVar.f;
            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            b1 b1Var = (b1) sVar.f319829a;
            b1Var.getClass();
            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            jhi.b bVarG = mo3.a.g(e.b(b1Var.f286438w.e(Unit.f186387a, loadingStrategy)), null, new j0g.b(14), 1);
            this.u = str2;
            this.v = 1;
            Object objX = q.x(bVarG, this);
            if (objX == aVar) {
                return aVar;
            }
            str = str2;
            obj2 = objX;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = this.u;
            o.b(obj2);
        }
        oki.h.v2(bVar.f65201s, new CardExtraSecurityControllerContract$ModalStep.ChangeCardholderName((List) obj2, str), ModalDestination.Style.POPUP.f98311a);
        return Unit.f186387a;
    }
}
