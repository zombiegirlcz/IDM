package com.fourthline.orca.internal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public interface g6 {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0011B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0011\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/fourthline/orca/internal/g6$a;", "", "", "provider", "Lcom/fourthline/orca/internal/b6;", "values", "<init>", "(Ljava/lang/String;Lcom/fourthline/orca/internal/b6;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getProvider", "b", "Lcom/fourthline/orca/internal/b6;", "()Lcom/fourthline/orca/internal/b6;", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g(with = f6.class)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String provider;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final b6 values;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.g6$a$a, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return f6.f28345a;
            }

            private Companion() {
            }
        }

        public a(String provider, b6 values) {
            Intrinsics.checkNotNullParameter(provider, "provider");
            Intrinsics.checkNotNullParameter(values, "values");
            this.provider = provider;
            this.values = values;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final b6 getValues() {
            return this.values;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return Intrinsics.f(this.provider, aVar.provider) && Intrinsics.f(this.values, aVar.values);
        }

        public int hashCode() {
            return (this.provider.hashCode() * 31) + this.values.hashCode();
        }

        public String toString() {
            return "BavStartPaymentResult(provider=" + this.provider + ", values=" + this.values + ")";
        }
    }

    public interface b {

        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f28765a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f28766b;

            public a(String workflowId, String redirectUrl) {
                Intrinsics.checkNotNullParameter(workflowId, "workflowId");
                Intrinsics.checkNotNullParameter(redirectUrl, "redirectUrl");
                this.f28765a = workflowId;
                this.f28766b = redirectUrl;
            }

            @Override // com.fourthline.orca.internal.g6.b
            public String a() {
                return this.f28765a;
            }

            public final String b() {
                return this.f28766b;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof a)) {
                    return false;
                }
                a aVar = (a) obj2;
                return Intrinsics.f(this.f28765a, aVar.f28765a) && Intrinsics.f(this.f28766b, aVar.f28766b);
            }

            public int hashCode() {
                return (this.f28765a.hashCode() * 31) + this.f28766b.hashCode();
            }

            public String toString() {
                return "Online(workflowId=" + this.f28765a + ", redirectUrl=" + this.f28766b + ")";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.g6$b$b, reason: collision with other inner class name */
        public static final class C0202b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f28767a;

            public C0202b(String workflowId) {
                Intrinsics.checkNotNullParameter(workflowId, "workflowId");
                this.f28767a = workflowId;
            }

            @Override // com.fourthline.orca.internal.g6.b
            public String a() {
                return this.f28767a;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof C0202b) && Intrinsics.f(this.f28767a, ((C0202b) obj2).f28767a);
            }

            public int hashCode() {
                return this.f28767a.hashCode();
            }

            public String toString() {
                return "Sepa(workflowId=" + this.f28767a + ")";
            }
        }

        String a();
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a f28768a;

        public c(a result) {
            Intrinsics.checkNotNullParameter(result, "result");
            this.f28768a = result;
        }

        public final a a() {
            return this.f28768a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof c) && Intrinsics.f(this.f28768a, ((c) obj2).f28768a);
        }

        public int hashCode() {
            return this.f28768a.hashCode();
        }

        public String toString() {
            return "Output(result=" + this.f28768a + ")";
        }
    }

    Object a(b bVar, Continuation continuation);
}
