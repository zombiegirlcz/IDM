package androidx.camera.camera2.impl;

import android.view.Surface;
import androidx.camera.camera2.adapter.SessionConfigAdapter;
import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.StreamId;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.DeferrableSurface;
import fim.a;
import gim.d;
import gim.i;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutCancellationException;
import skm.e0;
import yhm.o;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes13.dex */
@d(c = "androidx.camera.camera2.impl.UseCaseSurfaceManager$setupAsync$1$deferred$1", f = "UseCaseSurfaceManager.kt", l = {97}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
public final class UseCaseSurfaceManager$setupAsync$1$deferred$1 extends i implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ List<DeferrableSurface> $deferrableSurfaces;
    final /* synthetic */ CameraGraph $graph;
    final /* synthetic */ SessionConfigAdapter $sessionConfigAdapter;
    final /* synthetic */ Map<DeferrableSurface, StreamId> $surfaceToStreamMap;
    final /* synthetic */ long $timeoutMillis;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ UseCaseSurfaceManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UseCaseSurfaceManager$setupAsync$1$deferred$1(SessionConfigAdapter sessionConfigAdapter, UseCaseSurfaceManager useCaseSurfaceManager, List<? extends DeferrableSurface> list, long j2, Map<DeferrableSurface, StreamId> map, CameraGraph cameraGraph, Continuation<? super UseCaseSurfaceManager$setupAsync$1$deferred$1> continuation) {
        super(2, continuation);
        this.$sessionConfigAdapter = sessionConfigAdapter;
        this.this$0 = useCaseSurfaceManager;
        this.$deferrableSurfaces = list;
        this.$timeoutMillis = j2;
        this.$surfaceToStreamMap = map;
        this.$graph = cameraGraph;
    }

    @Override // gim.a
    public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
        UseCaseSurfaceManager$setupAsync$1$deferred$1 useCaseSurfaceManager$setupAsync$1$deferred$1 = new UseCaseSurfaceManager$setupAsync$1$deferred$1(this.$sessionConfigAdapter, this.this$0, this.$deferrableSurfaces, this.$timeoutMillis, this.$surfaceToStreamMap, this.$graph, continuation);
        useCaseSurfaceManager$setupAsync$1$deferred$1.L$0 = obj2;
        return useCaseSurfaceManager$setupAsync$1$deferred$1;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CoroutineScope coroutineScope;
        a aVar = a.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                o.b(obj2);
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                if (!this.$sessionConfigAdapter.isSessionConfigValid()) {
                    throw new IllegalStateException("Check failed.");
                }
                UseCaseSurfaceManager useCaseSurfaceManager = this.this$0;
                List<DeferrableSurface> list = this.$deferrableSurfaces;
                long j2 = this.$timeoutMillis;
                this.L$0 = coroutineScope2;
                this.label = 1;
                Object surfaces = useCaseSurfaceManager.getSurfaces(list, j2, this);
                if (surfaces == aVar) {
                    return aVar;
                }
                coroutineScope = coroutineScope2;
                obj2 = surfaces;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                coroutineScope = (CoroutineScope) this.L$0;
                o.b(obj2);
            }
            List list2 = (List) obj2;
            if (!e0.y(coroutineScope) || list2.isEmpty()) {
                Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
                if (Logger.isInfoEnabled("CXCP")) {
                    String unused = Camera2Logger.TRUNCATED_TAG;
                    String str = "Failed to get Surfaces: isActive=" + e0.y(coroutineScope) + ", surfaces=" + list2;
                }
                return Boolean.FALSE;
            }
            if (!this.this$0.areValid(list2)) {
                Camera2Logger camera2Logger2 = Camera2Logger.INSTANCE;
                if (Logger.isWarnEnabled("CXCP")) {
                    String unused2 = Camera2Logger.TRUNCATED_TAG;
                }
                this.$sessionConfigAdapter.reportSurfaceInvalid(this.$deferrableSurfaces.get(list2.indexOf(null)));
                return Boolean.FALSE;
            }
            Object obj3 = this.this$0.lock;
            UseCaseSurfaceManager useCaseSurfaceManager2 = this.this$0;
            List<DeferrableSurface> list3 = this.$deferrableSurfaces;
            synchronized (obj3) {
                try {
                    List<DeferrableSurface> list4 = list3;
                    int iB = q0.b(w.t(list4, 10));
                    if (iB < 16) {
                        iB = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                    for (Object obj4 : list4) {
                        Object obj5 = list2.get(list3.indexOf((DeferrableSurface) obj4));
                        if (obj5 == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        linkedHashMap.put((Surface) obj5, obj4);
                    }
                    useCaseSurfaceManager2.configuredSurfaceMap = linkedHashMap;
                    useCaseSurfaceManager2.setSurfaceListener();
                    Unit unit = Unit.f186387a;
                } catch (Throwable th10) {
                    throw th10;
                }
            }
            Map<DeferrableSurface, StreamId> map = this.$surfaceToStreamMap;
            List<DeferrableSurface> list5 = this.$deferrableSurfaces;
            CameraGraph cameraGraph = this.$graph;
            UseCaseSurfaceManager useCaseSurfaceManager3 = this.this$0;
            for (Map.Entry<DeferrableSurface, StreamId> entry : map.entrySet()) {
                int value = entry.getValue().getValue();
                Surface surface = (Surface) list2.get(list5.indexOf(entry.getKey()));
                Camera2Logger camera2Logger3 = Camera2Logger.INSTANCE;
                if (Logger.isDebugEnabled("CXCP")) {
                    String unused3 = Camera2Logger.TRUNCATED_TAG;
                    String str2 = "Configured " + surface + " for " + ((Object) StreamId.m360toStringimpl(value));
                }
                cameraGraph.mo180setSurfaceNYG5g8E(value, surface);
                useCaseSurfaceManager3.inactiveSurfaceCloser.mo12configurehB7JTeY(value, entry.getKey(), cameraGraph);
            }
            Camera2Logger camera2Logger4 = Camera2Logger.INSTANCE;
            if (Logger.isInfoEnabled("CXCP")) {
                String unused4 = Camera2Logger.TRUNCATED_TAG;
            }
            return Boolean.TRUE;
        } catch (DeferrableSurface.SurfaceClosedException e) {
            Camera2Logger camera2Logger5 = Camera2Logger.INSTANCE;
            if (Logger.isWarnEnabled("CXCP")) {
                String unused5 = Camera2Logger.TRUNCATED_TAG;
            }
            SessionConfigAdapter sessionConfigAdapter = this.$sessionConfigAdapter;
            DeferrableSurface deferrableSurface = e.getDeferrableSurface();
            Intrinsics.checkNotNullExpressionValue(deferrableSurface, "getDeferrableSurface(...)");
            sessionConfigAdapter.reportSurfaceInvalid(deferrableSurface);
            return Boolean.FALSE;
        } catch (TimeoutCancellationException unused6) {
            Camera2Logger camera2Logger6 = Camera2Logger.INSTANCE;
            long j3 = this.$timeoutMillis;
            if (Logger.isWarnEnabled("CXCP")) {
                String unused7 = Camera2Logger.TRUNCATED_TAG;
                String str3 = "Failed to get Surfaces within " + j3 + " ms";
            }
            return Boolean.FALSE;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((UseCaseSurfaceManager$setupAsync$1$deferred$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }
}
