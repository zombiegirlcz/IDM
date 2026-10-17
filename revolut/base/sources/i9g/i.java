package i9g;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f159802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f159803b;

    public /* synthetic */ i(l lVar, int i) {
        this.f159802a = i;
        this.f159803b = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        afi.a it8 = (afi.a) obj2;
        switch (this.f159802a) {
            case 0:
                Intrinsics.checkNotNullParameter(it8, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it8, "it");
                break;
        }
        return new pfm.z(this.f159803b.f159811a.a(it8), 0, new h4d.d(it8, 8), null);
    }
}
