package ajm;

import java.lang.reflect.Field;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class m extends p implements h {
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Field field, Object obj2) {
        super(field, false);
        Intrinsics.checkNotNullParameter(field, "field");
        this.e = obj2;
    }

    @Override // ajm.p, ajm.i
    public final Object call(Object[] args) {
        Intrinsics.checkNotNullParameter(args, "args");
        a(args);
        return ((Field) this.f5624a).get(this.e);
    }
}
