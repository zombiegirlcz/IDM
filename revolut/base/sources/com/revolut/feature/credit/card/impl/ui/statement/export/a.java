package com.revolut.feature.credit.card.impl.ui.statement.export;

import com.revolut.feature.credit.card.impl.ui.statement.export.CreditCardStatementExportScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import gim.i;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends i implements Function1 {
    public final /* synthetic */ b u;
    public final /* synthetic */ LocalDate v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, LocalDate localDate, Continuation continuation) {
        super(1, continuation);
        this.u = bVar;
        this.v = localDate;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        b bVar = this.u;
        com.revolut.kompot.navigable.vc.modal.a aVar2 = bVar.u;
        Iterator it8 = bVar.J2().f219461b.iterator();
        if (!it8.hasNext()) {
            throw new NoSuchElementException();
        }
        LocalDate localDate = ((vl4.i) it8.next()).f290263a;
        while (it8.hasNext()) {
            LocalDate localDate2 = ((vl4.i) it8.next()).f290263a;
            if (localDate.compareTo((Object) localDate2) > 0) {
                localDate = localDate2;
            }
        }
        Iterator it9 = bVar.J2().f219461b.iterator();
        if (!it9.hasNext()) {
            throw new NoSuchElementException();
        }
        LocalDate localDate3 = ((vl4.i) it9.next()).f290263a;
        while (it9.hasNext()) {
            LocalDate localDate4 = ((vl4.i) it9.next()).f290263a;
            if (localDate3.compareTo((Object) localDate4) < 0) {
                localDate3 = localDate4;
            }
        }
        h.v2(aVar2, new CreditCardStatementExportScreenContract$ModalStep.Calendar(this.v, localDate, localDate3), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        return Unit.f186387a;
    }
}
