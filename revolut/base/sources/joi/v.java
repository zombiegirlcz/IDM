package joi;

import android.view.View;
import androidx.collection.ArrayMap;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayMap f177137a;

    public v(ks0.f sectionResolver) {
        Intrinsics.checkNotNullParameter(sectionResolver, "sectionResolver");
        this.f177137a = new ArrayMap();
    }

    public final koi.b a(RecyclerView.ViewHolder viewHolder, String str) {
        koi.b bVar = (koi.b) this.f177137a.get(viewHolder);
        if (bVar != null && ks0.f.k(str, bVar)) {
            return bVar;
        }
        return null;
    }

    public final koi.b b(String str, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            koi.b bVarA = a((RecyclerView.ViewHolder) list.get(i), str);
            if (bVarA != null) {
                return bVarA;
            }
        }
        return null;
    }

    public final View c(RecyclerView.ViewHolder holder, String sectionKey) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(sectionKey, "sectionKey");
        koi.b bVarA = a(holder, sectionKey);
        if (bVarA != null) {
            return bVarA.itemView;
        }
        return null;
    }
}
