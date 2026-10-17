package zlc;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;
import wp5.y;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u0011"}, d2 = {"Lzlc/b;", "", "", "toString", "()Ljava/lang/String;", "Lzlc/b$a;", "a", "Lzlc/b$a;", "c", "()Lzlc/b$a;", "onboardingStatus", "Ljo3/b;", "b", "Ljo3/b;", "()Ljo3/b;", "minimumWithdrawalAmount", "minimumBalanceAfterWithdraw", "feature_robo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("onboardingStatus")
    @NotNull
    private final a onboardingStatus;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("minimumWithdrawalAmount")
    @NotNull
    private final jo3.b minimumWithdrawalAmount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("minimumBalanceAfterWithdraw")
    @NotNull
    private final jo3.b minimumBalanceAfterWithdraw;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lzlc/b$a;", "", "NONE", "PENDING", "COMPLETED", "FAILED", "feature_robo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;

        @lg.b("COMPLETED")
        public static final a COMPLETED;

        @lg.b("FAILED")
        public static final a FAILED;

        @lg.b("NONE")
        public static final a NONE;

        @lg.b("PENDING")
        public static final a PENDING;

        static {
            a aVar = new a("NONE", 0);
            NONE = aVar;
            a aVar2 = new a("PENDING", 1);
            PENDING = aVar2;
            a aVar3 = new a("COMPLETED", 2);
            COMPLETED = aVar3;
            a aVar4 = new a("FAILED", 3);
            FAILED = aVar4;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
            $VALUES = aVarArr;
            $ENTRIES = s.n(aVarArr);
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public b(a onboardingStatus, jo3.b minimumWithdrawalAmount, jo3.b minimumBalanceAfterWithdraw) {
        Intrinsics.checkNotNullParameter(onboardingStatus, "onboardingStatus");
        Intrinsics.checkNotNullParameter(minimumWithdrawalAmount, "minimumWithdrawalAmount");
        Intrinsics.checkNotNullParameter(minimumBalanceAfterWithdraw, "minimumBalanceAfterWithdraw");
        this.onboardingStatus = onboardingStatus;
        this.minimumWithdrawalAmount = minimumWithdrawalAmount;
        this.minimumBalanceAfterWithdraw = minimumBalanceAfterWithdraw;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.b getMinimumBalanceAfterWithdraw() {
        return this.minimumBalanceAfterWithdraw;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final jo3.b getMinimumWithdrawalAmount() {
        return this.minimumWithdrawalAmount;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final a getOnboardingStatus() {
        return this.onboardingStatus;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.onboardingStatus == bVar.onboardingStatus && Intrinsics.f(this.minimumWithdrawalAmount, bVar.minimumWithdrawalAmount) && Intrinsics.f(this.minimumBalanceAfterWithdraw, bVar.minimumBalanceAfterWithdraw);
    }

    public final int hashCode() {
        return this.minimumBalanceAfterWithdraw.hashCode() + y.e(this.minimumWithdrawalAmount, this.onboardingStatus.hashCode() * 31, 31);
    }
}
