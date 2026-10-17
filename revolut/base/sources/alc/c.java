package alc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pdh.c f6191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6192c;

    public c(String templateId, String str, pdh.c timeSpan) {
        Intrinsics.checkNotNullParameter(templateId, "templateId");
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        this.f6190a = templateId;
        this.f6191b = timeSpan;
        this.f6192c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f6190a, cVar.f6190a) && this.f6191b == cVar.f6191b && Intrinsics.f(this.f6192c, cVar.f6192c);
    }

    public final int hashCode() {
        int iHashCode = (this.f6191b.hashCode() + (this.f6190a.hashCode() * 31)) * 31;
        String str = this.f6192c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
