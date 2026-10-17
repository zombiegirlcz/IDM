package yma;

import com.revolut.data.model.Data;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class k implements kfm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f314918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f314919b;

    public /* synthetic */ k(p pVar, int i) {
        this.f314918a = i;
        this.f314919b = pVar;
    }

    @Override // kfm.a
    public final void run() {
        switch (this.f314918a) {
            case 0:
                this.f314919b.i.onNext(new Data(Unit.f186387a, null, false, 6, null));
                break;
            default:
                ((g) this.f314919b.d).y0().set(d.SUCCESS);
                break;
        }
    }
}
