package hfg;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f151844a;

    public h(ArrayList availability) {
        Intrinsics.checkNotNullParameter(availability, "availability");
        this.f151844a = availability;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && this.f151844a.equals(((h) obj2).f151844a);
    }

    public final int hashCode() {
        return this.f151844a.hashCode();
    }
}
