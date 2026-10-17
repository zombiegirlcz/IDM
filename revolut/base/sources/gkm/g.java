package gkm;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import r10.w;

/* JADX INFO: loaded from: classes14.dex */
public final class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TypeConstructor f144521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f144522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TypeAttributes f144523c;
    public final boolean d;
    public final MemberScope e;

    public g(TypeAttributes typeAttributes, TypeConstructor typeConstructor, List list, boolean z, MemberScope memberScope) {
        this.f144521a = typeConstructor;
        this.f144522b = list;
        this.f144523c = typeAttributes;
        this.d = z;
        this.e = memberScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        KotlinTypeRefiner kotlinTypeRefiner = (KotlinTypeRefiner) obj2;
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        KotlinTypeFactory.INSTANCE.getClass();
        TypeConstructor typeConstructor = this.f144521a;
        List list = this.f144522b;
        w wVarA = KotlinTypeFactory.a(typeConstructor, kotlinTypeRefiner, list);
        if (wVarA == null) {
            return null;
        }
        SimpleType simpleType = (SimpleType) wVarA.f250865a;
        if (simpleType != null) {
            return simpleType;
        }
        TypeConstructor typeConstructor2 = (TypeConstructor) wVarA.f250866b;
        Intrinsics.h(typeConstructor2);
        return KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(this.f144523c, typeConstructor2, list, this.d, this.e);
    }
}
