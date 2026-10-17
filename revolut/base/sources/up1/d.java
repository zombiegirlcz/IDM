package up1;

import com.revolut.feature.apm.bills.core.impl.data.network.BillsService;
import com.revolut.feature.apm.bills.core.impl.data.network.BillsServiceV2;
import fp1.f;
import ip1.b;
import jla.h;
import kg.o;
import kg.p;
import kotlin.jvm.internal.Intrinsics;
import lz1.m;
import qp1.k;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import rp1.j;
import vc.s;

/* JADX INFO: loaded from: classes20.dex */
public final class d implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f281803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f281804b;

    public d(e eVar, int i) {
        this.f281803a = eVar;
        this.f281804b = i;
    }

    @Override // phm.a
    public final Object get() {
        e eVar = this.f281803a;
        nj0.a aVar = eVar.e;
        xmg.a aVar2 = eVar.d;
        int i = this.f281804b;
        switch (i) {
            case 0:
                uw1.c cVarD = ((m) eVar.f281805a).d();
                s.j(cVarD);
                h hVarA = eVar.f281806b.a();
                gte.a aVarB = eVar.f281807c.b();
                s.j(aVarB);
                return new fp1.d(cVarD, hVarA, aVarB, aVar2.e());
            case 1:
                return new f((vo1.c) eVar.f281809h.get(), aVar2.e());
            case 2:
                return new vp1.c(new j((BillsService) eVar.f281810j.get(), (BillsServiceV2) eVar.f281811l.get(), new ne0.d()));
            case 3:
                Retrofit retrofit = ((nj0.d) aVar).f();
                b.Companion.getClass();
                Intrinsics.checkNotNullParameter(retrofit, "retrofit");
                Object objCreate = retrofit.create(BillsService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                BillsService billsService = (BillsService) objCreate;
                s.k(billsService);
                return billsService;
            case 4:
                Retrofit retrofit3 = (Retrofit) eVar.k.get();
                b.Companion.getClass();
                Intrinsics.checkNotNullParameter(retrofit3, "retrofit");
                Object objCreate2 = retrofit3.create(BillsServiceV2.class);
                Intrinsics.checkNotNullExpressionValue(objCreate2, "create(...)");
                BillsServiceV2 billsServiceV2 = (BillsServiceV2) objCreate2;
                s.k(billsServiceV2);
                return billsServiceV2;
            case 5:
                ik0.b factory = ((nj0.d) aVar).m();
                s.j(factory);
                o gson = ((c21.b) eVar.f).h();
                s.j(gson);
                b.Companion.getClass();
                Intrinsics.checkNotNullParameter(gson, "gson");
                p pVar = new p(gson);
                he0.m mVarB = he0.m.b(ip1.b.class, "type");
                mVarB.c(b.a.class, "ADDRESS");
                mVarB.c(b.c.class, "CHECKBOX");
                mVarB.c(b.d.class, "DATE_MONTH");
                mVarB.c(b.e.class, "DATE_OF_BIRTH");
                mVarB.c(b.f.class, "DATE_YEAR");
                mVarB.c(b.h.class, "DROPDOWN");
                mVarB.c(b.i.class, "FORM_NAME");
                mVarB.c(b.k.class, "MONEY");
                mVarB.c(b.l.class, "NESTED_ITEM");
                mVarB.c(b.p.class, "REPEATER_DROPDOWN");
                mVarB.c(b.q.class, "REPEATER");
                mVarB.c(b.s.class, "TEXT");
                mVarB.c(b.j.class, "INFO");
                mVarB.c(b.C0934b.class, "BARCODE");
                mVarB.c(b.n.class, "QRCODE");
                mVarB.c(b.o.class, "QRCODE_OR_BARCODE");
                mVarB.c(b.m.class, "NUMBER");
                mVarB.c(b.r.class, "SEARCH");
                mVarB.c(b.g.class, "FALLBACK_SUBTYPE_LABEL");
                Intrinsics.checkNotNullExpressionValue(mVarB, "registerFallbackSubtype(...)");
                pVar.e.add(mVarB);
                pVar.c(new hp1.d(), gp1.b.class);
                pVar.c(new k(), qp1.b.class);
                o gson2 = pVar.b();
                Intrinsics.checkNotNullExpressionValue(gson2, "create(...)");
                Intrinsics.checkNotNullParameter(gson2, "gson");
                GsonConverterFactory converterFactory = GsonConverterFactory.create(gson2);
                Intrinsics.checkNotNullExpressionValue(converterFactory, "create(...)");
                s.k(converterFactory);
                Intrinsics.checkNotNullParameter(factory, "factory");
                Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
                Retrofit retrofitA = ik0.b.a(factory, null, null, converterFactory, null, 27);
                s.k(retrofitA);
                return retrofitA;
            case 6:
                sf0.h hVarB = eVar.f281808g.b();
                s.j(hVarB);
                return new wp1.a(hVarB);
            case 7:
                return new wp1.c((vo1.c) eVar.f281809h.get(), aVar2.e());
            default:
                throw new AssertionError(i);
        }
    }
}
