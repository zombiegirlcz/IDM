package fr0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes19.dex */
public abstract class j {

    public static final class a extends j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f137351a = new a();

        private a() {
        }
    }

    public static final class b extends j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f137352a = new b();

        private b() {
        }
    }

    public static final class c extends j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f137353a = new c();

        private c() {
        }
    }

    public static final class d extends j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f137354a = new d();

        private d() {
        }
    }

    public static final class e extends j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f137355a = new e();

        private e() {
        }
    }

    public static final class f extends j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f137356a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f137357b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f137358c;
        public float d;

        public f() {
            this(0);
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof f)) {
                return false;
            }
            f fVar = (f) obj2;
            return Float.compare(this.f137356a, fVar.f137356a) == 0 && Float.compare(this.f137357b, fVar.f137357b) == 0 && Float.compare(this.f137358c, fVar.f137358c) == 0 && Float.compare(this.d, fVar.d) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.d) + m72.b.b(this.f137358c, m72.b.b(this.f137357b, Float.hashCode(this.f137356a) * 31, 31), 31);
        }

        public f(int i) {
            this.f137356a = 1.0f;
            this.f137357b = BitmapDescriptorFactory.HUE_RED;
            this.f137358c = BitmapDescriptorFactory.HUE_RED;
            this.d = BitmapDescriptorFactory.HUE_RED;
        }
    }

    private j() {
    }
}
