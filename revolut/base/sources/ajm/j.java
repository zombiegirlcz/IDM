package ajm;

import java.lang.reflect.Constructor;
import java.lang.reflect.Type;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes14.dex */
public final class j extends z implements h {
    public final /* synthetic */ int e;
    public final Object f;

    /* JADX WARN: Illegal instructions before constructor call */
    public j(Constructor constructor, Object obj2, int i) {
        this.e = i;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(constructor, "constructor");
                Class declaringClass = constructor.getDeclaringClass();
                Intrinsics.checkNotNullExpressionValue(declaringClass, "getDeclaringClass(...)");
                Type[] genericParameterTypes = constructor.getGenericParameterTypes();
                Intrinsics.checkNotNullExpressionValue(genericParameterTypes, "getGenericParameterTypes(...)");
                super(constructor, declaringClass, null, genericParameterTypes);
                this.f = obj2;
                break;
            default:
                Intrinsics.checkNotNullParameter(constructor, "constructor");
                Class declaringClass2 = constructor.getDeclaringClass();
                Intrinsics.checkNotNullExpressionValue(declaringClass2, "getDeclaringClass(...)");
                Type[] genericParameterTypes2 = constructor.getGenericParameterTypes();
                Intrinsics.checkNotNullExpressionValue(genericParameterTypes2, "getGenericParameterTypes(...)");
                super(constructor, declaringClass2, null, (Type[]) (genericParameterTypes2.length <= 2 ? new Type[0] : zhm.p.n(1, genericParameterTypes2.length - 1, genericParameterTypes2)));
                this.f = obj2;
                break;
        }
    }

    @Override // ajm.i
    public final Object call(Object[] args) {
        switch (this.e) {
            case 0:
                Intrinsics.checkNotNullParameter(args, "args");
                a(args);
                Constructor constructor = (Constructor) this.f5624a;
                s0 s0Var = new s0(3);
                s0Var.a(this.f);
                s0Var.b(args);
                s0Var.a(null);
                ArrayList arrayList = s0Var.f186433a;
                return constructor.newInstance(arrayList.toArray(new Object[arrayList.size()]));
            default:
                Intrinsics.checkNotNullParameter(args, "args");
                a(args);
                Constructor constructor2 = (Constructor) this.f5624a;
                s0 s0Var2 = new s0(2);
                s0Var2.a(this.f);
                s0Var2.b(args);
                ArrayList arrayList2 = s0Var2.f186433a;
                return constructor2.newInstance(arrayList2.toArray(new Object[arrayList2.size()]));
        }
    }
}
