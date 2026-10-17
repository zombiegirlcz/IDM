package ms0;

import aw0.a9;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class o2 implements t2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f208351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a9 f208352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f208353c;
    public final mx0.d2 d;

    public o2(List stories, a9 storiesPlaybackStrategy, boolean z, mx0.d2 style) {
        Intrinsics.checkNotNullParameter(stories, "stories");
        Intrinsics.checkNotNullParameter(storiesPlaybackStrategy, "storiesPlaybackStrategy");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f208351a = stories;
        this.f208352b = storiesPlaybackStrategy;
        this.f208353c = z;
        this.d = style;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o2)) {
            return false;
        }
        o2 o2Var = (o2) obj2;
        return Intrinsics.f(this.f208351a, o2Var.f208351a) && this.f208352b == o2Var.f208352b && this.f208353c == o2Var.f208353c && this.d == o2Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + j6.a.c((this.f208352b.hashCode() + (this.f208351a.hashCode() * 31)) * 31, 31, this.f208353c);
    }

    public /* synthetic */ o2(ArrayList arrayList, a9 a9Var, mx0.d2 d2Var, int i) {
        this((List) arrayList, (i & 2) != 0 ? a9.PLAY_ONCE : a9Var, true, (i & 8) != 0 ? mx0.d2.NORMAL : d2Var);
    }
}
