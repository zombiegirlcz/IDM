package mgb;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final do3.g f205227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f205228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f205229c;
    public final b d;

    public c(do3.g salariedUserState, ArrayList rewards, a aVar, b bVar) {
        Intrinsics.checkNotNullParameter(salariedUserState, "salariedUserState");
        Intrinsics.checkNotNullParameter(rewards, "rewards");
        this.f205227a = salariedUserState;
        this.f205228b = rewards;
        this.f205229c = aVar;
        this.d = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f205227a == cVar.f205227a && this.f205228b.equals(cVar.f205228b) && Intrinsics.f(this.f205229c, cVar.f205229c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f205228b, this.f205227a.hashCode() * 31, 31);
        a aVar = this.f205229c;
        int iHashCode = (iB + (aVar == null ? 0 : Boolean.hashCode(aVar.f205224a))) * 31;
        b bVar = this.d;
        return iHashCode + (bVar != null ? bVar.hashCode() : 0);
    }
}
