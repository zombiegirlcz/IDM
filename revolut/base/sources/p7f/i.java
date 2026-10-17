package p7f;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class i implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f233762a;

    public i(Data data) {
        this.f233762a = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f233762a, ((i) obj2).f233762a);
    }

    public final int hashCode() {
        Data data = this.f233762a;
        if (data == null) {
            return 0;
        }
        return data.hashCode();
    }
}
