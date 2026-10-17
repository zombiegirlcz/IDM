package a7g;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f1873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f1874b;

    public a(TextLocalisedClause title, Integer num) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f1873a = title;
        this.f1874b = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f1873a.equals(aVar.f1873a) && this.f1874b.equals(aVar.f1874b);
    }

    public final int hashCode() {
        return this.f1874b.hashCode() + (this.f1873a.hashCode() * 31);
    }
}
