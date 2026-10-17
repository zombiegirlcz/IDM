package zim;

import java.util.Collection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.km.internal.ReadersKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;

/* JADX INFO: loaded from: classes14.dex */
public final class y implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f322722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0 f322723b;

    public /* synthetic */ y(b0 b0Var, int i) {
        this.f322722a = i;
        this.f322723b = b0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f322722a) {
            case 0:
                ClassDescriptor classDescriptorB = this.f322723b.b();
                DeserializedClassDescriptor deserializedClassDescriptor = classDescriptorB instanceof DeserializedClassDescriptor ? (DeserializedClassDescriptor) classDescriptorB : null;
                if (deserializedClassDescriptor != null) {
                    return ReadersKt.toKmClass$default(deserializedClassDescriptor.getClassProto(), deserializedClassDescriptor.getC().getNameResolver(), false, null, 6, null);
                }
                return null;
            case 1:
                b0 b0Var = this.f322723b;
                Collection collectionA = b0Var.a();
                h2 h2Var = b0Var.f322597n;
                KProperty kProperty = b0.f322590r[11];
                Object objInvoke = h2Var.invoke();
                Intrinsics.checkNotNullExpressionValue(objInvoke, "getValue(...)");
                return zhm.d0.E0((Collection) objInvoke, collectionA);
            case 2:
                b0 b0Var2 = this.f322723b;
                h2 h2Var2 = b0Var2.f322596m;
                KProperty[] kPropertyArr = b0.f322590r;
                KProperty kProperty2 = kPropertyArr[10];
                Object objInvoke2 = h2Var2.invoke();
                Intrinsics.checkNotNullExpressionValue(objInvoke2, "getValue(...)");
                h2 h2Var3 = b0Var2.o;
                KProperty kProperty3 = kPropertyArr[12];
                Object objInvoke3 = h2Var3.invoke();
                Intrinsics.checkNotNullExpressionValue(objInvoke3, "getValue(...)");
                return zhm.d0.E0((Collection) objInvoke3, (Collection) objInvoke2);
            case 3:
                b0 b0Var3 = this.f322723b;
                Collection collectionA2 = b0Var3.a();
                h2 h2Var4 = b0Var3.f322596m;
                KProperty kProperty4 = b0.f322590r[10];
                Object objInvoke4 = h2Var4.invoke();
                Intrinsics.checkNotNullExpressionValue(objInvoke4, "getValue(...)");
                return zhm.d0.E0((Collection) objInvoke4, collectionA2);
            default:
                b0 b0Var4 = this.f322723b;
                h2 h2Var5 = b0Var4.f322598p;
                KProperty[] kPropertyArr2 = b0.f322590r;
                KProperty kProperty5 = kPropertyArr2[13];
                Object objInvoke5 = h2Var5.invoke();
                Intrinsics.checkNotNullExpressionValue(objInvoke5, "getValue(...)");
                h2 h2Var6 = b0Var4.f322599q;
                KProperty kProperty6 = kPropertyArr2[14];
                Object objInvoke6 = h2Var6.invoke();
                Intrinsics.checkNotNullExpressionValue(objInvoke6, "getValue(...)");
                return zhm.d0.E0((Collection) objInvoke6, (Collection) objInvoke5);
        }
    }
}
