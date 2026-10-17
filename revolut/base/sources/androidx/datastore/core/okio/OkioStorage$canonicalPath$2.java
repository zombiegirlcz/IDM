package androidx.datastore.core.okio;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;
import mmm.g0;
import mmm.h0;
import nmm.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Lmmm/h0;", "invoke", "()Lmmm/h0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class OkioStorage$canonicalPath$2 extends u implements Function0<h0> {
    final /* synthetic */ OkioStorage<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkioStorage$canonicalPath$2(OkioStorage<T> okioStorage) {
        super(0);
        this.this$0 = okioStorage;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final h0 invoke() {
        h0 h0Var = (h0) ((OkioStorage) this.this$0).producePath.invoke();
        h0Var.getClass();
        boolean z = c.a(h0Var) != -1;
        OkioStorage<T> okioStorage = this.this$0;
        if (z) {
            g0 g0Var = h0.Companion;
            String strV = h0Var.f207272a.v();
            g0Var.getClass();
            return g0.a(strV, true);
        }
        throw new IllegalStateException(("OkioStorage requires absolute paths, but did not get an absolute path from producePath = " + ((OkioStorage) okioStorage).producePath + ", instead got " + h0Var).toString());
    }
}
