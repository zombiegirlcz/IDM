package p78;

import io3.d;
import kotlin.jvm.internal.Intrinsics;
import sf8.m;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f233572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f233573b;

    public b(d pocket, m accountInfo) {
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        Intrinsics.checkNotNullParameter(accountInfo, "accountInfo");
        this.f233572a = pocket;
        this.f233573b = accountInfo;
    }

    @Override // p78.c
    public final m a() {
        return this.f233573b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f233572a, bVar.f233572a) && Intrinsics.f(this.f233573b, bVar.f233573b);
    }

    public final int hashCode() {
        return this.f233573b.hashCode() + (this.f233572a.hashCode() * 31);
    }
}
