package x14;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0012\u001a\u0004\b\u0005\u0010\u0013R\u001a\u0010\u0019\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u001a\u0010\u001d\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u000f\u0010\u001c¨\u0006\u001e"}, d2 = {"Lx14/e;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "f", "title", "Lx14/g;", "b", "Lx14/g;", "d", "()Lx14/g;", "secondDescription", "c", "buttonTitle", "Lx14/a;", "Lx14/a;", "()Lx14/a;", "addPhotoItem", "Lx14/h;", "e", "Lx14/h;", "()Lx14/h;", "successPopup", "Lx14/c;", "Lx14/c;", "()Lx14/c;", "deleteConfirmationPopup", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("secondDescription")
    @NotNull
    private final g secondDescription;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("buttonTitle")
    @NotNull
    private final String buttonTitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("addPhotoItem")
    @NotNull
    private final a addPhotoItem;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("successPopup")
    @NotNull
    private final h successPopup;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("deletePopup")
    @NotNull
    private final c deleteConfirmationPopup;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getAddPhotoItem() {
        return this.addPhotoItem;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final c getDeleteConfirmationPopup() {
        return this.deleteConfirmationPopup;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final g getSecondDescription() {
        return this.secondDescription;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final h getSuccessPopup() {
        return this.successPopup;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.title, eVar.title) && Intrinsics.f(this.secondDescription, eVar.secondDescription) && Intrinsics.f(this.buttonTitle, eVar.buttonTitle) && Intrinsics.f(this.addPhotoItem, eVar.addPhotoItem) && Intrinsics.f(this.successPopup, eVar.successPopup) && Intrinsics.f(this.deleteConfirmationPopup, eVar.deleteConfirmationPopup);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        return this.deleteConfirmationPopup.hashCode() + ((this.successPopup.hashCode() + ((this.addPhotoItem.hashCode() + p.a.c((this.secondDescription.hashCode() + (this.title.hashCode() * 31)) * 31, 31, this.buttonTitle)) * 31)) * 31);
    }
}
