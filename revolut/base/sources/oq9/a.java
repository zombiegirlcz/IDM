package oq9;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f227798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f227799b;

    public a(e personal, f total) {
        Intrinsics.checkNotNullParameter(personal, "personal");
        Intrinsics.checkNotNullParameter(total, "total");
        this.f227798a = personal;
        this.f227799b = total;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f227798a, aVar.f227798a) && Intrinsics.f(this.f227799b, aVar.f227799b);
    }

    public final int hashCode() {
        return this.f227799b.f227814a.hashCode() + (this.f227798a.hashCode() * 31);
    }
}
