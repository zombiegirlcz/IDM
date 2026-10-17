package pwg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f240471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f240472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f240473c;
    public final o d;
    public final String e;

    public m(String key, String title, String str, o type, String icon) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f240471a = key;
        this.f240472b = title;
        this.f240473c = str;
        this.d = type;
        this.e = icon;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f240471a, mVar.f240471a) && Intrinsics.f(this.f240472b, mVar.f240472b) && Intrinsics.f(this.f240473c, mVar.f240473c) && this.d == mVar.d && Intrinsics.f(this.e, mVar.e);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f240471a.hashCode() * 31, 31, this.f240472b);
        String str = this.f240473c;
        return this.e.hashCode() + ((this.d.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }
}
