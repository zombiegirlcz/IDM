package nx4;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0017\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0005\u0010\u0016R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b\t\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004¨\u0006\u001a"}, d2 = {"Lnx4/t2;", "Lnx4/m0;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "id", "b", "e", "title", "g", "titleIcon", "Lnx4/n;", "d", "Lnx4/n;", "f", "()Lnx4/n;", "titleAction", "", "Z", "()Z", "checked", "customSwitchAction", "parameterKey", "feature_credit_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class t2 implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("name")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("titleIcon")
    private final String titleIcon;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("titleAction")
    private final n titleAction;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("checked")
    private final boolean checked;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("customSwitchAction")
    private final n customSwitchAction;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("parameterKey")
    @NotNull
    private final String parameterKey;

    public t2(String id10, String title, String str, n nVar, boolean z, n nVar2, String parameterKey) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(parameterKey, "parameterKey");
        this.id = id10;
        this.title = title;
        this.titleIcon = str;
        this.titleAction = nVar;
        this.checked = z;
        this.customSwitchAction = nVar2;
        this.parameterKey = parameterKey;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getChecked() {
        return this.checked;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final n getCustomSwitchAction() {
        return this.customSwitchAction;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getParameterKey() {
        return this.parameterKey;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t2)) {
            return false;
        }
        t2 t2Var = (t2) obj2;
        return Intrinsics.f(this.id, t2Var.id) && Intrinsics.f(this.title, t2Var.title) && Intrinsics.f(this.titleIcon, t2Var.titleIcon) && Intrinsics.f(this.titleAction, t2Var.titleAction) && this.checked == t2Var.checked && Intrinsics.f(this.customSwitchAction, t2Var.customSwitchAction) && Intrinsics.f(this.parameterKey, t2Var.parameterKey);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final n getTitleAction() {
        return this.titleAction;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getTitleIcon() {
        return this.titleIcon;
    }

    public final int hashCode() {
        int iC = p.a.c(this.id.hashCode() * 31, 31, this.title);
        String str = this.titleIcon;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        n nVar = this.titleAction;
        int iC2 = j6.a.c((iHashCode + (nVar == null ? 0 : nVar.hashCode())) * 31, 31, this.checked);
        n nVar2 = this.customSwitchAction;
        return this.parameterKey.hashCode() + ((iC2 + (nVar2 != null ? nVar2.hashCode() : 0)) * 31);
    }
}
