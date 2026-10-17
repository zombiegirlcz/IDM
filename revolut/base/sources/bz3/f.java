package bz3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f19920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f19921c;
    public final b d;
    public final e e;
    public final c f;

    public f(String title, d secondDescription, String buttonTitle, b addPhotoItem, e successPopup, c deleteConfirmationPopup) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(secondDescription, "secondDescription");
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        Intrinsics.checkNotNullParameter(addPhotoItem, "addPhotoItem");
        Intrinsics.checkNotNullParameter(successPopup, "successPopup");
        Intrinsics.checkNotNullParameter(deleteConfirmationPopup, "deleteConfirmationPopup");
        this.f19919a = title;
        this.f19920b = secondDescription;
        this.f19921c = buttonTitle;
        this.d = addPhotoItem;
        this.e = successPopup;
        this.f = deleteConfirmationPopup;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f19919a, fVar.f19919a) && Intrinsics.f(this.f19920b, fVar.f19920b) && Intrinsics.f(this.f19921c, fVar.f19921c) && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e) && Intrinsics.f(this.f, fVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + p.a.c((this.d.hashCode() + p.a.c((this.f19920b.hashCode() + (this.f19919a.hashCode() * 31)) * 31, 31, this.f19921c)) * 31, 31, this.e.f19918a);
    }
}
