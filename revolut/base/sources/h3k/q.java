package h3k;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001a\u0010\u0011\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u000b\u0010\u0010R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u0006\u0010\u001a¨\u0006\u001c"}, d2 = {"Lh3k/q;", "", "", "toString", "()Ljava/lang/String;", "Lh3k/f;", "a", "Lh3k/f;", "e", "()Lh3k/f;", "sender", "b", "c", "recipient", "Lh3k/l;", "Lh3k/l;", "()Lh3k/l;", "rate", "", "Lh3k/p;", "d", "Ljava/util/List;", "()Ljava/util/List;", "routes", "Lorf/c;", "Lorf/c;", "()Lorf/c;", "availability", "feature_payments_bank_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("sender")
    @NotNull
    private final f sender;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("recipient")
    @NotNull
    private final f recipient;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("rate")
    @NotNull
    private final l rate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("routes")
    @NotNull
    private final List<p> routes;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("availability")
    private final orf.c availability;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final orf.c getAvailability() {
        return this.availability;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final l getRate() {
        return this.rate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final f getRecipient() {
        return this.recipient;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final List getRoutes() {
        return this.routes;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final f getSender() {
        return this.sender;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.sender, qVar.sender) && Intrinsics.f(this.recipient, qVar.recipient) && Intrinsics.f(this.rate, qVar.rate) && Intrinsics.f(this.routes, qVar.routes) && Intrinsics.f(this.availability, qVar.availability);
    }

    public final int hashCode() {
        int iD = p.a.d((this.rate.hashCode() + ((this.recipient.hashCode() + (this.sender.hashCode() * 31)) * 31)) * 31, 31, this.routes);
        orf.c cVar = this.availability;
        return iD + (cVar == null ? 0 : cVar.hashCode());
    }
}
