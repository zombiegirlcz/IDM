package w30;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f294081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f294082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f294083c;

    public f(String key, String text, String iconName) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(iconName, "iconName");
        this.f294081a = key;
        this.f294082b = text;
        this.f294083c = iconName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f294081a, fVar.f294081a) && Intrinsics.f(this.f294082b, fVar.f294082b) && Intrinsics.f(this.f294083c, fVar.f294083c);
    }

    public final int hashCode() {
        return this.f294083c.hashCode() + p.a.c(this.f294081a.hashCode() * 31, 31, this.f294082b);
    }
}
