package com.fourthline.orca.internal;

import com.fourthline.orca.internal.qg0;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class ub1 implements qg0 {

    public interface a extends qg0.a {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.ub1$a$a, reason: collision with other inner class name */
        public static final class C0292a implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final C0292a f33993b = new C0292a();

            private C0292a() {
            }

            public boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof C0292a);
            }

            @Override // com.fourthline.orca.internal.ub1.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.ub1.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }

            public int hashCode() {
                return 1611946387;
            }

            public String toString() {
                return "OnBackButtonClicked";
            }
        }

        public static final class b implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final b f33994b = new b();

            private b() {
            }

            public boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof b);
            }

            @Override // com.fourthline.orca.internal.ub1.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.ub1.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }

            public int hashCode() {
                return 342567881;
            }

            public String toString() {
                return "OnEnterScreen";
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

    private final void b() {
        jr0.a(jr0.f30017a, "upload_idv", null, 2, null);
    }

    private final void c() {
        jr0.c(jr0.f30017a, "upload_idv", null, 2, null);
    }

    @Override // com.fourthline.orca.internal.qg0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void track(a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof a.b) {
            c();
        } else {
            if (!(event instanceof a.C0292a)) {
                throw new NoWhenBranchMatchedException();
            }
            b();
        }
    }
}
