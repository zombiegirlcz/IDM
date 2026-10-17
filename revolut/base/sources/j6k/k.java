package j6k;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class k extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f171813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f171814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f171815c;

    public k(String moneyRequestId, String str, Set userIds) {
        Intrinsics.checkNotNullParameter(userIds, "userIds");
        Intrinsics.checkNotNullParameter(moneyRequestId, "moneyRequestId");
        this.f171813a = userIds;
        this.f171814b = moneyRequestId;
        this.f171815c = str;
    }

    public final String a() {
        return this.f171814b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f171813a, kVar.f171813a) && Intrinsics.f(this.f171814b, kVar.f171814b) && Intrinsics.f(this.f171815c, kVar.f171815c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f171813a.hashCode() * 31, 31, this.f171814b);
        String str = this.f171815c;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
