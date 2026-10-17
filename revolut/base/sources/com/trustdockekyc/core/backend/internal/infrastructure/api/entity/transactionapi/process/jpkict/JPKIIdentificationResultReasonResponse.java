package com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.jpkict;

import androidx.annotation.Keep;
import b3m.f;
import k1m.i;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0081\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/jpkict/JPKIIdentificationResultReasonResponse;", "", "<init>", "(Ljava/lang/String;I)V", "Lb3m/f;", "toModel", "()Lb3m/f;", "Companion", "com/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/jpkict/c", "SIGNATURE_INVALID", "CERTIFICATE_INVALID", "CERTIFICATE_EXPIRED", "CERTIFICATE_REVOKED", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class JPKIIdentificationResultReasonResponse {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ JPKIIdentificationResultReasonResponse[] $VALUES;

    @NotNull
    public static final l2m.a Companion;

    @i(name = "signature_invalid")
    public static final JPKIIdentificationResultReasonResponse SIGNATURE_INVALID = new JPKIIdentificationResultReasonResponse("SIGNATURE_INVALID", 0);

    @i(name = "certificate_invalid")
    public static final JPKIIdentificationResultReasonResponse CERTIFICATE_INVALID = new JPKIIdentificationResultReasonResponse("CERTIFICATE_INVALID", 1);

    @i(name = "certificate_expired")
    public static final JPKIIdentificationResultReasonResponse CERTIFICATE_EXPIRED = new JPKIIdentificationResultReasonResponse("CERTIFICATE_EXPIRED", 2);

    @i(name = "certificate_revoked")
    public static final JPKIIdentificationResultReasonResponse CERTIFICATE_REVOKED = new JPKIIdentificationResultReasonResponse("CERTIFICATE_REVOKED", 3);

    private static final /* synthetic */ JPKIIdentificationResultReasonResponse[] $values() {
        return new JPKIIdentificationResultReasonResponse[]{SIGNATURE_INVALID, CERTIFICATE_INVALID, CERTIFICATE_EXPIRED, CERTIFICATE_REVOKED};
    }

    static {
        JPKIIdentificationResultReasonResponse[] jPKIIdentificationResultReasonResponseArr$values = $values();
        $VALUES = jPKIIdentificationResultReasonResponseArr$values;
        $ENTRIES = s.n(jPKIIdentificationResultReasonResponseArr$values);
        Companion = new l2m.a();
    }

    private JPKIIdentificationResultReasonResponse(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static JPKIIdentificationResultReasonResponse valueOf(String str) {
        return (JPKIIdentificationResultReasonResponse) Enum.valueOf(JPKIIdentificationResultReasonResponse.class, str);
    }

    public static JPKIIdentificationResultReasonResponse[] values() {
        return (JPKIIdentificationResultReasonResponse[]) $VALUES.clone();
    }

    @NotNull
    public final f toModel() {
        int i = l2m.b.f191827a[ordinal()];
        if (i == 1) {
            return f.SIGNATURE_INVALID;
        }
        if (i == 2) {
            return f.CERTIFICATE_INVALID;
        }
        if (i == 3) {
            return f.CERTIFICATE_EXPIRED;
        }
        if (i == 4) {
            return f.CERTIFICATE_REVOKED;
        }
        throw new NoWhenBranchMatchedException();
    }
}
