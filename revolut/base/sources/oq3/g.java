package oq3;

import efm.d0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f227712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pfm.h f227713b;

    public /* synthetic */ g(pfm.h hVar, int i) {
        this.f227712a = i;
        this.f227713b = hVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f227712a) {
            case 0:
                it3.d it8 = (it3.d) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return this.f227713b;
            default:
                Boolean isAvailable = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(isAvailable, "isAvailable");
                if (!isAvailable.booleanValue()) {
                    return d0.m(Boolean.FALSE);
                }
                return this.f227713b.f(d0.m(Boolean.TRUE));
        }
    }
}
