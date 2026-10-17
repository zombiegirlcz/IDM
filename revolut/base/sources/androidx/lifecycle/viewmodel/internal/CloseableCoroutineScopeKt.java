package androidx.lifecycle.viewmodel.internal;

import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import skm.p0;
import zkm.o;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/lifecycle/viewmodel/internal/CloseableCoroutineScope;", "createViewModelScope", "()Landroidx/lifecycle/viewmodel/internal/CloseableCoroutineScope;", "lifecycle-viewmodel_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class CloseableCoroutineScopeKt {
    @NotNull
    public static final CloseableCoroutineScope createViewModelScope() {
        CoroutineContext coroutineContext;
        try {
            p0 p0Var = p0.f264001a;
            coroutineContext = o.f323119a.e;
        } catch (IllegalStateException unused) {
            coroutineContext = g.f186406a;
        } catch (NotImplementedError unused2) {
            coroutineContext = g.f186406a;
        }
        return new CloseableCoroutineScope(coroutineContext.plus(e0.e()));
    }
}
