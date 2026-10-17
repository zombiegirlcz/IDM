package jfb;

import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f173767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f173768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f173769c;

    public /* synthetic */ a(String str, c cVar, int i) {
        this.f173767a = i;
        this.f173768b = str;
        this.f173769c = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f173767a;
        c cVar = this.f173769c;
        String str = this.f173768b;
        switch (i) {
            case 0:
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    double dOptDouble = jSONObject.optDouble("fcpStartTime", -1.0d);
                    Double dValueOf = Double.valueOf(dOptDouble);
                    if (dOptDouble < 0.0d) {
                        dValueOf = null;
                    }
                    if (dValueOf != null) {
                        cVar.f173788c.invoke(dValueOf, Double.valueOf(jSONObject.optDouble("timeOrigin", 0.0d)));
                    }
                } catch (Exception e) {
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "WebAppPerf", j6.a.q("Failed to parse FCP timing JSON: ", e.getMessage()), null, h0Var);
                    return;
                }
                break;
            default:
                try {
                    JSONObject jSONObject2 = new JSONObject(str);
                    double dOptDouble2 = jSONObject2.optDouble("timeOrigin", 0.0d);
                    double dOptDouble3 = jSONObject2.optDouble("responseStart", 0.0d);
                    int iOptInt = jSONObject2.optInt("httpStatus", -1);
                    Integer numValueOf = Integer.valueOf(iOptInt);
                    if (iOptInt < 0) {
                        numValueOf = null;
                    }
                    cVar.f173787b.invoke(Double.valueOf(dOptDouble2), Double.valueOf(dOptDouble3), numValueOf);
                } catch (Exception e2) {
                    zhm.h0 h0Var2 = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "WebAppPerf", j6.a.q("Failed to parse perf timing JSON: ", e2.getMessage()), null, h0Var2);
                }
                break;
        }
    }
}
