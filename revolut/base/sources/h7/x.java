package h7;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;

/* JADX INFO: loaded from: classes23.dex */
public final class x implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final skm.r f149827a = skm.e0.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MutableState f149828b = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MutableState f149829c = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    public final State d;
    public final State e;

    public x() {
        SnapshotStateKt.derivedStateOf(new w(this, 2));
        this.d = SnapshotStateKt.derivedStateOf(new w(this, 0));
        SnapshotStateKt.derivedStateOf(new w(this, 1));
        this.e = SnapshotStateKt.derivedStateOf(new w(this, 3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.State
    public final Object getValue() {
        return (d7.j) this.f149828b.getValue();
    }
}
