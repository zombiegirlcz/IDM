package f7;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f132468a;

    public c(int i) {
        switch (i) {
            case 1:
                this.f132468a = new ArrayList();
                break;
            default:
                this.f132468a = new ArrayList();
                break;
        }
    }

    public void a(Path path) {
        ArrayList arrayList = this.f132468a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            x xVar = (x) arrayList.get(size);
            Matrix matrix = r7.l.f251966a;
            if (xVar != null && !xVar.f132549a) {
                r7.l.a(path, xVar.d.m() / 100.0f, xVar.e.m() / 100.0f, xVar.f.m() / 360.0f);
            }
        }
    }
}
