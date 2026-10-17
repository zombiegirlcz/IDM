package mr4;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yw4.a f208047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f208048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final um4.a f208049c;

    public a(yw4.a selected, ArrayList options, um4.a limitsInfo) {
        Intrinsics.checkNotNullParameter(selected, "selected");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(limitsInfo, "limitsInfo");
        this.f208047a = selected;
        this.f208048b = options;
        this.f208049c = limitsInfo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f208047a == aVar.f208047a && this.f208048b.equals(aVar.f208048b) && Intrinsics.f(this.f208049c, aVar.f208049c);
    }

    public final int hashCode() {
        return this.f208049c.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f208048b, this.f208047a.hashCode() * 31, 31);
    }
}
