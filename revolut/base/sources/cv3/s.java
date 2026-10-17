package cv3;

import com.revolut.feature.credit.application.plugins.api.models.action_button.Button;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class s implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f109267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f109268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f109269c;
    public final String d;
    public final k e;
    public final Button f;

    public s(r header, ArrayList items, String str, String str2, k kVar, Button button) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f109267a = header;
        this.f109268b = items;
        this.f109269c = str;
        this.d = str2;
        this.e = kVar;
        this.f = button;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return this.f109267a.equals(sVar.f109267a) && this.f109268b.equals(sVar.f109268b) && Intrinsics.f(this.f109269c, sVar.f109269c) && Intrinsics.f(this.d, sVar.d) && Intrinsics.f(this.e, sVar.e) && Intrinsics.f(this.f, sVar.f);
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f109268b, this.f109267a.hashCode() * 31, 31);
        String str = this.f109269c;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        k kVar = this.e;
        int iHashCode3 = (iHashCode2 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        Button button = this.f;
        return iHashCode3 + (button != null ? button.hashCode() : 0);
    }
}
