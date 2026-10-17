package hbf;

import ip0.s7;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class y implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f150687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f150688b;

    public /* synthetic */ y(c0 c0Var, int i) {
        this.f150687a = i;
        this.f150688b = c0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Function0 it8 = (Function0) obj2;
        switch (this.f150687a) {
            case 0:
                Intrinsics.checkNotNullParameter(it8, "it");
                c0 c0Var = this.f150688b;
                return c0.a(c0Var, p.f150674a, (List) c0Var.f150660b.getValue(), 4);
            case 1:
                Intrinsics.checkNotNullParameter(it8, "<unused var>");
                return (List) this.f150688b.d.getValue();
            case 2:
                Intrinsics.checkNotNullParameter(it8, "it");
                return (s7) this.f150688b.e.getValue();
            default:
                Intrinsics.checkNotNullParameter(it8, "<unused var>");
                return (s7) this.f150688b.f150661c.getValue();
        }
    }
}
