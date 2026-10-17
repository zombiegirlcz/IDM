package m67;

import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements kfm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f203024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f203025b;

    public /* synthetic */ a(e eVar, int i) {
        this.f203024a = i;
        this.f203025b = eVar;
    }

    @Override // kfm.a
    public final void run() {
        switch (this.f203024a) {
            case 0:
                this.f203025b.d.j(Unit.f186387a, i67.a.PENDING);
                break;
            default:
                this.f203025b.d.j(Unit.f186387a, i67.a.ENABLED);
                break;
        }
    }
}
