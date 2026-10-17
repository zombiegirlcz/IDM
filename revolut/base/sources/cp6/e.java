package cp6;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e implements r {

    public static final class b extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f107882a = new b();

        private b() {
        }
    }

    private e() {
    }

    public static final class a extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f107881a;

        public a(d dVar) {
            this.f107881a = dVar;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && Intrinsics.f(this.f107881a, ((a) obj2).f107881a);
        }

        public final int hashCode() {
            d dVar = this.f107881a;
            if (dVar == null) {
                return 0;
            }
            return dVar.hashCode();
        }

        public a() {
            this(null);
        }
    }
}
