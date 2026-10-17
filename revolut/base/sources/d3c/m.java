package d3c;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f111044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f111045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f111046c;
    public final String d;
    public final String e;
    public final ArrayList f;

    public m(a0 serviceProvider, o state, long j2, String str, String str2, ArrayList items) {
        Intrinsics.checkNotNullParameter(serviceProvider, "serviceProvider");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f111044a = serviceProvider;
        this.f111045b = state;
        this.f111046c = j2;
        this.d = str;
        this.e = str2;
        this.f = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f111044a == mVar.f111044a && this.f111045b == mVar.f111045b && this.f111046c == mVar.f111046c && Intrinsics.f(this.d, mVar.d) && Intrinsics.f(this.e, mVar.e) && this.f.equals(mVar.f);
    }

    public final int hashCode() {
        int iC = a0.d.c((this.f111045b.hashCode() + (this.f111044a.hashCode() * 31)) * 31, 31, this.f111046c);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return this.f.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
