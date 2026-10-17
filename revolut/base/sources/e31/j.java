package e31;

import ald.n;
import com.revolut.data.network.services.TopupService;
import do3.q;
import dt4.p;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import qe0.o;
import te0.w;

/* JADX INFO: loaded from: classes.dex */
public final class j implements w71.b {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue0.c f122180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TopupService f122181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zk0.b f122182c;
    public final CoroutineScope d;
    public final ihm.j e;
    public final ihm.j f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ConcurrentHashMap f122183g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o f122184h;

    public j(ue0.c storage, lfm.c dataCompositeDisposable, TopupService topupService, zk0.b fileSystemRepository, CoroutineScope appCoroutineScope) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(dataCompositeDisposable, "dataCompositeDisposable");
        Intrinsics.checkNotNullParameter(topupService, "topupService");
        Intrinsics.checkNotNullParameter(fileSystemRepository, "fileSystemRepository");
        Intrinsics.checkNotNullParameter(appCoroutineScope, "appCoroutineScope");
        this.f122180a = storage;
        this.f122181b = topupService;
        this.f122182c = fileSystemRepository;
        this.d = appCoroutineScope;
        ihm.f fVar = new ihm.f();
        w.x(fVar, dataCompositeDisposable);
        ihm.j jVarD = fVar.d();
        Intrinsics.checkNotNullExpressionValue(jVarD, "toSerialized(...)");
        this.e = jVarD;
        ihm.f fVar2 = new ihm.f();
        w.x(fVar2, dataCompositeDisposable);
        ihm.j jVarD2 = fVar2.d();
        Intrinsics.checkNotNullExpressionValue(jVarD2, "toSerialized(...)");
        this.f = jVarD2;
        this.f122183g = new ConcurrentHashMap();
        this.f122184h = q.f(new x4l.c(new n(this, null, 3), new e2j.j(this, 3), new p(this, 25), new i(0), new a19.e(27)), appCoroutineScope);
    }
}
