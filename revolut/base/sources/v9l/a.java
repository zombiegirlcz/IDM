package v9l;

import k71.q;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3 f287078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f287079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f287080c;

    public a(String str, q extraData, a3 original) {
        Intrinsics.checkNotNullParameter(original, "original");
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        this.f287078a = original;
        this.f287079b = extraData;
        this.f287080c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f287078a, aVar.f287078a) && Intrinsics.f(this.f287079b, aVar.f287079b) && Intrinsics.f(this.f287080c, aVar.f287080c);
    }

    public final int hashCode() {
        int iHashCode = (this.f287079b.hashCode() + (this.f287078a.hashCode() * 31)) * 31;
        String str = this.f287080c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
