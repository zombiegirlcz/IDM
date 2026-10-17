package mza;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f210730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f210731b;

    public d(f content, ArrayList screens) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(screens, "screens");
        this.f210730a = content;
        this.f210731b = screens;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f210730a.equals(dVar.f210730a) && this.f210731b.equals(dVar.f210731b);
    }

    public final int hashCode() {
        return this.f210731b.hashCode() + (this.f210730a.hashCode() * 31);
    }
}
