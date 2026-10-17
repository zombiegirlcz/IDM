package fr2;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f137383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f137384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f137385c;

    public g(String title, String str, ArrayList steps) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(steps, "steps");
        this.f137383a = title;
        this.f137384b = str;
        this.f137385c = steps;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f137383a, gVar.f137383a) && Intrinsics.f(this.f137384b, gVar.f137384b) && this.f137385c.equals(gVar.f137385c);
    }

    public final int hashCode() {
        int iHashCode = this.f137383a.hashCode() * 31;
        String str = this.f137384b;
        return this.f137385c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
