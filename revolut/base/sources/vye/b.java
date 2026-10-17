package vye;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.topup_screen.api.descriptor.CardDetailsScreenDescriptor$OutputData$CardData;
import com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends SelectedMethod {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f293298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f293299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Image f293300c;
    public final Clause d;
    public final CardDetailsScreenDescriptor$OutputData$CardData e;

    public b(Clause title, Clause clause, Image logo, Clause clause2, CardDetailsScreenDescriptor$OutputData$CardData cardDetailsScreenDescriptor$OutputData$CardData) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(logo, "logo");
        this.f293298a = title;
        this.f293299b = clause;
        this.f293300c = logo;
        this.d = clause2;
        this.e = cardDetailsScreenDescriptor$OutputData$CardData;
    }

    @Override // com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod
    /* JADX INFO: renamed from: F */
    public final Image getD() {
        return this.f293300c;
    }

    @Override // com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod
    /* JADX INFO: renamed from: a */
    public final Clause getF() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f293298a, bVar.f293298a) && Intrinsics.f(this.f293299b, bVar.f293299b) && Intrinsics.f(this.f293300c, bVar.f293300c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e);
    }

    @Override // com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod
    /* JADX INFO: renamed from: getDescription */
    public final Clause getF90905c() {
        return this.f293299b;
    }

    @Override // com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod
    /* JADX INFO: renamed from: getTitle */
    public final Clause getF90904b() {
        return this.f293298a;
    }

    public final int hashCode() {
        int iHashCode = this.f293298a.hashCode() * 31;
        Clause clause = this.f293299b;
        int iC = a10.b.c(this.f293300c, (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31, 31);
        Clause clause2 = this.d;
        int iHashCode2 = (iC + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        CardDetailsScreenDescriptor$OutputData$CardData cardDetailsScreenDescriptor$OutputData$CardData = this.e;
        return iHashCode2 + (cardDetailsScreenDescriptor$OutputData$CardData != null ? cardDetailsScreenDescriptor$OutputData$CardData.hashCode() : 0);
    }
}
