package com.revolut.feature.spending_analytics.impl.ui.rev10.category_management.list;

import com.revolut.core.ui_kit.dialogs.ShotDialogDisplayer$Configuration;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.spending_analytics.api.R$string;
import com.revolut.feature.spending_analytics.impl.ui.rev10.category_management.list.CategoryManagementListContract$Mode;
import dpd.k;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import rp0.k1;
import tof.a3;
import tof.i3;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends i implements Function2 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i3 f87659w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ i3 f87660x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, i3 i3Var, i3 i3Var2, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
        this.f87659w = i3Var;
        this.f87660x = i3Var2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.v, this.f87659w, this.f87660x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        b bVar = this.v;
        k kVar = bVar.f87662q;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            a3 a3Var = ((CategoryManagementListContract$Mode.Select) bVar.o.f87656b).f87658a;
            this.u = 1;
            obj2 = kVar.f3(a3Var, this.f87659w, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        if (((Boolean) obj2).booleanValue()) {
            ((k1) kVar.f116872n).d(ShotDialogDisplayer$Configuration.Companion.a(ShotDialogDisplayer$Configuration.INSTANCE, "SUCCESS_DIALOG_ID", new TextLocalisedClause(R$string.analytics_categories_toast_changed, null, null, 14), null, 60));
        } else {
            bVar.I2(this.f87660x);
        }
        return Unit.f186387a;
    }
}
