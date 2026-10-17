package h7;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final class g extends kotlin.jvm.internal.u implements Function1 {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ j f149782h;
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(j jVar, int i, int i2) {
        super(1);
        this.f = i2;
        this.f149782h = jVar;
        this.i = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f) {
            case 0:
                return Boolean.valueOf(j.a(this.f149782h, this.i, ((Number) obj2).longValue()));
            default:
                return Boolean.valueOf(j.a(this.f149782h, this.i, ((Number) obj2).longValue()));
        }
    }
}
