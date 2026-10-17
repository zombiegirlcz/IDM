package c00;

import java.util.ArrayList;
import java.util.Iterator;
import xv.q;

/* JADX INFO: loaded from: classes16.dex */
public final class c implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ArrayList f20084a;

    public c(ArrayList arrayList) {
        this.f20084a = arrayList;
    }

    @Override // xv.q
    public final boolean d() {
        ArrayList arrayList = this.f20084a;
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            if (!((q) it8.next()).d()) {
                return false;
            }
        }
        return true;
    }
}
