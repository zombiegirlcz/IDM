package s4b;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f259805a;

    public d(Data data) {
        this.f259805a = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f259805a, ((d) obj2).f259805a);
    }

    public final int hashCode() {
        Data data = this.f259805a;
        if (data == null) {
            return 0;
        }
        return data.hashCode();
    }
}
