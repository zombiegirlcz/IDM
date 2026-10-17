package my3;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f210303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f210304b;

    public c(String title, ArrayList debtTypes) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(debtTypes, "debtTypes");
        this.f210303a = title;
        this.f210304b = debtTypes;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f210303a, cVar.f210303a) && this.f210304b.equals(cVar.f210304b);
    }

    public final int hashCode() {
        return this.f210304b.hashCode() + (this.f210303a.hashCode() * 31);
    }
}
