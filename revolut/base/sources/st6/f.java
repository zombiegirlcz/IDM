package st6;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f {

    @NotNull
    public static final b Companion = new b();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\n"}, d2 = {"Lst6/f$a;", "Lst6/f;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "verificationType", "formId", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("verificationType")
        @NotNull
        private final String verificationType;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("formId")
        @NotNull
        private final String formId;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getFormId() {
            return this.formId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getVerificationType() {
            return this.verificationType;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.verificationType, aVar.verificationType) && Intrinsics.f(this.formId, aVar.formId);
        }

        public final int hashCode() {
            return this.formId.hashCode() + (this.verificationType.hashCode() * 31);
        }
    }

    public static final class b {
        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004¨\u0006\t"}, d2 = {"Lst6/f$c;", "Lst6/f;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getVerificationType", "verificationType", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("verificationType")
        @NotNull
        private final String verificationType;

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof c) && Intrinsics.f(this.verificationType, ((c) obj2).verificationType);
        }

        public final int hashCode() {
            return this.verificationType.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lst6/f$d;", "Lst6/f;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "verificationType", "", "Z", "()Z", "mandatory", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class d extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("verificationType")
        @NotNull
        private final String verificationType;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("mandatory")
        private final boolean mandatory;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getMandatory() {
            return this.mandatory;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getVerificationType() {
            return this.verificationType;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof d)) {
                return false;
            }
            d dVar = (d) obj2;
            return Intrinsics.f(this.verificationType, dVar.verificationType) && this.mandatory == dVar.mandatory;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.mandatory) + (this.verificationType.hashCode() * 31);
        }
    }

    private f() {
    }
}
