package orf;

import com.revolut.feature.transfer.models.quotes.TransferAvailability;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lorf/c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getType", "type", "b", "getArrivalNote", "arrivalNote", "Lorf/d;", "c", "Lorf/d;", "getReason", "()Lorf/d;", "reason", "feature_transfer_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("arrivalNote")
    private final String arrivalNote;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("reason")
    private final d reason;

    public final TransferAvailability a() {
        nrf.b bVar;
        String str = this.type;
        nrf.b[] bVarArrValues = nrf.b.values();
        int length = bVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                bVar = null;
                break;
            }
            bVar = bVarArrValues[i];
            if (a0.z(bVar.name(), str, true)) {
                break;
            }
            i++;
        }
        if (bVar == null) {
            bVar = nrf.b.UNKNOWN;
        }
        d dVar = this.reason;
        return new TransferAvailability(bVar, dVar != null ? dVar.a() : null, this.arrivalNote);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.type, cVar.type) && Intrinsics.f(this.arrivalNote, cVar.arrivalNote) && Intrinsics.f(this.reason, cVar.reason);
    }

    public final int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        String str = this.arrivalNote;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        d dVar = this.reason;
        return iHashCode2 + (dVar != null ? dVar.hashCode() : 0);
    }
}
