package e4f;

import a0.d;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f122538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f122539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f122540c;

    public a(long j2, ArrayList transactions, boolean z) {
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        this.f122538a = transactions;
        this.f122539b = j2;
        this.f122540c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f122538a.equals(aVar.f122538a) && this.f122539b == aVar.f122539b && this.f122540c == aVar.f122540c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f122540c) + d.c(this.f122538a.hashCode() * 31, 31, this.f122539b);
    }
}
