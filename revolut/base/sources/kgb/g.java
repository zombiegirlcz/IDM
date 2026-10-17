package kgb;

import com.revolut.feature.retail.salary_account.impl.salary_hub.data.service.SalaryHubService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mgb.n;
import ne0.j;
import org.jetbrains.annotations.NotNull;
import tgb.o;

/* JADX INFO: loaded from: classes6.dex */
public final class g {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SalaryHubService f183943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f183944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f183945c;
    public final x4l.c d;
    public final x4l.c e;
    public final x4l.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x4l.c f183946g;

    public g(SalaryHubService service, j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f183943a = service;
        this.f183944b = memoryCache;
        this.f183945c = storage;
        Continuation continuation = null;
        final int i = 0;
        this.d = new x4l.c(new d(this, continuation, 1), new Function1(this) { // from class: kgb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f183938b;

            {
                this.f183938b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit it8 = (Unit) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (n) this.f183938b.f183944b.get("CACHE_KEY_SALARY_HUB");
                    case 1:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (mgb.c) this.f183938b.f183944b.get("CACHE_KEY_SALARY_HUB_AVAILABILITY");
                    case 2:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (o) this.f183938b.f183944b.get("CACHE_KEY_SALARY_HUB_V3");
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (tgb.c) this.f183938b.f183944b.get("CACHE_KEY_SALARY_HUB_V3_AVAILABILITY");
                }
            }
        }, new Function2(this) { // from class: kgb.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f183940b;

            {
                this.f183940b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Unit unit = (Unit) obj2;
                switch (i) {
                    case 0:
                        n value = (n) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(value, "value");
                        this.f183940b.f183944b.f("CACHE_KEY_SALARY_HUB", value);
                        break;
                    case 1:
                        mgb.c value2 = (mgb.c) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        this.f183940b.f183944b.f("CACHE_KEY_SALARY_HUB_AVAILABILITY", value2);
                        break;
                    case 2:
                        o value3 = (o) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(value3, "value");
                        this.f183940b.f183944b.f("CACHE_KEY_SALARY_HUB_V3", value3);
                        break;
                    default:
                        tgb.c value4 = (tgb.c) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(value4, "value");
                        this.f183940b.f183944b.f("CACHE_KEY_SALARY_HUB_V3_AVAILABILITY", value4);
                        break;
                }
                return Unit.f186387a;
            }
        }, new e(this, continuation, 1), new hwi.b(this, continuation, 23));
        final int i2 = 1;
        this.e = new x4l.c(new d(this, continuation, 0), new Function1(this) { // from class: kgb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f183938b;

            {
                this.f183938b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit it8 = (Unit) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (n) this.f183938b.f183944b.get("CACHE_KEY_SALARY_HUB");
                    case 1:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (mgb.c) this.f183938b.f183944b.get("CACHE_KEY_SALARY_HUB_AVAILABILITY");
                    case 2:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (o) this.f183938b.f183944b.get("CACHE_KEY_SALARY_HUB_V3");
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (tgb.c) this.f183938b.f183944b.get("CACHE_KEY_SALARY_HUB_V3_AVAILABILITY");
                }
            }
        }, new Function2(this) { // from class: kgb.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f183940b;

            {
                this.f183940b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Unit unit = (Unit) obj2;
                switch (i2) {
                    case 0:
                        n value = (n) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(value, "value");
                        this.f183940b.f183944b.f("CACHE_KEY_SALARY_HUB", value);
                        break;
                    case 1:
                        mgb.c value2 = (mgb.c) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        this.f183940b.f183944b.f("CACHE_KEY_SALARY_HUB_AVAILABILITY", value2);
                        break;
                    case 2:
                        o value3 = (o) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(value3, "value");
                        this.f183940b.f183944b.f("CACHE_KEY_SALARY_HUB_V3", value3);
                        break;
                    default:
                        tgb.c value4 = (tgb.c) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(value4, "value");
                        this.f183940b.f183944b.f("CACHE_KEY_SALARY_HUB_V3_AVAILABILITY", value4);
                        break;
                }
                return Unit.f186387a;
            }
        }, new e(this, continuation, 0), new hwi.b(this, continuation, 22));
        final int i3 = 2;
        this.f = new x4l.c(new d(this, continuation, 3), new Function1(this) { // from class: kgb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f183938b;

            {
                this.f183938b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit it8 = (Unit) obj2;
                switch (i3) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (n) this.f183938b.f183944b.get("CACHE_KEY_SALARY_HUB");
                    case 1:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (mgb.c) this.f183938b.f183944b.get("CACHE_KEY_SALARY_HUB_AVAILABILITY");
                    case 2:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (o) this.f183938b.f183944b.get("CACHE_KEY_SALARY_HUB_V3");
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (tgb.c) this.f183938b.f183944b.get("CACHE_KEY_SALARY_HUB_V3_AVAILABILITY");
                }
            }
        }, new Function2(this) { // from class: kgb.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f183940b;

            {
                this.f183940b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Unit unit = (Unit) obj2;
                switch (i3) {
                    case 0:
                        n value = (n) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(value, "value");
                        this.f183940b.f183944b.f("CACHE_KEY_SALARY_HUB", value);
                        break;
                    case 1:
                        mgb.c value2 = (mgb.c) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        this.f183940b.f183944b.f("CACHE_KEY_SALARY_HUB_AVAILABILITY", value2);
                        break;
                    case 2:
                        o value3 = (o) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(value3, "value");
                        this.f183940b.f183944b.f("CACHE_KEY_SALARY_HUB_V3", value3);
                        break;
                    default:
                        tgb.c value4 = (tgb.c) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(value4, "value");
                        this.f183940b.f183944b.f("CACHE_KEY_SALARY_HUB_V3_AVAILABILITY", value4);
                        break;
                }
                return Unit.f186387a;
            }
        }, new e(this, continuation, 3), new hwi.b(this, continuation, 25));
        final int i5 = 3;
        this.f183946g = new x4l.c(new d(this, continuation, 2), new Function1(this) { // from class: kgb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f183938b;

            {
                this.f183938b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit it8 = (Unit) obj2;
                switch (i5) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (n) this.f183938b.f183944b.get("CACHE_KEY_SALARY_HUB");
                    case 1:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (mgb.c) this.f183938b.f183944b.get("CACHE_KEY_SALARY_HUB_AVAILABILITY");
                    case 2:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (o) this.f183938b.f183944b.get("CACHE_KEY_SALARY_HUB_V3");
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (tgb.c) this.f183938b.f183944b.get("CACHE_KEY_SALARY_HUB_V3_AVAILABILITY");
                }
            }
        }, new Function2(this) { // from class: kgb.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f183940b;

            {
                this.f183940b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Unit unit = (Unit) obj2;
                switch (i5) {
                    case 0:
                        n value = (n) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(value, "value");
                        this.f183940b.f183944b.f("CACHE_KEY_SALARY_HUB", value);
                        break;
                    case 1:
                        mgb.c value2 = (mgb.c) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        this.f183940b.f183944b.f("CACHE_KEY_SALARY_HUB_AVAILABILITY", value2);
                        break;
                    case 2:
                        o value3 = (o) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(value3, "value");
                        this.f183940b.f183944b.f("CACHE_KEY_SALARY_HUB_V3", value3);
                        break;
                    default:
                        tgb.c value4 = (tgb.c) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(value4, "value");
                        this.f183940b.f183944b.f("CACHE_KEY_SALARY_HUB_V3_AVAILABILITY", value4);
                        break;
                }
                return Unit.f186387a;
            }
        }, new e(this, continuation, 2), new hwi.b(this, continuation, 24));
    }
}
