package aua;

import kotlin.jvm.internal.o0;
import wim.z;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class c implements kfm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f9683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f9684c;

    public /* synthetic */ c(f fVar, int i, int i2) {
        this.f9682a = i2;
        this.f9683b = fVar;
        this.f9684c = i;
    }

    @Override // kfm.a
    public final void run() {
        switch (this.f9682a) {
            case 0:
                this.f9683b.f9688a.G(Integer.valueOf(this.f9684c), "SUCCESS_SCREEN_COUNTER", z.d(o0.b(Integer.TYPE)));
                break;
            default:
                this.f9683b.f9688a.G(Integer.valueOf(this.f9684c), "POSTPONE_RATE_COUNTER", z.d(o0.b(Integer.TYPE)));
                break;
        }
    }
}
