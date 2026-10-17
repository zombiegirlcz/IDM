package ggi;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f143689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f143690b;

    public a(String str, ArrayList sortingOptions) {
        Intrinsics.checkNotNullParameter(sortingOptions, "sortingOptions");
        this.f143689a = str;
        this.f143690b = sortingOptions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f143689a, aVar.f143689a) && this.f143690b.equals(aVar.f143690b);
    }

    public final int hashCode() {
        String str = this.f143689a;
        return this.f143690b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
