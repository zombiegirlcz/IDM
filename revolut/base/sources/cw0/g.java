package cw0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public abstract class g {

    public static final class a extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f109516a = new a();

        private a() {
        }
    }

    public static final class b extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f109517a = new b();

        private b() {
        }
    }

    public static final class c extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h f109518a;

        public c() {
            this(0);
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof c) && this.f109518a == ((c) obj2).f109518a;
        }

        public final int hashCode() {
            return this.f109518a.hashCode();
        }

        public c(h type) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.f109518a = type;
        }

        public /* synthetic */ c(int i) {
            this(h.REMOVABLE);
        }
    }

    private g() {
    }
}
