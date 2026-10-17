package q78;

import android.os.Parcelable;
import com.revolut.feature.junior.accounts.models.JuniorProductAccountIdPayload;
import com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination;
import com.revolut.feature.tab.accounts.api.model.TabAccountsInitialPayload;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.ProductId;
import com.revolut.kompot.common.transition.AccountCreationTransitionAnimation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements u68.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wsg.b f242776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final she.g f242777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zfe.e f242778c;

    public e(wsg.b newWalletsInteractor, she.g productAccountDestinationResolver, zfe.e newAccountDestinationResolver) {
        Intrinsics.checkNotNullParameter(newWalletsInteractor, "newWalletsInteractor");
        Intrinsics.checkNotNullParameter(productAccountDestinationResolver, "productAccountDestinationResolver");
        Intrinsics.checkNotNullParameter(newAccountDestinationResolver, "newAccountDestinationResolver");
        this.f242776a = newWalletsInteractor;
        this.f242777b = productAccountDestinationResolver;
        this.f242778c = newAccountDestinationResolver;
    }

    public static ProductAccountDescriptor$Value.Main d(String str, String str2, String str3) {
        return new ProductAccountDescriptor$Value.Main(new ProductAccountId(str, new JuniorProductAccountIdPayload(str2, str3)), ProductId.YOUTH);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r6, java.lang.String r7, com.revolut.feature.tab.accounts.models.ProductAccountId r8, gim.c r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof q78.a
            if (r0 == 0) goto L13
            r0 = r9
            q78.a r0 = (q78.a) r0
            int r1 = r0.f242768x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f242768x = r1
            goto L18
        L13:
            q78.a r0 = new q78.a
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f242768x
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            java.lang.String r6 = r0.u
            yhm.o.b(r9)
            goto L69
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            yhm.o.b(r9)
            if (r8 == 0) goto L41
            g88.h r9 = g88.i.Companion
            r9.getClass()
            java.lang.String r9 = g88.h.a(r8)
            goto L42
        L41:
            r9 = r4
        L42:
            if (r9 == 0) goto L4b
            java.lang.String r6 = r8.f89729a
            com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value$Main r6 = d(r6, r9, r4)
            return r6
        L4b:
            if (r7 == 0) goto L52
            com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value$Main r6 = d(r7, r6, r7)
            return r6
        L52:
            wsg.b r7 = r5.f242776a
            w4l.h r8 = w4l.h.f294642c
            kotlinx.coroutines.flow.Flow r7 = r7.c(r6, r8)
            zfd.e r7 = zi0.c.w(r7)
            r0.u = r6
            r0.f242768x = r3
            java.lang.Object r9 = vkm.q.z(r7, r0)
            if (r9 != r1) goto L69
            return r1
        L69:
            com.revolut.data.model.Data r9 = (com.revolut.data.model.Data) r9
            if (r9 == 0) goto Lb7
            java.lang.Object r7 = r9.getContent()
            java.util.List r7 = (java.util.List) r7
            if (r7 == 0) goto Lb7
            java.lang.Object r7 = zhm.d0.d0(r7)
            kotlin.Pair r7 = (kotlin.Pair) r7
            if (r7 == 0) goto Lb7
            java.lang.Object r8 = r7.f186385a
            fo3.c r8 = (fo3.c) r8
            java.lang.Object r7 = r7.f186386b
            java.util.List r7 = (java.util.List) r7
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L8b:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto Lab
            java.lang.Object r9 = r7.next()
            r0 = r9
            io3.d r0 = (io3.d) r0
            xi0.b r1 = r8.d
            java.lang.String r1 = r1.f306286a
            java.lang.String r2 = r0.f163147c
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r2)
            if (r1 == 0) goto L8b
            io3.l r0 = r0.e
            io3.l r1 = io3.l.CURRENT
            if (r0 != r1) goto L8b
            goto Lac
        Lab:
            r9 = r4
        Lac:
            io3.d r9 = (io3.d) r9
            if (r9 == 0) goto Lb7
            java.lang.String r7 = r9.f163145a
            com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value$Main r6 = d(r7, r6, r7)
            return r6
        Lb7:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: q78.e.e(java.lang.String, java.lang.String, com.revolut.feature.tab.accounts.models.ProductAccountId, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.String r9, java.lang.String r10, com.revolut.feature.tab.accounts.api.model.TabAccountsInitialPayload.Action r11, boolean r12, gim.c r13) {
        /*
            r8 = this;
            boolean r0 = r13 instanceof q78.b
            if (r0 == 0) goto L14
            r0 = r13
            q78.b r0 = (q78.b) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.z = r1
        L12:
            r5 = r0
            goto L1a
        L14:
            q78.b r0 = new q78.b
            r0.<init>(r8, r13)
            goto L12
        L1a:
            java.lang.Object r13 = r5.f242770x
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r5.z
            r7 = 2
            r2 = 1
            if (r1 == 0) goto L3e
            if (r1 == r2) goto L34
            if (r1 != r7) goto L2c
            yhm.o.b(r13)
            return r13
        L2c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L34:
            boolean r12 = r5.f242769w
            q78.e r9 = r5.v
            com.revolut.feature.tab.accounts.api.model.TabAccountsInitialPayload$Action r11 = r5.u
            yhm.o.b(r13)
            goto L57
        L3e:
            yhm.o.b(r13)
            r5.u = r11
            r5.v = r8
            r5.f242769w = r12
            r5.z = r2
            r4 = 0
            r6 = 12
            r1 = r8
            r2 = r9
            r3 = r10
            java.lang.Object r13 = u68.b.a(r1, r2, r3, r4, r5, r6)
            if (r13 != r0) goto L56
            goto L68
        L56:
            r9 = r8
        L57:
            com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value r13 = (com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value) r13
            r10 = 0
            r5.u = r10
            r5.v = r10
            r5.f242769w = r12
            r5.z = r7
            java.lang.Object r9 = r9.i(r13, r11, r12, r5)
            if (r9 != r0) goto L69
        L68:
            return r0
        L69:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: q78.e.f(java.lang.String, java.lang.String, com.revolut.feature.tab.accounts.api.model.TabAccountsInitialPayload$Action, boolean, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.String r9, java.lang.String r10, com.revolut.feature.tab.accounts.api.model.TabAccountsInitialPayload.Action r11, boolean r12, kotlin.coroutines.Continuation r13) {
        /*
            r8 = this;
            boolean r0 = r13 instanceof q78.c
            if (r0 == 0) goto L14
            r0 = r13
            q78.c r0 = (q78.c) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.z = r1
        L12:
            r5 = r0
            goto L1a
        L14:
            q78.c r0 = new q78.c
            r0.<init>(r8, r13)
            goto L12
        L1a:
            java.lang.Object r13 = r5.f242773x
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r5.z
            r7 = 2
            r2 = 1
            if (r1 == 0) goto L3e
            if (r1 == r2) goto L34
            if (r1 != r7) goto L2c
            yhm.o.b(r13)
            return r13
        L2c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L34:
            boolean r12 = r5.f242772w
            q78.e r9 = r5.v
            com.revolut.feature.tab.accounts.api.model.TabAccountsInitialPayload$Action r11 = r5.u
            yhm.o.b(r13)
            goto L57
        L3e:
            yhm.o.b(r13)
            r5.u = r11
            r5.v = r8
            r5.f242772w = r12
            r5.z = r2
            r4 = 0
            r6 = 12
            r1 = r8
            r2 = r9
            r3 = r10
            java.lang.Object r13 = u68.b.a(r1, r2, r3, r4, r5, r6)
            if (r13 != r0) goto L56
            goto L68
        L56:
            r9 = r8
        L57:
            com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value r13 = (com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value) r13
            r10 = 0
            r5.u = r10
            r5.v = r10
            r5.f242772w = r12
            r5.z = r7
            java.lang.Object r9 = r9.h(r13, r11, r12, r5)
            if (r9 != r0) goto L69
        L68:
            return r0
        L69:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: q78.e.g(java.lang.String, java.lang.String, com.revolut.feature.tab.accounts.api.model.TabAccountsInitialPayload$Action, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value r5, com.revolut.feature.tab.accounts.api.model.TabAccountsInitialPayload.Action r6, boolean r7, gim.c r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof q78.d
            if (r0 == 0) goto L13
            r0 = r8
            q78.d r0 = (q78.d) r0
            int r1 = r0.f242775w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f242775w = r1
            goto L18
        L13:
            q78.d r0 = new q78.d
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f242775w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r8)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r8)
            r0.f242775w = r3
            java.lang.Object r8 = r4.i(r5, r6, r7, r0)
            if (r8 != r1) goto L3b
            return r1
        L3b:
            com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination$JustShow r8 = (com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination.JustShow) r8
            com.revolut.retail.core.navigation.FeatureCommand r5 = r8.e
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: q78.e.h(com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value, com.revolut.feature.tab.accounts.api.model.TabAccountsInitialPayload$Action, boolean, gim.c):java.lang.Object");
    }

    public final Object i(ProductAccountDescriptor$Value productAccountDescriptor$Value, TabAccountsInitialPayload.Action action, boolean z, gim.c cVar) {
        if (productAccountDescriptor$Value == null) {
            return new MainContainerScreenDestination.JustShow(ibb.c.f160140a, (Parcelable) null, (AccountCreationTransitionAnimation) null, 14);
        }
        if (!z) {
            return this.f242777b.c(productAccountDescriptor$Value, action, cVar);
        }
        return ((cge.e) this.f242778c).b(productAccountDescriptor$Value, ibb.c.f160140a, action, cVar);
    }
}
