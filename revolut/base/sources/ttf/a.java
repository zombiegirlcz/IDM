package ttf;

import com.revolut.feature.transfer_reasons.models.reason.TransferReasonsValues;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferReasonsValues f274315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f274316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f274317c;

    public a(TransferReasonsValues reasons, ArrayList operations, String str) {
        Intrinsics.checkNotNullParameter(reasons, "reasons");
        Intrinsics.checkNotNullParameter(operations, "operations");
        this.f274315a = reasons;
        this.f274316b = operations;
        this.f274317c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f274315a.equals(aVar.f274315a) && this.f274316b.equals(aVar.f274316b) && Intrinsics.f(this.f274317c, aVar.f274317c);
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f274316b, this.f274315a.hashCode() * 31, 31);
        String str = this.f274317c;
        return iB + (str == null ? 0 : str.hashCode());
    }
}
