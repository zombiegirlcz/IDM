package i95;

import com.revolut.feature.credit.overdraft.impl.network.OverdraftService;
import g2e.m0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import om4.d0;

/* JADX INFO: loaded from: classes21.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OverdraftService f159579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f159580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xx4.d f159581c;
    public final xx4.e d;
    public final x4l.c e;
    public final x4l.c f;

    public e(OverdraftService overdraftService, d0 agreementsDtoMapper, xx4.d memoryCache, xx4.e storage) {
        Intrinsics.checkNotNullParameter(overdraftService, "overdraftService");
        Intrinsics.checkNotNullParameter(agreementsDtoMapper, "agreementsDtoMapper");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f159579a = overdraftService;
        this.f159580b = agreementsDtoMapper;
        this.f159581c = memoryCache;
        this.d = storage;
        Continuation continuation = null;
        final int i = 0;
        this.e = new x4l.c(new c(this, continuation, 1), new Function1(this) { // from class: i95.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f159573b;

            {
                this.f159573b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                String facilityId = (String) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                        return (f95.c) this.f159573b.f159581c.a(new t95.b(facilityId));
                    default:
                        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                        return (ux4.b) this.f159573b.f159581c.a(new t95.a(facilityId));
                }
            }
        }, new Function2(this) { // from class: i95.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f159575b;

            {
                this.f159575b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                String facilityId = (String) obj2;
                switch (i) {
                    case 0:
                        f95.c details = (f95.c) obj3;
                        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                        Intrinsics.checkNotNullParameter(details, "details");
                        this.f159575b.f159581c.b(new t95.b(facilityId), details);
                        break;
                    default:
                        ux4.b agreements = (ux4.b) obj3;
                        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                        Intrinsics.checkNotNullParameter(agreements, "agreements");
                        this.f159575b.f159581c.b(new t95.a(facilityId), agreements);
                        break;
                }
                return Unit.f186387a;
            }
        }, new d(this, continuation, 1), new m0(this, continuation, 28));
        final int i2 = 1;
        this.f = new x4l.c(new c(this, continuation, 0), new Function1(this) { // from class: i95.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f159573b;

            {
                this.f159573b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                String facilityId = (String) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                        return (f95.c) this.f159573b.f159581c.a(new t95.b(facilityId));
                    default:
                        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                        return (ux4.b) this.f159573b.f159581c.a(new t95.a(facilityId));
                }
            }
        }, new Function2(this) { // from class: i95.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f159575b;

            {
                this.f159575b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                String facilityId = (String) obj2;
                switch (i2) {
                    case 0:
                        f95.c details = (f95.c) obj3;
                        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                        Intrinsics.checkNotNullParameter(details, "details");
                        this.f159575b.f159581c.b(new t95.b(facilityId), details);
                        break;
                    default:
                        ux4.b agreements = (ux4.b) obj3;
                        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                        Intrinsics.checkNotNullParameter(agreements, "agreements");
                        this.f159575b.f159581c.b(new t95.a(facilityId), agreements);
                        break;
                }
                return Unit.f186387a;
            }
        }, new d(this, continuation, 0), new m0(this, continuation, 27));
    }
}
