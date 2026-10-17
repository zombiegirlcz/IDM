package tof;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes8.dex */
public final class v8 extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateTime f273118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f273119b;

    public v8(DateTime createdDate, boolean z) {
        Intrinsics.checkNotNullParameter(createdDate, "createdDate");
        this.f273118a = createdDate;
        this.f273119b = z;
    }

    public final DateTime a() {
        return this.f273118a;
    }

    public final boolean b() {
        return this.f273119b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v8)) {
            return false;
        }
        v8 v8Var = (v8) obj2;
        return Intrinsics.f(this.f273118a, v8Var.f273118a) && this.f273119b == v8Var.f273119b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f273119b) + (this.f273118a.hashCode() * 31);
    }
}
