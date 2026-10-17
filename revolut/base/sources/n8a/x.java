package n8a;

import com.revolut.feature.pix.impl.data.network.PixAuthorisationsService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class x {

    @NotNull
    public static final v Companion = new v();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PixAuthorisationsService f213354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.d f213355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x4l.c f213356c;
    public final x4l.c d;
    public final x4l.c e;

    public x(PixAuthorisationsService service, ne0.d memoryCache) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f213354a = service;
        this.f213355b = memoryCache;
        Continuation continuation = null;
        final int i = 0;
        int i2 = 3;
        this.f213356c = new x4l.c(new w(this, continuation, 1), new Function1(this) { // from class: n8a.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f213350b;

            {
                this.f213350b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        return (g8a.b) this.f213350b.f213355b.get("PENDING_AUTHORISATIONS_KEY");
                    case 1:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        return (g8a.b) this.f213350b.f213355b.get("INACTIVE_AUTHORISATIONS_KEY");
                    default:
                        String authorisationId = (String) obj2;
                        Intrinsics.checkNotNullParameter(authorisationId, "authorisationId");
                        return (g8a.k) v1.c.s("AUTHORISATION_KEY_", authorisationId, this.f213350b.f213355b);
                }
            }
        }, new Function2(this) { // from class: n8a.u

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f213352b;

            {
                this.f213352b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        g8a.b data = (g8a.b) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data, "data");
                        this.f213352b.f213355b.f("PENDING_AUTHORISATIONS_KEY", data);
                        break;
                    case 1:
                        g8a.b data2 = (g8a.b) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data2, "data");
                        this.f213352b.f213355b.f("INACTIVE_AUTHORISATIONS_KEY", data2);
                        break;
                    default:
                        String authorisationId = (String) obj2;
                        g8a.k data3 = (g8a.k) obj3;
                        Intrinsics.checkNotNullParameter(authorisationId, "authorisationId");
                        Intrinsics.checkNotNullParameter(data3, "data");
                        this.f213352b.f213355b.f("AUTHORISATION_KEY_" + authorisationId, data3);
                        break;
                }
                return Unit.f186387a;
            }
        }, new mqc.p(2, 6, null), new k3c.l(i2, 27, continuation));
        final int i3 = 1;
        this.d = new x4l.c(new w(this, continuation, 0), new Function1(this) { // from class: n8a.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f213350b;

            {
                this.f213350b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i3) {
                    case 0:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        return (g8a.b) this.f213350b.f213355b.get("PENDING_AUTHORISATIONS_KEY");
                    case 1:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        return (g8a.b) this.f213350b.f213355b.get("INACTIVE_AUTHORISATIONS_KEY");
                    default:
                        String authorisationId = (String) obj2;
                        Intrinsics.checkNotNullParameter(authorisationId, "authorisationId");
                        return (g8a.k) v1.c.s("AUTHORISATION_KEY_", authorisationId, this.f213350b.f213355b);
                }
            }
        }, new Function2(this) { // from class: n8a.u

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f213352b;

            {
                this.f213352b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        g8a.b data = (g8a.b) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data, "data");
                        this.f213352b.f213355b.f("PENDING_AUTHORISATIONS_KEY", data);
                        break;
                    case 1:
                        g8a.b data2 = (g8a.b) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data2, "data");
                        this.f213352b.f213355b.f("INACTIVE_AUTHORISATIONS_KEY", data2);
                        break;
                    default:
                        String authorisationId = (String) obj2;
                        g8a.k data3 = (g8a.k) obj3;
                        Intrinsics.checkNotNullParameter(authorisationId, "authorisationId");
                        Intrinsics.checkNotNullParameter(data3, "data");
                        this.f213352b.f213355b.f("AUTHORISATION_KEY_" + authorisationId, data3);
                        break;
                }
                return Unit.f186387a;
            }
        }, new mqc.p(2, 5, null), new k3c.l(i2, 26, continuation));
        final int i5 = 2;
        this.e = new x4l.c(new mtj.k(this, continuation, 5), new Function1(this) { // from class: n8a.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f213350b;

            {
                this.f213350b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i5) {
                    case 0:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        return (g8a.b) this.f213350b.f213355b.get("PENDING_AUTHORISATIONS_KEY");
                    case 1:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        return (g8a.b) this.f213350b.f213355b.get("INACTIVE_AUTHORISATIONS_KEY");
                    default:
                        String authorisationId = (String) obj2;
                        Intrinsics.checkNotNullParameter(authorisationId, "authorisationId");
                        return (g8a.k) v1.c.s("AUTHORISATION_KEY_", authorisationId, this.f213350b.f213355b);
                }
            }
        }, new Function2(this) { // from class: n8a.u

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f213352b;

            {
                this.f213352b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i5) {
                    case 0:
                        g8a.b data = (g8a.b) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data, "data");
                        this.f213352b.f213355b.f("PENDING_AUTHORISATIONS_KEY", data);
                        break;
                    case 1:
                        g8a.b data2 = (g8a.b) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data2, "data");
                        this.f213352b.f213355b.f("INACTIVE_AUTHORISATIONS_KEY", data2);
                        break;
                    default:
                        String authorisationId = (String) obj2;
                        g8a.k data3 = (g8a.k) obj3;
                        Intrinsics.checkNotNullParameter(authorisationId, "authorisationId");
                        Intrinsics.checkNotNullParameter(data3, "data");
                        this.f213352b.f213355b.f("AUTHORISATION_KEY_" + authorisationId, data3);
                        break;
                }
                return Unit.f186387a;
            }
        }, new mqc.p(2, 4, null), new k3c.l(i2, 25, continuation));
    }
}
