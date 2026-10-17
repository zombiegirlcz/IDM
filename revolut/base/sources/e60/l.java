package e60;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public abstract class l {
    private l() {
    }

    public abstract String a();

    public static final class a extends l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f122861a;

        public a(String str) {
            this.f122861a = str;
        }

        @Override // e60.l
        public final String a() {
            return this.f122861a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && Intrinsics.f(this.f122861a, ((a) obj2).f122861a);
        }

        public final int hashCode() {
            String str = this.f122861a;
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
