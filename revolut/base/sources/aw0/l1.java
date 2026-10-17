package aw0;

/* JADX INFO: loaded from: classes19.dex */
public abstract class l1 {

    public static final class a extends l1 {
        private a() {
        }
    }

    public static final class b extends l1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f10399a = new b();

        private b() {
        }
    }

    public static final class c extends l1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f10400a;

        public c() {
            this(0);
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof c) && Float.compare(this.f10400a, ((c) obj2).f10400a) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f10400a);
        }

        public c(float f) {
            this.f10400a = f;
        }

        public /* synthetic */ c(int i) {
            this(6.0f);
        }
    }

    public static final class d extends l1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f10401a = new d();

        private d() {
        }
    }

    private l1() {
    }
}
