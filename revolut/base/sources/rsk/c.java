package rsk;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f257101a;

    public c(Data data) {
        this.f257101a = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f257101a, ((c) obj2).f257101a);
    }

    public final int hashCode() {
        Data data = this.f257101a;
        if (data == null) {
            return 0;
        }
        return data.hashCode();
    }
}
