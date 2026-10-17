package ly7;

import com.revolut.feature.insurance_pet.impl.ui.add.step.breed.PetBreedDetailsContract$BreedParam;
import com.revolut.feature.insurance_pet.impl.ui.edit.details.PetEditDetailsContract$PetEditResult;
import com.revolut.feature.insurance_pet.impl.ui.pet.amount.AmountData;
import com.revolut.feature.insurance_pet.impl.ui.pet.dob.DOBInputData;
import fx7.l;
import java.util.Date;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDate;
import te0.w;
import zw7.c0;
import zw7.d0;
import zw7.p;
import zw7.z;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f200722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f200723b;

    public /* synthetic */ d(h hVar, int i) {
        this.f200722a = i;
        this.f200723b = hVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f200722a;
        h hVar = this.f200723b;
        switch (i) {
            case 0:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                String str = (String) pair.f186385a;
                PetEditDetailsContract$PetEditResult petEditDetailsContract$PetEditResult = (PetEditDetailsContract$PetEditResult) pair.f186386b;
                l lVar = hVar.f200735n;
                String str2 = petEditDetailsContract$PetEditResult.f76292b;
                c0 c0Var = petEditDetailsContract$PetEditResult.f76293c;
                z zVar = petEditDetailsContract$PetEditResult.d;
                zw7.h hVar2 = petEditDetailsContract$PetEditResult.e;
                String str3 = petEditDetailsContract$PetEditResult.f.f76232a;
                LocalDate localDateFromDateFields = LocalDate.fromDateFields(petEditDetailsContract$PetEditResult.f76294g.getF76348a());
                Intrinsics.checkNotNullExpressionValue(localDateFromDateFields, "fromDateFields(...)");
                return lVar.a(str, new p(str2, c0Var, zVar, hVar2, str3, localDateFromDateFields, petEditDetailsContract$PetEditResult.i, nz8.d.K(petEditDetailsContract$PetEditResult.f76295h)), false);
            case 1:
                vf0.g gVar = (vf0.g) obj2;
                Intrinsics.checkNotNullParameter(gVar, "<destruct>");
                c0 c0Var2 = (c0) gVar.f288428a;
                String str4 = (String) gVar.f288429b;
                z zVar2 = (z) gVar.f288430c;
                zw7.h hVar3 = (zw7.h) gVar.d;
                PetBreedDetailsContract$BreedParam petBreedDetailsContract$BreedParam = (PetBreedDetailsContract$BreedParam) gVar.e;
                DOBInputData dOBInputData = (DOBInputData) gVar.f;
                AmountData amountData = (AmountData) gVar.f288431g;
                Boolean bool = (Boolean) gVar.f288432h;
                String str5 = (String) w.O(((k) hVar.f200733l).w0());
                Intrinsics.h(str4);
                Intrinsics.h(c0Var2);
                Intrinsics.h(zVar2);
                Intrinsics.h(hVar3);
                Intrinsics.h(petBreedDetailsContract$BreedParam);
                Intrinsics.h(dOBInputData);
                Intrinsics.h(amountData);
                Intrinsics.h(bool);
                return new PetEditDetailsContract$PetEditResult(str5, str4, c0Var2, zVar2, hVar3, petBreedDetailsContract$BreedParam, dOBInputData, amountData, bool.booleanValue());
            case 2:
                d0 pet = (d0) obj2;
                Intrinsics.checkNotNullParameter(pet, "pet");
                efm.b bVarI = hVar.I(pet.f325765b);
                efm.b bVarR = hVar.r(pet.d);
                efm.b bVarM1 = hVar.M1(pet.e);
                LocalDate extractedDate = pet.f325767g;
                Intrinsics.checkNotNullParameter(extractedDate, "extractedDate");
                Date date = extractedDate.toDate();
                String string = extractedDate.toString("MM/yyyy");
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                efm.b bVarU = hVar.u(new DOBInputData.Filled(string, date));
                sz7.b bVar = hVar.k;
                dj0.d money = pet.f325769j;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(money, "money");
                efm.b bVarW2 = hVar.w2(new AmountData(money.f115082a, bVar.f266771a.e(money), money.f115083b));
                zw7.e eVar = pet.f;
                return efm.b.p(bVarI, bVarR, bVarM1, bVarU, bVarW2, hVar.r2(eVar.f325775c), hVar.E0(new PetBreedDetailsContract$BreedParam(eVar.f325773a, eVar.f325774b, 4)), hVar.f200731h.Z1(pet.f325768h));
            default:
                String petId = (String) obj2;
                Intrinsics.checkNotNullParameter(petId, "petId");
                return hVar.f200734m.d(petId);
        }
    }
}
