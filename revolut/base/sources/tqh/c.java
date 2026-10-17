package tqh;

import com.revolut.data.model.Data;
import com.revolut.shared.feature.wealth.models.screener.ScreenerSortingOptions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements cli.j {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f273570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f273571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f273572c;
    public final Data d;
    public final ScreenerSortingOptions e;
    public final boolean f;

    public c(String widgetId, b bVar, Data data, Data data2, ScreenerSortingOptions screenerSortingOptions, boolean z) {
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        this.f273570a = widgetId;
        this.f273571b = bVar;
        this.f273572c = data;
        this.d = data2;
        this.e = screenerSortingOptions;
        this.f = z;
    }

    public static c a(c cVar, Data data, Data data2, boolean z, int i) {
        String widgetId = cVar.f273570a;
        b bVar = cVar.f273571b;
        if ((i & 4) != 0) {
            data = cVar.f273572c;
        }
        Data data3 = data;
        if ((i & 8) != 0) {
            data2 = cVar.d;
        }
        Data data4 = data2;
        cVar.getClass();
        ScreenerSortingOptions screenerSortingOptions = cVar.e;
        cVar.getClass();
        if ((i & 128) != 0) {
            z = cVar.f;
        }
        cVar.getClass();
        cVar.getClass();
        cVar.getClass();
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        return new c(widgetId, bVar, data3, data4, screenerSortingOptions, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f273570a, cVar.f273570a) && this.f273571b.equals(cVar.f273571b) && Intrinsics.f(this.f273572c, cVar.f273572c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && this.f == cVar.f;
    }

    public final int hashCode() {
        int iHashCode = (this.f273571b.hashCode() + (this.f273570a.hashCode() * 31)) * 31;
        Data data = this.f273572c;
        int iHashCode2 = (iHashCode + (data == null ? 0 : data.hashCode())) * 31;
        Data data2 = this.d;
        int iHashCode3 = (iHashCode2 + (data2 == null ? 0 : data2.hashCode())) * 961;
        ScreenerSortingOptions screenerSortingOptions = this.e;
        return j6.a.c((iHashCode3 + (screenerSortingOptions != null ? screenerSortingOptions.hashCode() : 0)) * 961, 961, this.f);
    }
}
