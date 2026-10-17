package fa1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public abstract class o {

    public static final class a extends o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f133196a = new a();

        private a() {
        }
    }

    public static final class b extends o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f133197a = new b();

        private b() {
        }
    }

    public static final class c extends o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f133198a = new c();

        private c() {
        }
    }

    public static final class f extends o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f133201a = new f();

        private f() {
        }
    }

    public static final class g extends o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f133202a = new g();

        private g() {
        }
    }

    public static final class h extends o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f133203a = new h();

        private h() {
        }
    }

    public static final class i extends o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f133204a = new i();

        private i() {
        }
    }

    private o() {
    }

    public static final class d extends o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f133199a;

        public d(Throwable th10) {
            this.f133199a = th10;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof d) && Intrinsics.f(this.f133199a, ((d) obj2).f133199a);
        }

        public final int hashCode() {
            Throwable th10 = this.f133199a;
            if (th10 == null) {
                return 0;
            }
            return th10.hashCode();
        }

        public d() {
            this(null);
        }
    }

    public static final class e extends o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f133200a;

        public e(Throwable th10) {
            this.f133200a = th10;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof e) && Intrinsics.f(this.f133200a, ((e) obj2).f133200a);
        }

        public final int hashCode() {
            Throwable th10 = this.f133200a;
            if (th10 == null) {
                return 0;
            }
            return th10.hashCode();
        }

        public e() {
            this(null);
        }
    }
}
