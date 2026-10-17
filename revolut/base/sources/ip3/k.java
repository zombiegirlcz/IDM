package ip3;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class k implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f167635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f167636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f167637c;
    public final ArrayList d;

    public k(TextLocalisedClause toolbarTitle, TextLocalisedClause buttonTitle, ArrayList items, boolean z) {
        Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f167635a = toolbarTitle;
        this.f167636b = buttonTitle;
        this.f167637c = z;
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
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f167635a.equals(kVar.f167635a) && this.f167636b.equals(kVar.f167636b) && this.f167637c == kVar.f167637c && this.d.equals(kVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + j6.a.c(t61.a.a(this.f167635a.hashCode() * 31, 31, this.f167636b), 31, this.f167637c);
    }
}
