package yx4;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qv0.p;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements koi.j, p {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f317544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f317545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f317546c;

    public b(String listId, Object obj2, Object obj3) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        this.f317544a = listId;
        this.f317545b = obj2;
        this.f317546c = obj3;
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getP() {
        return this.f317545b;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF52580a() {
        return this.f317544a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f317544a, bVar.f317544a) && Intrinsics.f(this.f317545b, bVar.f317545b) && Intrinsics.f(this.f317546c, bVar.f317546c);
    }

    public final int hashCode() {
        int iHashCode = this.f317544a.hashCode() * 31;
        Object obj2 = this.f317545b;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.f317546c;
        return iHashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }
}
