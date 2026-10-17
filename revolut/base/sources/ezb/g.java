package ezb;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f130923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f130924b;

    public g() {
        this(0);
    }

    public static g a(g gVar, i selectedTab, Data challengesBreakdown, int i) {
        if ((i & 1) != 0) {
            selectedTab = gVar.f130923a;
        }
        if ((i & 2) != 0) {
            challengesBreakdown = gVar.f130924b;
        }
        gVar.getClass();
        Intrinsics.checkNotNullParameter(selectedTab, "selectedTab");
        Intrinsics.checkNotNullParameter(challengesBreakdown, "challengesBreakdown");
        return new g(selectedTab, challengesBreakdown);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f130923a == gVar.f130923a && Intrinsics.f(this.f130924b, gVar.f130924b);
    }

    public final int hashCode() {
        return this.f130924b.hashCode() + (this.f130923a.hashCode() * 31);
    }

    public g(i selectedTab, Data challengesBreakdown) {
        Intrinsics.checkNotNullParameter(selectedTab, "selectedTab");
        Intrinsics.checkNotNullParameter(challengesBreakdown, "challengesBreakdown");
        this.f130923a = selectedTab;
        this.f130924b = challengesBreakdown;
    }

    public /* synthetic */ g(int i) {
        this(i.ACTIVE, new Data(null, null, true, 3, null));
    }
}
