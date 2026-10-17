package pza;

import akl.t;
import com.revolut.feature.remote_stories.impl.network.RemoteStoryService;
import com.youTransactor.uCube.rpc.Constants;
import efm.d0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import te0.w;

/* JADX INFO: loaded from: classes13.dex */
public final class l {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RemoteStoryService f240930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f240931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.j f240932c;
    public final w4l.f d;

    public l(RemoteStoryService service, b80.c networkStateRepository, ue0.c storage, ne0.j memoryCache, hza.a storiesOptimisationsExperimentProvider) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(networkStateRepository, "networkStateRepository");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storiesOptimisationsExperimentProvider, "storiesOptimisationsExperimentProvider");
        this.f240930a = service;
        this.f240931b = storage;
        this.f240932c = memoryCache;
        final int i = 0;
        final int i2 = 1;
        this.d = new w4l.f(w.k0(networkStateRepository, new Function1(this) { // from class: pza.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f240929b;

            {
                this.f240929b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i3 = i;
                l lVar = this.f240929b;
                Unit it8 = (Unit) obj2;
                switch (i3) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<oza.i> storiesListWithUpdateTimestamps = lVar.f240930a.getStoriesListWithUpdateTimestamps();
                        k kVar = k.f;
                        pd.h hVar = new pd.h(6);
                        storiesListWithUpdateTimestamps.getClass();
                        ufm.i iVar = new ufm.i(storiesListWithUpdateTimestamps, hVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) lVar.f240932c.get("remoteStoriesLastUpdatedTimestampsCache");
                }
            }
        }), new Function1(this) { // from class: pza.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f240929b;

            {
                this.f240929b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i3 = i2;
                l lVar = this.f240929b;
                Unit it8 = (Unit) obj2;
                switch (i3) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<oza.i> storiesListWithUpdateTimestamps = lVar.f240930a.getStoriesListWithUpdateTimestamps();
                        k kVar = k.f;
                        pd.h hVar = new pd.h(6);
                        storiesListWithUpdateTimestamps.getClass();
                        ufm.i iVar = new ufm.i(storiesListWithUpdateTimestamps, hVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) lVar.f240932c.get("remoteStoriesLastUpdatedTimestampsCache");
                }
            }
        }, new t(this, 6), null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
    }
}
