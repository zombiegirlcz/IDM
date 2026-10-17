package k2a;

import cie.k1;
import com.revolut.feature.payments.transfers.personalisation.impl.data.service.TransfersPersonalisationService;
import com.revolut.feature.payments.transfers.personalisation.models.P2pPersonalisation;
import gcc.f;
import ghl.l;
import ip0.v7;
import java.util.List;
import jkh.g;
import jv.o;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f180448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f180449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TransfersPersonalisationService f180450c;
    public final x4l.c d;
    public final x4l.c e;

    public d(j memoryCache, ue0.c storage, TransfersPersonalisationService service) {
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(service, "service");
        this.f180448a = memoryCache;
        this.f180449b = storage;
        this.f180450c = service;
        Continuation continuation = null;
        final int i = 0;
        this.d = new x4l.c(new l(this, continuation, 27), new Function1(this) { // from class: k2a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f180445b;

            {
                this.f180445b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        String uuid = (String) obj2;
                        Intrinsics.checkNotNullParameter(uuid, "uuid");
                        return (P2pPersonalisation) v7.r("PERSONALISATION_KEY_", uuid, this.f180445b.f180448a);
                    default:
                        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                        return (List) this.f180445b.f180448a.get("PERSONALISATIONS_KEY_" + zBooleanValue);
                }
            }
        }, new Function2(this) { // from class: k2a.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f180447b;

            {
                this.f180447b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        String uuid = (String) obj2;
                        P2pPersonalisation domain = (P2pPersonalisation) obj3;
                        Intrinsics.checkNotNullParameter(uuid, "uuid");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f180447b.f180448a.f("PERSONALISATION_KEY_" + uuid, domain);
                        break;
                    default:
                        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                        List list = (List) obj3;
                        Intrinsics.checkNotNullParameter(list, "list");
                        this.f180447b.f180448a.f("PERSONALISATIONS_KEY_" + zBooleanValue, list);
                        break;
                }
                return Unit.f186387a;
            }
        }, new o(this, continuation, 14), new j40.d(this, continuation, 9));
        final int i2 = 1;
        this.e = new x4l.c(new f(this, null, 2), new Function1(this) { // from class: k2a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f180445b;

            {
                this.f180445b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        String uuid = (String) obj2;
                        Intrinsics.checkNotNullParameter(uuid, "uuid");
                        return (P2pPersonalisation) v7.r("PERSONALISATION_KEY_", uuid, this.f180445b.f180448a);
                    default:
                        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                        return (List) this.f180445b.f180448a.get("PERSONALISATIONS_KEY_" + zBooleanValue);
                }
            }
        }, new Function2(this) { // from class: k2a.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f180447b;

            {
                this.f180447b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        String uuid = (String) obj2;
                        P2pPersonalisation domain = (P2pPersonalisation) obj3;
                        Intrinsics.checkNotNullParameter(uuid, "uuid");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f180447b.f180448a.f("PERSONALISATION_KEY_" + uuid, domain);
                        break;
                    default:
                        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                        List list = (List) obj3;
                        Intrinsics.checkNotNullParameter(list, "list");
                        this.f180447b.f180448a.f("PERSONALISATIONS_KEY_" + zBooleanValue, list);
                        break;
                }
                return Unit.f186387a;
            }
        }, new g(this, continuation, 2), new k1(this, continuation, 1));
    }
}
