package w2a;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class j implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f293991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f293992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f293993c;
    public final i9i.e d;

    public j(List categories, Data gifs, i browseMode, i9i.e lastSelectedCategory) {
        Intrinsics.checkNotNullParameter(categories, "categories");
        Intrinsics.checkNotNullParameter(gifs, "gifs");
        Intrinsics.checkNotNullParameter(browseMode, "browseMode");
        Intrinsics.checkNotNullParameter(lastSelectedCategory, "lastSelectedCategory");
        this.f293991a = categories;
        this.f293992b = gifs;
        this.f293993c = browseMode;
        this.d = lastSelectedCategory;
    }

    public static j a(j jVar, Data gifs, i browseMode, i9i.e lastSelectedCategory, int i) {
        List categories = jVar.f293991a;
        if ((i & 2) != 0) {
            gifs = jVar.f293992b;
        }
        if ((i & 4) != 0) {
            browseMode = jVar.f293993c;
        }
        if ((i & 8) != 0) {
            lastSelectedCategory = jVar.d;
        }
        jVar.getClass();
        Intrinsics.checkNotNullParameter(categories, "categories");
        Intrinsics.checkNotNullParameter(gifs, "gifs");
        Intrinsics.checkNotNullParameter(browseMode, "browseMode");
        Intrinsics.checkNotNullParameter(lastSelectedCategory, "lastSelectedCategory");
        return new j(categories, gifs, browseMode, lastSelectedCategory);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f293991a, jVar.f293991a) && Intrinsics.f(this.f293992b, jVar.f293992b) && Intrinsics.f(this.f293993c, jVar.f293993c) && Intrinsics.f(this.d, jVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f293993c.hashCode() + kii.e.c(this.f293992b, this.f293991a.hashCode() * 31, 31)) * 31);
    }
}
