package b93;

import h93.l0;
import java.io.Serializable;

/* JADX INFO: loaded from: classes21.dex */
public abstract class f implements Serializable {

    public static final class a extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l0 f13618a;

        public a() {
            this(null, 7);
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && this.f13618a == ((a) obj2).f13618a;
        }

        public final int hashCode() {
            l0 l0Var = this.f13618a;
            if (l0Var == null) {
                return 0;
            }
            return l0Var.hashCode();
        }

        public a(l0 l0Var, int i) {
            this.f13618a = (i & 4) != 0 ? null : l0Var;
        }
    }

    public static final class b extends f {
        public final boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof b);
        }

        public final int hashCode() {
            return 0;
        }
    }

    private f() {
    }
}
