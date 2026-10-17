package ux4;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class k implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f283871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f283872b;

    public k(String id10, j type) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f283871a = id10;
        this.f283872b = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f283871a, kVar.f283871a) && this.f283872b == kVar.f283872b;
    }

    public final int hashCode() {
        return this.f283872b.hashCode() + (this.f283871a.hashCode() * 31);
    }
}
