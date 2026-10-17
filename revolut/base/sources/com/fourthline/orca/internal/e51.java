package com.fourthline.orca.internal;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
final class e51 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f27999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qa f28000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f28001c;

    public e51(String imageId, qa side, Set errors) {
        Intrinsics.checkNotNullParameter(imageId, "imageId");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(errors, "errors");
        this.f27999a = imageId;
        this.f28000b = side;
        this.f28001c = errors;
    }

    public final Set a() {
        return this.f28001c;
    }

    public final String b() {
        return this.f27999a;
    }

    public final qa c() {
        return this.f28000b;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e51)) {
            return false;
        }
        e51 e51Var = (e51) obj2;
        return Intrinsics.f(this.f27999a, e51Var.f27999a) && Intrinsics.f(this.f28000b, e51Var.f28000b) && Intrinsics.f(this.f28001c, e51Var.f28001c);
    }

    public int hashCode() {
        return (((this.f27999a.hashCode() * 31) + this.f28000b.hashCode()) * 31) + this.f28001c.hashCode();
    }

    public String toString() {
        return "StepError(imageId=" + this.f27999a + ", side=" + this.f28000b + ", errors=" + this.f28001c + ")";
    }
}
