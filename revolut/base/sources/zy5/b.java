package zy5;

import hha.w0;
import java.time.LocalDate;
import kjk.q;
import kjk.t;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import org.joda.time.DateTime;
import te0.w;
import wik.u;
import wim.z;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f326371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f326372b;

    public /* synthetic */ b(f fVar, int i) {
        this.f326371a = i;
        this.f326372b = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f326371a) {
            case 0:
                od0.i optionalIntro = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(optionalIntro, "optionalIntro");
                if (!optionalIntro.d()) {
                    return w.h(optionalIntro);
                }
                u uVar = this.f326372b.e;
                egk.b source = egk.b.HOME;
                Intrinsics.checkNotNullParameter(source, "source");
                t tVar = uVar.f297938a;
                tVar.getClass();
                Intrinsics.checkNotNullParameter(source, "source");
                return tVar.a(source).map(new zx0.b(new c(0, optionalIntro), 24));
            default:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                w0 planTier = (w0) pair.f186385a;
                DateTime dateTime = (DateTime) pair.f186386b;
                ola.c cVarA = f.a(planTier);
                od0.i iVar = od0.i.f224256b;
                if (cVarA == null) {
                    od0.i.Companion.getClass();
                    return w.h(iVar);
                }
                f fVar = this.f326372b;
                LocalDate localDateMinusDays = ((l80.f) fVar.f326378b).e().minusDays(1L);
                Intrinsics.checkNotNullExpressionValue(localDateMinusDays, "minusDays(...)");
                if (dateTime.isBefore(oc.c.F(localDateMinusDays))) {
                    od0.i.Companion.getClass();
                    return w.h(iVar);
                }
                rul.e eVar = fVar.d;
                Intrinsics.checkNotNullParameter(planTier, "planTier");
                t tVar2 = (t) eVar.f257630b;
                tVar2.getClass();
                Intrinsics.checkNotNullParameter(planTier, "planTier");
                xe0.e eVar2 = tVar2.f184467a;
                t.Companion.getClass();
                return rd0.e.c(new a44.c(ue0.e.R(eVar2, q.a(planTier), z.d(o0.b(Long.TYPE))), 13), kotlin.coroutines.g.f186406a).map(new zx0.b(new zp5.f(planTier, dateTime, 23), 20));
        }
    }
}
