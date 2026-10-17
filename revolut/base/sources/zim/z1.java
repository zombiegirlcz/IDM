package zim;

import java.lang.reflect.Type;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;

/* JADX INFO: loaded from: classes14.dex */
public final class z1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f322733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c2 f322734b;

    public /* synthetic */ z1(c2 c2Var, int i) {
        this.f322733a = i;
        this.f322734b = c2Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f322733a) {
            case 0:
                c2 c2Var = this.f322734b;
                return c2Var.a(c2Var.f322615a);
            default:
                h2 h2Var = this.f322734b.f322617c;
                Type type = h2Var != null ? (Type) h2Var.invoke() : null;
                Intrinsics.h(type);
                return ReflectClassUtilKt.getParameterizedTypeArguments(type);
        }
    }
}
