package z8k;

import com.revolut.feature.transfer.core.models.TransferFlowType;
import com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.CurrencyPickerMode;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class t implements jki.i {

    @NotNull
    public static final s Companion = new s();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PeerToPeerRecipient f320207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hrf.f f320208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TransferFlowType f320209c;
    public final PeerToPeerTransferData d;
    public final u e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d0 f320210g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f320211h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f320212j;
    public final CurrencyPickerMode k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Set f320213l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f320214m;

    public t(PeerToPeerRecipient recipient, hrf.f direction, TransferFlowType flowType, PeerToPeerTransferData peerToPeerTransferData, u extraData, int i, d0 referenceExtraData, boolean z, boolean z3, boolean z4, CurrencyPickerMode currencyPickerMode, Set extraConfigurations, boolean z6) {
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        Intrinsics.checkNotNullParameter(referenceExtraData, "referenceExtraData");
        Intrinsics.checkNotNullParameter(currencyPickerMode, "currencyPickerMode");
        Intrinsics.checkNotNullParameter(extraConfigurations, "extraConfigurations");
        this.f320207a = recipient;
        this.f320208b = direction;
        this.f320209c = flowType;
        this.d = peerToPeerTransferData;
        this.e = extraData;
        this.f = i;
        this.f320210g = referenceExtraData;
        this.f320211h = z;
        this.i = z3;
        this.f320212j = z4;
        this.k = currencyPickerMode;
        this.f320213l = extraConfigurations;
        this.f320214m = z6;
    }

    public static t a(t tVar, PeerToPeerTransferData peerToPeerTransferData, u uVar, int i, d0 d0Var, boolean z, boolean z3, int i2) {
        PeerToPeerRecipient recipient = tVar.f320207a;
        hrf.f direction = tVar.f320208b;
        TransferFlowType flowType = tVar.f320209c;
        PeerToPeerTransferData peerToPeerTransferData2 = (i2 & 8) != 0 ? tVar.d : peerToPeerTransferData;
        u extraData = (i2 & 16) != 0 ? tVar.e : uVar;
        int i3 = (i2 & 32) != 0 ? tVar.f : i;
        d0 referenceExtraData = (i2 & 64) != 0 ? tVar.f320210g : d0Var;
        boolean z4 = (i2 & 128) != 0 ? tVar.f320211h : z;
        boolean z6 = (i2 & 256) != 0 ? tVar.i : z3;
        boolean z11 = tVar.f320212j;
        tVar.getClass();
        CurrencyPickerMode currencyPickerMode = tVar.k;
        Set extraConfigurations = tVar.f320213l;
        boolean z12 = tVar.f320214m;
        tVar.getClass();
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        Intrinsics.checkNotNullParameter(referenceExtraData, "referenceExtraData");
        Intrinsics.checkNotNullParameter(currencyPickerMode, "currencyPickerMode");
        Intrinsics.checkNotNullParameter(extraConfigurations, "extraConfigurations");
        return new t(recipient, direction, flowType, peerToPeerTransferData2, extraData, i3, referenceExtraData, z4, z6, z11, currencyPickerMode, extraConfigurations, z12);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f320207a, tVar.f320207a) && this.f320208b == tVar.f320208b && Intrinsics.f(this.f320209c, tVar.f320209c) && Intrinsics.f(this.d, tVar.d) && Intrinsics.f(this.e, tVar.e) && this.f == tVar.f && Intrinsics.f(this.f320210g, tVar.f320210g) && this.f320211h == tVar.f320211h && this.i == tVar.i && this.f320212j == tVar.f320212j && Intrinsics.f(this.k, tVar.k) && Intrinsics.f(this.f320213l, tVar.f320213l) && this.f320214m == tVar.f320214m;
    }

    public final int hashCode() {
        int iC = com.revolut.data.database.models.openbanking.d.c(this.f320209c, (this.f320208b.hashCode() + (this.f320207a.hashCode() * 31)) * 31, 31);
        PeerToPeerTransferData peerToPeerTransferData = this.d;
        return Boolean.hashCode(this.f320214m) + p.a.f((this.k.hashCode() + j6.a.c(j6.a.c(j6.a.c((this.f320210g.hashCode() + j6.a.b(this.f, (this.e.hashCode() + ((iC + (peerToPeerTransferData == null ? 0 : peerToPeerTransferData.hashCode())) * 31)) * 31, 31)) * 31, 31, this.f320211h), 31, this.i), 961, this.f320212j)) * 31, 31, this.f320213l);
    }
}
