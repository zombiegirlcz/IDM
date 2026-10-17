package p2m;

import android.widget.ImageView;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f232543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f232544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f232545c;

    public b(g viewModel, ImageView thumbnail, TextView itemTitle) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(thumbnail, "thumbnail");
        Intrinsics.checkNotNullParameter(itemTitle, "itemTitle");
        this.f232543a = viewModel;
        this.f232544b = thumbnail;
        this.f232545c = itemTitle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f232543a, bVar.f232543a) && Intrinsics.f(this.f232544b, bVar.f232544b) && Intrinsics.f(this.f232545c, bVar.f232545c);
    }

    public final int hashCode() {
        return this.f232545c.hashCode() + ((this.f232544b.hashCode() + (this.f232543a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Binding(viewModel=" + this.f232543a + ", thumbnail=" + this.f232544b + ", itemTitle=" + this.f232545c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
