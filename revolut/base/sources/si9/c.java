package si9;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import si9.a;
import si9.b;

/* JADX INFO: loaded from: classes5.dex */
public final class c {
    public static a a(b type) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (!(type instanceof b.a)) {
            if (type instanceof b.C1466b) {
                return new a.e();
            }
            if (type instanceof b.c) {
                return new a.f();
            }
            throw new NoWhenBranchMatchedException();
        }
        b.a aVar = (b.a) type;
        if (aVar instanceof b.a.C1464a) {
            return new a.b();
        }
        if (aVar instanceof b.a.c) {
            return new a.d();
        }
        if (aVar instanceof b.a.C1465b) {
            return new a.c();
        }
        throw new NoWhenBranchMatchedException();
    }
}
