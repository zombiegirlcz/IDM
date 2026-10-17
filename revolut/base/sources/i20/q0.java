package i20;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001:\n\u000b\u0006\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0017"}, d2 = {"Li20/q0;", "Li20/d0;", "", "toString", "()Ljava/lang/String;", "Li20/q0$b;", "a", "Li20/q0$b;", "()Li20/q0$b;", "container", "Li20/e0;", "b", "Li20/e0;", "()Li20/e0;", "meta", "d", "c", "i", "h", "f", "e", "j", "g", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class q0 extends d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("content")
    @NotNull
    private final b container;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("meta")
    private final e0 meta;

    public static abstract class a extends b {

        /* JADX INFO: renamed from: i20.q0$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0004¨\u0006\u0014"}, d2 = {"Li20/q0$a$a;", "Li20/q0$a;", "", "toString", "()Ljava/lang/String;", "", "Li20/q0$g;", "a", "Ljava/util/List;", "()Ljava/util/List;", "content", "Li20/q0$a$b;", "b", "Li20/q0$a$b;", "()Li20/q0$a$b;", "spacing", "c", "Ljava/lang/String;", "getType", "type", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C0904a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("content")
            @NotNull
            private final List<g> content;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("spacing")
            private final b spacing;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("type")
            @NotNull
            private final String type;

            @Override // i20.q0.a
            /* JADX INFO: renamed from: a, reason: from getter */
            public final List getContent() {
                return this.content;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final b getSpacing() {
                return this.spacing;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof C0904a)) {
                    return false;
                }
                C0904a c0904a = (C0904a) obj2;
                return Intrinsics.f(this.content, c0904a.content) && Intrinsics.f(this.spacing, c0904a.spacing) && Intrinsics.f(this.type, c0904a.type);
            }

            public final int hashCode() {
                int iHashCode = this.content.hashCode() * 31;
                b bVar = this.spacing;
                return this.type.hashCode() + ((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31);
            }
        }

        /* JADX INFO: loaded from: classes19.dex */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\u0004¨\u0006\u000e"}, d2 = {"Li20/q0$a$b;", "", "", "toString", "()Ljava/lang/String;", "", "a", "F", "()F", "value", "b", "Ljava/lang/String;", "getUnit", "unit", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("value")
            private final float value;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("unit")
            @NotNull
            private final String unit;

            /* JADX INFO: renamed from: a, reason: from getter */
            public final float getValue() {
                return this.value;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof b)) {
                    return false;
                }
                b bVar = (b) obj2;
                return Float.compare(this.value, bVar.value) == 0 && Intrinsics.f(this.unit, bVar.unit);
            }

            public final int hashCode() {
                return this.unit.hashCode() + (Float.hashCode(this.value) * 31);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0004¨\u0006\u0014"}, d2 = {"Li20/q0$a$c;", "Li20/q0$a;", "", "toString", "()Ljava/lang/String;", "", "Li20/q0$g;", "a", "Ljava/util/List;", "()Ljava/util/List;", "content", "Li20/q0$a$b;", "b", "Li20/q0$a$b;", "()Li20/q0$a$b;", "spacing", "c", "Ljava/lang/String;", "getType", "type", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class c extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("content")
            @NotNull
            private final List<g> content;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("spacing")
            private final b spacing;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("type")
            @NotNull
            private final String type;

            @Override // i20.q0.a
            /* JADX INFO: renamed from: a, reason: from getter */
            public final List getContent() {
                return this.content;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final b getSpacing() {
                return this.spacing;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof c)) {
                    return false;
                }
                c cVar = (c) obj2;
                return Intrinsics.f(this.content, cVar.content) && Intrinsics.f(this.spacing, cVar.spacing) && Intrinsics.f(this.type, cVar.type);
            }

            public final int hashCode() {
                int iHashCode = this.content.hashCode() * 31;
                b bVar = this.spacing;
                return this.type.hashCode() + ((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31);
            }
        }

        private a() {
        }

        /* JADX INFO: renamed from: a */
        public abstract List getContent();
    }

    public static abstract class b extends g {
        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\u000b"}, d2 = {"Li20/q0$c;", "Li20/q0$b;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getType", "type", "b", "id", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("type")
        @NotNull
        private final String type;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
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
            if (!(obj2 instanceof c)) {
                return false;
            }
            c cVar = (c) obj2;
            return Intrinsics.f(this.type, cVar.type) && Intrinsics.f(this.id, cVar.id);
        }

        public final int hashCode() {
            return this.id.hashCode() + (this.type.hashCode() * 31);
        }
    }

    public static abstract class d extends g {

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u0006\u0010\rR\u001a\u0010\u0012\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0004¨\u0006\u0013"}, d2 = {"Li20/q0$d$a;", "Li20/q0$d;", "", "toString", "()Ljava/lang/String;", "", "a", "Z", "b", "()Z", "value", "", "Ljava/util/List;", "()Ljava/util/List;", "classes", "c", "Ljava/lang/String;", "getType", "type", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class a extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("value")
            private final boolean value;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("classes")
            private final List<String> classes;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("type")
            @NotNull
            private final String type;

            @Override // i20.q0.d
            /* JADX INFO: renamed from: a, reason: from getter */
            public final List getClasses() {
                return this.classes;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final boolean getValue() {
                return this.value;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof a)) {
                    return false;
                }
                a aVar = (a) obj2;
                return this.value == aVar.value && Intrinsics.f(this.classes, aVar.classes) && Intrinsics.f(this.type, aVar.type);
            }

            public final int hashCode() {
                int iHashCode = Boolean.hashCode(this.value) * 31;
                List<String> list = this.classes;
                return this.type.hashCode() + ((iHashCode + (list == null ? 0 : list.hashCode())) * 31);
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\r\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0011\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u000e\u0010\u0004R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b\n\u0010\u0004¨\u0006\u0016"}, d2 = {"Li20/q0$d$b;", "Li20/q0$d;", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/util/List;", "()Ljava/util/List;", "classes", "b", "Ljava/lang/String;", "getType", "type", "c", "d", "key", "e", "label", "deeplink", "f", "actionId", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class b extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("classes")
            private final List<String> classes;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("type")
            @NotNull
            private final String type;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("key")
            @NotNull
            private final String key;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            @lg.b("label")
            @NotNull
            private final String label;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            @lg.b("deeplink")
            private final String deeplink;

            /* JADX INFO: renamed from: f, reason: from kotlin metadata */
            @lg.b("actionId")
            private final String actionId;

            @Override // i20.q0.d
            /* JADX INFO: renamed from: a, reason: from getter */
            public final List getClasses() {
                return this.classes;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getActionId() {
                return this.actionId;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getDeeplink() {
                return this.deeplink;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final String getKey() {
                return this.key;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
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
                return Intrinsics.f(this.classes, bVar.classes) && Intrinsics.f(this.type, bVar.type) && Intrinsics.f(this.key, bVar.key) && Intrinsics.f(this.label, bVar.label) && Intrinsics.f(this.deeplink, bVar.deeplink) && Intrinsics.f(this.actionId, bVar.actionId);
            }

            public final int hashCode() {
                List<String> list = this.classes;
                int iC = p.a.c(p.a.c(p.a.c((list == null ? 0 : list.hashCode()) * 31, 31, this.type), 31, this.key), 31, this.label);
                String str = this.deeplink;
                int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.actionId;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0005\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004¨\u0006\u0010"}, d2 = {"Li20/q0$d$c;", "Li20/q0$d;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "value", "", "Ljava/util/List;", "()Ljava/util/List;", "classes", "c", "getType", "type", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class c extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("value")
            @NotNull
            private final String value;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("classes")
            private final List<String> classes;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("type")
            @NotNull
            private final String type;

            @Override // i20.q0.d
            /* JADX INFO: renamed from: a, reason: from getter */
            public final List getClasses() {
                return this.classes;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getValue() {
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
                return Intrinsics.f(this.value, cVar.value) && Intrinsics.f(this.classes, cVar.classes) && Intrinsics.f(this.type, cVar.type);
            }

            public final int hashCode() {
                int iHashCode = this.value.hashCode() * 31;
                List<String> list = this.classes;
                return this.type.hashCode() + ((iHashCode + (list == null ? 0 : list.hashCode())) * 31);
            }
        }

        /* JADX INFO: renamed from: i20.q0$d$d, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0005\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004¨\u0006\u0010"}, d2 = {"Li20/q0$d$d;", "Li20/q0$d;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "value", "", "Ljava/util/List;", "()Ljava/util/List;", "classes", "c", "getType", "type", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C0905d extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("value")
            @NotNull
            private final String value;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("classes")
            private final List<String> classes;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("type")
            @NotNull
            private final String type;

            @Override // i20.q0.d
            /* JADX INFO: renamed from: a, reason: from getter */
            public final List getClasses() {
                return this.classes;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getValue() {
                return this.value;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof C0905d)) {
                    return false;
                }
                C0905d c0905d = (C0905d) obj2;
                return Intrinsics.f(this.value, c0905d.value) && Intrinsics.f(this.classes, c0905d.classes) && Intrinsics.f(this.type, c0905d.type);
            }

            public final int hashCode() {
                int iHashCode = this.value.hashCode() * 31;
                List<String> list = this.classes;
                return this.type.hashCode() + ((iHashCode + (list == null ? 0 : list.hashCode())) * 31);
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\u0005\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\u0004¨\u0006\u0014"}, d2 = {"Li20/q0$d$e;", "Li20/q0$d;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "id", "b", "filename", "d", "mediaType", "", "Ljava/util/List;", "()Ljava/util/List;", "classes", "e", "getType", "type", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class e extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("id")
            @NotNull
            private final String id;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("filename")
            @NotNull
            private final String filename;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("mediaType")
            @NotNull
            private final String mediaType;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            @lg.b("classes")
            private final List<String> classes;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            @lg.b("type")
            @NotNull
            private final String type;

            @Override // i20.q0.d
            /* JADX INFO: renamed from: a, reason: from getter */
            public final List getClasses() {
                return this.classes;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getFilename() {
                return this.filename;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getId() {
                return this.id;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final String getMediaType() {
                return this.mediaType;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof e)) {
                    return false;
                }
                e eVar = (e) obj2;
                return Intrinsics.f(this.id, eVar.id) && Intrinsics.f(this.filename, eVar.filename) && Intrinsics.f(this.mediaType, eVar.mediaType) && Intrinsics.f(this.classes, eVar.classes) && Intrinsics.f(this.type, eVar.type);
            }

            public final int hashCode() {
                int iC = p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.filename), 31, this.mediaType);
                List<String> list = this.classes;
                return this.type.hashCode() + ((iC + (list == null ? 0 : list.hashCode())) * 31);
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00138\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0006\u0010\u0016R\u001a\u0010\u001a\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u000b\u001a\u0004\b\u0019\u0010\u0004¨\u0006\u001b"}, d2 = {"Li20/q0$d$f;", "Li20/q0$d;", "", "toString", "()Ljava/lang/String;", "", "a", "J", "b", "()J", "amount", "Ljava/lang/String;", "c", "currency", "", "I", "getFractionDigits", "()I", "fractionDigits", "", "d", "Ljava/util/List;", "()Ljava/util/List;", "classes", "e", "getType", "type", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class f extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("amount")
            private final long amount;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("currency")
            @NotNull
            private final String currency;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("fractionDigits")
            private final int fractionDigits;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            @lg.b("classes")
            private final List<String> classes;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            @lg.b("type")
            @NotNull
            private final String type;

            @Override // i20.q0.d
            /* JADX INFO: renamed from: a, reason: from getter */
            public final List getClasses() {
                return this.classes;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final long getAmount() {
                return this.amount;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getCurrency() {
                return this.currency;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof f)) {
                    return false;
                }
                f fVar = (f) obj2;
                return this.amount == fVar.amount && Intrinsics.f(this.currency, fVar.currency) && this.fractionDigits == fVar.fractionDigits && Intrinsics.f(this.classes, fVar.classes) && Intrinsics.f(this.type, fVar.type);
            }

            public final int hashCode() {
                int iB = j6.a.b(this.fractionDigits, p.a.c(Long.hashCode(this.amount) * 31, 31, this.currency), 31);
                List<String> list = this.classes;
                return this.type.hashCode() + ((iB + (list == null ? 0 : list.hashCode())) * 31);
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0005\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004¨\u0006\u0010"}, d2 = {"Li20/q0$d$g;", "Li20/q0$d;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "value", "", "Ljava/util/List;", "()Ljava/util/List;", "classes", "c", "getType", "type", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class g extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("value")
            @NotNull
            private final String value;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("classes")
            private final List<String> classes;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("type")
            @NotNull
            private final String type;

            @Override // i20.q0.d
            /* JADX INFO: renamed from: a, reason: from getter */
            public final List getClasses() {
                return this.classes;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getValue() {
                return this.value;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof g)) {
                    return false;
                }
                g gVar = (g) obj2;
                return Intrinsics.f(this.value, gVar.value) && Intrinsics.f(this.classes, gVar.classes) && Intrinsics.f(this.type, gVar.type);
            }

            public final int hashCode() {
                int iHashCode = this.value.hashCode() * 31;
                List<String> list = this.classes;
                return this.type.hashCode() + ((iHashCode + (list == null ? 0 : list.hashCode())) * 31);
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0005\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004¨\u0006\u0010"}, d2 = {"Li20/q0$d$h;", "Li20/q0$d;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "value", "", "Ljava/util/List;", "()Ljava/util/List;", "classes", "c", "getType", "type", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class h extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("value")
            @NotNull
            private final String value;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("classes")
            private final List<String> classes;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("type")
            @NotNull
            private final String type;

            @Override // i20.q0.d
            /* JADX INFO: renamed from: a, reason: from getter */
            public final List getClasses() {
                return this.classes;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getValue() {
                return this.value;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof h)) {
                    return false;
                }
                h hVar = (h) obj2;
                return Intrinsics.f(this.value, hVar.value) && Intrinsics.f(this.classes, hVar.classes) && Intrinsics.f(this.type, hVar.type);
            }

            public final int hashCode() {
                int iHashCode = this.value.hashCode() * 31;
                List<String> list = this.classes;
                return this.type.hashCode() + ((iHashCode + (list == null ? 0 : list.hashCode())) * 31);
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0005\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004¨\u0006\u0010"}, d2 = {"Li20/q0$d$i;", "Li20/q0$d;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "value", "", "Ljava/util/List;", "()Ljava/util/List;", "classes", "c", "getType", "type", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class i extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("value")
            @NotNull
            private final String value;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("classes")
            private final List<String> classes;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("type")
            @NotNull
            private final String type;

            @Override // i20.q0.d
            /* JADX INFO: renamed from: a, reason: from getter */
            public final List getClasses() {
                return this.classes;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getValue() {
                return this.value;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof i)) {
                    return false;
                }
                i iVar = (i) obj2;
                return Intrinsics.f(this.value, iVar.value) && Intrinsics.f(this.classes, iVar.classes) && Intrinsics.f(this.type, iVar.type);
            }

            public final int hashCode() {
                int iHashCode = this.value.hashCode() * 31;
                List<String> list = this.classes;
                return this.type.hashCode() + ((iHashCode + (list == null ? 0 : list.hashCode())) * 31);
            }
        }

        private d() {
        }

        /* JADX INFO: renamed from: a */
        public abstract List getClasses();
    }

    /* JADX INFO: loaded from: classes19.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\n"}, d2 = {"Li20/q0$e;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "name", "id", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("name")
        @NotNull
        private final String name;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        @NotNull
        private final String id;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof e)) {
                return false;
            }
            e eVar = (e) obj2;
            return Intrinsics.f(this.name, eVar.name) && Intrinsics.f(this.id, eVar.id);
        }

        public final int hashCode() {
            return this.id.hashCode() + (this.name.hashCode() * 31);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0005\u0010\f¨\u0006\u000e"}, d2 = {"Li20/q0$f;", "Li20/q0$b;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getType", "type", "Li20/q0$e;", "b", "Li20/q0$e;", "()Li20/q0$e;", "entityReference", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class f extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("type")
        @NotNull
        private final String type;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("entityRef")
        @NotNull
        private final e entityReference;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final e getEntityReference() {
            return this.entityReference;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof f)) {
                return false;
            }
            f fVar = (f) obj2;
            return Intrinsics.f(this.type, fVar.type) && Intrinsics.f(this.entityReference, fVar.entityReference);
        }

        public final int hashCode() {
            return this.entityReference.hashCode() + (this.type.hashCode() * 31);
        }
    }

    public static abstract class g {
    }

    /* JADX INFO: loaded from: classes19.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\u000f"}, d2 = {"Li20/q0$h;", "Li20/q0$b;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getType", "type", "b", "c", "title", "subtitle", "d", "deeplink", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class h extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("type")
        @NotNull
        private final String type;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        @NotNull
        private final String title;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("subtitle")
        @NotNull
        private final String subtitle;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("deeplink")
        @NotNull
        private final String deeplink;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof h)) {
                return false;
            }
            h hVar = (h) obj2;
            return Intrinsics.f(this.type, hVar.type) && Intrinsics.f(this.title, hVar.title) && Intrinsics.f(this.subtitle, hVar.subtitle) && Intrinsics.f(this.deeplink, hVar.deeplink);
        }

        public final int hashCode() {
            return this.deeplink.hashCode() + p.a.c(p.a.c(this.type.hashCode() * 31, 31, this.title), 31, this.subtitle);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\u000b"}, d2 = {"Li20/q0$i;", "Li20/q0$b;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getType", "type", "b", "entity", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class i extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("type")
        @NotNull
        private final String type;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("entity")
        @NotNull
        private final String entity;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getEntity() {
            return this.entity;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof i)) {
                return false;
            }
            i iVar = (i) obj2;
            return Intrinsics.f(this.type, iVar.type) && Intrinsics.f(this.entity, iVar.entity);
        }

        public final int hashCode() {
            return this.entity.hashCode() + (this.type.hashCode() * 31);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Li20/q0$j;", "Li20/q0$b;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "type", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class j extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("type")
        @NotNull
        private final String type;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getType() {
            return this.type;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof j) && Intrinsics.f(this.type, ((j) obj2).type);
        }

        public final int hashCode() {
            return this.type.hashCode();
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final b getContainer() {
        return this.container;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final e0 getMeta() {
        return this.meta;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj2;
        return Intrinsics.f(this.container, q0Var.container) && Intrinsics.f(this.meta, q0Var.meta);
    }

    public final int hashCode() {
        int iHashCode = this.container.hashCode() * 31;
        e0 e0Var = this.meta;
        return iHashCode + (e0Var == null ? 0 : e0Var.hashCode());
    }
}
