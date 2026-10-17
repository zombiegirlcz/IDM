package q35;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f241823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f241824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f241825c;
    public final fx4.c d;
    public final String e;

    public h0(String repaymentToken, String title, ArrayList items, fx4.c footer, String str) {
        Intrinsics.checkNotNullParameter(repaymentToken, "repaymentToken");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(footer, "footer");
        this.f241823a = repaymentToken;
        this.f241824b = title;
        this.f241825c = items;
        this.d = footer;
        this.e = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj2;
        return Intrinsics.f(this.f241823a, h0Var.f241823a) && Intrinsics.f(this.f241824b, h0Var.f241824b) && this.f241825c.equals(h0Var.f241825c) && this.d.equals(h0Var.d) && Intrinsics.f(this.e, h0Var.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f241825c, p.a.c(this.f241823a.hashCode() * 31, 31, this.f241824b), 31)) * 31;
        String str = this.e;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
