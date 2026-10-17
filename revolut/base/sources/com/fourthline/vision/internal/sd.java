package com.fourthline.vision.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class sd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f36913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f36914b;

    public sd(Object obj2, boolean z) {
        this.f36913a = obj2;
        this.f36914b = z;
    }

    public static /* synthetic */ sd copy$default(sd sdVar, Object obj2, boolean z, int i, Object obj3) {
        if ((i & 1) != 0) {
            obj2 = sdVar.f36913a;
        }
        if ((i & 2) != 0) {
            z = sdVar.f36914b;
        }
        return sdVar.copy(obj2, z);
    }

    public final Object component1() {
        return this.f36913a;
    }

    public final boolean component2() {
        return this.f36914b;
    }

    @NotNull
    public final sd copy(Object obj2, boolean z) {
        return new sd(obj2, z);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof sd)) {
            return false;
        }
        sd sdVar = (sd) obj2;
        return Intrinsics.f(this.f36913a, sdVar.f36913a) && this.f36914b == sdVar.f36914b;
    }

    public final boolean getShouldDelayVideo() {
        return this.f36914b;
    }

    public final Object getStepType() {
        return this.f36913a;
    }

    public int hashCode() {
        Object obj2 = this.f36913a;
        return ((obj2 == null ? 0 : obj2.hashCode()) * 31) + Boolean.hashCode(this.f36914b);
    }

    @NotNull
    public String toString() {
        return "StepConfig(stepType=" + this.f36913a + ", shouldDelayVideo=" + this.f36914b + ")";
    }

    public /* synthetic */ sd(Object obj2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj2, (i & 2) != 0 ? false : z);
    }
}
