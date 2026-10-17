package iu3;

import dx4.a1;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class m implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f168487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f168488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a1 f168489c;

    public m(a1 icon, String str, String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f168487a = str;
        this.f168488b = description;
        this.f168489c = icon;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f168487a, mVar.f168487a) && Intrinsics.f(this.f168488b, mVar.f168488b) && this.f168489c == mVar.f168489c;
    }

    public final int hashCode() {
        String str = this.f168487a;
        return this.f168489c.hashCode() + p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f168488b);
    }
}
