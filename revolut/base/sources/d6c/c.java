package d6c;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f111482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f111483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f111484c;

    public c(String title, a category, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(category, "category");
        this.f111482a = title;
        this.f111483b = category;
        this.f111484c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f111482a, cVar.f111482a) && this.f111483b == cVar.f111483b && Intrinsics.f(this.f111484c, cVar.f111484c);
    }

    public final int hashCode() {
        int iHashCode = (this.f111483b.hashCode() + (this.f111482a.hashCode() * 31)) * 31;
        String str = this.f111484c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
