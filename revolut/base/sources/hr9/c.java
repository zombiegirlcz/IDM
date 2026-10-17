package hr9;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import oq9.e;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f154794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f154795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f154796c;

    public c(a type, e eVar, ArrayList settleMembers) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(settleMembers, "settleMembers");
        this.f154794a = type;
        this.f154795b = eVar;
        this.f154796c = settleMembers;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f154794a == cVar.f154794a && Intrinsics.f(this.f154795b, cVar.f154795b) && this.f154796c.equals(cVar.f154796c);
    }

    public final int hashCode() {
        int iHashCode = this.f154794a.hashCode() * 31;
        e eVar = this.f154795b;
        return this.f154796c.hashCode() + ((iHashCode + (eVar == null ? 0 : eVar.hashCode())) * 31);
    }
}
