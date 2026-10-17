package uj7;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f280523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f280524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f280525c;

    public e(Data reasonNotListedInfoData, List possibleReasons, boolean z) {
        Intrinsics.checkNotNullParameter(possibleReasons, "possibleReasons");
        Intrinsics.checkNotNullParameter(reasonNotListedInfoData, "reasonNotListedInfoData");
        this.f280523a = possibleReasons;
        this.f280524b = reasonNotListedInfoData;
        this.f280525c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f280523a, eVar.f280523a) && Intrinsics.f(this.f280524b, eVar.f280524b) && this.f280525c == eVar.f280525c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f280525c) + kii.e.c(this.f280524b, this.f280523a.hashCode() * 31, 31);
    }
}
