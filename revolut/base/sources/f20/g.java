package f20;

import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.Instant;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\f\u001a\u0004\b\u0016\u0010\u0004R\"\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010#\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010&\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u0011\u001a\u0004\b%\u0010\u0013¨\u0006'"}, d2 = {"Lf20/g;", "", "", "toString", "()Ljava/lang/String;", "Lf20/i;", "a", "Lf20/i;", "getCallType", "()Lf20/i;", "callType", "b", "Ljava/lang/String;", "getLanguage", "language", "Ljava/util/UUID;", "c", "Ljava/util/UUID;", "getExternalRef", "()Ljava/util/UUID;", "externalRef", "d", "getCategory", "category", "", "e", "Ljava/util/List;", "getTags", "()Ljava/util/List;", "tags", "Lorg/joda/time/Instant;", "f", "Lorg/joda/time/Instant;", "getStartTime", "()Lorg/joda/time/Instant;", "startTime", "g", "getFeedId", "feedId", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("callType")
    @NotNull
    private final i callType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("language")
    @NotNull
    private final String language;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("externalRef")
    @NotNull
    private final UUID externalRef;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("category")
    @NotNull
    private final String category;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("tags")
    private final List<String> tags;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("startTime")
    private final Instant startTime;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("feedId")
    private final UUID feedId;

    public g(i callType, String language, UUID externalRef, String category, UUID uuid) {
        Intrinsics.checkNotNullParameter(callType, "callType");
        Intrinsics.checkNotNullParameter(language, "language");
        Intrinsics.checkNotNullParameter(externalRef, "externalRef");
        Intrinsics.checkNotNullParameter(category, "category");
        this.callType = callType;
        this.language = language;
        this.externalRef = externalRef;
        this.category = category;
        this.tags = null;
        this.startTime = null;
        this.feedId = uuid;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.callType == gVar.callType && Intrinsics.f(this.language, gVar.language) && Intrinsics.f(this.externalRef, gVar.externalRef) && Intrinsics.f(this.category, gVar.category) && Intrinsics.f(this.tags, gVar.tags) && Intrinsics.f(this.startTime, gVar.startTime) && Intrinsics.f(this.feedId, gVar.feedId);
    }

    public final int hashCode() {
        int iC = p.a.c(t61.a.f(this.externalRef, p.a.c(this.callType.hashCode() * 31, 31, this.language), 31), 31, this.category);
        List<String> list = this.tags;
        int iHashCode = (iC + (list == null ? 0 : list.hashCode())) * 31;
        Instant instant = this.startTime;
        int iHashCode2 = (iHashCode + (instant == null ? 0 : instant.hashCode())) * 31;
        UUID uuid = this.feedId;
        return iHashCode2 + (uuid != null ? uuid.hashCode() : 0);
    }
}
