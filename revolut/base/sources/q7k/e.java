package q7k;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f242881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f242882b;

    public /* synthetic */ e(j jVar, int i) {
        this.f242881a = i;
        this.f242882b = jVar;
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f242881a) {
            case 0:
                return new j8k.d(new zjh.j(((c21.b) this.f242882b.f242905a.d).c()), new j8k.e());
            case 1:
                j jVar = this.f242882b;
                return new com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.qr_link.flow.b(jVar.d.e(), new zjh.j(((c21.b) jVar.f242905a.d).c()));
            default:
                return new u5k.d(this.f242882b.f242910j.a());
        }
    }
}
