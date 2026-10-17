package he0;

import java.io.IOException;
import kg.l0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public abstract class n extends l0 {
    @Override // kg.l0
    public final Object c(qg.a reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        if (reader.A() == qg.b.NULL) {
            reader.w();
            return null;
        }
        reader.f();
        while (reader.n()) {
            reader.H();
        }
        reader.j();
        return e();
    }

    @Override // kg.l0
    public final void d(qg.c out, Object obj2) throws IOException {
        Intrinsics.checkNotNullParameter(out, "out");
        if (obj2 == null) {
            out.m();
        } else {
            out.g();
            out.j();
        }
    }

    public abstract Object e();
}
