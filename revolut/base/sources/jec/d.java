package jec;

import aii.r;

/* JADX INFO: loaded from: classes6.dex */
public abstract class d implements r {
    private d() {
    }

    public static final class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final u6c.k f173259a;

        public a(u6c.k kVar) {
            this.f173259a = kVar;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && this.f173259a == ((a) obj2).f173259a;
        }

        public final int hashCode() {
            u6c.k kVar = this.f173259a;
            if (kVar == null) {
                return 0;
            }
            return kVar.hashCode();
        }

        public a() {
            this(null);
        }
    }
}
