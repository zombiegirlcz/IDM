package com.fourthline.vision.internal;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class i2 implements tf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f36345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f36346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f36347c;
    private int d;
    private rf e;

    public i2(@NotNull List<? extends rf> requiredSteps) {
        Intrinsics.checkNotNullParameter(requiredSteps, "requiredSteps");
        this.f36345a = requiredSteps;
        this.f36346b = requiredSteps;
        this.f36347c = requiredSteps.size();
        this.e = requiredSteps.get(this.d);
    }

    @Override // com.fourthline.vision.internal.tf
    @NotNull
    public rf getCurrentStep() {
        return this.e;
    }

    @Override // com.fourthline.vision.internal.tf
    public int getStepCount() {
        return this.f36347c;
    }

    @Override // com.fourthline.vision.internal.tf
    public boolean hasNext() {
        return this.d + 1 < this.f36346b.size();
    }

    @Override // com.fourthline.vision.internal.tf
    @NotNull
    public rf next() {
        if (!hasNext()) {
            throw new IllegalStateException("VisionStepManager.next() requested when there is no next item.");
        }
        int i = this.d + 1;
        this.d = i;
        rf rfVar = (rf) this.f36346b.get(i);
        this.e = rfVar;
        return rfVar;
    }

    @Override // com.fourthline.vision.internal.tf
    public void resetAllSteps() {
        this.d = 0;
    }

    @Override // com.fourthline.vision.internal.tf
    public void resetStep() {
    }
}
