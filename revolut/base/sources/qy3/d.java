package qy3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f250144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f250145b;

    public d(String parameterKey, String message) {
        Intrinsics.checkNotNullParameter(parameterKey, "parameterKey");
        Intrinsics.checkNotNullParameter(message, "message");
        this.f250144a = parameterKey;
        this.f250145b = message;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f250144a, dVar.f250144a) && Intrinsics.f(this.f250145b, dVar.f250145b);
    }

    public final int hashCode() {
        return this.f250145b.hashCode() + (this.f250144a.hashCode() * 31);
    }
}
