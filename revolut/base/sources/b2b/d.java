package b2b;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f11935a;

    public d(Data data) {
        this.f11935a = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f11935a, ((d) obj2).f11935a);
    }

    public final int hashCode() {
        Data data = this.f11935a;
        if (data == null) {
            return 0;
        }
        return data.hashCode();
    }
}
