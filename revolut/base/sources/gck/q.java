package gck;

import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class q extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f142509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f142510b;

    public q(Clause title, List documents) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(documents, "documents");
        this.f142509a = title;
        this.f142510b = documents;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f142509a, qVar.f142509a) && Intrinsics.f(this.f142510b, qVar.f142510b);
    }

    public final int hashCode() {
        return this.f142510b.hashCode() + (this.f142509a.hashCode() * 31);
    }
}
