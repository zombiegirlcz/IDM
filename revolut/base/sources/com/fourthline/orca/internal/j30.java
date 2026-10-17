package com.fourthline.orca.internal;

import com.fourthline.orca.internal.qg0;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class j30 implements qg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f29790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final sg0 f29791b;

    public interface a extends qg0.a {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.j30$a$a, reason: collision with other inner class name */
        public static final class C0221a implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final C0221a f29792b = new C0221a();

            private C0221a() {
            }

            public boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof C0221a);
            }

            @Override // com.fourthline.orca.internal.j30.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.j30.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }

            public int hashCode() {
                return 621229541;
            }

            public String toString() {
                return "OnBackButtonClicked";
            }
        }

        public static final class b implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final b f29793b = new b();

            private b() {
            }

            public boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof b);
            }

            @Override // com.fourthline.orca.internal.j30.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.j30.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }

            public int hashCode() {
                return -830067301;
            }

            public String toString() {
                return "OnEnterScreen";
            }
        }

        public static final class c implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final c f29794b = new c();

            private c() {
            }

            public boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof c);
            }

            @Override // com.fourthline.orca.internal.j30.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.j30.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }

            public int hashCode() {
                return -1022303399;
            }

            public String toString() {
                return "OnNextButtonClicked";
            }
        }

        @Override // com.fourthline.orca.internal.qg0.a, ib.f
        @NotNull
        default Map getAttributes() {
            return zhm.r0.g();
        }

        @Override // com.fourthline.orca.internal.qg0.a, ib.f
        @NotNull
        /* bridge */ /* synthetic */ default String getSchema() {
            return "";
        }
    }

    public j30(String flow, sg0 tracker) {
        Intrinsics.checkNotNullParameter(flow, "flow");
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f29790a = flow;
        this.f29791b = tracker;
    }

    private final void b() {
        jr0.a(jr0.f30017a, this.f29790a + "_intro", null, 2, null);
        this.f29791b.a(new xc1(null, 1, null));
    }

    private final void c() {
        jr0.c(jr0.f30017a, this.f29790a + "_intro", null, 2, null);
    }

    private final void d() {
        jr0.b(jr0.f30017a, this.f29790a + "_intro", null, 2, null);
        this.f29791b.a(new zc1(null, 1, null));
    }

    @Override // com.fourthline.orca.internal.qg0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void track(a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof a.C0221a) {
            b();
        } else if (event instanceof a.b) {
            c();
        } else {
            if (!(event instanceof a.c)) {
                throw new NoWhenBranchMatchedException();
            }
            d();
        }
    }
}
