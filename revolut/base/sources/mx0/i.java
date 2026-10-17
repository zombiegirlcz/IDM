package mx0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f209744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f209745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f209746c;

    public i(String listId, int i, boolean z) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        this.f209744a = listId;
        this.f209745b = i;
        this.f209746c = z;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF98597a() {
        return this.f209744a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f209744a, iVar.f209744a) && this.f209745b == iVar.f209745b && this.f209746c == iVar.f209746c;
    }

    @Override // mx0.j
    public final int getType() {
        return this.f209745b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f209746c) + j6.a.b(this.f209745b, this.f209744a.hashCode() * 31, 31);
    }
}
