package cuc;

import com.revolut.feature.security_hub.api.models.SecurityDelayInfo;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static SecurityDelayInfo a(auc.s dto) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        String str = dto.f9783b;
        String str2 = dto.f9782a;
        switch (str.hashCode()) {
            case -604548089:
                if (str.equals("IN_PROGRESS")) {
                    String str3 = dto.f9782a;
                    Long l2 = dto.f9784c;
                    if (l2 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    long jLongValue = l2.longValue();
                    Long l3 = dto.d;
                    if (l3 != null) {
                        return new SecurityDelayInfo.InProgress(str3, jLongValue, l3.longValue());
                    }
                    throw new IllegalArgumentException("Required value was null.");
                }
                break;
            case 77848963:
                if (str.equals("READY")) {
                    return new SecurityDelayInfo.Ready(str2);
                }
                break;
            case 1023286998:
                if (str.equals("NOT_FOUND")) {
                    return new SecurityDelayInfo.NotFound(0);
                }
                break;
            case 1746537160:
                if (str.equals("CREATED")) {
                    return new SecurityDelayInfo.Created(str2);
                }
                break;
        }
        return new SecurityDelayInfo.Unknown(str2);
    }

    public static auc.s b(SecurityDelayInfo domain) {
        String str;
        Intrinsics.checkNotNullParameter(domain, "domain");
        String f85417a = domain.getF85417a();
        if (domain instanceof SecurityDelayInfo.Ready) {
            str = "READY";
        } else if (domain instanceof SecurityDelayInfo.Created) {
            str = "CREATED";
        } else if (domain instanceof SecurityDelayInfo.InProgress) {
            str = "IN_PROGRESS";
        } else if (domain instanceof SecurityDelayInfo.NotFound) {
            str = "NOT_FOUND";
        } else {
            if (!(domain instanceof SecurityDelayInfo.Unknown)) {
                throw new NoWhenBranchMatchedException();
            }
            str = "UNKNOWN";
        }
        boolean z = domain instanceof SecurityDelayInfo.InProgress;
        return new auc.s(f85417a, z ? Long.valueOf(((SecurityDelayInfo.InProgress) domain).f85413b) : null, z ? Long.valueOf(((SecurityDelayInfo.InProgress) domain).f85414c) : null, str);
    }
}
