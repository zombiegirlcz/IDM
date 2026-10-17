package d0j;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f110425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f110426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f110427c;

    public q(String str, ArrayList challenges, boolean z) {
        Intrinsics.checkNotNullParameter(challenges, "challenges");
        this.f110425a = z;
        this.f110426b = challenges;
        this.f110427c = str;
    }

    public static q a(q qVar, ArrayList challenges) {
        boolean z = qVar.f110425a;
        String str = qVar.f110427c;
        Intrinsics.checkNotNullParameter(challenges, "challenges");
        return new q(str, challenges, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return this.f110425a == qVar.f110425a && this.f110426b.equals(qVar.f110426b) && Intrinsics.f(this.f110427c, qVar.f110427c);
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f110426b, Boolean.hashCode(this.f110425a) * 31, 31);
        String str = this.f110427c;
        return iB + (str == null ? 0 : str.hashCode());
    }
}
