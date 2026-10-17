package b9k;

import com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.PeerToPeerAmountScreenContract$InputData;
import j9k.c0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PeerToPeerAmountScreenContract$InputData f13811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f13812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r9k.b f13813c;
    public final opf.c0 d;
    public final vo9.a e;
    public final r10.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final wt9.e f13814g;

    public d(PeerToPeerAmountScreenContract$InputData inputData, c0 transferQuoteInteractor, r9k.b validatorExtension, opf.c0 transferSuggestedAmountsInteractor, vo9.a pocketMapper, r10.d peerToPeerAmountExtraDataMultiplePocketsDelegate, wt9.e transferAvailableBalanceInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(transferQuoteInteractor, "transferQuoteInteractor");
        Intrinsics.checkNotNullParameter(validatorExtension, "validatorExtension");
        Intrinsics.checkNotNullParameter(transferSuggestedAmountsInteractor, "transferSuggestedAmountsInteractor");
        Intrinsics.checkNotNullParameter(pocketMapper, "pocketMapper");
        Intrinsics.checkNotNullParameter(peerToPeerAmountExtraDataMultiplePocketsDelegate, "peerToPeerAmountExtraDataMultiplePocketsDelegate");
        Intrinsics.checkNotNullParameter(transferAvailableBalanceInteractor, "transferAvailableBalanceInteractor");
        this.f13811a = inputData;
        this.f13812b = transferQuoteInteractor;
        this.f13813c = validatorExtension;
        this.d = transferSuggestedAmountsInteractor;
        this.e = pocketMapper;
        this.f = peerToPeerAmountExtraDataMultiplePocketsDelegate;
        this.f13814g = transferAvailableBalanceInteractor;
    }
}
