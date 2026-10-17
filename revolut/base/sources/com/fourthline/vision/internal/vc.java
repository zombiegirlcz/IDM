package com.fourthline.vision.internal;

import com.fourthline.vision.ScannerImage;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class vc implements ud {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ScannerImage f37018a;

    public vc(@NotNull ScannerImage image) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.f37018a = image;
    }

    public static /* synthetic */ vc copy$default(vc vcVar, ScannerImage scannerImage, int i, Object obj2) {
        if ((i & 1) != 0) {
            scannerImage = vcVar.f37018a;
        }
        return vcVar.copy(scannerImage);
    }

    @NotNull
    public final ScannerImage component1() {
        return this.f37018a;
    }

    @NotNull
    public final vc copy(@NotNull ScannerImage image) {
        Intrinsics.checkNotNullParameter(image, "image");
        return new vc(image);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof vc) && Intrinsics.f(this.f37018a, ((vc) obj2).f37018a);
    }

    @Override // com.fourthline.vision.internal.ud
    @NotNull
    public ScannerImage getImage() {
        return this.f37018a;
    }

    public int hashCode() {
        return this.f37018a.hashCode();
    }

    @NotNull
    public String toString() {
        return "SelfieStepResult(image=" + this.f37018a + ")";
    }
}
