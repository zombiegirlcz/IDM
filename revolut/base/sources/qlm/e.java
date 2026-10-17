package qlm;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes13.dex */
public final class e extends u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f247633b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(KSerializer element) {
        super(element);
        Intrinsics.checkNotNullParameter(element, "element");
        SerialDescriptor elementDesc = element.getDescriptor();
        Intrinsics.checkNotNullParameter(elementDesc, "elementDesc");
        this.f247633b = new d(elementDesc);
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
    public final Object g(Object obj2) {
        Intrinsics.checkNotNullParameter(null, "<this>");
        return new ArrayList((Collection) null);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return this.f247633b;
    }

    @Override // qlm.a
    public final Object h(Object obj2) {
        ArrayList arrayList = (ArrayList) obj2;
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        return arrayList;
    }

    @Override // qlm.t
    public final void i(int i, Object obj2, Object obj3) {
        ArrayList arrayList = (ArrayList) obj2;
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        arrayList.add(i, obj3);
    }
}
