package l3l;

import com.revolut.retail.core.navigation.FinishCommand;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class o implements kfm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f191973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f191974b;

    public /* synthetic */ o(s sVar, int i) {
        this.f191973a = i;
        this.f191974b = sVar;
    }

    @Override // kfm.a
    public final void run() {
        switch (this.f191973a) {
            case 0:
                s sVar = this.f191974b;
                if (sVar.f191979a.f191960a.k1()) {
                    sVar.d.onNext(new FinishCommand(null, null, null, 7));
                }
                break;
            default:
                this.f191974b.d.onNext(new FinishCommand(null, null, null, 7));
                break;
        }
    }
}
