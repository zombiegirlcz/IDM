package jkl;

import java.util.List;
import java.util.Map;
import jkl.x0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR(\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0007\u0010\u0010¨\u0006\u0013"}, d2 = {"Ljkl/b2;", "", "", "toString", "()Ljava/lang/String;", "", "Ljkl/x0;", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "documents", "", "Ljkl/x0$b;", "Ljkl/w0;", "Ljava/util/Map;", "()Ljava/util/Map;", "config", "Companion", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("documents")
    @NotNull
    private final List<x0> documents;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("config")
    private final Map<x0.b, w0> config;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Map getConfig() {
        return this.config;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getDocuments() {
        return this.documents;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b2)) {
            return false;
        }
        b2 b2Var = (b2) obj2;
        return Intrinsics.f(this.documents, b2Var.documents) && Intrinsics.f(this.config, b2Var.config);
    }

    public final int hashCode() {
        int iHashCode = this.documents.hashCode() * 31;
        Map<x0.b, w0> map = this.config;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }
}
