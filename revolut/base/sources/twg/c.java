package twg;

import a35.j;
import afa.q;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import androidx.core.view.ViewCompat;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import ang.f;
import au0.c4;
import au0.e4;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.common.base.Preconditions;
import com.revolut.chat.ui.agentinfo.AgentInfoContract$InputData;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.checklist_challenges.api.models.ChecklistChallenge;
import com.revolut.feature.checklist_challenges.api.models.ChecklistChallengeState;
import com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_collection.ChecklistCollectionScreenContract$InputData;
import com.revolut.feature.instruments.trend.collections.api.model.InstrumentsTrendCollectionId;
import com.revolut.feature.rewards.impl.ui.details.flow.PerkDetailsFlowContract$InputData;
import com.revolut.feature.store.api.declaration.StoreApi$Toggles$StoreExclusives;
import com.revolut.kompot.bridge.navigation.KompotFeatureConfig;
import com.revolut.kompot.navigable.screen.BaseScreen;
import com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.transfer.PaymentLinksTransferData;
import com.revolut.shared.feature.market_data.models.domain.models.Asset;
import com.revolut.shared.feature.market_data.models.domain.models.LegacyOrderQuoteParams;
import ecm.f0;
import efm.r;
import fu0.g;
import fu0.h;
import g2e.m0;
import h30.o;
import hd.l;
import io3.i;
import ix0.b1;
import java.io.Closeable;
import java.math.BigDecimal;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import lkd.k;
import md.f2;
import md.w1;
import md.w2;
import mx0.m3;
import or0.u;
import org.json.JSONObject;
import qua.p;
import skm.o1;
import skm.p1;
import skm.r1;
import sri.m;
import vc.s;
import vkm.y;
import wsg.n;
import zhm.d0;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements b1, k, flm.d, h, sji.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f275017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f275018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f275019c;
    public Object d;

    public /* synthetic */ c(Object obj2, Object obj3, Object obj4, Object obj5) {
        this.f275017a = obj2;
        this.f275018b = obj3;
        this.f275019c = obj4;
        this.d = obj5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0083, code lost:
    
        if (r14 == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b6, code lost:
    
        if (r14 != r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object A(gim.c r14) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.f275017a
            com.revolut.feature.apm.upi.impl.flow.screen.review.UpiTransferReviewScreenContract$InputData r0 = (com.revolut.feature.apm.upi.impl.flow.screen.review.UpiTransferReviewScreenContract$InputData) r0
            boolean r1 = r14 instanceof gg2.b
            if (r1 == 0) goto L18
            r1 = r14
            gg2.b r1 = (gg2.b) r1
            int r2 = r1.f143598w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L18
            int r2 = r2 - r3
            r1.f143598w = r2
        L16:
            r12 = r1
            goto L1e
        L18:
            gg2.b r1 = new gg2.b
            r1.<init>(r13, r14)
            goto L16
        L1e:
            java.lang.Object r14 = r12.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r12.f143598w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            yhm.o.b(r14)
            goto Lb9
        L31:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L39:
            yhm.o.b(r14)
            goto L86
        L3d:
            yhm.o.b(r14)
            com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData r14 = r0.d
            java.lang.Object r2 = r13.d
            l80.e r2 = (l80.e) r2
            l80.f r2 = (l80.f) r2
            java.time.LocalDateTime r2 = r2.f()
            boolean r14 = n1l.b.d(r14, r2)
            if (r14 == 0) goto L5a
            eg2.n r14 = new eg2.n
            qua.p r0 = r0.f63012l
            r14.<init>(r0)
            return r14
        L5a:
            java.lang.String r14 = r0.f
            if (r14 == 0) goto L64
            eg2.m r0 = new eg2.m
            r0.<init>(r14)
            return r0
        L64:
            io3.d r14 = r0.e
            if (r14 != 0) goto L88
            java.lang.Object r14 = r13.f275018b
            r5 = r14
            wsg.n r5 = (wsg.n) r5
            xi0.a r14 = xi0.b.Companion
            r14.getClass()
            xi0.b r6 = xi0.b.E
            r9 = 0
            r10 = 62
            r7 = 0
            r8 = 0
            efm.d0 r14 = osg.b.r(r5, r6, r7, r8, r9, r10)
            r12.f143598w = r4
            java.lang.Object r14 = nim.a.b(r14, r12)
            if (r14 != r1) goto L86
            goto Lb8
        L86:
            io3.d r14 = (io3.d) r14
        L88:
            r6 = r14
            java.lang.Object r14 = r13.f275019c
            r2 = r14
            wf2.e r2 = (wf2.e) r2
            r14 = r3
            dj0.d r3 = r0.f63007b
            r5 = r4
            java.lang.String r4 = r0.f63008c
            r7 = r5
            com.revolut.feature.apm.upi.impl.flow.UpiTransferFlowContract$Recipient r5 = r0.f63006a
            kotlin.jvm.internal.Intrinsics.h(r6)
            we2.a r8 = r0.f63009g
            r8.getClass()
            we2.a r9 = we2.a.QR_SCAN
            if (r8 == r9) goto La9
            we2.a r9 = we2.a.QR_UPLOAD
            if (r8 != r9) goto La8
            goto La9
        La8:
            r7 = 0
        La9:
            java.lang.String r8 = r0.f63010h
            java.lang.String r9 = r0.f63011j
            java.util.Map r11 = r0.i
            r12.f143598w = r14
            r10 = 0
            java.lang.Object r14 = r2.a(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            if (r14 != r1) goto Lb9
        Lb8:
            return r1
        Lb9:
            java.lang.String r14 = (java.lang.String) r14
            eg2.m r0 = new eg2.m
            r0.<init>(r14)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: twg.c.A(gim.c):java.lang.Object");
    }

    @Override // fu0.h
    public void B() {
        g gVar = (g) this.f275019c;
        View view = (View) this.f275017a;
        Outline outline = (Outline) this.f275018b;
        if (outline == null) {
            outline = new Outline();
            this.f275018b = outline;
        }
        outline.setEmpty();
        ViewOutlineProvider outlineProvider = view.getOutlineProvider();
        if (outlineProvider != null) {
            outlineProvider.getOutline(view, outline);
        }
        gVar.d(0, 0, view.getWidth(), view.getHeight());
        gVar.f138065c = outline.isEmpty() ? BitmapDescriptorFactory.HUE_RED : outline.getRadius();
        gVar.f138066g = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object C(vii.b r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof eh3.e
            if (r0 == 0) goto L13
            r0 = r7
            eh3.e r0 = (eh3.e) r0
            int r1 = r0.f125711y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f125711y = r1
            goto L18
        L13:
            eh3.e r0 = new eh3.e
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f125709w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f125711y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            twg.c r6 = r0.v
            yhm.o.b(r7)
            goto L6a
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            vii.b r6 = r0.u
            yhm.o.b(r7)
            goto L54
        L3a:
            yhm.o.b(r7)
            java.lang.Object r7 = r5.f275017a
            com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_collection.ChecklistCollectionScreenContract$InputData r7 = (com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_collection.ChecklistCollectionScreenContract$InputData) r7
            java.lang.String r7 = r7.f65812a
            java.lang.Object r2 = r5.d
            lg3.a r2 = (lg3.a) r2
            r0.u = r6
            r0.f125711y = r4
            pg3.b r2 = (pg3.b) r2
            java.lang.Object r7 = r2.g(r7, r0)
            if (r7 != r1) goto L54
            goto L68
        L54:
            r6.a()
            java.lang.Object r6 = r5.f275019c
            r10.t r6 = (r10.t) r6
            r7 = 0
            r0.u = r7
            r0.v = r5
            r0.f125711y = r3
            java.lang.Object r7 = r6.c(r0)
            if (r7 != r1) goto L69
        L68:
            return r1
        L69:
            r6 = r5
        L6a:
            com.revolut.feature.checklist_challenges.api.models.ChecklistChallenge r7 = (com.revolut.feature.checklist_challenges.api.models.ChecklistChallenge) r7
            r6.G(r7)
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: twg.c.C(vii.b, gim.c):java.lang.Object");
    }

    public boolean D(String str) {
        String str2 = (String) this.f275018b;
        if (str2 == null) {
            this.f275018b = str;
            return false;
        }
        if (str.equals(str2)) {
            return true;
        }
        String str3 = (String) this.f275019c;
        if (str3 == null) {
            this.f275019c = str;
            return false;
        }
        if (str.equals(str3)) {
            return true;
        }
        if (((HashSet) this.d) == null) {
            HashSet hashSet = new HashSet(16);
            this.d = hashSet;
            hashSet.add((String) this.f275018b);
            ((HashSet) this.d).add((String) this.f275019c);
        }
        return !((HashSet) this.d).add(str);
    }

    public void F(ChecklistChallenge challenge) {
        Intrinsics.checkNotNullParameter(challenge, "challenge");
        ChecklistChallengeState checklistChallengeState = challenge.f65777c;
        if (checklistChallengeState instanceof ChecklistChallengeState.Active) {
            G(challenge);
        } else {
            if ((checklistChallengeState instanceof ChecklistChallengeState.Purchased) || (checklistChallengeState instanceof ChecklistChallengeState.Completed) || (checklistChallengeState instanceof ChecklistChallengeState.OptIn)) {
                return;
            }
            if (!(checklistChallengeState instanceof ChecklistChallengeState.Unknown)) {
                throw new NoWhenBranchMatchedException();
            }
            throw new IllegalStateException(j6.a.q("Unknown state for challenge ", ((ChecklistCollectionScreenContract$InputData) this.f275017a).f65812a));
        }
    }

    public void G(ChecklistChallenge checklistChallenge) {
        KompotFeatureConfig kompotFeatureConfigD = ((pg3.b) ((lg3.a) this.d)).d(checklistChallenge, ((ChecklistCollectionScreenContract$InputData) this.f275017a).f65813b);
        if (kompotFeatureConfigD == null) {
            throw new IllegalStateException(j6.a.q("Unable to get feature config for challenge ", checklistChallenge.f65775a));
        }
        ((m) this.f275018b).c(gc0.c.f(kompotFeatureConfigD));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
    
        if (C(r6, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object H(vii.b r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof eh3.f
            if (r0 == 0) goto L13
            r0 = r7
            eh3.f r0 = (eh3.f) r0
            int r1 = r0.f125713x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f125713x = r1
            goto L18
        L13:
            eh3.f r0 = new eh3.f
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f125713x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            goto L5e
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            vii.b r6 = r0.u
            yhm.o.b(r7)
            goto L4a
        L38:
            yhm.o.b(r7)
            java.lang.Object r7 = r5.f275019c
            r10.t r7 = (r10.t) r7
            r0.u = r6
            r0.f125713x = r4
            java.lang.Object r7 = r7.c(r0)
            if (r7 != r1) goto L4a
            goto L5d
        L4a:
            com.revolut.feature.checklist_challenges.api.models.ChecklistChallenge r7 = (com.revolut.feature.checklist_challenges.api.models.ChecklistChallenge) r7
            com.revolut.feature.checklist_challenges.api.models.ChecklistChallengeState r2 = r7.f65777c
            boolean r4 = r2 instanceof com.revolut.feature.checklist_challenges.api.models.ChecklistChallengeState.OptIn
            if (r4 == 0) goto L61
            r7 = 0
            r0.u = r7
            r0.f125713x = r3
            java.lang.Object r6 = r5.C(r6, r0)
            if (r6 != r1) goto L5e
        L5d:
            return r1
        L5e:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L61:
            boolean r6 = r2 instanceof com.revolut.feature.checklist_challenges.api.models.ChecklistChallengeState.Active
            if (r6 != 0) goto L8a
            boolean r6 = r2 instanceof com.revolut.feature.checklist_challenges.api.models.ChecklistChallengeState.Purchased
            if (r6 != 0) goto L8a
            boolean r6 = r2 instanceof com.revolut.feature.checklist_challenges.api.models.ChecklistChallengeState.Completed
            if (r6 == 0) goto L6e
            goto L8a
        L6e:
            boolean r6 = r2 instanceof com.revolut.feature.checklist_challenges.api.models.ChecklistChallengeState.Unknown
            if (r6 == 0) goto L84
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.Object r7 = r5.f275017a
            com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_collection.ChecklistCollectionScreenContract$InputData r7 = (com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_collection.ChecklistCollectionScreenContract$InputData) r7
            java.lang.String r7 = r7.f65812a
            java.lang.String r0 = "Unknown state for challenge "
            java.lang.String r7 = j6.a.q(r0, r7)
            r6.<init>(r7)
            throw r6
        L84:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        L8a:
            r5.G(r7)
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: twg.c.H(vii.b, gim.c):java.lang.Object");
    }

    public r I() {
        r rVarW = nim.a.w(((f) this.d).k(false), new ghk.r(17));
        bgc.e eVar = (bgc.e) this.f275018b;
        PerkDetailsFlowContract$InputData perkDetailsFlowContract$InputData = (PerkDetailsFlowContract$InputData) this.f275017a;
        String rewardId = perkDetailsFlowContract$InputData.f84922a;
        boolean z = perkDetailsFlowContract$InputData.f;
        ugc.g gVar = (ugc.g) eVar;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(rewardId, "rewardId");
        return nim.a.w(mif.a.d(rVarW, pd.b.r(gVar.h(rewardId, z, false), new u69.g(gVar, rewardId, 26))), new ghk.r(18));
    }

    public t38.e K(AccountId accountId, Set pocketTypes) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(pocketTypes, "pocketTypes");
        return new t38.e(rd0.e.b(osg.b.e((n) this.f275017a, false, null, null, i.INTERNAL, null, null, accountId, 52)), 24, ((wa7.m) this.d).k(), new m0(pocketTypes, null, 13));
    }

    public akg.n L(InstrumentsTrendCollectionId collectionId, ph7.c cVar, Map selectedFilters, w4l.k loadingStrategy) {
        di7.e eVar = (di7.e) ((di7.b) this.f275018b);
        eVar.getClass();
        Intrinsics.checkNotNullParameter(collectionId, "collectionId");
        Intrinsics.checkNotNullParameter(selectedFilters, "selectedFilters");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(eVar.d.b(new di7.a(collectionId, selectedFilters), loadingStrategy), new q(this, cVar, 7));
    }

    public Flow M() {
        int i = 2;
        Continuation continuation = null;
        return vkm.q.q(rd0.e.e(new y(new j(i, 8, continuation), new an9.g(((uvl.c) this.f275018b).v(), i)), h0.f322473a, new a35.k(3, 24, continuation)));
    }

    public akg.n N(InstrumentsTrendCollectionId collectionId, ph7.c collectionKey, Map selectedFilters, Integer num, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(collectionId, "collectionId");
        Intrinsics.checkNotNullParameter(collectionKey, "collectionKey");
        Intrinsics.checkNotNullParameter(selectedFilters, "selectedFilters");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(boh.f.e(L(collectionId, collectionKey, selectedFilters, loadingStrategy), new ai7.b(this, collectionKey, 0)), new ai7.a(0, num));
    }

    public void P() {
        Rect rect = (Rect) this.f275018b;
        c4 c4Var = (c4) this.f275019c;
        if (c4Var != null) {
            c4Var.cancel();
        }
        Object parent = ((View) this.f275017a).getParent();
        c4 c4Var2 = null;
        View view = parent instanceof View ? (View) parent : null;
        if (view == null) {
            return;
        }
        ViewParent parent2 = ((e4) this.d).f9178a.getParent();
        ViewGroup targetParent = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
        if (targetParent == null) {
            return;
        }
        if (!ViewCompat.isLaidOut(targetParent) || targetParent.isLayoutRequested()) {
            c4Var2 = new c4(targetParent, view, targetParent, this);
            targetParent.addOnLayoutChangeListener(c4Var2);
        } else {
            Object obj2 = u.f228038a;
            Intrinsics.checkNotNullParameter(view, "<this>");
            Intrinsics.checkNotNullParameter(targetParent, "targetParent");
            ViewParent parent3 = view.getParent();
            while (true) {
                if (parent3 == null) {
                    break;
                }
                if (parent3 == targetParent) {
                    rect.set(0, 0, 0, 0);
                    targetParent.offsetDescendantRectToMyCoords(view, rect);
                    break;
                }
                parent3 = parent3.getParent();
            }
        }
        this.f275019c = c4Var2;
    }

    public void Q(String str) {
        this.d = str;
    }

    public void R(InetSocketAddress inetSocketAddress) {
        this.f275017a = (SocketAddress) Preconditions.checkNotNull(inetSocketAddress, "proxyAddress");
    }

    @Override // sji.a
    public Object S(BaseScreen baseScreen) {
        throw null;
    }

    public void T(InetSocketAddress inetSocketAddress) {
        this.f275018b = (InetSocketAddress) Preconditions.checkNotNull(inetSocketAddress, "targetAddress");
    }

    public void U(String str) {
        this.f275019c = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r13v7, types: [lkd.k, oki.h] */
    @Override // lkd.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object Y(com.revolut.feature.slot_manager.api.model.SlotContext r10, lkd.j r11, lkd.d r12, kotlin.coroutines.Continuation r13) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: twg.c.Y(com.revolut.feature.slot_manager.api.model.SlotContext, lkd.j, lkd.d, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public synchronized e a() {
        try {
            if (((e) this.f275019c) == null) {
                this.f275019c = (e) ((RoomDatabase) this.f275017a).getTypeConverter(e.class);
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return (e) this.f275019c;
    }

    @Override // fu0.h
    public g[] b() {
        return (g[]) this.d;
    }

    @Override // sji.a
    /* JADX INFO: renamed from: build */
    public sji.b mo3800build() {
        s.h((BaseScreen) this.f275019c, BaseScreen.class);
        s.h((AgentInfoContract$InputData) this.d, AgentInfoContract$InputData.class);
        return new h30.i((h30.n) this.f275017a, (o) this.f275018b, (AgentInfoContract$InputData) this.d);
    }

    public Object e(p pVar, gim.i iVar) {
        Object objB = nim.a.b(((yua.q) ((xua.a) this.f275017a)).f(pVar.f249314a.f160150a), iVar);
        return objB == fim.a.COROUTINE_SUSPENDED ? objB : Unit.f186387a;
    }

    public void f(Object obj2, Object obj3, f2 f2Var, boolean z) throws GeneralSecurityException {
        byte[] bArrArray;
        if (((ConcurrentHashMap) this.f275018b) == null) {
            throw new IllegalStateException("addPrimitive cannot be called after build");
        }
        if (obj2 == null && obj3 == null) {
            throw new GeneralSecurityException("at least one of the `fullPrimitive` or `primitive` must be set");
        }
        if (f2Var.C() != w1.ENABLED) {
            throw new GeneralSecurityException("only ENABLED key is allowed");
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f275018b;
        Integer numValueOf = Integer.valueOf(f2Var.A());
        if (f2Var.B() == w2.RAW) {
            numValueOf = null;
        }
        ad.c cVarA = l.f151354b.a(hd.r.r(f2Var.z().A(), f2Var.z().B(), f2Var.z().z(), f2Var.B(), numValueOf));
        int i = ad.b.f3189a[f2Var.B().ordinal()];
        if (i == 1 || i == 2) {
            bArrArray = ByteBuffer.allocate(5).put((byte) 0).putInt(f2Var.A()).array();
        } else if (i == 3) {
            bArrArray = ByteBuffer.allocate(5).put((byte) 1).putInt(f2Var.A()).array();
        } else {
            if (i != 4) {
                throw new GeneralSecurityException("unknown output prefix type");
            }
            bArrArray = ad.c.f3190a;
        }
        ad.o oVar = new ad.o(obj2, obj3, bArrArray, f2Var.C(), f2Var.B(), f2Var.A(), f2Var.z().A(), cVarA);
        ArrayList arrayList = new ArrayList();
        arrayList.add(oVar);
        byte[] bArr = oVar.f3205c;
        ad.p pVar = new ad.p(bArr != null ? Arrays.copyOf(bArr, bArr.length) : null);
        List list = (List) concurrentHashMap.put(pVar, Collections.unmodifiableList(arrayList));
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(list);
            arrayList2.add(oVar);
            concurrentHashMap.put(pVar, Collections.unmodifiableList(arrayList2));
        }
        if (z) {
            if (((ad.o) this.f275019c) != null) {
                throw new IllegalStateException("you cannot set two primary primitives");
            }
            this.f275019c = oVar;
        }
    }

    public f0 g() {
        return new f0((SocketAddress) this.f275017a, (InetSocketAddress) this.f275018b, (String) this.f275019c, (String) this.d);
    }

    @Override // ix0.b1
    public int getBottom() {
        return ((Rect) this.f275018b).bottom;
    }

    @Override // ix0.b1
    public int getLeft() {
        return -((Rect) this.f275018b).left;
    }

    @Override // ix0.b1
    public int getRight() {
        return ((Rect) this.f275018b).right;
    }

    @Override // ix0.b1
    public int getTop() {
        return -((Rect) this.f275018b).top;
    }

    @Override // fu0.h
    public View getView() {
        return (View) this.f275017a;
    }

    public c h() {
        return new c((Closeable) this.f275017a);
    }

    public Object j(p pVar, gim.i iVar) {
        Object objB = nim.a.b(((yua.q) ((xua.a) this.f275017a)).j(pVar.f249314a.f160150a), iVar);
        return objB == fim.a.COROUTINE_SUSPENDED ? objB : Unit.f186387a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0065, code lost:
    
        if (nim.a.a(r7, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Enum k(qua.p r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof gce.b
            if (r0 == 0) goto L13
            r0 = r8
            gce.b r0 = (gce.b) r0
            int r1 = r0.f142418w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f142418w = r1
            goto L18
        L13:
            gce.b r0 = new gce.b
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f142418w
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2b
            yhm.o.b(r8)
            goto L68
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            yhm.o.b(r8)
            goto L55
        L37:
            yhm.o.b(r8)
            java.lang.Object r8 = r6.f275019c
            vz1.g r8 = (vz1.g) r8
            ibd.e r7 = r7.f249314a
            java.lang.String r7 = r7.f160150a
            r0.f142418w = r5
            vz1.e r2 = new vz1.e
            r5 = 0
            r2.<init>(r8, r7, r5, r3)
            skm.p0 r7 = skm.p0.f264001a
            elm.f r7 = elm.f.f127540b
            java.lang.Object r7 = skm.e0.J(r7, r2, r0)
            if (r7 != r1) goto L55
            goto L67
        L55:
            java.lang.Object r7 = r6.f275017a
            xua.a r7 = (xua.a) r7
            yua.q r7 = (yua.q) r7
            pfm.a r7 = r7.t(r3)
            r0.f142418w = r4
            java.lang.Object r7 = nim.a.a(r7, r0)
            if (r7 != r1) goto L68
        L67:
            return r1
        L68:
            qua.q r7 = qua.q.SUCCESS
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: twg.c.k(qua.p, gim.c):java.lang.Enum");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Enum l(qua.p r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof gce.c
            if (r0 == 0) goto L13
            r0 = r8
            gce.c r0 = (gce.c) r0
            int r1 = r0.f142419w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f142419w = r1
            goto L18
        L13:
            gce.c r0 = new gce.c
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f142419w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r8)
            goto L56
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            yhm.o.b(r8)
            java.lang.Object r8 = r6.f275018b
            ryc.a r8 = (ryc.a) r8
            ibd.e r7 = r7.f249314a
            java.lang.String r7 = r7.f160150a
            java.lang.String r2 = "authorisationId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r2)
            s09.c r2 = new s09.c
            r4 = 21
            r5 = 0
            r2.<init>(r8, r7, r5, r4)
            kotlin.coroutines.g r7 = kotlin.coroutines.g.f186406a
            pfm.h r7 = pd.b.n(r7, r2)
            r0.f142419w = r3
            java.lang.Object r7 = nim.a.a(r7, r0)
            if (r7 != r1) goto L56
            return r1
        L56:
            qua.q r7 = qua.q.SUCCESS
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: twg.c.l(qua.p, gim.c):java.lang.Enum");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Enum m(qua.p r8, gim.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof gce.d
            if (r0 == 0) goto L13
            r0 = r9
            gce.d r0 = (gce.d) r0
            int r1 = r0.f142420w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f142420w = r1
            goto L18
        L13:
            gce.d r0 = new gce.d
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f142420w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r9)
            goto L67
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2f:
            yhm.o.b(r9)
            java.lang.Object r9 = r7.f275017a
            xua.a r9 = (xua.a) r9
            ibd.e r2 = r8.f249314a
            java.lang.String r2 = r2.f160150a
            java.lang.String r8 = r8.L
            yua.q r9 = (yua.q) r9
            java.lang.String r4 = "id"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
            ufm.b r4 = r9.m()
            yua.b r5 = new yua.b
            r6 = 0
            r5.<init>(r9, r2, r8, r6)
            yta.c r8 = new yta.c
            r9 = 7
            r8.<init>(r9, r5)
            pfm.a r9 = new pfm.a
            r2 = 4
            r9.<init>(r4, r8, r2)
            java.lang.String r8 = "flatMapCompletable(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r8)
            r0.f142420w = r3
            java.lang.Object r8 = nim.a.a(r9, r0)
            if (r8 != r1) goto L67
            return r1
        L67:
            qua.q r8 = qua.q.SUCCESS
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: twg.c.m(qua.p, gim.c):java.lang.Enum");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object n(qce.p0 r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof gce.e
            if (r0 == 0) goto L13
            r0 = r6
            gce.e r0 = (gce.e) r0
            int r1 = r0.f142421w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f142421w = r1
            goto L18
        L13:
            gce.e r0 = new gce.e
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f142421w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L51
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            java.lang.Object r6 = r4.f275017a
            xua.a r6 = (xua.a) r6
            qua.p r2 = r5.f244756a
            ibd.e r2 = r2.f249314a
            java.lang.String r2 = r2.f160150a
            qce.q0 r5 = r5.f244757b
            java.lang.String r5 = r5.toString()
            yua.q r6 = (yua.q) r6
            ufm.i r5 = r6.k(r2, r5)
            r0.f142421w = r3
            java.lang.Object r6 = nim.a.b(r5, r0)
            if (r6 != r1) goto L51
            return r1
        L51:
            java.lang.String r5 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: twg.c.n(qce.p0, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Enum o(qua.p r8, gim.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof gce.f
            if (r0 == 0) goto L13
            r0 = r9
            gce.f r0 = (gce.f) r0
            int r1 = r0.f142422w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f142422w = r1
            goto L18
        L13:
            gce.f r0 = new gce.f
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f142422w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r9)
            goto L68
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2f:
            yhm.o.b(r9)
            java.lang.Object r9 = r7.f275017a
            xua.a r9 = (xua.a) r9
            ibd.e r2 = r8.f249314a
            java.lang.String r2 = r2.f160150a
            java.lang.String r8 = r8.L
            yua.q r9 = (yua.q) r9
            java.lang.String r4 = "id"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
            ufm.b r4 = r9.m()
            yua.b r5 = new yua.b
            r6 = 2
            r5.<init>(r9, r2, r8, r6)
            yta.c r8 = new yta.c
            r9 = 28
            r8.<init>(r9, r5)
            pfm.a r9 = new pfm.a
            r2 = 4
            r9.<init>(r4, r8, r2)
            java.lang.String r8 = "flatMapCompletable(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r8)
            r0.f142422w = r3
            java.lang.Object r8 = nim.a.a(r9, r0)
            if (r8 != r1) goto L68
            return r1
        L68:
            qua.q r8 = qua.q.SUCCESS
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: twg.c.o(qua.p, gim.c):java.lang.Enum");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Enum p(qua.p r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof gce.g
            if (r0 == 0) goto L13
            r0 = r7
            gce.g r0 = (gce.g) r0
            int r1 = r0.f142424x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f142424x = r1
            goto L18
        L13:
            gce.g r0 = new gce.g
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f142424x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            qua.p r6 = r0.u
            yhm.o.b(r7)
            goto L4e
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            yhm.o.b(r7)
            java.lang.Object r7 = r5.f275017a
            xua.a r7 = (xua.a) r7
            ibd.e r2 = r6.f249314a
            java.lang.String r2 = r2.f160150a
            r4 = 0
            yua.q r7 = (yua.q) r7
            ufm.i r7 = r7.k(r2, r4)
            r0.u = r6
            r0.f142424x = r3
            java.lang.Object r7 = nim.a.b(r7, r0)
            if (r7 != r1) goto L4e
            return r1
        L4e:
            qua.q r7 = (qua.q) r7
            ibd.e r6 = r6.f249314a
            ibd.h r6 = r6.f160152c
            ibd.h r0 = ibd.h.YOUTH_ALLOWANCE
            if (r6 != r0) goto L63
            java.lang.Object r6 = r5.d
            sb8.a r6 = (sb8.a) r6
            v60.i r6 = r6.f261515b
            kotlin.Unit r0 = kotlin.Unit.f186387a
            r6.onNext(r0)
        L63:
            kotlin.jvm.internal.Intrinsics.h(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: twg.c.p(qua.p, gim.c):java.lang.Enum");
    }

    public Enum r(p pVar, gim.c cVar) {
        if (qua.u.x(pVar)) {
            return k(pVar, cVar);
        }
        switch (gce.a.f142417a[pVar.f249314a.f160152c.ordinal()]) {
            case 1:
            case 2:
                return m(pVar, cVar);
            case 3:
            default:
                return p(pVar, cVar);
            case 4:
                return o(pVar, cVar);
            case 5:
                return l(pVar, cVar);
            case 6:
            case 7:
            case 8:
                return k(pVar, cVar);
        }
    }

    public ArrayList s() {
        List<o3f.a> listA = ((j3f.a) this.d).a();
        ArrayList arrayList = new ArrayList(w.t(listA, 10));
        for (o3f.a aVar : listA) {
            Intrinsics.checkNotNullParameter(aVar, "<this>");
            arrayList.add(new ubl.a(aVar.f221798a, aVar.f221799b, aVar.f221800c, aVar.d, aVar.e, aVar.f, aVar.f221801g, aVar.f221802h));
        }
        return arrayList;
    }

    public ArrayList t() {
        List<p3f.a> listA = ((j3f.c) this.f275019c).a();
        ArrayList arrayList = new ArrayList(w.t(listA, 10));
        for (p3f.a aVar : listA) {
            Intrinsics.checkNotNullParameter(aVar, "<this>");
            arrayList.add(new ubl.b(aVar.f232747a, aVar.f232748b, aVar.f232749c, aVar.d, aVar.e, aVar.f232751h, aVar.i, aVar.f, aVar.f232750g));
        }
        return arrayList;
    }

    public ArrayList u() {
        k3f.a aVar = (k3f.a) this.f275017a;
        List<q3f.a> list = (List) DBUtil.performBlocking(aVar.f180708a, true, false, new k0d.c(aVar, 9));
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (q3f.a aVar2 : list) {
            String str = aVar2.f241958a;
            Instant instantOfEpochMilli = Instant.ofEpochMilli(aVar2.f241959b.getMillis());
            ZoneOffset zoneOffset = ZoneOffset.UTC;
            arrayList.add(new ubl.c(str, instantOfEpochMilli.atZone(zoneOffset).toLocalDate().toEpochDay(), Instant.ofEpochMilli(aVar2.f241960c.getMillis()).atZone(zoneOffset).toLocalDate().toEpochDay()));
        }
        return arrayList;
    }

    public ArrayList v() {
        k3f.b bVar = (k3f.b) this.f275018b;
        List<q3f.b> list = (List) DBUtil.performBlocking(bVar.f180710a, true, false, new k0d.c(bVar, 10));
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (q3f.b bVar2 : list) {
            String str = bVar2.f241961a;
            Instant instantOfEpochMilli = Instant.ofEpochMilli(bVar2.f241962b.getMillis());
            ZoneOffset zoneOffset = ZoneOffset.UTC;
            arrayList.add(new ubl.d(str, instantOfEpochMilli.atZone(zoneOffset).toLocalDate().toEpochDay(), Instant.ofEpochMilli(bVar2.f241963c.getMillis()).atZone(zoneOffset).toLocalDate().toEpochDay()));
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        if (r14 == r2) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object w(gim.c r14) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.f275017a
            com.revolut.feature.apm.upi.impl.flow.screen.review.UpiTransferReviewScreenContract$InputData r0 = (com.revolut.feature.apm.upi.impl.flow.screen.review.UpiTransferReviewScreenContract$InputData) r0
            boolean r1 = r14 instanceof gg2.a
            if (r1 == 0) goto L17
            r1 = r14
            gg2.a r1 = (gg2.a) r1
            int r2 = r1.f143597x
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f143597x = r2
            goto L1c
        L17:
            gg2.a r1 = new gg2.a
            r1.<init>(r13, r14)
        L1c:
            java.lang.Object r14 = r1.v
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f143597x
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L3c
            if (r3 == r5) goto L38
            if (r3 != r4) goto L30
            io3.d r0 = r1.u
            yhm.o.b(r14)
            goto L7b
        L30:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L38:
            yhm.o.b(r14)
            goto L61
        L3c:
            yhm.o.b(r14)
            io3.d r14 = r0.e
            if (r14 != 0) goto L63
            java.lang.Object r14 = r13.f275018b
            r6 = r14
            wsg.n r6 = (wsg.n) r6
            xi0.a r14 = xi0.b.Companion
            r14.getClass()
            xi0.b r7 = xi0.b.E
            r10 = 0
            r11 = 62
            r8 = 0
            r9 = 0
            efm.d0 r14 = osg.b.r(r6, r7, r8, r9, r10, r11)
            r1.f143597x = r5
            java.lang.Object r14 = nim.a.b(r14, r1)
            if (r14 != r2) goto L61
            goto L77
        L61:
            io3.d r14 = (io3.d) r14
        L63:
            java.lang.Object r3 = r13.f275019c
            wf2.e r3 = (wf2.e) r3
            com.revolut.feature.apm.upi.impl.flow.UpiTransferFlowContract$Recipient r0 = r0.f63006a
            java.lang.String r0 = r0.getId()
            r1.u = r14
            r1.f143597x = r4
            java.lang.Object r0 = r3.d(r0, r1)
            if (r0 != r2) goto L78
        L77:
            return r2
        L78:
            r12 = r0
            r0 = r14
            r14 = r12
        L7b:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            kotlin.jvm.internal.Intrinsics.h(r0)
            eg2.h r1 = new eg2.h
            r1.<init>(r0, r14)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: twg.c.w(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        if (((jte.d) ((gte.a) r4.f275019c)).c(com.revolut.feature.payments.api.PaymentsToggles$PaymentsChargesMigration.f79158c) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object x(com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.transfer.PaymentLinksTransferData r5, gim.c r6) {
        /*
            r4 = this;
            long r0 = r5.f102234a
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            if (r0 == 0) goto L56
            java.lang.Object r0 = r4.f275017a
            com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.PaymentLinksAmountScreenContract$InputData r0 = (com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.PaymentLinksAmountScreenContract$InputData) r0
            hrf.f r0 = r0.getF102201c()
            hrf.f r2 = hrf.f.INCOMING
            if (r0 != r2) goto L16
            goto L56
        L16:
            com.revolut.shared.feature.market_data.models.domain.models.LegacyOrderQuoteParams r5 = r4.y(r5)
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            com.revolut.shared.feature.market_data.models.domain.models.Asset r0 = r5.f104734a
            java.lang.String r0 = r0.f104720b
            com.revolut.shared.feature.market_data.models.domain.models.Asset r2 = r5.f104735b
            java.lang.String r2 = r2.f104720b
            boolean r0 = kotlin.jvm.internal.Intrinsics.f(r0, r2)
            if (r0 == 0) goto L3b
            java.lang.Object r0 = r4.f275019c
            gte.a r0 = (gte.a) r0
            com.revolut.feature.payments.api.PaymentsToggles$PaymentsChargesMigration r2 = com.revolut.feature.payments.api.PaymentsToggles$PaymentsChargesMigration.f79158c
            jte.d r0 = (jte.d) r0
            boolean r0 = r0.c(r2)
            if (r0 == 0) goto L56
        L3b:
            java.lang.Object r0 = r4.f275018b
            o7.b r0 = (o7.b) r0
            efm.r r5 = r0.p(r5)
            r0 = 3
            efm.r r5 = m70.a.g(r5, r1, r1, r0)
            efm.d0 r5 = r5.firstOrError()
            java.lang.String r0 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            java.lang.Object r5 = nim.a.b(r5, r6)
            return r5
        L56:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: twg.c.x(com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.transfer.PaymentLinksTransferData, gim.c):java.lang.Object");
    }

    public LegacyOrderQuoteParams y(PaymentLinksTransferData transferData) {
        rga.c cVar = (rga.c) this.d;
        Intrinsics.checkNotNullParameter(transferData, "transferData");
        boolean z = transferData.k;
        m3 m3Var = transferData.f102238h;
        long j2 = transferData.f102234a;
        xi0.b bVar = transferData.f102235b;
        if (z) {
            xi0.b bVar2 = transferData.d.f92241b;
            yhm.r rVar = m3Var == m3.ON ? new yhm.r(bVar2, f8l.b.FROM, f8l.b.TO) : new yhm.r(bVar, f8l.b.TO, f8l.b.FROM);
            xi0.b bVar3 = (xi0.b) rVar.f314201a;
            f8l.b bVar4 = (f8l.b) rVar.f314202b;
            f8l.b bVar5 = (f8l.b) rVar.f314203c;
            double dK = j2 / cp5.d.k(bVar3);
            f8l.c cVar2 = cp5.d.z(bVar) ? f8l.c.CRYPTO : cp5.d.y(bVar) ? f8l.c.COMMODITY : f8l.c.FIAT;
            Asset asset = new Asset(cp5.d.z(bVar2) ? f8l.c.CRYPTO : cp5.d.y(bVar2) ? f8l.c.COMMODITY : f8l.c.FIAT, bVar2.f306286a, bVar2);
            Asset asset2 = new Asset(cVar2, bVar.f306286a, bVar);
            f8l.e eVar = f8l.e.MARKET;
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(dK);
            String strB = cVar.b("payments_links_price_quote");
            return new LegacyOrderQuoteParams(asset, asset2, eVar, bigDecimalValueOf, bVar4, bVar5, null, false, null, null, null, null, null, strB == null ? null : strB, 7936);
        }
        xi0.b bVar6 = transferData.f102236c;
        yhm.r rVar2 = m3Var == m3.ON ? new yhm.r(bVar6, f8l.b.TO, f8l.b.FROM) : new yhm.r(bVar, f8l.b.FROM, f8l.b.TO);
        xi0.b bVar7 = (xi0.b) rVar2.f314201a;
        f8l.b bVar8 = (f8l.b) rVar2.f314202b;
        f8l.b bVar9 = (f8l.b) rVar2.f314203c;
        double dK2 = j2 / cp5.d.k(bVar7);
        f8l.c cVar3 = cp5.d.z(bVar) ? f8l.c.CRYPTO : cp5.d.y(bVar) ? f8l.c.COMMODITY : f8l.c.FIAT;
        f8l.c cVar4 = cp5.d.z(bVar6) ? f8l.c.CRYPTO : cp5.d.y(bVar6) ? f8l.c.COMMODITY : f8l.c.FIAT;
        Asset asset3 = new Asset(cVar3, bVar.f306286a, bVar);
        Asset asset4 = new Asset(cVar4, bVar6.f306286a, bVar6);
        f8l.e eVar2 = f8l.e.MARKET;
        BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(dK2);
        String strB2 = cVar.b("payments_links_price_quote");
        return new LegacyOrderQuoteParams(asset3, asset4, eVar2, bigDecimalValueOf2, bVar8, bVar9, null, false, null, null, null, null, null, strB2 == null ? null : strB2, 7936);
    }

    public String z() {
        h30.q qVar = (h30.q) this.d;
        String[] elements = {((nyb.b) ((eub.a) this.f275017a)).f() ? "POINTS" : null, ((h4g.g) this.f275018b).b() ? "SHOPS" : null, ((jwb.c) ((svb.a) this.f275019c)).a() ? "GIFT_CARDS" : null, ((jla.h) qVar.e).d("REVOLUT_PAY.payment_processing", null) == bla.c.ENABLED ? "REVOLUT_PAY" : null, ((jte.d) ((gte.a) qVar.f148941b)).c(StoreApi$Toggles$StoreExclusives.f88421c) ? "EXCLUSIVES" : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        List list = !listL.isEmpty() ? listL : null;
        if (list != null) {
            return d0.k0(list, ",", null, null, 0, null, 62);
        }
        return null;
    }

    public c(a8f.f targetAnnualReturnInsightPerformanceMapper, a8f.e sharpeRatioInsightPerformanceMapper, a8f.a maxDrawdownInsightPerformanceMapper, a8f.d riskLevelInsightPerformanceMapper) {
        Intrinsics.checkNotNullParameter(targetAnnualReturnInsightPerformanceMapper, "targetAnnualReturnInsightPerformanceMapper");
        Intrinsics.checkNotNullParameter(sharpeRatioInsightPerformanceMapper, "sharpeRatioInsightPerformanceMapper");
        Intrinsics.checkNotNullParameter(maxDrawdownInsightPerformanceMapper, "maxDrawdownInsightPerformanceMapper");
        Intrinsics.checkNotNullParameter(riskLevelInsightPerformanceMapper, "riskLevelInsightPerformanceMapper");
        this.f275017a = targetAnnualReturnInsightPerformanceMapper;
        this.f275018b = sharpeRatioInsightPerformanceMapper;
        this.f275019c = maxDrawdownInsightPerformanceMapper;
        this.d = riskLevelInsightPerformanceMapper;
    }

    public c(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f275017a = view;
        g gVar = new g();
        this.f275019c = gVar;
        this.d = new g[]{gVar};
    }

    public c(zjh.j impressionEventHandlerDelegate, f61.a deeplinkEventHandlerDelegate, fld.d slotManagerFeedEventHandlerManager) {
        Intrinsics.checkNotNullParameter(impressionEventHandlerDelegate, "impressionEventHandlerDelegate");
        Intrinsics.checkNotNullParameter(deeplinkEventHandlerDelegate, "deeplinkEventHandlerDelegate");
        Intrinsics.checkNotNullParameter(slotManagerFeedEventHandlerManager, "slotManagerFeedEventHandlerManager");
        this.f275017a = impressionEventHandlerDelegate;
        this.f275018b = deeplinkEventHandlerDelegate;
        this.f275019c = slotManagerFeedEventHandlerManager;
    }

    public c(PerkDetailsFlowContract$InputData inputData, bgc.e rewardsInteractor, gic.a rewardActionMapper, f userInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(rewardsInteractor, "rewardsInteractor");
        Intrinsics.checkNotNullParameter(rewardActionMapper, "rewardActionMapper");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f275017a = inputData;
        this.f275018b = rewardsInteractor;
        this.f275019c = rewardActionMapper;
        this.d = userInteractor;
    }

    public c(n walletInteractor, g6e.d subAccountInteractor, gr6.m freelancerPocketsInteractor, wa7.m hiddenAccountsInteractor) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(subAccountInteractor, "subAccountInteractor");
        Intrinsics.checkNotNullParameter(freelancerPocketsInteractor, "freelancerPocketsInteractor");
        Intrinsics.checkNotNullParameter(hiddenAccountsInteractor, "hiddenAccountsInteractor");
        this.f275017a = walletInteractor;
        this.f275018b = subAccountInteractor;
        this.f275019c = freelancerPocketsInteractor;
        this.d = hiddenAccountsInteractor;
    }

    public c(n walletInteractor, hj8.a juniorProfileInteractor, zq.a juniorOpenBankingSubaccountsInteractor, gs8.c juniorOpenBankingEligiblePocketsMapper, jla.h productCatalogueInteractor) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(juniorOpenBankingSubaccountsInteractor, "juniorOpenBankingSubaccountsInteractor");
        Intrinsics.checkNotNullParameter(juniorOpenBankingEligiblePocketsMapper, "juniorOpenBankingEligiblePocketsMapper");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        this.f275017a = walletInteractor;
        this.f275018b = juniorProfileInteractor;
        this.f275019c = juniorOpenBankingSubaccountsInteractor;
        this.d = productCatalogueInteractor;
    }

    public c(Closeable closeable) {
        this.f275017a = closeable;
    }

    public c() {
    }

    public /* synthetic */ c(r1 r1Var) {
        this(r1Var, o1.f, p1.f, (Object) null);
    }

    public c(JSONObject jSONObject) {
        this.f275017a = jSONObject.getString("manufacturer");
        this.f275018b = jSONObject.getString("market_name");
        this.f275019c = jSONObject.getString("codename");
        this.d = jSONObject.getString("model");
    }
}
