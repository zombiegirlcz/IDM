package t61;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class i implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f268154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f268155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f268156c;

    public i(String title, String message, String summary) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(summary, "summary");
        this.f268154a = title;
        this.f268155b = message;
        this.f268156c = summary;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f268154a, iVar.f268154a) && Intrinsics.f(this.f268155b, iVar.f268155b) && Intrinsics.f(this.f268156c, iVar.f268156c);
    }

    public final int hashCode() {
        return this.f268156c.hashCode() + p.a.c(this.f268154a.hashCode() * 31, 31, this.f268155b);
    }
}
