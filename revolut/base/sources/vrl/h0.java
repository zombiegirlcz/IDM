package vrl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class h0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f291637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0 f291638b;

    public /* synthetic */ h0(l0 l0Var, int i) {
        this.f291637a = i;
        this.f291638b = l0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f291637a) {
            case 0:
                List groups = (List) obj2;
                Intrinsics.checkNotNullParameter(groups, "it");
                d0 d0Var = this.f291638b.f291649b;
                Intrinsics.checkNotNullParameter(groups, "groups");
                w4l.h loadingStrategy = w4l.h.f294642c;
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                if (groups.isEmpty()) {
                    return zi0.c.i(groups);
                }
                ArrayList arrayList = new ArrayList();
                Iterator it8 = groups.iterator();
                while (it8.hasNext()) {
                    zhm.a0.x(((xdf.h) it8.next()).f304436c, arrayList);
                }
                return nim.a.v(d0Var.b(arrayList, null, loadingStrategy), new c0(d0Var, groups, 1));
            default:
                Optional groupOptional = (Optional) obj2;
                Intrinsics.checkNotNullParameter(groupOptional, "it");
                d0 d0Var2 = this.f291638b.f291649b;
                Intrinsics.checkNotNullParameter(groupOptional, "groupOptional");
                w4l.h loadingStrategy2 = w4l.h.f294642c;
                Intrinsics.checkNotNullParameter(loadingStrategy2, "loadingStrategy");
                return !groupOptional.isPresent() ? zi0.c.i(groupOptional) : nim.a.v(d0Var2.b(((xdf.h) groupOptional.get()).f304436c, null, loadingStrategy2), new vq5.x(groupOptional, 5));
        }
    }
}
