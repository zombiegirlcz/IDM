package com.revolut.feature.external_accounts.impl.ui.flow.link_external;

import android.os.Parcelable;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.external_accounts.api.navigation.ExternalAccountsFeatureConfig;
import com.revolut.feature.external_accounts.impl.R$string;
import com.revolut.feature.external_accounts.impl.ui.flow.link_external.LinkExternalAccountFlowContract$Step;
import dn6.c;
import dn6.e;
import dn6.f;
import dn6.g;
import jm6.d;
import jm6.m;
import jm6.n;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import oki.h;
import org.jetbrains.annotations.NotNull;
import vg6.p;
import we6.p0;
import yji.l;
import yki.i;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends h implements jm6.b {

    @NotNull
    private static final d Companion = new d();
    public final LinkExternalAccountFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final fk3.a f72919p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final xoj.a f72920q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final gte.a f72921r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y91.b f72922s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final p f72923t;
    public final i u;

    public b(LinkExternalAccountFlowContract$InputData inputData, fk3.a configurationInteractor, xoj.a featuresInteractor, gte.a featureToggle, y91.b accountsProductFeatureChecker, p linkResultHelper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(featureToggle, "featureToggle");
        Intrinsics.checkNotNullParameter(accountsProductFeatureChecker, "accountsProductFeatureChecker");
        Intrinsics.checkNotNullParameter(linkResultHelper, "linkResultHelper");
        this.o = inputData;
        this.f72919p = configurationInteractor;
        this.f72920q = featuresInteractor;
        this.f72921r = featureToggle;
        this.f72922s = accountsProductFeatureChecker;
        this.f72923t = linkResultHelper;
        this.u = d8l.d.a(this, new jch.p(this, 25));
    }

    public static Unit I2(b bVar, g result) {
        jm6.i fVar;
        Intrinsics.checkNotNullParameter(result, "result");
        Companion.getClass();
        Intrinsics.checkNotNullParameter(result, "<this>");
        if (result instanceof e) {
            fVar = new jm6.g(((e) result).f116221a);
        } else if (result instanceof f) {
            fVar = new jm6.h(((f) result).f116222a);
        } else if (result instanceof c) {
            fVar = new jm6.f(((c) result).f116218a);
        } else {
            if (!(result instanceof dn6.d)) {
                throw new NoWhenBranchMatchedException();
            }
            fVar = null;
        }
        bVar.L2(fVar);
        return Unit.f186387a;
    }

    public static Unit J2(b bVar, gm6.f result) {
        jm6.i hVar;
        Intrinsics.checkNotNullParameter(result, "result");
        Companion.getClass();
        Intrinsics.checkNotNullParameter(result, "<this>");
        if (result instanceof gm6.d) {
            hVar = new jm6.g(((gm6.d) result).f144772a);
        } else if (result instanceof gm6.e) {
            hVar = new jm6.h(((gm6.e) result).f144773a);
        } else {
            if (!(result instanceof gm6.c)) {
                throw new NoWhenBranchMatchedException();
            }
            hVar = null;
        }
        bVar.L2(hVar);
        return Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object K2(com.revolut.feature.external_accounts.impl.ui.flow.link_external.b r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof jm6.j
            if (r0 == 0) goto L13
            r0 = r7
            jm6.j r0 = (jm6.j) r0
            int r1 = r0.f176484x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f176484x = r1
            goto L18
        L13:
            jm6.j r0 = new jm6.j
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f176484x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            boolean r6 = r0.u
            yhm.o.b(r7)
            goto L56
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            yhm.o.b(r7)
            y91.b r7 = r6.f72922s
            java.lang.String r2 = "ACCOUNT.linked_account"
            boolean r7 = r7.a(r2)
            xoj.a r6 = r6.f72920q
            yoj.c r2 = yoj.c.EXTERNAL_ACCOUNTS_TOPUP
            yoj.d r4 = yoj.d.DISABLED
            cpj.b r6 = (cpj.b) r6
            ufm.i r6 = r6.f(r2, r4)
            r0.u = r7
            r0.f176484x = r3
            java.lang.Object r6 = nim.a.b(r6, r0)
            if (r6 != r1) goto L53
            return r1
        L53:
            r5 = r7
            r7 = r6
            r6 = r5
        L56:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            if (r6 != 0) goto L62
            boolean r6 = r7.booleanValue()
            if (r6 == 0) goto L61
            goto L62
        L61:
            r3 = 0
        L62:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.external_accounts.impl.ui.flow.link_external.b.K2(com.revolut.feature.external_accounts.impl.ui.flow.link_external.b, gim.c):java.lang.Object");
    }

    public final void L2(jm6.i iVar) {
        if (iVar instanceof jm6.g) {
            h.t2(this, this.u, new LinkExternalAccountFlowContract$Step.WebView(((jm6.g) iVar).f176481a), true, null, false, 12);
            return;
        }
        if (iVar instanceof jm6.h) {
            String str = ((jm6.h) iVar).f176482a;
            B2();
            l2(new m(this, true, str, null), new yi5.b(26));
        } else {
            if (!(iVar instanceof jm6.f)) {
                int i = jli.h.f175850a;
                return;
            }
            Parcelable parcelable = ((jm6.f) iVar).f176480a;
            if (parcelable instanceof ExternalAccountsFeatureConfig.Configuration.ExternalInstitutionsConfiguration.ExternalAccountItem) {
                C2(p0.b.f296662a);
            } else if (parcelable instanceof ExternalAccountsFeatureConfig.Configuration.ExternalInstitutionsConfiguration.CantLinkAccountItem) {
                C2(p0.a.f296661a);
            }
        }
    }

    @Override // yki.j
    public final void M0() {
        l2(new a(this, null), new yi5.b(26));
    }

    public final void M2() {
        l.a1(this, X1(new y0(null, new z(new TextLocalisedClause(R$string.external_institutions_linking_error_new_title, null, null, 14), new TextLocalisedClause(R$string.external_institutions_linking_error_new_description, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764), false, 5)), null, null, new n(this, null), 3);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.u;
    }
}
