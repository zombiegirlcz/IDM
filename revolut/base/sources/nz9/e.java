package nz9;

import efm.d0;
import kotlin.jvm.internal.Intrinsics;
import m1i.t;
import nya.b0;
import nyb.h0;
import q06.k;
import sri.m;
import ufm.i;
import wl3.h;
import wp5.y;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements jf0.d, k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cl3.a f221008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f221009b;

    public e(cl3.a contactsInteractor, m navigator) {
        Intrinsics.checkNotNullParameter(contactsInteractor, "contactsInteractor");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f221008a = contactsInteractor;
        this.f221009b = navigator;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "payment-chat");
    }

    public final i b(jf0.c cVar) {
        d0 d0VarM;
        String strE = cVar.e(2);
        boolean zW = kotlin.text.d0.W(strE);
        od0.i iVar = od0.i.f224256b;
        if (zW) {
            od0.i.Companion.getClass();
            d0VarM = d0.m(iVar);
        } else {
            i iVar2 = new i(((h) this.f221008a).b(strE).l(new ufm.c(new t(this, strE, 13), 0)), new h0(11, new nyb.m(21)), 1);
            Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
            od0.i.Companion.getClass();
            d0VarM = ue0.e.F(iVar2, iVar);
        }
        i iVar3 = new i(d0VarM, new h0(10, new nyb.m(20)), 1);
        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
        return iVar3;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof nz9.d
            if (r0 == 0) goto L13
            r0 = r6
            nz9.d r0 = (nz9.d) r0
            int r1 = r0.f221007x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f221007x = r1
            goto L1a
        L13:
            nz9.d r0 = new nz9.d
            gim.c r6 = (gim.c) r6
            r0.<init>(r4, r6)
        L1a:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f221007x
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            nz9.e r5 = r0.u
            yhm.o.b(r6)
            goto L46
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            yhm.o.b(r6)
            ufm.i r5 = r4.b(r5)
            r0.u = r4
            r0.f221007x = r3
            java.lang.Object r6 = nim.a.b(r5, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            r5 = r4
        L46:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r0)
            nz9.c r6 = (nz9.c) r6
            r5.getClass()
            boolean r5 = r6 instanceof nz9.a
            r0 = 0
            if (r5 == 0) goto L6b
            q06.h r5 = new q06.h
            com.revolut.feature.payments.social.api.navigation.PeerToPeerChatDestination r1 = new com.revolut.feature.payments.social.api.navigation.PeerToPeerChatDestination
            nz9.a r6 = (nz9.a) r6
            zm3.l r6 = r6.f221004a
            r1.<init>(r6, r0, r3)
            q06.b r6 = new q06.b
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r2 = ibb.c.f160142c
            r6.<init>(r2, r0)
            r5.<init>(r1, r6)
            return r5
        L6b:
            nz9.b r5 = nz9.b.f221005a
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r6, r5)
            if (r5 == 0) goto L80
            q06.i r5 = new q06.i
            q06.b r6 = new q06.b
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r1 = ibb.c.f160142c
            r6.<init>(r1, r0)
            r5.<init>(r6)
            return r5
        L80:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: nz9.e.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        i iVar = new i(new i(b(deeplink), new h0(8, new nyb.m(this, 19)), 0), new h0(9, new b0(this, 13)), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return ue0.e.F(iVar, Boolean.TRUE);
    }
}
