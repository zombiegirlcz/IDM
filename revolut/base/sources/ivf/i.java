package ivf;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import s6e.v;
import vkm.y;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f168847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f168848b;

    public /* synthetic */ i(r rVar, int i) {
        this.f168847a = i;
        this.f168848b = rVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List it8 = (List) obj2;
        switch (this.f168847a) {
            case 0:
                Intrinsics.checkNotNullParameter(it8, "it");
                suf.h hVar = this.f168848b.f168858a;
                return new v(rd0.e.b(hVar.f265754b.b()), hVar, 15);
            default:
                Intrinsics.checkNotNullParameter(it8, "initialList");
                suf.h hVar2 = this.f168848b.f168858a;
                return new y(new l(it8, 0, null), new v(rd0.e.b(hVar2.f265754b.b()), hVar2, 15));
        }
    }
}
