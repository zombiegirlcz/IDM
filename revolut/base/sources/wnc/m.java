package wnc;

import com.revolut.data.model.Data;
import com.revolut.feature.wealth.models.robo.Template;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import zhm.r0;

/* JADX INFO: loaded from: classes6.dex */
public final class m implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f298805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f298806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f298807c;
    public final Template d;
    public final Data e;
    public final Map f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map f298808g;

    public m() {
        this(0);
    }

    public static m a(m mVar, Data data, Data data2, Map map, Template template, Data data3, Map map2, Map map3, int i) {
        if ((i & 1) != 0) {
            data = mVar.f298805a;
        }
        Data data4 = data;
        if ((i & 2) != 0) {
            data2 = mVar.f298806b;
        }
        Data data5 = data2;
        if ((i & 4) != 0) {
            map = mVar.f298807c;
        }
        Map expandedBio = map;
        if ((i & 8) != 0) {
            template = mVar.d;
        }
        Template template2 = template;
        if ((i & 16) != 0) {
            data3 = mVar.e;
        }
        Data data6 = data3;
        if ((i & 32) != 0) {
            map2 = mVar.f;
        }
        Map chartWidgetStates = map2;
        if ((i & 64) != 0) {
            map3 = mVar.f298808g;
        }
        Map riskMetricsMap = map3;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(expandedBio, "expandedBio");
        Intrinsics.checkNotNullParameter(chartWidgetStates, "chartWidgetStates");
        Intrinsics.checkNotNullParameter(riskMetricsMap, "riskMetricsMap");
        return new m(data4, data5, expandedBio, template2, data6, chartWidgetStates, riskMetricsMap);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f298805a, mVar.f298805a) && Intrinsics.f(this.f298806b, mVar.f298806b) && Intrinsics.f(this.f298807c, mVar.f298807c) && Intrinsics.f(this.d, mVar.d) && Intrinsics.f(this.e, mVar.e) && Intrinsics.f(this.f, mVar.f) && Intrinsics.f(this.f298808g, mVar.f298808g);
    }

    public final int hashCode() {
        Data data = this.f298805a;
        int iHashCode = (data == null ? 0 : data.hashCode()) * 31;
        Data data2 = this.f298806b;
        int iE = p.a.e((iHashCode + (data2 == null ? 0 : data2.hashCode())) * 31, 31, this.f298807c);
        Template template = this.d;
        int iHashCode2 = (iE + (template == null ? 0 : template.hashCode())) * 31;
        Data data3 = this.e;
        return this.f298808g.hashCode() + p.a.e((iHashCode2 + (data3 != null ? data3.hashCode() : 0)) * 31, 31, this.f);
    }

    public m(Data data, Data data2, Map expandedBio, Template template, Data data3, Map chartWidgetStates, Map riskMetricsMap) {
        Intrinsics.checkNotNullParameter(expandedBio, "expandedBio");
        Intrinsics.checkNotNullParameter(chartWidgetStates, "chartWidgetStates");
        Intrinsics.checkNotNullParameter(riskMetricsMap, "riskMetricsMap");
        this.f298805a = data;
        this.f298806b = data2;
        this.f298807c = expandedBio;
        this.d = template;
        this.e = data3;
        this.f = chartWidgetStates;
        this.f298808g = riskMetricsMap;
    }

    public /* synthetic */ m(int i) {
        this(null, null, r0.g(), null, null, r0.g(), r0.g());
    }
}
