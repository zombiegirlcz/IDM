package fwf;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f138622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f138623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f138624c;
    public final ArrayList d;
    public final ArrayList e;

    public g(ArrayList transitActive, ArrayList transitToBeActivated, ArrayList transitPending, ArrayList transitExpired, ArrayList transitFailed) {
        Intrinsics.checkNotNullParameter(transitActive, "transitActive");
        Intrinsics.checkNotNullParameter(transitToBeActivated, "transitToBeActivated");
        Intrinsics.checkNotNullParameter(transitPending, "transitPending");
        Intrinsics.checkNotNullParameter(transitExpired, "transitExpired");
        Intrinsics.checkNotNullParameter(transitFailed, "transitFailed");
        this.f138622a = transitActive;
        this.f138623b = transitToBeActivated;
        this.f138624c = transitPending;
        this.d = transitExpired;
        this.e = transitFailed;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f138622a.equals(gVar.f138622a) && this.f138623b.equals(gVar.f138623b) && this.f138624c.equals(gVar.f138624c) && this.d.equals(gVar.d) && this.e.equals(gVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, com.google.android.gms.internal.mlkit_vision_face.a.b(this.f138624c, com.google.android.gms.internal.mlkit_vision_face.a.b(this.f138623b, this.f138622a.hashCode() * 31, 31), 31), 31);
    }
}
