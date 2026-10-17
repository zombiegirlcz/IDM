package yw;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f317230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f317231b;

    public d(c photoPreset, i videoPreset) {
        Intrinsics.checkNotNullParameter(photoPreset, "photoPreset");
        Intrinsics.checkNotNullParameter(videoPreset, "videoPreset");
        this.f317230a = photoPreset;
        this.f317231b = videoPreset;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f317230a, dVar.f317230a) && Intrinsics.f(this.f317231b, dVar.f317231b);
    }

    public final int hashCode() {
        return this.f317231b.hashCode() + (this.f317230a.hashCode() * 31);
    }
}
