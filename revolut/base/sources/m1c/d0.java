package m1c;

import com.revolut.feature.hyper_text.model.ParameterisedHyperText;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f201350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f201351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f201352c;
    public final b0 d;
    public final b0 e;
    public final ParameterisedHyperText f;

    public d0(String title, String str, ArrayList contentItems, b0 primaryCta, b0 b0Var, ParameterisedHyperText parameterisedHyperText) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(contentItems, "contentItems");
        Intrinsics.checkNotNullParameter(primaryCta, "primaryCta");
        this.f201350a = title;
        this.f201351b = str;
        this.f201352c = contentItems;
        this.d = primaryCta;
        this.e = b0Var;
        this.f = parameterisedHyperText;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return Intrinsics.f(this.f201350a, d0Var.f201350a) && Intrinsics.f(this.f201351b, d0Var.f201351b) && this.f201352c.equals(d0Var.f201352c) && this.d.equals(d0Var.d) && Intrinsics.f(this.e, d0Var.e) && Intrinsics.f(this.f, d0Var.f);
    }

    public final int hashCode() {
        int iHashCode = this.f201350a.hashCode() * 31;
        String str = this.f201351b;
        int iHashCode2 = (this.d.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f201352c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31)) * 31;
        b0 b0Var = this.e;
        int iHashCode3 = (iHashCode2 + (b0Var == null ? 0 : b0Var.hashCode())) * 31;
        ParameterisedHyperText parameterisedHyperText = this.f;
        return iHashCode3 + (parameterisedHyperText != null ? parameterisedHyperText.f74758a.hashCode() : 0);
    }
}
