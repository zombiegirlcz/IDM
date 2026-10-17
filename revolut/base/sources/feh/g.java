package feh;

import com.revolut.data.model.Data;
import fsl.n;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements cli.j, v2h.e, n {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f134618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f134619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f134620c;
    public final e3h.c d;
    public final Data e;
    public final Data f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f134621g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n2h.f f134622h;

    public g(String securityRef, Data data, Data data2, e3h.c historicalChartDomainState, Data data3, Data data4, List list, n2h.f actionsPanelState) {
        Intrinsics.checkNotNullParameter(securityRef, "securityRef");
        Intrinsics.checkNotNullParameter(historicalChartDomainState, "historicalChartDomainState");
        Intrinsics.checkNotNullParameter(actionsPanelState, "actionsPanelState");
        this.f134618a = securityRef;
        this.f134619b = data;
        this.f134620c = data2;
        this.d = historicalChartDomainState;
        this.e = data3;
        this.f = data4;
        this.f134621g = list;
        this.f134622h = actionsPanelState;
    }

    public static g e(g gVar, Data data, Data data2, e3h.c historicalChartDomainState, Data data3, Data data4, List list, n2h.f fVar, int i) {
        Data data5 = data;
        String securityRef = gVar.f134618a;
        if ((i & 2) != 0) {
            data5 = gVar.f134619b;
        }
        if ((i & 4) != 0) {
            data2 = gVar.f134620c;
        }
        if ((i & 8) != 0) {
            historicalChartDomainState = gVar.d;
        }
        if ((i & 16) != 0) {
            data3 = gVar.e;
        }
        if ((i & 32) != 0) {
            data4 = gVar.f;
        }
        if ((i & 64) != 0) {
            list = gVar.f134621g;
        }
        if ((i & 128) != 0) {
            fVar = gVar.f134622h;
        }
        n2h.f actionsPanelState = fVar;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(securityRef, "securityRef");
        Intrinsics.checkNotNullParameter(historicalChartDomainState, "historicalChartDomainState");
        Intrinsics.checkNotNullParameter(actionsPanelState, "actionsPanelState");
        List list2 = list;
        Data data6 = data4;
        Data data7 = data3;
        e3h.c cVar = historicalChartDomainState;
        return new g(securityRef, data5, data2, cVar, data7, data6, list2, actionsPanelState);
    }

    @Override // fsl.n
    public final Data J0() {
        return this.f;
    }

    @Override // fsl.n
    public final Data a() {
        return this.e;
    }

    @Override // v2h.e
    public final Data c() {
        return this.f134620c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f134618a, gVar.f134618a) && Intrinsics.f(this.f134619b, gVar.f134619b) && Intrinsics.f(this.f134620c, gVar.f134620c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e) && Intrinsics.f(this.f, gVar.f) && Intrinsics.f(this.f134621g, gVar.f134621g) && Intrinsics.f(this.f134622h, gVar.f134622h);
    }

    public final int hashCode() {
        int iHashCode = this.f134618a.hashCode() * 31;
        Data data = this.f134619b;
        int iHashCode2 = (iHashCode + (data == null ? 0 : data.hashCode())) * 31;
        Data data2 = this.f134620c;
        int iHashCode3 = (this.d.hashCode() + ((iHashCode2 + (data2 == null ? 0 : data2.hashCode())) * 31)) * 31;
        Data data3 = this.e;
        int iHashCode4 = (iHashCode3 + (data3 == null ? 0 : data3.hashCode())) * 31;
        Data data4 = this.f;
        int iHashCode5 = (iHashCode4 + (data4 == null ? 0 : data4.hashCode())) * 31;
        List list = this.f134621g;
        return this.f134622h.f211545a.hashCode() + ((iHashCode5 + (list != null ? list.hashCode() : 0)) * 31);
    }
}
