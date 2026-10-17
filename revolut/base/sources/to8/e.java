package to8;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.junior_settings.impl.ui_kompot.qr_code_scanner.b f272560w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f272561x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.revolut.feature.junior_settings.impl.ui_kompot.qr_code_scanner.b bVar, gim.c cVar) {
        super(cVar);
        this.f272560w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f272561x |= Integer.MIN_VALUE;
        return com.revolut.feature.junior_settings.impl.ui_kompot.qr_code_scanner.b.I2(this.f272560w, null, this);
    }
}
