package nif;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class k4 {

    @NotNull
    public static final j4 Companion = new j4();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f215903b = {yhm.j.c(yhm.k.PUBLICATION, new nhl.s(20))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f215904a;

    public /* synthetic */ k4(int i, List list) {
        if (1 == (i & 1)) {
            this.f215904a = list;
        } else {
            qlm.j1.f(i4.f215868a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final List a() {
        return this.f215904a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k4) && Intrinsics.f(this.f215904a, ((k4) obj2).f215904a);
    }

    public final int hashCode() {
        return this.f215904a.hashCode();
    }

    public k4(ArrayList amounts) {
        Intrinsics.checkNotNullParameter(amounts, "amounts");
        this.f215904a = amounts;
    }
}
