package jq6;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f177478a;

    public b() {
        this(null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f177478a, ((b) obj2).f177478a);
    }

    public final int hashCode() {
        Data data = this.f177478a;
        if (data == null) {
            return 0;
        }
        return data.hashCode();
    }

    public b(Data data) {
        this.f177478a = data;
    }
}
