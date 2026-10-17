package fki;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f135844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f135845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f135846c;

    public c(List steps, String str, boolean z) {
        Intrinsics.checkNotNullParameter(steps, "steps");
        this.f135844a = steps;
        this.f135845b = str;
        this.f135846c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f135844a, cVar.f135844a) && Intrinsics.f(this.f135845b, cVar.f135845b) && this.f135846c == cVar.f135846c;
    }

    public final int hashCode() {
        int iHashCode = this.f135844a.hashCode() * 31;
        String str = this.f135845b;
        return Boolean.hashCode(this.f135846c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
