package g2;

import androidx.compose.runtime.snapshots.ObserverHandle;
import androidx.compose.runtime.snapshots.Snapshot;
import kotlin.Function;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class a implements ObserverHandle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f139752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function f139753b;

    public /* synthetic */ a(Function function, int i) {
        this.f139752a = i;
        this.f139753b = function;
    }

    @Override // androidx.compose.runtime.snapshots.ObserverHandle
    public final void dispose() {
        switch (this.f139752a) {
            case 0:
                Snapshot.Companion.registerGlobalWriteObserver$lambda$1((Function1) this.f139753b);
                break;
            default:
                Snapshot.Companion.registerApplyObserver$lambda$1((Function2) this.f139753b);
                break;
        }
    }
}
