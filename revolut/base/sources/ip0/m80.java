package ip0;

import android.widget.ImageView;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class m80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f165337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f165338b;

    public m80(TextView label, ImageView image) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(image, "image");
        this.f165337a = label;
        this.f165338b = image;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m80)) {
            return false;
        }
        m80 m80Var = (m80) obj2;
        return Intrinsics.f(this.f165337a, m80Var.f165337a) && Intrinsics.f(this.f165338b, m80Var.f165338b);
    }

    public final int hashCode() {
        return this.f165338b.hashCode() + (this.f165337a.hashCode() * 31);
    }
}
