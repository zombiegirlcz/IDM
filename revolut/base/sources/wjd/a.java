package wjd;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f298036a;

    public a(Data type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f298036a = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f298036a, ((a) obj2).f298036a);
    }

    public final int hashCode() {
        return this.f298036a.hashCode();
    }
}
