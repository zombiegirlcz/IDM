package nx4;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0014\u001a\u0004\b\u0005\u0010\u0015¨\u0006\u0017"}, d2 = {"Lnx4/h2;", "Lnx4/m0;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "name", "b", "f", "title", "c", "g", "titleStyle", "d", "description", "buttonText", "buttonIcon", "Lnx4/n;", "Lnx4/n;", "()Lnx4/n;", "action", "feature_credit_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class h2 implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("name")
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("titleStyle")
    private final String titleStyle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("description")
    private final String description;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("buttonText")
    @NotNull
    private final String buttonText;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("buttonIcon")
    private final String buttonIcon;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("action")
    private final n action;

    public h2(String name, String title, String str, String str2, String buttonText, String str3, n nVar) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        this.name = name;
        this.title = title;
        this.titleStyle = str;
        this.description = str2;
        this.buttonText = buttonText;
        this.buttonIcon = str3;
        this.action = nVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final n getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getButtonIcon() {
        return this.buttonIcon;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getButtonText() {
        return this.buttonText;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h2)) {
            return false;
        }
        h2 h2Var = (h2) obj2;
        return Intrinsics.f(this.name, h2Var.name) && Intrinsics.f(this.title, h2Var.title) && Intrinsics.f(this.titleStyle, h2Var.titleStyle) && Intrinsics.f(this.description, h2Var.description) && Intrinsics.f(this.buttonText, h2Var.buttonText) && Intrinsics.f(this.buttonIcon, h2Var.buttonIcon) && Intrinsics.f(this.action, h2Var.action);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getTitleStyle() {
        return this.titleStyle;
    }

    public final int hashCode() {
        int iC = p.a.c(this.name.hashCode() * 31, 31, this.title);
        String str = this.titleStyle;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        int iC2 = p.a.c((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.buttonText);
        String str3 = this.buttonIcon;
        int iHashCode2 = (iC2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        n nVar = this.action;
        return iHashCode2 + (nVar != null ? nVar.hashCode() : 0);
    }
}
