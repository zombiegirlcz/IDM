package wt7;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f299827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f299828b;

    public f() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f299827a, fVar.f299827a) && Intrinsics.f(this.f299828b, fVar.f299828b);
    }

    public final int hashCode() {
        int iHashCode = this.f299827a.hashCode() * 31;
        String str = this.f299828b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public f(Data documents, String str) {
        Intrinsics.checkNotNullParameter(documents, "documents");
        this.f299827a = documents;
        this.f299828b = str;
    }

    public /* synthetic */ f(int i) {
        this(new Data(null, null, true, 3, null), null);
    }
}
