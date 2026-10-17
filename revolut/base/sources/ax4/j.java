package ax4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10884c;
    public final boolean d;

    public j(String listId, String extractedValue, String formattedValue, boolean z) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
        Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
        this.f10882a = listId;
        this.f10883b = extractedValue;
        this.f10884c = formattedValue;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f10882a, jVar.f10882a) && Intrinsics.f(this.f10883b, jVar.f10883b) && Intrinsics.f(this.f10884c, jVar.f10884c) && this.d == jVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + p.a.c(p.a.c(this.f10882a.hashCode() * 31, 31, this.f10883b), 31, this.f10884c);
    }
}
