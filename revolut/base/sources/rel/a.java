package rel;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f253643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f253644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f253645c;

    public a(xi0.b currency, ArrayList bids, ArrayList asks) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(bids, "bids");
        Intrinsics.checkNotNullParameter(asks, "asks");
        this.f253643a = currency;
        this.f253644b = bids;
        this.f253645c = asks;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f253643a.equals(aVar.f253643a) && this.f253644b.equals(aVar.f253644b) && this.f253645c.equals(aVar.f253645c);
    }

    public final int hashCode() {
        return this.f253645c.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f253644b, this.f253643a.hashCode() * 31, 31);
    }
}
