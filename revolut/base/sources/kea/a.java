package kea;

import aii.m;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f183059b;

    public a(Data data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f183059b = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f183059b, ((a) obj2).f183059b);
    }

    public final int hashCode() {
        return this.f183059b.hashCode();
    }
}
