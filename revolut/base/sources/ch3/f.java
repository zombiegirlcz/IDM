package ch3;

import bwb.n;
import com.revolut.feature.checklist_challenges_ui.impl.network.ChecklistChallengesUIService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;

/* JADX INFO: loaded from: classes21.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f24121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f24122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ChecklistChallengesUIService f24123c;
    public final x4l.c d;
    public final x4l.c e;

    public f(j memoryCache, ue0.c storage, ChecklistChallengesUIService service) {
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(service, "service");
        this.f24121a = memoryCache;
        this.f24122b = storage;
        this.f24123c = service;
        Continuation continuation = null;
        final int i = 0;
        this.d = new x4l.c(new b6a.d(this, continuation, 23), new Function1(this) { // from class: ch3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f24114b;

            {
                this.f24114b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        d params = (d) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (yg3.c) this.f24114b.f24121a.get(params.a());
                    default:
                        c params2 = (c) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return (xg3.c) this.f24114b.f24121a.get(params2.a());
                }
            }
        }, new Function2(this) { // from class: ch3.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f24116b;

            {
                this.f24116b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        d params = (d) obj2;
                        yg3.c domain = (yg3.c) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f24116b.f24121a.f(params.a(), domain);
                        break;
                    default:
                        c params2 = (c) obj2;
                        xg3.c domain2 = (xg3.c) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        this.f24116b.f24121a.f(params2.a(), domain2);
                        break;
                }
                return Unit.f186387a;
            }
        }, new e(this, continuation, 1), new n(this, continuation, 12));
        final int i2 = 1;
        this.e = new x4l.c(new b6a.d(this, continuation, 22), new Function1(this) { // from class: ch3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f24114b;

            {
                this.f24114b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        d params = (d) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (yg3.c) this.f24114b.f24121a.get(params.a());
                    default:
                        c params2 = (c) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return (xg3.c) this.f24114b.f24121a.get(params2.a());
                }
            }
        }, new Function2(this) { // from class: ch3.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f24116b;

            {
                this.f24116b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        d params = (d) obj2;
                        yg3.c domain = (yg3.c) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f24116b.f24121a.f(params.a(), domain);
                        break;
                    default:
                        c params2 = (c) obj2;
                        xg3.c domain2 = (xg3.c) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        this.f24116b.f24121a.f(params2.a(), domain2);
                        break;
                }
                return Unit.f186387a;
            }
        }, new e(this, continuation, 0), new n(this, continuation, 11));
    }
}
