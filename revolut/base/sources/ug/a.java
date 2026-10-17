package ug;

import com.google.android.gms.maps.model.Marker;
import java.util.HashMap;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes17.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f279911a = new LinkedHashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f279912b;

    public a(c cVar) {
        this.f279912b = cVar;
    }

    public final void a() {
        LinkedHashSet linkedHashSet = this.f279911a;
        for (Object obj2 : linkedHashSet) {
            ((Marker) obj2).remove();
            ((HashMap) this.f279912b.f127556b).remove(obj2);
        }
        linkedHashSet.clear();
    }
}
