package cs0;

import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.view.animation.LinearInterpolator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class a {

    @NotNull
    public static final d Companion = new d();
    public static final float u = (float) Math.tan(Math.toRadians(20.0d));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f108409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f108410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public cs0.d f108411c;
    public int d;
    public int e;
    public final e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f108412g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f108413h;
    public float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f108414j;
    public float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f108415l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f108416m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f108417n;
    public int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f108418p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public PorterDuff.Mode f108419q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f108420r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f108421s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public LinearInterpolator f108422t;

    /* JADX INFO: renamed from: cs0.a$a, reason: collision with other inner class name */
    public static final class C0641a extends b {
        public C0641a() {
            this.f108423a.f108419q = PorterDuff.Mode.DST_IN;
        }

        @Override // cs0.a.b
        public final b b() {
            return this;
        }
    }

    public static abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f108423a = new a(0);

        public final a a() {
            a aVar = this.f108423a;
            float[] fArr = aVar.f108409a;
            int[] iArr = aVar.f108410b;
            int i = f.f108425a[aVar.f.ordinal()];
            float f = BitmapDescriptorFactory.HUE_RED;
            if (i == 1) {
                int i2 = aVar.e;
                iArr[0] = i2;
                int i3 = aVar.d;
                iArr[1] = i3;
                iArr[2] = i3;
                iArr[3] = i2;
                float f4 = aVar.i;
                float f5 = 1.0f - f4;
                float f6 = aVar.f108414j;
                float f32 = (f5 - f6) / 2.0f;
                if (f32 < BitmapDescriptorFactory.HUE_RED) {
                    f32 = 0.0f;
                }
                fArr[0] = f32;
                float f35 = f5 / 2.0f;
                if (f35 >= BitmapDescriptorFactory.HUE_RED) {
                    f = f35;
                }
                fArr[1] = f;
                float f36 = f4 + 1.0f;
                float f37 = f36 / 2.0f;
                if (f37 > 1.0f) {
                    f37 = 1.0f;
                }
                fArr[2] = f37;
                float f41 = (f36 + f6) / 2.0f;
                fArr[3] = f41 <= 1.0f ? f41 : 1.0f;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                int i5 = aVar.d;
                iArr[0] = i5;
                iArr[1] = i5;
                int i6 = aVar.e;
                iArr[2] = i6;
                iArr[3] = i6;
                fArr[0] = 0.0f;
                float f42 = aVar.i;
                fArr[1] = f42 > 1.0f ? 1.0f : f42;
                float f57 = f42 + aVar.f108414j;
                if (f57 > 1.0f) {
                    f57 = 1.0f;
                }
                fArr[2] = f57;
                fArr[3] = 1.0f;
            }
            return aVar;
        }

        public abstract b b();

        public final b c(float f) {
            a aVar = this.f108423a;
            aVar.e = io0.a.d(kotlin.ranges.f.f(f, BitmapDescriptorFactory.HUE_RED, 1.0f), aVar.e);
            return b();
        }

        public final b d(cs0.d direction) {
            Intrinsics.checkNotNullParameter(direction, "direction");
            this.f108423a.f108411c = direction;
            return b();
        }

        public final void e() {
            this.f108423a.f108414j = 0.7f;
        }

        public final b f(long j2) {
            if (j2 < 0) {
                throw new IllegalArgumentException(p.a.m(j2, "Given a negative duration: ").toString());
            }
            this.f108423a.f108418p = j2;
            return b();
        }

        public final void g(float f) {
            a aVar = this.f108423a;
            aVar.d = io0.a.d(kotlin.ranges.f.f(f, BitmapDescriptorFactory.HUE_RED, 1.0f), aVar.d);
        }

        public final void h() {
            this.f108423a.i = 0.15f;
        }

        public final b i(float f) {
            a aVar = this.f108423a;
            aVar.k = f;
            aVar.f108415l = (float) Math.tan(Math.toRadians(f));
            return b();
        }

        public final b j() {
            this.f108423a.f108412g = 2.0f;
            return b();
        }
    }

    public static final class c extends b {
        public c() {
            this.f108423a.f108419q = PorterDuff.Mode.SRC_IN;
        }

        @Override // cs0.a.b
        public final b b() {
            return this;
        }

        public final void k(cs0.b mode) {
            PorterDuff.Mode mode2;
            Intrinsics.checkNotNullParameter(mode, "mode");
            int i = cs0.c.f108424a[mode.ordinal()];
            if (i == 1) {
                mode2 = PorterDuff.Mode.SRC_ATOP;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                mode2 = null;
            }
            this.f108423a.f108419q = mode2;
        }
    }

    public static final class d {
        private d() {
        }
    }

    public /* synthetic */ a(int i) {
        this();
    }

    private a() {
        this.f108409a = new float[4];
        this.f108410b = new int[4];
        new RectF();
        this.f108411c = cs0.d.LEFT_TO_RIGHT;
        this.d = -1;
        this.e = 1291845631;
        this.f = e.LINEAR;
        this.f108412g = 1.0f;
        this.f108413h = 1.0f;
        this.f108414j = 0.5f;
        this.k = 20.0f;
        this.f108415l = u;
        this.f108416m = true;
        this.f108417n = -1;
        this.o = 1;
        this.f108418p = 1000L;
    }
}
