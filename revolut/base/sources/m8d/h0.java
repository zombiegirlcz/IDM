package m8d;

import aj0.m0;
import b8d.l0;
import com.revolut.data.model.Data;
import com.revolut.feature.shared.help_centre.impl.faq.screens.pigeon.content.PigeonContentScreenContract$InputData;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import v20.d1;
import v20.e1;

/* JADX INFO: loaded from: classes7.dex */
public final class h0 extends jki.g implements u {

    @NotNull
    public static final z Companion = new z();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final kge.d f203498p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final wli.x f203499q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final l0 f203500r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final hg0.b f203501s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final k18.c f203502t;
    public final ep6.n u;
    public final PigeonContentScreenContract$InputData v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final m f203503w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(jki.p stateMapper, kge.d callRequestNextTicketProvider, wli.x deeplinkHandler, l0 deeplinkModifier, hg0.b faqInteractor, k18.c faqProvider, ep6.n feedbackExtension, PigeonContentScreenContract$InputData inputData) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(callRequestNextTicketProvider, "callRequestNextTicketProvider");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(deeplinkModifier, "deeplinkModifier");
        Intrinsics.checkNotNullParameter(faqInteractor, "faqInteractor");
        Intrinsics.checkNotNullParameter(faqProvider, "faqProvider");
        Intrinsics.checkNotNullParameter(feedbackExtension, "feedbackExtension");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f203498p = callRequestNextTicketProvider;
        this.f203499q = deeplinkHandler;
        this.f203500r = deeplinkModifier;
        this.f203501s = faqInteractor;
        this.f203502t = faqProvider;
        this.u = feedbackExtension;
        this.v = inputData;
        String str = inputData.f86287a;
        String str2 = inputData.f86288b;
        this.f203503w = new m(str, new Data(str2, null, str2 == null, 2, null), new Data(null, null, true, 3, null), inputData.f86289c ? new Data(null, null, true, 3, null) : new Data(new n(false, null), null, false, 6, null), new Data(null, null, true, 3, null), inputData.d);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object y2(m8d.h0 r4, gim.c r5) {
        /*
            boolean r0 = r5 instanceof m8d.g0
            if (r0 == 0) goto L13
            r0 = r5
            m8d.g0 r0 = (m8d.g0) r0
            int r1 = r0.f203497w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f203497w = r1
            goto L18
        L13:
            m8d.g0 r0 = new m8d.g0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f203497w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L41
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r5)
            k18.c r5 = r4.f203502t
            com.revolut.feature.shared.help_centre.impl.faq.screens.pigeon.content.PigeonContentScreenContract$InputData r2 = r4.v
            java.lang.String r2 = r2.f86287a
            r0.f203497w = r3
            java.lang.Object r5 = r5.p(r2, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            n7d.a r5 = (n7d.a) r5
            m8d.r r0 = new m8d.r
            r0.<init>(r5)
            r4.v2(r0)
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: m8d.h0.y2(m8d.h0, gim.c):java.lang.Object");
    }

    public static final Object z2(h0 h0Var, String str, gim.i iVar) {
        wli.x xVar = h0Var.f203499q;
        Object objM = gc0.c.m(xVar, h0Var.f203500r.a(str, xVar.y1(str)), "PigeonContent", iVar);
        return objM == fim.a.COROUTINE_SUSPENDED ? objM : Unit.f186387a;
    }

    public final void A2(Object obj2) {
        m0 m0Var = (m0) ((m) t2()).f203514c.getContent();
        aj0.j jVar = m0Var != null ? m0Var.e : null;
        if (jVar == null) {
            IllegalStateException illegalStateException = new IllegalStateException("Call button must be visible only when content has 'chat' object");
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            return;
        }
        String str = jVar.f5358a;
        if (obj2 instanceof d1.c) {
            v2(new p(str));
            return;
        }
        if (obj2 instanceof e1) {
            v2(new q(((e1) obj2).f285371a, str));
            return;
        }
        IllegalStateException illegalStateException2 = new IllegalStateException(a0.d.m(obj2, "Could not handle parcel = "));
        zhm.h0 h0Var2 = zhm.h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var2);
    }

    @Override // yji.l
    public final void I1() {
        PigeonContentScreenContract$InputData pigeonContentScreenContract$InputData = this.v;
        Continuation continuation = null;
        yji.l.b1(this, nim.a.v(this.f203502t.A(pigeonContentScreenContract$InputData.f86287a), new m62.l(10)), new jl6.b(2, this, h0.class, "handleError", "handleError(Ljava/lang/Throwable;)Z", 4, 26), new b0(this, null), 2);
        if (pigeonContentScreenContract$InputData.f86289c) {
            yji.l.b1(this, boh.f.e(vkm.q.q(new lfg.d0(q2(), 7)), new m11.h(this, 27)), new jl6.b(2, this, h0.class, "handleError", "handleError(Ljava/lang/Throwable;)Z", 4, 27), new c0(this, continuation, 0), 2);
        }
        ep6.n nVar = this.u;
        yji.l.b1(this, nVar.F1(), null, new c0(this, continuation, 1), 3);
        yji.l.b1(this, nVar.I1(pigeonContentScreenContract$InputData.f86287a, yo6.d.FAQ, null), null, new m2f.b0(this, continuation, 10), 3);
        n2(new f0(this, continuation, 2), new m62.l(11));
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f203503w;
    }
}
