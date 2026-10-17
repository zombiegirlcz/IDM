package m05;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes22.dex */
@mlm.g
public final class m {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f201067c = {null, yhm.j.c(yhm.k.PUBLICATION, new d(2))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f201068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f201069b;

    public /* synthetic */ m(int i, String str, List list) {
        if (3 != (i & 3)) {
            j1.f(k.f201066a.getDescriptor(), i, 3);
            throw null;
        }
        this.f201068a = str;
        this.f201069b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f201068a, mVar.f201068a) && Intrinsics.f(this.f201069b, mVar.f201069b);
    }

    public final int hashCode() {
        return this.f201069b.hashCode() + (this.f201068a.hashCode() * 31);
    }

    public m(String snapshotDate, ArrayList insights) {
        Intrinsics.checkNotNullParameter(snapshotDate, "snapshotDate");
        Intrinsics.checkNotNullParameter(insights, "insights");
        this.f201068a = snapshotDate;
        this.f201069b = insights;
    }
}
