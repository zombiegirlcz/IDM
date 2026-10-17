package com.revolut.core.backend_flow.impl.repository;

import com.revolut.feature.backend_flow.domain.models.BackendFlow;
import gsh.c0;
import java.lang.reflect.Type;
import java.time.Duration;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import l80.e;
import org.jetbrains.annotations.NotNull;
import prk.o;
import ra0.b;
import ra0.d;
import ue0.c;
import ui0.f;
import wim.z;
import zhm.h0;
import zhm.r0;

/* JADX INFO: loaded from: classes19.dex */
public final class a implements b {

    @NotNull
    private static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f51255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f51256b;

    public a(e dateProvider, c storage, f buildVersionCode) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(buildVersionCode, "buildVersionCode");
        this.f51255a = storage;
    }

    @Override // ra0.b
    public final BackendFlow a(UUID sessionId) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        try {
            c();
            return (BackendFlow) this.f51255a.T2("BACKEND_FORM_" + sessionId, z.d(o0.b(BackendFlow.class)));
        } catch (Throwable th10) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, "BackendFlowSessionRepositoryImpl: Couldn't get BackendFlow", th10, h0Var);
            d();
            return null;
        }
    }

    @Override // ra0.b
    public final void b(UUID sessionId, BackendFlow flow) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(flow, "flow");
        try {
            c();
            e();
            f(sessionId, flow);
        } catch (Throwable unused) {
            d();
            f(sessionId, flow);
        }
    }

    public final void c() {
        if (this.f51256b == null) {
            this.f51256b = (Integer) this.f51255a.T2("BACKEND_FORM_STORAGE_VERSION", Integer.class);
        }
        Integer num = this.f51256b;
        if (num != null && num.intValue() == 1030151101) {
            return;
        }
        d();
    }

    public final void d() {
        c cVar = this.f51255a;
        cVar.clear();
        cVar.G(1030151101, "BACKEND_FORM_STORAGE_VERSION", Integer.class);
        this.f51256b = 1030151101;
    }

    public final void e() {
        long millis = Duration.ofDays(7L).toMillis();
        long jCurrentTimeMillis = System.currentTimeMillis();
        c cVar = this.f51255a;
        BackendFlowSessionRepositoryImpl$SessionsMap backendFlowSessionRepositoryImpl$SessionsMap = (BackendFlowSessionRepositoryImpl$SessionsMap) j6.a.k(BackendFlowSessionRepositoryImpl$SessionsMap.class, cVar, "BACKEND_FORM_SESSION_IDS");
        if (backendFlowSessionRepositoryImpl$SessionsMap != null) {
            LinkedHashMap linkedHashMap = backendFlowSessionRepositoryImpl$SessionsMap.f51254a;
            LinkedHashMap linkedHashMapZ = r0.z(linkedHashMap);
            linkedHashMap.forEach(new c0(1, new ra0.c(jCurrentTimeMillis, millis, this, linkedHashMapZ)));
            if (linkedHashMapZ.isEmpty()) {
                d();
            } else if (linkedHashMap.size() != linkedHashMapZ.size()) {
                cVar.G(new BackendFlowSessionRepositoryImpl$SessionsMap(linkedHashMapZ), "BACKEND_FORM_SESSION_IDS", z.d(o0.b(BackendFlowSessionRepositoryImpl$SessionsMap.class)));
            }
        }
    }

    public final void f(UUID uuid, BackendFlow backendFlow) {
        String strR = o.r(uuid, "BACKEND_FORM_");
        Type typeD = z.d(o0.b(BackendFlow.class));
        c cVar = this.f51255a;
        cVar.G(backendFlow, strR, typeD);
        BackendFlowSessionRepositoryImpl$SessionsMap backendFlowSessionRepositoryImpl$SessionsMap = (BackendFlowSessionRepositoryImpl$SessionsMap) cVar.T2("BACKEND_FORM_SESSION_IDS", z.d(o0.b(BackendFlowSessionRepositoryImpl$SessionsMap.class)));
        LinkedHashMap linkedHashMapZ = backendFlowSessionRepositoryImpl$SessionsMap != null ? r0.z(backendFlowSessionRepositoryImpl$SessionsMap.f51254a) : new LinkedHashMap();
        linkedHashMapZ.put(uuid, Long.valueOf(System.currentTimeMillis()));
        cVar.G(new BackendFlowSessionRepositoryImpl$SessionsMap(linkedHashMapZ), "BACKEND_FORM_SESSION_IDS", z.d(o0.b(BackendFlowSessionRepositoryImpl$SessionsMap.class)));
    }
}
