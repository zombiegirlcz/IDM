package ald;

import com.revolut.feature.slot_manager.api.model.checklist.SlotChecklist;
import com.revolut.feature.slot_manager.api.model.checklist.SlotChecklistFetchConfig;
import com.revolut.feature.slot_manager.impl.network.SlotManagerService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SlotManagerService f6216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f6217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f6218c;
    public final x4l.c d;

    public a(SlotManagerService service, ne0.j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter("", "basePath");
        this.f6216a = service;
        this.f6217b = memoryCache;
        this.f6218c = storage;
        Continuation continuation = null;
        this.d = new x4l.c(new a72.k(this, continuation, 5), new afa.q(this, 23), new ack.f(this, 26), new af4.e(this, continuation, 21), new a0e.o(this, continuation, 5));
    }

    public static String a(String str, String str2) {
        return com.google.android.gms.internal.mlkit_vision_face.a.o(str, "-", str2);
    }

    public final SlotChecklist b(String campaignId, String str) {
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        String strA = a(campaignId, str);
        ne0.j jVar = this.f6217b;
        SlotChecklist slotChecklist = (SlotChecklist) jVar.get(strA);
        if (slotChecklist != null) {
            return slotChecklist;
        }
        SlotChecklist slotChecklist2 = (SlotChecklist) j6.a.k(SlotChecklist.class, this.f6218c, strA);
        if (slotChecklist2 == null) {
            return null;
        }
        jVar.f(strA, slotChecklist2);
        return slotChecklist2;
    }

    public final vkm.d c(SlotChecklistFetchConfig fetchConfig) {
        Intrinsics.checkNotNullParameter(fetchConfig, "fetchConfig");
        w4l.i loadingStrategy = w4l.i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return this.d.b(fetchConfig, loadingStrategy);
    }
}
