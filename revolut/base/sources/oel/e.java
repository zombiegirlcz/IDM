package oel;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f224630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f224631b;

    public e(String title, ArrayList items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f224630a = title;
        this.f224631b = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f224630a, eVar.f224630a) && this.f224631b.equals(eVar.f224631b);
    }

    public final int hashCode() {
        return this.f224631b.hashCode() + (this.f224630a.hashCode() * 31);
    }
}
