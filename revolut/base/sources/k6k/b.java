package k6k;

import com.revolut.domain.models.moneyrequest.MoneyRequestCounterParty;
import do3.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import y8l.i;
import y8l.j;

/* JADX INFO: loaded from: classes11.dex */
public abstract class b {
    public static final MoneyRequestCounterParty a(i iVar) {
        String str;
        c cVar;
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        int i = a.f181747b[iVar.f311688b.ordinal()];
        if (i != 1) {
            if (i == 2) {
                Intrinsics.checkNotNullParameter(iVar, "<this>");
                return new MoneyRequestCounterParty.Apm(iVar.f311687a, iVar.i, iVar.f311692j, iVar.o, iVar.f311695n);
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            Intrinsics.checkNotNullParameter(iVar, "<this>");
            return new MoneyRequestCounterParty.BankBeneficiary(iVar.f311687a, iVar.i, iVar.f311692j, iVar.f, iVar.f311690g, iVar.k);
        }
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        String str2 = iVar.f311687a;
        String str3 = iVar.f311689c;
        String str4 = iVar.d;
        String str5 = iVar.e;
        String str6 = iVar.f;
        String str7 = iVar.f311690g;
        String str8 = iVar.f311691h;
        String str9 = iVar.i;
        String str10 = iVar.f311692j;
        do3.b.Companion.getClass();
        do3.b bVar = do3.b.FULL;
        String str11 = iVar.f311694m;
        String str12 = iVar.k;
        String str13 = iVar.f311696p;
        if (str13 != null) {
            c[] cVarArrValues = c.values();
            int length = cVarArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    str = str2;
                    cVar = null;
                    break;
                }
                cVar = cVarArrValues[i2];
                str = str2;
                c[] cVarArr = cVarArrValues;
                if (a0.z(cVar.name(), str13, true)) {
                    break;
                }
                i2++;
                cVarArrValues = cVarArr;
                str2 = str;
            }
            if (cVar == null) {
            }
            return new MoneyRequestCounterParty.Revolut(str, str9, str10, str8, str3, str4, str5, str6, str7, str12, bVar, str11, cVar);
        }
        str = str2;
        cVar = c.PERSONAL;
        return new MoneyRequestCounterParty.Revolut(str, str9, str10, str8, str3, str4, str5, str6, str7, str12, bVar, str11, cVar);
    }

    public static final i b(MoneyRequestCounterParty moneyRequestCounterParty) {
        Intrinsics.checkNotNullParameter(moneyRequestCounterParty, "<this>");
        if (moneyRequestCounterParty instanceof MoneyRequestCounterParty.Apm) {
            MoneyRequestCounterParty.Apm apm = (MoneyRequestCounterParty.Apm) moneyRequestCounterParty;
            Intrinsics.checkNotNullParameter(apm, "<this>");
            return new i(apm.f60337a, j.APM, null, null, null, null, null, null, apm.f60338b, apm.f60339c, null, null, null, apm.e, apm.d, null);
        }
        if (!(moneyRequestCounterParty instanceof MoneyRequestCounterParty.Revolut)) {
            if (!(moneyRequestCounterParty instanceof MoneyRequestCounterParty.BankBeneficiary)) {
                throw new NoWhenBranchMatchedException();
            }
            MoneyRequestCounterParty.BankBeneficiary bankBeneficiary = (MoneyRequestCounterParty.BankBeneficiary) moneyRequestCounterParty;
            Intrinsics.checkNotNullParameter(bankBeneficiary, "<this>");
            return new i(bankBeneficiary.f60340a, j.BANK_BENEFICIARY, null, null, null, bankBeneficiary.d, bankBeneficiary.e, null, bankBeneficiary.f60341b, bankBeneficiary.f60342c, bankBeneficiary.f, null, null, null, null, null);
        }
        MoneyRequestCounterParty.Revolut revolut = (MoneyRequestCounterParty.Revolut) moneyRequestCounterParty;
        Intrinsics.checkNotNullParameter(revolut, "<this>");
        return new i(revolut.f60343a, j.REVOLUT, revolut.e, revolut.f, revolut.f60346g, revolut.f60347h, revolut.i, revolut.d, revolut.f60344b, revolut.f60345c, revolut.f60348j, revolut.k.getId(), revolut.f60349l, null, null, revolut.f60350m.name());
    }
}
