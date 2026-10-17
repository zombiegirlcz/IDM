package xo1;

import java.time.LocalDate;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f307571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f307572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f307573c;
    public final LocalDate d;

    public h(g paymentMethod, ArrayList inputs, String str, LocalDate localDate) {
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        Intrinsics.checkNotNullParameter(inputs, "inputs");
        this.f307571a = paymentMethod;
        this.f307572b = inputs;
        this.f307573c = str;
        this.d = localDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f307571a == hVar.f307571a && this.f307572b.equals(hVar.f307572b) && Intrinsics.f(this.f307573c, hVar.f307573c) && Intrinsics.f(this.d, hVar.d);
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f307572b, this.f307571a.hashCode() * 31, 31);
        String str = this.f307573c;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        LocalDate localDate = this.d;
        return iHashCode + (localDate != null ? localDate.hashCode() : 0);
    }
}
