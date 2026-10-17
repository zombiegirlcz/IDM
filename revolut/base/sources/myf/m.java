package myf;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f210482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f210483b;

    public m(u type, ArrayList days) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(days, "days");
        this.f210482a = type;
        this.f210483b = days;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f210482a == mVar.f210482a && this.f210483b.equals(mVar.f210483b);
    }

    public final int hashCode() {
        return this.f210483b.hashCode() + (this.f210482a.hashCode() * 31);
    }
}
