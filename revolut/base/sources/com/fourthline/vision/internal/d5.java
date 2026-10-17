package com.fourthline.vision.internal;

import com.fourthline.core.mrz.MrzInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class d5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MrzInfo f36095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final fa f36096b;

    public d5(@NotNull MrzInfo mrzInfo, @NotNull fa detectionArea) {
        Intrinsics.checkNotNullParameter(mrzInfo, "mrzInfo");
        Intrinsics.checkNotNullParameter(detectionArea, "detectionArea");
        this.f36095a = mrzInfo;
        this.f36096b = detectionArea;
    }

    public static /* synthetic */ d5 copy$default(d5 d5Var, MrzInfo mrzInfo, fa faVar, int i, Object obj2) {
        if ((i & 1) != 0) {
            mrzInfo = d5Var.f36095a;
        }
        if ((i & 2) != 0) {
            faVar = d5Var.f36096b;
        }
        return d5Var.copy(mrzInfo, faVar);
    }

    @NotNull
    public final MrzInfo component1() {
        return this.f36095a;
    }

    @NotNull
    public final fa component2() {
        return this.f36096b;
    }

    @NotNull
    public final d5 copy(@NotNull MrzInfo mrzInfo, @NotNull fa detectionArea) {
        Intrinsics.checkNotNullParameter(mrzInfo, "mrzInfo");
        Intrinsics.checkNotNullParameter(detectionArea, "detectionArea");
        return new d5(mrzInfo, detectionArea);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d5)) {
            return false;
        }
        d5 d5Var = (d5) obj2;
        return Intrinsics.f(this.f36095a, d5Var.f36095a) && Intrinsics.f(this.f36096b, d5Var.f36096b);
    }

    @NotNull
    public final fa getDetectionArea() {
        return this.f36096b;
    }

    @NotNull
    public final MrzInfo getMrzInfo() {
        return this.f36095a;
    }

    public int hashCode() {
        return (this.f36095a.hashCode() * 31) + this.f36096b.hashCode();
    }

    @NotNull
    public String toString() {
        return "DocumentPhotoMrzCandidate(mrzInfo=" + this.f36095a + ", detectionArea=" + this.f36096b + ")";
    }
}
