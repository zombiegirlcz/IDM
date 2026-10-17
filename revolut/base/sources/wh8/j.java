package wh8;

import com.revolut.feature.junior_onboarding.impl.service.JuniorWorkflowService;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class j {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JuniorWorkflowService f297442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f297443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f297444c;
    public final x4l.c d;

    public j(JuniorWorkflowService service, ne0.j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f297442a = service;
        this.f297443b = memoryCache;
        this.f297444c = storage;
        final int i = 0;
        Continuation continuation = null;
        this.d = new x4l.c(new g(this, continuation, i), new Function1(this) { // from class: wh8.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f297434b;

            {
                this.f297434b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                String juniorId = (String) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
                        return (List) this.f297434b.f297443b.get(j.b(juniorId));
                    default:
                        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
                        return (List) this.f297434b.f297443b.get(j.a(juniorId));
                }
            }
        }, new Function2(this) { // from class: wh8.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f297436b;

            {
                this.f297436b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                String juniorId = (String) obj2;
                List workflows = (List) obj3;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
                        Intrinsics.checkNotNullParameter(workflows, "workflows");
                        this.f297436b.f297443b.f(j.b(juniorId), workflows);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
                        Intrinsics.checkNotNullParameter(workflows, "configs");
                        this.f297436b.f297443b.f(j.a(juniorId), workflows);
                        break;
                }
                return Unit.f186387a;
            }
        }, new h(this, continuation, i), new i(this, continuation, i));
        final int i2 = 1;
        new x4l.c(new g(this, continuation, i2), new Function1(this) { // from class: wh8.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f297434b;

            {
                this.f297434b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                String juniorId = (String) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
                        return (List) this.f297434b.f297443b.get(j.b(juniorId));
                    default:
                        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
                        return (List) this.f297434b.f297443b.get(j.a(juniorId));
                }
            }
        }, new Function2(this) { // from class: wh8.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f297436b;

            {
                this.f297436b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                String juniorId = (String) obj2;
                List workflows = (List) obj3;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
                        Intrinsics.checkNotNullParameter(workflows, "workflows");
                        this.f297436b.f297443b.f(j.b(juniorId), workflows);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
                        Intrinsics.checkNotNullParameter(workflows, "configs");
                        this.f297436b.f297443b.f(j.a(juniorId), workflows);
                        break;
                }
                return Unit.f186387a;
            }
        }, new h(this, continuation, i2), new i(this, continuation, i2));
    }

    public static String a(String str) {
        return j6.a.q("JUNIOR_ONBOARDING_WORKFLOW_CONFIG", str);
    }

    public static String b(String str) {
        return j6.a.q("JUNIOR_ONBOARDING_WORKFLOW", str);
    }
}
