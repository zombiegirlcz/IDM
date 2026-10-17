package yy3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f317764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f317765b;

    public a(j signingMethods, s info) {
        Intrinsics.checkNotNullParameter(signingMethods, "signingMethods");
        Intrinsics.checkNotNullParameter(info, "info");
        this.f317764a = signingMethods;
        this.f317765b = info;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f317764a, aVar.f317764a) && Intrinsics.f(this.f317765b, aVar.f317765b);
    }

    public final int hashCode() {
        return this.f317765b.hashCode() + (this.f317764a.hashCode() * 31);
    }
}
