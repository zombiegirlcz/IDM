package ti7;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f271438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f271439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f271440c;
    public final ArrayList d;
    public final String e;

    public h(i type, String str, ArrayList documentsInfo, ArrayList conditions, String str2) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(documentsInfo, "documentsInfo");
        Intrinsics.checkNotNullParameter(conditions, "conditions");
        this.f271438a = type;
        this.f271439b = str;
        this.f271440c = documentsInfo;
        this.d = conditions;
        this.e = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f271438a == hVar.f271438a && Intrinsics.f(this.f271439b, hVar.f271439b) && this.f271440c.equals(hVar.f271440c) && this.d.equals(hVar.d) && Intrinsics.f(this.e, hVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f271438a.hashCode() * 31;
        String str = this.f271439b;
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, com.google.android.gms.internal.mlkit_vision_face.a.b(this.f271440c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
        String str2 = this.e;
        return iB + (str2 != null ? str2.hashCode() : 0);
    }
}
