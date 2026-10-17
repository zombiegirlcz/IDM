package bn3;

import com.revolut.feature.contacts_chooser.api.context.ContextAction;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import nb6.p;
import vkm.i;
import yji.n;

/* JADX INFO: loaded from: classes21.dex */
public abstract class a extends n {
    public abstract Object Z2(List list, p pVar, Continuation continuation);

    public void b3(ContextAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
    }

    public Flow c3() {
        return i.f290039a;
    }
}
