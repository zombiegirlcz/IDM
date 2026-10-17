package syj;

import com.revolut.feature.learn.shared.api.navigation.LearnKompotFeatureConfig;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerNavigationId;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.CompositeCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import dz8.l;
import g09.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u09.v;
import wli.x;

/* JADX INFO: loaded from: classes11.dex */
public final class g implements l {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f266680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f266681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g09.e f266682c;

    public g(x deeplinkHandler, i lessonsInteractor, g09.e coursesInteractor) {
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(lessonsInteractor, "lessonsInteractor");
        Intrinsics.checkNotNullParameter(coursesInteractor, "coursesInteractor");
        this.f266680a = deeplinkHandler;
        this.f266681b = lessonsInteractor;
        this.f266682c = coursesInteractor;
    }

    public static NaviCommand b(v vVar) {
        switch (b.f266673a[vVar.ordinal()]) {
            case 1:
                return new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(u49.b.f277278a, null, null, 6)));
            case 2:
                return new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(new MainContainerNavigationId.NewMainScreenContainerTabId(ibb.c.f160141b.f83420a, null), null, null, 6)));
            case 3:
            case 4:
            case 5:
            case 6:
                return new CompositeCommand(new FinishCommand(null, null, null, 7), f(vVar));
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static FeatureCommand f(v vVar) {
        return new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new LearnKompotFeatureConfig.Home.Destination(vVar), false, (Integer) null, 0, 61));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0077, code lost:
    
        if (r11 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r10, gim.c r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof syj.c
            if (r0 == 0) goto L13
            r0 = r11
            syj.c r0 = (syj.c) r0
            int r1 = r0.f266674w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f266674w = r1
            goto L18
        L13:
            syj.c r0 = new syj.c
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f266674w
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2b
            yhm.o.b(r11)
            goto L7a
        L2b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L33:
            yhm.o.b(r11)
            goto L58
        L37:
            yhm.o.b(r11)
            r0.f266674w = r5
            g09.i r11 = r9.f266681b
            efm.r r10 = r11.a(r10)
            vkm.d r10 = rd0.e.b(r10)
            ss4.a0 r11 = new ss4.a0
            r2 = 21
            r11.<init>(r2)
            jhi.b r10 = mo3.a.g(r10, r3, r11, r5)
            java.lang.Object r11 = vkm.q.x(r10, r0)
            if (r11 != r1) goto L58
            goto L79
        L58:
            u09.q r11 = (u09.q) r11
            java.lang.String r10 = r11.f276147c
            r0.f266674w = r4
            g09.e r11 = r9.f266682c
            efm.r r10 = r11.a(r10)
            vkm.d r10 = rd0.e.b(r10)
            ss4.a0 r11 = new ss4.a0
            r2 = 20
            r11.<init>(r2)
            jhi.b r10 = mo3.a.g(r10, r3, r11, r5)
            java.lang.Object r11 = vkm.q.x(r10, r0)
            if (r11 != r1) goto L7a
        L79:
            return r1
        L7a:
            u09.f r11 = (u09.f) r11
            com.revolut.kompot.bridge.navigation.BridgeDestination r10 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            com.revolut.retail.core.navigation.CompositeCommand r0 = new com.revolut.retail.core.navigation.CompositeCommand
            u09.v r1 = r11.f276112g
            u09.v r2 = r11.f276112g
            com.revolut.retail.core.navigation.NaviCommand r1 = b(r1)
            com.revolut.retail.core.navigation.FeatureCommand r6 = f(r2)
            com.revolut.retail.core.navigation.FeatureCommand r7 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.feature.learn.shared.api.navigation.LearnKompotFeatureConfig$CourseOverview r8 = new com.revolut.feature.learn.shared.api.navigation.LearnKompotFeatureConfig$CourseOverview
            java.lang.String r11 = r11.f276109a
            r8.<init>(r11, r2, r3)
            r7.<init>(r8)
            r11 = 3
            com.revolut.retail.core.navigation.NaviCommand[] r11 = new com.revolut.retail.core.navigation.NaviCommand[r11]
            r2 = 0
            r11[r2] = r1
            r11[r5] = r6
            r11[r4] = r7
            r0.<init>(r11)
            r10.<init>(r0)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: syj.g.a(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(u09.v r5, java.lang.String r6, gim.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof syj.d
            if (r0 == 0) goto L13
            r0 = r7
            syj.d r0 = (syj.d) r0
            int r1 = r0.f266675w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f266675w = r1
            goto L18
        L13:
            syj.d r0 = new syj.d
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f266675w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L49
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r7)
            u09.v r7 = u09.v.CRYPTO
            if (r5 != r7) goto L4c
            if (r6 == 0) goto L4c
            wli.x r5 = r4.f266680a
            r7 = 6
            r2 = 0
            efm.d0 r5 = lg0.b.s1(r5, r6, r2, r2, r7)
            r0.f266675w = r3
            java.lang.Object r5 = nim.a.b(r5, r0)
            if (r5 != r1) goto L49
            return r1
        L49:
            dz8.g r5 = dz8.g.f121293a
            return r5
        L4c:
            dz8.h r6 = new dz8.h
            com.revolut.kompot.bridge.navigation.BridgeDestination r7 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            com.revolut.retail.core.navigation.NaviCommand r5 = b(r5)
            r7.<init>(r5)
            r6.<init>(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: syj.g.c(u09.v, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(com.revolut.feature.learn.shared.impl.ui.lesson.LessonScreenContract$QuizStatusViewPayload r5, java.lang.String r6, gim.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof syj.e
            if (r0 == 0) goto L13
            r0 = r7
            syj.e r0 = (syj.e) r0
            int r1 = r0.f266677x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f266677x = r1
            goto L18
        L13:
            syj.e r0 = new syj.e
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f266677x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.feature.learn.shared.impl.ui.lesson.LessonScreenContract$QuizStatusViewPayload r5 = r0.u
            yhm.o.b(r7)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r7)
            r0.u = r5
            r0.f266677x = r3
            java.lang.Object r7 = r4.a(r6, r0)
            if (r7 != r1) goto L3f
            return r1
        L3f:
            com.revolut.kompot.bridge.navigation.BridgeDestination r7 = (com.revolut.kompot.bridge.navigation.BridgeDestination) r7
            if (r5 == 0) goto L46
            com.revolut.feature.learn.shared.models.domain.LearnShareReward r5 = r5.d
            goto L47
        L46:
            r5 = 0
        L47:
            if (r5 == 0) goto L59
            dz8.j r6 = new dz8.j
            com.revolut.retail.feature.learn.impl.ui.share_rewards.ShareRewardsScreen r0 = new com.revolut.retail.feature.learn.impl.ui.share_rewards.ShareRewardsScreen
            com.revolut.retail.feature.learn.impl.ui.share_rewards.ShareRewardsScreenContract$InputData r1 = new com.revolut.retail.feature.learn.impl.ui.share_rewards.ShareRewardsScreenContract$InputData
            r1.<init>(r5)
            r0.<init>(r1)
            r6.<init>(r0, r7)
            return r6
        L59:
            dz8.h r5 = new dz8.h
            r5.<init>(r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: syj.g.d(com.revolut.feature.learn.shared.impl.ui.lesson.LessonScreenContract$QuizStatusViewPayload, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006c, code lost:
    
        if (r14 == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c9, code lost:
    
        if (r14 == r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(com.revolut.feature.learn.shared.impl.ui.lesson.LessonScreenContract$QuizStatusViewPayload r13, gim.c r14) {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: syj.g.e(com.revolut.feature.learn.shared.impl.ui.lesson.LessonScreenContract$QuizStatusViewPayload, gim.c):java.lang.Object");
    }
}
