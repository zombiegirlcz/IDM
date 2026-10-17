package vkc;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f289904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.rfi_tool.impl.navigation.b f289905b;

    public /* synthetic */ f(com.revolut.feature.rfi_tool.impl.navigation.b bVar, int i) {
        this.f289904a = i;
        this.f289905b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Throwable th10 = (Throwable) obj2;
        switch (this.f289904a) {
            case 0:
                Intrinsics.checkNotNullParameter(th10, "<unused var>");
                this.f289905b.M2();
                break;
            default:
                Intrinsics.checkNotNullParameter(th10, "<unused var>");
                this.f289905b.M2();
                break;
        }
        return Boolean.TRUE;
    }
}
