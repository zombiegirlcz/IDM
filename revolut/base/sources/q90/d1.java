package q90;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0002\u0005\nJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\"\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0005\u0010\u0013R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u0018\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0017\u0010\u0004R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u0011\u0010\u0004R \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0012\u001a\u0004\b\u0019\u0010\u0013R\u001c\u0010!\u001a\u0004\u0018\u00010\u001d8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u001e\u001a\u0004\b\u001f\u0010 R \u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0012\u001a\u0004\b\u0016\u0010\u0013¨\u0006$"}, d2 = {"Lq90/d1;", "Lq90/b2;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "id", "", "b", "Z", "g", "()Z", "required", "", "Lq90/a;", "c", "Ljava/util/List;", "()Ljava/util/List;", "actions", "addActionId", "e", "h", "title", "f", "emptyListPlaceholder", "Lq90/d1$a;", "items", "Lq90/e1;", "Lq90/e1;", "i", "()Lq90/e1;", "value", "Lq90/d1$b;", "itemSourceTemplates", "core_backend_flow_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d1 extends b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("required")
    private final boolean required;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("actions")
    private final List<q90.a> actions;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("addActionId")
    private final String addActionId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("emptyListPlaceholder")
    private final String emptyListPlaceholder;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("items")
    @NotNull
    private final List<a> items;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("value")
    private final e1 value;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("itemSourceTemplates")
    @NotNull
    private final List<b> itemSourceTemplates;

    /* JADX INFO: loaded from: classes19.dex */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\u0004R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\u0004R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001a\u0010\u0018\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0016\u0010\u0004R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001a\u001a\u0004\b\u0013\u0010\u001bR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u001a\u001a\u0004\b\u0005\u0010\u001b¨\u0006\u001e"}, d2 = {"Lq90/d1$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "id", "Lq90/o;", "b", "Lq90/o;", "()Lq90/o;", "icon", "h", "title", "d", "i", "valuePlaceholder", "e", "g", "subtitle", "f", "message", "style", "", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "required", "editingEnabled", "core_backend_flow_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        @NotNull
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("icon")
        private final o icon;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        @NotNull
        private final String title;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("valuePlaceholder")
        private final String valuePlaceholder;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("subtitle")
        private final String subtitle;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("message")
        private final String message;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @lg.b("style")
        @NotNull
        private final String style;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @lg.b("required")
        private final Boolean required;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @lg.b("editingEnabled")
        private final Boolean editingEnabled;

        public a(String id10, o oVar, String title, String str, String str2, String str3, String style, Boolean bool, Boolean bool2) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(style, "style");
            this.id = id10;
            this.icon = oVar;
            this.title = title;
            this.valuePlaceholder = str;
            this.subtitle = str2;
            this.message = str3;
            this.style = style;
            this.required = bool;
            this.editingEnabled = bool2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Boolean getEditingEnabled() {
            return this.editingEnabled;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final o getIcon() {
            return this.icon;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final Boolean getRequired() {
            return this.required;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.id, aVar.id) && Intrinsics.f(this.icon, aVar.icon) && Intrinsics.f(this.title, aVar.title) && Intrinsics.f(this.valuePlaceholder, aVar.valuePlaceholder) && Intrinsics.f(this.subtitle, aVar.subtitle) && Intrinsics.f(this.message, aVar.message) && Intrinsics.f(this.style, aVar.style) && Intrinsics.f(this.required, aVar.required) && Intrinsics.f(this.editingEnabled, aVar.editingEnabled);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getStyle() {
            return this.style;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            o oVar = this.icon;
            int iC = p.a.c((iHashCode + (oVar == null ? 0 : oVar.hashCode())) * 31, 31, this.title);
            String str = this.valuePlaceholder;
            int iHashCode2 = (iC + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.subtitle;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.message;
            int iC2 = p.a.c((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.style);
            Boolean bool = this.required;
            int iHashCode4 = (iC2 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.editingEnabled;
            return iHashCode4 + (bool2 != null ? bool2.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getValuePlaceholder() {
            return this.valuePlaceholder;
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\u0004R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0014\u0010\u0004R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0016\u0010\u0004R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b\t\u0010\u001bR\u001c\u0010 \u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u001e\u001a\u0004\b\u0011\u0010\u001fR\u001c\u0010!\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u001e\u001a\u0004\b\u0005\u0010\u001f¨\u0006\""}, d2 = {"Lq90/d1$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "id", "b", "f", "sourceParam", "i", "title", "d", "g", "style", "e", "j", "value", "k", "valuePlaceholder", "h", "subtitle", "message", "Lq90/o;", "Lq90/o;", "()Lq90/o;", "icon", "", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "required", "editingEnabled", "core_backend_flow_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        @NotNull
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("sourceParam")
        @NotNull
        private final String sourceParam;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        @NotNull
        private final String title;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("style")
        @NotNull
        private final String style;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("value")
        private final String value;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("valuePlaceholder")
        private final String valuePlaceholder;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @lg.b("subtitle")
        private final String subtitle;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @lg.b("message")
        private final String message;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @lg.b("icon")
        private final o icon;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @lg.b("required")
        private final Boolean required;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        @lg.b("editingEnabled")
        private final Boolean editingEnabled;

        public b(String id10, String sourceParam, String title, String style, String str, String str2, String str3, String str4, o oVar, Boolean bool, Boolean bool2) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(sourceParam, "sourceParam");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(style, "style");
            this.id = id10;
            this.sourceParam = sourceParam;
            this.title = title;
            this.style = style;
            this.value = str;
            this.valuePlaceholder = str2;
            this.subtitle = str3;
            this.message = str4;
            this.icon = oVar;
            this.required = bool;
            this.editingEnabled = bool2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Boolean getEditingEnabled() {
            return this.editingEnabled;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final o getIcon() {
            return this.icon;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final Boolean getRequired() {
            return this.required;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.id, bVar.id) && Intrinsics.f(this.sourceParam, bVar.sourceParam) && Intrinsics.f(this.title, bVar.title) && Intrinsics.f(this.style, bVar.style) && Intrinsics.f(this.value, bVar.value) && Intrinsics.f(this.valuePlaceholder, bVar.valuePlaceholder) && Intrinsics.f(this.subtitle, bVar.subtitle) && Intrinsics.f(this.message, bVar.message) && Intrinsics.f(this.icon, bVar.icon) && Intrinsics.f(this.required, bVar.required) && Intrinsics.f(this.editingEnabled, bVar.editingEnabled);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getSourceParam() {
            return this.sourceParam;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getStyle() {
            return this.style;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        public final int hashCode() {
            int iC = p.a.c(p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.sourceParam), 31, this.title), 31, this.style);
            String str = this.value;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.valuePlaceholder;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.subtitle;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.message;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            o oVar = this.icon;
            int iHashCode5 = (iHashCode4 + (oVar == null ? 0 : oVar.hashCode())) * 31;
            Boolean bool = this.required;
            int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.editingEnabled;
            return iHashCode6 + (bool2 != null ? bool2.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final String getValuePlaceholder() {
            return this.valuePlaceholder;
        }
    }

    public d1(String id10, boolean z, ArrayList arrayList, String str, String title, String str2, ArrayList items, e1 e1Var, ArrayList itemSourceTemplates) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(itemSourceTemplates, "itemSourceTemplates");
        this.id = id10;
        this.required = z;
        this.actions = arrayList;
        this.addActionId = str;
        this.title = title;
        this.emptyListPlaceholder = str2;
        this.items = items;
        this.value = e1Var;
        this.itemSourceTemplates = itemSourceTemplates;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getActions() {
        return this.actions;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAddActionId() {
        return this.addActionId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getEmptyListPlaceholder() {
        return this.emptyListPlaceholder;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final List getItemSourceTemplates() {
        return this.itemSourceTemplates;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj2;
        return Intrinsics.f(this.id, d1Var.id) && this.required == d1Var.required && Intrinsics.f(this.actions, d1Var.actions) && Intrinsics.f(this.addActionId, d1Var.addActionId) && Intrinsics.f(this.title, d1Var.title) && Intrinsics.f(this.emptyListPlaceholder, d1Var.emptyListPlaceholder) && Intrinsics.f(this.items, d1Var.items) && Intrinsics.f(this.value, d1Var.value) && Intrinsics.f(this.itemSourceTemplates, d1Var.itemSourceTemplates);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final List getItems() {
        return this.items;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getRequired() {
        return this.required;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int iC = j6.a.c(this.id.hashCode() * 31, 31, this.required);
        List<q90.a> list = this.actions;
        int iHashCode = (iC + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.addActionId;
        int iC2 = p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.title);
        String str2 = this.emptyListPlaceholder;
        int iD = p.a.d((iC2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.items);
        e1 e1Var = this.value;
        return this.itemSourceTemplates.hashCode() + ((iD + (e1Var != null ? e1Var.hashCode() : 0)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final e1 getValue() {
        return this.value;
    }
}
