package r5l;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\b\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\n\u0010\u0004¨\u0006\u000e"}, d2 = {"Lr5l/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "maestro", "b", "mastercard", "c", "d", "visa", "multibanco", "cards_shared_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("maestro")
    private final String maestro;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("mastercard")
    private final String mastercard;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("visa")
    private final String visa;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("multibanco")
    private final String multibanco;

    public a(String str, String str2, String str3, String str4) {
        this.maestro = str;
        this.mastercard = str2;
        this.visa = str3;
        this.multibanco = str4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getMaestro() {
        return this.maestro;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getMastercard() {
        return this.mastercard;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getMultibanco() {
        return this.multibanco;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getVisa() {
        return this.visa;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.maestro, aVar.maestro) && Intrinsics.f(this.mastercard, aVar.mastercard) && Intrinsics.f(this.visa, aVar.visa) && Intrinsics.f(this.multibanco, aVar.multibanco);
    }

    public final int hashCode() {
        String str = this.maestro;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.mastercard;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.visa;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.multibanco;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }
}
