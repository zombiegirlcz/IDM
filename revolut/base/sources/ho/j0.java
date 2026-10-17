package ho;

import android.content.Context;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.analytics.tracking.v3.fail_fast.exceptions.FailFastAnalyticsException;
import grl.k9;
import grl.od;
import grl.q6;
import grl.w2;
import grl.x0;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class j0 implements mn.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ecm.q f154174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f154175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final no.n f154176c;
    public volatile HashMap d;

    public j0(ecm.q analyticsExceptionHandler, Context context, no.n productType) {
        Intrinsics.checkNotNullParameter(analyticsExceptionHandler, "analyticsExceptionHandler");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(productType, "productType");
        this.f154174a = analyticsExceptionHandler;
        this.f154175b = context;
        this.f154176c = productType;
    }

    @Override // mn.b
    public final Map a() throws Throwable {
        Parcelable business;
        if (this.d == null && this.d == null) {
            this.d = new HashMap();
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f154175b.getAssets().open("aqueduct_products.properties")));
                try {
                    for (String str : jh.d.m(bufferedReader)) {
                        if (!kotlin.text.d0.W(str) && !kotlin.text.a0.H(str, "#", false)) {
                            List listN0 = kotlin.text.d0.n0(str, new String[]{"="}, 0, 6);
                            if (listN0.size() != 2) {
                                zhm.h0 h0Var = zhm.h0.f322473a;
                                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                rd0.d.a(rd0.c.ERROR, "AnalyticsProductMapper", "unexpected value " + str, null, h0Var);
                            } else {
                                String str2 = (String) listN0.get(0);
                                String str3 = (String) listN0.get(1);
                                if (kotlin.text.d0.W(str3)) {
                                    zhm.h0 h0Var2 = zhm.h0.f322473a;
                                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                                    rd0.d.a(rd0.c.ERROR, "AnalyticsProductMapper", "no product for " + str2, null, h0Var2);
                                } else {
                                    try {
                                        int i = i0.f154170a[this.f154176c.ordinal()];
                                        if (i == 1) {
                                            x0 value = x0.valueOf(str3);
                                            Parcelable.Creator<AnalyticsProduct.Business> creator = AnalyticsProduct.Business.CREATOR;
                                            Intrinsics.checkNotNullParameter(value, "value");
                                            business = new AnalyticsProduct.Business(value);
                                        } else if (i == 2) {
                                            q6 value2 = q6.valueOf(str3);
                                            Parcelable.Creator<AnalyticsProduct.Junior> creator2 = AnalyticsProduct.Junior.CREATOR;
                                            Intrinsics.checkNotNullParameter(value2, "value");
                                            business = new AnalyticsProduct.Junior(value2);
                                        } else if (i == 3) {
                                            k9 value3 = k9.valueOf(str3);
                                            Parcelable.Creator<AnalyticsProduct.Retail> creator3 = AnalyticsProduct.Retail.CREATOR;
                                            Intrinsics.checkNotNullParameter(value3, "value");
                                            business = new AnalyticsProduct.Retail(value3);
                                        } else if (i == 4) {
                                            w2 value4 = w2.valueOf(str3);
                                            Parcelable.Creator<AnalyticsProduct.RevolutX> creator4 = AnalyticsProduct.RevolutX.CREATOR;
                                            Intrinsics.checkNotNullParameter(value4, "value");
                                            business = new AnalyticsProduct.RevolutX(value4);
                                        } else {
                                            if (i != 5) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            od value5 = od.valueOf(str3);
                                            Parcelable.Creator<AnalyticsProduct.Terminal> creator5 = AnalyticsProduct.Terminal.CREATOR;
                                            Intrinsics.checkNotNullParameter(value5, "value");
                                            business = new AnalyticsProduct.Terminal(value5);
                                        }
                                    } catch (Exception unused) {
                                        business = null;
                                    }
                                    if (business == null) {
                                        zhm.h0 h0Var3 = zhm.h0.f322473a;
                                        CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                                        rd0.d.a(rd0.c.ERROR, "AnalyticsProductMapper", "Unknown product " + this.f154176c + "." + str3, null, h0Var3);
                                    } else {
                                        HashMap map = this.d;
                                        if (map != null) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                    Unit unit = Unit.f186387a;
                    bufferedReader.close();
                } finally {
                }
            } catch (Exception cause) {
                ecm.q qVar = this.f154174a;
                Intrinsics.checkNotNullParameter("error while parsing aqueduct_products.properties", "message");
                Intrinsics.checkNotNullParameter(cause, "cause");
                qVar.g("AnalyticsProductMapper", new FailFastAnalyticsException("error while parsing aqueduct_products.properties", cause));
            }
        }
        HashMap map2 = this.d;
        if (map2 != null) {
            return map2;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
