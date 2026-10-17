package aua;

import kotlin.jvm.internal.o0;
import qc0.j0;
import wim.z;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class d implements kfm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f9687c;

    public /* synthetic */ d(Object obj2, long j2, int i) {
        this.f9685a = i;
        this.f9686b = obj2;
        this.f9687c = j2;
    }

    @Override // kfm.a
    public final void run() {
        switch (this.f9685a) {
            case 0:
                ((f) this.f9686b).f9688a.G(Long.valueOf(this.f9687c), "NEXT_POSSIBLE_RATE_ACTION_DATE", z.d(o0.b(Long.TYPE)));
                break;
            case 1:
                ((f) this.f9686b).f9688a.G(Long.valueOf(this.f9687c), "APP_RATING_SHOWN_DATE", z.d(o0.b(Long.TYPE)));
                break;
            default:
                ((j0) this.f9686b).t0(this.f9687c);
                break;
        }
    }
}
