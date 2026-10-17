package com.revolut.feature.statements.impl.ui.custom_statement.screen;

import com.revolut.feature.statements.impl.ui.custom_statement.screen.CustomStatementScreenContract$ModalStep;
import gim.i;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends i implements Function1 {
    public b u;
    public com.revolut.kompot.navigable.vc.modal.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public xi0.b f88345w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f88346x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ b f88347y;
    public final /* synthetic */ xi0.b z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, xi0.b bVar2, Continuation continuation) {
        super(1, continuation);
        this.f88347y = bVar;
        this.z = bVar2;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.f88347y, this.z, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        com.revolut.kompot.navigable.vc.modal.a aVar;
        b bVar;
        xi0.b bVar2;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.f88346x;
        if (i == 0) {
            o.b(obj2);
            b bVar3 = this.f88347y;
            aVar = bVar3.z;
            kgm.i iVar = bVar3.o;
            this.u = bVar3;
            this.v = aVar;
            xi0.b bVar4 = this.z;
            this.f88345w = bVar4;
            this.f88346x = 1;
            Object objE = iVar.e(this);
            if (objE == aVar2) {
                return aVar2;
            }
            bVar = bVar3;
            obj2 = objE;
            bVar2 = bVar4;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar2 = this.f88345w;
            aVar = this.v;
            bVar = this.u;
            o.b(obj2);
        }
        h.x2(bVar, aVar, new CustomStatementScreenContract$ModalStep.CurrencyPicker((List) obj2, bVar2));
        return Unit.f186387a;
    }
}
