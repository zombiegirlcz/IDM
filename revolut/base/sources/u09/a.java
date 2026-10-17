package u09;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f276094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f276095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f276096c;
    public final String d;

    public a(String header, String str, String str2, ArrayList description) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f276094a = header;
        this.f276095b = description;
        this.f276096c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f276094a, aVar.f276094a) && this.f276095b.equals(aVar.f276095b) && Intrinsics.f(this.f276096c, aVar.f276096c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f276095b, this.f276094a.hashCode() * 31, 31);
        String str = this.f276096c;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
