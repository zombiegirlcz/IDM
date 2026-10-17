package ajm;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public abstract class p extends z {
    /* JADX WARN: Illegal instructions before constructor call */
    public p(Field field, boolean z) {
        Type genericType = field.getGenericType();
        Intrinsics.checkNotNullExpressionValue(genericType, "getGenericType(...)");
        super(field, genericType, z ? field.getDeclaringClass() : null, new Type[0]);
    }

    @Override // ajm.i
    public Object call(Object[] args) {
        Intrinsics.checkNotNullParameter(args, "args");
        a(args);
        return ((Field) this.f5624a).get(this.f5626c != null ? kotlin.collections.d.O(args) : null);
    }
}
