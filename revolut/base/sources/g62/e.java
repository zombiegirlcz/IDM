package g62;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a12.c f140817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a12.m f140818b;

    public e(a12.c contactsInfo, a12.m transactionsInfo) {
        Intrinsics.checkNotNullParameter(contactsInfo, "contactsInfo");
        Intrinsics.checkNotNullParameter(transactionsInfo, "transactionsInfo");
        this.f140817a = contactsInfo;
        this.f140818b = transactionsInfo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f140817a, eVar.f140817a) && Intrinsics.f(this.f140818b, eVar.f140818b);
    }

    public final int hashCode() {
        return this.f140818b.hashCode() + (this.f140817a.f468a.hashCode() * 31);
    }
}
