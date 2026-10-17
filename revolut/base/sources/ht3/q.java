package ht3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class q implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f155301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f155302b;

    public q(String imageUrl, p pVar) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        this.f155301a = imageUrl;
        this.f155302b = pVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f155301a, qVar.f155301a) && Intrinsics.f(this.f155302b, qVar.f155302b);
    }

    public final int hashCode() {
        int iHashCode = this.f155301a.hashCode() * 31;
        p pVar = this.f155302b;
        return iHashCode + (pVar == null ? 0 : pVar.hashCode());
    }
}
