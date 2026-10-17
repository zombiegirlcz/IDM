package bde;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u0005\u0010\u000e¨\u0006\u0010"}, d2 = {"Lbde/a;", "Lbde/q;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getType", "type", "b", "source", "Lbde/b;", "c", "Lbde/b;", "()Lbde/b;", "payload", "feature_support_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("source")
    @NotNull
    private final String source;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("payload")
    @NotNull
    private final b payload;

    public a(String type, String source, b payload) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.type = type;
        this.source = source;
        this.payload = payload;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final b getPayload() {
        return this.payload;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.type, aVar.type) && Intrinsics.f(this.source, aVar.source) && Intrinsics.f(this.payload, aVar.payload);
    }

    public final int hashCode() {
        return this.payload.hashCode() + p.a.c(this.type.hashCode() * 31, 31, this.source);
    }
}
