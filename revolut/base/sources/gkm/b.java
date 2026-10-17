package gkm;

import java.util.Collection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes14.dex */
public final class b implements Function1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f144508b = new b(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f144509c = new b(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f144510a;

    public /* synthetic */ b(int i) {
        this.f144510a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Collection<KotlinType> supertypes;
        switch (this.f144510a) {
            case 0:
                ((Boolean) obj2).booleanValue();
                return new e(u.c(ErrorUtils.INSTANCE.getErrorTypeForLoopInSupertypes()));
            case 1:
                KotlinType it8 = (KotlinType) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8.toString();
            default:
                TypeConstructor it9 = (TypeConstructor) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                AbstractTypeConstructor abstractTypeConstructor = it9 instanceof AbstractTypeConstructor ? (AbstractTypeConstructor) it9 : null;
                if (abstractTypeConstructor != null) {
                    supertypes = d0.E0(abstractTypeConstructor.d(false), ((e) abstractTypeConstructor.f187760b.invoke()).f144516a);
                } else {
                    supertypes = it9.getSupertypes();
                    Intrinsics.checkNotNullExpressionValue(supertypes, "getSupertypes(...)");
                }
                return supertypes;
        }
    }

    public b(AbstractTypeConstructor abstractTypeConstructor) {
        this.f144510a = 2;
    }
}
