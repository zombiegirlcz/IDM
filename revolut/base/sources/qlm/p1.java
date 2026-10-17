package qlm;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes14.dex */
public final class p1 extends t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final KClass f247692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f247693c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(KClass kClass, KSerializer eSerializer) {
        super(eSerializer);
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(eSerializer, "eSerializer");
        this.f247692b = kClass;
        SerialDescriptor elementDesc = eSerializer.getDescriptor();
        Intrinsics.checkNotNullParameter(elementDesc, "elementDesc");
        this.f247693c = new c(elementDesc, 0);
    }

    @Override // qlm.a
    public final Object a() {
        return new ArrayList();
    }

    @Override // qlm.a
    public final int b(Object obj2) {
        ArrayList arrayList = (ArrayList) obj2;
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        return arrayList.size();
    }

    @Override // qlm.a
    public final Iterator c(Object obj2) {
        Object[] objArr = (Object[]) obj2;
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        return kotlin.jvm.internal.u0.h(objArr);
    }

    @Override // qlm.a
    public final int d(Object obj2) {
        Object[] objArr = (Object[]) obj2;
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        return objArr.length;
    }

    @Override // qlm.a
    public final Object g(Object obj2) {
        Intrinsics.checkNotNullParameter(null, "<this>");
        zhm.p.c(null);
        throw null;
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return this.f247693c;
    }

    @Override // qlm.a
    public final Object h(Object obj2) {
        ArrayList arrayList = (ArrayList) obj2;
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        KClass eClass = this.f247692b;
        Intrinsics.checkNotNullParameter(eClass, "eClass");
        Object objNewInstance = Array.newInstance((Class<?>) nim.a.o(eClass), arrayList.size());
        Intrinsics.i(objNewInstance, "null cannot be cast to non-null type kotlin.Array<E of kotlinx.serialization.internal.PlatformKt.toNativeArrayImpl>");
        Object[] array = arrayList.toArray((Object[]) objNewInstance);
        Intrinsics.checkNotNullExpressionValue(array, "toArray(...)");
        return array;
    }

    @Override // qlm.t
    public final void i(int i, Object obj2, Object obj3) {
        ArrayList arrayList = (ArrayList) obj2;
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        arrayList.add(i, obj3);
    }
}
