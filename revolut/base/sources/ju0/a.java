package ju0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public abstract class a {

    /* JADX INFO: renamed from: ju0.a$a, reason: collision with other inner class name */
    public static final class C1014a extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1014a f178545a = new C1014a();

        private C1014a() {
        }

        public final boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof C1014a);
        }

        public final int hashCode() {
            return -1909772825;
        }
    }

    private a() {
    }

    public static final class b extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f178546a;

        public b(Throwable th10) {
            this.f178546a = th10;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof b) && Intrinsics.f(this.f178546a, ((b) obj2).f178546a);
        }

        public final int hashCode() {
            Throwable th10 = this.f178546a;
            if (th10 == null) {
                return 0;
            }
            return th10.hashCode();
        }

        public b() {
            this(null);
        }
    }
}
