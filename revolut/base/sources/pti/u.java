package pti;

import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftPass;
import com.revolut.retail.feature.airport.security_fast_track.impl.network.AsftPassesService;
import ip0.v7;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;

/* JADX INFO: loaded from: classes10.dex */
public final class u {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AsftPassesService f239758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f239759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f239760c;
    public final l80.e d;
    public final sf0.h e;
    public final x4l.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x4l.c f239761g;

    public u(AsftPassesService service, ne0.j memoryCache, ue0.c storage, l80.e dateProvider, sf0.h serverErrorParser) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        this.f239758a = service;
        this.f239759b = memoryCache;
        this.f239760c = storage;
        this.d = dateProvider;
        this.e = serverErrorParser;
        final int i = 0;
        Continuation continuation = null;
        this.f = new x4l.c(new s(this, continuation, i), new Function1(this) { // from class: pti.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u f239750b;

            {
                this.f239750b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f239750b.f239759b.get("KEY_PASSES");
                    default:
                        String passId = (String) obj2;
                        Intrinsics.checkNotNullParameter(passId, "passId");
                        return (AsftPass) v7.r("KEY_PASS_", passId, this.f239750b.f239759b);
                }
            }
        }, new Function2(this) { // from class: pti.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u f239752b;

            {
                this.f239752b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        List data = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data, "data");
                        this.f239752b.f239759b.f("KEY_PASSES", data);
                        break;
                    default:
                        String passId = (String) obj2;
                        AsftPass data2 = (AsftPass) obj3;
                        Intrinsics.checkNotNullParameter(passId, "passId");
                        Intrinsics.checkNotNullParameter(data2, "data");
                        this.f239752b.f239759b.f("KEY_PASS_" + passId, data2);
                        break;
                }
                return Unit.f186387a;
            }
        }, new pnb.b(this, continuation, 13), new p24.q(this, continuation, 12));
        final int i2 = 1;
        this.f239761g = new x4l.c(new d(this, continuation, i2), new Function1(this) { // from class: pti.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u f239750b;

            {
                this.f239750b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f239750b.f239759b.get("KEY_PASSES");
                    default:
                        String passId = (String) obj2;
                        Intrinsics.checkNotNullParameter(passId, "passId");
                        return (AsftPass) v7.r("KEY_PASS_", passId, this.f239750b.f239759b);
                }
            }
        }, new Function2(this) { // from class: pti.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u f239752b;

            {
                this.f239752b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        List data = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data, "data");
                        this.f239752b.f239759b.f("KEY_PASSES", data);
                        break;
                    default:
                        String passId = (String) obj2;
                        AsftPass data2 = (AsftPass) obj3;
                        Intrinsics.checkNotNullParameter(passId, "passId");
                        Intrinsics.checkNotNullParameter(data2, "data");
                        this.f239752b.f239759b.f("KEY_PASS_" + passId, data2);
                        break;
                }
                return Unit.f186387a;
            }
        }, new pqc.k(this, continuation, 16), new pfk.q(this, continuation, 12));
    }

    public static final kotlin.time.b a(u uVar, Response response, String str) {
        Long lN;
        uVar.getClass();
        String strA = response.headers().a(str);
        if (strA == null || (lN = kotlin.text.z.n(strA)) == null) {
            return null;
        }
        return new kotlin.time.b(kotlin.time.c.h(Math.abs(lN.longValue()), pkm.e.SECONDS));
    }
}
