package i5a;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f158790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AvatarModel.Default f158791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f158792c;

    public a(TextLocalisedClause textLocalisedClause, AvatarModel.Default avatarModel, Boolean bool) {
        Intrinsics.checkNotNullParameter(avatarModel, "avatarModel");
        this.f158790a = textLocalisedClause;
        this.f158791b = avatarModel;
        this.f158792c = bool;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f158790a.equals(aVar.f158790a) && this.f158791b.equals(aVar.f158791b) && Intrinsics.f(this.f158792c, aVar.f158792c);
    }

    public final int hashCode() {
        int iHashCode = (this.f158791b.hashCode() + (this.f158790a.hashCode() * 31)) * 31;
        Boolean bool = this.f158792c;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }
}
