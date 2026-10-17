package hjb;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class s implements t {

    @NotNull
    public static final r Companion = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f152694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f152695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f152696c;

    public /* synthetic */ s(int i, w wVar, w wVar2, String str) {
        if (1 != (i & 1)) {
            j1.f(q.f152693a.getDescriptor(), i, 1);
            throw null;
        }
        this.f152694a = wVar;
        if ((i & 2) == 0) {
            this.f152695b = null;
        } else {
            this.f152695b = wVar2;
        }
        if ((i & 4) == 0) {
            this.f152696c = null;
        } else {
            this.f152696c = str;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f152694a, sVar.f152694a) && Intrinsics.f(this.f152695b, sVar.f152695b) && Intrinsics.f(this.f152696c, sVar.f152696c);
    }

    public final int hashCode() {
        int iHashCode = this.f152694a.hashCode() * 31;
        w wVar = this.f152695b;
        int iHashCode2 = (iHashCode + (wVar == null ? 0 : wVar.hashCode())) * 31;
        String str = this.f152696c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public s(w primaryRateInfo, w wVar, String str) {
        Intrinsics.checkNotNullParameter(primaryRateInfo, "primaryRateInfo");
        this.f152694a = primaryRateInfo;
        this.f152695b = wVar;
        this.f152696c = str;
    }
}
