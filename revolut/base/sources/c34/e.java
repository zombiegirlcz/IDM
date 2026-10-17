package c34;

import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import com.youTransactor.uCube.rpc.Constants;
import efm.d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mp.p;
import org.jetbrains.annotations.NotNull;
import pu3.g;
import ufm.i;
import w4l.f;

/* JADX INFO: loaded from: classes22.dex */
public final class e {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f20872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreditPluginsService f20873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final osg.b f20874c;
    public final ne0.d d;
    public final f e;

    public e(p creditApplicationDtoMapper, CreditPluginsService creditApplicationService, osg.b walletInteractor, ne0.d memoryCache) {
        Intrinsics.checkNotNullParameter(creditApplicationDtoMapper, "creditApplicationDtoMapper");
        Intrinsics.checkNotNullParameter(creditApplicationService, "creditApplicationService");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f20872a = creditApplicationDtoMapper;
        this.f20873b = creditApplicationService;
        this.f20874c = walletInteractor;
        this.d = memoryCache;
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: c34.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f20868b;

            {
                this.f20868b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        js3.a params = (js3.a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        e eVar = this.f20868b;
                        d0<r04.c> outstandingDebts = eVar.f20873b.getOutstandingDebts(params.f178118b);
                        c2i.c cVar = new c2i.c(new a(eVar, 0), 11);
                        outstandingDebts.getClass();
                        i iVar = new i(outstandingDebts, cVar, 0);
                        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                        return iVar;
                    default:
                        js3.a params2 = (js3.a) obj2;
                        g content = (g) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(content, "content");
                        if ((!content.f239813a.isEmpty() ? content : null) != null) {
                            this.f20868b.d.f(params2.a(), content);
                        }
                        return Unit.f186387a;
                }
            }
        };
        final int i2 = 1;
        this.e = new f(function2, new a(this, i2), new Function2(this) { // from class: c34.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f20868b;

            {
                this.f20868b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        js3.a params = (js3.a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        e eVar = this.f20868b;
                        d0<r04.c> outstandingDebts = eVar.f20873b.getOutstandingDebts(params.f178118b);
                        c2i.c cVar = new c2i.c(new a(eVar, 0), 11);
                        outstandingDebts.getClass();
                        i iVar = new i(outstandingDebts, cVar, 0);
                        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                        return iVar;
                    default:
                        js3.a params2 = (js3.a) obj2;
                        g content = (g) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(content, "content");
                        if ((!content.f239813a.isEmpty() ? content : null) != null) {
                            this.f20868b.d.f(params2.a(), content);
                        }
                        return Unit.f186387a;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
    }
}
