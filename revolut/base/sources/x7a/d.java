package x7a;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.data.model.Data;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import s7a.c0;
import s7a.d0;
import s7a.e0;
import s7a.h0;
import s7a.i0;
import vkm.i;

/* JADX INFO: loaded from: classes13.dex */
public abstract class d {
    public Clause a(Set preSelectedModelIds, Set ids) {
        Intrinsics.checkNotNullParameter(preSelectedModelIds, "preSelectedModelIds");
        Intrinsics.checkNotNullParameter(ids, "ids");
        return null;
    }

    public i0 b(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return null;
    }

    public abstract c0 c(Set set, Object obj2);

    public abstract List d(Data data, Set set, List list, String str, Object obj2);

    public abstract Flow e(String str, boolean z, Object obj2);

    public h0 f(d0 action, String str) {
        Intrinsics.checkNotNullParameter(action, "action");
        return e0.f260605a;
    }

    public void g(String listId, CharSequence text) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(text, "text");
    }

    public Flow h() {
        return i.f290039a;
    }
}
