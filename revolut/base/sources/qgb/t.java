package qgb;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class t {

    @NotNull
    public static final s Companion = new s();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f245765c = {null, yhm.j.c(yhm.k.PUBLICATION, new qba.c(23))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f245766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f245767b;

    public /* synthetic */ t(int i, String str, List list) {
        if (3 != (i & 3)) {
            j1.f(r.f245764a.getDescriptor(), i, 3);
            throw null;
        }
        this.f245766a = str;
        this.f245767b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f245766a, tVar.f245766a) && Intrinsics.f(this.f245767b, tVar.f245767b);
    }

    public final int hashCode() {
        return this.f245767b.hashCode() + (this.f245766a.hashCode() * 31);
    }

    public t(String text, ArrayList actions) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f245766a = text;
        this.f245767b = actions;
    }
}
