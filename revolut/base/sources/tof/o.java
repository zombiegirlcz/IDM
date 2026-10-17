package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class o implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f272956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f272957c;

    public o(String title, String description, String actionTitle) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(actionTitle, "actionTitle");
        this.f272955a = title;
        this.f272956b = description;
        this.f272957c = actionTitle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f272955a, oVar.f272955a) && Intrinsics.f(this.f272956b, oVar.f272956b) && Intrinsics.f(this.f272957c, oVar.f272957c);
    }

    public final int hashCode() {
        return this.f272957c.hashCode() + p.a.c(this.f272955a.hashCode() * 31, 31, this.f272956b);
    }
}
