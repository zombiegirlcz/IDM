package hjm;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: loaded from: classes14.dex */
public final class b implements Function1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f152834b = new b(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f152835c = new b(1);
    public static final b d = new b(2);
    public static final b e = new b(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f152836a;

    public /* synthetic */ b(int i) {
        this.f152836a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f152836a) {
            case 0:
                ParameterizedType it8 = (ParameterizedType) obj2;
                List list = ReflectClassUtilKt.f186699a;
                Intrinsics.checkNotNullParameter(it8, "it");
                Type ownerType = it8.getOwnerType();
                if (ownerType instanceof ParameterizedType) {
                    return (ParameterizedType) ownerType;
                }
                return null;
            case 1:
                ParameterizedType it9 = (ParameterizedType) obj2;
                List list2 = ReflectClassUtilKt.f186699a;
                Intrinsics.checkNotNullParameter(it9, "it");
                Type[] actualTypeArguments = it9.getActualTypeArguments();
                Intrinsics.checkNotNullExpressionValue(actualTypeArguments, "getActualTypeArguments(...)");
                return kotlin.collections.d.E(actualTypeArguments);
            case 2:
                String simpleName = ((Class) obj2).getSimpleName();
                Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
                return Boolean.valueOf(simpleName.length() == 0);
            default:
                String simpleName2 = ((Class) obj2).getSimpleName();
                if (!Name.isValidIdentifier(simpleName2)) {
                    simpleName2 = null;
                }
                if (simpleName2 != null) {
                    return Name.identifier(simpleName2);
                }
                return null;
        }
    }
}
