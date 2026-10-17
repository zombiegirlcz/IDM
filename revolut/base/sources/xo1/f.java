package xo1;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0004\u0006¨\u0006\u0007"}, d2 = {"Lxo1/f;", "", "<init>", "()V", "xo1/e", "a", "Lxo1/f$a;", "feature_apm_bills_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public abstract class f {
    private f() {
    }

    public static final class a extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f307570a;

        public a(String str) {
            this.f307570a = str;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && Intrinsics.f(this.f307570a, ((a) obj2).f307570a);
        }

        public final int hashCode() {
            String str = this.f307570a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public a() {
            this(null);
        }
    }
}
