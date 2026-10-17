package aa7;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f2772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f2773c;

    public h(Data ticker, Data chart, String ref2) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(ticker, "ticker");
        Intrinsics.checkNotNullParameter(chart, "chart");
        this.f2771a = ref2;
        this.f2772b = ticker;
        this.f2773c = chart;
    }

    public static h a(h hVar, Data ticker, Data chart, int i) {
        String ref2 = hVar.f2771a;
        if ((i & 2) != 0) {
            ticker = hVar.f2772b;
        }
        if ((i & 4) != 0) {
            chart = hVar.f2773c;
        }
        hVar.getClass();
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(ticker, "ticker");
        Intrinsics.checkNotNullParameter(chart, "chart");
        return new h(ticker, chart, ref2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f2771a, hVar.f2771a) && Intrinsics.f(this.f2772b, hVar.f2772b) && Intrinsics.f(this.f2773c, hVar.f2773c);
    }

    public final int hashCode() {
        return this.f2773c.hashCode() + kii.e.c(this.f2772b, this.f2771a.hashCode() * 31, 31);
    }
}
