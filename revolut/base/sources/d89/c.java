package d89;

import h30.l;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f112162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f112163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f112164c;
    public final List d;

    public c(ArrayList blockingPockets, ArrayList types, xi0.b baseCurrency, List rates) {
        Intrinsics.checkNotNullParameter(blockingPockets, "blockingPockets");
        Intrinsics.checkNotNullParameter(types, "types");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        Intrinsics.checkNotNullParameter(rates, "rates");
        this.f112162a = blockingPockets;
        this.f112163b = types;
        this.f112164c = baseCurrency;
        this.d = rates;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f112162a.equals(cVar.f112162a) && this.f112163b.equals(cVar.f112163b) && Intrinsics.f(this.f112164c, cVar.f112164c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + l.j(this.f112164c, com.google.android.gms.internal.mlkit_vision_face.a.b(this.f112163b, this.f112162a.hashCode() * 31, 31), 31);
    }
}
