package brf;

import bnj.n;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.transfer.core.R$string;
import com.revolut.feature.transfer.core.api.ui.throubleshooter.TransferTroubleshooterType;
import erf.k;
import jki.i;
import jki.m;
import jki.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f18001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final frf.k f18002b;

    public a(k bankMapper, frf.k cardMapper, grf.a peerToPeerMapper) {
        Intrinsics.checkNotNullParameter(bankMapper, "bankMapper");
        Intrinsics.checkNotNullParameter(cardMapper, "cardMapper");
        Intrinsics.checkNotNullParameter(peerToPeerMapper, "peerToPeerMapper");
        this.f18001a = bankMapper;
        this.f18002b = cardMapper;
    }

    @Override // jki.p
    public final m a(i iVar) {
        d domainState = (d) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (e) iii.c.f(domainState.f18003a, new n(this, domainState, 15), new a8a.a(this, domainState, 6), new b1c.p(domainState, this, 19));
    }

    public final TextLocalisedClause b(TransferTroubleshooterType transferTroubleshooterType) {
        if (transferTroubleshooterType instanceof TransferTroubleshooterType.Bank) {
            return k.a(((TransferTroubleshooterType.Bank) transferTroubleshooterType).f92176a);
        }
        if (transferTroubleshooterType instanceof TransferTroubleshooterType.Card) {
            return frf.k.a(((TransferTroubleshooterType.Card) transferTroubleshooterType).f92177a);
        }
        if (Intrinsics.f(transferTroubleshooterType, TransferTroubleshooterType.PeerToPeer.f92178a)) {
            return new TextLocalisedClause(R$string.transfer_troubleshooting_header_title, null, null, 14);
        }
        throw new NoWhenBranchMatchedException();
    }
}
