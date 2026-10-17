package iyd;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class m0 {

    @NotNull
    public static final l0 Companion = new l0();
    public static final Lazy[] d = {null, null, yhm.j.c(yhm.k.PUBLICATION, new iw4.b(13))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f169678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f169679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f169680c;

    public /* synthetic */ m0(int i, String str, String str2, List list) {
        if (7 != (i & 7)) {
            j1.f(k0.f169674a.getDescriptor(), i, 7);
            throw null;
        }
        this.f169678a = str;
        this.f169679b = str2;
        this.f169680c = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj2;
        return Intrinsics.f(this.f169678a, m0Var.f169678a) && Intrinsics.f(this.f169679b, m0Var.f169679b) && Intrinsics.f(this.f169680c, m0Var.f169680c);
    }

    public final int hashCode() {
        int iHashCode = this.f169678a.hashCode() * 31;
        String str = this.f169679b;
        return this.f169680c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public m0(String title, String str, ArrayList tabs) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        this.f169678a = title;
        this.f169679b = str;
        this.f169680c = tabs;
    }
}
