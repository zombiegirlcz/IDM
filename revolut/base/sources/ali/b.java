package ali;

import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vkm.q;
import vkm.z1;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function2 f6269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z1 f6270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f6271c;

    public b(Function2 controllersFactory) {
        Intrinsics.checkNotNullParameter(controllersFactory, "controllersFactory");
        this.f6269a = controllersFactory;
        this.f6270b = q.b(0, 2, ukm.f.DROP_OLDEST);
        this.f6271c = new LinkedHashMap();
    }
}
