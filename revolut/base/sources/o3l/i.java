package o3l;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f221852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f221853b;

    public /* synthetic */ i(j jVar, int i) {
        this.f221852a = i;
        this.f221853b = jVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        CharSequence it8 = (CharSequence) obj2;
        switch (this.f221852a) {
            case 0:
                Intrinsics.checkNotNullParameter(it8, "it");
                j jVar = this.f221853b;
                return o70.a.f(jVar.f221854a.p0().c(te0.s.f270018a)).doOnNext(new o28.g(new i(jVar, 1), 21));
            default:
                c70.a aVar = this.f221853b.f221855b;
                Intrinsics.h(it8);
                c70.a.b(aVar, "", it8, false, 4);
                return Unit.f186387a;
        }
    }
}
