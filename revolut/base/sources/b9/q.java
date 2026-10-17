package b9;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes16.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f13445b;

    public q(int i) {
        this.f13444a = i;
        switch (i) {
            case 1:
                this.f13445b = new ArrayList();
                break;
            default:
                this.f13445b = null;
                break;
        }
    }

    public void a(p pVar) {
        if (this.f13445b == null) {
            this.f13445b = new ArrayList();
        }
        for (int i = 0; i < this.f13445b.size(); i++) {
            if (((p) this.f13445b.get(i)).f13432a.f13455b > pVar.f13432a.f13455b) {
                this.f13445b.add(i, pVar);
                return;
            }
        }
        this.f13445b.add(pVar);
    }

    public void b(q qVar) {
        if (qVar.f13445b == null) {
            return;
        }
        if (this.f13445b == null) {
            this.f13445b = new ArrayList(qVar.f13445b.size());
        }
        Iterator it8 = qVar.f13445b.iterator();
        while (it8.hasNext()) {
            a((p) it8.next());
        }
    }

    public ArrayList c() {
        ArrayList arrayList = new ArrayList();
        for (wc.r rVar : this.f13445b) {
            Bundle bundle = new Bundle();
            bundle.putInt("event_type", rVar.f296305a);
            bundle.putLong("event_timestamp", rVar.f296306b);
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public void d(int i) {
        this.f13445b.add(new wc.r(i, System.currentTimeMillis()));
    }

    public String toString() {
        switch (this.f13444a) {
            case 0:
                if (this.f13445b == null) {
                    return "";
                }
                StringBuilder sb6 = new StringBuilder();
                Iterator it8 = this.f13445b.iterator();
                while (it8.hasNext()) {
                    sb6.append(((p) it8.next()).toString());
                    sb6.append('\n');
                }
                return sb6.toString();
            default:
                return super.toString();
        }
    }
}
