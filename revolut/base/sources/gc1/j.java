package gc1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class j implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f142302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f142303b;

    public j(List actions, List cardReaderSettingsListings) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(cardReaderSettingsListings, "cardReaderSettingsListings");
        this.f142302a = actions;
        this.f142303b = cardReaderSettingsListings;
    }

    public static j a(j jVar, List actions, List cardReaderSettingsListings, int i) {
        if ((i & 1) != 0) {
            actions = jVar.f142302a;
        }
        if ((i & 2) != 0) {
            cardReaderSettingsListings = jVar.f142303b;
        }
        jVar.getClass();
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(cardReaderSettingsListings, "cardReaderSettingsListings");
        return new j(actions, cardReaderSettingsListings);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f142302a, jVar.f142302a) && Intrinsics.f(this.f142303b, jVar.f142303b);
    }

    public final int hashCode() {
        return this.f142303b.hashCode() + (this.f142302a.hashCode() * 31);
    }
}
