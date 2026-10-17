package k7;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes16.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f181752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f181753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f181754c;
    public b d;
    public int e;
    public float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f181755g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f181756h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f181757j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public PointF f181758l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public PointF f181759m;

    public final int hashCode() {
        int iOrdinal = ((this.d.ordinal() + (((int) (p.a.c(this.f181752a.hashCode() * 31, 31, this.f181753b) + this.f181754c)) * 31)) * 31) + this.e;
        long jFloatToRawIntBits = Float.floatToRawIntBits(this.f);
        return (((iOrdinal * 31) + ((int) (jFloatToRawIntBits ^ (jFloatToRawIntBits >>> 32)))) * 31) + this.f181756h;
    }
}
