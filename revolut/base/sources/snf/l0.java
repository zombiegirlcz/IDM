package snf;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import skm.p0;
import tof.a3;
import zh9.u0;

/* JADX INFO: loaded from: classes8.dex */
public final class l0 {

    @NotNull
    public static final j0 Companion = new j0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nhf.a f264593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ppg.b f264594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jid.z f264595c;
    public final prl.e d;
    public final tnf.f e;
    public final tnf.g f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final jpc.e f264596g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final wa7.m f264597h;

    public l0(nhf.a unitedWalletInteractor, ppg.b vaultsInteractor, jid.z delistedPocketsInteractor, prl.e accountDetectorCountryProfilesProvider, tnf.f pocketToAccountInfoMapperDelegate, tnf.g vaultToAccountInfoMapperDelegate, jpc.e investToAccountInfoMapperDelegate, tnf.b deFiToAccountInfoMapperDelegate, wa7.m hiddenAccountsInteractor) {
        Intrinsics.checkNotNullParameter(unitedWalletInteractor, "unitedWalletInteractor");
        Intrinsics.checkNotNullParameter(vaultsInteractor, "vaultsInteractor");
        Intrinsics.checkNotNullParameter(delistedPocketsInteractor, "delistedPocketsInteractor");
        Intrinsics.checkNotNullParameter(accountDetectorCountryProfilesProvider, "accountDetectorCountryProfilesProvider");
        Intrinsics.checkNotNullParameter(pocketToAccountInfoMapperDelegate, "pocketToAccountInfoMapperDelegate");
        Intrinsics.checkNotNullParameter(vaultToAccountInfoMapperDelegate, "vaultToAccountInfoMapperDelegate");
        Intrinsics.checkNotNullParameter(investToAccountInfoMapperDelegate, "investToAccountInfoMapperDelegate");
        Intrinsics.checkNotNullParameter(deFiToAccountInfoMapperDelegate, "deFiToAccountInfoMapperDelegate");
        Intrinsics.checkNotNullParameter(hiddenAccountsInteractor, "hiddenAccountsInteractor");
        this.f264593a = unitedWalletInteractor;
        this.f264594b = vaultsInteractor;
        this.f264595c = delistedPocketsInteractor;
        this.d = accountDetectorCountryProfilesProvider;
        this.e = pocketToAccountInfoMapperDelegate;
        this.f = vaultToAccountInfoMapperDelegate;
        this.f264596g = investToAccountInfoMapperDelegate;
        this.f264597h = hiddenAccountsInteractor;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01dd A[PHI: r26
      0x01dd: PHI (r26v10 k71.q) = (r26v5 k71.q), (r26v5 k71.q), (r26v11 k71.q) binds: [B:128:0x0214, B:131:0x0225, B:118:0x01db] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x05ec  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x060d  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x067e  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0681  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0687  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x068d  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x06e5  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x06f5  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x06f8  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0795  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x07b3 A[PHI: r3
      0x07b3: PHI (r3v15 int) = (r3v14 int), (r3v18 int), (r3v18 int), (r3v18 int) binds: [B:361:0x07b1, B:358:0x07ad, B:355:0x07a8, B:356:0x07aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0829  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x085b  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x086c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final efm.r a(int r41, tof.a3 r42, snf.i0 r43) {
        /*
            Method dump skipped, instruction units count: 2204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: snf.l0.a(int, tof.a3, snf.i0):efm.r");
    }

    public final efm.r b(a3 transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        efm.r rVarSwitchMap = ((njf.j) this.f264593a).f().switchMap(new sl3.r(new h0(this, 0), 21));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        prl.e eVar = this.d;
        wsg.b bVar = (wsg.b) eVar.f239326c;
        w4l.h hVar = w4l.h.f294642c;
        efm.r rVarDistinctUntilChanged = ue0.e.H(pd.b.r(pd.b.s(kli.a.i(rVarSwitchMap, rd0.e.c(nim.a.v(u0.m(bVar.b(hVar), !((cw9.d) eVar.d).a() ? nim.a.v(((ang.f) eVar.e).j(hVar), new sl3.i(19)) : nim.a.v(r10.q.j0((r10.q) eVar.f239325b, do3.f.BANKING, null, 6), new sl3.i(20))), new sl3.i(18)), p0.f264003c), rd0.e.c(new rv6.e(this.f264597h.j(), 2), kotlin.coroutines.g.f186406a)), new h0(this, 1)), new sdi.k(this, transaction, 10)), zhm.h0.f322473a, new sl3.i(22)).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        return rVarDistinctUntilChanged;
    }
}
