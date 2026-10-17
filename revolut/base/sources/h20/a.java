package h20;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m20.n;
import org.jetbrains.annotations.NotNull;
import v30.c0;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0016\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001f\u001a\u00020\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u001d\u001a\u0004\b\f\u0010\u001eR\u001a\u0010 \u001a\u00020\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001d\u001a\u0004\b\u0006\u0010\u001eR\u001a\u0010!\u001a\u00020\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001d\u001a\u0004\b\u0012\u0010\u001e¨\u0006\""}, d2 = {"Lh20/a;", "", "", "toString", "()Ljava/lang/String;", "Ljava/util/UUID;", "a", "Ljava/util/UUID;", "d", "()Ljava/util/UUID;", "feedId", "Lh20/b;", "b", "Lh20/b;", "g", "()Lh20/b;", "state", "Lv30/c0;", "c", "Lv30/c0;", "e", "()Lv30/c0;", "feedType", "Lm20/n;", "Lm20/n;", "f", "()Lm20/n;", "lastTicket", "", "Z", "()Z", "allowOpeningTicket", "allowArchiving", "archived", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("feedId")
    @NotNull
    private final UUID feedId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final b state;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("feedType")
    @NotNull
    private final c0 feedType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("lastTicket")
    private final n lastTicket;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("allowOpeningTicket")
    private final boolean allowOpeningTicket;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("allowArchiving")
    private final boolean allowArchiving;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("archived")
    private final boolean archived;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getAllowArchiving() {
        return this.allowArchiving;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getAllowOpeningTicket() {
        return this.allowOpeningTicket;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getArchived() {
        return this.archived;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final UUID getFeedId() {
        return this.feedId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final c0 getFeedType() {
        return this.feedType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.feedId, aVar.feedId) && this.state == aVar.state && this.feedType == aVar.feedType && Intrinsics.f(this.lastTicket, aVar.lastTicket) && this.allowOpeningTicket == aVar.allowOpeningTicket && this.allowArchiving == aVar.allowArchiving && this.archived == aVar.archived;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final n getLastTicket() {
        return this.lastTicket;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final b getState() {
        return this.state;
    }

    public final int hashCode() {
        int iHashCode = (this.feedType.hashCode() + ((this.state.hashCode() + (this.feedId.hashCode() * 31)) * 31)) * 31;
        n nVar = this.lastTicket;
        return Boolean.hashCode(this.archived) + j6.a.c(j6.a.c((iHashCode + (nVar == null ? 0 : nVar.hashCode())) * 31, 31, this.allowOpeningTicket), 31, this.allowArchiving);
    }
}
