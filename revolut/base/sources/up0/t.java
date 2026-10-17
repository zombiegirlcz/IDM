package up0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ix0.i1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class t {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f281761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f281762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f281763c;
    public float d;
    public long e;
    public float f;

    public static final class a {
        private a() {
        }
    }

    public t() {
        this(0);
    }

    public final float a(long j2) {
        boolean z = this.f281762b;
        long j3 = this.f281761a;
        if (z) {
            if (this.f281763c == -1) {
                return 1.0f;
            }
            float fD = i1.d((j2 - r6) / j3);
            float f = this.d;
            return j6.a.a(1.0f, f, fD, f);
        }
        if (this.e == -1) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        float f4 = (j2 - r6) / j3;
        if (f4 >= 1.0f) {
            this.e = -1L;
            return BitmapDescriptorFactory.HUE_RED;
        }
        return (1.0f - i1.d(f4)) * this.f;
    }

    public t(int i) {
        this.f281761a = 450000000L;
        this.f281763c = -1L;
        this.e = -1L;
    }
}
