package ha3;

import com.revolut.shared.cards.model.card_config.domain.CardDetailsDesignConfig;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import zhm.d0;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f150399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b93.b f150400b;

    public /* synthetic */ e(b93.b bVar, int i) {
        this.f150399a = i;
        this.f150400b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        Object next2;
        Object next3;
        switch (this.f150399a) {
            case 0:
                p5l.c cardsConfig = (p5l.c) obj2;
                Intrinsics.checkNotNullParameter(cardsConfig, "cardsConfig");
                Iterator it8 = cardsConfig.a().iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next = it8.next();
                        if (a0.z(((CardDetailsDesignConfig) next).f104700a, this.f150400b.f13615a, true)) {
                        }
                    } else {
                        next = null;
                    }
                }
                return (CardDetailsDesignConfig) next;
            case 1:
                List designs = (List) obj2;
                Intrinsics.checkNotNullParameter(designs, "designs");
                Iterator it9 = designs.iterator();
                while (true) {
                    if (it9.hasNext()) {
                        next2 = it9.next();
                        if (Intrinsics.f(((e93.f) next2).c(), this.f150400b)) {
                        }
                    } else {
                        next2 = null;
                    }
                }
                e93.f fVar = (e93.f) next2;
                if (fVar == null) {
                    fVar = (e93.f) d0.b0(designs);
                }
                return new Pair(designs, fVar);
            default:
                List allDesigns = (List) obj2;
                Intrinsics.checkNotNullParameter(allDesigns, "allDesigns");
                Iterator it10 = allDesigns.iterator();
                while (true) {
                    if (it10.hasNext()) {
                        next3 = it10.next();
                        if (Intrinsics.f(((e93.f) next3).c(), this.f150400b)) {
                        }
                    } else {
                        next3 = null;
                    }
                }
                e93.d dVar = next3 instanceof e93.d ? (e93.d) next3 : null;
                od0.h hVar = od0.i.Companion;
                e93.n nVar = dVar != null ? dVar.i : null;
                hVar.getClass();
                return od0.h.a(nVar);
        }
    }
}
