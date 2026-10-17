package com.revolut.feature.freelancer.impl.ui.tax_hub.payment.assessment;

import com.revolut.feature.freelancer.impl.ui.tax_hub.payment.assessment.TaxHubPaymentAssessmentScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import do3.q;
import gim.i;
import java.util.ArrayList;
import java.util.List;
import k37.f;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ArrayList f74304w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ f f74305x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, ArrayList arrayList, f fVar, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
        this.f74304w = arrayList;
        this.f74305x = fVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, this.f74304w, this.f74305x, continuation);
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
            this.u = 1;
            obj2 = b.I2(bVar, this.f74304w, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        List list = (List) obj2;
        if (list.isEmpty()) {
            bVar.C2(k37.i.f180632a);
        } else {
            h.v2(bVar.v, new TaxHubPaymentAssessmentScreenContract$ModalStep.RecipientPicker(list, q.y(this.f74305x.f180627c)), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
        return Unit.f186387a;
    }
}
