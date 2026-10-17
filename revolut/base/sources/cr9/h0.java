package cr9;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public abstract class h0 implements Serializable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcr9/h0$a;", "Lcr9/h0;", "", "toString", "()Ljava/lang/String;", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a extends h0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f108258a;

        public a(String description) {
            Intrinsics.checkNotNullParameter(description, "description");
            this.f108258a = description;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && Intrinsics.f(this.f108258a, ((a) obj2).f108258a);
        }

        public final int hashCode() {
            return this.f108258a.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcr9/h0$b;", "Lcr9/h0;", "", "toString", "()Ljava/lang/String;", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b extends h0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f108259a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f108260b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final g0 f108261c;

        public b(String code, String description, g0 g0Var) {
            Intrinsics.checkNotNullParameter(code, "code");
            Intrinsics.checkNotNullParameter(description, "description");
            this.f108259a = code;
            this.f108260b = description;
            this.f108261c = g0Var;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.f108259a, bVar.f108259a) && Intrinsics.f(this.f108260b, bVar.f108260b) && Intrinsics.f(this.f108261c, bVar.f108261c);
        }

        public final int hashCode() {
            int iC = p.a.c(this.f108259a.hashCode() * 31, 31, this.f108260b);
            g0 g0Var = this.f108261c;
            return iC + (g0Var == null ? 0 : g0Var.hashCode());
        }
    }

    private h0() {
    }
}
