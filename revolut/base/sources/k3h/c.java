package k3h;

import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.core.ui_kit.delegates.HeaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RatingBarDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HeaderDelegate f180733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HeaderLoadingDelegate f180734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ListSubheaderLoadingDelegate f180735c;
    public final ListSubheaderDelegate d;
    public final RatingBarDelegate e;

    public c(HeaderDelegate headerDelegate, HeaderLoadingDelegate headerLoadingDelegate, ListSubheaderLoadingDelegate listSubheaderLoadingDelegate, ListSubheaderDelegate listSubheaderDelegate, RatingBarDelegate ratingBarDelegate) {
        Intrinsics.checkNotNullParameter(headerDelegate, "headerDelegate");
        Intrinsics.checkNotNullParameter(headerLoadingDelegate, "headerLoadingDelegate");
        Intrinsics.checkNotNullParameter(listSubheaderLoadingDelegate, "listSubheaderLoadingDelegate");
        Intrinsics.checkNotNullParameter(listSubheaderDelegate, "listSubheaderDelegate");
        Intrinsics.checkNotNullParameter(ratingBarDelegate, "ratingBarDelegate");
        this.f180733a = headerDelegate;
        this.f180734b = headerLoadingDelegate;
        this.f180735c = listSubheaderLoadingDelegate;
        this.d = listSubheaderDelegate;
        this.e = ratingBarDelegate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f180733a, cVar.f180733a) && Intrinsics.f(this.f180734b, cVar.f180734b) && Intrinsics.f(this.f180735c, cVar.f180735c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.f180735c.hashCode() + ((this.f180734b.hashCode() + (this.f180733a.hashCode() * 31)) * 31)) * 31)) * 31);
    }
}
