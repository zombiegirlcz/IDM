package l3l;

import com.revolut.retail.core.navigation.NaviCommand;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import rfm.y;
import skm.p0;
import te0.w;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f191975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f191976b;

    public /* synthetic */ p(s sVar, int i) {
        this.f191975a = i;
        this.f191976b = sVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f191975a) {
            case 0:
                String it8 = (String) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return w.o0(p0.f264003c, new l34.a(this.f191976b, it8, null, 1));
            case 1:
                Long autoFinishTimeout = (Long) obj2;
                Intrinsics.checkNotNullParameter(autoFinishTimeout, "autoFinishTimeout");
                return efm.b.A(autoFinishTimeout.longValue(), TimeUnit.MILLISECONDS, hhm.f.f152430b).l(new o(this.f191976b, 1));
            case 2:
                ihm.f fVar = this.f191976b.f191979a.f191962c;
                Unit unit = Unit.f186387a;
                fVar.onNext(unit);
                return unit;
            case 3:
                NaviCommand naviCommand = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(naviCommand, "naviCommand");
                s sVar = this.f191976b;
                efm.k kVarFirstElement = ((t) sVar.f191979a.f191961b).i.c(te0.s.f270018a).firstElement();
                l2d.b bVar = new l2d.b(new p(sVar, 4), 25);
                kVarFirstElement.getClass();
                dfm.c cVar = mfm.f.d;
                return new y(kVarFirstElement, cVar, bVar, cVar, mfm.f.f205043c);
            default:
                ho.n nVar = (ho.n) obj2;
                ho.t tVar = this.f191976b.f191980b;
                Intrinsics.h(nVar);
                tVar.e2(nVar);
                return Unit.f186387a;
        }
    }
}
