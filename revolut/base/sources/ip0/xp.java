package ip0;

import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class xp implements koi.j, tw0.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CdnImage f167203a;

    public xp(CdnImage background) {
        Intrinsics.checkNotNullParameter("ID_DOCUMENT_LOADING", "listId");
        Intrinsics.checkNotNullParameter(background, "background");
        this.f167203a = background;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF58244a() {
        return "ID_DOCUMENT_LOADING";
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof xp) && this.f167203a.equals(((xp) obj2).f167203a);
    }

    public final int hashCode() {
        return this.f167203a.hashCode() + 619099876;
    }
}
