package b67;

import com.revolut.core.ui_kit.delegates.IconDelegate;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f12541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12542b;

    public e(f fVar, int i) {
        this.f12541a = fVar;
        this.f12542b = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        f fVar = this.f12541a;
        int iIndexOf = fVar.f12544b.indexOf(((IconDelegate.Model) obj2).f52483a);
        int i = this.f12542b;
        if (iIndexOf == -1) {
            iIndexOf = i;
        }
        Integer numValueOf = Integer.valueOf(iIndexOf);
        int iIndexOf2 = fVar.f12544b.indexOf(((IconDelegate.Model) obj3).f52483a);
        if (iIndexOf2 != -1) {
            i = iIndexOf2;
        }
        return cim.b.b(numValueOf, Integer.valueOf(i));
    }
}
