package yu3;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f316869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f316870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f316871c;
    public final String d;
    public final ArrayList e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f316872g;

    public b(String title, String str, String buttonText, String str2, String str3, String str4, ArrayList items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f316869a = title;
        this.f316870b = str;
        this.f316871c = buttonText;
        this.d = str2;
        this.e = items;
        this.f = str3;
        this.f316872g = str4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f316869a, bVar.f316869a) && Intrinsics.f(this.f316870b, bVar.f316870b) && Intrinsics.f(this.f316871c, bVar.f316871c) && Intrinsics.f(this.d, bVar.d) && this.e.equals(bVar.e) && Intrinsics.f(this.f, bVar.f) && Intrinsics.f(this.f316872g, bVar.f316872g);
    }

    public final int hashCode() {
        int iHashCode = this.f316869a.hashCode() * 31;
        String str = this.f316870b;
        int iC = p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f316871c);
        String str2 = this.d;
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.e, (iC + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.f;
        int iHashCode2 = (iB + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f316872g;
        return iHashCode2 + (str4 != null ? str4.hashCode() : 0);
    }
}
