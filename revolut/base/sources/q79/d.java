package q79;

import com.revolut.feature.offboarding.impl.data.service.RetailOffboardingService;
import com.revolut.shared.feature.offboarding.api.domain.model.OffboardingScreen;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;
import pvc.e;
import q56.o;
import te0.w;
import ufm.i;
import w4l.f;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RetailOffboardingService f242783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v79.a f242784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f242785c;
    public final f d;

    public d(RetailOffboardingService offboardingService, v79.a mapper, j cache) {
        Intrinsics.checkNotNullParameter(offboardingService, "offboardingService");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(cache, "cache");
        this.f242783a = offboardingService;
        this.f242784b = mapper;
        this.f242785c = cache;
        final int i = 0;
        final int i2 = 1;
        this.d = new f(new Function2(this) { // from class: q79.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f242781b;

            {
                this.f242781b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d dVar = this.f242781b;
                        i iVar = new i(w.i0(dVar.f242783a.getOffboardingScreenContent()), new q3d.c(19, new e(1, dVar.f242784b, v79.a.class, "toDomain", "toDomain(Lcom/revolut/shared/feature/offboarding/api/data/model/OffboardingScreenContentDto;)Lcom/revolut/shared/feature/offboarding/api/domain/model/OffboardingScreen;", 0, 8)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    default:
                        OffboardingScreen screen = (OffboardingScreen) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(screen, "screen");
                        this.f242781b.f242785c.f("SCREEN_CACHE_KEY", screen);
                        return Unit.f186387a;
                }
            }
        }, new o(this, 11), new Function2(this) { // from class: q79.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f242781b;

            {
                this.f242781b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d dVar = this.f242781b;
                        i iVar = new i(w.i0(dVar.f242783a.getOffboardingScreenContent()), new q3d.c(19, new e(1, dVar.f242784b, v79.a.class, "toDomain", "toDomain(Lcom/revolut/shared/feature/offboarding/api/data/model/OffboardingScreenContentDto;)Lcom/revolut/shared/feature/offboarding/api/domain/model/OffboardingScreen;", 0, 8)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    default:
                        OffboardingScreen screen = (OffboardingScreen) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(screen, "screen");
                        this.f242781b.f242785c.f("SCREEN_CACHE_KEY", screen);
                        return Unit.f186387a;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r5, gim.c r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof q79.c
            if (r0 == 0) goto L13
            r0 = r6
            q79.c r0 = (q79.c) r0
            int r1 = r0.f242782w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f242782w = r1
            goto L18
        L13:
            q79.c r0 = new q79.c
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f242782w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L47
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            r0.f242782w = r3
            q03.m r6 = new q03.m
            r2 = 0
            r3 = 18
            r6.<init>(r4, r5, r2, r3)
            skm.p0 r5 = skm.p0.f264001a
            elm.f r5 = elm.f.f127540b
            java.lang.Object r6 = skm.e0.J(r5, r6, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            s8l.d r6 = (s8l.d) r6
            java.lang.String r5 = r6.f261071a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: q79.d.a(java.lang.String, gim.c):java.lang.Object");
    }
}
