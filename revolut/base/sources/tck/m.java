package tck;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class m {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f269874b = {yhm.j.c(yhm.k.PUBLICATION, new t73.h(24))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f269875a;

    public /* synthetic */ m(int i, List list) {
        if (1 == (i & 1)) {
            this.f269875a = list;
        } else {
            j1.f(k.f269873a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f269875a, ((m) obj2).f269875a);
    }

    public final int hashCode() {
        return this.f269875a.hashCode();
    }

    public m(List recipients) {
        Intrinsics.checkNotNullParameter(recipients, "recipients");
        this.f269875a = recipients;
    }
}
