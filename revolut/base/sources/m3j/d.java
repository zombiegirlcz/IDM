package m3j;

import com.revolut.domain.models.banktransfer.AccountFieldType;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.a0;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t70.g f202572a;

    public d(t70.g localization) {
        Intrinsics.checkNotNullParameter(localization, "localization");
        this.f202572a = localization;
    }

    public final String a(String fieldKey) {
        Intrinsics.checkNotNullParameter(fieldKey, "fieldKey");
        qd0.b.Companion.getClass();
        String lowerCase = fieldKey.toLowerCase(qd0.a.f244819b);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String strE = this.f202572a.e("bank.transfer.beneficiary.account.field." + lowerCase);
        if (strE != null) {
            return strE;
        }
        String lowerCase2 = fieldKey.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        int i = 0;
        List listM0 = d0.m0(lowerCase2, new char[]{'_'}, 6);
        ArrayList arrayList = new ArrayList(w.t(listM0, 10));
        for (Object objO : listM0) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            if (i == 0) {
                objO = a0.o((String) objO);
            }
            arrayList.add(objO);
            i = i2;
        }
        m70.a.t(t0.f186434a);
        return zhm.d0.k0(arrayList, " ", null, null, 0, null, 62);
    }

    public final String b(String fieldKey, String fieldValue) {
        AccountFieldType accountFieldType;
        String strE;
        String strB;
        Intrinsics.checkNotNullParameter(fieldKey, "fieldKey");
        Intrinsics.checkNotNullParameter(fieldValue, "fieldValue");
        AccountFieldType[] accountFieldTypeArrValues = AccountFieldType.values();
        int length = accountFieldTypeArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                accountFieldType = null;
                break;
            }
            accountFieldType = accountFieldTypeArrValues[i];
            if (a0.z(accountFieldType.name(), fieldKey, true)) {
                break;
            }
            i++;
        }
        if ((accountFieldType == null ? -1 : c.f202571a[accountFieldType.ordinal()]) == 1) {
            qd0.b.Companion.getClass();
            String lowerCase = fieldValue.toLowerCase(qd0.a.f244819b);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            strE = this.f202572a.e("bank.transfer.beneficiary.account.field." + lowerCase);
        } else {
            m70.a.c(t0.f186434a);
            strE = "";
        }
        return strE.length() == 0 ? (accountFieldType == null || (strB = n61.j.b(accountFieldType, fieldValue)) == null) ? fieldValue : strB : strE;
    }
}
