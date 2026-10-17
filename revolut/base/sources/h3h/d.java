package h3h;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f149126a;

    public d() {
        this(null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f149126a, ((d) obj2).f149126a);
    }

    public final int hashCode() {
        Data data = this.f149126a;
        if (data == null) {
            return 0;
        }
        return data.hashCode();
    }

    public d(Data data) {
        this.f149126a = data;
    }
}
