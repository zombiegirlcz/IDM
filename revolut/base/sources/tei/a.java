package tei;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import rei.i;
import rei.q;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f270106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f270107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f270108c;
    public final i d;

    public a(String requestId, q traveller, ArrayList rooms, i payment) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(traveller, "traveller");
        Intrinsics.checkNotNullParameter(rooms, "rooms");
        Intrinsics.checkNotNullParameter(payment, "payment");
        this.f270106a = requestId;
        this.f270107b = traveller;
        this.f270108c = rooms;
        this.d = payment;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f270106a, aVar.f270106a) && this.f270107b.equals(aVar.f270107b) && this.f270108c.equals(aVar.f270108c) && this.d.equals(aVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f270108c, (this.f270107b.hashCode() + (this.f270106a.hashCode() * 31)) * 31, 31);
    }
}
