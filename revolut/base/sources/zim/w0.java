package zim;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass;

/* JADX INFO: loaded from: classes14.dex */
public final class w0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f322718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a1 f322719b;

    public /* synthetic */ w0(a1 a1Var, int i) {
        this.f322718a = i;
        this.f322719b = a1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f322718a) {
            case 0:
                return new z0(this.f322719b);
            default:
                return ReflectKotlinClass.Factory.create(this.f322719b.f322585b);
        }
    }
}
