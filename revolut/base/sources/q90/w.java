package q90;

import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class w {

    @NotNull
    public static final b Companion = new b(0);

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u0011\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0006\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\u000e\u0010\t¨\u0006\u0015"}, d2 = {"Lq90/w$a;", "Lq90/w;", "", "toString", "()Ljava/lang/String;", "", "a", "Z", "b", "()Z", "fromInclusive", "e", "toInclusive", "Lq90/x;", "c", "Lq90/x;", "()Lq90/x;", "from", "d", "to", "negated", "core_backend_flow_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a extends w {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("fromInclusive")
        private final boolean fromInclusive;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("toInclusive")
        private final boolean toInclusive;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("from")
        @NotNull
        private final x from;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("to")
        @NotNull
        private final x to;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("negated")
        private final boolean negated;

        public a(boolean z, boolean z3, x from, x to6, boolean z4) {
            Intrinsics.checkNotNullParameter(from, "from");
            Intrinsics.checkNotNullParameter(to6, "to");
            this.fromInclusive = z;
            this.toInclusive = z3;
            this.from = from;
            this.to = to6;
            this.negated = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final x getFrom() {
            return this.from;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getFromInclusive() {
            return this.fromInclusive;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getNegated() {
            return this.negated;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final x getTo() {
            return this.to;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getToInclusive() {
            return this.toInclusive;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return this.fromInclusive == aVar.fromInclusive && this.toInclusive == aVar.toInclusive && Intrinsics.f(this.from, aVar.from) && Intrinsics.f(this.to, aVar.to) && this.negated == aVar.negated;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.negated) + ((this.to.hashCode() + ((this.from.hashCode() + j6.a.c(Boolean.hashCode(this.fromInclusive) * 31, 31, this.toInclusive)) * 31)) * 31);
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class b {
        private b() {
        }

        public b(int i) {
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u0006\u0010\r¨\u0006\u000f"}, d2 = {"Lq90/w$c;", "Lq90/w;", "", "toString", "()Ljava/lang/String;", "Lq90/x;", "a", "Lq90/x;", "b", "()Lq90/x;", "value", "", "Z", "()Z", "negated", "core_backend_flow_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c extends w {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("value")
        @NotNull
        private final x value;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("negated")
        private final boolean negated;

        public c(x value, boolean z) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
            this.negated = z;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getNegated() {
            return this.negated;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final x getValue() {
            return this.value;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof c)) {
                return false;
            }
            c cVar = (c) obj2;
            return Intrinsics.f(this.value, cVar.value) && this.negated == cVar.negated;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.negated) + (this.value.hashCode() * 31);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u0006\u0010\r¨\u0006\u000f"}, d2 = {"Lq90/w$d;", "Lq90/w;", "", "toString", "()Ljava/lang/String;", "Lq90/x;", "a", "Lq90/x;", "b", "()Lq90/x;", "value", "", "Z", "()Z", "negated", "core_backend_flow_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class d extends w {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("value")
        @NotNull
        private final x value;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("negated")
        private final boolean negated;

        public d(x value, boolean z) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
            this.negated = z;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getNegated() {
            return this.negated;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final x getValue() {
            return this.value;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof d)) {
                return false;
            }
            d dVar = (d) obj2;
            return Intrinsics.f(this.value, dVar.value) && this.negated == dVar.negated;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.negated) + (this.value.hashCode() * 31);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000f\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\r\u001a\u0004\b\u0007\u0010\u000e¨\u0006\u0010"}, d2 = {"Lq90/w$e;", "Lq90/w;", "", "toString", "()Ljava/lang/String;", "", "Lq90/x;", "a", "Ljava/util/Set;", "b", "()Ljava/util/Set;", "values", "", "Z", "()Z", "negated", "core_backend_flow_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class e extends w {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("values")
        @NotNull
        private final Set<x> values;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("negated")
        private final boolean negated;

        public e(Set values, boolean z) {
            Intrinsics.checkNotNullParameter(values, "values");
            this.values = values;
            this.negated = z;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getNegated() {
            return this.negated;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Set getValues() {
            return this.values;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof e)) {
                return false;
            }
            e eVar = (e) obj2;
            return Intrinsics.f(this.values, eVar.values) && this.negated == eVar.negated;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.negated) + (this.values.hashCode() * 31);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u0006\u0010\r¨\u0006\u000f"}, d2 = {"Lq90/w$f;", "Lq90/w;", "", "toString", "()Ljava/lang/String;", "Lq90/x;", "a", "Lq90/x;", "b", "()Lq90/x;", "value", "", "Z", "()Z", "negated", "core_backend_flow_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class f extends w {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("value")
        @NotNull
        private final x value;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("negated")
        private final boolean negated;

        public f(x value, boolean z) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
            this.negated = z;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getNegated() {
            return this.negated;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final x getValue() {
            return this.value;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof f)) {
                return false;
            }
            f fVar = (f) obj2;
            return Intrinsics.f(this.value, fVar.value) && this.negated == fVar.negated;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.negated) + (this.value.hashCode() * 31);
        }
    }

    private w() {
    }
}
