package lp0;

import com.revolut.core.ui_kit.delegates.gallery_picker.PersonalisationGalleryTileLoadingDelegate;
import koi.j;
import koi.k;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f198905a;

    public c(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        this.f198905a = listId;
    }

    @Override // koi.j
    public final k T1() {
        return new PersonalisationGalleryTileLoadingDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF53609a() {
        return this.f198905a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f198905a, ((c) obj2).f198905a);
    }

    public final int hashCode() {
        return this.f198905a.hashCode();
    }
}
