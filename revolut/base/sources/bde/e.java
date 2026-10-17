package bde;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0005\u0010\u0010¨\u0006\u0012"}, d2 = {"Lbde/e;", "Lbde/q;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getType", "type", "b", "source", "c", "title", "Lbde/f;", "d", "Lbde/f;", "()Lbde/f;", "payload", "feature_support_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e extends q {

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
    private final f payload;

    public e(String type, String source, String title, f payload) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.type = type;
        this.source = source;
        this.title = title;
        this.payload = payload;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final f getPayload() {
        return this.payload;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.type, eVar.type) && Intrinsics.f(this.source, eVar.source) && Intrinsics.f(this.title, eVar.title) && Intrinsics.f(this.payload, eVar.payload);
    }

    public final int hashCode() {
        return this.payload.hashCode() + p.a.c(p.a.c(this.type.hashCode() * 31, 31, this.source), 31, this.title);
    }
}
