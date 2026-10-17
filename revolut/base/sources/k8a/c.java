package k8a;

import com.revolut.feature.pix.api.model.PixKey;
import com.revolut.feature.pix.api.model.PixKeyStatus;
import java.time.LocalDateTime;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import l8a.l;

/* JADX INFO: loaded from: classes5.dex */
public abstract class c {
    public static final l8a.c a(PixKey pixKey) {
        String str;
        Intrinsics.checkNotNullParameter(pixKey, "<this>");
        Intrinsics.checkNotNullParameter(pixKey, "<this>");
        if (pixKey instanceof PixKey.Email) {
            str = "EMAIL";
        } else if (pixKey instanceof PixKey.PhoneNumber) {
            str = "PHONE";
        } else if (pixKey instanceof PixKey.Random) {
            str = "EVP";
        } else {
            if (!(pixKey instanceof PixKey.Document)) {
                throw new NoWhenBranchMatchedException();
            }
            str = "CPF";
        }
        return new l8a.c(str, pixKey.getF80405a());
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final PixKey b(l lVar, l8a.d dVar, String str) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        PixKeyStatus pixKeyStatusD = dVar != null ? d(dVar, str) : PixKeyStatus.Active.f80407a;
        String type = lVar.getType();
        switch (type.hashCode()) {
            case -1884956477:
                if (type.equals("RANDOM")) {
                    return new PixKey.Random(lVar.getValue(), pixKeyStatusD);
                }
                break;
            case 66937:
                if (type.equals("CPF")) {
                    return new PixKey.Document(lVar.getValue(), pixKeyStatusD);
                }
                break;
            case 69055:
                if (type.equals("EVP")) {
                    return new PixKey.Random(lVar.getValue(), pixKeyStatusD);
                }
                break;
            case 66081660:
                if (type.equals("EMAIL")) {
                    return new PixKey.Email(lVar.getValue(), pixKeyStatusD);
                }
                break;
            case 76105038:
                if (type.equals("PHONE")) {
                    return new PixKey.PhoneNumber(lVar.getValue(), pixKeyStatusD);
                }
                break;
        }
        throw new IllegalArgumentException(j6.a.q("Invalid PixKey type: ", lVar.getType()));
    }

    public static final com.revolut.feature.pix.api.model.a c(String str) {
        if (Intrinsics.f(str, "DONOR")) {
            return com.revolut.feature.pix.api.model.a.DONOR;
        }
        if (Intrinsics.f(str, "CLAIMER")) {
            return com.revolut.feature.pix.api.model.a.CLAIMER;
        }
        throw new IllegalArgumentException(j6.a.q("Invalid PixKey role: ", str));
    }

    public static final PixKeyStatus.UnderPortability d(l8a.d dVar, String str) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        com.revolut.feature.pix.api.model.a aVarC = c(dVar.getRole());
        String str2 = str == null ? "" : str;
        Long createdDate = dVar.getCreatedDate();
        LocalDateTime localDateTimeD0 = oi0.d.d0(createdDate != null ? createdDate.longValue() : 0L);
        Long resolutionPeriodEnd = dVar.getResolutionPeriodEnd();
        LocalDateTime localDateTimeD02 = oi0.d.d0(resolutionPeriodEnd != null ? resolutionPeriodEnd.longValue() : 0L);
        Long completionPeriodEnd = dVar.getCompletionPeriodEnd();
        LocalDateTime localDateTimeD03 = oi0.d.d0(completionPeriodEnd != null ? completionPeriodEnd.longValue() : 0L);
        String counterpartyInstitutionName = dVar.getCounterpartyInstitutionName();
        String str3 = counterpartyInstitutionName == null ? "" : counterpartyInstitutionName;
        String type = dVar.getType();
        String str4 = type != null ? type : "";
        if (str4.equals("OWNERSHIP")) {
            LocalDateTime localDateTimePlusDays = aVarC == com.revolut.feature.pix.api.model.a.CLAIMER ? localDateTimeD0.plusDays(30L) : localDateTimeD03;
            Intrinsics.h(localDateTimePlusDays);
            return new PixKeyStatus.UnderPortability.DifferentOwnership(str2, localDateTimePlusDays, localDateTimeD0, aVarC, str3, Intrinsics.f(dVar.getState(), "VERIFYING"), localDateTimeD03);
        }
        if (str4.equals("PORTABILITY")) {
            return new PixKeyStatus.UnderPortability.SameOwnership(str2, localDateTimeD02, localDateTimeD0, aVarC, str3);
        }
        throw new IllegalStateException("Unknown claim type");
    }
}
