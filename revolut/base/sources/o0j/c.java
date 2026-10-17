package o0j;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class c {

    public static final class a extends c implements o0j.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f221216a = new a();

        private a() {
        }
    }

    public static final class b extends c implements o0j.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f221217a = new b();

        private b() {
        }
    }

    /* JADX INFO: renamed from: o0j.c$c, reason: collision with other inner class name */
    public static final class C1228c extends c implements o0j.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1228c f221218a = new C1228c();

        private C1228c() {
        }
    }

    public static final class d extends c implements o0j.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f221219a = new d();

        private d() {
        }
    }

    public static final class e extends c implements o0j.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f221220a = new e();

        private e() {
        }
    }

    public static final class f extends c implements o0j.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f221221a = new f();

        private f() {
        }
    }

    public static final class g extends c implements o0j.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f221222a = new g();

        private g() {
        }
    }

    public static final class h extends c implements o0j.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f221223a = new h();

        private h() {
        }
    }

    public static final class i extends c implements o0j.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f221224a = new i();

        private i() {
        }
    }

    public static final class j extends c implements o0j.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f221225a = new j();

        private j() {
        }
    }

    public static final class k extends c {
        private k() {
        }
    }

    public static final class l extends c implements o0j.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final l f221226a = new l();

        private l() {
        }
    }

    public static final class n extends c implements o0j.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final n f221229a = new n();

        private n() {
        }
    }

    private c() {
    }

    public static final class m extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f221227a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f221228b;

        public m(String str, String str2) {
            this.f221227a = str;
            this.f221228b = str2;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof m)) {
                return false;
            }
            m mVar = (m) obj2;
            return Intrinsics.f(this.f221227a, mVar.f221227a) && Intrinsics.f(this.f221228b, mVar.f221228b);
        }

        public final int hashCode() {
            String str = this.f221227a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f221228b;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public m() {
            this(null, null);
        }
    }
}
