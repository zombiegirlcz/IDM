package y58;

import com.revolut.core.ui_kit.delegates.t;
import j49.i;
import jla.h;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import sa6.o;
import vkm.q;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements p58.a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hj8.a f311004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q58.b f311005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ang.f f311006c;
    public final h d;

    public f(hj8.a juniorProfileInteractor, q58.b juniorAccountActivationNavigationFactory, ang.f userInteractor, h productCatalogueInteractor) {
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(juniorAccountActivationNavigationFactory, "juniorAccountActivationNavigationFactory");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        this.f311004a = juniorProfileInteractor;
        this.f311005b = juniorAccountActivationNavigationFactory;
        this.f311006c = userInteractor;
        this.d = productCatalogueInteractor;
    }

    @Override // i49.c
    public final boolean a(t data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return data.f54722b.f51596l instanceof b;
    }

    @Override // i49.c
    public final Flow f(i params) {
        Intrinsics.checkNotNullParameter(params, "params");
        Continuation continuation = null;
        return rd0.e.e(q.Q(new o(bla.b.b(this.d, "YOUTH"), 14), new y4f.o(continuation, this, 2)), h0.f322473a, new x18.c(3, 21, continuation));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // i49.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(com.revolut.core.ui_kit.delegates.t r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof y58.c
            if (r0 == 0) goto L13
            r0 = r6
            y58.c r0 = (y58.c) r0
            int r1 = r0.f311002w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f311002w = r1
            goto L1a
        L13:
            y58.c r0 = new y58.c
            gim.c r6 = (gim.c) r6
            r0.<init>(r4, r6)
        L1a:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f311002w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r6)
            goto L67
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            com.revolut.core.ui_kit.delegates.ActionWidgetDelegate$Model r6 = r5.f54722b
            java.lang.Object r6 = r6.f51596l
            java.lang.String r2 = "null cannot be cast to non-null type com.revolut.feature.junior.account_activation.impl.delegate.JuniorAccountActivationActionsDelegateImpl.JuniorAccountActivation"
            kotlin.jvm.internal.Intrinsics.i(r6, r2)
            y58.b r6 = (y58.b) r6
            com.revolut.core.ui_kit.delegates.ActionWidgetDelegate$a r5 = r5.f54721a
            com.revolut.core.ui_kit.delegates.ActionWidgetDelegate$a$d r2 = com.revolut.core.ui_kit.delegates.ActionWidgetDelegate.a.d.f51610a
            boolean r2 = kotlin.jvm.internal.Intrinsics.f(r5, r2)
            if (r2 == 0) goto L74
            java.lang.String r5 = r6.f311001a
            r0.f311002w = r3
            q58.b r6 = r4.f311005b
            a68.i r6 = (a68.i) r6
            r6.getClass()
            a31.g r2 = new a31.g
            r3 = 7
            r2.<init>(r5, r3)
            a68.h r5 = new a68.h
            r3 = 0
            r5.<init>(r2, r6, r3)
            java.lang.Object r6 = skm.e0.o(r5, r0)
            if (r6 != r1) goto L67
            return r1
        L67:
            com.revolut.retail.core.navigation.NaviCommand r6 = (com.revolut.retail.core.navigation.NaviCommand) r6
            com.revolut.kompot.bridge.navigation.BridgeDestination r5 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            r5.<init>(r6)
            j49.b r6 = new j49.b
            r6.<init>(r5)
            return r6
        L74:
            boolean r6 = r5 instanceof com.revolut.core.ui_kit.delegates.h
            if (r6 != 0) goto L97
            com.revolut.core.ui_kit.delegates.ActionWidgetDelegate$a$c r6 = com.revolut.core.ui_kit.delegates.ActionWidgetDelegate.a.c.f51609a
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r5, r6)
            if (r6 != 0) goto L97
            com.revolut.core.ui_kit.delegates.ActionWidgetDelegate$a$a r6 = com.revolut.core.ui_kit.delegates.ActionWidgetDelegate.a.C0395a.f51607a
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r5, r6)
            if (r6 != 0) goto L97
            com.revolut.core.ui_kit.delegates.ActionWidgetDelegate$a$b r6 = com.revolut.core.ui_kit.delegates.ActionWidgetDelegate.a.b.f51608a
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r5, r6)
            if (r5 == 0) goto L91
            goto L97
        L91:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L97:
            j49.c r5 = j49.c.f171322a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: y58.f.g(com.revolut.core.ui_kit.delegates.t, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
