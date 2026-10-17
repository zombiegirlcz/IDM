package zim;

import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeModuleData;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* JADX INFO: loaded from: classes14.dex */
public final class x0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f322720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z0 f322721b;

    public /* synthetic */ x0(z0 z0Var, int i) {
        this.f322720a = i;
        this.f322721b = z0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        KotlinClassHeader classHeader;
        switch (this.f322720a) {
            case 0:
                z0 z0Var = this.f322721b;
                h2 h2Var = z0Var.f322732c;
                KProperty kProperty = z0.f322731g[0];
                ReflectKotlinClass reflectKotlinClass = (ReflectKotlinClass) h2Var.invoke();
                if (reflectKotlinClass == null) {
                    return MemberScope.Empty.INSTANCE;
                }
                h2 h2Var2 = z0Var.f322648a;
                KProperty kProperty2 = i0.f322647b[0];
                Object objInvoke = h2Var2.invoke();
                Intrinsics.checkNotNullExpressionValue(objInvoke, "getValue(...)");
                return ((RuntimeModuleData) objInvoke).getPackagePartScopeCache().getPackagePartScope(reflectKotlinClass);
            default:
                h2 h2Var3 = this.f322721b.f322732c;
                KProperty kProperty3 = z0.f322731g[0];
                ReflectKotlinClass reflectKotlinClass2 = (ReflectKotlinClass) h2Var3.invoke();
                if (reflectKotlinClass2 != null && (classHeader = reflectKotlinClass2.getClassHeader()) != null) {
                    String[] data = classHeader.getData();
                    String[] strings = classHeader.getStrings();
                    if (data != null && strings != null) {
                        Pair<JvmNameResolver, ProtoBuf.Package> packageDataFrom = JvmProtoBufUtil.readPackageDataFrom(data, strings);
                        return new yhm.r((JvmNameResolver) packageDataFrom.f186385a, (ProtoBuf.Package) packageDataFrom.f186386b, classHeader.getMetadataVersion());
                    }
                }
                return null;
        }
    }
}
