package jo6;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f176865a;

    public a(ArrayList countries) {
        Intrinsics.checkNotNullParameter(countries, "countries");
        this.f176865a = countries;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f176865a.equals(((a) obj2).f176865a);
    }

    public final int hashCode() {
        return this.f176865a.hashCode();
    }
}
