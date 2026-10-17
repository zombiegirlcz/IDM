package u1m;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d0 extends kotlin.jvm.internal.u implements Function0 {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e0 f276457h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(e0 e0Var, int i) {
        super(0);
        this.f = i;
        this.f276457h = e0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f) {
            case 0:
                return new a2m.a((m2m.a) ((e2m.d) this.f276457h.e.getValue()).f122158j.getValue());
            case 1:
                return new a2m.b((g2m.e) ((e2m.d) this.f276457h.e.getValue()).f.getValue());
            case 2:
                return new a2m.c((m2m.b) ((e2m.d) this.f276457h.e.getValue()).o.getValue());
            case 3:
                e0 e0Var = this.f276457h;
                Context context = e0Var.d;
                Intrinsics.checkNotNullExpressionValue(context, "access$getAppContext$p(...)");
                return new e2m.d(context, e0Var.f276459a, e0Var.f276460b, e0Var.f276461c);
            case 4:
                return new a2m.d((g2m.e) ((e2m.d) this.f276457h.e.getValue()).f.getValue());
            case 5:
                return new a2m.e((g2m.d) ((e2m.d) this.f276457h.e.getValue()).e.getValue());
            case 6:
                return new a2m.f((g2m.a) ((e2m.d) this.f276457h.e.getValue()).i.getValue());
            case 7:
                return new b2m.a((g2m.b) ((e2m.d) this.f276457h.e.getValue()).f122157h.getValue());
            case 8:
                g2m.c coreEkycJpkiRepository = (g2m.c) ((e2m.d) this.f276457h.e.getValue()).f122156g.getValue();
                Intrinsics.checkNotNullParameter(coreEkycJpkiRepository, "coreEkycJpkiRepository");
                return new b2m.b();
            default:
                return new a2m.g((g2m.e) ((e2m.d) this.f276457h.e.getValue()).f.getValue());
        }
    }
}
