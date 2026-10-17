package ecd;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class w2 {

    @NotNull
    public static final v2 Companion = new v2();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f124696c = {null, yhm.j.c(yhm.k.PUBLICATION, new ebl.a(8))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f124697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f124698b;

    public /* synthetic */ w2(int i, String str, List list) {
        if (2 != (i & 2)) {
            qlm.j1.f(u2.f124682a.getDescriptor(), i, 2);
            throw null;
        }
        if ((i & 1) == 0) {
            this.f124697a = null;
        } else {
            this.f124697a = str;
        }
        this.f124698b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w2)) {
            return false;
        }
        w2 w2Var = (w2) obj2;
        return Intrinsics.f(this.f124697a, w2Var.f124697a) && Intrinsics.f(this.f124698b, w2Var.f124698b);
    }

    public final int hashCode() {
        String str = this.f124697a;
        return this.f124698b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public w2(String str, ArrayList options) {
        Intrinsics.checkNotNullParameter(options, "options");
        this.f124697a = str;
        this.f124698b = options;
    }
}
