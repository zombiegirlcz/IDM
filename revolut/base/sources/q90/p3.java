package q90;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\u0004R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u001c\u0010\u0004¨\u0006\u001e"}, d2 = {"Lq90/p3;", "Lq90/m4;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getId", "id", "b", "g", "previousViewId", "", "c", "Ljava/lang/Boolean;", "j", "()Ljava/lang/Boolean;", "skippable", "", "Lq90/h4;", "d", "Ljava/util/List;", "f", "()Ljava/util/List;", "next", "e", "k", "storyId", "i", "schemaId", "core_backend_flow_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class p3 extends m4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("previousViewId")
    private final String previousViewId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("skippable")
    private final Boolean skippable;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("next")
    private final List<h4> next;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("storyId")
    @NotNull
    private final String storyId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("schemaId")
    private final String schemaId;

    public p3(String id10, String str, Boolean bool, ArrayList arrayList, String storyId, String str2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(storyId, "storyId");
        this.id = id10;
        this.previousViewId = str;
        this.skippable = bool;
        this.next = arrayList;
        this.storyId = storyId;
        this.schemaId = str2;
    }

    @Override // xl2.t
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p3)) {
            return false;
        }
        p3 p3Var = (p3) obj2;
        return Intrinsics.f(this.id, p3Var.id) && Intrinsics.f(this.previousViewId, p3Var.previousViewId) && Intrinsics.f(this.skippable, p3Var.skippable) && Intrinsics.f(this.next, p3Var.next) && Intrinsics.f(this.storyId, p3Var.storyId) && Intrinsics.f(this.schemaId, p3Var.schemaId);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final List getNext() {
        return this.next;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getPreviousViewId() {
        return this.previousViewId;
    }

    public final String getId() {
        return this.id;
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.previousViewId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.skippable;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<h4> list = this.next;
        int iC = p.a.c((iHashCode3 + (list == null ? 0 : list.hashCode())) * 31, 31, this.storyId);
        String str2 = this.schemaId;
        return iC + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getSchemaId() {
        return this.schemaId;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Boolean getSkippable() {
        return this.skippable;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getStoryId() {
        return this.storyId;
    }
}
