package aj0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class c implements a {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f5342c;
    public final String d;
    public final String e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f5343g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f5344h;
    public final String i;

    public c(String key, String title, String str, String str2, String placement, List actions, String str3, List chatEntrySuggestions, String contentStyle) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(placement, "placement");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(chatEntrySuggestions, "chatEntrySuggestions");
        Intrinsics.checkNotNullParameter(contentStyle, "contentStyle");
        this.f5340a = key;
        this.f5341b = title;
        this.f5342c = str;
        this.d = str2;
        this.e = placement;
        this.f = actions;
        this.f5343g = str3;
        this.f5344h = chatEntrySuggestions;
        this.i = contentStyle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f5340a, cVar.f5340a) && Intrinsics.f(this.f5341b, cVar.f5341b) && Intrinsics.f(this.f5342c, cVar.f5342c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f) && Intrinsics.f(this.f5343g, cVar.f5343g) && Intrinsics.f(this.f5344h, cVar.f5344h) && Intrinsics.f(this.i, cVar.i);
    }

    @Override // aj0.a
    public final String getKey() {
        return this.f5340a;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f5340a.hashCode() * 31, 31, this.f5341b);
        String str = this.f5342c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iB = p.a.b(p.a.c((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.e), 31, this.f);
        String str3 = this.f5343g;
        return this.i.hashCode() + p.a.d((iB + (str3 != null ? str3.hashCode() : 0)) * 31, 961, this.f5344h);
    }
}
