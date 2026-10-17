package e0f;

import com.revolut.data.model.Data;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import t61.c;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f121632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f121633b;

    public /* synthetic */ l(z zVar, int i) {
        this.f121632a = i;
        this.f121633b = zVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        t61.g gVarF;
        switch (this.f121632a) {
            case 0:
                t61.g it8 = (t61.g) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                this.f121633b.getClass();
                int i = it8.f268146p;
                return 5 - i <= 0 ? c.a.f268131a : new t61.d(5 - i);
            case 1:
                z zVar = this.f121633b;
                Data it9 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                try {
                    Object content = it9.getContent();
                    if (content != null) {
                        zVar.getClass();
                        gVarF = z.f((t61.g) content);
                    } else {
                        gVarF = null;
                    }
                    return new Data(gVarF, it9.getError(), it9.getLoading());
                } catch (Throwable th10) {
                    return new Data(null, th10, it9.getLoading());
                }
            case 2:
                z zVar2 = this.f121633b;
                p71.a aVar = zVar2.f121703a;
                if (obj2 != null) {
                    throw new ClassCastException();
                }
                Intrinsics.checkNotNullParameter(null, "params");
                return ((u21.k) aVar).c().g(((u21.k) aVar).b()).doOnNext(new k(new l(zVar2, 6), 13)).doOnError(new k(new l(zVar2, 7), 14));
            case 3:
                t61.k params = (t61.k) obj2;
                Intrinsics.checkNotNullParameter(params, "params");
                z zVar3 = this.f121633b;
                return zVar3.f121704b.o0(params.f268170b, params.f268171c).g(((u21.k) zVar3.f121703a).f(params).flatMap(new k(new doe.c(zVar3, params, 29), 10)).doOnNext(new k(new l(zVar3, 5), 12)));
            case 4:
                if (obj2 != null) {
                    throw new ClassCastException();
                }
                Intrinsics.checkNotNullParameter(null, "params");
                this.f121633b.f121709l.onNext(new Data(null, null, true, 3, null));
                throw null;
            case 5:
                this.f121633b.k.onNext((Data) obj2);
                return Unit.f186387a;
            case 6:
                List list = (List) ((Data) obj2).getContent();
                if (list != null) {
                    Iterator it10 = list.iterator();
                    if (it10.hasNext()) {
                        ((t61.g) it10.next()).getClass();
                        throw null;
                    }
                }
                this.f121633b.f121708j.onNext(new Data(null, null, false, 2, null));
                return Unit.f186387a;
            default:
                this.f121633b.f121708j.onNext(new Data(null, (Throwable) obj2, false, 5, null));
                return Unit.f186387a;
        }
    }
}
