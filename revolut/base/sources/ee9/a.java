package ee9;

import kotlin.jvm.internal.Intrinsics;
import wl0.i;
import wl0.o;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f125153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f125154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f125155c;

    public a(o biometricType, i biometricPromptType, boolean z) {
        Intrinsics.checkNotNullParameter(biometricType, "biometricType");
        Intrinsics.checkNotNullParameter(biometricPromptType, "biometricPromptType");
        this.f125153a = biometricType;
        this.f125154b = biometricPromptType;
        this.f125155c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f125153a == aVar.f125153a && this.f125154b == aVar.f125154b && this.f125155c == aVar.f125155c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f125155c) + ((this.f125154b.hashCode() + (this.f125153a.hashCode() * 31)) * 31);
    }
}
