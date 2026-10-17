package o95;

import grl.r2;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f223077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r2 f223078b;

    public /* synthetic */ f(r2 r2Var, int i) {
        this.f223077a = i;
        this.f223078b = r2Var;
    }

    /* JADX WARN: Type inference failed for: r4v14, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v30, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v38, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v58, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v66, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f223077a) {
            case 0:
                it3.i it8 = (it3.i) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Boolean.valueOf(it8.b() && (it8.f168336b || Intrinsics.f(it8.f168337c.get(this.f223078b), Boolean.TRUE)));
            case 1:
                it3.i it9 = (it3.i) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return Boolean.valueOf(it9.b() && (it9.f168336b || Intrinsics.f(it9.f168337c.get(this.f223078b), Boolean.TRUE)));
            case 2:
                it3.i it10 = (it3.i) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return Boolean.valueOf(it10.b() && (it10.f168336b || Intrinsics.f(it10.a().get(this.f223078b), Boolean.TRUE)));
            case 3:
                it3.i it11 = (it3.i) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return Boolean.valueOf(it11.b() && (it11.f168336b || Intrinsics.f(it11.f168337c.get(this.f223078b), Boolean.TRUE)));
            case 4:
                it3.i iVar = (it3.i) obj2;
                return Boolean.valueOf(iVar.b() && (iVar.f168336b || Intrinsics.f(iVar.f168337c.get(this.f223078b), Boolean.TRUE)));
            case 5:
                it3.i it12 = (it3.i) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return Boolean.valueOf(it12.b() && (it12.f168336b || Intrinsics.f(it12.a().get(this.f223078b), Boolean.TRUE)));
            case 6:
                List eligibilities = (List) obj2;
                Intrinsics.checkNotNullParameter(eligibilities, "eligibilities");
                List<it3.i> list = eligibilities;
                boolean z = false;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    for (it3.i iVar2 : list) {
                        if (iVar2.b() && (iVar2.f168336b || Intrinsics.f(iVar2.a().get(this.f223078b), Boolean.TRUE))) {
                            z = true;
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 7:
                it3.i it13 = (it3.i) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return Boolean.valueOf(it13.b() && (it13.f168336b || Intrinsics.f(it13.f168337c.get(this.f223078b), Boolean.TRUE)));
            default:
                it3.i it14 = (it3.i) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return Boolean.valueOf(it14.b() && (it14.f168336b || Intrinsics.f(it14.f168337c.get(this.f223078b), Boolean.TRUE)));
        }
    }
}
