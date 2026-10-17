package tgb;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final do3.g f271128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f271129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f271130c;
    public final b d;

    public c(do3.g salariedUserState, ArrayList rewards, a aVar, b bVar) {
        Intrinsics.checkNotNullParameter(salariedUserState, "salariedUserState");
        Intrinsics.checkNotNullParameter(rewards, "rewards");
        this.f271128a = salariedUserState;
        this.f271129b = rewards;
        this.f271130c = aVar;
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
        return this.f271128a == cVar.f271128a && this.f271129b.equals(cVar.f271129b) && Intrinsics.f(this.f271130c, cVar.f271130c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f271129b, this.f271128a.hashCode() * 31, 31);
        a aVar = this.f271130c;
        int iHashCode = (iB + (aVar == null ? 0 : Boolean.hashCode(aVar.f271125a))) * 31;
        b bVar = this.d;
        return iHashCode + (bVar != null ? bVar.hashCode() : 0);
    }
}
