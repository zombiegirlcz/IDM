package jd7;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f172985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f172986b;

    public d(Clause title, Data content) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f172985a = content;
        this.f172986b = title;
    }

    public static d a(d dVar, Data content) {
        Clause title = dVar.f172986b;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(title, "title");
        return new d(title, content);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f172985a, dVar.f172985a) && Intrinsics.f(this.f172986b, dVar.f172986b);
    }

    public final int hashCode() {
        return this.f172986b.hashCode() + (this.f172985a.hashCode() * 31);
    }
}
