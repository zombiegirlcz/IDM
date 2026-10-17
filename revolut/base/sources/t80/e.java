package t80;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public abstract class e {
    private e() {
    }

    public static final class a extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f268764a;

        public a(String str) {
            this.f268764a = str;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && Intrinsics.f(this.f268764a, ((a) obj2).f268764a);
        }

        public final int hashCode() {
            String str = this.f268764a;
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
