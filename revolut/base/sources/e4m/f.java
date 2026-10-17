package e4m;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import vc.s;

/* JADX INFO: loaded from: classes13.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f122678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f122679b;

    public f(int i, byte b4) {
        this.f122678a = i;
        switch (i) {
            case 2:
                this.f122679b = new ArrayList();
                break;
            case 3:
                this.f122679b = new ArrayList();
                break;
            default:
                this.f122679b = new ArrayList();
                break;
        }
    }

    public void a(Object obj2) {
        s.i(obj2, "Set contributions cannot be null");
        this.f122679b.add(obj2);
    }

    public void b(Object obj2, String str) {
        this.f122679b.add(str + "=" + obj2);
    }

    public Set c() {
        ArrayList arrayList = this.f122679b;
        return arrayList.isEmpty() ? Collections.EMPTY_SET : arrayList.size() == 1 ? Collections.singleton(arrayList.get(0)) : j6.a.A(arrayList);
    }

    public synchronized ArrayList d(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (q8.b bVar : this.f122679b) {
            if ((bVar.f242952a.isAssignableFrom(cls) && cls2.isAssignableFrom(bVar.f242953b)) && !arrayList.contains(bVar.f242953b)) {
                arrayList.add(bVar.f242953b);
            }
        }
        return arrayList;
    }

    public String toString() {
        switch (this.f122678a) {
            case 1:
                return this.f122679b.toString();
            default:
                return super.toString();
        }
    }

    public f(int i) {
        this.f122678a = 0;
        this.f122679b = new ArrayList(i);
    }
}
