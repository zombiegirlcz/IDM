package skm;

import kotlin.Unit;

/* JADX INFO: loaded from: classes13.dex */
public final class v0 extends x0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f264014c;
    public final /* synthetic */ kotlinx.coroutines.b d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(kotlinx.coroutines.b bVar, long j2, l lVar) {
        super(j2);
        this.d = bVar;
        this.f264014c = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f264014c.E(this.d, Unit.f186387a);
    }

    @Override // skm.x0
    public final String toString() {
        return super.toString() + this.f264014c;
    }
}
