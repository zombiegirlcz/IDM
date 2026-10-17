package oc0;

import com.revolut.core.backend_flow.repository.service.BackendFlowCardsService;
import com.revolut.feature.backend_flow.domain.models.BackendCard;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nfj.l1;

/* JADX INFO: loaded from: classes19.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ne0.j f224028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BackendFlowCardsService f224029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f224030c;
    public final x4l.c d;
    public final x4l.c e;

    public f(ne0.j memoryCache, BackendFlowCardsService service, ue0.c storage) {
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f224028a = memoryCache;
        this.f224029b = service;
        this.f224030c = storage;
        Continuation continuation = null;
        final int i = 0;
        this.d = new x4l.c(new o29.l(this, continuation, 6), new Function1(this) { // from class: oc0.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f224024b;

            {
                this.f224024b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        b params = (b) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (List) this.f224024b.f224028a.get(params.a());
                    default:
                        a params2 = (a) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return (BackendCard) this.f224024b.f224028a.get(params2.a());
                }
            }
        }, new Function2(this) { // from class: oc0.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f224026b;

            {
                this.f224026b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        b params = (b) obj2;
                        List cards = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(cards, "cards");
                        this.f224026b.f224028a.f(params.a(), cards);
                        break;
                    default:
                        a params2 = (a) obj2;
                        BackendCard cards2 = (BackendCard) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(cards2, "cards");
                        this.f224026b.f224028a.f(params2.a(), cards2);
                        break;
                }
                return Unit.f186387a;
            }
        }, new e(this, continuation, 1), new l1(this, continuation, 14));
        final int i2 = 1;
        this.e = new x4l.c(new o29.l(this, continuation, 5), new Function1(this) { // from class: oc0.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f224024b;

            {
                this.f224024b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        b params = (b) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (List) this.f224024b.f224028a.get(params.a());
                    default:
                        a params2 = (a) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return (BackendCard) this.f224024b.f224028a.get(params2.a());
                }
            }
        }, new Function2(this) { // from class: oc0.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f224026b;

            {
                this.f224026b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        b params = (b) obj2;
                        List cards = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(cards, "cards");
                        this.f224026b.f224028a.f(params.a(), cards);
                        break;
                    default:
                        a params2 = (a) obj2;
                        BackendCard cards2 = (BackendCard) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(cards2, "cards");
                        this.f224026b.f224028a.f(params2.a(), cards2);
                        break;
                }
                return Unit.f186387a;
            }
        }, new e(this, continuation, 0), new l1(this, continuation, 13));
    }

    public static vkm.d a(f fVar, a params) {
        fVar.getClass();
        Intrinsics.checkNotNullParameter(params, "params");
        w4l.h strategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        return fVar.e.b(params, strategy);
    }

    public static vkm.d b(f fVar, b params) {
        fVar.getClass();
        Intrinsics.checkNotNullParameter(params, "params");
        w4l.h strategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        return fVar.d.b(params, strategy);
    }
}
