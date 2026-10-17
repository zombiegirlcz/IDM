package com.revolut.feature.credit.application.plugins.impl.ui.rollee;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import elm.f;
import ft3.h1;
import g23.q;
import gim.i;
import grl.k9;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import nii.y0;
import nii.z;
import qh4.h;
import qh4.v;
import qh4.y;
import skm.e0;
import skm.p0;
import yhm.o;
import yji.l;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f68332w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ y f68333x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(c cVar, y yVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f68332w = cVar;
        this.f68333x = yVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.f68332w, this.f68333x, continuation, 0);
            case 1:
                return new b(this.f68332w, this.f68333x, continuation, 1);
            default:
                return new b(this.f68332w, this.f68333x, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((b) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object objJ;
        int i = this.u;
        Continuation continuation = null;
        c cVar = this.f68332w;
        int i2 = 0;
        y yVar = this.f68333x;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                c cVar2 = this.f68332w;
                Continuation continuation2 = null;
                if (i3 == 0) {
                    o.b(obj2);
                    cy3.a aVar2 = cVar2.f68335q;
                    zt3.a aVar3 = new zt3.a(((v) yVar).f246478a);
                    h1 h1VarA9 = cVar2.f68334p.a9();
                    this.v = 1;
                    g44.b bVar = aVar2.f110037a;
                    bVar.getClass();
                    q qVar = new q(bVar, h1VarA9, aVar3, continuation2, 3);
                    p0 p0Var = p0.f264001a;
                    objJ = e0.J(f.f127540b, qVar, this);
                    if (objJ == aVar) {
                        return aVar;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objJ = obj2;
                }
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_common_error_title, null, null, 14);
                k9 k9Var = k9.Credit;
                Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                l.a1(cVar2, cVar2.X1(new y0(null, new z(textLocalisedClause, null, null, null, null, null, true, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, null, null, null, 31998), false, 5)), null, null, new h(null, cVar2, (it3.d) objJ, 0), 3);
                return Unit.f186387a;
            case 1:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    o.b(obj2);
                    b bVar2 = new b(cVar, yVar, continuation, i2);
                    this.v = 1;
                    if (cVar.p2(this, bVar2) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    o.b(obj2);
                    com.revolut.feature.credit.application.plugins.impl.ui.form.a aVar6 = new com.revolut.feature.credit.application.plugins.impl.ui.form.a(cVar, yVar, continuation, 2);
                    this.v = 1;
                    if (cVar.p2(this, aVar6) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
