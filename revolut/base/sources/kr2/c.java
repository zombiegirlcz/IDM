package kr2;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f188639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f188640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f188641c;
    public final a d;

    public c(String title, String str, ArrayList contentItems, a cta2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(contentItems, "contentItems");
        Intrinsics.checkNotNullParameter(cta2, "cta");
        this.f188639a = title;
        this.f188640b = str;
        this.f188641c = contentItems;
        this.d = cta2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f188639a, cVar.f188639a) && Intrinsics.f(this.f188640b, cVar.f188640b) && this.f188641c.equals(cVar.f188641c) && this.d.equals(cVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f188639a.hashCode() * 31;
        String str = this.f188640b;
        return this.d.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f188641c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
    }
}
