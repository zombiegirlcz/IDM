package hh4;

import dx4.c3;
import dx4.d3;
import dx4.h3;
import dx4.i3;
import dx4.j3;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ e f152251a = new e();

    private e() {
    }

    public static f a(j3 input) {
        Intrinsics.checkNotNullParameter(input, "input");
        if (input instanceof d3) {
            return b.f152248a;
        }
        if (input instanceof c3) {
            return a.f152247a;
        }
        if (input instanceof i3) {
            return d.f152250a;
        }
        if (input instanceof h3) {
            return c.f152249a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
