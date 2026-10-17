package qr3;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\t\u0005\u000b\f\r\u000e\u000f\u0010\u0011\u0012B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\t\u0082\u0001\t\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lqr3/e;", "", "<init>", "()V", "Lqr3/g;", "a", "Lqr3/g;", "()Lqr3/g;", "setType", "(Lqr3/g;)V", "type", "d", "e", "f", "b", "g", "c", "h", "i", "Lqr3/e$a;", "Lqr3/e$b;", "Lqr3/e$c;", "Lqr3/e$d;", "Lqr3/e$e;", "Lqr3/e$f;", "Lqr3/e$g;", "Lqr3/e$h;", "Lqr3/e$i;", "feature_credit_application_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    @NotNull
    private qr3.g type;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\n"}, d2 = {"Lqr3/e$a;", "Lqr3/e;", "", "toString", "()Ljava/lang/String;", "Lqr3/a;", "b", "Lqr3/a;", "()Lqr3/a;", "metadata", "feature_credit_application_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a extends e {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("metadata")
        @NotNull
        private final qr3.a metadata;

        /* JADX INFO: renamed from: b, reason: from getter */
        public final qr3.a getMetadata() {
            return this.metadata;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && Intrinsics.f(this.metadata, ((a) obj2).metadata);
        }

        public final int hashCode() {
            return this.metadata.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqr3/e$b;", "Lqr3/e;", "<init>", "()V", "feature_credit_application_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b extends e {
        public b() {
            super(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqr3/e$c;", "Lqr3/e;", "<init>", "()V", "feature_credit_application_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c extends e {
        public c() {
            super(0);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\n"}, d2 = {"Lqr3/e$d;", "Lqr3/e;", "", "toString", "()Ljava/lang/String;", "Lqr3/b;", "b", "Lqr3/b;", "()Lqr3/b;", "metadata", "feature_credit_application_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class d extends e {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("metadata")
        @NotNull
        private final qr3.b metadata;

        /* JADX INFO: renamed from: b, reason: from getter */
        public final qr3.b getMetadata() {
            return this.metadata;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof d) && Intrinsics.f(this.metadata, ((d) obj2).metadata);
        }

        public final int hashCode() {
            return this.metadata.hashCode();
        }
    }

    /* JADX INFO: renamed from: qr3.e$e, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\n"}, d2 = {"Lqr3/e$e;", "Lqr3/e;", "", "toString", "()Ljava/lang/String;", "Lqr3/c;", "b", "Lqr3/c;", "()Lqr3/c;", "metadata", "feature_credit_application_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C1359e extends e {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("metadata")
        @NotNull
        private final qr3.c metadata;

        /* JADX INFO: renamed from: b, reason: from getter */
        public final qr3.c getMetadata() {
            return this.metadata;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof C1359e) && Intrinsics.f(this.metadata, ((C1359e) obj2).metadata);
        }

        public final int hashCode() {
            return this.metadata.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqr3/e$f;", "Lqr3/e;", "<init>", "()V", "feature_credit_application_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class f extends e {
        public f() {
            super(0);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\n"}, d2 = {"Lqr3/e$g;", "Lqr3/e;", "", "toString", "()Ljava/lang/String;", "Lqr3/b;", "b", "Lqr3/b;", "()Lqr3/b;", "metadata", "feature_credit_application_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class g extends e {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("metadata")
        @NotNull
        private final qr3.b metadata;

        /* JADX INFO: renamed from: b, reason: from getter */
        public final qr3.b getMetadata() {
            return this.metadata;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof g) && Intrinsics.f(this.metadata, ((g) obj2).metadata);
        }

        public final int hashCode() {
            return this.metadata.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqr3/e$h;", "Lqr3/e;", "<init>", "()V", "feature_credit_application_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class h extends e {
        public h() {
            super(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqr3/e$i;", "Lqr3/e;", "<init>", "()V", "feature_credit_application_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class i extends e {
        public i() {
            super(0);
        }
    }

    public /* synthetic */ e(int i2) {
        this();
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final qr3.g getType() {
        return this.type;
    }

    private e() {
        this.type = qr3.g.INFORMATIVE;
    }
}
