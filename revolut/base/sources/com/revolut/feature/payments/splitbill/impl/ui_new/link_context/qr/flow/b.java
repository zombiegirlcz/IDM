package com.revolut.feature.payments.splitbill.impl.ui_new.link_context.qr.flow;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.payments.splitbill.api.R$string;
import com.revolut.feature.payments.splitbill.impl.ui_new.link_context.qr.flow.SplitBillQrFlowContract$Step;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import mii.k;
import oki.g;
import s1a.d;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends i implements Function2 {
    public int u;
    public final /* synthetic */ c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f79872w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ g f79873x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ SplitBillQrFlowContract$Step.EditSplit f79874y;
    public final /* synthetic */ dj0.d z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, d dVar, g gVar, SplitBillQrFlowContract$Step.EditSplit editSplit, dj0.d dVar2, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
        this.f79872w = dVar;
        this.f79873x = gVar;
        this.f79874y = editSplit;
        this.z = dVar2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.v, this.f79872w, this.f79873x, this.f79874y, this.z, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        c cVar = this.v;
        if (i == 0) {
            o.b(obj2);
            String str = this.f79872w.f259119a;
            a aVar2 = new a(cVar, this.f79874y, this.z, null);
            this.u = 1;
            if (u0.b0(cVar.X(), str, aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        this.f79873x.pop();
        return cVar.X1(new k("QR_CODE_UPDATED_DIALOG_ID", new TextLocalisedClause(R$string.split_with_anyone_qr_screen_edit_success_dialog, null, null, 14), null, null, null, 28));
    }
}
