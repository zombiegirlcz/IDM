package yw;

import com.revolut.camerakit.core.settings.VideoWatermark;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f317232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f317233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f317234c;
    public final e d;
    public final d e;
    public final b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f317235g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final VideoWatermark f317236h;
    public final boolean i;

    public f(a cameraLens, e videoResolution, e analysisResolution, e photoResolution, d cameraPreset, b initialMode, e previewResolution, VideoWatermark videoWatermark, boolean z) {
        Intrinsics.checkNotNullParameter(cameraLens, "cameraLens");
        Intrinsics.checkNotNullParameter(videoResolution, "videoResolution");
        Intrinsics.checkNotNullParameter(analysisResolution, "analysisResolution");
        Intrinsics.checkNotNullParameter(photoResolution, "photoResolution");
        Intrinsics.checkNotNullParameter(cameraPreset, "cameraPreset");
        Intrinsics.checkNotNullParameter(initialMode, "initialMode");
        Intrinsics.checkNotNullParameter(previewResolution, "previewResolution");
        Intrinsics.checkNotNullParameter(videoWatermark, "videoWatermark");
        this.f317232a = cameraLens;
        this.f317233b = videoResolution;
        this.f317234c = analysisResolution;
        this.d = photoResolution;
        this.e = cameraPreset;
        this.f = initialMode;
        this.f317235g = previewResolution;
        this.f317236h = videoWatermark;
        this.i = z;
    }

    @Override // yw.h
    public final VideoWatermark a() {
        return this.f317236h;
    }

    @Override // yw.h
    public final d b() {
        return this.e;
    }

    @Override // yw.h
    public final e c() {
        return this.f317233b;
    }

    @Override // yw.h
    public final a d() {
        return this.f317232a;
    }

    @Override // yw.h
    public final b e() {
        return this.f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f317232a == fVar.f317232a && this.f317233b == fVar.f317233b && this.f317234c == fVar.f317234c && this.d == fVar.d && Intrinsics.f(this.e, fVar.e) && this.f == fVar.f && this.f317235g == fVar.f317235g && Intrinsics.f(this.f317236h, fVar.f317236h) && this.i == fVar.i;
    }

    @Override // yw.h
    public final e f() {
        return this.f317234c;
    }

    @Override // yw.h
    public final boolean g() {
        return this.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + ((this.f317236h.hashCode() + ((this.f317235g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.f317234c.hashCode() + ((this.f317233b.hashCode() + (this.f317232a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }
}
