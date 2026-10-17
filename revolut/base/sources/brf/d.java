package brf;

import com.revolut.data.model.Data;
import com.revolut.feature.transfer.core.api.ui.throubleshooter.TransferTroubleshooterType;
import jki.i;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f18003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransferTroubleshooterType f18004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18005c;

    public d(Data data, TransferTroubleshooterType type, String source) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(source, "source");
        this.f18003a = data;
        this.f18004b = type;
        this.f18005c = source;
    }

    public static d a(d dVar, Data data) {
        TransferTroubleshooterType type = dVar.f18004b;
        String source = dVar.f18005c;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(source, "source");
        return new d(data, type, source);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f18003a, dVar.f18003a) && Intrinsics.f(this.f18004b, dVar.f18004b) && Intrinsics.f(this.f18005c, dVar.f18005c);
    }

    public final int hashCode() {
        return this.f18005c.hashCode() + ((this.f18004b.hashCode() + (this.f18003a.hashCode() * 31)) * 31);
    }
}
