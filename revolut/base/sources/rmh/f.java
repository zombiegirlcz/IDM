package rmh;

import com.revolut.data.model.Data;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f255326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f255327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f255328c;
    public final Data d;

    public f(ArrayList screenerCollections, boolean z, e eVar, Data collectionAvatarRefs) {
        Intrinsics.checkNotNullParameter(screenerCollections, "screenerCollections");
        Intrinsics.checkNotNullParameter(collectionAvatarRefs, "collectionAvatarRefs");
        this.f255326a = screenerCollections;
        this.f255327b = z;
        this.f255328c = eVar;
        this.d = collectionAvatarRefs;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f255326a.equals(fVar.f255326a) && this.f255327b == fVar.f255327b && this.f255328c == fVar.f255328c && Intrinsics.f(this.d, fVar.d);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f255326a.hashCode() * 31, 31, this.f255327b);
        e eVar = this.f255328c;
        return this.d.hashCode() + ((iC + (eVar == null ? 0 : eVar.hashCode())) * 31);
    }
}
