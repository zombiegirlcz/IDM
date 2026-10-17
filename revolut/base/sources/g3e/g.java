package g3e;

import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f140271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f140272b;

    public /* synthetic */ g(i iVar, int i) {
        this.f140271a = i;
        this.f140272b = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f140271a) {
            case 0:
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return (Set) this.f140272b.f140275b.f139981a.getValue();
            default:
                lk0.g pagedData = (lk0.g) obj2;
                Intrinsics.checkNotNullParameter(pagedData, "pagedData");
                return new pfm.h(new f0d.m(this.f140272b, pagedData, 19), 2);
        }
    }
}
