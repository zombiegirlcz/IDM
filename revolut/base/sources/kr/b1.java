package kr;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@mlm.g
public final class b1 {

    @NotNull
    public static final a1 Companion = new a1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f188460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f188461b;

    public /* synthetic */ b1(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(z0.f188614a.getDescriptor(), i, 3);
            throw null;
        }
        this.f188460a = str;
        this.f188461b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj2;
        return Intrinsics.f(this.f188460a, b1Var.f188460a) && Intrinsics.f(this.f188461b, b1Var.f188461b);
    }

    public final int hashCode() {
        return this.f188461b.hashCode() + (this.f188460a.hashCode() * 31);
    }

    public b1(String faceDetectorVersion, String faceCorrectnessVersion) {
        Intrinsics.checkNotNullParameter(faceDetectorVersion, "faceDetectorVersion");
        Intrinsics.checkNotNullParameter(faceCorrectnessVersion, "faceCorrectnessVersion");
        this.f188460a = faceDetectorVersion;
        this.f188461b = faceCorrectnessVersion;
    }
}
