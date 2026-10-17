package ozc;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class i0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f231281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0 f231282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ od0.i f231283c;

    public /* synthetic */ i0(l0 l0Var, od0.i iVar, int i) {
        this.f231281a = i;
        this.f231282b = l0Var;
        this.f231283c = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List answers = (List) obj2;
        switch (this.f231281a) {
            case 0:
                Intrinsics.checkNotNullParameter(answers, "answers");
                d dVar = this.f231282b.f231293a;
                ArrayList answers2 = zhm.d0.F0(this.f231283c.c(), answers);
                t tVar = (t) dVar;
                tVar.getClass();
                Intrinsics.checkNotNullParameter(answers2, "answers");
                return te0.w.z0(((s0) tVar.f231329b).y0(), answers2);
            default:
                Intrinsics.checkNotNullParameter(answers, "questions");
                d dVar2 = this.f231282b.f231293a;
                ArrayList questions = zhm.d0.E0(answers, zhm.u.c(this.f231283c.c()));
                t tVar2 = (t) dVar2;
                tVar2.getClass();
                Intrinsics.checkNotNullParameter(questions, "questions");
                s0 s0Var = (s0) tVar2.f231329b;
                return te0.w.z0(s0Var.f231324s.getValue(s0Var, s0.z[17]), questions);
        }
    }
}
