package dca;

import com.revolut.feature.pix.api.model.PixQrCode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
public final class q extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ PixQrCode v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f112838w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ r f112839x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(PixQrCode pixQrCode, CoroutineScope coroutineScope, r rVar, Continuation continuation) {
        super(1, continuation);
        this.v = pixQrCode;
        this.f112838w = coroutineScope;
        this.f112839x = rVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new q(this.v, this.f112838w, this.f112839x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((q) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0096, code lost:
    
        if (r15 == r0) goto L19;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
        /*
            r14 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r14.u
            com.revolut.feature.pix.api.model.PixQrCode r2 = r14.v
            r3 = 2
            r4 = 1
            dca.r r5 = r14.f112839x
            if (r1 == 0) goto L21
            if (r1 == r4) goto L1d
            if (r1 != r3) goto L15
            yhm.o.b(r15)
            goto L99
        L15:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L1d:
            yhm.o.b(r15)
            goto L79
        L21:
            yhm.o.b(r15)
            int[][] r7 = r2.f80418a
            r15 = 0
            if (r7 != 0) goto L3c
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Matrix is null when sharing a pix qr code"
            r0.<init>(r1)
            zhm.h0 r1 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r2 = rd0.d.f253311a
            rd0.c r2 = rd0.c.ERROR
            rd0.d.a(r2, r15, r15, r0, r1)
            kotlin.Unit r15 = kotlin.Unit.f186387a
            return r15
        L3c:
            com.revolut.core.ui_kit_core.displayers.image.models.QrCodeAppearance r8 = new com.revolut.core.ui_kit_core.displayers.image.models.QrCodeAppearance
            com.revolut.core.ui_kit_core.displayers.image.models.QrCodeAppearance$Type$Rounded r9 = new com.revolut.core.ui_kit_core.displayers.image.models.QrCodeAppearance$Type$Rounded
            r1 = 1000(0x3e8, float:1.401E-42)
            r9.<init>(r1)
            com.revolut.core.ui_kit_core.displayers.image.models.QrCodeAppearance$ColorType$ColorAbsolute r10 = new com.revolut.core.ui_kit_core.displayers.image.models.QrCodeAppearance$ColorType$ColorAbsolute
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r10.<init>(r1)
            com.revolut.core.ui_kit_core.displayers.image.models.QrCodeAppearance$ColorType$ColorAbsolute r11 = new com.revolut.core.ui_kit_core.displayers.image.models.QrCodeAppearance$ColorType$ColorAbsolute
            r1 = -1
            r11.<init>(r1)
            com.revolut.core.ui_kit_core.displayers.image.models.QrCodeAppearance$Layer$ColorAbsolute r12 = new com.revolut.core.ui_kit_core.displayers.image.models.QrCodeAppearance$Layer$ColorAbsolute
            r12.<init>(r1)
            r13 = 16
            r8.<init>(r9, r10, r11, r12, r13)
            com.revolut.core.ui_kit_core.displayers.image.models.QrCodeImage r6 = new com.revolut.core.ui_kit_core.displayers.image.models.QrCodeImage
            r9 = 0
            r10 = 0
            r11 = 28
            r6.<init>(r7, r8, r9, r10, r11)
            d3i.g r1 = new d3i.g
            r7 = 16
            r1.<init>(r5, r6, r15, r7)
            skm.p0 r15 = skm.p0.f264001a
            elm.f r15 = elm.f.f127540b
            r14.u = r4
            java.lang.Object r15 = skm.e0.J(r15, r1, r14)
            if (r15 != r0) goto L79
            goto L98
        L79:
            byte[] r15 = (byte[]) r15
            zk0.b r1 = r5.u
            l80.e r4 = r5.v
            l80.f r4 = (l80.f) r4
            r4.getClass()
            long r6 = java.lang.System.currentTimeMillis()
            java.lang.String r4 = "pix_qr_code_"
            java.lang.String r8 = ".jpg"
            java.lang.String r4 = p.a.n(r6, r4, r8)
            r14.u = r3
            java.lang.Object r15 = zk0.b.a(r1, r15, r4, r14)
            if (r15 != r0) goto L99
        L98:
            return r0
        L99:
            java.io.File r15 = (java.io.File) r15
            if (r15 == 0) goto Lac
            tqi.g r0 = r5.f112842r
            java.lang.String r1 = r2.f80419b
            com.revolut.retail.core.navigation.ActivityNavigateCommand r15 = r0.e(r1, r15)
            com.revolut.kompot.bridge.navigation.BridgeDestination r15 = zh9.u0.b(r15)
            r5.C1(r15)
        Lac:
            kotlin.Unit r15 = kotlin.Unit.f186387a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: dca.q.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
