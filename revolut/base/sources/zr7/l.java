package zr7;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class l {

    @NotNull
    public static final f Companion = new f();
    public static final Lazy[] f = {null, null, null, yhm.j.c(yhm.k.PUBLICATION, new zr4.b(7)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f324634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f324635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f324636c;
    public final List d;
    public final i e;

    public /* synthetic */ l(int i, String str, String str2, String str3, List list, i iVar) {
        if (31 != (i & 31)) {
            j1.f(a.f324618a.getDescriptor(), i, 31);
            throw null;
        }
        this.f324634a = str;
        this.f324635b = str2;
        this.f324636c = str3;
        this.d = list;
        this.e = iVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f324634a, lVar.f324634a) && Intrinsics.f(this.f324635b, lVar.f324635b) && Intrinsics.f(this.f324636c, lVar.f324636c) && Intrinsics.f(this.d, lVar.d) && Intrinsics.f(this.e, lVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f324634a.hashCode() * 31;
        String str = this.f324635b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f324636c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.d;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        i iVar = this.e;
        return iHashCode4 + (iVar != null ? iVar.hashCode() : 0);
    }

    public l(String title, String str, String str2, ArrayList arrayList, i iVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f324634a = title;
        this.f324635b = str;
        this.f324636c = str2;
        this.d = arrayList;
        this.e = iVar;
    }
}
