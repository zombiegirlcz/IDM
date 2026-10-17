package ttj;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f274338b = {yhm.j.c(yhm.k.PUBLICATION, new ts1.h(7))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f274339a;

    public /* synthetic */ f(int i, List list) {
        if (1 == (i & 1)) {
            this.f274339a = list;
        } else {
            qlm.j1.f(d.f274328a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f274339a, ((f) obj2).f274339a);
    }

    public final int hashCode() {
        return this.f274339a.hashCode();
    }

    public f(ArrayList challenges) {
        Intrinsics.checkNotNullParameter(challenges, "challenges");
        this.f274339a = challenges;
    }
}
