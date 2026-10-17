package s04;

import java.util.Locale;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import s04.b;
import zhm.r0;

/* JADX INFO: loaded from: classes22.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f258835a = r0.k(new Pair("SOLE", qu3.f.SOLE), new Pair("JOINT", qu3.f.JOINT));

    public static final qu3.e a(b bVar, xi0.b currency) {
        qu3.b bVar2;
        qu3.b bVar3;
        qu3.b bVar4;
        qu3.c cVar;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(currency, "currency");
        String id10 = bVar.getId();
        pu3.d dVarValueOf = pu3.d.valueOf(bVar.getDebtType());
        qu3.c cVar2 = new qu3.c("FIELD_ID_CREDIT_PROVIDER", bVar.getCreditProvider().getValue(), bVar.getCreditProvider().getEditable(), bVar.getCreditProvider().getMandatory());
        b.a amount = bVar.getAmount();
        String strB = null;
        if (amount != null) {
            jo3.a value = amount.getValue();
            bVar2 = new qu3.b(value != null ? b(value) : null, "FIELD_ID_AMOUNT", amount.getEditable(), amount.getMandatory());
        } else {
            bVar2 = null;
        }
        b.a monthlyRepaymentAmount = bVar.getMonthlyRepaymentAmount();
        if (monthlyRepaymentAmount != null) {
            jo3.a value2 = monthlyRepaymentAmount.getValue();
            bVar3 = new qu3.b(value2 != null ? b(value2) : null, "FIELD_ID_MONTHLY_REPAYMENT_AMOUNT", monthlyRepaymentAmount.getEditable(), monthlyRepaymentAmount.getMandatory());
        } else {
            bVar3 = null;
        }
        b.a currentBalance = bVar.getCurrentBalance();
        if (currentBalance != null) {
            jo3.a value3 = currentBalance.getValue();
            bVar4 = new qu3.b(value3 != null ? b(value3) : null, "FIELD_ID_CURRENT_BALANCE", currentBalance.getEditable(), currentBalance.getMandatory());
        } else {
            bVar4 = null;
        }
        b.C1432b debtShare = bVar.getDebtShare();
        if (debtShare != null) {
            String value4 = debtShare.getValue();
            if (value4 != null) {
                String lowerCase = value4.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                if (lowerCase != null) {
                    strB = jli.g.b(lowerCase);
                }
            }
            cVar = new qu3.c("FIELD_ID_LOAN_TYPE", strB, debtShare.getEditable(), debtShare.getMandatory());
        } else {
            cVar = null;
        }
        Boolean isInternal = bVar.getIsInternal();
        boolean zBooleanValue = isInternal != null ? isInternal.booleanValue() : false;
        Boolean isRepaid = bVar.getIsRepaid();
        boolean zBooleanValue2 = isRepaid != null ? isRepaid.booleanValue() : false;
        Boolean isDeletable = bVar.getIsDeletable();
        boolean zBooleanValue3 = isDeletable != null ? isDeletable.booleanValue() : false;
        Boolean isReadOnly = bVar.getIsReadOnly();
        return new qu3.e(id10, dVarValueOf, currency, cVar2, bVar2, bVar3, bVar4, cVar, zBooleanValue, zBooleanValue3, zBooleanValue2, isReadOnly != null ? isReadOnly.booleanValue() : false);
    }

    public static final dj0.d b(jo3.a aVar) {
        return new dj0.d(aVar.getAmount(), new xi0.b(6, aVar.getCurrency(), null));
    }
}
