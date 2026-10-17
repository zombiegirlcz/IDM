package lxl;

import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends i implements Function2 {
    public UrlImage u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f200594w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ f f200595x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str, f fVar, Continuation continuation) {
        super(2, continuation);
        this.f200594w = str;
        this.f200595x = fVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.f200594w, this.f200595x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0071, code lost:
    
        if (r2 == r1) goto L21;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) throws java.lang.Throwable {
        /*
            r25 = this;
            r0 = r25
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            lxl.f r3 = r0.f200595x
            r4 = 1
            r5 = 2
            if (r2 == 0) goto L27
            if (r2 == r4) goto L1e
            if (r2 != r5) goto L16
            yhm.o.b(r26)
            r2 = r26
            goto L74
        L16:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L1e:
            com.revolut.core.ui_kit_core.displayers.image.models.UrlImage r2 = r0.u
            yhm.o.b(r26)     // Catch: java.lang.Exception -> L61
            r6 = r2
            r2 = r26
            goto L5d
        L27:
            yhm.o.b(r26)
            com.revolut.core.ui_kit_core.displayers.image.models.UrlImage r6 = new com.revolut.core.ui_kit_core.displayers.image.models.UrlImage
            r23 = 0
            r24 = 524286(0x7fffe, float:7.34681E-40)
            java.lang.String r7 = r0.f200594w
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r6.<init>(r7, r8, r9, r10, r11, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            qz0.n r2 = r3.f200601b     // Catch: java.lang.Exception -> L60
            java.util.concurrent.CompletableFuture r2 = r2.h(r6)     // Catch: java.lang.Exception -> L60
            r0.u = r6     // Catch: java.lang.Exception -> L60
            r0.v = r4     // Catch: java.lang.Exception -> L60
            java.lang.Object r2 = do3.q.h(r2, r0)     // Catch: java.lang.Exception -> L60
            if (r2 != r1) goto L5d
            goto L73
        L5d:
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2     // Catch: java.lang.Exception -> L60
            return r2
        L60:
            r2 = r6
        L61:
            lai.d r4 = new lai.d
            r6 = 19
            r7 = 0
            r4.<init>(r3, r2, r7, r6)
            r0.u = r7
            r0.v = r5
            java.lang.Object r2 = r3.c(r5, r4, r0)
            if (r2 != r1) goto L74
        L73:
            return r1
        L74:
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: lxl.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
