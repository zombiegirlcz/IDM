package ub;

import androidx.compose.runtime.DisposableEffectResult;

/* JADX INFO: loaded from: classes23.dex */
public final class e implements DisposableEffectResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f278712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f278713b;

    public /* synthetic */ e(Object obj2, int i) {
        this.f278712a = i;
        this.f278713b = obj2;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        switch (this.f278712a) {
            case 0:
                ((c) this.f278713b).e = null;
                break;
            default:
                ((f) this.f278713b).getClass();
                break;
        }
    }
}
