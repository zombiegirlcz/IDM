package bjb;

import com.revolut.feature.shared.savings.models.product.SavingsDocument;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SavingsDocument f15590b;

    public a(String title, SavingsDocument document) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(document, "document");
        this.f15589a = title;
        this.f15590b = document;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f15589a, aVar.f15589a) && Intrinsics.f(this.f15590b, aVar.f15590b);
    }

    public final int hashCode() {
        return this.f15590b.hashCode() + (this.f15589a.hashCode() * 31);
    }
}
