package com.revolut.feature.onboarding.impl.user_migration;

import ad9.g;
import ad9.m;
import ang.f;
import cli.y;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.onboarding.api.user_migration.PlannedUserMigrationResult;
import com.revolut.feature.onboarding.api.user_migration.UnsupportedMigrationException;
import com.revolut.feature.onboarding.impl.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import nii.g0;
import nii.y0;
import nii.z;
import oki.h;
import org.jetbrains.annotations.NotNull;
import skm.a2;
import yji.l;
import yki.i;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends h implements ad9.d {

    @NotNull
    public static final g Companion = new g();
    public final rqi.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f f78589p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final a99.g f78590q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final UserMigrationFlowContract$InputData f78591r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j89.a f78592s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f78593t;
    public final i u;

    public e(rqi.c googlePlayNaviCommandFactory, f userInteractor, a99.g userMigrationInteractor, UserMigrationFlowContract$InputData inputData, j89.a qesTermsConfigurationProvider) {
        Intrinsics.checkNotNullParameter(googlePlayNaviCommandFactory, "googlePlayNaviCommandFactory");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(userMigrationInteractor, "userMigrationInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(qesTermsConfigurationProvider, "qesTermsConfigurationProvider");
        this.o = googlePlayNaviCommandFactory;
        this.f78589p = userInteractor;
        this.f78590q = userMigrationInteractor;
        this.f78591r = inputData;
        this.f78592s = qesTermsConfigurationProvider;
        this.f78593t = mra.d.b(this, new ad9.e(false), new a54.b(2), null, false, 12);
        this.u = d8l.d.a(this, new ack.f(this, 2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006e, code lost:
    
        if (r1 == r3) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00de, code lost:
    
        if (r1 == r3) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0151, code lost:
    
        if (J2(r2) == r3) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object I2(com.revolut.feature.onboarding.api.user_migration.PlannedUserMigrationResult r12, gim.c r13) {
        /*
            Method dump skipped, instruction units count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.onboarding.impl.user_migration.e.I2(com.revolut.feature.onboarding.api.user_migration.PlannedUserMigrationResult, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J2(gim.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof ad9.k
            if (r0 == 0) goto L13
            r0 = r8
            ad9.k r0 = (ad9.k) r0
            int r1 = r0.f3302w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3302w = r1
            goto L18
        L13:
            ad9.k r0 = new ad9.k
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f3302w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r8)
            goto L42
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L2f:
            yhm.o.b(r8)
            ang.f r8 = r7.f78589p
            r2 = 0
            efm.d0 r8 = r8.f(r2)
            r0.f3302w = r3
            java.lang.Object r8 = nim.a.b(r8, r0)
            if (r8 != r1) goto L42
            return r1
        L42:
            do3.n r8 = (do3.n) r8
            com.revolut.feature.onboarding.impl.user_migration.UserMigrationFlowContract$Step$PlaceOfBirth r2 = new com.revolut.feature.onboarding.impl.user_migration.UserMigrationFlowContract$Step$PlaceOfBirth
            kotlin.jvm.internal.Intrinsics.h(r8)
            wi0.b r8 = do3.q.y(r8)
            r2.<init>(r8)
            r5 = 0
            r6 = 12
            yki.i r1 = r7.u
            r3 = 0
            r4 = 0
            r0 = r7
            oki.h.t2(r0, r1, r2, r3, r4, r5, r6)
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.onboarding.impl.user_migration.e.J2(gim.c):java.lang.Object");
    }

    public final void K2(PlannedUserMigrationResult.MigrationNotSupported migrationNotSupported) {
        UnsupportedMigrationException unsupportedMigrationException = migrationNotSupported.f78216a;
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, unsupportedMigrationException, h0Var);
        l.a1(this, X1(new y0("UNSUPPORTED_MIGRATION_DIALOG_ID", new z(new TextLocalisedClause(R$string.user_migration_update_required_message, null, null, 14), null, new TextLocalisedClause(R$string.user_migration_update_required_button, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32758), false, 4)), null, null, new m(this, null), 3);
    }

    public final a2 L2() {
        return l.a1(this, X1(new y0("ERROR_DIALOG_ID", new z(new TextLocalisedClause(R.string.error_generic, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 4)), null, null, new ad9.l(this, null, 0), 3);
    }

    @Override // yki.j
    public final void M0() {
        l2(new d(this, null), new yi5.b(26));
    }

    public final a2 M2() {
        return l.a1(this, X1(new y0("SUCCESS_DIALOG_ID", new g0(new TextLocalisedClause(R$string.user_migration_fr_branch_submission_reviewing_info, null, null, 14), null, null, null, null, null, null, null, false, null, false, null, 16382), false, 4)), null, null, new ad9.l(this, null, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f78593t;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.u;
    }
}
