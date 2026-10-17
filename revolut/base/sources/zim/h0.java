package zim;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor;
import kotlin.reflect.jvm.internal.impl.resolve.constants.PrimitiveTypeUtilKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* JADX INFO: loaded from: classes14.dex */
public final class h0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f322639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f322640b;

    public /* synthetic */ h0(Object obj2, int i) {
        this.f322639a = i;
        this.f322640b = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f322639a;
        Object obj2 = this.f322640b;
        switch (i) {
            case 0:
                return g2.a(((l0) obj2).getF186423a());
            case 1:
                return new o0((p0) obj2);
            case 2:
                return new q0((r0) obj2);
            case 3:
                return new s0((t0) obj2);
            case 4:
                return new u0((v0) obj2);
            case 5:
                return new w1((x1) obj2);
            case 6:
                List<KotlinType> upperBounds = ((e2) obj2).f322631a.getUpperBounds();
                Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
                List<KotlinType> list = upperBounds;
                ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                Iterator<T> it8 = list.iterator();
                while (it8.hasNext()) {
                    arrayList.add(new c2((KotlinType) it8.next(), null));
                }
                return arrayList;
            default:
                IntegerLiteralTypeConstructor integerLiteralTypeConstructor = (IntegerLiteralTypeConstructor) obj2;
                IntegerLiteralTypeConstructor.Companion companion = IntegerLiteralTypeConstructor.Companion;
                SimpleType defaultType = integerLiteralTypeConstructor.getBuiltIns().getComparable().getDefaultType();
                Intrinsics.checkNotNullExpressionValue(defaultType, "getDefaultType(...)");
                ArrayList arrayListN = zhm.v.n(TypeSubstitutionKt.replace$default(defaultType, zhm.u.c(new TypeProjectionImpl(Variance.IN_VARIANCE, integerLiteralTypeConstructor.d)), null, 2, null));
                Collection<KotlinType> allSignedLiteralTypes = PrimitiveTypeUtilKt.getAllSignedLiteralTypes(integerLiteralTypeConstructor.f187587b);
                if (!(allSignedLiteralTypes instanceof Collection) || !allSignedLiteralTypes.isEmpty()) {
                    Iterator<T> it9 = allSignedLiteralTypes.iterator();
                    while (true) {
                        if (it9.hasNext()) {
                            if (integerLiteralTypeConstructor.f187588c.contains((KotlinType) it9.next())) {
                                arrayListN.add(integerLiteralTypeConstructor.getBuiltIns().getNumberType());
                            }
                        }
                    }
                }
                return arrayListN;
        }
    }
}
