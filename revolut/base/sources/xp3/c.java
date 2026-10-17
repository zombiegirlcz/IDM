package xp3;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f307885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f307886b;

    public c(d dVar, ArrayList availableOptions) {
        Intrinsics.checkNotNullParameter(availableOptions, "availableOptions");
        this.f307885a = dVar;
        this.f307886b = availableOptions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f307885a == cVar.f307885a && this.f307886b.equals(cVar.f307886b);
    }

    public final int hashCode() {
        d dVar = this.f307885a;
        return this.f307886b.hashCode() + ((dVar == null ? 0 : dVar.hashCode()) * 31);
    }
}
