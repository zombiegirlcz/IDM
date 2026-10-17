package nx7;

import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.feature.insurance_pet.impl.ui.add.step.breed.PetBreedDetailsContract$BreedParam;
import com.revolut.feature.insurance_pet.impl.ui.pet.amount.AmountData;
import com.revolut.feature.insurance_pet.impl.ui.pet.dob.DOBInputData;
import efm.d0;
import jx7.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kx7.t0;
import kx7.y0;
import org.joda.time.LocalDate;
import zw7.c0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f220451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f220452b;

    public /* synthetic */ h(n nVar, int i) {
        this.f220451a = i;
        this.f220452b = nVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f220451a;
        pfm.m mVar = pfm.m.f235744a;
        int i2 = 1;
        n nVar = this.f220452b;
        switch (i) {
            case 0:
                DOBInputData it8 = (DOBInputData) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                if (!(it8 instanceof DOBInputData.Filled)) {
                    throw new IllegalArgumentException(p.a.p("state.dateOfBirthType=", o0.f186429a.b(it8.getClass()).m(), " must be instance of DOBInputData.Filled").toString());
                }
                fx7.a aVar = nVar.k;
                LocalDate date = LocalDate.fromDateFields(((DOBInputData.Filled) it8).d);
                Intrinsics.checkNotNullExpressionValue(date, "fromDateFields(...)");
                aVar.getClass();
                Intrinsics.checkNotNullParameter(date, "date");
                Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                return mVar;
            case 1:
                Intrinsics.checkNotNullParameter((tx7.a) obj2, "it");
                a0 a0Var = (a0) nVar.i;
                px7.b bVar = a0Var.e;
                ux7.c cVar = a0Var.f220448c;
                rx7.d dVar = a0Var.d;
                DOBInputData dOBInputData = (DOBInputData) bVar.getDateOfBirth().get();
                if (!(dOBInputData instanceof DOBInputData.Filled)) {
                    throw new IllegalArgumentException(p.a.p("state.dayOfBirthType=", o0.f186429a.b(dOBInputData.getClass()).m(), " must be instance of DOBInputData.Filled").toString());
                }
                String str = (String) cVar.getName().get();
                c0 c0Var = (c0) a0Var.f220447b.h0().get();
                zw7.z zVar = (zw7.z) cVar.c0().get();
                zw7.h hVar = (zw7.h) dVar.q0().get();
                String str2 = ((PetBreedDetailsContract$BreedParam) dVar.A().get()).f76232a;
                LocalDate localDateFromDateFields = LocalDate.fromDateFields(((DOBInputData.Filled) dOBInputData).d);
                Intrinsics.checkNotNullExpressionValue(localDateFromDateFields, "fromDateFields(...)");
                boolean zBooleanValue = ((Boolean) dVar.y().get()).booleanValue();
                dj0.d dVarK = nz8.d.K((AmountData) dVar.f().get());
                zw7.j petData = new zw7.j(str, c0Var, zVar, hVar, str2, localDateFromDateFields, zBooleanValue, dVarK);
                fx7.f fVar = nVar.f220463j;
                fVar.getClass();
                Intrinsics.checkNotNullParameter(petData, "pet");
                y0 y0Var = (y0) fVar.f138760a;
                y0Var.getClass();
                Intrinsics.checkNotNullParameter(petData, "petData");
                String strU = wp5.y.u(y0Var.d, "toString(...)");
                String strA = c0Var.a();
                String strA2 = zVar.a();
                String strA3 = hVar.a();
                String strK = ce9.m.K(localDateFromDateFields);
                Intrinsics.checkNotNullExpressionValue(strK, "toISO8601Format(...)");
                d0<ix7.j> d0VarCreatePet = y0Var.f190501a.createPet(new a.C1021a(strU, str, strA, strA2, strA3, str2, strK, zBooleanValue, mo3.a.p(dVarK)));
                t0 t0Var = t0.f;
                kx7.o0 o0Var = new kx7.o0(0);
                d0VarCreatePet.getClass();
                ufm.i iVar = new ufm.i(d0VarCreatePet, o0Var, 1);
                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                ufm.f fVar2 = new ufm.f(iVar, new i(new h(nVar, 4), i2), 3);
                Intrinsics.checkNotNullExpressionValue(fVar2, "doOnSuccess(...)");
                return fVar2;
            case 2:
                zw7.z gender = (zw7.z) obj2;
                Intrinsics.checkNotNullParameter(gender, "it");
                nVar.k.getClass();
                Intrinsics.checkNotNullParameter(gender, "gender");
                Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                return mVar;
            case 3:
                PetBreedDetailsContract$BreedParam it9 = (PetBreedDetailsContract$BreedParam) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                fx7.a aVar2 = nVar.k;
                String breedId = it9.f76232a;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(breedId, "breedId");
                Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                return mVar;
            case 4:
                String id10 = (String) obj2;
                Intrinsics.h(id10);
                Intrinsics.checkNotNullParameter(id10, "id");
                te0.v vVarD = ((a0) nVar.i).f.d();
                od0.i.Companion.getClass();
                vVarD.set(od0.h.a(id10));
                ifm.b bVar2 = nVar.f220465m;
                w4l.f fVarA = ((y0) nVar.f220463j.f138760a).a();
                Unit unit = Unit.f186387a;
                efm.b bVarIgnoreElements = fVarA.f(unit, true).ignoreElements();
                Intrinsics.checkNotNullExpressionValue(bVarIgnoreElements, "ignoreElements(...)");
                pfm.a aVar3 = new pfm.a(ue0.e.v(bVarIgnoreElements), new lhi.b(11, new ne0.e(new BreadcrumbException(), 16)), 2);
                Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
                ofm.h hVarW = aVar3.w(new m3l.d(5, m.f220458a), l.f220457a);
                Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
                te0.w.j0(bVar2, hVarW);
                return unit;
            default:
                c0 petType = (c0) obj2;
                Intrinsics.checkNotNullParameter(petType, "it");
                fx7.f fVar3 = nVar.f220463j;
                fVar3.getClass();
                Intrinsics.checkNotNullParameter(petType, "petType");
                efm.b bVarIgnoreElements2 = ((y0) fVar3.f138760a).b(petType, true).ignoreElements();
                Intrinsics.checkNotNullExpressionValue(bVarIgnoreElements2, "ignoreElements(...)");
                return ue0.e.v(bVarIgnoreElements2);
        }
    }
}
