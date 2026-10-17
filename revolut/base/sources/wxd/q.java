package wxd;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f300877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f300878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f300879c;
    public final i d;

    public q(String id10, String str, ArrayList items, i iVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f300877a = id10;
        this.f300878b = str;
        this.f300879c = items;
        this.d = iVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return this.f300877a.equals(qVar.f300877a) && Intrinsics.f(this.f300878b, qVar.f300878b) && this.f300879c.equals(qVar.f300879c) && Intrinsics.f(this.d, qVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f300877a.hashCode() * 31;
        String str = this.f300878b;
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f300879c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        i iVar = this.d;
        return iB + (iVar != null ? iVar.hashCode() : 0);
    }
}
