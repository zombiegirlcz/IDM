package tff;

import com.revolut.feature.transaction.troubleshooter.impl.network.TransactionTroubleshooterService;
import ehe.n;
import ip0.v7;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import nfj.i;
import org.jetbrains.annotations.NotNull;
import sne.e;

/* JADX INFO: loaded from: classes8.dex */
public final class d {

    @NotNull
    private static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransactionTroubleshooterService f270306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uff.b f270307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f270308c;
    public final ue0.c d;
    public final x4l.c e;
    public final x4l.c f;

    public d(TransactionTroubleshooterService troubleshooterService, uff.b troubleshooterMapper, j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(troubleshooterService, "troubleshooterService");
        Intrinsics.checkNotNullParameter(troubleshooterMapper, "troubleshooterMapper");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f270306a = troubleshooterService;
        this.f270307b = troubleshooterMapper;
        this.f270308c = memoryCache;
        this.d = storage;
        Continuation continuation = null;
        final int i = 0;
        this.e = new x4l.c(new pti.d(this, continuation, 27), new Function1(this) { // from class: tff.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f270303b;

            {
                this.f270303b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        rff.a params = (rff.a) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (List) this.f270303b.f270308c.get(d.a(params));
                    default:
                        String scenario = (String) obj2;
                        Intrinsics.checkNotNullParameter(scenario, "scenario");
                        return (List) v7.r("TROUBLESHOOTER_BY_SCENARIO_KEY_PREFIX_", scenario, this.f270303b.f270308c);
                }
            }
        }, new Function2(this) { // from class: tff.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f270305b;

            {
                this.f270305b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        rff.a params = (rff.a) obj2;
                        List troubleshooterList = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(troubleshooterList, "troubleshooterList");
                        this.f270305b.f270308c.f(d.a(params), troubleshooterList);
                        break;
                    default:
                        String scenario = (String) obj2;
                        List ids = (List) obj3;
                        Intrinsics.checkNotNullParameter(scenario, "scenario");
                        Intrinsics.checkNotNullParameter(ids, "ids");
                        n.z("TROUBLESHOOTER_BY_SCENARIO_KEY_PREFIX_", scenario, this.f270305b.f270308c, ids);
                        break;
                }
                return Unit.f186387a;
            }
        }, new t9h.b(this, continuation, 13), new e(this, continuation, 2));
        final int i2 = 1;
        this.f = new x4l.c(new pti.d(this, continuation, 26), new Function1(this) { // from class: tff.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f270303b;

            {
                this.f270303b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        rff.a params = (rff.a) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (List) this.f270303b.f270308c.get(d.a(params));
                    default:
                        String scenario = (String) obj2;
                        Intrinsics.checkNotNullParameter(scenario, "scenario");
                        return (List) v7.r("TROUBLESHOOTER_BY_SCENARIO_KEY_PREFIX_", scenario, this.f270303b.f270308c);
                }
            }
        }, new Function2(this) { // from class: tff.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f270305b;

            {
                this.f270305b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        rff.a params = (rff.a) obj2;
                        List troubleshooterList = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(troubleshooterList, "troubleshooterList");
                        this.f270305b.f270308c.f(d.a(params), troubleshooterList);
                        break;
                    default:
                        String scenario = (String) obj2;
                        List ids = (List) obj3;
                        Intrinsics.checkNotNullParameter(scenario, "scenario");
                        Intrinsics.checkNotNullParameter(ids, "ids");
                        n.z("TROUBLESHOOTER_BY_SCENARIO_KEY_PREFIX_", scenario, this.f270305b.f270308c, ids);
                        break;
                }
                return Unit.f186387a;
            }
        }, new rp1.c(2, 6, null), new i(3, 21, continuation));
    }

    public static String a(rff.a aVar) {
        return "TROUBLESHOOTER_KEY_" + aVar.getEntityId() + aVar.getLabels();
    }
}
