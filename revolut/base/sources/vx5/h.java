package vx5;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f292817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f292818b;

    public h(String query, ArrayList currencies) {
        Intrinsics.checkNotNullParameter(currencies, "currencies");
        Intrinsics.checkNotNullParameter(query, "query");
        this.f292817a = currencies;
        this.f292818b = query;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f292817a.equals(hVar.f292817a) && Intrinsics.f(this.f292818b, hVar.f292818b);
    }

    public final int hashCode() {
        return this.f292818b.hashCode() + (this.f292817a.hashCode() * 31);
    }
}
