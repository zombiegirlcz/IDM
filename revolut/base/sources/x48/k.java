package x48;

import com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination;
import com.revolut.feature.rev10_main_screen.api.MainScreenTab;
import com.revolut.feature.tab.accounts.api.model.TabAccountsLaunchConfig;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.ProductId;
import com.revolut.kompot.common.transition.AccountCreationTransitionAnimation;
import g48.r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rea.m;

/* JADX INFO: loaded from: classes4.dex */
public final class k {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q06.d f302816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r0 f302817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wsg.b f302818c;
    public final g6e.d d;
    public final m e;

    public k(q06.d deeplinkParser, r0 jointAccountsInteractor, wsg.b walletInteractor, g6e.d subaccountInteractor, m pocketDetailsInteractor) {
        Intrinsics.checkNotNullParameter(deeplinkParser, "deeplinkParser");
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(subaccountInteractor, "subaccountInteractor");
        Intrinsics.checkNotNullParameter(pocketDetailsInteractor, "pocketDetailsInteractor");
        this.f302816a = deeplinkParser;
        this.f302817b = jointAccountsInteractor;
        this.f302818c = walletInteractor;
        this.d = subaccountInteractor;
        this.e = pocketDetailsInteractor;
    }

    public static MainContainerScreenDestination.JustShow a(String str) {
        return new MainContainerScreenDestination.JustShow(ibb.c.f160140a, new TabAccountsLaunchConfig(new ProductAccountDescriptor$Value.Main(new ProductAccountId(str, null), ProductId.JOINT), null), (AccountCreationTransitionAnimation) null, 12);
    }

    public static MainContainerScreenDestination.JustShow b() {
        MainScreenTab mainScreenTab = ibb.c.f160140a;
        ProductId productId = ProductId.JOINT;
        u38.m.Companion.getClass();
        return new MainContainerScreenDestination.JustShow(mainScreenTab, new TabAccountsLaunchConfig(new ProductAccountDescriptor$Value.Main(new ProductAccountId(u38.m.e, null), productId), null), (AccountCreationTransitionAnimation) null, 12);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b3, code lost:
    
        if (r11 == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(x48.c r9, com.revolut.core.model.account.AccountId.Joint r10, gim.c r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof x48.e
            if (r0 == 0) goto L13
            r0 = r11
            x48.e r0 = (x48.e) r0
            int r1 = r0.f302807y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f302807y = r1
            goto L18
        L13:
            x48.e r0 = new x48.e
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.f302805w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f302807y
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            yhm.o.b(r11)
            goto Lb6
        L2c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L34:
            com.revolut.core.model.account.AccountId$Joint r10 = r0.v
            x48.c r9 = r0.u
            yhm.o.b(r11)
            goto L64
        L3c:
            yhm.o.b(r11)
            java.lang.String r11 = r10.f51413b
            w4l.h r2 = w4l.h.f294642c
            wsg.b r6 = r8.f302818c
            kotlinx.coroutines.flow.Flow r11 = r6.d(r11, r2)
            zfd.e r11 = zi0.c.w(r11)
            x48.a r2 = new x48.a
            r6 = 0
            r2.<init>(r6)
            jhi.b r11 = mo3.a.g(r11, r5, r2, r4)
            r0.u = r9
            r0.v = r10
            r0.f302807y = r4
            java.lang.Object r11 = vkm.q.x(r11, r0)
            if (r11 != r1) goto L64
            goto Lb5
        L64:
            kotlin.Pair r11 = (kotlin.Pair) r11
            java.lang.Object r11 = r11.f186386b
            java.util.List r11 = (java.util.List) r11
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.Iterator r11 = r11.iterator()
        L70:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L96
            java.lang.Object r2 = r11.next()
            r4 = r2
            io3.d r4 = (io3.d) r4
            io3.l r6 = r4.e
            io3.l r7 = io3.l.CURRENT
            if (r6 != r7) goto L70
            xi0.b r6 = z92.f.l(r4)
            xi0.b r7 = r9.f302802a
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L70
            io3.k r4 = r4.f
            io3.k r6 = io3.k.ACTIVE
            if (r4 != r6) goto L70
            goto L97
        L96:
            r2 = r5
        L97:
            io3.d r2 = (io3.d) r2
            if (r2 == 0) goto La2
            java.lang.String r9 = r2.f163145a
            com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination$JustShow r9 = a(r9)
            return r9
        La2:
            x48.g r11 = new x48.g
            r11.<init>(r8, r9, r10, r5)
            r0.u = r5
            r0.v = r5
            r0.f302807y = r3
            l89.e r9 = l89.e.f192813a
            java.lang.Object r11 = r9.a(r11, r0)
            if (r11 != r1) goto Lb6
        Lb5:
            return r1
        Lb6:
            java.lang.String r11 = (java.lang.String) r11
            kotlin.jvm.internal.Intrinsics.h(r11)
            com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination$JustShow r9 = a(r11)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: x48.k.c(x48.c, com.revolut.core.model.account.AccountId$Joint, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(x48.d r7, com.revolut.core.model.account.AccountId.Joint r8, gim.c r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof x48.f
            if (r0 == 0) goto L13
            r0 = r9
            x48.f r0 = (x48.f) r0
            int r1 = r0.f302808w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f302808w = r1
            goto L18
        L13:
            x48.f r0 = new x48.f
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f302808w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r9)
            goto L43
        L28:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L30:
            yhm.o.b(r9)
            x48.h r9 = new x48.h
            r9.<init>(r6, r7, r8, r4)
            r0.f302808w = r3
            l89.e r7 = l89.e.f192813a
            java.lang.Object r9 = r7.a(r9, r0)
            if (r9 != r1) goto L43
            return r1
        L43:
            com.revolut.feature.subaccount.api.models.Subaccount r9 = (com.revolut.feature.subaccount.api.models.Subaccount) r9
            com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination$JustShow r7 = new com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination$JustShow
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r8 = ibb.c.f160140a
            com.revolut.feature.tab.accounts.api.model.TabAccountsLaunchConfig r0 = new com.revolut.feature.tab.accounts.api.model.TabAccountsLaunchConfig
            com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value$Main r1 = new com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value$Main
            com.revolut.feature.tab.accounts.models.ProductId r2 = com.revolut.feature.tab.accounts.models.ProductId.SUBACCOUNT
            com.revolut.feature.tab.accounts.models.ProductAccountId r3 = new com.revolut.feature.tab.accounts.models.ProductAccountId
            pcd.s r9 = r9.getF88959a()
            java.lang.String r9 = r9.f234881a
            com.revolut.feature.subaccount.accounts.models.ExtendedSubaccountType$Joint r5 = com.revolut.feature.subaccount.accounts.models.ExtendedSubaccountType.Joint.INSTANCE
            r3.<init>(r9, r5)
            r1.<init>(r3, r2)
            r0.<init>(r1, r4)
            r9 = 12
            r7.<init>(r8, r0, r4, r9)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: x48.k.d(x48.d, com.revolut.core.model.account.AccountId$Joint, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(com.revolut.feature.joint.api.models.JointDeeplink.InvitationMcy r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof x48.i
            if (r0 == 0) goto L13
            r0 = r7
            x48.i r0 = (x48.i) r0
            int r1 = r0.f302813w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f302813w = r1
            goto L18
        L13:
            x48.i r0 = new x48.i
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f302813w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L6a
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r7)
            java.lang.String r7 = r6.f76474a
            xi0.b r2 = r6.f76475b
            java.lang.String r4 = "current"
            boolean r7 = kotlin.text.a0.z(r7, r4, r3)
            if (r7 == 0) goto L44
            x48.c r6 = new x48.c
            r6.<init>(r2)
            goto L5a
        L44:
            java.lang.String r7 = r6.f76474a
            java.lang.String r4 = "savings"
            boolean r7 = kotlin.text.a0.z(r7, r4, r3)
            if (r7 == 0) goto L59
            java.lang.String r6 = r6.f76476c
            if (r6 == 0) goto L59
            x48.d r7 = new x48.d
            r7.<init>(r6, r2)
            r6 = r7
            goto L5a
        L59:
            r6 = 0
        L5a:
            if (r6 != 0) goto L61
            com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination$JustShow r6 = b()
            return r6
        L61:
            r0.f302813w = r3
            java.lang.Object r7 = r5.f(r6, r0)
            if (r7 != r1) goto L6a
            return r1
        L6a:
            com.revolut.kompot.bridge.navigation.KompotDestination r7 = (com.revolut.kompot.bridge.navigation.KompotDestination) r7
            if (r7 != 0) goto L73
            com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination$JustShow r6 = b()
            return r6
        L73:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: x48.k.e(com.revolut.feature.joint.api.models.JointDeeplink$InvitationMcy, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x007b, code lost:
    
        if (r9 == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(v13.d r8, gim.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof x48.j
            if (r0 == 0) goto L13
            r0 = r9
            x48.j r0 = (x48.j) r0
            int r1 = r0.f302815x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f302815x = r1
            goto L18
        L13:
            x48.j r0 = new x48.j
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f302815x
            r3 = 3
            r4 = 1
            r5 = 2
            r6 = 0
            if (r2 == 0) goto L40
            if (r2 == r4) goto L3a
            if (r2 == r5) goto L36
            if (r2 != r3) goto L2e
            yhm.o.b(r9)
            goto L7e
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            yhm.o.b(r9)
            return r9
        L3a:
            v13.d r8 = r0.u
            yhm.o.b(r9)
            goto L56
        L40:
            yhm.o.b(r9)
            g48.r0 r9 = r7.f302817b
            w4l.h r2 = w4l.h.f294642c
            wkm.l r9 = k38.c.a(r9, r2, r6, r5)
            r0.u = r8
            r0.f302815x = r4
            java.lang.Object r9 = vkm.q.x(r9, r0)
            if (r9 != r1) goto L56
            goto L7d
        L56:
            com.revolut.core.model.account.AccountId$Joint r9 = (com.revolut.core.model.account.AccountId.Joint) r9
            if (r9 != 0) goto L5b
            return r6
        L5b:
            boolean r2 = r8 instanceof x48.c
            if (r2 == 0) goto L6d
            x48.c r8 = (x48.c) r8
            r0.u = r6
            r0.f302815x = r5
            java.lang.Object r8 = r7.c(r8, r9, r0)
            if (r8 != r1) goto L6c
            goto L7d
        L6c:
            return r8
        L6d:
            boolean r2 = r8 instanceof x48.d
            if (r2 == 0) goto L81
            x48.d r8 = (x48.d) r8
            r0.u = r6
            r0.f302815x = r3
            java.lang.Object r9 = r7.d(r8, r9, r0)
            if (r9 != r1) goto L7e
        L7d:
            return r1
        L7e:
            com.revolut.kompot.bridge.navigation.KompotDestination r9 = (com.revolut.kompot.bridge.navigation.KompotDestination) r9
            return r9
        L81:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: x48.k.f(v13.d, gim.c):java.lang.Object");
    }
}
