package zim;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* JADX INFO: loaded from: classes14.dex */
public final class y0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f322724a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a1 f322725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z0 f322726c;

    public y0(z0 z0Var, a1 a1Var) {
        this.f322726c = z0Var;
        this.f322725b = a1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        KotlinClassHeader classHeader;
        switch (this.f322724a) {
            case 0:
                h2 h2Var = this.f322726c.f322732c;
                KProperty kProperty = z0.f322731g[0];
                ReflectKotlinClass reflectKotlinClass = (ReflectKotlinClass) h2Var.invoke();
                String multifileClassName = (reflectKotlinClass == null || (classHeader = reflectKotlinClass.getClassHeader()) == null) ? null : classHeader.getMultifileClassName();
                if (multifileClassName == null || multifileClassName.length() <= 0) {
                    return null;
                }
                return this.f322725b.f322585b.getClassLoader().loadClass(kotlin.text.a0.E(multifileClassName, '/', CoreConstants.DOT));
            default:
                h2 h2Var2 = this.f322726c.d;
                KProperty kProperty2 = z0.f322731g[1];
                Object objInvoke = h2Var2.invoke();
                Intrinsics.checkNotNullExpressionValue(objInvoke, "getValue(...)");
                return this.f322725b.o((MemberScope) objInvoke, j0.DECLARED);
        }
    }

    public y0(a1 a1Var, z0 z0Var) {
        this.f322725b = a1Var;
        this.f322726c = z0Var;
    }
}
