package w21;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class c implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f293921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f293922b;

    public /* synthetic */ c(o oVar, int i) {
        this.f293921a = i;
        this.f293922b = oVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f293921a) {
            case 0:
                ue0.c cVar = this.f293922b.f293933c;
                String str = (String) cVar.T2("ONE_OFF_TOP_UP_INSTITUTION_ID_KEY", String.class);
                if (str != null) {
                    return new r71.b(str, (String) cVar.T2("ONE_OFF_TOP_UP_BRANCH_ID_KEY", String.class));
                }
                return null;
            default:
                String str2 = (String) j6.a.k(String.class, this.f293922b.f293933c, "WORKFLOW_ID_KEY");
                return str2 == null ? "" : str2;
        }
    }
}
