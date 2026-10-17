package qog;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f248209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f248210b;

    public c(boolean z, String buttonLoadingTag) {
        Intrinsics.checkNotNullParameter(buttonLoadingTag, "buttonLoadingTag");
        this.f248209a = z;
        this.f248210b = buttonLoadingTag;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f248209a == cVar.f248209a && this.f248210b.equals(cVar.f248210b);
    }

    public final int hashCode() {
        return this.f248210b.hashCode() + (Boolean.hashCode(this.f248209a) * 31);
    }
}
