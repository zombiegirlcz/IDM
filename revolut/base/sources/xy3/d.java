package xy3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f309562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f309563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f309564c;

    public d(String title, String primaryButtonText, String secondaryButtonText) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(primaryButtonText, "primaryButtonText");
        Intrinsics.checkNotNullParameter(secondaryButtonText, "secondaryButtonText");
        this.f309562a = title;
        this.f309563b = primaryButtonText;
        this.f309564c = secondaryButtonText;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f309562a, dVar.f309562a) && Intrinsics.f(this.f309563b, dVar.f309563b) && Intrinsics.f(this.f309564c, dVar.f309564c);
    }

    public final int hashCode() {
        return this.f309564c.hashCode() + p.a.c(this.f309562a.hashCode() * 31, 31, this.f309563b);
    }
}
