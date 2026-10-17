package rj7;

import com.revolut.feature.insurance_embedded.api.models.RemoteDocument;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f254619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f254620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RemoteDocument f254621c;

    public h(String str, List summary, RemoteDocument remoteDocument) {
        Intrinsics.checkNotNullParameter(summary, "summary");
        this.f254619a = str;
        this.f254620b = summary;
        this.f254621c = remoteDocument;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f254619a, hVar.f254619a) && Intrinsics.f(this.f254620b, hVar.f254620b) && Intrinsics.f(this.f254621c, hVar.f254621c);
    }

    public final int hashCode() {
        String str = this.f254619a;
        int iD = p.a.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f254620b);
        RemoteDocument remoteDocument = this.f254621c;
        return iD + (remoteDocument != null ? remoteDocument.hashCode() : 0);
    }
}
