package androidx.compose.runtime;

import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt;
import androidx.compose.runtime.snapshots.Snapshot;
import java.util.Set;
import kotlin.jvm.functions.Function2;
import ukm.q;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class e implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7229b;

    public /* synthetic */ e(Object obj2, int i) {
        this.f7228a = i;
        this.f7229b = obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f7228a) {
            case 0:
                return Recomposer.C18952.invokeSuspend$lambda$0((Recomposer) this.f7229b, (Set) obj2, (Snapshot) obj3);
            default:
                return SnapshotStateKt__SnapshotFlowKt.AnonymousClass1.invokeSuspend$lambda$1((q) this.f7229b, (Set) obj2, (Snapshot) obj3);
        }
    }
}
