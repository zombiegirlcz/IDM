package iu3;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class s implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f168503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f168504b;

    public s(String title, ArrayList items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f168503a = title;
        this.f168504b = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f168503a, sVar.f168503a) && this.f168504b.equals(sVar.f168504b);
    }

    public final int hashCode() {
        return this.f168504b.hashCode() + (this.f168503a.hashCode() * 31);
    }
}
