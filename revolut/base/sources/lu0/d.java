package lu0;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r9i.e f199986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ihm.k f199987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RecyclerView.OnScrollListener f199988c;

    public d(r9i.e viewModel, ihm.k itemClickSubject, RecyclerView.OnScrollListener recyclerScrollListener) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(itemClickSubject, "itemClickSubject");
        Intrinsics.checkNotNullParameter(recyclerScrollListener, "recyclerScrollListener");
        this.f199986a = viewModel;
        this.f199987b = itemClickSubject;
        this.f199988c = recyclerScrollListener;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f199986a.equals(dVar.f199986a) && Intrinsics.f(this.f199987b, dVar.f199987b) && Intrinsics.f(this.f199988c, dVar.f199988c);
    }

    public final int hashCode() {
        return this.f199988c.hashCode() + ((this.f199987b.hashCode() + (this.f199986a.hashCode() * 31)) * 31);
    }
}
