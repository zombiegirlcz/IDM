package xu3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class k0 implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f308914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f308915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f308916c;
    public final ArrayList d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c0 f308917g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h0 f308918h;

    public k0(String title, String description, String str, ArrayList sections, String primaryButtonTitle, String secondaryButtonTitle, c0 emptyState, h0 h0Var) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(sections, "sections");
        Intrinsics.checkNotNullParameter(primaryButtonTitle, "primaryButtonTitle");
        Intrinsics.checkNotNullParameter(secondaryButtonTitle, "secondaryButtonTitle");
        Intrinsics.checkNotNullParameter(emptyState, "emptyState");
        this.f308914a = title;
        this.f308915b = description;
        this.f308916c = str;
        this.d = sections;
        this.e = primaryButtonTitle;
        this.f = secondaryButtonTitle;
        this.f308917g = emptyState;
        this.f308918h = h0Var;
    }

    @Override // xu3.m0
    public final List W4() {
        ArrayList arrayList = this.d;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(((j0) it8.next()).f308913b);
        }
        return arrayList2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj2;
        return Intrinsics.f(this.f308914a, k0Var.f308914a) && Intrinsics.f(this.f308915b, k0Var.f308915b) && Intrinsics.f(this.f308916c, k0Var.f308916c) && this.d.equals(k0Var.d) && Intrinsics.f(this.e, k0Var.e) && Intrinsics.f(this.f, k0Var.f) && this.f308917g.equals(k0Var.f308917g) && Intrinsics.f(this.f308918h, k0Var.f308918h);
    }

    @Override // xu3.m0
    public final h0 f7() {
        return this.f308918h;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f308914a.hashCode() * 31, 31, this.f308915b);
        String str = this.f308916c;
        int iHashCode = (this.f308917g.hashCode() + p.a.c(p.a.c(com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, (iC + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.e), 31, this.f)) * 31;
        h0 h0Var = this.f308918h;
        return iHashCode + (h0Var != null ? h0Var.hashCode() : 0);
    }

    @Override // xu3.m0
    public final i0 q1() {
        return null;
    }
}
