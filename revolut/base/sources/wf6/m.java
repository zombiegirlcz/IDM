package wf6;

import com.revolut.feature.external_accounts.api.model.ExternalInstitutionAuthData;
import com.revolut.feature.external_accounts.api.navigation.SelectAccountToLinkDestination;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import skm.p0;
import zh9.u0;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements ke6.n {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sri.m f296997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oe6.a f296998b;

    public m(sri.m navigator, oe6.a externalInstitutionsInteractor) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(externalInstitutionsInteractor, "externalInstitutionsInteractor");
        this.f296997a = navigator;
        this.f296998b = externalInstitutionsInteractor;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return wp5.y.D(cVar, "deeplink", 1, "institution-auth") && !Intrinsics.f(cVar.e(2), "stored-method");
    }

    public final efm.k b(jf0.c cVar) {
        String strE = cVar.e(2);
        HashMap map = cVar.d;
        if (kotlin.text.d0.W(strE)) {
            rfm.h hVar = rfm.h.f253943a;
            Intrinsics.checkNotNullExpressionValue(hVar, "empty(...)");
            return hVar;
        }
        if (!strE.equals("choose")) {
            ufm.c cVar2 = new ufm.c(new w21.c((w21.o) ((xg6.j) this.f296998b).f305582a, 1), 2);
            Intrinsics.checkNotNullExpressionValue(cVar2, "fromCallable(...)");
            efm.k kVarW = new ufm.i(te0.w.i0(cVar2), new wf0.r(29, new w38.v(cVar, strE, 27)), 1).w();
            Intrinsics.checkNotNullExpressionValue(kVarW, "toMaybe(...)");
            return kVarW;
        }
        String strE2 = cVar.e(4);
        String str = (String) map.get("state");
        if (str == null) {
            str = "";
        }
        String str2 = (String) map.get("token");
        rfm.u uVarG = efm.k.g(u0.f(new SelectAccountToLinkDestination(new ExternalInstitutionAuthData(strE2, str, str2 != null ? str2 : ""))));
        Intrinsics.checkNotNullExpressionValue(uVarG, "just(...)");
        return uVarG;
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
            boolean r0 = r6 instanceof wf6.l
            if (r0 == 0) goto L13
            r0 = r6
            wf6.l r0 = (wf6.l) r0
            int r1 = r0.f296995w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f296995w = r1
            goto L1a
        L13:
            wf6.l r0 = new wf6.l
            gim.c r6 = (gim.c) r6
            r0.<init>(r4, r6)
        L1a:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f296995w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r6)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            efm.k r5 = r4.b(r5)
            r0.f296995w = r3
            java.lang.Object r6 = nim.a.i(r5, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            com.revolut.retail.core.navigation.NaviCommand r6 = (com.revolut.retail.core.navigation.NaviCommand) r6
            r5 = 0
            if (r6 == 0) goto L51
            q06.h r0 = new q06.h
            com.revolut.kompot.bridge.navigation.BridgeDestination r1 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            r1.<init>(r6)
            r0.<init>(r1, r5)
            return r0
        L51:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: wf6.m.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final efm.d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        if (!kotlin.text.d0.W(deeplink.e(2))) {
            return te0.w.o0(p0.f264003c, new w3k.i(this, deeplink, null, 27));
        }
        ufm.b bVarM = efm.d0.m(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }
}
