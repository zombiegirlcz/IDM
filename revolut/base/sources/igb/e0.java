package igb;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class e0 {

    @NotNull
    public static final d0 Companion = new d0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f161121c = {null, yhm.j.c(yhm.k.PUBLICATION, new j(1))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f161122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f161123b;

    public /* synthetic */ e0(int i, String str, List list) {
        if (3 != (i & 3)) {
            j1.f(c0.f161119a.getDescriptor(), i, 3);
            throw null;
        }
        this.f161122a = str;
        this.f161123b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj2;
        return Intrinsics.f(this.f161122a, e0Var.f161122a) && Intrinsics.f(this.f161123b, e0Var.f161123b);
    }

    public final int hashCode() {
        return this.f161123b.hashCode() + (this.f161122a.hashCode() * 31);
    }

    public e0(String text, ArrayList actions) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f161122a = text;
        this.f161123b = actions;
    }
}
