package dx4;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f2 implements a3, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f120590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f120591c;

    public f2(String title, String buttonTitle, ArrayList sections) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(sections, "sections");
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        this.f120589a = title;
        this.f120590b = sections;
        this.f120591c = buttonTitle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f2)) {
            return false;
        }
        f2 f2Var = (f2) obj2;
        return Intrinsics.f(this.f120589a, f2Var.f120589a) && this.f120590b.equals(f2Var.f120590b) && Intrinsics.f(this.f120591c, f2Var.f120591c);
    }

    public final int hashCode() {
        return this.f120591c.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f120590b, this.f120589a.hashCode() * 31, 31);
    }
}
