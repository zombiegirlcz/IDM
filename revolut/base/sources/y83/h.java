package y83;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f311626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f311627b;

    public h(Clause headerTitle, ArrayList items) {
        Intrinsics.checkNotNullParameter(headerTitle, "headerTitle");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f311626a = headerTitle;
        this.f311627b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f311627b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f311626a.equals(hVar.f311626a) && this.f311627b.equals(hVar.f311627b);
    }

    public final int hashCode() {
        return this.f311627b.hashCode() + (this.f311626a.hashCode() * 31);
    }
}
