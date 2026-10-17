package d3g;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class o implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f111128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f111129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f111130c;

    public o(TextLocalisedClause toolbarTitle, ArrayList items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
        this.f111128a = items;
        this.f111129b = toolbarTitle;
        this.f111130c = z;
    }

    @Override // jki.n
    public final List c() {
        return this.f111128a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return this.f111128a.equals(oVar.f111128a) && this.f111129b.equals(oVar.f111129b) && this.f111130c == oVar.f111130c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f111130c) + t61.a.a(this.f111128a.hashCode() * 31, 31, this.f111129b);
    }
}
