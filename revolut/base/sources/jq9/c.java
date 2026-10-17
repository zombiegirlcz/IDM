package jq9;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateTime f177497a;

    public c(DateTime date) {
        Intrinsics.checkNotNullParameter(date, "date");
        this.f177497a = date;
    }

    @Override // jq9.b
    public final long a() {
        return this.f177497a.getMillis();
    }

    @Override // jq9.b
    public final boolean b(String userCode) {
        Intrinsics.checkNotNullParameter(userCode, "userCode");
        return false;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f177497a, ((c) obj2).f177497a);
    }

    public final int hashCode() {
        return this.f177497a.hashCode();
    }
}
