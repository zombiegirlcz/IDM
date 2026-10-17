package zmc;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f323453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f323454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f323455c;
    public final Integer d;

    public m(int i, Integer num, String id10, List documents) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(documents, "documents");
        this.f323453a = id10;
        this.f323454b = i;
        this.f323455c = documents;
        this.d = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f323453a, mVar.f323453a) && this.f323454b == mVar.f323454b && Intrinsics.f(this.f323455c, mVar.f323455c) && Intrinsics.f(this.d, mVar.d);
    }

    public final int hashCode() {
        int iD = p.a.d(j6.a.b(this.f323454b, this.f323453a.hashCode() * 31, 31), 31, this.f323455c);
        Integer num = this.d;
        return iD + (num == null ? 0 : num.hashCode());
    }
}
