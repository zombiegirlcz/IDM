package q90;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u001a\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\u0004R\u001a\u0010\u0019\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0005\u0010\u0018R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001a\u0010!\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0006\u001a\u0004\b\u001f\u0010\u0004¨\u0006\""}, d2 = {"Lq90/e4;", "Lq90/v;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "id", "", "Z", "e", "()Z", "required", "", "c", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "maxSelected", "d", "f", "searchHint", "Lq90/d4;", "Lq90/d4;", "()Lq90/d4;", "content", "Lq90/g4;", "Lq90/g4;", "h", "()Lq90/g4;", "value", "g", "preselectedTransactionId", "style", "core_backend_flow_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e4 extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("required")
    private final boolean required;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("maxSelected")
    private final Integer maxSelected;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("searchHint")
    @NotNull
    private final String searchHint;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("content")
    @NotNull
    private final d4 content;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("value")
    private final g4 value;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("preselectedTransactionId")
    private final String preselectedTransactionId;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("style")
    @NotNull
    private final String style;

    public e4(String id10, boolean z, Integer num, String searchHint, d4 content, g4 g4Var, String str, String style) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(searchHint, "searchHint");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(style, "style");
        this.id = id10;
        this.required = z;
        this.maxSelected = num;
        this.searchHint = searchHint;
        this.content = content;
        this.value = g4Var;
        this.preselectedTransactionId = str;
        this.style = style;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final d4 getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Integer getMaxSelected() {
        return this.maxSelected;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getPreselectedTransactionId() {
        return this.preselectedTransactionId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getRequired() {
        return this.required;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e4)) {
            return false;
        }
        e4 e4Var = (e4) obj2;
        return Intrinsics.f(this.id, e4Var.id) && this.required == e4Var.required && Intrinsics.f(this.maxSelected, e4Var.maxSelected) && Intrinsics.f(this.searchHint, e4Var.searchHint) && Intrinsics.f(this.content, e4Var.content) && Intrinsics.f(this.value, e4Var.value) && Intrinsics.f(this.preselectedTransactionId, e4Var.preselectedTransactionId) && Intrinsics.f(this.style, e4Var.style);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getSearchHint() {
        return this.searchHint;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final g4 getValue() {
        return this.value;
    }

    public final int hashCode() {
        int iC = j6.a.c(this.id.hashCode() * 31, 31, this.required);
        Integer num = this.maxSelected;
        int iHashCode = (this.content.hashCode() + p.a.c((iC + (num == null ? 0 : num.hashCode())) * 31, 31, this.searchHint)) * 31;
        g4 g4Var = this.value;
        int iHashCode2 = (iHashCode + (g4Var == null ? 0 : g4Var.hashCode())) * 31;
        String str = this.preselectedTransactionId;
        return this.style.hashCode() + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }
}
