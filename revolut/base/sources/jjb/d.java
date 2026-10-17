package jjb;

import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit.models.TextClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f174808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HtmlClause f174809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f174810c;

    public d(TextClause title, HtmlClause description, f parcel) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.f174808a = title;
        this.f174809b = description;
        this.f174810c = parcel;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f174808a.equals(dVar.f174808a) && this.f174809b.equals(dVar.f174809b) && this.f174810c.equals(dVar.f174810c);
    }

    public final int hashCode() {
        return this.f174810c.f174812a.hashCode() + ((this.f174809b.hashCode() + (this.f174808a.hashCode() * 31)) * 31);
    }
}
