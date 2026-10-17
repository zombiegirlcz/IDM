package o16;

import ang.f;
import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.defi.accounts.api.disclaimer.DeFiDisclaimerWidget$Parcel$LearnMoreLink;
import com.revolut.feature.defi.accounts.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f221312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mre.c f221313b;

    public e(f userInteractor, mre.c termsNavigationFactory) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(termsNavigationFactory, "termsNavigationFactory");
        this.f221312a = userInteractor;
        this.f221313b = termsNavigationFactory;
    }

    public static Clause a(int i, boolean z) {
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, null, null, 14);
        return z ? yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(textLocalisedClause, new TextLocalisedClause(R$string.defi_disclaimer_learn_more, null, new Click(24, (Integer) null, (Object) DeFiDisclaimerWidget$Parcel$LearnMoreLink.f71634a, "DefiDisclaimerWidget_LearnMore", false), 10))) : textLocalisedClause;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(boolean r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof o16.b
            if (r0 == 0) goto L13
            r0 = r8
            o16.b r0 = (o16.b) r0
            int r1 = r0.f221309x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f221309x = r1
            goto L18
        L13:
            o16.b r0 = new o16.b
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f221309x
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            boolean r7 = r0.u
            yhm.o.b(r8)
            goto L59
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            yhm.o.b(r8)
            r0.u = r7
            r0.f221309x = r4
            ang.f r8 = r6.f221312a
            w4l.j r2 = w4l.j.f294644c
            akg.n r8 = r8.j(r2)
            nz7.g r2 = new nz7.g
            r5 = 9
            r2.<init>(r5)
            jhi.b r8 = mo3.a.g(r8, r3, r2, r4)
            n33.r0 r2 = new n33.r0
            r4 = 6
            r2.<init>(r8, r4)
            java.lang.Object r8 = vkm.q.z(r2, r0)
            if (r8 != r1) goto L59
            return r1
        L59:
            wi0.b r8 = (wi0.b) r8
            if (r8 != 0) goto L5e
            goto L78
        L5e:
            boolean r0 = com.bumptech.glide.d.q(r8)
            if (r0 == 0) goto L6b
            int r8 = com.revolut.feature.defi.accounts.impl.R$string.defi_disclaimer_fca
            com.revolut.core.ui_kit.models.Clause r7 = a(r8, r7)
            return r7
        L6b:
            boolean r8 = com.bumptech.glide.d.p(r8)
            if (r8 == 0) goto L78
            int r8 = com.revolut.feature.defi.accounts.impl.R$string.defi_disclaimer_eea
            com.revolut.core.ui_kit.models.Clause r7 = a(r8, r7)
            return r7
        L78:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o16.e.b(boolean, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(ty0.a r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof o16.c
            if (r0 == 0) goto L13
            r0 = r6
            o16.c r0 = (o16.c) r0
            int r1 = r0.f221310w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f221310w = r1
            goto L18
        L13:
            o16.c r0 = new o16.c
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f221310w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L4e
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            java.lang.Object r6 = r5.d
            boolean r6 = r6 instanceof com.revolut.feature.defi.accounts.api.disclaimer.DeFiDisclaimerWidget$Parcel$LearnMoreLink
            if (r6 == 0) goto L5a
            com.revolut.feature.terms.api.model.TermsScope$a r5 = com.revolut.feature.terms.api.model.TermsScope.INSTANCE
            r5.getClass()
            com.revolut.feature.terms.api.model.TermsScope r5 = com.revolut.feature.terms.api.model.TermsScope.f90386w0
            mre.c r6 = r4.f221313b
            ufm.i r5 = mre.c.a(r6, r5)
            r0.f221310w = r3
            java.lang.Object r6 = nim.a.b(r5, r0)
            if (r6 != r1) goto L4e
            return r1
        L4e:
            java.lang.String r5 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r5)
            com.revolut.retail.core.navigation.NaviCommand r6 = (com.revolut.retail.core.navigation.NaviCommand) r6
            com.revolut.kompot.bridge.navigation.BridgeDestination r5 = zh9.u0.b(r6)
            return r5
        L5a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.Object r5 = r5.d
            java.lang.String r0 = "Parcel was "
            java.lang.String r1 = " but LearnMoreLink parcel was expected"
            java.lang.String r5 = v0.a.h(r5, r0, r1)
            r6.<init>(r5)
            zhm.h0 r5 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            java.lang.String r1 = "DeFiDisclaimerWidget"
            r2 = 0
            rd0.d.a(r0, r1, r2, r6, r5)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o16.e.c(ty0.a, gim.c):java.lang.Object");
    }
}
