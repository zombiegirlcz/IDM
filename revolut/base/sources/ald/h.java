package ald;

import akb.s;
import androidx.room.util.DBUtil;
import com.revolut.feature.slot_manager.impl.network.SlotManagerService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes13.dex */
public final class h {

    @NotNull
    private static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SlotManagerService f6226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final okd.b f6227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b80.c f6228c;
    public final CoroutineScope d;
    public final HashSet e;

    public h(SlotManagerService slotManagerService, okd.b slotActionsDao, b80.c networkStateRepository, CoroutineScope appCoroutineScope) {
        Intrinsics.checkNotNullParameter(slotManagerService, "slotManagerService");
        Intrinsics.checkNotNullParameter(slotActionsDao, "slotActionsDao");
        Intrinsics.checkNotNullParameter(networkStateRepository, "networkStateRepository");
        Intrinsics.checkNotNullParameter("", "basePath");
        Intrinsics.checkNotNullParameter(appCoroutineScope, "appCoroutineScope");
        this.f6226a = slotManagerService;
        this.f6227b = slotActionsDao;
        this.f6228c = networkStateRepository;
        this.d = appCoroutineScope;
        this.e = new HashSet();
        p0 p0Var = p0.f264001a;
        e0.C(appCoroutineScope, elm.f.f127540b, null, new s(this, null, 5), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(ald.h r9, java.util.List r10, kotlin.coroutines.Continuation r11) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ald.h.a(ald.h, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object b(List list, gim.c cVar) {
        ArrayList arrayListP = ue0.e.P(list);
        okd.b bVar = this.f6227b;
        bVar.getClass();
        Object objPerformSuspending = DBUtil.performSuspending(bVar.f225989a, false, true, new okd.a(bVar, arrayListP, 0), cVar);
        return objPerformSuspending == fim.a.COROUTINE_SUSPENDED ? objPerformSuspending : Unit.f186387a;
    }
}
