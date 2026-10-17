package q09;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f241186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f241187b;

    public /* synthetic */ h0(m0 m0Var, int i) {
        this.f241186a = i;
        this.f241187b = m0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f241186a) {
            case 0:
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                m0 m0Var = this.f241187b;
                return pd.b.r(m0Var.f241197p.a(m0Var.f241199r.f78016a), new h0(m0Var, 1));
            default:
                u09.q lesson = (u09.q) obj2;
                Intrinsics.checkNotNullParameter(lesson, "lesson");
                return nim.a.w(this.f241187b.f241198q.a(lesson.f276147c), new q03.h(lesson, 4));
        }
    }
}
