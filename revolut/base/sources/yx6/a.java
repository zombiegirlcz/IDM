package yx6;

import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceSettings;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import wx6.h;
import yhm.o;
import yx6.c;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ FreelancerInvoiceSettings f317573w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ h f317574x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, FreelancerInvoiceSettings freelancerInvoiceSettings, h hVar, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
        this.f317573w = freelancerInvoiceSettings;
        this.f317574x = hVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, this.f317573w, this.f317574x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object obj3 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        b bVar = this.v;
        if (i == 0) {
            o.b(obj2);
            this.u = 1;
            Object objB = nim.a.b(bVar.f317575l.k(FreelancerInvoiceSettings.a(this.f317573w, null, null, null, null, null, null, null, null, null, null, this.f317574x.f300762c, null, 12287)), this);
            if (objB != obj3) {
                objB = Unit.f186387a;
            }
            if (objB == obj3) {
                return obj3;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return bVar.r2().M0(c.a.f317576b);
    }
}
