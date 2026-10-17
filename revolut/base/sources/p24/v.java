package p24;

import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nfj.l1;

/* JADX INFO: loaded from: classes22.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditPluginsService f232067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xx4.d f232068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xx4.e f232069c;
    public final x4l.c d;
    public final x4l.c e;

    public v(CreditPluginsService api2, xx4.d memoryCache, xx4.e storage) {
        Intrinsics.checkNotNullParameter(api2, "api");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f232067a = api2;
        this.f232068b = memoryCache;
        this.f232069c = storage;
        Continuation continuation = null;
        final int i = 0;
        this.d = new x4l.c(new o29.l(this, continuation, 12), new Function1(this) { // from class: p24.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v f232063b;

            {
                this.f232063b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        w key = (w) obj2;
                        Intrinsics.checkNotNullParameter(key, "key");
                        return (au3.l) this.f232063b.f232068b.a(key);
                    default:
                        x key2 = (x) obj2;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        return (au3.m) this.f232063b.f232068b.a(key2);
                }
            }
        }, new Function2(this) { // from class: p24.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v f232065b;

            {
                this.f232065b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        w key = (w) obj2;
                        au3.l content = (au3.l) obj3;
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(content, "content");
                        this.f232065b.f232068b.b(key, content);
                        break;
                    default:
                        x key2 = (x) obj2;
                        au3.m status = (au3.m) obj3;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Intrinsics.checkNotNullParameter(status, "status");
                        this.f232065b.f232068b.b(key2, status);
                        break;
                }
                return Unit.f186387a;
            }
        }, new u(this, continuation, i), new l1(this, continuation, 23));
        final int i2 = 1;
        this.e = new x4l.c(new o29.l(this, continuation, 13), new Function1(this) { // from class: p24.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v f232063b;

            {
                this.f232063b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        w key = (w) obj2;
                        Intrinsics.checkNotNullParameter(key, "key");
                        return (au3.l) this.f232063b.f232068b.a(key);
                    default:
                        x key2 = (x) obj2;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        return (au3.m) this.f232063b.f232068b.a(key2);
                }
            }
        }, new Function2(this) { // from class: p24.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v f232065b;

            {
                this.f232065b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        w key = (w) obj2;
                        au3.l content = (au3.l) obj3;
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(content, "content");
                        this.f232065b.f232068b.b(key, content);
                        break;
                    default:
                        x key2 = (x) obj2;
                        au3.m status = (au3.m) obj3;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Intrinsics.checkNotNullParameter(status, "status");
                        this.f232065b.f232068b.b(key2, status);
                        break;
                }
                return Unit.f186387a;
            }
        }, new u(this, continuation, i2), new l1(this, continuation, 24));
    }
}
