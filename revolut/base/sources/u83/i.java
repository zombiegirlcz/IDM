package u83;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class i implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f278103a;

    public i(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        this.f278103a = cardId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f278103a, ((i) obj2).f278103a);
    }

    public final int hashCode() {
        return this.f278103a.hashCode();
    }
}
