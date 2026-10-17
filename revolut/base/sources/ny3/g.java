package ny3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f220634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f220635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f220636c;
    public final String d;

    public g(String title, String description, String primaryButtonTitle, String secondaryButtonTitle) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(primaryButtonTitle, "primaryButtonTitle");
        Intrinsics.checkNotNullParameter(secondaryButtonTitle, "secondaryButtonTitle");
        this.f220634a = title;
        this.f220635b = description;
        this.f220636c = primaryButtonTitle;
        this.d = secondaryButtonTitle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f220634a, gVar.f220634a) && Intrinsics.f(this.f220635b, gVar.f220635b) && Intrinsics.f(this.f220636c, gVar.f220636c) && Intrinsics.f(this.d, gVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f220634a.hashCode() * 31, 31, this.f220635b), 31, this.f220636c);
    }
}
