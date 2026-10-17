package l15;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f191452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f191453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f191454c;

    public a(String title, String description, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f191452a = title;
        this.f191453b = description;
        this.f191454c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f191452a, aVar.f191452a) && Intrinsics.f(this.f191453b, aVar.f191453b) && Intrinsics.f(this.f191454c, aVar.f191454c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f191452a.hashCode() * 31, 31, this.f191453b);
        String str = this.f191454c;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
