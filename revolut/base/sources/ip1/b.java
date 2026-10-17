package ip1;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public abstract class b {

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\t\u0010\u0013R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0016\u001a\u0004\b\u0005\u0010\u0017¨\u0006\u0019"}, d2 = {"Lip1/b$a;", "Lip1/b;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "name", "b", "c", "label", "", "Ljava/lang/Boolean;", "e", "()Ljava/lang/Boolean;", "optional", "Lno3/b;", "Lno3/b;", "()Lno3/b;", "defaultValue", "Lyo1/b;", "Lyo1/b;", "()Lyo1/b;", "attributes", "feature_apm_bills_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("name")
        @NotNull
        private final String name;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("label")
        private final String label;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("optional")
        private final Boolean optional;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("defaultValue")
        private final no3.b defaultValue;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("attributes")
        private final yo1.b attributes;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final yo1.b getAttributes() {
            return this.attributes;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final no3.b getDefaultValue() {
            return this.defaultValue;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final Boolean getOptional() {
            return this.optional;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.name, aVar.name) && Intrinsics.f(this.label, aVar.label) && Intrinsics.f(this.optional, aVar.optional) && Intrinsics.f(this.defaultValue, aVar.defaultValue) && Intrinsics.f(this.attributes, aVar.attributes);
        }

        public final int hashCode() {
            int iHashCode = this.name.hashCode() * 31;
            String str = this.label;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.optional;
            int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            no3.b bVar = this.defaultValue;
            int iHashCode4 = (iHashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31;
            yo1.b bVar2 = this.attributes;
            return iHashCode4 + (bVar2 != null ? bVar2.hashCode() : 0);
        }
    }

    /* JADX INFO: renamed from: ip1.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0011\u001a\u0004\b\u0005\u0010\u0012¨\u0006\u0014"}, d2 = {"Lip1/b$b;", "Lip1/b;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "name", "b", "label", "", "Ljava/lang/Boolean;", "d", "()Ljava/lang/Boolean;", "optional", "Lyo1/b;", "Lyo1/b;", "()Lyo1/b;", "attributes", "feature_apm_bills_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C0934b extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("name")
        @NotNull
        private final String name;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("label")
        private final String label;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("optional")
        private final Boolean optional;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("attributes")
        private final yo1.b attributes;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final yo1.b getAttributes() {
            return this.attributes;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Boolean getOptional() {
            return this.optional;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof C0934b)) {
                return false;
            }
            C0934b c0934b = (C0934b) obj2;
            return Intrinsics.f(this.name, c0934b.name) && Intrinsics.f(this.label, c0934b.label) && Intrinsics.f(this.optional, c0934b.optional) && Intrinsics.f(this.attributes, c0934b.attributes);
        }

        public final int hashCode() {
            int iHashCode = this.name.hashCode() * 31;
            String str = this.label;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.optional;
            int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            yo1.b bVar = this.attributes;
            return iHashCode3 + (bVar != null ? bVar.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\u0005\u0010\r¨\u0006\u000f"}, d2 = {"Lip1/b$c;", "Lip1/b;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "name", "b", "label", "Lyo1/b;", "Lyo1/b;", "()Lyo1/b;", "attributes", "feature_apm_bills_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("name")
        @NotNull
        private final String name;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("label")
        @NotNull
        private final String label;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("attributes")
        private final yo1.b attributes;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final yo1.b getAttributes() {
            return this.attributes;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof c)) {
                return false;
            }
            c cVar = (c) obj2;
            return Intrinsics.f(this.name, cVar.name) && Intrinsics.f(this.label, cVar.label) && Intrinsics.f(this.attributes, cVar.attributes);
        }

        public final int hashCode() {
            int iC = p.a.c(this.name.hashCode() * 31, 31, this.label);
            yo1.b bVar = this.attributes;
            return iC + (bVar == null ? 0 : bVar.hashCode());
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u0005\u0010\u0014¨\u0006\u0016"}, d2 = {"Lip1/b$d;", "Lip1/b;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "name", "b", "label", "e", "regex", "", "d", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "optional", "Lyo1/b;", "Lyo1/b;", "()Lyo1/b;", "attributes", "feature_apm_bills_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class d extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("name")
        @NotNull
        private final String name;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("label")
        private final String label;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("regex")
        private final String regex;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("optional")
        private final Boolean optional;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("attributes")
        private final yo1.b attributes;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final yo1.b getAttributes() {
            return this.attributes;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Boolean getOptional() {
            return this.optional;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getRegex() {
            return this.regex;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof d)) {
                return false;
            }
            d dVar = (d) obj2;
            return Intrinsics.f(this.name, dVar.name) && Intrinsics.f(this.label, dVar.label) && Intrinsics.f(this.regex, dVar.regex) && Intrinsics.f(this.optional, dVar.optional) && Intrinsics.f(this.attributes, dVar.attributes);
        }

        public final int hashCode() {
            int iHashCode = this.name.hashCode() * 31;
            String str = this.label;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.regex;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Boolean bool = this.optional;
            int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
            yo1.b bVar = this.attributes;
            return iHashCode4 + (bVar != null ? bVar.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0015\u001a\u0004\b\u0005\u0010\u0016¨\u0006\u0018"}, d2 = {"Lip1/b$e;", "Lip1/b;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "name", "b", "c", "label", "f", "regex", "", "Ljava/lang/Boolean;", "e", "()Ljava/lang/Boolean;", "optional", "defaultValue", "Lyo1/b;", "Lyo1/b;", "()Lyo1/b;", "attributes", "feature_apm_bills_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class e extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("name")
        @NotNull
        private final String name;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("label")
        private final String label;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("regex")
        private final String regex;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("optional")
        private final Boolean optional;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("defaultValue")
        private final String defaultValue;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("attributes")
        private final yo1.b attributes;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final yo1.b getAttributes() {
            return this.attributes;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getDefaultValue() {
            return this.defaultValue;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final Boolean getOptional() {
            return this.optional;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof e)) {
                return false;
            }
            e eVar = (e) obj2;
            return Intrinsics.f(this.name, eVar.name) && Intrinsics.f(this.label, eVar.label) && Intrinsics.f(this.regex, eVar.regex) && Intrinsics.f(this.optional, eVar.optional) && Intrinsics.f(this.defaultValue, eVar.defaultValue) && Intrinsics.f(this.attributes, eVar.attributes);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getRegex() {
            return this.regex;
        }

        public final int hashCode() {
            int iHashCode = this.name.hashCode() * 31;
            String str = this.label;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.regex;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Boolean bool = this.optional;
            int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str3 = this.defaultValue;
            int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            yo1.b bVar = this.attributes;
            return iHashCode5 + (bVar != null ? bVar.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u0005\u0010\u0014¨\u0006\u0016"}, d2 = {"Lip1/b$f;", "Lip1/b;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "name", "b", "label", "e", "regex", "", "d", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "optional", "Lyo1/b;", "Lyo1/b;", "()Lyo1/b;", "attributes", "feature_apm_bills_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class f extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("name")
        @NotNull
        private final String name;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("label")
        private final String label;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("regex")
        private final String regex;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("optional")
        private final Boolean optional;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("attributes")
        private final yo1.b attributes;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final yo1.b getAttributes() {
            return this.attributes;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Boolean getOptional() {
            return this.optional;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getRegex() {
            return this.regex;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof f)) {
                return false;
            }
            f fVar = (f) obj2;
            return Intrinsics.f(this.name, fVar.name) && Intrinsics.f(this.label, fVar.label) && Intrinsics.f(this.regex, fVar.regex) && Intrinsics.f(this.optional, fVar.optional) && Intrinsics.f(this.attributes, fVar.attributes);
        }

        public final int hashCode() {
            int iHashCode = this.name.hashCode() * 31;
            String str = this.label;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.regex;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Boolean bool = this.optional;
            int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
            yo1.b bVar = this.attributes;
            return iHashCode4 + (bVar != null ? bVar.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004¨\u0006\f"}, d2 = {"Lip1/b$g;", "Lip1/b;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getName", "name", "b", "getLabel", "label", "feature_apm_bills_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class g extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("name")
        @NotNull
        private final String name;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("label")
        private final String label;

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof g)) {
                return false;
            }
            g gVar = (g) obj2;
            return Intrinsics.f(this.name, gVar.name) && Intrinsics.f(this.label, gVar.label);
        }

        public final int hashCode() {
            int iHashCode = this.name.hashCode() * 31;
            String str = this.label;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0015\u0010\u0004R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0017\u0010\u0004R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0019\u0010\u0004R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\"\u0010$\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\"\u001a\u0004\b\t\u0010#R\u001c\u0010)\u001a\u0004\u0018\u00010%8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\u0005\u0010(¨\u0006*"}, d2 = {"Lip1/b$h;", "Lip1/b;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "name", "b", "d", "label", "", "c", "Ljava/lang/Boolean;", "f", "()Ljava/lang/Boolean;", "optional", "inputMask", "h", "regex", "i", "regexExplain", "g", "placeholder", "getDefaultValue", "defaultValue", "Lyo1/f;", "Lyo1/f;", "j", "()Lyo1/f;", "tooltip", "", "Lip1/c;", "Ljava/util/List;", "()Ljava/util/List;", "choices", "Lyo1/b;", "k", "Lyo1/b;", "()Lyo1/b;", "attributes", "feature_apm_bills_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class h extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("name")
        @NotNull
        private final String name;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("label")
        private final String label;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("optional")
        private final Boolean optional;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("inputMask")
        private final String inputMask;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("regex")
        private final String regex;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("regexExplain")
        private final String regexExplain;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @lg.b("placeholder")
        private final String placeholder;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @lg.b("defaultValue")
        private final String defaultValue;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @lg.b("tooltip")
        private final yo1.f tooltip;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @lg.b("choices")
        private final List<ip1.c> choices;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        @lg.b("attributes")
        private final yo1.b attributes;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final yo1.b getAttributes() {
            return this.attributes;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final List getChoices() {
            return this.choices;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getInputMask() {
            return this.inputMask;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof h)) {
                return false;
            }
            h hVar = (h) obj2;
            return Intrinsics.f(this.name, hVar.name) && Intrinsics.f(this.label, hVar.label) && Intrinsics.f(this.optional, hVar.optional) && Intrinsics.f(this.inputMask, hVar.inputMask) && Intrinsics.f(this.regex, hVar.regex) && Intrinsics.f(this.regexExplain, hVar.regexExplain) && Intrinsics.f(this.placeholder, hVar.placeholder) && Intrinsics.f(this.defaultValue, hVar.defaultValue) && Intrinsics.f(this.tooltip, hVar.tooltip) && Intrinsics.f(this.choices, hVar.choices) && Intrinsics.f(this.attributes, hVar.attributes);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final Boolean getOptional() {
            return this.optional;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getPlaceholder() {
            return this.placeholder;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getRegex() {
            return this.regex;
        }

        public final int hashCode() {
            int iHashCode = this.name.hashCode() * 31;
            String str = this.label;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.optional;
            int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str2 = this.inputMask;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.regex;
            int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.regexExplain;
            int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.placeholder;
            int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.defaultValue;
            int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
            yo1.f fVar = this.tooltip;
            int iHashCode9 = (iHashCode8 + (fVar == null ? 0 : fVar.hashCode())) * 31;
            List<ip1.c> list = this.choices;
            int iHashCode10 = (iHashCode9 + (list == null ? 0 : list.hashCode())) * 31;
            yo1.b bVar = this.attributes;
            return iHashCode10 + (bVar != null ? bVar.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getRegexExplain() {
            return this.regexExplain;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final yo1.f getTooltip() {
            return this.tooltip;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0013\u001a\u0004\b\u0005\u0010\u0014¨\u0006\u0016"}, d2 = {"Lip1/b$i;", "Lip1/b;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "name", "b", "c", "label", "", "Ljava/lang/Boolean;", "e", "()Ljava/lang/Boolean;", "optional", "defaultValue", "Lyo1/b;", "Lyo1/b;", "()Lyo1/b;", "attributes", "feature_apm_bills_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class i extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("name")
        @NotNull
        private final String name;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("label")
        private final String label;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("optional")
        private final Boolean optional;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("defaultValue")
        private final String defaultValue;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("attributes")
        private final yo1.b attributes;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final yo1.b getAttributes() {
            return this.attributes;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getDefaultValue() {
            return this.defaultValue;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final Boolean getOptional() {
            return this.optional;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof i)) {
                return false;
            }
            i iVar = (i) obj2;
            return Intrinsics.f(this.name, iVar.name) && Intrinsics.f(this.label, iVar.label) && Intrinsics.f(this.optional, iVar.optional) && Intrinsics.f(this.defaultValue, iVar.defaultValue) && Intrinsics.f(this.attributes, iVar.attributes);
        }

        public final int hashCode() {
            int iHashCode = this.name.hashCode() * 31;
            String str = this.label;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.optional;
            int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str2 = this.defaultValue;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            yo1.b bVar = this.attributes;
            return iHashCode4 + (bVar != null ? bVar.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0013\u001a\u0004\b\u0005\u0010\u0014¨\u0006\u0016"}, d2 = {"Lip1/b$j;", "Lip1/b;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "name", "b", "c", "label", "", "Ljava/lang/Boolean;", "e", "()Ljava/lang/Boolean;", "optional", "defaultValue", "Lyo1/b;", "Lyo1/b;", "()Lyo1/b;", "attributes", "feature_apm_bills_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class j extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("name")
        @NotNull
        private final String name;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("label")
        private final String label;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("optional")
        private final Boolean optional;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("defaultValue")
        private final String defaultValue;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("attributes")
        private final yo1.b attributes;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final yo1.b getAttributes() {
            return this.attributes;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getDefaultValue() {
            return this.defaultValue;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final Boolean getOptional() {
            return this.optional;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof j)) {
                return false;
            }
            j jVar = (j) obj2;
            return Intrinsics.f(this.name, jVar.name) && Intrinsics.f(this.label, jVar.label) && Intrinsics.f(this.optional, jVar.optional) && Intrinsics.f(this.defaultValue, jVar.defaultValue) && Intrinsics.f(this.attributes, jVar.attributes);
        }

        public final int hashCode() {
            int iHashCode = this.name.hashCode() * 31;
            String str = this.label;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.optional;
            int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str2 = this.defaultValue;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            yo1.b bVar = this.attributes;
            return iHashCode4 + (bVar != null ? bVar.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0011\u001a\u0004\b\u0005\u0010\u0012¨\u0006\u0014"}, d2 = {"Lip1/b$k;", "Lip1/b;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "name", "b", "label", "", "Ljava/lang/Boolean;", "d", "()Ljava/lang/Boolean;", "optional", "Lyo1/b;", "Lyo1/b;", "()Lyo1/b;", "attributes", "feature_apm_bills_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class k extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("name")
        @NotNull
        private final String name;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("label")
        private final String label;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("optional")
        private final Boolean optional;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("attributes")
        private final yo1.b attributes;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final yo1.b getAttributes() {
            return this.attributes;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Boolean getOptional() {
            return this.optional;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof k)) {
                return false;
            }
            k kVar = (k) obj2;
            return Intrinsics.f(this.name, kVar.name) && Intrinsics.f(this.label, kVar.label) && Intrinsics.f(this.optional, kVar.optional) && Intrinsics.f(this.attributes, kVar.attributes);
        }

        public final int hashCode() {
            int iHashCode = this.name.hashCode() * 31;
            String str = this.label;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.optional;
            int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            yo1.b bVar = this.attributes;
            return iHashCode3 + (bVar != null ? bVar.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0016\u001a\u0004\b\u0005\u0010\u0017¨\u0006\u0019"}, d2 = {"Lip1/b$l;", "Lip1/b;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "name", "b", "label", "", "Ljava/lang/Boolean;", "d", "()Ljava/lang/Boolean;", "optional", "Lip1/d;", "Lip1/d;", "e", "()Lip1/d;", "subForm", "Lyo1/b;", "Lyo1/b;", "()Lyo1/b;", "attributes", "feature_apm_bills_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class l extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("name")
        @NotNull
        private final String name;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("label")
        private final String label;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("optional")
        private final Boolean optional;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("subForm")
        @NotNull
        private final ip1.d subForm;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("attributes")
        private final yo1.b attributes;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final yo1.b getAttributes() {
            return this.attributes;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Boolean getOptional() {
            return this.optional;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final ip1.d getSubForm() {
            return this.subForm;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof l)) {
                return false;
            }
            l lVar = (l) obj2;
            return Intrinsics.f(this.name, lVar.name) && Intrinsics.f(this.label, lVar.label) && Intrinsics.f(this.optional, lVar.optional) && Intrinsics.f(this.subForm, lVar.subForm) && Intrinsics.f(this.attributes, lVar.attributes);
        }

        public final int hashCode() {
            int iHashCode = this.name.hashCode() * 31;
            String str = this.label;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.optional;
            int iHashCode3 = (this.subForm.hashCode() + ((iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31)) * 31;
            yo1.b bVar = this.attributes;
            return iHashCode3 + (bVar != null ? bVar.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\u0005\u0010\u0014R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0018\u0010\u0004R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0006\u001a\u0004\b\u001a\u0010\u0004R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0006\u001a\u0004\b\u001c\u0010\u0004R\u001c\u0010\"\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!¨\u0006#"}, d2 = {"Lip1/b$m;", "Lip1/b;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "name", "b", "d", "label", "", "c", "Ljava/lang/Boolean;", "f", "()Ljava/lang/Boolean;", "optional", "Lyo1/b;", "Lyo1/b;", "()Lyo1/b;", "attributes", "defaultValue", "inputMask", "g", "placeholder", "h", "regex", "i", "regexExplain", "Lyo1/f;", "j", "Lyo1/f;", "()Lyo1/f;", "tooltip", "feature_apm_bills_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class m extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("name")
        @NotNull
        private final String name;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("label")
        private final String label;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("optional")
        private final Boolean optional;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("attributes")
        private final yo1.b attributes;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("defaultValue")
        private final String defaultValue;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("inputMask")
        private final String inputMask;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @lg.b("placeholder")
        private final String placeholder;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @lg.b("regex")
        private final String regex;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @lg.b("regexExplain")
        private final String regexExplain;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @lg.b("tooltip")
        private final yo1.f tooltip;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final yo1.b getAttributes() {
            return this.attributes;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getDefaultValue() {
            return this.defaultValue;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getInputMask() {
            return this.inputMask;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof m)) {
                return false;
            }
            m mVar = (m) obj2;
            return Intrinsics.f(this.name, mVar.name) && Intrinsics.f(this.label, mVar.label) && Intrinsics.f(this.optional, mVar.optional) && Intrinsics.f(this.attributes, mVar.attributes) && Intrinsics.f(this.defaultValue, mVar.defaultValue) && Intrinsics.f(this.inputMask, mVar.inputMask) && Intrinsics.f(this.placeholder, mVar.placeholder) && Intrinsics.f(this.regex, mVar.regex) && Intrinsics.f(this.regexExplain, mVar.regexExplain) && Intrinsics.f(this.tooltip, mVar.tooltip);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final Boolean getOptional() {
            return this.optional;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getPlaceholder() {
            return this.placeholder;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getRegex() {
            return this.regex;
        }

        public final int hashCode() {
            int iHashCode = this.name.hashCode() * 31;
            String str = this.label;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.optional;
            int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            yo1.b bVar = this.attributes;
            int iHashCode4 = (iHashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31;
            String str2 = this.defaultValue;
            int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.inputMask;
            int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.placeholder;
            int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.regex;
            int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.regexExplain;
            int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
            yo1.f fVar = this.tooltip;
            return iHashCode9 + (fVar != null ? fVar.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getRegexExplain() {
            return this.regexExplain;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final yo1.f getTooltip() {
            return this.tooltip;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0011\u001a\u0004\b\u0005\u0010\u0012¨\u0006\u0014"}, d2 = {"Lip1/b$n;", "Lip1/b;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "name", "b", "label", "", "Ljava/lang/Boolean;", "d", "()Ljava/lang/Boolean;", "optional", "Lyo1/b;", "Lyo1/b;", "()Lyo1/b;", "attributes", "feature_apm_bills_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class n extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("name")
        @NotNull
        private final String name;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("label")
        private final String label;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("optional")
        private final Boolean optional;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("attributes")
        private final yo1.b attributes;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final yo1.b getAttributes() {
            return this.attributes;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Boolean getOptional() {
            return this.optional;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof n)) {
                return false;
            }
            n nVar = (n) obj2;
            return Intrinsics.f(this.name, nVar.name) && Intrinsics.f(this.label, nVar.label) && Intrinsics.f(this.optional, nVar.optional) && Intrinsics.f(this.attributes, nVar.attributes);
        }

        public final int hashCode() {
            int iHashCode = this.name.hashCode() * 31;
            String str = this.label;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.optional;
            int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            yo1.b bVar = this.attributes;
            return iHashCode3 + (bVar != null ? bVar.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0011\u001a\u0004\b\u0005\u0010\u0012¨\u0006\u0014"}, d2 = {"Lip1/b$o;", "Lip1/b;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "name", "b", "label", "", "Ljava/lang/Boolean;", "d", "()Ljava/lang/Boolean;", "optional", "Lyo1/b;", "Lyo1/b;", "()Lyo1/b;", "attributes", "feature_apm_bills_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class o extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("name")
        @NotNull
        private final String name;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("label")
        private final String label;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("optional")
        private final Boolean optional;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("attributes")
        private final yo1.b attributes;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final yo1.b getAttributes() {
            return this.attributes;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Boolean getOptional() {
            return this.optional;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof o)) {
                return false;
            }
            o oVar = (o) obj2;
            return Intrinsics.f(this.name, oVar.name) && Intrinsics.f(this.label, oVar.label) && Intrinsics.f(this.optional, oVar.optional) && Intrinsics.f(this.attributes, oVar.attributes);
        }

        public final int hashCode() {
            int iHashCode = this.name.hashCode() * 31;
            String str = this.label;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.optional;
            int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            yo1.b bVar = this.attributes;
            return iHashCode3 + (bVar != null ? bVar.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0011\u0010\u0004R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0015\u001a\u0004\b\t\u0010\u0016R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0019\u001a\u0004\b\u0005\u0010\u001a¨\u0006\u001c"}, d2 = {"Lip1/b$p;", "Lip1/b;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "name", "b", "c", "label", "", "Ljava/lang/Boolean;", "e", "()Ljava/lang/Boolean;", "optional", "f", "placeholder", "", "Lip1/c;", "Ljava/util/List;", "()Ljava/util/List;", "choices", "Lyo1/b;", "Lyo1/b;", "()Lyo1/b;", "attributes", "feature_apm_bills_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class p extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("name")
        @NotNull
        private final String name;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("label")
        private final String label;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("optional")
        private final Boolean optional;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("placeholder")
        @NotNull
        private final String placeholder;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("choices")
        @NotNull
        private final List<ip1.c> choices;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("attributes")
        private final yo1.b attributes;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final yo1.b getAttributes() {
            return this.attributes;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final List getChoices() {
            return this.choices;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final Boolean getOptional() {
            return this.optional;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof p)) {
                return false;
            }
            p pVar = (p) obj2;
            return Intrinsics.f(this.name, pVar.name) && Intrinsics.f(this.label, pVar.label) && Intrinsics.f(this.optional, pVar.optional) && Intrinsics.f(this.placeholder, pVar.placeholder) && Intrinsics.f(this.choices, pVar.choices) && Intrinsics.f(this.attributes, pVar.attributes);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getPlaceholder() {
            return this.placeholder;
        }

        public final int hashCode() {
            int iHashCode = this.name.hashCode() * 31;
            String str = this.label;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.optional;
            int iD = p.a.d(p.a.c((iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.placeholder), 31, this.choices);
            yo1.b bVar = this.attributes;
            return iD + (bVar != null ? bVar.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001a\u0010\u0016\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0018\u001a\u0004\b\u0005\u0010\u0019¨\u0006\u001b"}, d2 = {"Lip1/b$q;", "Lip1/b;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "name", "b", "label", "", "Ljava/lang/Boolean;", "d", "()Ljava/lang/Boolean;", "optional", "e", "placeholder", "Lip1/d;", "Lip1/d;", "f", "()Lip1/d;", "subForm", "Lyo1/b;", "Lyo1/b;", "()Lyo1/b;", "attributes", "feature_apm_bills_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class q extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("name")
        @NotNull
        private final String name;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("label")
        private final String label;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("optional")
        private final Boolean optional;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("placeholder")
        @NotNull
        private final String placeholder;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("subForm")
        @NotNull
        private final ip1.d subForm;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("attributes")
        private final yo1.b attributes;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final yo1.b getAttributes() {
            return this.attributes;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Boolean getOptional() {
            return this.optional;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getPlaceholder() {
            return this.placeholder;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof q)) {
                return false;
            }
            q qVar = (q) obj2;
            return Intrinsics.f(this.name, qVar.name) && Intrinsics.f(this.label, qVar.label) && Intrinsics.f(this.optional, qVar.optional) && Intrinsics.f(this.placeholder, qVar.placeholder) && Intrinsics.f(this.subForm, qVar.subForm) && Intrinsics.f(this.attributes, qVar.attributes);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final ip1.d getSubForm() {
            return this.subForm;
        }

        public final int hashCode() {
            int iHashCode = this.name.hashCode() * 31;
            String str = this.label;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.optional;
            int iHashCode3 = (this.subForm.hashCode() + p.a.c((iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.placeholder)) * 31;
            yo1.b bVar = this.attributes;
            return iHashCode3 + (bVar != null ? bVar.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0011\u001a\u0004\b\u0005\u0010\u0012¨\u0006\u0014"}, d2 = {"Lip1/b$r;", "Lip1/b;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "name", "b", "label", "", "Ljava/lang/Boolean;", "d", "()Ljava/lang/Boolean;", "optional", "Lyo1/b;", "Lyo1/b;", "()Lyo1/b;", "attributes", "feature_apm_bills_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class r extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("name")
        @NotNull
        private final String name;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("label")
        private final String label;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("optional")
        private final Boolean optional;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("attributes")
        private final yo1.b attributes;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final yo1.b getAttributes() {
            return this.attributes;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Boolean getOptional() {
            return this.optional;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof r)) {
                return false;
            }
            r rVar = (r) obj2;
            return Intrinsics.f(this.name, rVar.name) && Intrinsics.f(this.label, rVar.label) && Intrinsics.f(this.optional, rVar.optional) && Intrinsics.f(this.attributes, rVar.attributes);
        }

        public final int hashCode() {
            int iHashCode = this.name.hashCode() * 31;
            String str = this.label;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.optional;
            int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            yo1.b bVar = this.attributes;
            return iHashCode3 + (bVar != null ? bVar.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0015\u0010\u0004R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0017\u0010\u0004R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0019\u0010\u0004R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0012\u0010\u0004R\u001c\u0010 \u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR(\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\"\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010#\u001a\u0004\b\r\u0010$R\"\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010&8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010'\u001a\u0004\b\t\u0010(R\u001c\u0010-\u001a\u0004\u0018\u00010*8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010+\u001a\u0004\b\u0005\u0010,¨\u0006."}, d2 = {"Lip1/b$s;", "Lip1/b;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "g", "name", "b", "f", "label", "", "c", "Ljava/lang/Boolean;", "h", "()Ljava/lang/Boolean;", "optional", "d", "e", "inputMask", "j", "regex", "k", "regexExplain", "i", "placeholder", "defaultValue", "Lyo1/f;", "Lyo1/f;", "l", "()Lyo1/f;", "tooltip", "", "Lip1/a;", "Ljava/util/Map;", "()Ljava/util/Map;", "controls", "", "Ljava/util/List;", "()Ljava/util/List;", "childInputs", "Lyo1/b;", "Lyo1/b;", "()Lyo1/b;", "attributes", "feature_apm_bills_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class s extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("name")
        @NotNull
        private final String name;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("label")
        private final String label;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("optional")
        private final Boolean optional;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("inputMask")
        private final String inputMask;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("regex")
        private final String regex;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("regexExplain")
        private final String regexExplain;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @lg.b("placeholder")
        private final String placeholder;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @lg.b("defaultValue")
        private final String defaultValue;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @lg.b("tooltip")
        private final yo1.f tooltip;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @lg.b("controls")
        private final Map<String, ip1.a> controls;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        @lg.b("childInputs")
        private final List<b> childInputs;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        @lg.b("attributes")
        private final yo1.b attributes;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final yo1.b getAttributes() {
            return this.attributes;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final List getChildInputs() {
            return this.childInputs;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Map getControls() {
            return this.controls;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getDefaultValue() {
            return this.defaultValue;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getInputMask() {
            return this.inputMask;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof s)) {
                return false;
            }
            s sVar = (s) obj2;
            return Intrinsics.f(this.name, sVar.name) && Intrinsics.f(this.label, sVar.label) && Intrinsics.f(this.optional, sVar.optional) && Intrinsics.f(this.inputMask, sVar.inputMask) && Intrinsics.f(this.regex, sVar.regex) && Intrinsics.f(this.regexExplain, sVar.regexExplain) && Intrinsics.f(this.placeholder, sVar.placeholder) && Intrinsics.f(this.defaultValue, sVar.defaultValue) && Intrinsics.f(this.tooltip, sVar.tooltip) && Intrinsics.f(this.controls, sVar.controls) && Intrinsics.f(this.childInputs, sVar.childInputs) && Intrinsics.f(this.attributes, sVar.attributes);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final Boolean getOptional() {
            return this.optional;
        }

        public final int hashCode() {
            int iHashCode = this.name.hashCode() * 31;
            String str = this.label;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.optional;
            int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str2 = this.inputMask;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.regex;
            int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.regexExplain;
            int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.placeholder;
            int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.defaultValue;
            int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
            yo1.f fVar = this.tooltip;
            int iHashCode9 = (iHashCode8 + (fVar == null ? 0 : fVar.hashCode())) * 31;
            Map<String, ip1.a> map = this.controls;
            int iHashCode10 = (iHashCode9 + (map == null ? 0 : map.hashCode())) * 31;
            List<b> list = this.childInputs;
            int iHashCode11 = (iHashCode10 + (list == null ? 0 : list.hashCode())) * 31;
            yo1.b bVar = this.attributes;
            return iHashCode11 + (bVar != null ? bVar.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getPlaceholder() {
            return this.placeholder;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final String getRegex() {
            return this.regex;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final String getRegexExplain() {
            return this.regexExplain;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final yo1.f getTooltip() {
            return this.tooltip;
        }
    }

    private b() {
    }
}
