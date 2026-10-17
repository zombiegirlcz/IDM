package ood;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements cli.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f227048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f227049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f227050c;
    public final cr0.g d;

    public j(List items, String str, f fVar, cr0.g gVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f227048a = items;
        this.f227049b = str;
        this.f227050c = fVar;
        this.d = gVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f227048a, jVar.f227048a) && Intrinsics.f(this.f227049b, jVar.f227049b) && Intrinsics.f(this.f227050c, jVar.f227050c) && Intrinsics.f(this.d, jVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f227048a.hashCode() * 31;
        String str = this.f227049b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        f fVar = this.f227050c;
        int iHashCode3 = (iHashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        cr0.g gVar = this.d;
        return iHashCode3 + (gVar != null ? gVar.hashCode() : 0);
    }
}
