package feg;

import cli.j;
import com.revolut.data.model.Data;
import ieg.l;
import ieg.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f134608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f134609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xag.c f134610c;

    public e() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f134608a, eVar.f134608a) && Intrinsics.f(this.f134609b, eVar.f134609b) && Intrinsics.f(this.f134610c, eVar.f134610c);
    }

    public final int hashCode() {
        return this.f134610c.hashCode() + kii.e.c(this.f134609b, this.f134608a.hashCode() * 31, 31);
    }

    public e(Data hotelsProperty, Data roomsListMap, xag.c filters) {
        Intrinsics.checkNotNullParameter(hotelsProperty, "hotelsProperty");
        Intrinsics.checkNotNullParameter(roomsListMap, "roomsListMap");
        Intrinsics.checkNotNullParameter(filters, "filters");
        this.f134608a = hotelsProperty;
        this.f134609b = roomsListMap;
        this.f134610c = filters;
    }

    public e(int i) {
        Data data = new Data(null, null, true, 3, null);
        Data data2 = new Data(null, null, true, 3, null);
        r.Companion.getClass();
        this(data, data2, l.f160719b);
    }
}
