package jxa;

import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.feature.referrals.common.data.api.domain.model.common.ActiveOrPastInviteeDetails;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dl3.f f179100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cl3.a f179101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kz9.a f179102c;

    public e(dl3.f contactsMapper, cl3.a contactsInteractor, kz9.a chatNavigationProvider) {
        Intrinsics.checkNotNullParameter(contactsMapper, "contactsMapper");
        Intrinsics.checkNotNullParameter(contactsInteractor, "contactsInteractor");
        Intrinsics.checkNotNullParameter(chatNavigationProvider, "chatNavigationProvider");
        this.f179100a = contactsMapper;
        this.f179101b = contactsInteractor;
        this.f179102c = chatNavigationProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof jxa.d
            if (r0 == 0) goto L13
            r0 = r6
            jxa.d r0 = (jxa.d) r0
            int r1 = r0.f179099w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f179099w = r1
            goto L18
        L13:
            jxa.d r0 = new jxa.d
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f179099w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L43
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            cl3.a r6 = r4.f179101b
            wl3.h r6 = (wl3.h) r6
            rfm.z r5 = r6.b(r5)
            r0.f179099w = r3
            java.lang.Object r6 = nim.a.h(r5, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            zm3.a r6 = (zm3.a) r6
            com.revolut.retail.core.navigation.FeatureCommand r5 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.feature.payments.social.api.model.ChatTransferRecipient$ContactRecipient r0 = new com.revolut.feature.payments.social.api.model.ChatTransferRecipient$ContactRecipient
            kotlin.jvm.internal.Intrinsics.h(r6)
            r0.<init>(r6)
            r6 = 0
            kz9.a r1 = r4.f179102c
            uz9.a r1 = (uz9.a) r1
            com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig r6 = r1.a(r0, r6)
            r5.<init>(r6)
            com.revolut.kompot.bridge.navigation.BridgeDestination r5 = zh9.u0.b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: jxa.e.a(java.lang.String, gim.c):java.lang.Object");
    }

    public final ContactImage b(ActiveOrPastInviteeDetails invite) {
        zm3.a eVar;
        Intrinsics.checkNotNullParameter(invite, "invite");
        String str = invite.f81691g;
        String str2 = invite.f81689b;
        String str3 = invite.e;
        if (str != null) {
            long jHashCode = str3.hashCode();
            String str4 = invite.f81691g;
            Intrinsics.h(str4);
            eVar = new zm3.f(str4, jHashCode, invite.b(), invite.f81690c, invite.f, null, 0L, 0);
        } else if (str2 != null) {
            eVar = new zm3.e(str2, str3.hashCode(), invite.b(), invite.f81690c, invite.f, null, 0L, 0);
        } else {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Referrer phone and email are null");
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
            eVar = null;
        }
        if (eVar == null) {
            return null;
        }
        return ((xl3.d) this.f179100a).h(eVar);
    }
}
