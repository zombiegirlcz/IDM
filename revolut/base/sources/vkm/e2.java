package vkm;

import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: classes13.dex */
public final class e2 implements d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f290018a;

    public /* synthetic */ e2(int i) {
        this.f290018a = i;
    }

    @Override // vkm.d2
    public final Flow a(StateFlow stateFlow) {
        switch (this.f290018a) {
            case 0:
                return new go.g(b2.START, 2);
            default:
                return new v1(new vge.r(stateFlow, null, 23));
        }
    }

    public final String toString() {
        switch (this.f290018a) {
            case 0:
                return "SharingStarted.Eagerly";
            default:
                return "SharingStarted.Lazily";
        }
    }
}
