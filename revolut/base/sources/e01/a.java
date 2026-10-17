package e01;

import androidx.recyclerview.widget.RecyclerView;
import dz7.l;
import efm.r;
import ifm.c;
import ihm.f;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakHashMap f121374a = new WeakHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f121375b = v0.a.d("create(...)");

    public final void a(r observable, Object obj2) {
        Intrinsics.checkNotNullParameter(observable, "observable");
        WeakHashMap weakHashMap = this.f121374a;
        c cVar = (c) weakHashMap.get(obj2);
        if (cVar != null) {
            cVar.dispose();
        }
        weakHashMap.put(obj2, observable.subscribe(new l(new dug.a(this, 20), 4)));
    }

    public final void b(Object data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f121375b.onNext(data);
    }

    public final void c(RecyclerView.ViewHolder viewHolder) {
        c cVar = (c) this.f121374a.get(viewHolder);
        if (cVar != null) {
            cVar.dispose();
        }
    }
}
