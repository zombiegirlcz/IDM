package sh4;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f263421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f263422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f263423c;

    public /* synthetic */ a(String str, f fVar, int i) {
        this.f263421a = i;
        this.f263422b = str;
        this.f263423c = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f263421a) {
            case 0:
                StringBuilder sb6 = new StringBuilder("Login success with accountID: ");
                String str = this.f263422b;
                sb6.append(str);
                sb6.toString();
                this.f263423c.d.invoke(str, null);
                break;
            case 1:
                StringBuilder sb9 = new StringBuilder("Analytics: ");
                String str2 = this.f263422b;
                sb9.append(str2);
                sb9.toString();
                this.f263423c.f.invoke(str2);
                break;
            case 2:
                StringBuilder sb10 = new StringBuilder("Fetch loading: ");
                String str3 = this.f263422b;
                sb10.append(str3);
                sb10.toString();
                this.f263423c.f263430g.invoke(str3);
                break;
            case 3:
                StringBuilder sb11 = new StringBuilder("Fetch error: ");
                String str4 = this.f263422b;
                sb11.append(str4);
                sb11.toString();
                this.f263423c.f263431h.invoke(str4);
                break;
            case 4:
                StringBuilder sb12 = new StringBuilder("Success! User UUID: ");
                String str5 = this.f263422b;
                sb12.append(str5);
                sb12.toString();
                this.f263423c.e.invoke(str5);
                break;
            default:
                StringBuilder sb13 = new StringBuilder("Init ");
                String str6 = this.f263422b;
                sb13.append(str6);
                sb13.toString();
                this.f263423c.f263428b.invoke(str6);
                break;
        }
    }
}
