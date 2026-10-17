package oel;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f224644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f224645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f224646c;

    public j(String title, String str, ArrayList items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f224644a = title;
        this.f224645b = str;
        this.f224646c = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f224644a, jVar.f224644a) && Intrinsics.f(this.f224645b, jVar.f224645b) && this.f224646c.equals(jVar.f224646c);
    }

    public final int hashCode() {
        int iHashCode = this.f224644a.hashCode() * 31;
        String str = this.f224645b;
        return this.f224646c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
