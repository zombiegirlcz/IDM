package q25;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f241539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f241540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f241541c;
    public final ArrayList d;

    public a(String title, String subtitle, String action, ArrayList stories) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(stories, "stories");
        this.f241539a = title;
        this.f241540b = subtitle;
        this.f241541c = action;
        this.d = stories;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f241539a, aVar.f241539a) && Intrinsics.f(this.f241540b, aVar.f241540b) && Intrinsics.f(this.f241541c, aVar.f241541c) && this.d.equals(aVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f241539a.hashCode() * 31, 31, this.f241540b), 31, this.f241541c);
    }
}
