package qo6;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class l {

    @NotNull
    public static final k Companion = new k();
    public static final Lazy[] e = {null, null, null, yhm.j.c(yhm.k.PUBLICATION, new qni.a(3))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f248063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f248064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f248065c;
    public final List d;

    public /* synthetic */ l(int i, boolean z, String str, String str2, List list) {
        if (15 != (i & 15)) {
            j1.f(j.f248062a.getDescriptor(), i, 15);
            throw null;
        }
        this.f248063a = z;
        this.f248064b = str;
        this.f248065c = str2;
        this.d = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f248063a == lVar.f248063a && Intrinsics.f(this.f248064b, lVar.f248064b) && Intrinsics.f(this.f248065c, lVar.f248065c) && Intrinsics.f(this.d, lVar.d);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f248063a) * 31;
        String str = this.f248064b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f248065c;
        return this.d.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
