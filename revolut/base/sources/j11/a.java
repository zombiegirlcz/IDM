package j11;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u0006\u0010\u0004¨\u0006\u0010"}, d2 = {"Lj11/a;", "", "", "toString", "()Ljava/lang/String;", "Lj11/a$a;", "a", "Lj11/a$a;", "b", "()Lj11/a$a;", "type", "Ljava/lang/String;", "getStartDate", "startDate", "c", "endDate", "feature_crypto_challenge_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final EnumC0963a type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("startDate")
    @NotNull
    private final String startDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("endDate")
    @NotNull
    private final String endDate;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: j11.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lj11/a$a;", "", "MAINTAIN_BALANCE", "CLAIM_REWARD", "feature_crypto_challenge_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class EnumC0963a {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EnumC0963a[] $VALUES;

        @lg.b("CLAIM_REWARD")
        public static final EnumC0963a CLAIM_REWARD;

        @lg.b("MAINTAIN_BALANCE")
        public static final EnumC0963a MAINTAIN_BALANCE;

        static {
            EnumC0963a enumC0963a = new EnumC0963a("MAINTAIN_BALANCE", 0);
            MAINTAIN_BALANCE = enumC0963a;
            EnumC0963a enumC0963a2 = new EnumC0963a("CLAIM_REWARD", 1);
            CLAIM_REWARD = enumC0963a2;
            EnumC0963a[] enumC0963aArr = {enumC0963a, enumC0963a2};
            $VALUES = enumC0963aArr;
            $ENTRIES = s.n(enumC0963aArr);
        }

        public static EnumC0963a valueOf(String str) {
            return (EnumC0963a) Enum.valueOf(EnumC0963a.class, str);
        }

        public static EnumC0963a[] values() {
            return (EnumC0963a[]) $VALUES.clone();
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getEndDate() {
        return this.endDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC0963a getType() {
        return this.type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.type == aVar.type && Intrinsics.f(this.startDate, aVar.startDate) && Intrinsics.f(this.endDate, aVar.endDate);
    }

    public final int hashCode() {
        return this.endDate.hashCode() + p.a.c(this.type.hashCode() * 31, 31, this.startDate);
    }
}
