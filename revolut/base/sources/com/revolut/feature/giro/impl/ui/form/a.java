package com.revolut.feature.giro.impl.ui.form;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.giro.api.R$string;
import com.revolut.feature.giro.impl.ui.form.DirectDebitFormScreenContract$InputData;
import com.revolut.feature.giro.impl.ui.form.domain.FormState;
import elm.f;
import gim.i;
import j02.p;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import nii.g0;
import nii.y0;
import skm.e0;
import skm.p0;
import vq5.w;
import vz1.g;
import yhm.o;
import yji.l;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ FormState f74547w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, FormState formState, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
        this.f74547w = formState;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, this.f74547w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        Continuation continuation = null;
        b bVar = this.v;
        if (i == 0) {
            o.b(obj2);
            g gVar = bVar.f74550r;
            String str = ((DirectDebitFormScreenContract$InputData.Edit) bVar.o).f74542a.f61992a;
            FormState formState = this.f74547w;
            p pVar = new p(formState.e, formState.d);
            this.u = 1;
            gVar.getClass();
            w wVar = new w(gVar, str, pVar, continuation, 14);
            p0 p0Var = p0.f264001a;
            if (e0.J(f.f127540b, wVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return l.a1(bVar, bVar.X1(new y0("SUBMIT_CHANGES_SUCCESS_ID", new g0(new TextLocalisedClause(R$string.giro_direct_debits_review_direct_debit_success_title, null, null, 14), new TextLocalisedClause(R$string.giro_direct_debits_review_direct_debit_success_description, null, null, 14), null, null, null, null, null, null, false, null, false, null, 16380), false, 4)), null, null, new az.i(bVar, null, 13), 3);
    }
}
