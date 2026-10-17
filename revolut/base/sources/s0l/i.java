package s0l;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class i implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f258985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f258986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f258987c;
    public final ArrayList d;

    public i(TextLocalisedClause navBarTitle, TextLocalisedClause navBarDescription, f nextButtonState, ArrayList items) {
        Intrinsics.checkNotNullParameter(navBarTitle, "navBarTitle");
        Intrinsics.checkNotNullParameter(navBarDescription, "navBarDescription");
        Intrinsics.checkNotNullParameter(nextButtonState, "nextButtonState");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f258985a = navBarTitle;
        this.f258986b = navBarDescription;
        this.f258987c = nextButtonState;
        this.d = items;
    }

    @Override // jki.n
    public final List c() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f258985a.equals(iVar.f258985a) && this.f258986b.equals(iVar.f258986b) && this.f258987c.equals(iVar.f258987c) && this.d.equals(iVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f258987c.hashCode() + t61.a.a(this.f258985a.hashCode() * 31, 31, this.f258986b)) * 31);
    }
}
