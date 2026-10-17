package mxb;

import android.content.SharedPreferences;
import com.google.gson.JsonSyntaxException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import org.jetbrains.annotations.NotNull;
import vxb.e;
import wim.z;
import wp5.y;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends we0.g {
    public static final c d = new c();

    public static abstract class a {

        /* JADX INFO: renamed from: mxb.c$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0005\u0010\fR\u001a\u0010\u000f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u0011\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u0010\u0010\fR\u001a\u0010\u0016\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0018\u001a\u0004\b\n\u0010\u0019¨\u0006\u001b"}, d2 = {"Lmxb/c$a$a;", "Lmxb/c$a;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "pointsAccountId", "", "b", "D", "()D", "balance", "d", "totalAward", "e", "totalRedeemed", "Ljo3/b;", "Ljo3/b;", "f", "()Ljo3/b;", "totalRedeemedCash", "", "F", "()F", "earnedPointsMultiplier", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C1187a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("pointsAccountId")
            @NotNull
            private final String pointsAccountId;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("balance")
            private final double balance;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("totalAward")
            private final double totalAward;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            @lg.b("totalRedeemed")
            private final double totalRedeemed;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            @lg.b("totalRedeemedCashAmount")
            @NotNull
            private final jo3.b totalRedeemedCash;

            /* JADX INFO: renamed from: f, reason: from kotlin metadata */
            @lg.b("earnedPointsMultiplier")
            private final float earnedPointsMultiplier;

            /* JADX INFO: renamed from: a, reason: from getter */
            public final double getBalance() {
                return this.balance;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final float getEarnedPointsMultiplier() {
                return this.earnedPointsMultiplier;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getPointsAccountId() {
                return this.pointsAccountId;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final double getTotalAward() {
                return this.totalAward;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final double getTotalRedeemed() {
                return this.totalRedeemed;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof C1187a)) {
                    return false;
                }
                C1187a c1187a = (C1187a) obj2;
                return Intrinsics.f(this.pointsAccountId, c1187a.pointsAccountId) && Double.compare(this.balance, c1187a.balance) == 0 && Double.compare(this.totalAward, c1187a.totalAward) == 0 && Double.compare(this.totalRedeemed, c1187a.totalRedeemed) == 0 && Intrinsics.f(this.totalRedeemedCash, c1187a.totalRedeemedCash) && Float.compare(this.earnedPointsMultiplier, c1187a.earnedPointsMultiplier) == 0;
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final jo3.b getTotalRedeemedCash() {
                return this.totalRedeemedCash;
            }

            public final int hashCode() {
                return Float.hashCode(this.earnedPointsMultiplier) + y.e(this.totalRedeemedCash, m72.b.c(m72.b.c(m72.b.c(this.pointsAccountId.hashCode() * 31, this.balance, 31), this.totalAward, 31), this.totalRedeemed, 31), 31);
            }
        }

        public static final class b extends a {
            private b() {
            }

            public final boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof b);
            }

            public final int hashCode() {
                return -1178769266;
            }
        }

        private a() {
        }
    }

    private c() {
        super(3, 4, 1);
    }

    @Override // we0.g
    public final void c(SharedPreferences sharedPreferences, je0.d mapper) {
        Object aVar;
        ij.a sharedPref = (ij.a) sharedPreferences;
        Intrinsics.checkNotNullParameter(sharedPref, "sharedPref");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        ij.e eVarEdit = sharedPref.edit();
        String string = sharedPref.getString("REV_POINTS_ACCOUNT_STORAGE_KEY", null);
        if (string != null) {
            try {
                a aVar2 = (a) mapper.b(string, z.d(o0.b(a.class)));
                if (aVar2 instanceof a.C1187a) {
                    aVar = new e.a(((a.C1187a) aVar2).getPointsAccountId(), ((a.C1187a) aVar2).getBalance(), ((a.C1187a) aVar2).getTotalAward(), ((a.C1187a) aVar2).getTotalRedeemed(), ((a.C1187a) aVar2).getTotalRedeemedCash(), ((a.C1187a) aVar2).getEarnedPointsMultiplier());
                } else {
                    if (!(aVar2 instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar = e.b.f292940a;
                }
                eVarEdit.g("REV_POINTS_ACCOUNT_STORAGE_KEY", (String) mapper.c(aVar, z.d(o0.b(vxb.e.class))));
            } catch (JsonSyntaxException unused) {
            }
        }
        eVarEdit.apply();
    }
}
