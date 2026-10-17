package androidx.work.impl;

import androidx.work.impl.model.WorkGenerationalId;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\tH\u0016J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Landroidx/work/impl/SynchronizedStartStopTokensImpl;", "Landroidx/work/impl/StartStopTokens;", "delegate", "(Landroidx/work/impl/StartStopTokens;)V", "lock", "", "contains", "", "id", "Landroidx/work/impl/model/WorkGenerationalId;", "remove", "Landroidx/work/impl/StartStopToken;", "", "workSpecId", "", "tokenFor", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class SynchronizedStartStopTokensImpl implements StartStopTokens {

    @NotNull
    private final StartStopTokens delegate;

    @NotNull
    private final Object lock;

    public SynchronizedStartStopTokensImpl(@NotNull StartStopTokens delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
        this.lock = new Object();
    }

    @Override // androidx.work.impl.StartStopTokens
    public boolean contains(@NotNull WorkGenerationalId id10) {
        boolean zContains;
        Intrinsics.checkNotNullParameter(id10, "id");
        synchronized (this.lock) {
            zContains = this.delegate.contains(id10);
        }
        return zContains;
    }

    @Override // androidx.work.impl.StartStopTokens
    public StartStopToken remove(@NotNull WorkGenerationalId id10) {
        StartStopToken startStopTokenRemove;
        Intrinsics.checkNotNullParameter(id10, "id");
        synchronized (this.lock) {
            startStopTokenRemove = this.delegate.remove(id10);
        }
        return startStopTokenRemove;
    }

    @Override // androidx.work.impl.StartStopTokens
    @NotNull
    public StartStopToken tokenFor(@NotNull WorkGenerationalId id10) {
        StartStopToken startStopToken;
        Intrinsics.checkNotNullParameter(id10, "id");
        synchronized (this.lock) {
            startStopToken = this.delegate.tokenFor(id10);
        }
        return startStopToken;
    }

    @Override // androidx.work.impl.StartStopTokens
    @NotNull
    public List<StartStopToken> remove(@NotNull String workSpecId) {
        List<StartStopToken> listRemove;
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        synchronized (this.lock) {
            listRemove = this.delegate.remove(workSpecId);
        }
        return listRemove;
    }
}
