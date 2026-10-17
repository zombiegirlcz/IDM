package oel;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class h implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f224638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f224639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f224640c;

    public h(String title, String str, ArrayList items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f224638a = title;
        this.f224639b = str;
        this.f224640c = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f224638a, hVar.f224638a) && Intrinsics.f(this.f224639b, hVar.f224639b) && this.f224640c.equals(hVar.f224640c);
    }

    public final int hashCode() {
        int iHashCode = this.f224638a.hashCode() * 31;
        String str = this.f224639b;
        return this.f224640c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
