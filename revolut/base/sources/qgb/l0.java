package qgb;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class l0 {

    @NotNull
    public static final k0 Companion = new k0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f245750c = {null, yhm.j.c(yhm.k.PUBLICATION, new qba.c(24))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f245751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f245752b;

    public /* synthetic */ l0(int i, String str, List list) {
        if (3 != (i & 3)) {
            j1.f(j0.f245748a.getDescriptor(), i, 3);
            throw null;
        }
        this.f245751a = str;
        this.f245752b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj2;
        return Intrinsics.f(this.f245751a, l0Var.f245751a) && Intrinsics.f(this.f245752b, l0Var.f245752b);
    }

    public final int hashCode() {
        return this.f245752b.hashCode() + (this.f245751a.hashCode() * 31);
    }

    public l0(String text, ArrayList actions) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f245751a = text;
        this.f245752b = actions;
    }
}
