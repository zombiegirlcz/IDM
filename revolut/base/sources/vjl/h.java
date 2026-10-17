package vjl;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class h {

    @NotNull
    public static final g Companion = new g();
    public static final Lazy[] f = {null, null, null, yhm.j.c(yhm.k.PUBLICATION, new ve7.i(17)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f289808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f289809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f289810c;
    public final List d;
    public final String e;

    public /* synthetic */ h(int i, String str, String str2, String str3, List list, boolean z) {
        if (31 != (i & 31)) {
            j1.f(b.f289803a.getDescriptor(), i, 31);
            throw null;
        }
        this.f289808a = z;
        this.f289809b = str;
        this.f289810c = str2;
        this.d = list;
        this.e = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f289808a == hVar.f289808a && Intrinsics.f(this.f289809b, hVar.f289809b) && Intrinsics.f(this.f289810c, hVar.f289810c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e);
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.c(p.a.c(Boolean.hashCode(this.f289808a) * 31, 31, this.f289809b), 31, this.f289810c), 31, this.d);
        String str = this.e;
        return iD + (str == null ? 0 : str.hashCode());
    }

    public h(String name, String displayName, String str, ArrayList claims, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(claims, "claims");
        this.f289808a = z;
        this.f289809b = name;
        this.f289810c = displayName;
        this.d = claims;
        this.e = str;
    }
}
