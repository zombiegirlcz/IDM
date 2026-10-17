package wbc;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f296100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f296101b;

    public a(int i, ArrayList deliveries) {
        Intrinsics.checkNotNullParameter(deliveries, "deliveries");
        this.f296100a = i;
        this.f296101b = deliveries;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f296100a == aVar.f296100a && this.f296101b.equals(aVar.f296101b);
    }

    public final int hashCode() {
        return this.f296101b.hashCode() + (Integer.hashCode(this.f296100a) * 31);
    }
}
