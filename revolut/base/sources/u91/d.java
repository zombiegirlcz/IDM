package u91;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f278347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f278348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f278349c;
    public final ArrayList d;

    public d(b header, ArrayList steps, ArrayList productOffer, ArrayList progress) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(steps, "steps");
        Intrinsics.checkNotNullParameter(productOffer, "productOffer");
        Intrinsics.checkNotNullParameter(progress, "progress");
        this.f278347a = header;
        this.f278348b = steps;
        this.f278349c = productOffer;
        this.d = progress;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f278347a.equals(dVar.f278347a) && this.f278348b.equals(dVar.f278348b) && this.f278349c.equals(dVar.f278349c) && this.d.equals(dVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f278349c, com.google.android.gms.internal.mlkit_vision_face.a.b(this.f278348b, this.f278347a.hashCode() * 31, 31), 31);
    }
}
