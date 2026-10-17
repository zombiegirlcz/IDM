package com.revolut.trading.orders.ui.screens.pocket_picker;

import com.revolut.kompot.common.ModalDestination;
import com.revolut.trading.orders.ui.screens.pocket_picker.SourcePocketPickerScreenContract$ModalStep;
import cul.n2;
import cul.r1;
import cvl.l;
import gim.i;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import oki.h;
import vkm.j2;
import vkm.q;
import yhm.o;

/* JADX INFO: loaded from: classes12.dex */
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
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        b bVar = this.v;
        if (i == 0) {
            o.b(obj2);
            jhi.b bVarG = mo3.a.g(bVar.getState().B(new n2(26)), null, new r1(11), 1);
            this.u = 1;
            obj2 = q.x(bVarG, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        h.v2(bVar.z, new SourcePocketPickerScreenContract$ModalStep.CurrencyChooser((Set) obj2, ((l) ((j2) bVar.getState().f22677a).getValue()).f109489a), ModalDestination.Style.POPUP.f98311a);
        return Unit.f186387a;
    }
}
