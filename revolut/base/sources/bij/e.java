package bij;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public abstract class e implements r {

    public static final class a extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f15511a = new a();

        private a() {
        }
    }

    public static final class c extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f15513a = new c();

        private c() {
        }
    }

    public static final class d extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f15514a = new d();

        private d() {
        }
    }

    /* JADX INFO: renamed from: bij.e$e, reason: collision with other inner class name */
    public static final class C0100e extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0100e f15515a = new C0100e();

        private C0100e() {
        }
    }

    public static final class f extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f15516a = new f();

        private f() {
        }
    }

    private e() {
    }

    public static final class b extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f15512a;

        public b(String str) {
            this.f15512a = str;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof b) && Intrinsics.f(this.f15512a, ((b) obj2).f15512a);
        }

        public final int hashCode() {
            String str = this.f15512a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public b() {
            this(null);
        }
    }
}
