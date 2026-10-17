package pq0;

import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.media.models.UrlMedia;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a implements koi.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UrlMedia f238629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f238630b;

    public a(UrlMedia media, TextClause title) {
        Intrinsics.checkNotNullParameter("product_article_header_id", "listId");
        Intrinsics.checkNotNullParameter(media, "media");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f238629a = media;
        this.f238630b = title;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getE() {
        return "product_article_header_id";
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f238629a.equals(aVar.f238629a) && this.f238630b.equals(aVar.f238630b);
    }

    public final int hashCode() {
        return this.f238630b.hashCode() + p.a.c(-1101092404, 31, this.f238629a.f60075a);
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof a ? (a) oldItem : null) == null) {
            return null;
        }
        a aVar = (a) oldItem;
        return new b(!this.f238630b.equals(aVar.f238630b), !this.f238629a.equals(aVar.f238629a));
    }
}
