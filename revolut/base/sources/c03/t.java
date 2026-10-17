package c03;

import ha3.x;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import skm.p0;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class t implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f20143b;

    public /* synthetic */ t(w wVar, int i) {
        this.f20142a = i;
        this.f20143b = wVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String id10 = (String) obj2;
        switch (this.f20142a) {
            case 0:
                Intrinsics.checkNotNullParameter(id10, "it");
                x xVar = (x) this.f20143b.f20148b;
                xVar.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                return te0.w.o0(p0.f264003c, new ha3.s(xVar, id10, null, 14));
            case 1:
                Intrinsics.checkNotNullParameter(id10, "it");
                x xVar2 = (x) this.f20143b.f20148b;
                xVar2.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                return pd.b.n(p0.f264003c, new ha3.s(xVar2, id10, null, 13));
            default:
                Intrinsics.checkNotNullParameter(id10, "it");
                return ((x) this.f20143b.f20148b).F(id10);
        }
    }
}
