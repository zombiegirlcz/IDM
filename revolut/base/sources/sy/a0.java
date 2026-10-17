package sy;

/* JADX INFO: loaded from: classes16.dex */
public final class a0 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.camerakit.revolut.ui.flow.steps.camera.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f266532w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.revolut.camerakit.revolut.ui.flow.steps.camera.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f266532w |= Integer.MIN_VALUE;
        return com.revolut.camerakit.revolut.ui.flow.steps.camera.a.I2(this.v, this);
    }
}
