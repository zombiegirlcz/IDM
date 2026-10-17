package xu3;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class l0 implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f308922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f308923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f308924c;
    public final b0 d;
    public final ArrayList e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h0 f308925g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i0 f308926h;

    public l0(String title, String description, String str, b0 addEvidenceItem, ArrayList evidenceTypes, String primaryButtonTitle, h0 h0Var, i0 i0Var) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(addEvidenceItem, "addEvidenceItem");
        Intrinsics.checkNotNullParameter(evidenceTypes, "evidenceTypes");
        Intrinsics.checkNotNullParameter(primaryButtonTitle, "primaryButtonTitle");
        this.f308922a = title;
        this.f308923b = description;
        this.f308924c = str;
        this.d = addEvidenceItem;
        this.e = evidenceTypes;
        this.f = primaryButtonTitle;
        this.f308925g = h0Var;
        this.f308926h = i0Var;
    }

    @Override // xu3.m0
    public final List W4() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj2;
        return Intrinsics.f(this.f308922a, l0Var.f308922a) && Intrinsics.f(this.f308923b, l0Var.f308923b) && Intrinsics.f(this.f308924c, l0Var.f308924c) && this.d.equals(l0Var.d) && this.e.equals(l0Var.e) && Intrinsics.f(this.f, l0Var.f) && Intrinsics.f(this.f308925g, l0Var.f308925g) && Intrinsics.f(this.f308926h, l0Var.f308926h);
    }

    @Override // xu3.m0
    public final h0 f7() {
        return this.f308925g;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f308922a.hashCode() * 31, 31, this.f308923b);
        String str = this.f308924c;
        int iC2 = p.a.c(com.google.android.gms.internal.mlkit_vision_face.a.b(this.e, (this.d.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31), 31, this.f);
        h0 h0Var = this.f308925g;
        int iHashCode = (iC2 + (h0Var == null ? 0 : h0Var.hashCode())) * 31;
        i0 i0Var = this.f308926h;
        return iHashCode + (i0Var != null ? i0Var.hashCode() : 0);
    }

    @Override // xu3.m0
    public final i0 q1() {
        return this.f308926h;
    }
}
