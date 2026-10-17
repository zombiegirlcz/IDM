package ny3;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f220637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f220638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f220639c;
    public final k d;

    public h(o summary, ArrayList documents, g gVar, k successPopup) {
        Intrinsics.checkNotNullParameter(summary, "summary");
        Intrinsics.checkNotNullParameter(documents, "documents");
        Intrinsics.checkNotNullParameter(successPopup, "successPopup");
        this.f220637a = summary;
        this.f220638b = documents;
        this.f220639c = gVar;
        this.d = successPopup;
    }

    @Override // ny3.p
    public final k F3() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f220637a.equals(hVar.f220637a) && this.f220638b.equals(hVar.f220638b) && Intrinsics.f(this.f220639c, hVar.f220639c) && this.d.equals(hVar.d);
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f220638b, this.f220637a.hashCode() * 31, 31);
        g gVar = this.f220639c;
        return this.d.hashCode() + ((iB + (gVar == null ? 0 : gVar.hashCode())) * 31);
    }

    @Override // ny3.p
    public final g l6() {
        return this.f220639c;
    }
}
