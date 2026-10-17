package gd0;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class a implements kfm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f143019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f143020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kd0.a f143021c;
    public final /* synthetic */ ArrayList d;

    public /* synthetic */ a(f fVar, kd0.a aVar, ArrayList arrayList, int i) {
        this.f143019a = i;
        this.f143020b = fVar;
        this.f143021c = aVar;
        this.d = arrayList;
    }

    @Override // kfm.a
    public final void run() {
        switch (this.f143019a) {
            case 0:
                this.f143020b.d.k(this.f143021c, this.d);
                break;
            default:
                this.f143020b.d.k(this.f143021c, this.d);
                break;
        }
    }
}
