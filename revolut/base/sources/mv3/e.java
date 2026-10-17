package mv3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f209117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f209118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f209119c;
    public final d d;

    public e(String title, String description, d primaryButton, d secondaryButton) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(primaryButton, "primaryButton");
        Intrinsics.checkNotNullParameter(secondaryButton, "secondaryButton");
        this.f209117a = title;
        this.f209118b = description;
        this.f209119c = primaryButton;
        this.d = secondaryButton;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f209117a, eVar.f209117a) && Intrinsics.f(this.f209118b, eVar.f209118b) && Intrinsics.f(this.f209119c, eVar.f209119c) && Intrinsics.f(this.d, eVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f209119c.hashCode() + p.a.c(this.f209117a.hashCode() * 31, 31, this.f209118b)) * 31);
    }
}
