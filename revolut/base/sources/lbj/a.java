package lbj;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f193688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f193689b;

    public a(ArrayList individual, ArrayList company) {
        Intrinsics.checkNotNullParameter(individual, "individual");
        Intrinsics.checkNotNullParameter(company, "company");
        this.f193688a = individual;
        this.f193689b = company;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f193688a.equals(aVar.f193688a) && this.f193689b.equals(aVar.f193689b);
    }

    public final int hashCode() {
        return this.f193689b.hashCode() + (this.f193688a.hashCode() * 31);
    }
}
