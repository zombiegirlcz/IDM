package joi;

import android.view.View;
import androidx.collection.ArraySet;

/* JADX INFO: loaded from: classes10.dex */
public final class q implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f177121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f177122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ as0.d f177123c;
    public final /* synthetic */ r10.f d;
    public final /* synthetic */ String e;
    public final /* synthetic */ qv0.c f;

    public q(View view, View view2, as0.d dVar, r10.f fVar, String str, qv0.c cVar) {
        this.f177121a = view;
        this.f177122b = view2;
        this.f177123c = dVar;
        this.d = fVar;
        this.e = str;
        this.f = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        as0.d dVar = this.f177123c;
        View view = this.f177122b;
        view.removeOnAttachStateChangeListener(dVar);
        r10.f fVar = this.d;
        boolean zRemove = ((ArraySet) fVar.c).remove(view);
        boolean zB0 = fVar.b0(view, this.e);
        if (zRemove && zB0) {
            r10.f.c(view, this.f);
        }
    }
}
