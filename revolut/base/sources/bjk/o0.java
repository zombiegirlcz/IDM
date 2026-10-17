package bjk;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u000f\u0010\u0004R\"\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0013\u001a\u0004\b\u0006\u0010\u0014R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u000b\u0010\u0018¨\u0006\u001a"}, d2 = {"Lbjk/o0;", "", "", "toString", "()Ljava/lang/String;", "Lbjk/k0;", "a", "Lbjk/k0;", "c", "()Lbjk/k0;", "avatar", "b", "Ljava/lang/String;", "e", "title", "d", "description", "", "Lbjk/i0;", "Ljava/util/List;", "()Ljava/util/List;", "accessoryTexts", "Lbjk/n0;", "Lbjk/n0;", "()Lbjk/n0;", "action", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("avatar")
    @NotNull
    private final k0 avatar;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("description")
    private final String description;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("accessoryTexts")
    private final List<i0> accessoryTexts;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("action")
    private final n0 action;

    public o0(k0 avatar, String title, String str, ArrayList arrayList, n0 n0Var) {
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        Intrinsics.checkNotNullParameter(title, "title");
        this.avatar = avatar;
        this.title = title;
        this.description = str;
        this.accessoryTexts = arrayList;
        this.action = n0Var;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getAccessoryTexts() {
        return this.accessoryTexts;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final n0 getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final k0 getAvatar() {
        return this.avatar;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj2;
        return Intrinsics.f(this.avatar, o0Var.avatar) && Intrinsics.f(this.title, o0Var.title) && Intrinsics.f(this.description, o0Var.description) && Intrinsics.f(this.accessoryTexts, o0Var.accessoryTexts) && Intrinsics.f(this.action, o0Var.action);
    }

    public final int hashCode() {
        int iC = p.a.c(this.avatar.hashCode() * 31, 31, this.title);
        String str = this.description;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        List<i0> list = this.accessoryTexts;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        n0 n0Var = this.action;
        return iHashCode2 + (n0Var != null ? n0Var.hashCode() : 0);
    }
}
