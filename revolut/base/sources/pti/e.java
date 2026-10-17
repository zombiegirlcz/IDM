package pti;

import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftTerminal;
import com.revolut.retail.feature.airport.security_fast_track.impl.network.AsftAirportsService;
import ip0.v7;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class e {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AsftAirportsService f239733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f239734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f239735c;
    public final x4l.c d;
    public final x4l.c e;

    public e(AsftAirportsService service, ne0.j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f239733a = service;
        this.f239734b = memoryCache;
        this.f239735c = storage;
        Continuation continuation = null;
        final int i = 0;
        this.d = new x4l.c(new k3c.k(this, continuation, 29), new Function1(this) { // from class: pti.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f239728b;

            {
                this.f239728b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (bti.b) this.f239728b.f239734b.get("KEY_AIRPORT_CIPS_PAGE");
                    default:
                        String terminalId = (String) obj2;
                        Intrinsics.checkNotNullParameter(terminalId, "terminalId");
                        return (AsftTerminal) v7.r("KEY_TERMINAL_", terminalId, this.f239728b.f239734b);
                }
            }
        }, new Function2(this) { // from class: pti.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f239730b;

            {
                this.f239730b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        bti.b data = (bti.b) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data, "data");
                        this.f239730b.f239734b.f("KEY_AIRPORT_CIPS_PAGE", data);
                        break;
                    default:
                        String terminalId = (String) obj2;
                        AsftTerminal data2 = (AsftTerminal) obj3;
                        Intrinsics.checkNotNullParameter(terminalId, "terminalId");
                        Intrinsics.checkNotNullParameter(data2, "data");
                        this.f239730b.f239734b.f("KEY_TERMINAL_" + terminalId, data2);
                        break;
                }
                return Unit.f186387a;
            }
        }, new pnb.b(this, continuation, 12), new p24.q(this, continuation, 9));
        final int i2 = 1;
        this.e = new x4l.c(new d(this, continuation, 0), new Function1(this) { // from class: pti.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f239728b;

            {
                this.f239728b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (bti.b) this.f239728b.f239734b.get("KEY_AIRPORT_CIPS_PAGE");
                    default:
                        String terminalId = (String) obj2;
                        Intrinsics.checkNotNullParameter(terminalId, "terminalId");
                        return (AsftTerminal) v7.r("KEY_TERMINAL_", terminalId, this.f239728b.f239734b);
                }
            }
        }, new Function2(this) { // from class: pti.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f239730b;

            {
                this.f239730b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        bti.b data = (bti.b) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data, "data");
                        this.f239730b.f239734b.f("KEY_AIRPORT_CIPS_PAGE", data);
                        break;
                    default:
                        String terminalId = (String) obj2;
                        AsftTerminal data2 = (AsftTerminal) obj3;
                        Intrinsics.checkNotNullParameter(terminalId, "terminalId");
                        Intrinsics.checkNotNullParameter(data2, "data");
                        this.f239730b.f239734b.f("KEY_TERMINAL_" + terminalId, data2);
                        break;
                }
                return Unit.f186387a;
            }
        }, new pqc.k(this, continuation, 15), new pfk.q(this, continuation, 11));
    }
}
