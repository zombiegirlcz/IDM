package g23;

import com.revolut.feature.card_order_new.impl.kompot.ordernewcard.tab.OrderNewCardTabControllerContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import om4.m4;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class l extends yji.n implements j23.m {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final OrderNewCardTabControllerContract$InputData f139810l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final l0 f139811m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final k23.f f139812n;
    public final k23.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final m4 f139813p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final al4.q f139814q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final al4.j f139815r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final al4.p f139816s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f73.b f139817t;

    public l(OrderNewCardTabControllerContract$InputData inputData, l0 itemBuilder, k23.f sharedDataSource, k23.b cardDesignsProvider, m4 familyCreditCardWalletInteractor, al4.q creditCardProductInteractor, al4.j creditCardEntryPointDetailsInteractor, al4.p creditCardProductFeatureTogglesInteractor, f73.b revolutCardNavigationCommandFactory) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(itemBuilder, "itemBuilder");
        Intrinsics.checkNotNullParameter(sharedDataSource, "sharedDataSource");
        Intrinsics.checkNotNullParameter(cardDesignsProvider, "cardDesignsProvider");
        Intrinsics.checkNotNullParameter(familyCreditCardWalletInteractor, "familyCreditCardWalletInteractor");
        Intrinsics.checkNotNullParameter(creditCardProductInteractor, "creditCardProductInteractor");
        Intrinsics.checkNotNullParameter(creditCardEntryPointDetailsInteractor, "creditCardEntryPointDetailsInteractor");
        Intrinsics.checkNotNullParameter(creditCardProductFeatureTogglesInteractor, "creditCardProductFeatureTogglesInteractor");
        Intrinsics.checkNotNullParameter(revolutCardNavigationCommandFactory, "revolutCardNavigationCommandFactory");
        this.f139810l = inputData;
        this.f139811m = itemBuilder;
        this.f139812n = sharedDataSource;
        this.o = cardDesignsProvider;
        this.f139813p = familyCreditCardWalletInteractor;
        this.f139814q = creditCardProductInteractor;
        this.f139815r = creditCardEntryPointDetailsInteractor;
        this.f139816s = creditCardProductFeatureTogglesInteractor;
        this.f139817t = revolutCardNavigationCommandFactory;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(gim.c r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof g23.k
            if (r0 == 0) goto L13
            r0 = r9
            g23.k r0 = (g23.k) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            g23.k r0 = new g23.k
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f139805x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            r3 = 1
            r4 = 2
            r5 = 0
            if (r2 == 0) goto L41
            if (r2 == r3) goto L39
            if (r2 != r4) goto L31
            java.util.List r0 = r0.v
            java.util.List r0 = (java.util.List) r0
            yhm.o.b(r9)     // Catch: java.lang.Throwable -> L2f
            goto L81
        L2f:
            r9 = move-exception
            goto L93
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L39:
            int r2 = r0.f139804w
            g23.l r3 = r0.u
            yhm.o.b(r9)     // Catch: java.lang.Throwable -> L2f
            goto L64
        L41:
            yhm.o.b(r9)
            yhm.m$a r9 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L2f
            al4.q r9 = r8.f139814q     // Catch: java.lang.Throwable -> L2f
            w4l.h r2 = w4l.h.f294642c     // Catch: java.lang.Throwable -> L2f
            om4.y3 r9 = (om4.y3) r9     // Catch: java.lang.Throwable -> L2f
            kotlinx.coroutines.flow.Flow r9 = r9.e(r2, r3)     // Catch: java.lang.Throwable -> L2f
            r2 = 3
            jhi.b r9 = mo3.a.g(r9, r5, r5, r2)     // Catch: java.lang.Throwable -> L2f
            r0.u = r8     // Catch: java.lang.Throwable -> L2f
            r2 = 0
            r0.f139804w = r2     // Catch: java.lang.Throwable -> L2f
            r0.z = r3     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r9 = vkm.q.x(r9, r0)     // Catch: java.lang.Throwable -> L2f
            if (r9 != r1) goto L63
            goto L7d
        L63:
            r3 = r8
        L64:
            java.util.List r9 = (java.util.List) r9     // Catch: java.lang.Throwable -> L2f
            k23.f r3 = r3.f139812n     // Catch: java.lang.Throwable -> L2f
            kotlinx.coroutines.flow.Flow r3 = r3.a()     // Catch: java.lang.Throwable -> L2f
            r0.u = r5     // Catch: java.lang.Throwable -> L2f
            r6 = r9
            java.util.List r6 = (java.util.List) r6     // Catch: java.lang.Throwable -> L2f
            r0.v = r6     // Catch: java.lang.Throwable -> L2f
            r0.f139804w = r2     // Catch: java.lang.Throwable -> L2f
            r0.z = r4     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r0 = vkm.q.x(r3, r0)     // Catch: java.lang.Throwable -> L2f
            if (r0 != r1) goto L7e
        L7d:
            return r1
        L7e:
            r7 = r0
            r0 = r9
            r9 = r7
        L81:
            do3.n r9 = (do3.n) r9     // Catch: java.lang.Throwable -> L2f
            cl4.n r1 = cl4.o.Companion     // Catch: java.lang.Throwable -> L2f
            wi0.b r9 = do3.q.y(r9)     // Catch: java.lang.Throwable -> L2f
            r1.getClass()     // Catch: java.lang.Throwable -> L2f
            cl4.o r9 = cl4.n.a(r0, r9)     // Catch: java.lang.Throwable -> L2f
            yhm.m$a r0 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L2f
            goto L99
        L93:
            yhm.m$a r0 = yhm.m.INSTANCE
            yhm.n r9 = yhm.o.a(r9)
        L99:
            boolean r0 = r9 instanceof yhm.n
            if (r0 == 0) goto L9e
            goto L9f
        L9e:
            r5 = r9
        L9f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: g23.l.Z2(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x008f, code lost:
    
        if (r2 == r4) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0127, code lost:
    
        if (r2 != r4) goto L51;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // j23.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.Object r23, java.lang.String r24, kotlin.coroutines.Continuation r25) {
        /*
            Method dump skipped, instruction units count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g23.l.c(java.lang.Object, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
