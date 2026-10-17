package btk;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f18627a;

    public d(Data data) {
        this.f18627a = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f18627a, ((d) obj2).f18627a);
    }

    public final int hashCode() {
        Data data = this.f18627a;
        if (data == null) {
            return 0;
        }
        return data.hashCode();
    }
}
