package xka;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aka.a f306644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f306645b;

    public q(aka.a productArticle, Clause clause) {
        Intrinsics.checkNotNullParameter(productArticle, "productArticle");
        this.f306644a = productArticle;
        this.f306645b = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f306644a, qVar.f306644a) && Intrinsics.f(this.f306645b, qVar.f306645b);
    }

    public final int hashCode() {
        int iHashCode = this.f306644a.hashCode() * 31;
        Clause clause = this.f306645b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
