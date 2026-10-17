package jc0;

import com.revolut.feature.backend_flow.domain.models.BackendFlowUploadResult;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public abstract class c {
    private c() {
    }

    public static final class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f172686a;

        public a(BackendFlowUploadResult backendFlowUploadResult) {
            this.f172686a = backendFlowUploadResult;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && Intrinsics.f(this.f172686a, ((a) obj2).f172686a);
        }

        public final int hashCode() {
            Object obj2 = this.f172686a;
            if (obj2 == null) {
                return 0;
            }
            return obj2.hashCode();
        }

        public a() {
            this(null);
        }
    }
}
