package n53;

import kotlin.jvm.internal.Intrinsics;
import pfm.h;
import pfm.r;
import te0.w;
import v6l.s;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements z43.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o53.b f212540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j6l.b f212541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tl0.a f212542c;

    public b(o53.b cardPersonalisationRepository, j6l.b revolutCardRepository, s cardRepository, gte.a featureToggleInteractor, tl0.a base64Wrapper) {
        Intrinsics.checkNotNullParameter(cardPersonalisationRepository, "cardPersonalisationRepository");
        Intrinsics.checkNotNullParameter(revolutCardRepository, "revolutCardRepository");
        Intrinsics.checkNotNullParameter(cardRepository, "cardRepository");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(base64Wrapper, "base64Wrapper");
        this.f212540a = cardPersonalisationRepository;
        this.f212541b = revolutCardRepository;
        this.f212542c = base64Wrapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof n53.a
            if (r0 == 0) goto L13
            r0 = r6
            n53.a r0 = (n53.a) r0
            int r1 = r0.f212539w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f212539w = r1
            goto L18
        L13:
            n53.a r0 = new n53.a
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f212539w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L55
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            yhm.o.b(r6)
            o53.b r6 = r5.f212540a
            r6.getClass()
            nc0.a r2 = new nc0.a
            r4 = 4
            r2.<init>(r6, r4)
            ufm.c r6 = new ufm.c
            r4 = 2
            r6.<init>(r2, r4)
            java.lang.String r2 = "fromCallable(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r2)
            ufm.n r6 = te0.w.i0(r6)
            r0.f212539w = r3
            java.lang.Object r6 = nim.a.b(r6, r0)
            if (r6 != r1) goto L55
            return r1
        L55:
            od0.i r6 = (od0.i) r6
            boolean r0 = r6.d()
            r1 = 0
            if (r0 == 0) goto L7d
            java.lang.Object r6 = r6.c()
            java.lang.String r6 = (java.lang.String) r6
            tl0.a r0 = r5.f212542c
            byte[] r6 = r0.a(r6)
            com.revolut.core.ui_kit_core.displayers.image.models.BitmapImage r0 = new com.revolut.core.ui_kit_core.displayers.image.models.BitmapImage
            int r2 = r6.length
            r3 = 0
            android.graphics.Bitmap r6 = android.graphics.BitmapFactory.decodeByteArray(r6, r3, r2)
            java.lang.String r2 = "decodeByteArray(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r2)
            r2 = 14
            r0.<init>(r6, r3, r1, r2)
            return r0
        L7d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: n53.b.a(gim.c):java.lang.Object");
    }

    public final r b() {
        o53.b bVar = this.f212540a;
        bVar.getClass();
        h hVar = new h(new i1i.a(bVar, 23), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        return w.g0(hVar);
    }
}
