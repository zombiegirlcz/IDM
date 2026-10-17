package gi4;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class k implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f144085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f144086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f144087c;

    public k(TextLocalisedClause title, TextLocalisedClause secondDescription, ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(secondDescription, "secondDescription");
        this.f144085a = items;
        this.f144086b = title;
        this.f144087c = secondDescription;
    }

    @Override // cli.p
    public final List c() {
        return this.f144085a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f144085a.equals(kVar.f144085a) && this.f144086b.equals(kVar.f144086b) && this.f144087c.equals(kVar.f144087c);
    }

    public final int hashCode() {
        return this.f144087c.hashCode() + t61.a.a(this.f144085a.hashCode() * 31, 31, this.f144086b);
    }
}
