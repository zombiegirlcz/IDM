package com.fourthline.vision.internal;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class d7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f36099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f36100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final q f36101c;
    private final List d;

    public d7(boolean z, float f, q qVar, List<x7> list) {
        this.f36099a = z;
        this.f36100b = f;
        this.f36101c = qVar;
        this.d = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ d7 copy$default(d7 d7Var, boolean z, float f, q qVar, List list, int i, Object obj2) {
        if ((i & 1) != 0) {
            z = d7Var.f36099a;
        }
        if ((i & 2) != 0) {
            f = d7Var.f36100b;
        }
        if ((i & 4) != 0) {
            qVar = d7Var.f36101c;
        }
        if ((i & 8) != 0) {
            list = d7Var.d;
        }
        return d7Var.copy(z, f, qVar, list);
    }

    public final boolean component1() {
        return this.f36099a;
    }

    public final float component2() {
        return this.f36100b;
    }

    public final q component3() {
        return this.f36101c;
    }

    public final List<x7> component4() {
        return this.d;
    }

    @NotNull
    public final d7 copy(boolean z, float f, q qVar, List<x7> list) {
        return new d7(z, f, qVar, list);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d7)) {
            return false;
        }
        d7 d7Var = (d7) obj2;
        return this.f36099a == d7Var.f36099a && Float.compare(this.f36100b, d7Var.f36100b) == 0 && Intrinsics.f(this.f36101c, d7Var.f36101c) && Intrinsics.f(this.d, d7Var.d);
    }

    public final q getBoundingBox() {
        return this.f36101c;
    }

    public final float getConfidence() {
        return this.f36100b;
    }

    public final boolean getDetected() {
        return this.f36099a;
    }

    public final List<x7> getLandmarks() {
        return this.d;
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.f36099a) * 31) + Float.hashCode(this.f36100b)) * 31;
        q qVar = this.f36101c;
        int iHashCode2 = (iHashCode + (qVar == null ? 0 : qVar.hashCode())) * 31;
        List list = this.d;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "HandDetectionResult(detected=" + this.f36099a + ", confidence=" + this.f36100b + ", boundingBox=" + this.f36101c + ", landmarks=" + this.d + ")";
    }

    public /* synthetic */ d7(boolean z, float f, q qVar, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, f, (i & 4) != 0 ? null : qVar, (i & 8) != 0 ? null : list);
    }
}
