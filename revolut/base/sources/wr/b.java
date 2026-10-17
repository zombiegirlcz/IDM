package wr;

import com.revolut.biometric_verification.api.models.BiometricVerificationFeatures;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f299481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f299482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BiometricVerificationFeatures f299483c;

    public b(ArrayList steps, List resources, BiometricVerificationFeatures features) {
        Intrinsics.checkNotNullParameter(steps, "steps");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(features, "features");
        this.f299481a = steps;
        this.f299482b = resources;
        this.f299483c = features;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f299481a.equals(bVar.f299481a) && Intrinsics.f(this.f299482b, bVar.f299482b) && this.f299483c.equals(bVar.f299483c);
    }

    public final int hashCode() {
        return this.f299483c.hashCode() + p.a.d(this.f299481a.hashCode() * 31, 31, this.f299482b);
    }
}
