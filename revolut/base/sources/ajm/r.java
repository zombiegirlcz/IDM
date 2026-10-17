package ajm;

import java.lang.reflect.Field;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class r extends t implements h {
    @Override // ajm.t, ajm.i
    public final Object call(Object[] args) throws IllegalAccessException {
        Intrinsics.checkNotNullParameter(args, "args");
        a(args);
        ((Field) this.f5624a).set(null, kotlin.collections.d.e0(args));
        return Unit.f186387a;
    }
}
