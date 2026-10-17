package hqi;

import androidx.appcompat.widget.SearchView;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements SearchView.OnQueryTextListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f154707a;

    public e(f fVar) {
        this.f154707a = fVar;
    }

    @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
    public final boolean onQueryTextChange(String str) {
        if (str == null) {
            return true;
        }
        this.f154707a.f154713n.onNext(str);
        return true;
    }

    @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
    public final boolean onQueryTextSubmit(String str) {
        return true;
    }
}
