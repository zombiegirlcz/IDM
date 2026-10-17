package qy3;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f250146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f250147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f250148c;
    public final List d;

    public e(String title, String description, String primaryButtonTitle, List items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(primaryButtonTitle, "primaryButtonTitle");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f250146a = title;
        this.f250147b = description;
        this.f250148c = primaryButtonTitle;
        this.d = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f250146a, eVar.f250146a) && Intrinsics.f(this.f250147b, eVar.f250147b) && Intrinsics.f(this.f250148c, eVar.f250148c) && Intrinsics.f(this.d, eVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f250146a.hashCode() * 31, 31, this.f250147b), 31, this.f250148c);
    }
}
