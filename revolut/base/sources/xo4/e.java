package xo4;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u0010"}, d2 = {"Lxo4/e;", "", "", "toString", "()Ljava/lang/String;", "", "a", "I", "b", "()I", "invitationsLeft", "", "Lxo4/c;", "Ljava/util/List;", "()Ljava/util/List;", "cardholders", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("invitationsLeft")
    private final int invitationsLeft;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("cardholders")
    @NotNull
    private final List<c> cardholders;

    public e(int i, ArrayList cardholders) {
        Intrinsics.checkNotNullParameter(cardholders, "cardholders");
        this.invitationsLeft = i;
        this.cardholders = cardholders;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getCardholders() {
        return this.cardholders;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getInvitationsLeft() {
        return this.invitationsLeft;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.invitationsLeft == eVar.invitationsLeft && Intrinsics.f(this.cardholders, eVar.cardholders);
    }

    public final int hashCode() {
        return this.cardholders.hashCode() + (Integer.hashCode(this.invitationsLeft) * 31);
    }
}
