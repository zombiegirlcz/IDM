package z6k;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f319778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f319779b;

    public a(Data data, boolean z) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f319778a = data;
        this.f319779b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f319778a, aVar.f319778a) && this.f319779b == aVar.f319779b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f319779b) + (this.f319778a.hashCode() * 31);
    }
}
