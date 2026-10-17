package lld;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f196715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f196716b;

    public h(Data checklist, boolean z) {
        Intrinsics.checkNotNullParameter(checklist, "checklist");
        this.f196715a = checklist;
        this.f196716b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f196715a, hVar.f196715a) && this.f196716b == hVar.f196716b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f196716b) + (this.f196715a.hashCode() * 31);
    }
}
