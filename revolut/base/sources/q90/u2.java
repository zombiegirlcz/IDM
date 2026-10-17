package q90;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001:\u0002\u0007\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0011\u001a\u0004\b\u0005\u0010\u0012R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00148\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0019"}, d2 = {"Lq90/u2;", "Lq90/b2;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "id", "", "Z", "d", "()Z", "required", "c", "permission", "Lq90/u2$b;", "Lq90/u2$b;", "()Lq90/u2$b;", "declinedPermissionDialog", "Lq90/x2;", "e", "Lq90/x2;", "()Lq90/x2;", "value", "core_backend_flow_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class u2 extends b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("required")
    private final boolean required;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("permission")
    @NotNull
    private final String permission;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("declinedPermissionDialog")
    private final b declinedPermissionDialog;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("value")
    private final x2 value;

    /* JADX INFO: loaded from: classes19.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\n"}, d2 = {"Lq90/u2$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "type", "title", "core_backend_flow_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("type")
        @NotNull
        private final String type;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        @NotNull
        private final String title;

        public a(String type, String title) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(title, "title");
            this.type = type;
            this.title = title;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getType() {
            return this.type;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.type, aVar.type) && Intrinsics.f(this.title, aVar.title);
        }

        public final int hashCode() {
            return this.title.hashCode() + (this.type.hashCode() * 31);
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0005\u0010\u0010¨\u0006\u0012"}, d2 = {"Lq90/u2$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "assetUrl", "d", "title", "c", "description", "", "Lq90/u2$a;", "Ljava/util/List;", "()Ljava/util/List;", "actions", "core_backend_flow_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("assetUrl")
        @NotNull
        private final String assetUrl;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        @NotNull
        private final String title;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("description")
        @NotNull
        private final String description;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("actions")
        @NotNull
        private final List<a> actions;

        public b(String assetUrl, String title, String description, ArrayList actions) {
            Intrinsics.checkNotNullParameter(assetUrl, "assetUrl");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(actions, "actions");
            this.assetUrl = assetUrl;
            this.title = title;
            this.description = description;
            this.actions = actions;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final List getActions() {
            return this.actions;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getAssetUrl() {
            return this.assetUrl;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.assetUrl, bVar.assetUrl) && Intrinsics.f(this.title, bVar.title) && Intrinsics.f(this.description, bVar.description) && Intrinsics.f(this.actions, bVar.actions);
        }

        public final int hashCode() {
            return this.actions.hashCode() + p.a.c(p.a.c(this.assetUrl.hashCode() * 31, 31, this.title), 31, this.description);
        }
    }

    public u2(String id10, boolean z, String permission, b bVar, x2 x2Var) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(permission, "permission");
        this.id = id10;
        this.required = z;
        this.permission = permission;
        this.declinedPermissionDialog = bVar;
        this.value = x2Var;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final b getDeclinedPermissionDialog() {
        return this.declinedPermissionDialog;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPermission() {
        return this.permission;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getRequired() {
        return this.required;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final x2 getValue() {
        return this.value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u2)) {
            return false;
        }
        u2 u2Var = (u2) obj2;
        return Intrinsics.f(this.id, u2Var.id) && this.required == u2Var.required && Intrinsics.f(this.permission, u2Var.permission) && Intrinsics.f(this.declinedPermissionDialog, u2Var.declinedPermissionDialog) && Intrinsics.f(this.value, u2Var.value);
    }

    public final int hashCode() {
        int iC = p.a.c(j6.a.c(this.id.hashCode() * 31, 31, this.required), 31, this.permission);
        b bVar = this.declinedPermissionDialog;
        int iHashCode = (iC + (bVar == null ? 0 : bVar.hashCode())) * 31;
        x2 x2Var = this.value;
        return iHashCode + (x2Var != null ? x2Var.hashCode() : 0);
    }
}
