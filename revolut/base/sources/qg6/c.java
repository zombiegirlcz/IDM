package qg6;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f245658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f245659b;

    public c(String title, List companies) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(companies, "companies");
        this.f245658a = title;
        this.f245659b = companies;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f245658a, cVar.f245658a) && Intrinsics.f(this.f245659b, cVar.f245659b);
    }

    public final int hashCode() {
        return this.f245659b.hashCode() + (this.f245658a.hashCode() * 31);
    }
}
