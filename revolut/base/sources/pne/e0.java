package pne;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class e0 {

    @NotNull
    public static final a0 Companion = new a0();
    public static final Lazy[] d = {null, null, yhm.j.c(yhm.k.PUBLICATION, new pka.c(26))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f237712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f237713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f237714c;

    public e0(int i, String str, f fVar, List list) {
        if (3 != (i & 3)) {
            j1.f(z.f237747a.getDescriptor(), i, 3);
            throw null;
        }
        this.f237712a = str;
        this.f237713b = fVar;
        if ((i & 4) == 0) {
            this.f237714c = zhm.f0.f322471a;
        } else {
            this.f237714c = list;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj2;
        return Intrinsics.f(this.f237712a, e0Var.f237712a) && Intrinsics.f(this.f237713b, e0Var.f237713b) && Intrinsics.f(this.f237714c, e0Var.f237714c);
    }

    public final int hashCode() {
        String str = this.f237712a;
        return this.f237714c.hashCode() + ((this.f237713b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31);
    }

    public e0(String str, f exemptions, ArrayList datapoints) {
        Intrinsics.checkNotNullParameter(exemptions, "exemptions");
        Intrinsics.checkNotNullParameter(datapoints, "datapoints");
        this.f237712a = str;
        this.f237713b = exemptions;
        this.f237714c = datapoints;
    }
}
