package ot3;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0005\u0010\fR\u001a\u0010\u0012\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\n\u0010\u0011R\u001a\u0010\u0016\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u000f\u0010\u0015¨\u0006\u0017"}, d2 = {"Lot3/p0;", "Lot3/s0;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "postRequestPath", "Llt3/b;", "b", "Llt3/b;", "()Llt3/b;", "filter", "Llt3/a;", "c", "Llt3/a;", "()Llt3/a;", "metadata", "Llt3/c;", "Llt3/c;", "()Llt3/c;", "payload", "feature_credit_application_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class p0 implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("postRequestPath")
    private final String postRequestPath;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("filter")
    @NotNull
    private final lt3.b filter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("metadata")
    @NotNull
    private final lt3.a metadata;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("payload")
    @NotNull
    private final lt3.c payload;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final lt3.b getFilter() {
        return this.filter;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final lt3.a getMetadata() {
        return this.metadata;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final lt3.c getPayload() {
        return this.payload;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getPostRequestPath() {
        return this.postRequestPath;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj2;
        return Intrinsics.f(this.postRequestPath, p0Var.postRequestPath) && Intrinsics.f(this.filter, p0Var.filter) && Intrinsics.f(this.metadata, p0Var.metadata) && Intrinsics.f(this.payload, p0Var.payload);
    }

    public final int hashCode() {
        String str = this.postRequestPath;
        return this.payload.hashCode() + ((this.metadata.hashCode() + ((this.filter.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31)) * 31);
    }
}
