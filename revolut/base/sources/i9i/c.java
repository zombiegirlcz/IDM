package i9i;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f159878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f159879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f159880c;
    public final a d;
    public final b e;

    public c(String id10, a preview, a previewSmall, a full, b type) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(preview, "preview");
        Intrinsics.checkNotNullParameter(previewSmall, "previewSmall");
        Intrinsics.checkNotNullParameter(full, "full");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f159878a = id10;
        this.f159879b = preview;
        this.f159880c = previewSmall;
        this.d = full;
        this.e = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f159878a, cVar.f159878a) && Intrinsics.f(this.f159879b, cVar.f159879b) && Intrinsics.f(this.f159880c, cVar.f159880c) && Intrinsics.f(this.d, cVar.d) && this.e == cVar.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.f159880c.hashCode() + ((this.f159879b.hashCode() + (this.f159878a.hashCode() * 31)) * 31)) * 31)) * 31);
    }
}
