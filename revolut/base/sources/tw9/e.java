package tw9;

import cli.o;
import com.revolut.core.ui_kit.models.ProfileCardModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProfileCardModel.Loaded f274956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f274957b;

    public e(ProfileCardModel.Loaded cardModel, boolean z) {
        Intrinsics.checkNotNullParameter(cardModel, "cardModel");
        this.f274956a = cardModel;
        this.f274957b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f274956a, eVar.f274956a) && this.f274957b == eVar.f274957b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f274957b) + (this.f274956a.hashCode() * 31);
    }
}
