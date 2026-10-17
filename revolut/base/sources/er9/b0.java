package er9;

import com.revolut.feature.payments.groups.impl.data.network.services.PaymentsGroupsSuggestionsService;
import com.youTransactor.uCube.rpc.Constants;
import efm.d0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class b0 {

    @NotNull
    public static final a0 Companion = new a0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentsGroupsSuggestionsService f128558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f128559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qe0.q f128560c;

    public b0(PaymentsGroupsSuggestionsService service, ne0.j memoryCache, l80.e dateTimeProvider) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(dateTimeProvider, "dateTimeProvider");
        this.f128558a = service;
        this.f128559b = memoryCache;
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: er9.z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b0 f128614b;

            {
                this.f128614b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        String key = (String) obj2;
                        Long l2 = (Long) obj3;
                        l2.longValue();
                        Intrinsics.checkNotNullParameter(key, "key");
                        this.f128614b.f128559b.f(key, l2);
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        b0 b0Var = this.f128614b;
                        d0<List<cr9.d0>> groupSuggestions = b0Var.f128558a.getGroupSuggestions();
                        k kVar = new k(25, new eqd.h(14));
                        groupSuggestions.getClass();
                        ufm.f fVar = new ufm.f(new ufm.i(groupSuggestions, kVar, 1), new k(26, new y(b0Var, 0)), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar, "doOnSuccess(...)");
                        return fVar;
                    default:
                        List groupSuggestions2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(groupSuggestions2, "groupSuggestions");
                        this.f128614b.f128559b.f("CACHE_KEY_SUGGESTIONS", groupSuggestions2);
                        return Unit.f186387a;
                }
            }
        };
        final int i2 = 1;
        this.f128560c = new qe0.q(function2, new y(this, 1), 30000L, dateTimeProvider);
        Function2 function22 = new Function2(this) { // from class: er9.z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b0 f128614b;

            {
                this.f128614b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        String key = (String) obj2;
                        Long l2 = (Long) obj3;
                        l2.longValue();
                        Intrinsics.checkNotNullParameter(key, "key");
                        this.f128614b.f128559b.f(key, l2);
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        b0 b0Var = this.f128614b;
                        d0<List<cr9.d0>> groupSuggestions = b0Var.f128558a.getGroupSuggestions();
                        k kVar = new k(25, new eqd.h(14));
                        groupSuggestions.getClass();
                        ufm.f fVar = new ufm.f(new ufm.i(groupSuggestions, kVar, 1), new k(26, new y(b0Var, 0)), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar, "doOnSuccess(...)");
                        return fVar;
                    default:
                        List groupSuggestions2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(groupSuggestions2, "groupSuggestions");
                        this.f128614b.f128559b.f("CACHE_KEY_SUGGESTIONS", groupSuggestions2);
                        return Unit.f186387a;
                }
            }
        };
        final int i3 = 2;
        new w4l.f(function22, new y(this, 2), new Function2(this) { // from class: er9.z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b0 f128614b;

            {
                this.f128614b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        String key = (String) obj2;
                        Long l2 = (Long) obj3;
                        l2.longValue();
                        Intrinsics.checkNotNullParameter(key, "key");
                        this.f128614b.f128559b.f(key, l2);
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        b0 b0Var = this.f128614b;
                        d0<List<cr9.d0>> groupSuggestions = b0Var.f128558a.getGroupSuggestions();
                        k kVar = new k(25, new eqd.h(14));
                        groupSuggestions.getClass();
                        ufm.f fVar = new ufm.f(new ufm.i(groupSuggestions, kVar, 1), new k(26, new y(b0Var, 0)), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar, "doOnSuccess(...)");
                        return fVar;
                    default:
                        List groupSuggestions2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(groupSuggestions2, "groupSuggestions");
                        this.f128614b.f128559b.f("CACHE_KEY_SUGGESTIONS", groupSuggestions2);
                        return Unit.f186387a;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
    }
}
