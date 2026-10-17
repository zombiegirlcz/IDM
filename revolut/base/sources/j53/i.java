package j53;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class i extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f171466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f171467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f171468c;
    public final boolean d;
    public final Data e;

    public i(Data suggestions, String str, boolean z, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
        this.f171466a = str;
        this.f171467b = z;
        this.f171468c = z3;
        this.d = z4;
        this.e = suggestions;
    }

    public static i a(i iVar, String str, boolean z, boolean z3, Data data, int i) {
        if ((i & 1) != 0) {
            str = iVar.f171466a;
        }
        String str2 = str;
        boolean z4 = (i & 2) != 0 ? iVar.f171467b : true;
        if ((i & 4) != 0) {
            z = iVar.f171468c;
        }
        boolean z6 = z;
        if ((i & 8) != 0) {
            z3 = iVar.d;
        }
        boolean z11 = z3;
        if ((i & 16) != 0) {
            data = iVar.e;
        }
        Data suggestions = data;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
        return new i(suggestions, str2, z4, z6, z11);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f171466a, iVar.f171466a) && this.f171467b == iVar.f171467b && this.f171468c == iVar.f171468c && this.d == iVar.d && Intrinsics.f(this.e, iVar.e);
    }

    public final int hashCode() {
        String str = this.f171466a;
        return this.e.hashCode() + j6.a.c(j6.a.c(j6.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f171467b), 31, this.f171468c), 31, this.d);
    }

    public /* synthetic */ i(boolean z) {
        this(new Data(null, null, true, 3, null), null, z, false, false);
    }
}
