package m2j;

import com.revolut.data.model.Data;
import java.util.List;
import java.util.Optional;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f202023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f202024b;

    public /* synthetic */ e(j jVar, int i) {
        this.f202023a = i;
        this.f202024b = jVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f202023a) {
            case 0:
                c it8 = (c) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                this.f202024b.getClass();
                if (it8 instanceof b) {
                    Optional optionalOf = Optional.of(((b) it8).f202014a);
                    Intrinsics.checkNotNullExpressionValue(optionalOf, "of(...)");
                    return optionalOf;
                }
                if (!Intrinsics.f(it8, a.f202010a)) {
                    throw new NoWhenBranchMatchedException();
                }
                Optional optionalEmpty = Optional.empty();
                Intrinsics.checkNotNullExpressionValue(optionalEmpty, "empty(...)");
                return optionalEmpty;
            default:
                List source = (List) obj2;
                Intrinsics.checkNotNullParameter(source, "it");
                su9.c cVar = this.f202024b.f202047c;
                Intrinsics.checkNotNullParameter(source, "source");
                wa7.m mVar = (wa7.m) cVar.f265693a;
                if (mVar.c()) {
                    efm.r map = rd0.e.c(mVar.k(), kotlin.coroutines.g.f186406a).map(new w4l.c(new w38.v(source, cVar, 16), 14));
                    Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                    return map;
                }
                efm.r rVarJust = efm.r.just(new Data(source, null, false, 6, null));
                Intrinsics.checkNotNullExpressionValue(rVarJust, "just(...)");
                return rVarJust;
        }
    }
}
