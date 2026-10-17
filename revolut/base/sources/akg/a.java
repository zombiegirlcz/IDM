package akg;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import zhm.r0;

/* JADX INFO: loaded from: classes13.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ a f5927a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final aim.f f5928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f5929c;

    static {
        aim.f builder = new aim.f();
        for (xjg.m mVar : xjg.m.a()) {
            builder.put(mVar.getId(), mVar);
        }
        builder.put("transparent", xjg.m.NIGHT);
        Intrinsics.checkNotNullParameter(builder, "builder");
        f5928b = builder.b();
        f5929c = r0.k(new Pair("Basic", xjg.j.DEFAULT), new Pair("Purple", xjg.j.PURPLE), new Pair("Pink", xjg.j.PINK), new Pair("Teal", xjg.j.TEAL), new Pair("Orange", xjg.j.ORANGE), new Pair("Deep Blue", xjg.j.DEEP_BLUE), new Pair("Dynamic", xjg.j.DYNAMIC), new Pair("Cyberpunk", xjg.j.CYBERPUNK));
    }

    private a() {
    }
}
