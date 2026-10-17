package yna;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;
import yna.a;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends a.AbstractC1757a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f315302a;

    public b(Data data) {
        this.f315302a = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f315302a, ((b) obj2).f315302a);
    }

    public final int hashCode() {
        Data data = this.f315302a;
        if (data == null) {
            return 0;
        }
        return data.hashCode();
    }
}
