package yw;

import com.revolut.camerakit.core.settings.VideoWatermark;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f317237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f317238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f317239c;
    public final e d;
    public final b e;
    public final d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final VideoWatermark f317240g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f317241h;

    public g(a cameraLens, e videoResolution, e analysisResolution, e photoResolution, b initialMode, d cameraPreset, VideoWatermark videoWatermark, boolean z) {
        Intrinsics.checkNotNullParameter(cameraLens, "cameraLens");
        Intrinsics.checkNotNullParameter(videoResolution, "videoResolution");
        Intrinsics.checkNotNullParameter(analysisResolution, "analysisResolution");
        Intrinsics.checkNotNullParameter(photoResolution, "photoResolution");
        Intrinsics.checkNotNullParameter(initialMode, "initialMode");
        Intrinsics.checkNotNullParameter(cameraPreset, "cameraPreset");
        Intrinsics.checkNotNullParameter(videoWatermark, "videoWatermark");
        this.f317237a = cameraLens;
        this.f317238b = videoResolution;
        this.f317239c = analysisResolution;
        this.d = photoResolution;
        this.e = initialMode;
        this.f = cameraPreset;
        this.f317240g = videoWatermark;
        this.f317241h = z;
    }

    @Override // yw.h
    public final VideoWatermark a() {
        return this.f317240g;
    }

    @Override // yw.h
    public final d b() {
        return this.f;
    }

    @Override // yw.h
    public final e c() {
        return this.f317238b;
    }

    @Override // yw.h
    public final a d() {
        return this.f317237a;
    }

    @Override // yw.h
    public final b e() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f317237a == gVar.f317237a && this.f317238b == gVar.f317238b && this.f317239c == gVar.f317239c && this.d == gVar.d && this.e == gVar.e && Intrinsics.f(this.f, gVar.f) && Intrinsics.f(this.f317240g, gVar.f317240g) && this.f317241h == gVar.f317241h;
    }

    @Override // yw.h
    public final e f() {
        return this.f317239c;
    }

    @Override // yw.h
    public final boolean g() {
        return this.f317241h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f317241h) + ((this.f317240g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.f317239c.hashCode() + ((this.f317238b.hashCode() + (this.f317237a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }
}
