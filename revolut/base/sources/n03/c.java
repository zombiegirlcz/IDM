package n03;

import h93.f0;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class c implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f210856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f210857b;

    public /* synthetic */ c(f0 f0Var, int i) {
        this.f210856a = i;
        this.f210857b = f0Var;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        Object next;
        Object next2;
        int i = this.f210856a;
        List content = (List) obj2;
        ((Boolean) obj3).booleanValue();
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(content, "content");
                Iterator it8 = content.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next = it8.next();
                        if (Intrinsics.f(((fo3.c) next).f136801a, this.f210857b.u)) {
                        }
                    } else {
                        next = null;
                    }
                }
                return Boolean.valueOf(next != null);
            default:
                Intrinsics.checkNotNullParameter(content, "content");
                Iterator it9 = content.iterator();
                while (true) {
                    if (it9.hasNext()) {
                        next2 = it9.next();
                        if (Intrinsics.f(((fo3.c) next2).f136801a, this.f210857b.u)) {
                        }
                    } else {
                        next2 = null;
                    }
                }
                return Boolean.valueOf(next2 != null);
        }
    }
}
