package my8;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f210380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f210381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f210382c;

    public i(String title, String buttonText, a aVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        this.f210380a = title;
        this.f210381b = buttonText;
        this.f210382c = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f210380a, iVar.f210380a) && Intrinsics.f(this.f210381b, iVar.f210381b) && Intrinsics.f(this.f210382c, iVar.f210382c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f210380a.hashCode() * 31, 31, this.f210381b);
        a aVar = this.f210382c;
        return iC + (aVar == null ? 0 : aVar.hashCode());
    }
}
