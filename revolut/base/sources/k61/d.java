package k61;

import com.revolut.core.model.account.AccountId;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class d implements kfm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f181594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f181595b;

    public /* synthetic */ d(i iVar, int i) {
        this.f181594a = i;
        this.f181595b = iVar;
    }

    @Override // kfm.a
    public final void run() {
        switch (this.f181594a) {
            case 0:
                i iVar = this.f181595b;
                ((nzl.a) iVar.f181614g).e();
                iVar.f181612b.k0(AccountId.Personal.f51414a);
                break;
            default:
                i iVar2 = this.f181595b;
                iVar2.f181612b.k0(AccountId.Personal.f51414a);
                ((nzl.a) iVar2.f181614g).e();
                break;
        }
    }
}
