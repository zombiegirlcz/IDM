package ald;

import com.revolut.feature.slot_manager.api.model.SlotContext;
import com.revolut.feature.slot_manager.impl.network.SlotManagerService;
import java.util.Optional;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qe0.s;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes13.dex */
public final class r {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SlotManagerService f6243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f6244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.j f6245c;
    public final ue0.c d;
    public final yqb.b e;
    public final yqb.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Optional f6246g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final s f6247h;
    public final x4l.c i;

    public r(SlotManagerService service, h slotActionsSender, ne0.j memoryCache, ue0.c storage, yqb.b screenMapper, yqb.a screenDependenciesProvider, Optional slotManagerHeadersProvider, ze0.a forceReloadStrategyFactory) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(slotActionsSender, "slotActionsSender");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter("", "basePath");
        Intrinsics.checkNotNullParameter(screenMapper, "screenMapper");
        Intrinsics.checkNotNullParameter(screenDependenciesProvider, "screenDependenciesProvider");
        Intrinsics.checkNotNullParameter(slotManagerHeadersProvider, "slotManagerHeadersProvider");
        Intrinsics.checkNotNullParameter(forceReloadStrategyFactory, "forceReloadStrategyFactory");
        this.f6243a = service;
        this.f6244b = slotActionsSender;
        this.f6245c = memoryCache;
        this.d = storage;
        this.e = screenMapper;
        this.f = screenDependenciesProvider;
        this.f6246g = slotManagerHeadersProvider;
        this.f6247h = ((ze0.c) forceReloadStrategyFactory).b(5000L);
        Continuation continuation = null;
        this.i = new x4l.c(new n(this, continuation, 0), new o(1, this, r.class, "cachedDataFromMemory", "cachedDataFromMemory(Lcom/revolut/feature/slot_manager/api/model/SlotContext;)Lcom/revolut/feature/slot_manager/impl/model/SlotsData;", 0, 0), new ack.f(this, 27), new p(this, continuation, 0), new q(this, continuation, 0), new af4.e(this, continuation, 22));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00fc -> B:36:0x00fd). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(ald.r r9, com.revolut.feature.slot_manager.api.model.SlotContext r10, kotlin.jvm.functions.Function2 r11, gim.c r12) {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ald.r.a(ald.r, com.revolut.feature.slot_manager.api.model.SlotContext, kotlin.jvm.functions.Function2, gim.c):java.lang.Object");
    }

    public final String b(SlotContext slotContext) {
        return com.google.android.gms.internal.mlkit_vision_face.a.o(this.e.b(slotContext.getF87254a()), "-", d0.k0(slotContext.getF87255b(), ", ", null, null, 0, null, 62));
    }

    public final vkm.d c(SlotContext slotContext, boolean z) {
        Intrinsics.checkNotNullParameter(slotContext, "slotContext");
        return this.i.b(slotContext, this.f6247h.a(b(slotContext), z) ? w4l.i.f294643c : w4l.h.f294642c);
    }

    public final Object d(tkd.e eVar, gim.c cVar) {
        h hVar = this.f6244b;
        hVar.getClass();
        Object objB = hVar.b(u.c(eVar), cVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objB != aVar) {
            objB = Unit.f186387a;
        }
        return objB == aVar ? objB : Unit.f186387a;
    }
}
