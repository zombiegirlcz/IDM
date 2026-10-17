package jq9;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateTime f177502a;

    public h(DateTime date) {
        Intrinsics.checkNotNullParameter(date, "date");
        this.f177502a = date;
    }

    @Override // jq9.b
    public final long a() {
        return this.f177502a.getMillis();
    }

    @Override // jq9.b
    public final boolean b(String userCode) {
        Intrinsics.checkNotNullParameter(userCode, "userCode");
        return true;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f177502a, ((h) obj2).f177502a);
    }

    public final int hashCode() {
        return this.f177502a.hashCode();
    }
}
