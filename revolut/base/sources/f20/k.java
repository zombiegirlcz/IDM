package f20;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.Instant;

/* JADX INFO: loaded from: classes19.dex */
public abstract class k {

    @NotNull
    public static final b Companion = new b();

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\n"}, d2 = {"Lf20/k$a;", "Lf20/k;", "", "toString", "()Ljava/lang/String;", "Lf20/k$a$a;", "a", "Lf20/k$a$a;", "()Lf20/k$a$a;", "presenceState", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("presenceState")
        private final C0769a presenceState;

        /* JADX INFO: renamed from: f20.k$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lf20/k$a$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "value", "Lorg/joda/time/Instant;", "Lorg/joda/time/Instant;", "()Lorg/joda/time/Instant;", "availableAt", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C0769a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("value")
            private final String value;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("availableAt")
            private final Instant availableAt;

            /* JADX INFO: renamed from: a, reason: from getter */
            public final Instant getAvailableAt() {
                return this.availableAt;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getValue() {
                return this.value;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof C0769a)) {
                    return false;
                }
                C0769a c0769a = (C0769a) obj2;
                return Intrinsics.f(this.value, c0769a.value) && Intrinsics.f(this.availableAt, c0769a.availableAt);
            }

            public final int hashCode() {
                String str = this.value;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Instant instant = this.availableAt;
                return iHashCode + (instant != null ? instant.hashCode() : 0);
            }
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C0769a getPresenceState() {
            return this.presenceState;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && Intrinsics.f(this.presenceState, ((a) obj2).presenceState);
        }

        public final int hashCode() {
            C0769a c0769a = this.presenceState;
            if (c0769a == null) {
                return 0;
            }
            return c0769a.hashCode();
        }
    }

    public static final class b {
        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lf20/k$c;", "Lf20/k;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "message", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("message")
        @NotNull
        private final String message;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof c) && Intrinsics.f(this.message, ((c) obj2).message);
        }

        public final int hashCode() {
            return this.message.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf20/k$d;", "Lf20/k;", "<init>", "()V", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d extends k {
        private d() {
        }
    }

    private k() {
    }
}
