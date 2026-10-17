package qzf;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0004\u0005\u0007\n\tJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012R\u001a\u0010\u001d\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\"\u001a\u00020\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010 \u001a\u0004\b\u0019\u0010!R\u001c\u0010&\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010$\u001a\u0004\b\u0005\u0010%R\"\u0010(\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012¨\u0006)"}, d2 = {"Lqzf/j;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "id", "b", "d", "label", "g", "type", "", "Lqzf/j$a;", "Ljava/util/List;", "h", "()Ljava/util/List;", "units", "Lqzf/j$d;", "e", "j", "values", "Lqzf/j$c;", "f", "Lqzf/j$c;", "i", "()Lqzf/j$c;", "validation", "group", "", "Z", "()Z", "required", "Lqzf/j$b;", "Lqzf/j$b;", "()Lqzf/j$b;", "category", "Lqzf/n0;", "prerequisites", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("label")
    @NotNull
    private final String label;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("units")
    private final List<a> units;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("values")
    private final List<d> values;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("validation")
    @NotNull
    private final c validation;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("grouping")
    @NotNull
    private final String group;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("required")
    private final boolean required;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("category")
    private final b category;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("prerequisites")
    private final List<n0> prerequisites;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lqzf/j$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "id", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        @NotNull
        private final String id;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && Intrinsics.f(this.id, ((a) obj2).id);
        }

        public final int hashCode() {
            return this.id.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\b\u0010\u0004¨\u0006\n"}, d2 = {"Lqzf/j$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "id", "b", "label", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("label")
        private final String label;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.id, bVar.id) && Intrinsics.f(this.label, bVar.label);
        }

        public final int hashCode() {
            String str = this.id;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.label;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\n"}, d2 = {"Lqzf/j$c;", "", "", "toString", "()Ljava/lang/String;", "", "a", "I", "()I", "length", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("length")
        private final int length;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getLength() {
            return this.length;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof c) && this.length == ((c) obj2).length;
        }

        public final int hashCode() {
            return Integer.hashCode(this.length);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\t\u0010\u000e¨\u0006\u0010"}, d2 = {"Lqzf/j$d;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "value", "b", "label", "", "Lqzf/n0;", "Ljava/util/List;", "()Ljava/util/List;", "prerequisites", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("value")
        @NotNull
        private final String value;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("label")
        @NotNull
        private final String label;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("prerequisites")
        private final List<n0> prerequisites;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final List getPrerequisites() {
            return this.prerequisites;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getValue() {
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
            return Intrinsics.f(this.value, dVar.value) && Intrinsics.f(this.label, dVar.label) && Intrinsics.f(this.prerequisites, dVar.prerequisites);
        }

        public final int hashCode() {
            int iC = p.a.c(this.value.hashCode() * 31, 31, this.label);
            List<n0> list = this.prerequisites;
            return iC + (list == null ? 0 : list.hashCode());
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final b getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getGroup() {
        return this.group;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final List getPrerequisites() {
        return this.prerequisites;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.id, jVar.id) && Intrinsics.f(this.label, jVar.label) && Intrinsics.f(this.type, jVar.type) && Intrinsics.f(this.units, jVar.units) && Intrinsics.f(this.values, jVar.values) && Intrinsics.f(this.validation, jVar.validation) && Intrinsics.f(this.group, jVar.group) && this.required == jVar.required && Intrinsics.f(this.category, jVar.category) && Intrinsics.f(this.prerequisites, jVar.prerequisites);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getRequired() {
        return this.required;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final List getUnits() {
        return this.units;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.label), 31, this.type);
        List<a> list = this.units;
        int iHashCode = (iC + (list == null ? 0 : list.hashCode())) * 31;
        List<d> list2 = this.values;
        int iC2 = j6.a.c(p.a.c((this.validation.hashCode() + ((iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31)) * 31, 31, this.group), 31, this.required);
        b bVar = this.category;
        int iHashCode2 = (iC2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        List<n0> list3 = this.prerequisites;
        return iHashCode2 + (list3 != null ? list3.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final c getValidation() {
        return this.validation;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final List getValues() {
        return this.values;
    }
}
