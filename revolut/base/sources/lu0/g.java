package lu0;

import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class g extends kotlin.jvm.internal.a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f199991a = new g();

    public g() {
        super(1, rd0.e.class, "e", "e(Ljava/lang/Throwable;Ljava/util/Set;)V", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Throwable p0 = (Throwable) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, p0, h0Var);
        return Unit.f186387a;
    }
}
