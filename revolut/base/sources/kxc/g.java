package kxc;

import h30.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f190561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f190562b;

    public /* synthetic */ g(q qVar, int i) {
        this.f190561a = i;
        this.f190562b = qVar;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f190561a) {
            case 0:
                List instructions = (List) obj2;
                Intrinsics.checkNotNullParameter(instructions, "instructions");
                List<d> list = instructions;
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                for (d instruction : list) {
                    f fVar = (f) this.f190562b.f148942c;
                    Intrinsics.checkNotNullParameter(instruction, "instruction");
                    e eVar = (e) u1.v(instruction.getIcon(), fVar.f190560a);
                    if (eVar == null) {
                        eVar = e.SPECIAL_REQUIREMENT;
                    }
                    arrayList.add(new b(eVar, instruction.getDescription()));
                }
                return arrayList;
            default:
                c config = (c) obj2;
                Intrinsics.checkNotNullParameter(config, "config");
                return (List) ((ne0.d) this.f190562b.d).get(config.a());
        }
    }
}
