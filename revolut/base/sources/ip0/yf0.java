package ip0;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class yf0 implements ag0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f167309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aw0.x6 f167310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aw0.u6 f167311c;

    public yf0(ArrayList chartItems, aw0.x6 chartColorScheme, aw0.u6 u6Var) {
        Intrinsics.checkNotNullParameter(chartItems, "chartItems");
        Intrinsics.checkNotNullParameter(chartColorScheme, "chartColorScheme");
        this.f167309a = chartItems;
        this.f167310b = chartColorScheme;
        this.f167311c = u6Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof yf0)) {
            return false;
        }
        yf0 yf0Var = (yf0) obj2;
        return this.f167309a.equals(yf0Var.f167309a) && this.f167310b.equals(yf0Var.f167310b) && Intrinsics.f(this.f167311c, yf0Var.f167311c);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f167309a.hashCode() * 31, 31, this.f167310b.f10606a);
        aw0.u6 u6Var = this.f167311c;
        return iD + (u6Var == null ? 0 : u6Var.hashCode());
    }
}
