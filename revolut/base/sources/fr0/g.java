package fr0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes19.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f137339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f137340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f137341c;
    public float d;
    public float e;
    public float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f137342g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f137343h;

    public final boolean a(float f) {
        float fAbs = Math.abs(f) % 90.0f;
        if (BitmapDescriptorFactory.HUE_RED > fAbs || fAbs > 5.0f) {
            return 80.0f <= fAbs && fAbs <= 90.0f;
        }
        return true;
    }
}
