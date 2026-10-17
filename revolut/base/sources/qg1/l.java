package qg1;

import com.revolut.data.model.Data;
import com.revolut.feature.add_card_to_google_pay.integration.api.model.SharedRevolutCardWrapper;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class l implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedRevolutCardWrapper f245633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f245634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f245635c;
    public final o5l.g d;

    public l(SharedRevolutCardWrapper cardWrapper, boolean z, Data designConfig, o5l.g screenDensity) {
        Intrinsics.checkNotNullParameter(cardWrapper, "cardWrapper");
        Intrinsics.checkNotNullParameter(designConfig, "designConfig");
        Intrinsics.checkNotNullParameter(screenDensity, "screenDensity");
        this.f245633a = cardWrapper;
        this.f245634b = z;
        this.f245635c = designConfig;
        this.d = screenDensity;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f245633a, lVar.f245633a) && this.f245634b == lVar.f245634b && Intrinsics.f(this.f245635c, lVar.f245635c) && this.d == lVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + kii.e.c(this.f245635c, j6.a.c(this.f245633a.hashCode() * 31, 31, this.f245634b), 31);
    }
}
