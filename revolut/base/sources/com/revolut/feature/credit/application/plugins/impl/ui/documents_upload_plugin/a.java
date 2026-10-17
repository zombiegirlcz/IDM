package com.revolut.feature.credit.application.plugins.impl.ui.documents_upload_plugin;

import com.revolut.feature.credit.application.plugins.impl.ui.documents_upload_plugin.DocumentsUploadPluginFlowContract$Step;
import com.revolut.kompot.navigable.TransitionAnimation;
import elm.f;
import ft3.h1;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import ny3.p;
import oki.h;
import skm.e0;
import skm.p0;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends i implements Function2 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        b bVar = this.v;
        if (i == 0) {
            o.b(obj2);
            ax3.a aVar2 = bVar.f67603q;
            h1 h1VarA9 = bVar.f67604r.a9();
            this.u = 1;
            g34.a aVar3 = aVar2.f10853a;
            aVar3.getClass();
            g1k.i iVar = new g1k.i(aVar3, h1VarA9, null, 3);
            p0 p0Var = p0.f264001a;
            obj2 = e0.J(f.f127540b, iVar, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        h.t2(bVar, bVar.f67606t, new DocumentsUploadPluginFlowContract$Step.DocumentsUpload((p) obj2), false, TransitionAnimation.NONE.f98393a, false, 8);
        return Unit.f186387a;
    }
}
