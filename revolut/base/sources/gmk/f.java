package gmk;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f144878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f144879b;

    public f(g savingsType, Data accounts) {
        Intrinsics.checkNotNullParameter(savingsType, "savingsType");
        Intrinsics.checkNotNullParameter(accounts, "accounts");
        this.f144878a = savingsType;
        this.f144879b = accounts;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f144878a == fVar.f144878a && Intrinsics.f(this.f144879b, fVar.f144879b);
    }

    public final int hashCode() {
        return this.f144879b.hashCode() + (this.f144878a.hashCode() * 31);
    }
}
