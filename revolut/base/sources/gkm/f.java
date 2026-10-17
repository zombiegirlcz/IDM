package gkm;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import r10.w;

/* JADX INFO: loaded from: classes14.dex */
public final class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TypeConstructor f144518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f144519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TypeAttributes f144520c;
    public final boolean d;

    public f(TypeAttributes typeAttributes, TypeConstructor typeConstructor, List list, boolean z) {
        this.f144518a = typeConstructor;
        this.f144519b = list;
        this.f144520c = typeAttributes;
        this.d = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        KotlinTypeRefiner refiner = (KotlinTypeRefiner) obj2;
        Intrinsics.checkNotNullParameter(refiner, "refiner");
        KotlinTypeFactory.INSTANCE.getClass();
        TypeConstructor typeConstructor = this.f144518a;
        List list = this.f144519b;
        w wVarA = KotlinTypeFactory.a(typeConstructor, refiner, list);
        if (wVarA == null) {
            return null;
        }
        SimpleType simpleType = (SimpleType) wVarA.f250865a;
        if (simpleType != null) {
            return simpleType;
        }
        TypeConstructor typeConstructor2 = (TypeConstructor) wVarA.f250866b;
        Intrinsics.h(typeConstructor2);
        return KotlinTypeFactory.simpleType(this.f144520c, typeConstructor2, (List<? extends TypeProjection>) list, this.d, refiner);
    }
}
