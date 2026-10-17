package h43;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f149291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yt8.c f149292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f149293c;
    public final boolean d;

    public m(ArrayList cards, yt8.c kyc2, LinkedHashMap pockets, boolean z) {
        Intrinsics.checkNotNullParameter(cards, "cards");
        Intrinsics.checkNotNullParameter(kyc2, "kyc");
        Intrinsics.checkNotNullParameter(pockets, "pockets");
        this.f149291a = cards;
        this.f149292b = kyc2;
        this.f149293c = pockets;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f149291a.equals(mVar.f149291a) && Intrinsics.f(this.f149292b, mVar.f149292b) && this.f149293c.equals(mVar.f149293c) && this.d == mVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + r6.b.e(this.f149293c, (this.f149292b.hashCode() + (this.f149291a.hashCode() * 31)) * 31, 31);
    }
}
