package hsh;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import skm.e0;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements od0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f155046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineScope f155047b;

    public /* synthetic */ a(CoroutineScope coroutineScope, int i, boolean z) {
        this.f155046a = i;
        this.f155047b = coroutineScope;
    }

    @Override // od0.e
    public final void clear() {
        switch (this.f155046a) {
            case 0:
                e0.k(this.f155047b, null);
                break;
            case 1:
                e0.k(this.f155047b, null);
                break;
            case 2:
                e0.k(this.f155047b, null);
                break;
            case 3:
                e0.k(this.f155047b, null);
                break;
            case 4:
                e0.k(this.f155047b, null);
                break;
            case 5:
                e0.k(this.f155047b, null);
                break;
            default:
                e0.k(this.f155047b, null);
                break;
        }
    }

    public a(CoroutineScope failFastCoroutineScope, int i) {
        this.f155046a = i;
        switch (i) {
            case 2:
                Intrinsics.checkNotNullParameter(failFastCoroutineScope, "failFastCoroutineScope");
                this.f155047b = failFastCoroutineScope;
                break;
            default:
                Intrinsics.checkNotNullParameter(failFastCoroutineScope, "scope");
                this.f155047b = failFastCoroutineScope;
                break;
        }
    }
}
