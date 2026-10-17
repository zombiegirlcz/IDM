package cma;

import ip0.s7;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import vim.f;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f25179b;

    public /* synthetic */ a(d dVar, int i) {
        this.f25178a = i;
        this.f25179b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f25178a) {
            case 0:
                Function0 it8 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                this.f25179b.getClass();
                IntRange intRange = new IntRange(0, 6, 1);
                ArrayList arrayList = new ArrayList(w.t(intRange, 10));
                f it9 = intRange.iterator();
                while (it9.f289625c) {
                    s7 s7Var = new s7(String.valueOf(it9.nextInt()), 0, 0, 0, 0, false, null, 126);
                    yp0.b.l(s7Var, 0, 0, 0, 0, null, false, 63);
                    arrayList.add(s7Var);
                }
                return new wla.f(arrayList, wla.c.f298465a);
            default:
                zme.f residency = (zme.f) obj2;
                Intrinsics.checkNotNullParameter(residency, "residency");
                return ((o8b.c) this.f25179b.f25186a).b(residency.f323482a.f297794a);
        }
    }
}
