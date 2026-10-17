package lu0;

import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f200008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f200009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r9i.e f200010c;
    public final RecyclerView.OnScrollListener d;
    public final Clause e;
    public final Clause f;

    public t(String typeId, List categories, r9i.e viewModel, RecyclerView.OnScrollListener recyclerScrollListener, Clause errorMessage, Clause errorAction) {
        Intrinsics.checkNotNullParameter(typeId, "typeId");
        Intrinsics.checkNotNullParameter(categories, "categories");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(recyclerScrollListener, "recyclerScrollListener");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        Intrinsics.checkNotNullParameter(errorAction, "errorAction");
        this.f200008a = typeId;
        this.f200009b = categories;
        this.f200010c = viewModel;
        this.d = recyclerScrollListener;
        this.e = errorMessage;
        this.f = errorAction;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f200008a, tVar.f200008a) && Intrinsics.f(this.f200009b, tVar.f200009b) && this.f200010c.equals(tVar.f200010c) && Intrinsics.f(this.d, tVar.d) && Intrinsics.f(this.e, tVar.e) && Intrinsics.f(this.f, tVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + p.a.a((this.d.hashCode() + ((this.f200010c.hashCode() + p.a.d(this.f200008a.hashCode() * 31, 31, this.f200009b)) * 31)) * 31, 31, this.e);
    }
}
