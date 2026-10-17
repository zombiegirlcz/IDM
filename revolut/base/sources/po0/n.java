package po0;

import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UrlImage f237855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f237856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f237857c;

    public n(UrlImage image, Integer num, o oVar) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.f237855a = image;
        this.f237856b = num;
        this.f237857c = oVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f237855a.equals(nVar.f237855a) && Intrinsics.f(this.f237856b, nVar.f237856b) && Float.compare(0.2f, 0.2f) == 0 && this.f237857c == nVar.f237857c;
    }

    public final int hashCode() {
        int iHashCode = this.f237855a.hashCode() * 31;
        Integer num = this.f237856b;
        int iB = m72.b.b(0.2f, (iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31);
        o oVar = this.f237857c;
        return iB + (oVar != null ? oVar.hashCode() : 0);
    }
}
