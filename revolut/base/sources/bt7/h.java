package bt7;

import al4.q;
import android.content.Context;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.insurance_credit.impl.data.network.InsuranceCreditService;
import com.revolut.feature.insurance_credit.impl.data.network.InsuranceCreditStateService;
import kg.o;
import kg.p;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.converter.gson.GsonConverterFactory;
import vc.s;
import zr7.p;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f18422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18423b;

    public h(i iVar, int i) {
        this.f18422a = iVar;
        this.f18423b = i;
    }

    @Override // phm.a
    public final Object get() {
        i iVar = this.f18422a;
        int i = this.f18423b;
        switch (i) {
            case 0:
                up3.b bVarI = iVar.f18424a.i();
                s.j(bVarI);
                return new js7.f(bVarI, (ys7.d) iVar.o.get());
            case 1:
                return new ys7.d((InsuranceCreditStateService) iVar.f18431m.get(), (ne0.j) iVar.f18432n.get());
            case 2:
                ik0.b retrofitFactory = ((nj0.d) iVar.f18425b).m();
                s.j(retrofitFactory);
                o gson = fe0.c.a();
                n.Companion.getClass();
                Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
                Intrinsics.checkNotNullParameter(gson, "gson");
                Intrinsics.checkNotNullParameter(gson, "gson");
                p pVar = new p(gson);
                he0.m mVarB = he0.m.b(zr7.p.class, "type");
                mVarB.c(p.c.class, "INSURED");
                mVarB.c(p.a.class, "ELIGIBLE");
                mVarB.c(p.b.class, "INELIGIBLE");
                Intrinsics.checkNotNullExpressionValue(mVarB, "registerSubtype(...)");
                pVar.e.add(mVarB);
                o oVarB = pVar.b();
                Intrinsics.checkNotNullExpressionValue(oVarB, "create(...)");
                Object objCreate = ik0.b.a(retrofitFactory, null, null, GsonConverterFactory.create(oVarB), null, 27).create(InsuranceCreditStateService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                InsuranceCreditStateService insuranceCreditStateService = (InsuranceCreditStateService) objCreate;
                s.k(insuranceCreditStateService);
                return insuranceCreditStateService;
            case 3:
                return new ne0.d();
            case 4:
                q qVarA = iVar.d.a();
                up3.b bVarI2 = iVar.f18424a.i();
                s.j(bVarI2);
                return new js7.d(qVarA, bVarI2, (js7.f) iVar.f18433p.get());
            case 5:
                return new ct7.b((sri.m) iVar.f18435r.get());
            case 6:
                Context context = iVar.e;
                n.Companion.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                return sri.o.c(context, null, null, 14);
            case 7:
                iVar.getClass();
                return new at7.b(ImmutableSet.of(new ct7.c()));
            case 8:
                je0.d mapper = iVar.f18426c.d();
                s.j(mapper);
                yk0.a databaseSessionProvider = iVar.f.b();
                s.j(databaseSessionProvider);
                xe0.f storageFactory = iVar.f18426c.f();
                s.j(storageFactory);
                n.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                return xe0.f.f(storageFactory, databaseSessionProvider, "insurance_credit", mapper, 0, null, 56);
            case 9:
                return new js7.b((ys7.a) iVar.f18438w.get(), (ys7.h) iVar.f18439x.get());
            case 10:
                return new ys7.a((InsuranceCreditService) iVar.v.get());
            case 11:
                ik0.b retrofitFactory2 = ((nj0.d) iVar.f18425b).m();
                s.j(retrofitFactory2);
                ek.a converterFactory = ((nj0.d) iVar.f18425b).d();
                n.Companion.getClass();
                Intrinsics.checkNotNullParameter(retrofitFactory2, "retrofitFactory");
                Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
                Object objCreate2 = ik0.b.a(retrofitFactory2, null, null, converterFactory, null, 27).create(InsuranceCreditService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate2, "create(...)");
                InsuranceCreditService insuranceCreditService = (InsuranceCreditService) objCreate2;
                s.k(insuranceCreditService);
                return insuranceCreditService;
            case 12:
                InsuranceCreditService insuranceCreditService2 = (InsuranceCreditService) iVar.v.get();
                ne0.d hashMapCache = new ne0.d();
                n.Companion.getClass();
                Intrinsics.checkNotNullParameter(hashMapCache, "hashMapCache");
                return new ys7.h(insuranceCreditService2, new xx4.d(hashMapCache), (ue0.c) iVar.u.get());
            case 13:
                return new vt7.b(iVar.f18428h.g());
            case 14:
                return new vt7.d();
            case 15:
                return new vt7.c(iVar.f18428h.g());
            case 16:
                return new vt7.a(iVar.f18428h.g());
            case 17:
                return new st7.b();
            case 18:
                return new st7.a();
            default:
                throw new AssertionError(i);
        }
    }
}
