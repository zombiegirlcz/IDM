package joi;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f177130a = new ArrayList();

    public final void a(RecyclerView.ViewHolder holder, Function1 endTransition) {
        Object obj2;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(endTransition, "endTransition");
        ArrayList arrayList = this.f177130a;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj2 = null;
                break;
            }
            obj2 = arrayList.get(i);
            if (((u) obj2).f177133c.contains(holder)) {
                break;
            } else {
                i++;
            }
        }
        u uVar = (u) obj2;
        if (uVar == null) {
            return;
        }
        endTransition.invoke(uVar);
        arrayList.remove(uVar);
    }
}
