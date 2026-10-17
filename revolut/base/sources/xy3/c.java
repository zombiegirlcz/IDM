package xy3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f309559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f309560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f309561c;

    public c(String title, String secondDescription, String primaryButtonText) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(secondDescription, "secondDescription");
        Intrinsics.checkNotNullParameter(primaryButtonText, "primaryButtonText");
        this.f309559a = title;
        this.f309560b = secondDescription;
        this.f309561c = primaryButtonText;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f309559a, cVar.f309559a) && Intrinsics.f(this.f309560b, cVar.f309560b) && Intrinsics.f(this.f309561c, cVar.f309561c);
    }

    public final int hashCode() {
        return this.f309561c.hashCode() + p.a.c(this.f309559a.hashCode() * 31, 31, this.f309560b);
    }
}
