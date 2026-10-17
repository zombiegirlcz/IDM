package dtc;

import h93.f0;
import java.util.Collection;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;
import tof.p6;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends atc.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f117403a;

    public b(LinkedHashMap cards) {
        Intrinsics.checkNotNullParameter(cards, "cards");
        this.f117403a = cards;
    }

    @Override // atc.b
    public final void a(Object obj2, Collection targetCollection) {
        String str;
        a3 instance = (a3) obj2;
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(targetCollection, "targetCollection");
        p6 p6Var = instance.A.f272780b;
        f0 f0Var = (p6Var == null || (str = p6Var.f272991a) == null) ? null : (f0) this.f117403a.get(str);
        if (f0Var == null) {
            return;
        }
        String str2 = f0Var.f150115j;
        if (str2 != null) {
            targetCollection.add(str2);
        }
        String str3 = f0Var.f150111b;
        if (str3 != null) {
            targetCollection.add(str3);
        }
    }

    @Override // atc.b
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f117403a.equals(((b) obj2).f117403a);
    }

    @Override // atc.b
    public final int hashCode() {
        return this.f117403a.hashCode();
    }
}
