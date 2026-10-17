package h7;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final class w extends kotlin.jvm.internal.u implements Function0 {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ x f149826h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(x xVar, int i) {
        super(0);
        this.f = i;
        this.f149826h = xVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f) {
            case 0:
                x xVar = this.f149826h;
                return Boolean.valueOf((((d7.j) xVar.f149828b.getValue()) == null && ((Throwable) xVar.f149829c.getValue()) == null) ? false : true);
            case 1:
                return Boolean.valueOf(((Throwable) this.f149826h.f149829c.getValue()) != null);
            case 2:
                x xVar2 = this.f149826h;
                return Boolean.valueOf(((d7.j) xVar2.f149828b.getValue()) == null && ((Throwable) xVar2.f149829c.getValue()) == null);
            default:
                return Boolean.valueOf(((d7.j) this.f149826h.f149828b.getValue()) != null);
        }
    }
}
