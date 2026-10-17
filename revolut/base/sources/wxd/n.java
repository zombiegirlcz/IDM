package wxd;

import com.revolut.feature.statements.api.navigation.DocumentsHubType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class n implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f300874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f300875b;

    public n(String path, String payload) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.f300874a = path;
        this.f300875b = payload;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        String str = nVar.f300874a;
        DocumentsHubType.Companion companion = DocumentsHubType.INSTANCE;
        return Intrinsics.f(this.f300874a, str) && Intrinsics.f(this.f300875b, nVar.f300875b);
    }

    public final int hashCode() {
        DocumentsHubType.Companion companion = DocumentsHubType.INSTANCE;
        return this.f300875b.hashCode() + (this.f300874a.hashCode() * 31);
    }
}
