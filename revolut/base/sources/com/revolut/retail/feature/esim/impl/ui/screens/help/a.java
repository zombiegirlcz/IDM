package com.revolut.retail.feature.esim.impl.ui.screens.help;

import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.esim.api.model.EsimProfile;
import com.revolut.retail.feature.esim.impl.ui.screens.help.EsimHelpScreenContract$ModalStep;
import gim.i;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import oki.h;
import rd0.c;
import rd0.d;
import xb4.g;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends i implements Function2 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f100980w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, String str, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
        this.f100980w = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.v, this.f100980w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        b bVar = this.v;
        if (i == 0) {
            o.b(obj2);
            this.u = 1;
            obj2 = bVar.p2(this, new g(bVar, this.f100980w, null, 3));
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        EsimProfile esimProfile = (EsimProfile) obj2;
        if (esimProfile != null) {
            h.v2(bVar.u, new EsimHelpScreenContract$ModalStep.InstallEsim(esimProfile), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("Cannot install eSIM: requested profile not found");
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
            d.a(c.ERROR, "EsimHelpScreenModel", null, illegalStateException, h0Var);
        }
        return Unit.f186387a;
    }
}
