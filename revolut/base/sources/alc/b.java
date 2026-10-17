package alc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pdh.c f6188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6189c;

    public b(String templateId, String str, pdh.c timeSpan) {
        Intrinsics.checkNotNullParameter(templateId, "templateId");
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        this.f6187a = templateId;
        this.f6188b = timeSpan;
        this.f6189c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f6187a, bVar.f6187a) && this.f6188b == bVar.f6188b && Intrinsics.f(this.f6189c, bVar.f6189c);
    }

    public final int hashCode() {
        int iHashCode = (this.f6188b.hashCode() + (this.f6187a.hashCode() * 31)) * 31;
        String str = this.f6189c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
