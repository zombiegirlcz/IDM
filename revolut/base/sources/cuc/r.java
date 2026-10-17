package cuc;

import com.revolut.feature.security_hub.api.models.SecurityDelayInfo;
import com.revolut.feature.security_hub.impl.network.SecurityDelayService;
import ip0.v7;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class r {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue0.c f108968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f108969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SecurityDelayService f108970c;
    public final i d;
    public final x4l.c e;
    public final x4l.c f;

    public r(ue0.c storage, ne0.j memoryCache, SecurityDelayService service, i mapper, Json json) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(json, "json");
        this.f108968a = storage;
        this.f108969b = memoryCache;
        this.f108970c = service;
        this.d = mapper;
        Continuation continuation = null;
        final int i = 0;
        this.e = new x4l.c(new p(this, null), new Function1(this) { // from class: cuc.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f108957b;

            {
                this.f108957b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        m it8 = (m) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (SecurityDelayInfo) v7.r("TRANSACTION_SECURITY_DELAY_INFO_KEY_", it8.f108961b, this.f108957b.f108969b);
                    default:
                        Intrinsics.checkNotNullParameter((n) obj2, "it");
                        return (SecurityDelayInfo) this.f108957b.f108969b.get("WEALTH_PROTECTION_SECURITY_DELAY_INFO_KEY");
                }
            }
        }, new Function2(this) { // from class: cuc.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f108959b;

            {
                this.f108959b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        m params = (m) obj2;
                        SecurityDelayInfo domain = (SecurityDelayInfo) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f108959b.f108969b.f("TRANSACTION_SECURITY_DELAY_INFO_KEY_" + params.f108961b, domain);
                        break;
                    default:
                        SecurityDelayInfo domain2 = (SecurityDelayInfo) obj3;
                        Intrinsics.checkNotNullParameter((n) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        this.f108959b.f108969b.f("WEALTH_PROTECTION_SECURITY_DELAY_INFO_KEY", domain2);
                        break;
                }
                return Unit.f186387a;
            }
        }, new ck7.j(this, continuation, 22), new bwb.n(this, continuation, 15));
        final int i2 = 1;
        this.f = new x4l.c(new q(this, null), new Function1(this) { // from class: cuc.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f108957b;

            {
                this.f108957b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        m it8 = (m) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (SecurityDelayInfo) v7.r("TRANSACTION_SECURITY_DELAY_INFO_KEY_", it8.f108961b, this.f108957b.f108969b);
                    default:
                        Intrinsics.checkNotNullParameter((n) obj2, "it");
                        return (SecurityDelayInfo) this.f108957b.f108969b.get("WEALTH_PROTECTION_SECURITY_DELAY_INFO_KEY");
                }
            }
        }, new Function2(this) { // from class: cuc.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f108959b;

            {
                this.f108959b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        m params = (m) obj2;
                        SecurityDelayInfo domain = (SecurityDelayInfo) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f108959b.f108969b.f("TRANSACTION_SECURITY_DELAY_INFO_KEY_" + params.f108961b, domain);
                        break;
                    default:
                        SecurityDelayInfo domain2 = (SecurityDelayInfo) obj3;
                        Intrinsics.checkNotNullParameter((n) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        this.f108959b.f108969b.f("WEALTH_PROTECTION_SECURITY_DELAY_INFO_KEY", domain2);
                        break;
                }
                return Unit.f186387a;
            }
        }, new co7.c(this, continuation, 7), new awd.b(this, continuation, 20));
    }
}
