package q90;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\"\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u0005\u0010\u0014R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u000e\u0010\u0014R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001a\u001a\u0004\b\u0017\u0010\u001b¨\u0006\u001d"}, d2 = {"Lq90/o1;", "Lq90/b2;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "id", "", "Z", "d", "()Z", "required", "c", "f", "isMultipleSelection", "", "Lq90/o1$a;", "Ljava/util/List;", "()Ljava/util/List;", "groups", "Lq90/o1$b;", "e", "items", "Lq90/p1;", "Lq90/p1;", "()Lq90/p1;", "value", "core_backend_flow_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class o1 extends b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("required")
    private final boolean required;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("isMultipleSelection")
    private final boolean isMultipleSelection;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("groups")
    private final List<a> groups;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("items")
    @NotNull
    private final List<b> items;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("value")
    private final p1 value;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\t\u0010\u0004R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u000f"}, d2 = {"Lq90/o1$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "id", "b", "c", "title", "", "Ljava/util/List;", "()Ljava/util/List;", "itemIds", "core_backend_flow_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        @NotNull
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        @NotNull
        private final String title;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("itemIds")
        @NotNull
        private final List<String> itemIds;

        public a(String id10, String title, List itemIds) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(itemIds, "itemIds");
            this.id = id10;
            this.title = title;
            this.itemIds = itemIds;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final List getItemIds() {
            return this.itemIds;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.id, aVar.id) && Intrinsics.f(this.title, aVar.title) && Intrinsics.f(this.itemIds, aVar.itemIds);
        }

        public final int hashCode() {
            return this.itemIds.hashCode() + p.a.c(this.id.hashCode() * 31, 31, this.title);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\b\u0010\u0004¨\u0006\n"}, d2 = {"Lq90/o1$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "id", "b", "label", "core_backend_flow_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        @NotNull
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("label")
        @NotNull
        private final String label;

        public b(String id10, String label) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(label, "label");
            this.id = id10;
            this.label = label;
        }

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
            return this.label.hashCode() + (this.id.hashCode() * 31);
        }
    }

    public o1(String id10, boolean z, boolean z3, ArrayList arrayList, ArrayList items, p1 p1Var) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(items, "items");
        this.id = id10;
        this.required = z;
        this.isMultipleSelection = z3;
        this.groups = arrayList;
        this.items = items;
        this.value = p1Var;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getGroups() {
        return this.groups;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getItems() {
        return this.items;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getRequired() {
        return this.required;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final p1 getValue() {
        return this.value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj2;
        return Intrinsics.f(this.id, o1Var.id) && this.required == o1Var.required && this.isMultipleSelection == o1Var.isMultipleSelection && Intrinsics.f(this.groups, o1Var.groups) && Intrinsics.f(this.items, o1Var.items) && Intrinsics.f(this.value, o1Var.value);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsMultipleSelection() {
        return this.isMultipleSelection;
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c(this.id.hashCode() * 31, 31, this.required), 31, this.isMultipleSelection);
        List<a> list = this.groups;
        int iD = p.a.d((iC + (list == null ? 0 : list.hashCode())) * 31, 31, this.items);
        p1 p1Var = this.value;
        return iD + (p1Var != null ? p1Var.hashCode() : 0);
    }
}
