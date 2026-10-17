package col;

import android.util.Base64;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.sso.api.R$string;
import com.revolut.sso.api.models.UserInfo;
import com.revolut.sso.impl.domain.models.Challenge;
import com.revolut.sso.impl.domain.models.ChallengeDetails;
import gkl.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.text.Charsets;
import nii.y0;
import nii.z;
import org.jetbrains.annotations.NotNull;
import skm.l;
import vg0.c0;
import vg0.j;
import vg0.k;
import vkm.t;
import wl0.o;
import yji.n;

/* JADX INFO: loaded from: classes12.dex */
public final class i extends n implements c {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final com.revolut.kompot.navigable.a f25580l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final wl0.c f25581m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ph0.d f25582n;
    public final l80.e o;

    public i(com.revolut.kompot.navigable.a controller, wl0.c biometricHelper, ph0.d credentialManager, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(biometricHelper, "biometricHelper");
        Intrinsics.checkNotNullParameter(credentialManager, "credentialManager");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f25580l = controller;
        this.f25581m = biometricHelper;
        this.f25582n = credentialManager;
        this.o = dateProvider;
    }

    public static final void Z2(i iVar, rv6.e eVar, l lVar) {
        lVar.r(new ce9.a(n.l2(iVar, new t(eVar, new e(lVar, null, 0)), null, new f(lVar, null, 0), 3), 24));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f3(col.i r27, vg0.k r28, com.revolut.sso.impl.domain.models.Challenge r29, boolean r30, gim.c r31) {
        /*
            Method dump skipped, instruction units count: 502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: col.i.f3(col.i, vg0.k, com.revolut.sso.impl.domain.models.Challenge, boolean, gim.c):java.lang.Object");
    }

    public final boolean b3(w webAuthnProvider) {
        Intrinsics.checkNotNullParameter(webAuthnProvider, "webAuthnProvider");
        return webAuthnProvider.getEnabled() && this.f25581m.d() != o.NONE;
    }

    public final y0 c3() {
        return new y0("CREATE_PASSKEY_FAILED", new z(new TextLocalisedClause(R$string.revolut_sso_core_challenge_popup_failed_passkeys, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_core_challenge_popup_failed_subtitle, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_core_challenge_popup_failed_got_it, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d3(com.revolut.sso.impl.domain.models.Challenge r30, boolean r31, gim.c r32) {
        /*
            Method dump skipped, instruction units count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: col.i.d3(com.revolut.sso.impl.domain.models.Challenge, boolean, gim.c):java.lang.Object");
    }

    public final Object e3(Challenge challenge, UserInfo userInfo, gim.i iVar) {
        ChallengeDetails challengeDetails = challenge.f106101g;
        if (!(challengeDetails instanceof ChallengeDetails.WebAuthn)) {
            if (challengeDetails == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            throw new IllegalArgumentException(p.a.p("Challenge has not expected details of ", o0.f186429a.b(challengeDetails.getClass()).m(), " type").toString());
        }
        String str = challenge.e;
        if (str == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        String strEncodeToString = Base64.encodeToString(bytes, 11);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(...)");
        ChallengeDetails.WebAuthn webAuthn = (ChallengeDetails.WebAuthn) challengeDetails;
        String str2 = webAuthn.f106121c;
        vg0.i iVar2 = new vg0.i(str2, str2);
        UUID uuid = userInfo.f105990a;
        String string = uuid != null ? uuid.toString() : null;
        if (string == null) {
            throw new IllegalArgumentException("Identity id cannot be null");
        }
        String str3 = userInfo.d;
        if (str3 == null) {
            throw new IllegalArgumentException("Legal name cannot be null");
        }
        String str4 = userInfo.e;
        if (str4 == null) {
            str4 = userInfo.f;
        }
        if (str4 == null) {
            throw new IllegalArgumentException("Both phone and email can't be null");
        }
        j jVar = new j(string, str3, str4);
        ArrayList arrayList = webAuthn.f106119a;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(new vg0.h(((ChallengeDetails.WebAuthn.Algorithm) it8.next()).f106123b));
        }
        Long l2 = challenge.f;
        long jLongValue = l2 != null ? l2.longValue() : 600000L;
        ((l80.f) this.o).getClass();
        int iCurrentTimeMillis = (int) (jLongValue - System.currentTimeMillis());
        List<String> list = webAuthn.f106120b;
        ArrayList arrayList3 = new ArrayList(zhm.w.t(list, 10));
        for (String value : list) {
            Intrinsics.checkNotNullParameter(value, "value");
            arrayList3.add(new vg0.g(value));
        }
        return f3(this, new k(strEncodeToString, iVar2, jVar, arrayList2, iCurrentTimeMillis, arrayList3, vg0.a.DIRECT, new vg0.e(vg0.b.PLATFORM, vg0.d.REQUIRED, c0.REQUIRED)), challenge, false, iVar);
    }
}
