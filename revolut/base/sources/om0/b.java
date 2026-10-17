package om0;

import ihm.j;
import ite.d;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import rd0.c;
import rd0.e;
import zhm.h0;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f226490a = p.a.h("toSerialized(...)");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f226491b = p.a.h("toSerialized(...)");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e0m.b f226492c = new e0m.b(new d(this, 23));

    /* JADX INFO: loaded from: classes19.dex */
    public static final /* synthetic */ class a extends kotlin.jvm.internal.a implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f226493a = new a();

        public a() {
            super(1, e.class, "e", "e(Ljava/lang/Throwable;Ljava/util/Set;)V", 1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            Throwable p0 = (Throwable) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(c.ERROR, null, null, p0, h0Var);
            return Unit.f186387a;
        }
    }
}
