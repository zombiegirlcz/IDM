package jhj;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public abstract class b {

    public static final class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f174273a = new a();

        private a() {
        }
    }

    public static final class c extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f174276a = new c();

        private c() {
        }
    }

    private b() {
    }

    /* JADX INFO: renamed from: jhj.b$b, reason: collision with other inner class name */
    public static final class C0992b extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f174274a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f174275b;

        public C0992b(Clause clause, boolean z) {
            this.f174274a = clause;
            this.f174275b = z;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof C0992b)) {
                return false;
            }
            C0992b c0992b = (C0992b) obj2;
            return Intrinsics.f(this.f174274a, c0992b.f174274a) && this.f174275b == c0992b.f174275b;
        }

        public final int hashCode() {
            Clause clause = this.f174274a;
            return Boolean.hashCode(this.f174275b) + ((clause == null ? 0 : clause.hashCode()) * 31);
        }

        public C0992b() {
            this(null, false);
        }
    }
}
