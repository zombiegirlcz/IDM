package hfk;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\b\u0010\u0011R\u001a\u0010\u0016\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0014\u001a\u0004\b\u000b\u0010\u0015R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u000f\u0010\u0015¨\u0006\u0018"}, d2 = {"Lhfk/s;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "iconAssetName", "b", "f", "title", "c", "e", "text", "Lhfk/t;", "d", "Lhfk/t;", "()Lhfk/t;", "info", "Lhfk/r;", "Lhfk/r;", "()Lhfk/r;", "primaryButton", "secondaryButton", "feature_retail_pricing_plans_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("iconAssetName")
    private final String iconAssetName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("text")
    @NotNull
    private final String text;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("info")
    private final t info;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("primaryButton")
    @NotNull
    private final r primaryButton;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("secondaryButton")
    private final r secondaryButton;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getIconAssetName() {
        return this.iconAssetName;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final t getInfo() {
        return this.info;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final r getPrimaryButton() {
        return this.primaryButton;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final r getSecondaryButton() {
        return this.secondaryButton;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.iconAssetName, sVar.iconAssetName) && Intrinsics.f(this.title, sVar.title) && Intrinsics.f(this.text, sVar.text) && Intrinsics.f(this.info, sVar.info) && Intrinsics.f(this.primaryButton, sVar.primaryButton) && Intrinsics.f(this.secondaryButton, sVar.secondaryButton);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        String str = this.iconAssetName;
        int iC = p.a.c(p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.title), 31, this.text);
        t tVar = this.info;
        int iHashCode = (this.primaryButton.hashCode() + ((iC + (tVar == null ? 0 : tVar.hashCode())) * 31)) * 31;
        r rVar = this.secondaryButton;
        return iHashCode + (rVar != null ? rVar.hashCode() : 0);
    }
}
