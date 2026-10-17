package sy3;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f266606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f266607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f266608c;

    public c(String title, String buttonTitle, ArrayList items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f266606a = title;
        this.f266607b = buttonTitle;
        this.f266608c = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f266606a, cVar.f266606a) && Intrinsics.f(this.f266607b, cVar.f266607b) && this.f266608c.equals(cVar.f266608c);
    }

    public final int hashCode() {
        return this.f266608c.hashCode() + p.a.c(this.f266606a.hashCode() * 31, 31, this.f266607b);
    }
}
