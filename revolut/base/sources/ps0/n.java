package ps0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f239382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f239383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f239384c;
    public final float d;
    public final float e;
    public final float f;

    public n(int i, ArrayList bars, float f, float f4, float f5, float f6) {
        Intrinsics.checkNotNullParameter(bars, "bars");
        this.f239382a = i;
        this.f239383b = bars;
        this.f239384c = f;
        this.d = f4;
        this.e = f5;
        this.f = f6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f239382a == nVar.f239382a && Intrinsics.f(this.f239383b, nVar.f239383b) && Float.compare(this.f239384c, nVar.f239384c) == 0 && Float.compare(this.d, nVar.d) == 0 && Float.compare(this.e, nVar.e) == 0 && Float.compare(this.f, nVar.f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + m72.b.b(this.e, m72.b.b(this.d, m72.b.b(this.f239384c, com.google.android.gms.internal.mlkit_vision_face.a.b(this.f239383b, Integer.hashCode(this.f239382a) * 31, 31), 31), 31), 31);
    }

    public /* synthetic */ n(ArrayList arrayList, int i, int i2) {
        this(i, arrayList, (i2 & 4) != 0 ? 16.0f : 8.0f, (i2 & 8) != 0 ? 16.0f : 0.0f, (i2 & 16) != 0 ? 24.0f : BitmapDescriptorFactory.HUE_RED, 16.0f);
    }
}
