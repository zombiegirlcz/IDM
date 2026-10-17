package md9;

import ab4.q;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f204536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f204537b;

    public /* synthetic */ h(l lVar, int i) {
        this.f204536a = i;
        this.f204537b = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f204536a) {
            case 0:
                Intrinsics.checkNotNullParameter((ipa.j) obj2, "it");
                return this.f204537b.o.a();
            default:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                l lVar = this.f204537b;
                lVar.H2(lVar.f204547t, new q(it8, 28));
                return Boolean.TRUE;
        }
    }
}
