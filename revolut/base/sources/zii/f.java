package zii;

import com.revolut.retail.core.navigation.NaviCommand;
import java.util.List;
import kfm.o;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class f implements kfm.g, kfm.c, o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f322574a;

    public /* synthetic */ f(int i) {
        this.f322574a = i;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        Unit unit = Unit.f186387a;
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        zr8.f fVar = zr8.f.f;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return (List) fVar.invoke(p0);
    }

    public /* synthetic */ f(c cVar) {
        this.f322574a = 0;
    }

    @Override // kfm.c
    public Object apply(Object p0, Object p17) {
        switch (this.f322574a) {
            case 1:
                zk9.a aVar = zk9.a.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                Intrinsics.checkNotNullParameter(p17, "p1");
                return (NaviCommand) aVar.invoke(p0, p17);
            default:
                ztc.c cVar = ztc.c.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                Intrinsics.checkNotNullParameter(p17, "p1");
                return (Pair) cVar.invoke(p0, p17);
        }
    }
}
