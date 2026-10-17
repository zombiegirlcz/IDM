package com.revolut.feature.junior.account_activation.impl.ui.screen.request;

import cli.y;
import com.revolut.feature.junior.account_activation.impl.ui.screen.request.ActivationRequestScreenContract$ModalStep;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import n33.l0;
import n68.k;
import oki.h;
import rd0.e;
import vgk.g;
import vkm.j2;
import vkm.q;
import w4l.j;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends i implements Function1 {
    public c u;
    public com.revolut.kompot.navigable.vc.modal.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f76687w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f76688x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f76689y;
    public final /* synthetic */ c z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Continuation continuation) {
        super(1, continuation);
        this.z = cVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b(this.z, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        c cVar;
        com.revolut.kompot.navigable.vc.modal.a aVar;
        String str;
        String str2;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.f76689y;
        if (i == 0) {
            o.b(obj2);
            cVar = this.z;
            com.revolut.kompot.navigable.vc.modal.a aVar3 = cVar.f76695w;
            y yVar = cVar.v;
            String str3 = ((k) ((j2) yVar.f22677a).getValue()).f212721a;
            String str4 = ((k) ((j2) yVar.f22677a).getValue()).f212722b;
            this.u = cVar;
            this.v = aVar3;
            this.f76687w = str3;
            this.f76688x = str4;
            this.f76689y = 1;
            Object objX = q.x(e.e(mo3.a.h(q.q(nim.a.v(cVar.f76693s.f289345a.j(j.f294644c), new g(4))), new mig.a(23), new l0(15), 2), h0.f322473a, new n28.b(3, 8, null)), this);
            if (objX == aVar2) {
                return aVar2;
            }
            aVar = aVar3;
            obj2 = objX;
            str = str4;
            str2 = str3;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = this.f76688x;
            str2 = this.f76687w;
            aVar = this.v;
            cVar = this.u;
            o.b(obj2);
        }
        h.x2(cVar, aVar, new ActivationRequestScreenContract$ModalStep.EditName(str2, str, ((Boolean) obj2).booleanValue()));
        return Unit.f186387a;
    }
}
