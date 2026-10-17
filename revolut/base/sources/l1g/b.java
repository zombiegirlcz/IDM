package l1g;

import com.revolut.data.model.Data;
import jki.i;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f191532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f191533b;

    public b(Data experience, c type) {
        Intrinsics.checkNotNullParameter(experience, "experience");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f191532a = experience;
        this.f191533b = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f191532a, bVar.f191532a) && this.f191533b == bVar.f191533b;
    }

    public final int hashCode() {
        return this.f191533b.hashCode() + (this.f191532a.hashCode() * 31);
    }
}
