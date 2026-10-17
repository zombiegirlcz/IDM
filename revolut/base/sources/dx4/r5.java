package dx4;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class r5 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f120756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f120757c;
    public final String d;

    public r5(String parameterKey, String title, String buttonTitle, ArrayList variants) {
        Intrinsics.checkNotNullParameter(parameterKey, "parameterKey");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(variants, "variants");
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        this.f120755a = parameterKey;
        this.f120756b = title;
        this.f120757c = variants;
        this.d = buttonTitle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r5)) {
            return false;
        }
        r5 r5Var = (r5) obj2;
        return Intrinsics.f(this.f120755a, r5Var.f120755a) && Intrinsics.f(this.f120756b, r5Var.f120756b) && this.f120757c.equals(r5Var.f120757c) && Intrinsics.f(this.d, r5Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f120757c, p.a.c(this.f120755a.hashCode() * 31, 31, this.f120756b), 31);
    }
}
