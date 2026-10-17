package wrb;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f299536a;

    public c(Data data) {
        this.f299536a = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f299536a, ((c) obj2).f299536a);
    }

    public final int hashCode() {
        Data data = this.f299536a;
        if (data == null) {
            return 0;
        }
        return data.hashCode();
    }
}
