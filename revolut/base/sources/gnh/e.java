package gnh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class e {

    public static final class a extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f144995a = new a();

        private a() {
        }
    }

    public static final class b extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f144996a;

        public b() {
            this(0);
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof b) && this.f144996a == ((b) obj2).f144996a;
        }

        public final int hashCode() {
            return this.f144996a.hashCode();
        }

        public b(f contentType) {
            Intrinsics.checkNotNullParameter(contentType, "contentType");
            this.f144996a = contentType;
        }

        public /* synthetic */ b(int i) {
            this(f.DEFAULT);
        }
    }

    public static final class c extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f144997a = new c();

        private c() {
        }
    }

    private e() {
    }
}
