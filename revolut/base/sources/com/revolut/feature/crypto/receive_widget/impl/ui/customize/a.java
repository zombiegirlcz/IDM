package com.revolut.feature.crypto.receive_widget.impl.ui.customize;

import com.revolut.feature.crypto.receive_widget.impl.ui.customize.CryptoReceiveWidgetCustomizationContract$Step;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import oki.g;
import pfm.h;
import pfm.r;
import te0.w;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends i implements Function2 {
    public int u;
    public final /* synthetic */ c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f70915w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ CryptoReceiveWidgetCustomizationContract$Step.MindfulOfNetwork f70916x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, g gVar, CryptoReceiveWidgetCustomizationContract$Step.MindfulOfNetwork mindfulOfNetwork, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
        this.f70915w = gVar;
        this.f70916x = mindfulOfNetwork;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.v, this.f70915w, this.f70916x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        c cVar = this.v;
        if (i == 0) {
            o.b(obj2);
            vbj.c cVar2 = cVar.f70923w;
            cVar2.getClass();
            h hVar = new h(new ty7.b(cVar2, 11), 2);
            Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
            r rVarG0 = w.g0(hVar);
            this.u = 1;
            if (nim.a.a(rVarG0, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        this.f70915w.pop();
        CryptoReceiveWidgetCustomizationContract$Step.MindfulOfNetwork mindfulOfNetwork = this.f70916x;
        cVar.C2(new vj5.c(mindfulOfNetwork.f70910a, mindfulOfNetwork.f70912c, mindfulOfNetwork.f70911b));
        return Unit.f186387a;
    }
}
