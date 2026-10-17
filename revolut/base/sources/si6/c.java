package si6;

import aim.e;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f263523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f263524b;

    public c(e items, TextLocalisedClause title) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f263523a = title;
        this.f263524b = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f263523a.equals(cVar.f263523a) && Intrinsics.f(this.f263524b, cVar.f263524b);
    }

    public final int hashCode() {
        return this.f263524b.hashCode() + (this.f263523a.hashCode() * 31);
    }
}
