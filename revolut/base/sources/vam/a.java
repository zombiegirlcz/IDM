package vam;

import kotlin.jvm.internal.Intrinsics;
import uam.b;
import uam.d;
import uam.f;
import uam.g;
import uam.i;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f287338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f287339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f287340c;
    public final int d;
    public final g e;
    public final b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f287341g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i f287342h;
    public final i i;

    public a(d flashMode, f focusMode, int i, int i2, g previewFpsRange, b antiBandingMode, Integer num, i pictureResolution, i previewResolution) {
        Intrinsics.checkNotNullParameter(flashMode, "flashMode");
        Intrinsics.checkNotNullParameter(focusMode, "focusMode");
        Intrinsics.checkNotNullParameter(previewFpsRange, "previewFpsRange");
        Intrinsics.checkNotNullParameter(antiBandingMode, "antiBandingMode");
        Intrinsics.checkNotNullParameter(pictureResolution, "pictureResolution");
        Intrinsics.checkNotNullParameter(previewResolution, "previewResolution");
        this.f287338a = flashMode;
        this.f287339b = focusMode;
        this.f287340c = i;
        this.d = i2;
        this.e = previewFpsRange;
        this.f = antiBandingMode;
        this.f287341g = num;
        this.f287342h = pictureResolution;
        this.i = previewResolution;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f287338a, aVar.f287338a) && Intrinsics.f(this.f287339b, aVar.f287339b) && this.f287340c == aVar.f287340c && this.d == aVar.d && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && Intrinsics.f(this.f287341g, aVar.f287341g) && Intrinsics.f(this.f287342h, aVar.f287342h) && Intrinsics.f(this.i, aVar.i);
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + ((this.e.hashCode() + j6.a.b(this.d, j6.a.b(this.f287340c, (this.f287339b.hashCode() + (this.f287338a.hashCode() * 31)) * 31, 31), 31)) * 31)) * 31;
        Integer num = this.f287341g;
        return this.i.hashCode() + ((this.f287342h.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "CameraParameters" + gbm.b.f142275a + "flashMode:" + gbm.b.a(this.f287338a) + "focusMode:" + gbm.b.a(this.f287339b) + "jpegQuality:" + gbm.b.a(Integer.valueOf(this.f287340c)) + "exposureCompensation:" + gbm.b.a(Integer.valueOf(this.d)) + "previewFpsRange:" + gbm.b.a(this.e) + "antiBandingMode:" + gbm.b.a(this.f) + "sensorSensitivity:" + gbm.b.a(this.f287341g) + "pictureResolution:" + gbm.b.a(this.f287342h) + "previewResolution:" + gbm.b.a(this.i);
    }
}
