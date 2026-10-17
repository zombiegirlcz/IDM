package us7;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f282833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f282834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f282835c;

    public d(String str, String str2, ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f282833a = str;
        this.f282834b = str2;
        this.f282835c = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f282833a, dVar.f282833a) && Intrinsics.f(this.f282834b, dVar.f282834b) && this.f282835c.equals(dVar.f282835c);
    }

    public final int hashCode() {
        String str = this.f282833a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f282834b;
        return this.f282835c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
