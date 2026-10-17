package ajm;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public abstract class t extends z {
    public final /* synthetic */ int e = 0;
    public final boolean f;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ t(Method method, boolean z, int i) {
        z = (i & 2) != 0 ? !Modifier.isStatic(method.getModifiers()) : z;
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        Intrinsics.checkNotNullExpressionValue(genericParameterTypes, "getGenericParameterTypes(...)");
        this(method, z, genericParameterTypes);
    }

    @Override // ajm.z
    public void a(Object[] args) {
        switch (this.e) {
            case 0:
                Intrinsics.checkNotNullParameter(args, "args");
                super.a(args);
                if (this.f && kotlin.collections.d.e0(args) == null) {
                    throw new IllegalArgumentException("null is not allowed as a value for this property.");
                }
                return;
            default:
                super.a(args);
                return;
        }
    }

    @Override // ajm.i
    public Object call(Object[] args) throws IllegalAccessException {
        Intrinsics.checkNotNullParameter(args, "args");
        a(args);
        ((Field) this.f5624a).set(this.f5626c != null ? kotlin.collections.d.O(args) : null, kotlin.collections.d.e0(args));
        return Unit.f186387a;
    }

    public Object f(Object obj2, Object[] args) {
        Intrinsics.checkNotNullParameter(args, "args");
        return this.f ? Unit.f186387a : ((Method) this.f5624a).invoke(obj2, Arrays.copyOf(args, args.length));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public t(Method method, boolean z, Type[] typeArr) {
        Type genericReturnType = method.getGenericReturnType();
        Intrinsics.checkNotNullExpressionValue(genericReturnType, "getGenericReturnType(...)");
        super(method, genericReturnType, z ? method.getDeclaringClass() : null, typeArr);
        this.f = Intrinsics.f(genericReturnType, Void.TYPE);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public t(Field field, boolean z, boolean z3) {
        Class TYPE = Void.TYPE;
        Intrinsics.checkNotNullExpressionValue(TYPE, "TYPE");
        Class<?> declaringClass = z3 ? field.getDeclaringClass() : null;
        Type genericType = field.getGenericType();
        Intrinsics.checkNotNullExpressionValue(genericType, "getGenericType(...)");
        super(field, TYPE, declaringClass, new Type[]{genericType});
        this.f = z;
    }
}
