package lt8;

import aii.e;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f199839a;

    public a(String webPortalUrl) {
        Intrinsics.checkNotNullParameter(webPortalUrl, "webPortalUrl");
        this.f199839a = webPortalUrl;
    }

    public final String b() {
        return this.f199839a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f199839a, ((a) obj2).f199839a);
    }

    public final int hashCode() {
        return this.f199839a.hashCode();
    }
}
