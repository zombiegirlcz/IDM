package pi5;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f236422a;

    public c(Data data) {
        this.f236422a = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f236422a, ((c) obj2).f236422a);
    }

    public final int hashCode() {
        Data data = this.f236422a;
        if (data == null) {
            return 0;
        }
        return data.hashCode();
    }
}
