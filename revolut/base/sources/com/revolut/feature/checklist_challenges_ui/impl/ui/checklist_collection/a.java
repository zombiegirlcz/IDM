package com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_collection;

import android.os.Parcelable;
import c93.f;
import cli.g;
import cli.n;
import cli.y;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.checklist_challenges.api.models.ChecklistChallenge;
import com.revolut.feature.checklist_challenges.api.models.ChecklistChallengeReward;
import com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_collection.exceptions.ChecklistChallengeAccessException;
import com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_collection.exceptions.ChecklistDeeplinkAccessException;
import com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_collection.exceptions.VirtualCardLimitsAccessException;
import com.revolut.kompot.common.R$string;
import eh3.b;
import eh3.d;
import eh3.l;
import eh3.q;
import eh3.s;
import eh3.t;
import hx7.e;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nii.e0;
import nii.z;
import oki.h;
import org.jetbrains.annotations.NotNull;
import twg.c;
import w4l.i;
import wli.x;
import zhm.d0;
import zhm.h0;
import zhm.w;
import zhm.y0;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends h implements q {

    @NotNull
    public static final t Companion = new t();
    public final ChecklistCollectionScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final wg3.a f65815p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final x f65816q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b f65817r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final c f65818s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final r10.t f65819t;
    public final d u;
    public final vii.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f65820w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f65821x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final y f65822y;

    public a(n stateMapper, ChecklistCollectionScreenContract$InputData inputData, wg3.a checklistChallengesUIInteractor, x deeplinkHandler, b checklistCollectionCardDesignProvider, c checklistCollectionFlowLauncher, r10.t checklistCollectionChallengeProvider, d checklistCollectionErrorDialogProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(checklistChallengesUIInteractor, "checklistChallengesUIInteractor");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(checklistCollectionCardDesignProvider, "checklistCollectionCardDesignProvider");
        Intrinsics.checkNotNullParameter(checklistCollectionFlowLauncher, "checklistCollectionFlowLauncher");
        Intrinsics.checkNotNullParameter(checklistCollectionChallengeProvider, "checklistCollectionChallengeProvider");
        Intrinsics.checkNotNullParameter(checklistCollectionErrorDialogProvider, "checklistCollectionErrorDialogProvider");
        this.o = inputData;
        this.f65815p = checklistChallengesUIInteractor;
        this.f65816q = deeplinkHandler;
        this.f65817r = checklistCollectionCardDesignProvider;
        this.f65818s = checklistCollectionFlowLauncher;
        this.f65819t = checklistCollectionChallengeProvider;
        this.u = checklistCollectionErrorDialogProvider;
        this.v = new vii.b(i.f294643c);
        this.f65821x = e.a(this, new s(this, 0));
        this.f65822y = mra.d.b(this, new l(new Data(null, null, true, 3, null), true), stateMapper, null, false, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_collection.a r4, com.revolut.feature.checklist_challenges.api.models.ChecklistChallenge r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof eh3.u
            if (r0 == 0) goto L13
            r0 = r6
            eh3.u r0 = (eh3.u) r0
            int r1 = r0.f125729w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f125729w = r1
            goto L18
        L13:
            eh3.u r0 = new eh3.u
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f125729w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r6)     // Catch: java.lang.Exception -> L27
            goto L3d
        L27:
            r4 = move-exception
            goto L40
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            yhm.o.b(r6)
            r0.f125729w = r3     // Catch: java.lang.Exception -> L27
            java.io.Serializable r6 = r4.L2(r5, r0)     // Catch: java.lang.Exception -> L27
            if (r6 != r1) goto L3d
            return r1
        L3d:
            e93.f r6 = (e93.f) r6     // Catch: java.lang.Exception -> L27
            goto L4b
        L40:
            zhm.h0 r5 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r6 = rd0.d.f253311a
            rd0.c r6 = rd0.c.ERROR
            r0 = 0
            rd0.d.a(r6, r0, r0, r4, r5)
            r6 = r0
        L4b:
            if (r6 != 0) goto L50
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            goto L7f
        L50:
            java.util.List r4 = r6.f()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            boolean r5 = r4 instanceof java.util.Collection
            if (r5 == 0) goto L64
            r5 = r4
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L64
            goto L7b
        L64:
            java.util.Iterator r4 = r4.iterator()
        L68:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L7b
            java.lang.Object r5 = r4.next()
            e93.y r5 = (e93.y) r5
            int r5 = r5.f123901c
            r6 = 1000(0x3e8, float:1.401E-42)
            if (r5 < r6) goto L68
            r3 = 0
        L7b:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
        L7f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_collection.a.I2(com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_collection.a, com.revolut.feature.checklist_challenges.api.models.ChecklistChallenge, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_collection.a r5, java.lang.String r6, gim.c r7) {
        /*
            java.lang.String r0 = "Unable to handle deeplink "
            boolean r1 = r7 instanceof eh3.x
            if (r1 == 0) goto L15
            r1 = r7
            eh3.x r1 = (eh3.x) r1
            int r2 = r1.f125734x
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f125734x = r2
            goto L1a
        L15:
            eh3.x r1 = new eh3.x
            r1.<init>(r5, r7)
        L1a:
            java.lang.Object r7 = r1.v
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f125734x
            r4 = 1
            if (r3 == 0) goto L33
            if (r3 != r4) goto L2b
            java.lang.String r6 = r1.u
            yhm.o.b(r7)     // Catch: java.lang.Throwable -> L64
            goto L47
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            yhm.o.b(r7)
            wli.x r5 = r5.f65816q     // Catch: java.lang.Throwable -> L64
            lg0.a r7 = lg0.a.OPEN_BROWSER     // Catch: java.lang.Throwable -> L64
            java.lang.Boolean r3 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L64
            r1.u = r6     // Catch: java.lang.Throwable -> L64
            r1.f125734x = r4     // Catch: java.lang.Throwable -> L64
            java.lang.Object r7 = r5.L1(r6, r7, r3, r1)     // Catch: java.lang.Throwable -> L64
            if (r7 != r2) goto L47
            return r2
        L47:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L64
            boolean r5 = r7.booleanValue()     // Catch: java.lang.Throwable -> L64
            if (r5 == 0) goto L52
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        L52:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L64
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L64
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L64
            r7.append(r6)     // Catch: java.lang.Throwable -> L64
            java.lang.String r6 = r7.toString()     // Catch: java.lang.Throwable -> L64
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L64
            throw r5     // Catch: java.lang.Throwable -> L64
        L64:
            r5 = move-exception
            boolean r6 = r5 instanceof java.util.concurrent.CancellationException
            if (r6 != 0) goto L74
            com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_collection.exceptions.ChecklistDeeplinkAccessException r6 = new com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_collection.exceptions.ChecklistDeeplinkAccessException
            java.lang.String r7 = "cause"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r7)
            r6.<init>(r5)
            throw r6
        L74:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_collection.a.J2(com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_collection.a, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
    
        if (r6 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object K2(com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_collection.a r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof eh3.y
            if (r0 == 0) goto L13
            r0 = r6
            eh3.y r0 = (eh3.y) r0
            int r1 = r0.f125735w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f125735w = r1
            goto L18
        L13:
            eh3.y r0 = new eh3.y
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f125735w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r6)     // Catch: java.lang.Throwable -> L60
            goto L4f
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            yhm.o.b(r6)     // Catch: java.lang.Throwable -> L60
            goto L44
        L36:
            yhm.o.b(r6)
            r10.t r6 = r5.f65819t     // Catch: java.lang.Throwable -> L60
            r0.f125735w = r4     // Catch: java.lang.Throwable -> L60
            java.lang.Object r6 = r6.c(r0)     // Catch: java.lang.Throwable -> L60
            if (r6 != r1) goto L44
            goto L4e
        L44:
            com.revolut.feature.checklist_challenges.api.models.ChecklistChallenge r6 = (com.revolut.feature.checklist_challenges.api.models.ChecklistChallenge) r6     // Catch: java.lang.Throwable -> L60
            r0.f125735w = r3     // Catch: java.lang.Throwable -> L60
            java.io.Serializable r6 = r5.L2(r6, r0)     // Catch: java.lang.Throwable -> L60
            if (r6 != r1) goto L4f
        L4e:
            return r1
        L4f:
            e93.f r6 = (e93.f) r6     // Catch: java.lang.Throwable -> L60
            com.revolut.kompot.navigable.vc.modal.a r5 = r5.f65821x     // Catch: java.lang.Throwable -> L60
            com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_collection.ChecklistCollectionScreenContract$ModalStep$CardLimits r0 = new com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_collection.ChecklistCollectionScreenContract$ModalStep$CardLimits     // Catch: java.lang.Throwable -> L60
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L60
            com.revolut.kompot.common.ModalDestination$Style$BOTTOM_DIALOG r6 = com.revolut.kompot.common.ModalDestination.Style.BOTTOM_DIALOG.f98301a     // Catch: java.lang.Throwable -> L60
            oki.h.v2(r5, r0, r6)     // Catch: java.lang.Throwable -> L60
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        L60:
            r5 = move-exception
            boolean r6 = r5 instanceof java.util.concurrent.CancellationException
            if (r6 != 0) goto L70
            com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_collection.exceptions.VirtualCardLimitsAccessException r6 = new com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_collection.exceptions.VirtualCardLimitsAccessException
            java.lang.String r0 = "cause"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r6.<init>(r5)
            throw r6
        L70:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_collection.a.K2(com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_collection.a, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, vkm.q.Q(this.v, new dz6.n(continuation, this, 8)), null, null, new ea4.d(this, continuation, 12), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f65821x;
    }

    public final Serializable L2(ChecklistChallenge checklistChallenge, gim.c cVar) {
        ChecklistChallengeReward checklistChallengeReward = checklistChallenge.f65776b;
        String str = checklistChallenge.d;
        boolean z = checklistChallengeReward instanceof ChecklistChallengeReward.VirtualAsset;
        b bVar = this.f65817r;
        if (!z) {
            if (!(checklistChallengeReward instanceof ChecklistChallengeReward.PhysicalCard)) {
                if (checklistChallengeReward instanceof ChecklistChallengeReward.Unknown) {
                    throw new IllegalStateException("Challenge reward is ChecklistChallengeReward.Unknown");
                }
                throw new NoWhenBranchMatchedException();
            }
            bVar.getClass();
            String upperCase = ((ChecklistChallengeReward.PhysicalCard) checklistChallengeReward).f65787a.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            return bVar.a(y0.b(upperCase), str, f.PHYSICAL, cVar);
        }
        List list = ((ChecklistChallengeReward.VirtualAsset) checklistChallengeReward).f65793a;
        bVar.getClass();
        if (list.isEmpty()) {
            throw new IllegalStateException("Empty cardDesignNames");
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            String upperCase2 = ((String) it8.next()).toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
            arrayList.add(upperCase2);
        }
        return bVar.a(d0.i1(arrayList), str, f.VIRTUAL, cVar);
    }

    @Override // cli.z
    public final g getState() {
        return this.f65822y;
    }

    @Override // yji.l
    public final boolean o1(Throwable throwable) {
        Throwable cause;
        int i;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        nii.y0 y0Var = null;
        rd0.d.a(rd0.c.ERROR, null, null, throwable, h0Var);
        this.u.getClass();
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (tj0.a.a(throwable) || ((cause = throwable.getCause()) != null && tj0.a.a(cause))) {
            y0Var = new nii.y0("ERROR_DIALOG_ID", new e0((Clause) new TextLocalisedClause(R$string.common_offline_state_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.common_offline_state_description, null, null, 14), (TextLocalisedClause) null, (Parcelable) null, false, (AnalyticsProduct) null, 1020), false, 4);
        } else {
            if (throwable instanceof ChecklistChallengeAccessException) {
                i = com.revolut.feature.checklist_challenges_ui.impl.R$string.checklist_collection_error_dialog_challenge_action_title;
            } else if (throwable instanceof VirtualCardLimitsAccessException) {
                i = com.revolut.feature.checklist_challenges_ui.impl.R$string.checklist_collection_error_dialog_virtual_card_limits_title;
            } else if (throwable instanceof ChecklistDeeplinkAccessException) {
                i = com.revolut.feature.checklist_challenges_ui.impl.R$string.checklist_collection_error_dialog_deeplink_title;
            }
            y0Var = new nii.y0("ERROR_DIALOG_ID", new z(new TextLocalisedClause(i, null, null, 14), new TextLocalisedClause(com.revolut.feature.checklist_challenges_ui.impl.R$string.checklist_collection_error_dialog_description, null, null, 14), new TextLocalisedClause(com.revolut.feature.checklist_challenges_ui.impl.R$string.checklist_collection_error_dialog_button, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 4);
        }
        if (y0Var == null) {
            return false;
        }
        yji.l.a1(this, X1(y0Var), null, null, null, 7);
        return true;
    }
}
