package ii;

import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class e implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public dl.a f161494a;

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        dl.a aVar = this.f161494a;
        dl.a aVar2 = ((e) obj2).f161494a;
        return aVar != null ? aVar.equals(aVar2) : aVar2 == null;
    }

    public final int hashCode() {
        dl.a aVar = this.f161494a;
        return (aVar == null ? 43 : aVar.hashCode()) + 59;
    }

    public final String toString() {
        return "HCaptchaInternalConfig(htmlProvider=" + this.f161494a + ")";
    }
}
