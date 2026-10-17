package uo;

import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.analytics.tracking.v3.provider.MissedDefaultProductException;
import com.revolut.analytics.tracking.v3.provider.WrongProductTypeException;
import grl.k9;
import grl.od;
import grl.q6;
import grl.w2;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o implements l {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mn.b f281493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final moi.a f281494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final no.n f281495c;

    public o(mn.b modulesProductsRegistry, moi.a externalScreensProductsRegistry, no.n appProductType) {
        Intrinsics.checkNotNullParameter(modulesProductsRegistry, "modulesProductsRegistry");
        Intrinsics.checkNotNullParameter(externalScreensProductsRegistry, "externalScreensProductsRegistry");
        Intrinsics.checkNotNullParameter(appProductType, "appProductType");
        this.f281493a = modulesProductsRegistry;
        this.f281494b = externalScreensProductsRegistry;
        this.f281495c = appProductType;
    }

    public final AnalyticsProduct b() {
        int i = n.f281492a[this.f281495c.ordinal()];
        if (i == 1) {
            grl.x0 value = grl.x0.Business;
            Parcelable.Creator<AnalyticsProduct.Business> creator = AnalyticsProduct.Business.CREATOR;
            Intrinsics.checkNotNullParameter(value, "value");
            return new AnalyticsProduct.Business(value);
        }
        if (i == 2) {
            q6 value2 = q6.Junior;
            Parcelable.Creator<AnalyticsProduct.Junior> creator2 = AnalyticsProduct.Junior.CREATOR;
            Intrinsics.checkNotNullParameter(value2, "value");
            return new AnalyticsProduct.Junior(value2);
        }
        if (i == 3) {
            k9 k9Var = k9.Retail;
            Parcelable.Creator<AnalyticsProduct.Retail> creator3 = AnalyticsProduct.Retail.CREATOR;
            return com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
        }
        if (i == 4) {
            w2 value3 = w2.RevolutX;
            Parcelable.Creator<AnalyticsProduct.RevolutX> creator4 = AnalyticsProduct.RevolutX.CREATOR;
            Intrinsics.checkNotNullParameter(value3, "value");
            return new AnalyticsProduct.RevolutX(value3);
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        od value4 = od.Terminal;
        Parcelable.Creator<AnalyticsProduct.Terminal> creator5 = AnalyticsProduct.Terminal.CREATOR;
        Intrinsics.checkNotNullParameter(value4, "value");
        return new AnalyticsProduct.Terminal(value4);
    }

    public final AnalyticsProduct c(String str, Map map) {
        while (true) {
            Object obj2 = map.get(str);
            if (obj2 instanceof k9) {
                k9 k9Var = (k9) obj2;
                Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                return com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
            }
            if (obj2 instanceof grl.x0) {
                grl.x0 value = (grl.x0) obj2;
                Parcelable.Creator<AnalyticsProduct.Business> creator2 = AnalyticsProduct.Business.CREATOR;
                Intrinsics.checkNotNullParameter(value, "value");
                return new AnalyticsProduct.Business(value);
            }
            if (obj2 instanceof q6) {
                q6 value2 = (q6) obj2;
                Parcelable.Creator<AnalyticsProduct.Junior> creator3 = AnalyticsProduct.Junior.CREATOR;
                Intrinsics.checkNotNullParameter(value2, "value");
                return new AnalyticsProduct.Junior(value2);
            }
            if (obj2 instanceof w2) {
                w2 value3 = (w2) obj2;
                Parcelable.Creator<AnalyticsProduct.RevolutX> creator4 = AnalyticsProduct.RevolutX.CREATOR;
                Intrinsics.checkNotNullParameter(value3, "value");
                return new AnalyticsProduct.RevolutX(value3);
            }
            if (obj2 instanceof AnalyticsProduct) {
                return ((AnalyticsProduct) obj2).J3(this.f281495c);
            }
            if (!kotlin.text.d0.K(str, CoreConstants.DOT)) {
                return null;
            }
            str = kotlin.text.d0.B0(CoreConstants.DOT, str, str);
        }
    }

    public final AnalyticsProduct d(Object obj2, AnalyticsProduct analyticsProduct) {
        no.n nVar;
        AnalyticsProduct business;
        no.m mVar;
        AnalyticsProduct analyticsProduct2 = null;
        try {
            mVar = obj2 instanceof no.m ? (no.m) obj2 : null;
        } catch (Exception e) {
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
        }
        AnalyticsProduct q5 = mVar != null ? mVar.getQ() : null;
        if (q5 != null) {
            no.n nVar2 = this.f281495c;
            if (!q5.k2(nVar2) && !q5.v3(nVar2)) {
                AnalyticsProduct analyticsProductJ3 = q5.J3(nVar2);
                if (analyticsProductJ3 instanceof AnalyticsProduct.Business) {
                    nVar = no.n.Business;
                } else if (analyticsProductJ3 instanceof AnalyticsProduct.Junior) {
                    nVar = no.n.Junior;
                } else if (analyticsProductJ3 instanceof AnalyticsProduct.Retail) {
                    nVar = no.n.Retail;
                } else if (analyticsProductJ3 instanceof AnalyticsProduct.RevolutX) {
                    nVar = no.n.RevolutX;
                } else {
                    if (analyticsProductJ3 instanceof AnalyticsProduct.Shared) {
                        throw new IllegalStateException("not expected shared product " + analyticsProductJ3);
                    }
                    if (!(analyticsProductJ3 instanceof AnalyticsProduct.Terminal)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    nVar = no.n.Terminal;
                }
                if (nVar == nVar2) {
                    analyticsProduct2 = analyticsProductJ3;
                } else {
                    String strM3 = analyticsProductJ3.M3(nVar);
                    try {
                        int i = n.f281492a[nVar2.ordinal()];
                        if (i == 1) {
                            grl.x0 value = grl.x0.valueOf(strM3);
                            Parcelable.Creator<AnalyticsProduct.Business> creator = AnalyticsProduct.Business.CREATOR;
                            Intrinsics.checkNotNullParameter(value, "value");
                            business = new AnalyticsProduct.Business(value);
                        } else if (i == 2) {
                            q6 value2 = q6.valueOf(strM3);
                            Parcelable.Creator<AnalyticsProduct.Junior> creator2 = AnalyticsProduct.Junior.CREATOR;
                            Intrinsics.checkNotNullParameter(value2, "value");
                            business = new AnalyticsProduct.Junior(value2);
                        } else if (i == 3) {
                            k9 value3 = k9.valueOf(strM3);
                            Parcelable.Creator<AnalyticsProduct.Retail> creator3 = AnalyticsProduct.Retail.CREATOR;
                            Intrinsics.checkNotNullParameter(value3, "value");
                            business = new AnalyticsProduct.Retail(value3);
                        } else if (i == 4) {
                            w2 value4 = w2.valueOf(strM3);
                            Parcelable.Creator<AnalyticsProduct.RevolutX> creator4 = AnalyticsProduct.RevolutX.CREATOR;
                            Intrinsics.checkNotNullParameter(value4, "value");
                            business = new AnalyticsProduct.RevolutX(value4);
                        } else {
                            if (i != 5) {
                                throw new NoWhenBranchMatchedException();
                            }
                            od value5 = od.valueOf(strM3);
                            Parcelable.Creator<AnalyticsProduct.Terminal> creator5 = AnalyticsProduct.Terminal.CREATOR;
                            Intrinsics.checkNotNullParameter(value5, "value");
                            business = new AnalyticsProduct.Terminal(value5);
                        }
                        analyticsProduct2 = business;
                    } catch (Exception unused) {
                        WrongProductTypeException wrongProductTypeException = new WrongProductTypeException(obj2, j6.a.w(p.a.t(obj2.getClass().getCanonicalName(), " has wrong product type: ", nVar.name(), ".", strM3), ", expected ", nVar2.name(), ".", strM3));
                        zhm.h0 h0Var2 = zhm.h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, "AnalyticsProductMapper", null, wrongProductTypeException, h0Var2);
                        analyticsProduct2 = analyticsProductJ3;
                    }
                }
            }
        }
        if (analyticsProduct2 != null) {
            return analyticsProduct2;
        }
        AnalyticsProduct analyticsProductF = f(obj2);
        return analyticsProductF == null ? analyticsProduct == null ? b() : analyticsProduct : analyticsProductF;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x002e, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x002e, code lost:
    
        r0 = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.analytics.tracking.v3.AnalyticsProduct e(java.lang.Object r4, com.revolut.analytics.tracking.v3.AnalyticsProduct r5) {
        /*
            r3 = this;
            if (r4 != 0) goto La
            if (r5 != 0) goto L9
            com.revolut.analytics.tracking.v3.AnalyticsProduct r4 = r3.b()
            return r4
        L9:
            return r5
        La:
            boolean r0 = r4 instanceof ho.h0
            if (r0 == 0) goto L62
            boolean r0 = r4 instanceof com.revolut.kompot.navigable.a
            r1 = 0
            if (r0 == 0) goto L19
            r0 = r4
            com.revolut.kompot.navigable.a r0 = (com.revolut.kompot.navigable.a) r0
            com.revolut.kompot.navigable.a r0 = r0.f98405m
            goto L2e
        L19:
            boolean r0 = r4 instanceof androidx.fragment.app.Fragment
            if (r0 == 0) goto L2d
            r0 = r4
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            androidx.fragment.app.Fragment r2 = r0.getParentFragment()
            if (r2 != 0) goto L2b
            androidx.fragment.app.FragmentActivity r0 = r0.getActivity()
            goto L2e
        L2b:
            r0 = r2
            goto L2e
        L2d:
            r0 = r1
        L2e:
            if (r0 == 0) goto L53
            boolean r2 = r0 instanceof ho.h0
            if (r2 == 0) goto L4e
            boolean r2 = r0 instanceof com.revolut.kompot.navigable.a
            if (r2 == 0) goto L3d
            com.revolut.kompot.navigable.a r0 = (com.revolut.kompot.navigable.a) r0
            com.revolut.kompot.navigable.a r0 = r0.f98405m
            goto L2e
        L3d:
            boolean r2 = r0 instanceof androidx.fragment.app.Fragment
            if (r2 == 0) goto L2d
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            androidx.fragment.app.Fragment r2 = r0.getParentFragment()
            if (r2 != 0) goto L2b
            androidx.fragment.app.FragmentActivity r0 = r0.getActivity()
            goto L2e
        L4e:
            com.revolut.analytics.tracking.v3.AnalyticsProduct r4 = r3.d(r0, r5)
            return r4
        L53:
            com.revolut.analytics.tracking.v3.AnalyticsProduct r4 = r3.f(r4)
            if (r4 != 0) goto L61
            if (r5 != 0) goto L60
            com.revolut.analytics.tracking.v3.AnalyticsProduct r4 = r3.b()
            return r4
        L60:
            return r5
        L61:
            return r4
        L62:
            com.revolut.analytics.tracking.v3.AnalyticsProduct r4 = r3.d(r4, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: uo.o.e(java.lang.Object, com.revolut.analytics.tracking.v3.AnalyticsProduct):com.revolut.analytics.tracking.v3.AnalyticsProduct");
    }

    public final AnalyticsProduct f(Object obj2) {
        String name = obj2.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        String strB0 = kotlin.text.d0.B0(CoreConstants.DOT, name, name);
        AnalyticsProduct analyticsProductC = c(strB0, this.f281493a.a());
        if (analyticsProductC != null) {
            return analyticsProductC;
        }
        AnalyticsProduct analyticsProductC2 = c(strB0, this.f281494b.a());
        if (analyticsProductC2 != null) {
            return analyticsProductC2;
        }
        MissedDefaultProductException missedDefaultProductException = new MissedDefaultProductException(obj2);
        zhm.h0 h0Var = zhm.h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "AnalyticsProductMapper", null, missedDefaultProductException, h0Var);
        return null;
    }
}
