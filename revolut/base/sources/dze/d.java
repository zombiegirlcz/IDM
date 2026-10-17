package dze;

import com.revolut.feature.topup_screen.impl.flows.topup.screen.three_ds.CardTopUpThreeDsUiModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardTopUpThreeDsUiModel f121327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cue.d f121328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f121329c;

    public d(CardTopUpThreeDsUiModel cardTopUpThreeDsUiModel, cue.d dVar, boolean z) {
        this.f121327a = cardTopUpThreeDsUiModel;
        this.f121328b = dVar;
        this.f121329c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f121327a, dVar.f121327a) && Intrinsics.f(this.f121328b, dVar.f121328b) && this.f121329c == dVar.f121329c;
    }

    public final int hashCode() {
        CardTopUpThreeDsUiModel cardTopUpThreeDsUiModel = this.f121327a;
        int iHashCode = (cardTopUpThreeDsUiModel == null ? 0 : cardTopUpThreeDsUiModel.hashCode()) * 31;
        cue.d dVar = this.f121328b;
        return Boolean.hashCode(true) + j6.a.c((iHashCode + (dVar != null ? dVar.hashCode() : 0)) * 31, 31, this.f121329c);
    }
}
