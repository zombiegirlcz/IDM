package ip0;

import com.revolut.core.ui_kit.delegates.CardDesignViewDelegate;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class o5 implements koi.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f165622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UrlImage f165623b;

    public o5(String listId, UrlImage cardImage) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(cardImage, "cardImage");
        this.f165622a = listId;
        this.f165623b = cardImage;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new CardDesignViewDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF51552a() {
        return this.f165622a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o5)) {
            return false;
        }
        o5 o5Var = (o5) obj2;
        return Intrinsics.f(this.f165622a, o5Var.f165622a) && this.f165623b.equals(o5Var.f165623b);
    }

    public final int hashCode() {
        return this.f165623b.hashCode() + (this.f165622a.hashCode() * 31);
    }
}
