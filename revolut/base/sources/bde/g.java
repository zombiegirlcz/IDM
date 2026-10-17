package bde;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\t\u0010\u0010R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0005\u0010\u0015¨\u0006\u0017"}, d2 = {"Lbde/g;", "Lbde/q;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getType", "type", "b", "c", "source", "d", "title", "Lbde/h;", "Lbde/h;", "()Lbde/h;", "payload", "Lbde/r;", "e", "Lbde/r;", "()Lbde/r;", "metadata", "feature_support_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class g extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("source")
    @NotNull
    private final String source;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("payload")
    @NotNull
    private final h payload;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("metadata")
    private final r metadata;

    public g(String type, String source, String title, h payload, r rVar) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.type = type;
        this.source = source;
        this.title = title;
        this.payload = payload;
        this.metadata = rVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final r getMetadata() {
        return this.metadata;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final h getPayload() {
        return this.payload;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.type, gVar.type) && Intrinsics.f(this.source, gVar.source) && Intrinsics.f(this.title, gVar.title) && Intrinsics.f(this.payload, gVar.payload) && Intrinsics.f(this.metadata, gVar.metadata);
    }

    public final int hashCode() {
        int iHashCode = (this.payload.hashCode() + p.a.c(p.a.c(this.type.hashCode() * 31, 31, this.source), 31, this.title)) * 31;
        r rVar = this.metadata;
        return iHashCode + (rVar == null ? 0 : rVar.hashCode());
    }
}
