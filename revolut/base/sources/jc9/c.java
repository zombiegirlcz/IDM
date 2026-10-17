package jc9;

import com.revolut.feature.onboarding.impl.promo.services.PromptsService;
import com.youTransactor.uCube.rpc.Constants;
import efm.k;
import j6k.g;
import j7b.l;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;
import rfm.f0;
import rfm.m;
import w4l.f;
import w89.b;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements x89.a {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PromptsService f172755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f172756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f172757c;

    public c(PromptsService promptsService, j memoryCache) {
        Intrinsics.checkNotNullParameter(promptsService, "promptsService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f172755a = promptsService;
        this.f172756b = memoryCache;
        final int i = 0;
        final int i2 = 1;
        this.f172757c = new f(new Function2(this) { // from class: jc9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f172754b;

            {
                this.f172754b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        k<hc9.c> promptsLocked = this.f172754b.f172755a.getPromptsLocked();
                        g gVar = new g(new l(24), 15);
                        promptsLocked.getClass();
                        f0 f0VarP = new m(promptsLocked, gVar, 1).p(b.a.f295618a);
                        Intrinsics.checkNotNullExpressionValue(f0VarP, "toSingle(...)");
                        return f0VarP;
                    default:
                        w89.b prompts = (w89.b) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(prompts, "prompts");
                        this.f172754b.f172756b.f("LOCKED_PROMPTS_CACHE_KEY", prompts);
                        return Unit.f186387a;
                }
            }
        }, new j87.m(this, 15), new Function2(this) { // from class: jc9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f172754b;

            {
                this.f172754b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        k<hc9.c> promptsLocked = this.f172754b.f172755a.getPromptsLocked();
                        g gVar = new g(new l(24), 15);
                        promptsLocked.getClass();
                        f0 f0VarP = new m(promptsLocked, gVar, 1).p(b.a.f295618a);
                        Intrinsics.checkNotNullExpressionValue(f0VarP, "toSingle(...)");
                        return f0VarP;
                    default:
                        w89.b prompts = (w89.b) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(prompts, "prompts");
                        this.f172754b.f172756b.f("LOCKED_PROMPTS_CACHE_KEY", prompts);
                        return Unit.f186387a;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
    }
}
