package ajm;

import java.lang.reflect.Field;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class q extends t implements h {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f5617g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Field field, boolean z, Object obj2) {
        super(field, z, false);
        Intrinsics.checkNotNullParameter(field, "field");
        this.f5617g = obj2;
    }

    @Override // ajm.t, ajm.i
    public final Object call(Object[] args) throws IllegalAccessException {
        Intrinsics.checkNotNullParameter(args, "args");
        a(args);
        ((Field) this.f5624a).set(this.f5617g, kotlin.collections.d.O(args));
        return Unit.f186387a;
    }
}
