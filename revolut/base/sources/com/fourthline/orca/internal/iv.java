package com.fourthline.orca.internal;

import com.fourthline.core.eid.EidAuthEvent;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface iv {

    public interface a {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.iv$a$a, reason: collision with other inner class name */
        public static final class C0220a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final EidAuthEvent f29712a;

            public C0220a(EidAuthEvent eidAuthEvent) {
                Intrinsics.checkNotNullParameter(eidAuthEvent, "eidAuthEvent");
                this.f29712a = eidAuthEvent;
            }

            public final EidAuthEvent a() {
                return this.f29712a;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof C0220a) && Intrinsics.f(this.f29712a, ((C0220a) obj2).f29712a);
            }

            public int hashCode() {
                return this.f29712a.hashCode();
            }

            public String toString() {
                return "Eid(eidAuthEvent=" + this.f29712a + ")";
            }
        }
    }

    Object a(Continuation continuation);
}
