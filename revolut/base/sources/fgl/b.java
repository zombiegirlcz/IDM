package fgl;

import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f135092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f135093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageTransformations f135094c;

    public b() {
        this(null, null, null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f135092a, bVar.f135092a) && Intrinsics.f(this.f135093b, bVar.f135093b) && Intrinsics.f(this.f135094c, bVar.f135094c);
    }

    public final int hashCode() {
        Integer num = this.f135092a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f135093b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        ImageTransformations imageTransformations = this.f135094c;
        return iHashCode2 + (imageTransformations != null ? imageTransformations.hashCode() : 0);
    }

    public b(Integer num, Integer num2, ImageTransformations imageTransformations) {
        this.f135092a = num;
        this.f135093b = num2;
        this.f135094c = imageTransformations;
    }
}
