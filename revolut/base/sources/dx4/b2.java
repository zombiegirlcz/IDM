package dx4;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b2 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f120554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f120555c;
    public final ArrayList d;
    public final String e;

    public b2(String title, String str, String str2, String str3, ArrayList items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f120553a = title;
        this.f120554b = str;
        this.f120555c = str2;
        this.d = items;
        this.e = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b2)) {
            return false;
        }
        b2 b2Var = (b2) obj2;
        return Intrinsics.f(this.f120553a, b2Var.f120553a) && Intrinsics.f(this.f120554b, b2Var.f120554b) && Intrinsics.f(this.f120555c, b2Var.f120555c) && this.d.equals(b2Var.d) && Intrinsics.f(this.e, b2Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.f120553a.hashCode() * 31;
        String str = this.f120554b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f120555c;
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.e;
        return iB + (str3 != null ? str3.hashCode() : 0);
    }
}
