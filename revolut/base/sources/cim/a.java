package cim;

import java.util.Comparator;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class a implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Comparator f24564b;

    public /* synthetic */ a(Comparator comparator, int i) {
        this.f24563a = i;
        this.f24564b = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        switch (this.f24563a) {
            case 0:
                if (obj2 != obj3) {
                    if (obj2 != null) {
                        if (obj3 != null) {
                            break;
                        }
                    }
                }
                break;
            default:
                if (obj2 != obj3) {
                    if (obj2 != null) {
                        if (obj3 != null) {
                            break;
                        }
                    }
                }
                break;
        }
        return this.f24564b.compare(obj2, obj3);
    }
}
