package voe;

import android.content.Context;
import com.revolut.feature.tax_residency.impl.stamp_duty.service.StampDutyService;
import kotlin.jvm.internal.Intrinsics;
import sri.m;
import sri.o;
import vc.s;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f290947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f290948b;

    public b(c cVar, int i) {
        this.f290947a = cVar;
        this.f290948b = i;
    }

    @Override // phm.a
    public final Object get() {
        c cVar = this.f290947a;
        nj0.a aVar = cVar.f290951c;
        int i = this.f290948b;
        if (i == 0) {
            return new toe.a();
        }
        if (i == 1) {
            return new uoe.c((m) cVar.f290952g.get(), (cne.a) cVar.f290954j.get());
        }
        if (i == 2) {
            Context context = cVar.f290949a;
            g.Companion.getClass();
            Intrinsics.checkNotNullParameter(context, "context");
            return o.c(context, null, null, 14);
        }
        if (i == 3) {
            return new yoe.c(cVar.f290950b.e(), (ape.c) cVar.i.get(), cVar.d.c());
        }
        if (i == 4) {
            return new ape.c((StampDutyService) cVar.f290953h.get());
        }
        if (i != 5) {
            throw new AssertionError(i);
        }
        ik0.b retrofitFactory = ((nj0.d) aVar).m();
        s.j(retrofitFactory);
        ek.a converterFactory = ((nj0.d) aVar).d();
        g.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(StampDutyService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        StampDutyService stampDutyService = (StampDutyService) objCreate;
        s.k(stampDutyService);
        return stampDutyService;
    }
}
