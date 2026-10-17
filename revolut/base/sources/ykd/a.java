package ykd;

import com.revolut.feature.slot_manager.impl.network.SlotManagerService;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import tkd.h;
import vf0.q;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements SlotManagerService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SlotManagerService f314605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SlotManagerService f314606b;

    public a(SlotManagerService legacyService, SlotManagerService migratedService, q apiMigrationToggleResolver) {
        Intrinsics.checkNotNullParameter(legacyService, "legacyService");
        Intrinsics.checkNotNullParameter(migratedService, "migratedService");
        Intrinsics.checkNotNullParameter(apiMigrationToggleResolver, "apiMigrationToggleResolver");
        this.f314605a = legacyService;
        this.f314606b = migratedService;
    }

    @Override // com.revolut.feature.slot_manager.impl.network.SlotManagerService
    public final Object getChecklist(String str, String str2, String str3, String str4, Continuation continuation) {
        return this.f314605a.getChecklist(str, str2, str3, str4, continuation);
    }

    @Override // com.revolut.feature.slot_manager.impl.network.SlotManagerService
    public final Object getSlots(String str, String str2, Set set, Map map, Continuation continuation) {
        return this.f314605a.getSlots(str, str2, set, map, continuation);
    }

    @Override // com.revolut.feature.slot_manager.impl.network.SlotManagerService
    public final Object sendActions(String str, h hVar, Continuation continuation) {
        Object objSendActions = this.f314605a.sendActions(str, hVar, continuation);
        return objSendActions == fim.a.COROUTINE_SUSPENDED ? objSendActions : Unit.f186387a;
    }
}
