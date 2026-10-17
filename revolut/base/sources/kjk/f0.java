package kjk;

import com.google.gson.reflect.TypeToken;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanScreenId;
import com.revolut.retail.feature.pricing_plans.ui.impl.network.PricingPlanUiService;
import ggk.g0;
import java.lang.reflect.Type;
import java.util.Set;
import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class f0 implements u {

    @NotNull
    public static final a0 Companion = new a0();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Type f184431s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Set f184432t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PricingPlanUiService f184433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xe0.e f184434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.j f184435c;
    public final mjk.x d;
    public final mjk.u e;
    public final kl.c0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Lazy f184436g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Lazy f184437h;
    public final Lazy i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Lazy f184438j;
    public final Lazy k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Lazy f184439l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Lazy f184440m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Lazy f184441n;
    public final w4l.f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x4l.c f184442p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final x4l.c f184443q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final x4l.c f184444r;

    static {
        Type type = new TypeToken<ljk.e>() { // from class: com.revolut.retail.feature.pricing_plans.ui.impl.repository.PricingPlansUiRepositoryImpl$Companion$PLAN_DASHBOARD_CONFIG_ENTITY_TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        f184431s = type;
        String[] elements = {"billingPeriod", "pricingPlanId", "discountId"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f184432t = kotlin.collections.d.y0(elements);
    }

    public f0(PricingPlanUiService service, xe0.e storage, ne0.j memoryCache, mjk.x pricingPlanScreenConfigMapper, mjk.u pricingPlanBottomSheetConfigMapper, kl.c0 studentHubScreenConfigMapper) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(pricingPlanScreenConfigMapper, "pricingPlanScreenConfigMapper");
        Intrinsics.checkNotNullParameter(pricingPlanBottomSheetConfigMapper, "pricingPlanBottomSheetConfigMapper");
        Intrinsics.checkNotNullParameter(studentHubScreenConfigMapper, "studentHubScreenConfigMapper");
        this.f184433a = service;
        this.f184434b = storage;
        this.f184435c = memoryCache;
        this.d = pricingPlanScreenConfigMapper;
        this.e = pricingPlanBottomSheetConfigMapper;
        this.f = studentHubScreenConfigMapper;
        final int i = 0;
        this.f184436g = yhm.j.b(new Function0(this) { // from class: kjk.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f0 f184476b;

            {
                this.f184476b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        f0 f0Var = this.f184476b;
                        return new w4l.f(new v(f0Var, 2), new w(f0Var, 1), new v(f0Var, 3), new w(f0Var, 2), new v(f0Var, 4), null, null, null, BERTags.FLAGS);
                    case 1:
                        f0 f0Var2 = this.f184476b;
                        return new w4l.f(new v(f0Var2, 26), new w(f0Var2, 20), new v(f0Var2, 27), new w(f0Var2, 0), new v(f0Var2, 1), null, null, null, BERTags.FLAGS);
                    case 2:
                        f0 f0Var3 = this.f184476b;
                        return new w4l.f(new v(f0Var3, 8), new w(f0Var3, 6), new v(f0Var3, 9), new w(f0Var3, 7), new v(f0Var3, 10), null, null, null, BERTags.FLAGS);
                    case 3:
                        f0 f0Var4 = this.f184476b;
                        int i2 = 13;
                        return new w4l.f(new v(f0Var4, 0), new w(f0Var4, 4), new v(f0Var4, i2), new w(f0Var4, i2), new v(f0Var4, 19), null, null, null, BERTags.FLAGS);
                    case 4:
                        f0 f0Var5 = this.f184476b;
                        return new w4l.f(new v(f0Var5, 12), new w(f0Var5, 9), new v(f0Var5, 14), new w(f0Var5, 10), new v(f0Var5, 15), null, null, null, BERTags.FLAGS);
                    case 5:
                        f0 f0Var6 = this.f184476b;
                        Continuation continuation = null;
                        return new x4l.c(new k7c.x(f0Var6, continuation, 10), new w(f0Var6, 8), new v(f0Var6, 11), new e0(f0Var6, continuation, 1), new j40.d(f0Var6, continuation, 11));
                    case 6:
                        f0 f0Var7 = this.f184476b;
                        return new w4l.f(new v(f0Var7, 5), new w(f0Var7, 3), new v(f0Var7, 6), new w(f0Var7, 5), new v(f0Var7, 7), null, null, null, BERTags.FLAGS);
                    default:
                        f0 f0Var8 = this.f184476b;
                        return new w4l.f(new v(f0Var8, 16), new w(f0Var8, 11), new v(f0Var8, 17), new w(f0Var8, 12), new v(f0Var8, 18), null, null, null, BERTags.FLAGS);
                }
            }
        });
        final int i2 = 1;
        this.f184437h = yhm.j.b(new Function0(this) { // from class: kjk.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f0 f184476b;

            {
                this.f184476b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        f0 f0Var = this.f184476b;
                        return new w4l.f(new v(f0Var, 2), new w(f0Var, 1), new v(f0Var, 3), new w(f0Var, 2), new v(f0Var, 4), null, null, null, BERTags.FLAGS);
                    case 1:
                        f0 f0Var2 = this.f184476b;
                        return new w4l.f(new v(f0Var2, 26), new w(f0Var2, 20), new v(f0Var2, 27), new w(f0Var2, 0), new v(f0Var2, 1), null, null, null, BERTags.FLAGS);
                    case 2:
                        f0 f0Var3 = this.f184476b;
                        return new w4l.f(new v(f0Var3, 8), new w(f0Var3, 6), new v(f0Var3, 9), new w(f0Var3, 7), new v(f0Var3, 10), null, null, null, BERTags.FLAGS);
                    case 3:
                        f0 f0Var4 = this.f184476b;
                        int i22 = 13;
                        return new w4l.f(new v(f0Var4, 0), new w(f0Var4, 4), new v(f0Var4, i22), new w(f0Var4, i22), new v(f0Var4, 19), null, null, null, BERTags.FLAGS);
                    case 4:
                        f0 f0Var5 = this.f184476b;
                        return new w4l.f(new v(f0Var5, 12), new w(f0Var5, 9), new v(f0Var5, 14), new w(f0Var5, 10), new v(f0Var5, 15), null, null, null, BERTags.FLAGS);
                    case 5:
                        f0 f0Var6 = this.f184476b;
                        Continuation continuation = null;
                        return new x4l.c(new k7c.x(f0Var6, continuation, 10), new w(f0Var6, 8), new v(f0Var6, 11), new e0(f0Var6, continuation, 1), new j40.d(f0Var6, continuation, 11));
                    case 6:
                        f0 f0Var7 = this.f184476b;
                        return new w4l.f(new v(f0Var7, 5), new w(f0Var7, 3), new v(f0Var7, 6), new w(f0Var7, 5), new v(f0Var7, 7), null, null, null, BERTags.FLAGS);
                    default:
                        f0 f0Var8 = this.f184476b;
                        return new w4l.f(new v(f0Var8, 16), new w(f0Var8, 11), new v(f0Var8, 17), new w(f0Var8, 12), new v(f0Var8, 18), null, null, null, BERTags.FLAGS);
                }
            }
        });
        final int i3 = 2;
        this.i = yhm.j.b(new Function0(this) { // from class: kjk.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f0 f184476b;

            {
                this.f184476b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        f0 f0Var = this.f184476b;
                        return new w4l.f(new v(f0Var, 2), new w(f0Var, 1), new v(f0Var, 3), new w(f0Var, 2), new v(f0Var, 4), null, null, null, BERTags.FLAGS);
                    case 1:
                        f0 f0Var2 = this.f184476b;
                        return new w4l.f(new v(f0Var2, 26), new w(f0Var2, 20), new v(f0Var2, 27), new w(f0Var2, 0), new v(f0Var2, 1), null, null, null, BERTags.FLAGS);
                    case 2:
                        f0 f0Var3 = this.f184476b;
                        return new w4l.f(new v(f0Var3, 8), new w(f0Var3, 6), new v(f0Var3, 9), new w(f0Var3, 7), new v(f0Var3, 10), null, null, null, BERTags.FLAGS);
                    case 3:
                        f0 f0Var4 = this.f184476b;
                        int i22 = 13;
                        return new w4l.f(new v(f0Var4, 0), new w(f0Var4, 4), new v(f0Var4, i22), new w(f0Var4, i22), new v(f0Var4, 19), null, null, null, BERTags.FLAGS);
                    case 4:
                        f0 f0Var5 = this.f184476b;
                        return new w4l.f(new v(f0Var5, 12), new w(f0Var5, 9), new v(f0Var5, 14), new w(f0Var5, 10), new v(f0Var5, 15), null, null, null, BERTags.FLAGS);
                    case 5:
                        f0 f0Var6 = this.f184476b;
                        Continuation continuation = null;
                        return new x4l.c(new k7c.x(f0Var6, continuation, 10), new w(f0Var6, 8), new v(f0Var6, 11), new e0(f0Var6, continuation, 1), new j40.d(f0Var6, continuation, 11));
                    case 6:
                        f0 f0Var7 = this.f184476b;
                        return new w4l.f(new v(f0Var7, 5), new w(f0Var7, 3), new v(f0Var7, 6), new w(f0Var7, 5), new v(f0Var7, 7), null, null, null, BERTags.FLAGS);
                    default:
                        f0 f0Var8 = this.f184476b;
                        return new w4l.f(new v(f0Var8, 16), new w(f0Var8, 11), new v(f0Var8, 17), new w(f0Var8, 12), new v(f0Var8, 18), null, null, null, BERTags.FLAGS);
                }
            }
        });
        final int i5 = 3;
        this.f184438j = yhm.j.b(new Function0(this) { // from class: kjk.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f0 f184476b;

            {
                this.f184476b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        f0 f0Var = this.f184476b;
                        return new w4l.f(new v(f0Var, 2), new w(f0Var, 1), new v(f0Var, 3), new w(f0Var, 2), new v(f0Var, 4), null, null, null, BERTags.FLAGS);
                    case 1:
                        f0 f0Var2 = this.f184476b;
                        return new w4l.f(new v(f0Var2, 26), new w(f0Var2, 20), new v(f0Var2, 27), new w(f0Var2, 0), new v(f0Var2, 1), null, null, null, BERTags.FLAGS);
                    case 2:
                        f0 f0Var3 = this.f184476b;
                        return new w4l.f(new v(f0Var3, 8), new w(f0Var3, 6), new v(f0Var3, 9), new w(f0Var3, 7), new v(f0Var3, 10), null, null, null, BERTags.FLAGS);
                    case 3:
                        f0 f0Var4 = this.f184476b;
                        int i22 = 13;
                        return new w4l.f(new v(f0Var4, 0), new w(f0Var4, 4), new v(f0Var4, i22), new w(f0Var4, i22), new v(f0Var4, 19), null, null, null, BERTags.FLAGS);
                    case 4:
                        f0 f0Var5 = this.f184476b;
                        return new w4l.f(new v(f0Var5, 12), new w(f0Var5, 9), new v(f0Var5, 14), new w(f0Var5, 10), new v(f0Var5, 15), null, null, null, BERTags.FLAGS);
                    case 5:
                        f0 f0Var6 = this.f184476b;
                        Continuation continuation = null;
                        return new x4l.c(new k7c.x(f0Var6, continuation, 10), new w(f0Var6, 8), new v(f0Var6, 11), new e0(f0Var6, continuation, 1), new j40.d(f0Var6, continuation, 11));
                    case 6:
                        f0 f0Var7 = this.f184476b;
                        return new w4l.f(new v(f0Var7, 5), new w(f0Var7, 3), new v(f0Var7, 6), new w(f0Var7, 5), new v(f0Var7, 7), null, null, null, BERTags.FLAGS);
                    default:
                        f0 f0Var8 = this.f184476b;
                        return new w4l.f(new v(f0Var8, 16), new w(f0Var8, 11), new v(f0Var8, 17), new w(f0Var8, 12), new v(f0Var8, 18), null, null, null, BERTags.FLAGS);
                }
            }
        });
        final int i6 = 4;
        this.k = yhm.j.b(new Function0(this) { // from class: kjk.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f0 f184476b;

            {
                this.f184476b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i6) {
                    case 0:
                        f0 f0Var = this.f184476b;
                        return new w4l.f(new v(f0Var, 2), new w(f0Var, 1), new v(f0Var, 3), new w(f0Var, 2), new v(f0Var, 4), null, null, null, BERTags.FLAGS);
                    case 1:
                        f0 f0Var2 = this.f184476b;
                        return new w4l.f(new v(f0Var2, 26), new w(f0Var2, 20), new v(f0Var2, 27), new w(f0Var2, 0), new v(f0Var2, 1), null, null, null, BERTags.FLAGS);
                    case 2:
                        f0 f0Var3 = this.f184476b;
                        return new w4l.f(new v(f0Var3, 8), new w(f0Var3, 6), new v(f0Var3, 9), new w(f0Var3, 7), new v(f0Var3, 10), null, null, null, BERTags.FLAGS);
                    case 3:
                        f0 f0Var4 = this.f184476b;
                        int i22 = 13;
                        return new w4l.f(new v(f0Var4, 0), new w(f0Var4, 4), new v(f0Var4, i22), new w(f0Var4, i22), new v(f0Var4, 19), null, null, null, BERTags.FLAGS);
                    case 4:
                        f0 f0Var5 = this.f184476b;
                        return new w4l.f(new v(f0Var5, 12), new w(f0Var5, 9), new v(f0Var5, 14), new w(f0Var5, 10), new v(f0Var5, 15), null, null, null, BERTags.FLAGS);
                    case 5:
                        f0 f0Var6 = this.f184476b;
                        Continuation continuation = null;
                        return new x4l.c(new k7c.x(f0Var6, continuation, 10), new w(f0Var6, 8), new v(f0Var6, 11), new e0(f0Var6, continuation, 1), new j40.d(f0Var6, continuation, 11));
                    case 6:
                        f0 f0Var7 = this.f184476b;
                        return new w4l.f(new v(f0Var7, 5), new w(f0Var7, 3), new v(f0Var7, 6), new w(f0Var7, 5), new v(f0Var7, 7), null, null, null, BERTags.FLAGS);
                    default:
                        f0 f0Var8 = this.f184476b;
                        return new w4l.f(new v(f0Var8, 16), new w(f0Var8, 11), new v(f0Var8, 17), new w(f0Var8, 12), new v(f0Var8, 18), null, null, null, BERTags.FLAGS);
                }
            }
        });
        final int i21 = 5;
        this.f184439l = yhm.j.b(new Function0(this) { // from class: kjk.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f0 f184476b;

            {
                this.f184476b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i21) {
                    case 0:
                        f0 f0Var = this.f184476b;
                        return new w4l.f(new v(f0Var, 2), new w(f0Var, 1), new v(f0Var, 3), new w(f0Var, 2), new v(f0Var, 4), null, null, null, BERTags.FLAGS);
                    case 1:
                        f0 f0Var2 = this.f184476b;
                        return new w4l.f(new v(f0Var2, 26), new w(f0Var2, 20), new v(f0Var2, 27), new w(f0Var2, 0), new v(f0Var2, 1), null, null, null, BERTags.FLAGS);
                    case 2:
                        f0 f0Var3 = this.f184476b;
                        return new w4l.f(new v(f0Var3, 8), new w(f0Var3, 6), new v(f0Var3, 9), new w(f0Var3, 7), new v(f0Var3, 10), null, null, null, BERTags.FLAGS);
                    case 3:
                        f0 f0Var4 = this.f184476b;
                        int i22 = 13;
                        return new w4l.f(new v(f0Var4, 0), new w(f0Var4, 4), new v(f0Var4, i22), new w(f0Var4, i22), new v(f0Var4, 19), null, null, null, BERTags.FLAGS);
                    case 4:
                        f0 f0Var5 = this.f184476b;
                        return new w4l.f(new v(f0Var5, 12), new w(f0Var5, 9), new v(f0Var5, 14), new w(f0Var5, 10), new v(f0Var5, 15), null, null, null, BERTags.FLAGS);
                    case 5:
                        f0 f0Var6 = this.f184476b;
                        Continuation continuation = null;
                        return new x4l.c(new k7c.x(f0Var6, continuation, 10), new w(f0Var6, 8), new v(f0Var6, 11), new e0(f0Var6, continuation, 1), new j40.d(f0Var6, continuation, 11));
                    case 6:
                        f0 f0Var7 = this.f184476b;
                        return new w4l.f(new v(f0Var7, 5), new w(f0Var7, 3), new v(f0Var7, 6), new w(f0Var7, 5), new v(f0Var7, 7), null, null, null, BERTags.FLAGS);
                    default:
                        f0 f0Var8 = this.f184476b;
                        return new w4l.f(new v(f0Var8, 16), new w(f0Var8, 11), new v(f0Var8, 17), new w(f0Var8, 12), new v(f0Var8, 18), null, null, null, BERTags.FLAGS);
                }
            }
        });
        final int i22 = 6;
        this.f184440m = yhm.j.b(new Function0(this) { // from class: kjk.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f0 f184476b;

            {
                this.f184476b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i22) {
                    case 0:
                        f0 f0Var = this.f184476b;
                        return new w4l.f(new v(f0Var, 2), new w(f0Var, 1), new v(f0Var, 3), new w(f0Var, 2), new v(f0Var, 4), null, null, null, BERTags.FLAGS);
                    case 1:
                        f0 f0Var2 = this.f184476b;
                        return new w4l.f(new v(f0Var2, 26), new w(f0Var2, 20), new v(f0Var2, 27), new w(f0Var2, 0), new v(f0Var2, 1), null, null, null, BERTags.FLAGS);
                    case 2:
                        f0 f0Var3 = this.f184476b;
                        return new w4l.f(new v(f0Var3, 8), new w(f0Var3, 6), new v(f0Var3, 9), new w(f0Var3, 7), new v(f0Var3, 10), null, null, null, BERTags.FLAGS);
                    case 3:
                        f0 f0Var4 = this.f184476b;
                        int i222 = 13;
                        return new w4l.f(new v(f0Var4, 0), new w(f0Var4, 4), new v(f0Var4, i222), new w(f0Var4, i222), new v(f0Var4, 19), null, null, null, BERTags.FLAGS);
                    case 4:
                        f0 f0Var5 = this.f184476b;
                        return new w4l.f(new v(f0Var5, 12), new w(f0Var5, 9), new v(f0Var5, 14), new w(f0Var5, 10), new v(f0Var5, 15), null, null, null, BERTags.FLAGS);
                    case 5:
                        f0 f0Var6 = this.f184476b;
                        Continuation continuation = null;
                        return new x4l.c(new k7c.x(f0Var6, continuation, 10), new w(f0Var6, 8), new v(f0Var6, 11), new e0(f0Var6, continuation, 1), new j40.d(f0Var6, continuation, 11));
                    case 6:
                        f0 f0Var7 = this.f184476b;
                        return new w4l.f(new v(f0Var7, 5), new w(f0Var7, 3), new v(f0Var7, 6), new w(f0Var7, 5), new v(f0Var7, 7), null, null, null, BERTags.FLAGS);
                    default:
                        f0 f0Var8 = this.f184476b;
                        return new w4l.f(new v(f0Var8, 16), new w(f0Var8, 11), new v(f0Var8, 17), new w(f0Var8, 12), new v(f0Var8, 18), null, null, null, BERTags.FLAGS);
                }
            }
        });
        final int i32 = 7;
        this.f184441n = yhm.j.b(new Function0(this) { // from class: kjk.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f0 f184476b;

            {
                this.f184476b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i32) {
                    case 0:
                        f0 f0Var = this.f184476b;
                        return new w4l.f(new v(f0Var, 2), new w(f0Var, 1), new v(f0Var, 3), new w(f0Var, 2), new v(f0Var, 4), null, null, null, BERTags.FLAGS);
                    case 1:
                        f0 f0Var2 = this.f184476b;
                        return new w4l.f(new v(f0Var2, 26), new w(f0Var2, 20), new v(f0Var2, 27), new w(f0Var2, 0), new v(f0Var2, 1), null, null, null, BERTags.FLAGS);
                    case 2:
                        f0 f0Var3 = this.f184476b;
                        return new w4l.f(new v(f0Var3, 8), new w(f0Var3, 6), new v(f0Var3, 9), new w(f0Var3, 7), new v(f0Var3, 10), null, null, null, BERTags.FLAGS);
                    case 3:
                        f0 f0Var4 = this.f184476b;
                        int i222 = 13;
                        return new w4l.f(new v(f0Var4, 0), new w(f0Var4, 4), new v(f0Var4, i222), new w(f0Var4, i222), new v(f0Var4, 19), null, null, null, BERTags.FLAGS);
                    case 4:
                        f0 f0Var5 = this.f184476b;
                        return new w4l.f(new v(f0Var5, 12), new w(f0Var5, 9), new v(f0Var5, 14), new w(f0Var5, 10), new v(f0Var5, 15), null, null, null, BERTags.FLAGS);
                    case 5:
                        f0 f0Var6 = this.f184476b;
                        Continuation continuation = null;
                        return new x4l.c(new k7c.x(f0Var6, continuation, 10), new w(f0Var6, 8), new v(f0Var6, 11), new e0(f0Var6, continuation, 1), new j40.d(f0Var6, continuation, 11));
                    case 6:
                        f0 f0Var7 = this.f184476b;
                        return new w4l.f(new v(f0Var7, 5), new w(f0Var7, 3), new v(f0Var7, 6), new w(f0Var7, 5), new v(f0Var7, 7), null, null, null, BERTags.FLAGS);
                    default:
                        f0 f0Var8 = this.f184476b;
                        return new w4l.f(new v(f0Var8, 16), new w(f0Var8, 11), new v(f0Var8, 17), new w(f0Var8, 12), new v(f0Var8, 18), null, null, null, BERTags.FLAGS);
                }
            }
        });
        this.o = new w4l.f(new v(this, 25), new w(this, 19), new v(this, 20), new w(this, 15), new v(this, 21), null, null, null, BERTags.FLAGS);
        Continuation continuation = null;
        this.f184442p = new x4l.c(new d0(this, continuation, 0), new w(this, 16), new v(this, 22), new e0(this, continuation, 0), new j40.d(this, continuation, 10));
        this.f184443q = new x4l.c(new d0(this, continuation, 1), new w(this, 17), new v(this, 23), new e0(this, continuation, 2), new j40.d(this, continuation, 12));
        this.f184444r = new x4l.c(new k3c.k(this, continuation, 5), new w(this, 18), new v(this, 24), new e0(this, continuation, 3), new j40.d(this, continuation, 13));
    }

    public static String a(PricingPlanScreenId pricingPlanScreenId) {
        return a0.d.r(pricingPlanScreenId.f102855a, "_pricing_plan_screen");
    }

    public static String b(g0 g0Var) {
        return a0.d.r(g0Var.a(), "_plan_dashboard_config");
    }

    public static String c(String str) {
        if (str == null) {
            str = "";
        }
        return "perks_loss_".concat(str);
    }

    public static String d(String str) {
        return j6.a.q("unlockable_benefits_screen_", str);
    }
}
