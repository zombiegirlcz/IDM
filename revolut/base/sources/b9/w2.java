package b9;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SurfaceTexture;
import android.graphics.Typeface;
import android.util.Base64;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import b9.w2;
import ch.qos.logback.core.FileAppender;
import ch.qos.logback.core.util.FileSize;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.onfido.android.sdk.capture.internal.config.OnfidoRemoteConfig;
import com.onfido.android.sdk.capture.internal.navigation.Navigator;
import com.onfido.android.sdk.capture.internal.nfc.NfcInteractor;
import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import com.onfido.android.sdk.workflow.internal.workflow.tasks.documentupload.WorkflowSupportedDocumentsStore;
import com.onfido.api.client.token.sdk.ApplicantId;
import com.onfido.javax.inject.Provider;
import com.onfido.workflow.WorkflowConfig;
import com.onfido.workflow.internal.network.WorkflowApi;
import com.revolut.core.ui_kit.internal.views.diagram.TrendView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.shops.api.model.ShopsCampaignOffer;
import com.revolut.feature.shops.impl.service.AdvertisingService;
import com.revolut.feature.statements.api.documents_hub.period.StatementPeriodSelection;
import com.revolut.feature.statements.api.models.StatementPeriod;
import com.revolut.feature.statements.impl.ui.documents_hub.custom_filter.CustomFilterCalculationException;
import com.revolut.feature_exchange.impl.ui.order_details_kompot.OrderDetailsScreenContract$InputData;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.TimeUnit;
import javax.microedition.khronos.egl.EGL;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlinx.coroutines.flow.Flow;
import kotlinx.serialization.json.Json;
import org.bouncycastle.asn1.BERTags;
import tx0.p4;

/* JADX INFO: loaded from: classes16.dex */
public final class w2 implements ht0.n, dm2.a, el.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static HashSet f13497h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f13499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f13500c;
    public Object d;
    public Object e;
    public Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f13501g;

    public /* synthetic */ w2(el.b bVar, el.b bVar2, el.b bVar3, Provider provider, Provider provider2, Provider provider3, int i) {
        this.f13498a = i;
        this.f13499b = bVar;
        this.f13500c = bVar2;
        this.d = bVar3;
        this.e = provider;
        this.f = provider2;
        this.f13501g = provider3;
    }

    public static mha.s D(List list) {
        Object next;
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            mha.m mVar = ((mha.s) next).f205465c;
            mha.m.Companion.getClass();
            if (mVar.equals(mha.m.e)) {
                break;
            }
        }
        return (mha.s) next;
    }

    public static wxd.z E(wxd.f fVar) {
        Iterator it8 = fVar.f300859b.iterator();
        Object obj2 = null;
        boolean z = false;
        Object obj3 = null;
        while (true) {
            if (it8.hasNext()) {
                Object next = it8.next();
                if (((wxd.z) next) == wxd.z.ACCOUNTS_FILTER) {
                    if (z) {
                        break;
                    }
                    z = true;
                    obj3 = next;
                }
            } else if (z) {
                obj2 = obj3;
            }
        }
        return (wxd.z) obj2;
    }

    public static boolean I(m1 m1Var, long j2) {
        return (m1Var.f13390a & j2) != 0;
    }

    public static Path L(y0 y0Var) {
        Path path = new Path();
        float[] fArr = y0Var.o;
        path.moveTo(fArr[0], fArr[1]);
        int i = 2;
        while (true) {
            float[] fArr2 = y0Var.o;
            if (i >= fArr2.length) {
                break;
            }
            path.lineTo(fArr2[i], fArr2[i + 1]);
            i += 2;
        }
        if (y0Var instanceof z0) {
            path.close();
        }
        if (y0Var.f13459h == null) {
            y0Var.f13459h = f(path);
        }
        return path;
    }

    public static void b(float f, float f4, float f5, float f6, float f32, boolean z, boolean z3, float f35, float f36, w0 w0Var) {
        if (f == f35 && f4 == f36) {
            return;
        }
        if (f5 == BitmapDescriptorFactory.HUE_RED || f6 == BitmapDescriptorFactory.HUE_RED) {
            w0Var.lineTo(f35, f36);
            return;
        }
        float fAbs = Math.abs(f5);
        float fAbs2 = Math.abs(f6);
        double radians = Math.toRadians(((double) f32) % 360.0d);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double d = ((double) (f - f35)) / 2.0d;
        double d5 = ((double) (f4 - f36)) / 2.0d;
        double d6 = (dSin * d5) + (dCos * d);
        double d10 = (dCos * d5) + ((-dSin) * d);
        double d15 = fAbs * fAbs;
        double d41 = fAbs2 * fAbs2;
        double d51 = d6 * d6;
        double d68 = d10 * d10;
        double d81 = (d68 / d41) + (d51 / d15);
        if (d81 > 0.99999d) {
            double dSqrt = Math.sqrt(d81) * 1.00001d;
            fAbs = (float) (((double) fAbs) * dSqrt);
            fAbs2 = (float) (dSqrt * ((double) fAbs2));
            d15 = fAbs * fAbs;
            d41 = fAbs2 * fAbs2;
        }
        double d82 = z == z3 ? -1.0d : 1.0d;
        double d95 = d15 * d41;
        double d100 = d15 * d68;
        double d101 = d41 * d51;
        double d102 = ((d95 - d100) - d101) / (d100 + d101);
        if (d102 < 0.0d) {
            d102 = 0.0d;
        }
        double dSqrt2 = Math.sqrt(d102) * d82;
        double d103 = fAbs;
        double d104 = fAbs2;
        double d105 = ((d103 * d10) / d104) * dSqrt2;
        double d106 = dSqrt2 * (-((d104 * d6) / d103));
        double d107 = ((dCos * d105) - (dSin * d106)) + (((double) (f + f35)) / 2.0d);
        double d108 = (dCos * d106) + (dSin * d105) + (((double) (f4 + f36)) / 2.0d);
        double d109 = (d6 - d105) / d103;
        double d110 = (d10 - d106) / d104;
        double d111 = ((-d6) - d105) / d103;
        double d112 = ((-d10) - d106) / d104;
        double d113 = (d110 * d110) + (d109 * d109);
        double dAcos = Math.acos(d109 / Math.sqrt(d113)) * (d110 < 0.0d ? -1.0d : 1.0d);
        double dSqrt3 = ((d110 * d112) + (d109 * d111)) / Math.sqrt(((d112 * d112) + (d111 * d111)) * d113);
        double dAcos2 = ((d109 * d112) - (d110 * d111) < 0.0d ? -1.0d : 1.0d) * (dSqrt3 < -1.0d ? 3.141592653589793d : dSqrt3 > 1.0d ? 0.0d : Math.acos(dSqrt3));
        if (!z3 && dAcos2 > 0.0d) {
            dAcos2 -= 6.283185307179586d;
        } else if (z3 && dAcos2 < 0.0d) {
            dAcos2 += 6.283185307179586d;
        }
        double d114 = dAcos2 % 6.283185307179586d;
        double d115 = dAcos % 6.283185307179586d;
        int iCeil = (int) Math.ceil((Math.abs(d114) * 2.0d) / 3.141592653589793d);
        double d116 = d114 / ((double) iCeil);
        double d117 = d116 / 2.0d;
        double dSin2 = (Math.sin(d117) * 1.3333333333333333d) / (Math.cos(d117) + 1.0d);
        int i = iCeil * 6;
        float[] fArr = new float[i];
        int i2 = 0;
        int i3 = 0;
        while (i2 < iCeil) {
            double d118 = d115;
            double d119 = (((double) i2) * d116) + d118;
            double dCos2 = Math.cos(d119);
            double dSin3 = Math.sin(d119);
            int i5 = i2;
            int i6 = i3;
            fArr[i6] = (float) (dCos2 - (dSin2 * dSin3));
            fArr[i3 + 1] = (float) ((dCos2 * dSin2) + dSin3);
            double d120 = d119 + d116;
            double dCos3 = Math.cos(d120);
            double dSin4 = Math.sin(d120);
            fArr[i6 + 2] = (float) ((dSin2 * dSin4) + dCos3);
            fArr[i6 + 3] = (float) (dSin4 - (dSin2 * dCos3));
            fArr[i6 + 4] = (float) dCos3;
            i3 = i6 + 6;
            fArr[i6 + 5] = (float) dSin4;
            i2 = i5 + 1;
            d115 = d118;
            iCeil = iCeil;
        }
        Matrix matrix = new Matrix();
        matrix.postScale(fAbs, fAbs2);
        matrix.postRotate(f32);
        matrix.postTranslate((float) d107, (float) d108);
        matrix.mapPoints(fArr);
        fArr[i - 2] = f35;
        fArr[i - 1] = f36;
        for (int i21 = 0; i21 < i; i21 += 6) {
            w0Var.cubicTo(fArr[i21], fArr[i21 + 1], fArr[i21 + 2], fArr[i21 + 3], fArr[i21 + 4], fArr[i21 + 5]);
        }
    }

    public static b0 f(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new b0(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    public static void f0(u2 u2Var, boolean z, v1 v1Var) {
        int i;
        m1 m1Var = u2Var.f13481a;
        float fFloatValue = (z ? m1Var.d : m1Var.f).floatValue();
        if (v1Var instanceof e0) {
            i = ((e0) v1Var).f13341a;
        } else if (!(v1Var instanceof f0)) {
            return;
        } else {
            i = u2Var.f13481a.f13398n.f13341a;
        }
        int iL = l(fFloatValue, i);
        if (z) {
            u2Var.d.setColor(iL);
        } else {
            u2Var.e.setColor(iL);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0077, code lost:
    
        if (r1 != 8) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Matrix h(b9.b0 r9, b9.b0 r10, b9.z r11) {
        /*
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            if (r11 == 0) goto L91
            b9.x r1 = r11.f13516a
            if (r1 != 0) goto Ld
            goto L91
        Ld:
            float r2 = r9.f13311c
            float r3 = r10.f13311c
            float r2 = r2 / r3
            float r3 = r9.d
            float r4 = r10.d
            float r3 = r3 / r4
            float r4 = r10.f13309a
            float r4 = -r4
            float r5 = r10.f13310b
            float r5 = -r5
            b9.z r6 = b9.z.f13515c
            boolean r6 = r11.equals(r6)
            if (r6 == 0) goto L33
            float r10 = r9.f13309a
            float r9 = r9.f13310b
            r0.preTranslate(r10, r9)
            r0.preScale(r2, r3)
            r0.preTranslate(r4, r5)
            return r0
        L33:
            b9.y r11 = r11.f13517b
            b9.y r6 = b9.y.slice
            if (r11 != r6) goto L3e
            float r11 = java.lang.Math.max(r2, r3)
            goto L42
        L3e:
            float r11 = java.lang.Math.min(r2, r3)
        L42:
            float r2 = r9.f13311c
            float r2 = r2 / r11
            float r3 = r9.d
            float r3 = r3 / r11
            int[] r6 = b9.n2.f13420a
            int r7 = r1.ordinal()
            r7 = r6[r7]
            r8 = 1073741824(0x40000000, float:2.0)
            switch(r7) {
                case 1: goto L5b;
                case 2: goto L5b;
                case 3: goto L5b;
                case 4: goto L56;
                case 5: goto L56;
                case 6: goto L56;
                default: goto L55;
            }
        L55:
            goto L60
        L56:
            float r7 = r10.f13311c
            float r7 = r7 - r2
        L59:
            float r4 = r4 - r7
            goto L60
        L5b:
            float r7 = r10.f13311c
            float r7 = r7 - r2
            float r7 = r7 / r8
            goto L59
        L60:
            int r1 = r1.ordinal()
            r1 = r6[r1]
            r2 = 2
            if (r1 == r2) goto L7f
            r2 = 3
            if (r1 == r2) goto L7a
            r2 = 5
            if (r1 == r2) goto L7f
            r2 = 6
            if (r1 == r2) goto L7a
            r2 = 7
            if (r1 == r2) goto L7f
            r2 = 8
            if (r1 == r2) goto L7a
            goto L84
        L7a:
            float r10 = r10.d
            float r10 = r10 - r3
        L7d:
            float r5 = r5 - r10
            goto L84
        L7f:
            float r10 = r10.d
            float r10 = r10 - r3
            float r10 = r10 / r8
            goto L7d
        L84:
            float r10 = r9.f13309a
            float r9 = r9.f13310b
            r0.preTranslate(r10, r9)
            r0.preScale(r11, r11)
            r0.preTranslate(r4, r5)
        L91:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b9.w2.h(b9.b0, b9.b0, b9.z):android.graphics.Matrix");
    }

    public static Typeface k(String str, Integer num, e1 e1Var) {
        int i;
        boolean z = e1Var == e1.Italic;
        i = num.intValue() > 500 ? z ? 3 : 1 : z ? 2 : 0;
        str.getClass();
        switch (str) {
            case "sans-serif":
                return Typeface.create(Typeface.SANS_SERIF, i);
            case "monospace":
                return Typeface.create(Typeface.MONOSPACE, i);
            case "fantasy":
                return Typeface.create(Typeface.SANS_SERIF, i);
            case "serif":
                return Typeface.create(Typeface.SERIF, i);
            case "cursive":
                return Typeface.create(Typeface.SANS_SERIF, i);
            default:
                return null;
        }
    }

    public static int l(float f, int i) {
        int i2 = 255;
        int iRound = Math.round(((i >> 24) & 255) * f);
        if (iRound < 0) {
            i2 = 0;
        } else if (iRound <= 255) {
            i2 = iRound;
        }
        return (i2 << 24) | (i & 16777215);
    }

    public static void n0(w2 w2Var, int i) {
        boolean z = false;
        boolean z3 = (i & 2) == 0;
        w2Var.m0(w2Var.F(), z3);
        w2Var.m0(w2Var.G(), z3);
        ht0.t tVarF = w2Var.F();
        if (!tVarF.a()) {
            tVarF = null;
        }
        ht0.t tVarG = w2Var.G();
        ht0.t other = tVarG.a() ? tVarG : null;
        if (tVarF != null) {
            ht0.p pVar = tVarF.f155179b;
            if (other != null) {
                ht0.p pVar2 = other.f155179b;
                Intrinsics.checkNotNullParameter(other, "other");
                if (pVar.getTop() < pVar2.getBottom() && pVar.getBottom() > pVar2.getTop()) {
                    z = true;
                }
                pVar.setCollidedAndAnimate(z, true);
                pVar2.setCollidedAndAnimate(z, true);
            }
        }
    }

    public static void u(String str, Object... objArr) {
        String.format(str, objArr);
    }

    public static void w(i0 i0Var, String str) {
        s1 s1VarC = i0Var.f13479a.c(str);
        if (s1VarC == null) {
            String str2 = "Gradient reference '" + str + "' not found";
            return;
        }
        if (!(s1VarC instanceof i0)) {
            u("Gradient href attributes must point to other gradient elements", new Object[0]);
            return;
        }
        if (s1VarC == i0Var) {
            u("Circular reference in gradient href attribute '%s'", str);
            return;
        }
        i0 i0Var2 = (i0) s1VarC;
        if (i0Var.i == null) {
            i0Var.i = i0Var2.i;
        }
        if (i0Var.f13364j == null) {
            i0Var.f13364j = i0Var2.f13364j;
        }
        if (i0Var.k == null) {
            i0Var.k = i0Var2.k;
        }
        if (i0Var.f13363h.isEmpty()) {
            i0Var.f13363h = i0Var2.f13363h;
        }
        try {
            if (i0Var instanceof t1) {
                t1 t1Var = (t1) i0Var;
                t1 t1Var2 = (t1) s1VarC;
                if (t1Var.f13470m == null) {
                    t1Var.f13470m = t1Var2.f13470m;
                }
                if (t1Var.f13471n == null) {
                    t1Var.f13471n = t1Var2.f13471n;
                }
                if (t1Var.o == null) {
                    t1Var.o = t1Var2.o;
                }
                if (t1Var.f13472p == null) {
                    t1Var.f13472p = t1Var2.f13472p;
                }
            } else {
                x((x1) i0Var, (x1) s1VarC);
            }
        } catch (ClassCastException unused) {
        }
        String str3 = i0Var2.f13365l;
        if (str3 != null) {
            w(i0Var, str3);
        }
    }

    public static void x(x1 x1Var, x1 x1Var2) {
        if (x1Var.f13508m == null) {
            x1Var.f13508m = x1Var2.f13508m;
        }
        if (x1Var.f13509n == null) {
            x1Var.f13509n = x1Var2.f13509n;
        }
        if (x1Var.o == null) {
            x1Var.o = x1Var2.o;
        }
        if (x1Var.f13510p == null) {
            x1Var.f13510p = x1Var2.f13510p;
        }
        if (x1Var.f13511q == null) {
            x1Var.f13511q = x1Var2.f13511q;
        }
    }

    public static void y(x0 x0Var, String str) {
        s1 s1VarC = x0Var.f13479a.c(str);
        if (s1VarC == null) {
            String str2 = "Pattern reference '" + str + "' not found";
            return;
        }
        if (!(s1VarC instanceof x0)) {
            u("Pattern href attributes must point to other pattern elements", new Object[0]);
            return;
        }
        if (s1VarC == x0Var) {
            u("Circular reference in pattern href attribute '%s'", str);
            return;
        }
        x0 x0Var2 = (x0) s1VarC;
        if (x0Var.f13502p == null) {
            x0Var.f13502p = x0Var2.f13502p;
        }
        if (x0Var.f13503q == null) {
            x0Var.f13503q = x0Var2.f13503q;
        }
        if (x0Var.f13504r == null) {
            x0Var.f13504r = x0Var2.f13504r;
        }
        if (x0Var.f13505s == null) {
            x0Var.f13505s = x0Var2.f13505s;
        }
        if (x0Var.f13506t == null) {
            x0Var.f13506t = x0Var2.f13506t;
        }
        if (x0Var.u == null) {
            x0Var.u = x0Var2.u;
        }
        if (x0Var.v == null) {
            x0Var.v = x0Var2.v;
        }
        if (x0Var.i.isEmpty()) {
            x0Var.i = x0Var2.i;
        }
        if (x0Var.o == null) {
            x0Var.o = x0Var2.o;
        }
        if (x0Var.f13496n == null) {
            x0Var.f13496n = x0Var2.f13496n;
        }
        String str3 = x0Var2.f13507w;
        if (str3 != null) {
            y(x0Var, str3);
        }
    }

    public void A(u1 u1Var, u2 u2Var) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (u1Var instanceof s1) {
                arrayList.add(0, (s1) u1Var);
            }
            Object obj2 = u1Var.f13480b;
            if (obj2 == null) {
                break;
            } else {
                u1Var = (u1) obj2;
            }
        }
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            p0(u2Var, (s1) it8.next());
        }
        u2 u2Var2 = (u2) this.d;
        u2Var.f13484g = u2Var2.f13484g;
        u2Var.f = u2Var2.f;
    }

    public i1 B() {
        i1 i1Var;
        m1 m1Var = ((u2) this.d).f13481a;
        if (m1Var.f13403t == k1.LTR || (i1Var = m1Var.u) == i1.Middle) {
            return m1Var.u;
        }
        i1 i1Var2 = i1.Start;
        return i1Var == i1Var2 ? i1.End : i1Var2;
    }

    public Path.FillType C() {
        d1 d1Var = ((u2) this.d).f13481a.F;
        return (d1Var == null || d1Var != d1.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public ht0.t F() {
        return (ht0.t) this.d.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public ht0.t G() {
        return (ht0.t) this.e.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object H(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof a3i.j
            if (r0 == 0) goto L13
            r0 = r5
            a3i.j r0 = (a3i.j) r0
            int r1 = r0.f1145w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1145w = r1
            goto L18
        L13:
            a3i.j r0 = new a3i.j
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f1145w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L43
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            java.lang.Object r5 = r4.f
            sh5.d r5 = (sh5.d) r5
            efm.d0 r5 = sh5.d.a(r5)
            r0.f1145w = r3
            java.lang.Object r5 = nim.a.b(r5, r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            sh5.c r5 = (sh5.c) r5
            boolean r5 = r5.f263437c
            r5 = r5 ^ r3
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: b9.w2.H(gim.c):java.lang.Object");
    }

    public Path J(c0 c0Var) {
        o0 o0Var = c0Var.o;
        float f = BitmapDescriptorFactory.HUE_RED;
        float fE = o0Var != null ? o0Var.e(this) : 0.0f;
        o0 o0Var2 = c0Var.f13317p;
        if (o0Var2 != null) {
            f = o0Var2.f(this);
        }
        float f4 = f;
        float fA = c0Var.f13318q.a(this);
        float f5 = fE - fA;
        float f6 = f4 - fA;
        float f32 = fE + fA;
        float f35 = f4 + fA;
        if (c0Var.f13459h == null) {
            float f36 = 2.0f * fA;
            c0Var.f13459h = new b0(f5, f6, f36, f36);
        }
        float f37 = fA * 0.5522848f;
        Path path = new Path();
        path.moveTo(fE, f6);
        float f41 = fE + f37;
        float f42 = f4 - f37;
        path.cubicTo(f41, f6, f32, f42, f32, f4);
        float f57 = f4 + f37;
        path.cubicTo(f32, f57, f41, f35, fE, f35);
        float f69 = fE - f37;
        path.cubicTo(f69, f35, f5, f57, f5, f4);
        path.cubicTo(f5, f42, f69, f6, fE, f6);
        path.close();
        return path;
    }

    public Path K(h0 h0Var) {
        o0 o0Var = h0Var.o;
        float f = BitmapDescriptorFactory.HUE_RED;
        float fE = o0Var != null ? o0Var.e(this) : 0.0f;
        o0 o0Var2 = h0Var.f13357p;
        if (o0Var2 != null) {
            f = o0Var2.f(this);
        }
        float f4 = f;
        float fE2 = h0Var.f13358q.e(this);
        float f5 = h0Var.f13359r.f(this);
        float f6 = fE - fE2;
        float f32 = f4 - f5;
        float f35 = fE + fE2;
        float f36 = f4 + f5;
        if (h0Var.f13459h == null) {
            h0Var.f13459h = new b0(f6, f32, fE2 * 2.0f, 2.0f * f5);
        }
        float f37 = fE2 * 0.5522848f;
        float f41 = f5 * 0.5522848f;
        Path path = new Path();
        path.moveTo(fE, f32);
        float f42 = fE + f37;
        float f57 = f4 - f41;
        path.cubicTo(f42, f32, f35, f57, f35, f4);
        float f69 = f4 + f41;
        path.cubicTo(f35, f69, f42, f36, fE, f36);
        float f75 = fE - f37;
        path.cubicTo(f75, f36, f6, f69, f6, f4);
        path.cubicTo(f6, f57, f75, f32, fE, f32);
        path.close();
        return path;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.Path M(b9.a1 r20) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b9.w2.M(b9.a1):android.graphics.Path");
    }

    public b0 N(o0 o0Var, o0 o0Var2, o0 o0Var3, o0 o0Var4) {
        float f = BitmapDescriptorFactory.HUE_RED;
        float fE = o0Var != null ? o0Var.e(this) : 0.0f;
        if (o0Var2 != null) {
            f = o0Var2.f(this);
        }
        u2 u2Var = (u2) this.d;
        b0 b0Var = u2Var.f13484g;
        if (b0Var == null) {
            b0Var = u2Var.f;
        }
        return new b0(fE, f, o0Var3 != null ? o0Var3.e(this) : b0Var.f13311c, o0Var4 != null ? o0Var4.f(this) : b0Var.d);
    }

    public Path O(r1 r1Var, boolean z) {
        Path pathM;
        Path pathD;
        ((Stack) this.e).push((u2) this.d);
        u2 u2Var = new u2((u2) this.d);
        this.d = u2Var;
        p0(u2Var, r1Var);
        if (!q() || !r0()) {
            this.d = (u2) ((Stack) this.e).pop();
            return null;
        }
        if (r1Var instanceof k2) {
            if (!z) {
                u("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
            }
            k2 k2Var = (k2) r1Var;
            s1 s1VarC = r1Var.f13479a.c(k2Var.o);
            if (s1VarC == null) {
                u("Use reference '%s' not found", k2Var.o);
                this.d = (u2) ((Stack) this.e).pop();
                return null;
            }
            if (!(s1VarC instanceof r1)) {
                this.d = (u2) ((Stack) this.e).pop();
                return null;
            }
            pathM = O((r1) s1VarC, false);
            if (pathM != null) {
                if (k2Var.f13459h == null) {
                    k2Var.f13459h = f(pathM);
                }
                Matrix matrix = k2Var.f13388n;
                if (matrix != null) {
                    pathM.transform(matrix);
                }
                if (((u2) this.d).f13481a.E != null && (pathD = d(r1Var, r1Var.f13459h)) != null) {
                    pathM.op(pathD, Path.Op.INTERSECT);
                }
                this.d = (u2) ((Stack) this.e).pop();
                return pathM;
            }
            return null;
        }
        if (r1Var instanceof k0) {
            k0 k0Var = (k0) r1Var;
            if (r1Var instanceof u0) {
                q2 q2Var = new q2(((u0) r1Var).o);
                b0 b0Var = r1Var.f13459h;
                Path path = q2Var.f13451a;
                if (b0Var == null) {
                    r1Var.f13459h = f(path);
                }
                pathM = path;
            } else {
                pathM = r1Var instanceof a1 ? M((a1) r1Var) : r1Var instanceof c0 ? J((c0) r1Var) : r1Var instanceof h0 ? K((h0) r1Var) : r1Var instanceof y0 ? L((y0) r1Var) : null;
            }
            if (pathM != null) {
                if (k0Var.f13459h == null) {
                    k0Var.f13459h = f(pathM);
                }
                Matrix matrix2 = k0Var.f13383n;
                if (matrix2 != null) {
                    pathM.transform(matrix2);
                }
                pathM.setFillType(C());
            }
            return null;
        }
        if (!(r1Var instanceof d2)) {
            u("Invalid %s element found in clipPath definition", r1Var.m());
            return null;
        }
        d2 d2Var = (d2) r1Var;
        ArrayList arrayList = d2Var.f13360n;
        float f = BitmapDescriptorFactory.HUE_RED;
        float fE = (arrayList == null || arrayList.size() == 0) ? 0.0f : ((o0) d2Var.f13360n.get(0)).e(this);
        ArrayList arrayList2 = d2Var.o;
        float f4 = (arrayList2 == null || arrayList2.size() == 0) ? 0.0f : ((o0) d2Var.o.get(0)).f(this);
        ArrayList arrayList3 = d2Var.f13361p;
        float fE2 = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((o0) d2Var.f13361p.get(0)).e(this);
        ArrayList arrayList4 = d2Var.f13362q;
        if (arrayList4 != null && arrayList4.size() != 0) {
            f = ((o0) d2Var.f13362q.get(0)).f(this);
        }
        if (((u2) this.d).f13481a.u != i1.Start) {
            float fG = g(d2Var);
            if (((u2) this.d).f13481a.u == i1.Middle) {
                fG /= 2.0f;
            }
            fE -= fG;
        }
        if (d2Var.f13459h == null) {
            t2 t2Var = new t2(this, fE, f4);
            t(d2Var, t2Var);
            RectF rectF = (RectF) t2Var.e;
            d2Var.f13459h = new b0(rectF.left, rectF.top, rectF.width(), ((RectF) t2Var.e).height());
        }
        Path path2 = new Path();
        t(d2Var, new t2(this, fE + fE2, f4 + f, path2));
        Matrix matrix3 = d2Var.f13322r;
        if (matrix3 != null) {
            path2.transform(matrix3);
        }
        path2.setFillType(C());
        pathM = path2;
        if (((u2) this.d).f13481a.E != null) {
            pathM.op(pathD, Path.Op.INTERSECT);
        }
        this.d = (u2) ((Stack) this.e).pop();
        return pathM;
    }

    public akg.n P(List metrics, zel.f instrumentGroup, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        Intrinsics.checkNotNullParameter(instrumentGroup, "instrumentGroup");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(zh9.u0.m(rd0.e.b(ybl.l.c((ybl.l) this.f, Intrinsics.f(loadingStrategy, w4l.i.f294643c), 2)), ((yhl.f) ((ugl.c) this.f13501g)).b(sph.o.a(instrumentGroup), loadingStrategy)), new toh.h(this, 0, metrics, instrumentGroup));
    }

    public void Q() {
        ifm.b bVar = (ifm.b) this.f;
        bVar.d();
        ihm.f fVar = (ihm.f) this.f13501g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        te0.w.j0(bVar, o70.a.f(te0.w.u0(fVar)).subscribe(new hp5.b(new hs4.l(this, 8), 16)));
        te0.w.j0(bVar, F().b());
        te0.w.j0(bVar, G().b());
    }

    public void R(b0 b0Var) {
        Canvas canvas = (Canvas) this.f13499b;
        if (((u2) this.d).f13481a.G != null) {
            Paint paint = new Paint();
            PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
            paint.setXfermode(new PorterDuffXfermode(mode));
            canvas.saveLayer(null, paint, 31);
            Paint paint2 = new Paint();
            paint2.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0.2127f, 0.7151f, 0.0722f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED})));
            canvas.saveLayer(null, paint2, 31);
            r0 r0Var = (r0) ((m2) this.f13500c).c(((u2) this.d).f13481a.G);
            a0(r0Var, b0Var);
            canvas.restore();
            Paint paint3 = new Paint();
            paint3.setXfermode(new PorterDuffXfermode(mode));
            canvas.saveLayer(null, paint3, 31);
            a0(r0Var, b0Var);
            canvas.restore();
            canvas.restore();
        }
        h0();
    }

    public y48.f S() {
        return new y48.f((Json) this.f13499b, (qf0.c) this.f13500c, (g48.r0) this.d, (k38.d) this.e, (y48.g) this.f, (gte.a) this.f13501g);
    }

    public boolean T() {
        s1 s1VarC;
        int i = 0;
        if (((u2) this.d).f13481a.f13397m.floatValue() >= 1.0f && ((u2) this.d).f13481a.G == null) {
            return false;
        }
        Canvas canvas = (Canvas) this.f13499b;
        int iFloatValue = (int) (((u2) this.d).f13481a.f13397m.floatValue() * 256.0f);
        if (iFloatValue >= 0) {
            i = 255;
            if (iFloatValue <= 255) {
                i = iFloatValue;
            }
        }
        canvas.saveLayerAlpha(null, i, 31);
        ((Stack) this.e).push((u2) this.d);
        u2 u2Var = new u2((u2) this.d);
        this.d = u2Var;
        String str = u2Var.f13481a.G;
        if (str != null && ((s1VarC = ((m2) this.f13500c).c(str)) == null || !(s1VarC instanceof r0))) {
            u("Mask reference '%s' not found", ((u2) this.d).f13481a.G);
            ((u2) this.d).f13481a.G = null;
        }
        return true;
    }

    public void U(n1 n1Var, b0 b0Var, b0 b0Var2, z zVar) {
        Canvas canvas = (Canvas) this.f13499b;
        if (b0Var.f13311c == BitmapDescriptorFactory.HUE_RED || b0Var.d == BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        if (zVar == null && (zVar = n1Var.f13496n) == null) {
            zVar = z.d;
        }
        p0((u2) this.d, n1Var);
        if (q()) {
            u2 u2Var = (u2) this.d;
            u2Var.f = b0Var;
            if (!u2Var.f13481a.v.booleanValue()) {
                b0 b0Var3 = ((u2) this.d).f;
                d0(b0Var3.f13309a, b0Var3.f13310b, b0Var3.f13311c, b0Var3.d);
            }
            i(n1Var, ((u2) this.d).f);
            if (b0Var2 != null) {
                canvas.concat(h(((u2) this.d).f, b0Var2, zVar));
                ((u2) this.d).f13484g = n1Var.o;
            } else {
                b0 b0Var4 = ((u2) this.d).f;
                canvas.translate(b0Var4.f13309a, b0Var4.f13310b);
            }
            boolean zT = T();
            q0();
            W(n1Var, true);
            if (zT) {
                R(n1Var.f13459h);
            }
            l0(n1Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void V(u1 u1Var) {
        o0 o0Var;
        String str;
        int iIndexOf;
        Set setF;
        o0 o0Var2;
        Boolean bool;
        if (u1Var instanceof s0) {
            return;
        }
        i0();
        if ((u1Var instanceof s1) && (bool = ((s1) u1Var).d) != null) {
            ((u2) this.d).f13485h = bool.booleanValue();
        }
        if (u1Var instanceof n1) {
            n1 n1Var = (n1) u1Var;
            U(n1Var, N(n1Var.f13416p, n1Var.f13417q, n1Var.f13418r, n1Var.f13419s), n1Var.o, n1Var.f13496n);
        } else {
            boolean z = u1Var instanceof k2;
            Bitmap bitmapDecodeByteArray = null;
            float f = BitmapDescriptorFactory.HUE_RED;
            if (z) {
                k2 k2Var = (k2) u1Var;
                Canvas canvas = (Canvas) this.f13499b;
                o0 o0Var3 = k2Var.f13386r;
                if ((o0Var3 == null || !o0Var3.h()) && ((o0Var2 = k2Var.f13387s) == null || !o0Var2.h())) {
                    p0((u2) this.d, k2Var);
                    if (q()) {
                        u1 u1VarC = k2Var.f13479a.c(k2Var.o);
                        if (u1VarC == null) {
                            u("Use reference '%s' not found", k2Var.o);
                        } else {
                            Matrix matrix = k2Var.f13388n;
                            if (matrix != null) {
                                canvas.concat(matrix);
                            }
                            o0 o0Var4 = k2Var.f13384p;
                            float fE = o0Var4 != null ? o0Var4.e(this) : 0.0f;
                            o0 o0Var5 = k2Var.f13385q;
                            canvas.translate(fE, o0Var5 != null ? o0Var5.f(this) : 0.0f);
                            i(k2Var, k2Var.f13459h);
                            boolean zT = T();
                            ((Stack) this.f).push(k2Var);
                            ((Stack) this.f13501g).push(((Canvas) this.f13499b).getMatrix());
                            if (u1VarC instanceof n1) {
                                n1 n1Var2 = (n1) u1VarC;
                                b0 b0VarN = N(null, null, k2Var.f13386r, k2Var.f13387s);
                                i0();
                                U(n1Var2, b0VarN, n1Var2.o, n1Var2.f13496n);
                                h0();
                            } else if (u1VarC instanceof a2) {
                                o0 o0Var6 = k2Var.f13386r;
                                if (o0Var6 == null) {
                                    o0Var6 = new o0(100.0f, j2.percent);
                                }
                                o0 o0Var7 = k2Var.f13387s;
                                if (o0Var7 == null) {
                                    o0Var7 = new o0(100.0f, j2.percent);
                                }
                                b0 b0VarN2 = N(null, null, o0Var6, o0Var7);
                                i0();
                                a2 a2Var = (a2) u1VarC;
                                if (b0VarN2.f13311c != BitmapDescriptorFactory.HUE_RED && b0VarN2.d != BitmapDescriptorFactory.HUE_RED) {
                                    z zVar = a2Var.f13496n;
                                    if (zVar == null) {
                                        zVar = z.d;
                                    }
                                    p0((u2) this.d, a2Var);
                                    u2 u2Var = (u2) this.d;
                                    u2Var.f = b0VarN2;
                                    if (!u2Var.f13481a.v.booleanValue()) {
                                        b0 b0Var = ((u2) this.d).f;
                                        d0(b0Var.f13309a, b0Var.f13310b, b0Var.f13311c, b0Var.d);
                                    }
                                    b0 b0Var2 = a2Var.o;
                                    if (b0Var2 != null) {
                                        canvas.concat(h(((u2) this.d).f, b0Var2, zVar));
                                        ((u2) this.d).f13484g = a2Var.o;
                                    } else {
                                        b0 b0Var3 = ((u2) this.d).f;
                                        canvas.translate(b0Var3.f13309a, b0Var3.f13310b);
                                    }
                                    boolean zT2 = T();
                                    W(a2Var, true);
                                    if (zT2) {
                                        R(a2Var.f13459h);
                                    }
                                    l0(a2Var);
                                }
                                h0();
                            } else {
                                V(u1VarC);
                            }
                            ((Stack) this.f).pop();
                            ((Stack) this.f13501g).pop();
                            if (zT) {
                                R(k2Var.f13459h);
                            }
                            l0(k2Var);
                        }
                    }
                }
            } else if (u1Var instanceof z1) {
                z1 z1Var = (z1) u1Var;
                p0((u2) this.d, z1Var);
                if (q()) {
                    Matrix matrix2 = z1Var.f13388n;
                    if (matrix2 != null) {
                        ((Canvas) this.f13499b).concat(matrix2);
                    }
                    i(z1Var, z1Var.f13459h);
                    boolean zT3 = T();
                    String language = Locale.getDefault().getLanguage();
                    Iterator it8 = z1Var.i.iterator();
                    while (true) {
                        if (!it8.hasNext()) {
                            break;
                        }
                        u1 u1Var2 = (u1) it8.next();
                        if (u1Var2 instanceof o1) {
                            o1 o1Var = (o1) u1Var2;
                            if (o1Var.a() == null && ((setF = o1Var.f()) == null || (!setF.isEmpty() && setF.contains(language)))) {
                                Set requiredFeatures = o1Var.getRequiredFeatures();
                                if (requiredFeatures != null) {
                                    if (f13497h == null) {
                                        synchronized (w2.class) {
                                            HashSet hashSet = new HashSet();
                                            f13497h = hashSet;
                                            hashSet.add("Structure");
                                            f13497h.add("BasicStructure");
                                            f13497h.add("ConditionalProcessing");
                                            f13497h.add("Image");
                                            f13497h.add("Style");
                                            f13497h.add("ViewportAttribute");
                                            f13497h.add("Shape");
                                            f13497h.add("BasicText");
                                            f13497h.add("PaintAttribute");
                                            f13497h.add("BasicPaintAttribute");
                                            f13497h.add("OpacityAttribute");
                                            f13497h.add("BasicGraphicsAttribute");
                                            f13497h.add("Marker");
                                            f13497h.add("Gradient");
                                            f13497h.add("Pattern");
                                            f13497h.add("Clip");
                                            f13497h.add("BasicClip");
                                            f13497h.add("Mask");
                                            f13497h.add("View");
                                        }
                                    }
                                    if (requiredFeatures.isEmpty() || !f13497h.containsAll(requiredFeatures)) {
                                    }
                                }
                                Set setE = o1Var.e();
                                if (setE == null) {
                                    Set setL = o1Var.l();
                                    if (setL == null) {
                                        V(u1Var2);
                                        break;
                                    }
                                    setL.isEmpty();
                                } else {
                                    setE.isEmpty();
                                }
                            }
                        }
                    }
                    if (zT3) {
                        R(z1Var.f13459h);
                    }
                    l0(z1Var);
                }
            } else if (u1Var instanceof l0) {
                l0 l0Var = (l0) u1Var;
                p0((u2) this.d, l0Var);
                if (q()) {
                    Matrix matrix3 = l0Var.f13388n;
                    if (matrix3 != null) {
                        ((Canvas) this.f13499b).concat(matrix3);
                    }
                    i(l0Var, l0Var.f13459h);
                    boolean zT4 = T();
                    W(l0Var, true);
                    if (zT4) {
                        R(l0Var.f13459h);
                    }
                    l0(l0Var);
                }
            } else {
                if (u1Var instanceof n0) {
                    n0 n0Var = (n0) u1Var;
                    Canvas canvas2 = (Canvas) this.f13499b;
                    o0 o0Var8 = n0Var.f13413r;
                    if (o0Var8 != null && !o0Var8.h() && (o0Var = n0Var.f13414s) != null && !o0Var.h() && (str = n0Var.o) != null) {
                        z zVar2 = n0Var.f13496n;
                        if (zVar2 == null) {
                            zVar2 = z.d;
                        }
                        if (str.startsWith("data:") && str.length() >= 14 && (iIndexOf = str.indexOf(44)) >= 12 && ";base64".equals(str.substring(iIndexOf - 7, iIndexOf))) {
                            try {
                                byte[] bArrDecode = Base64.decode(str.substring(iIndexOf + 1), 0);
                                bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                            } catch (Exception e) {
                            }
                        }
                        if (bitmapDecodeByteArray != null) {
                            b0 b0Var4 = new b0(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight());
                            p0((u2) this.d, n0Var);
                            if (q() && r0()) {
                                Matrix matrix4 = n0Var.f13415t;
                                if (matrix4 != null) {
                                    canvas2.concat(matrix4);
                                }
                                o0 o0Var9 = n0Var.f13411p;
                                float fE2 = o0Var9 != null ? o0Var9.e(this) : 0.0f;
                                o0 o0Var10 = n0Var.f13412q;
                                float f4 = o0Var10 != null ? o0Var10.f(this) : 0.0f;
                                float fE3 = n0Var.f13413r.e(this);
                                float fE4 = n0Var.f13414s.e(this);
                                u2 u2Var2 = (u2) this.d;
                                u2Var2.f = new b0(fE2, f4, fE3, fE4);
                                if (!u2Var2.f13481a.v.booleanValue()) {
                                    b0 b0Var5 = ((u2) this.d).f;
                                    d0(b0Var5.f13309a, b0Var5.f13310b, b0Var5.f13311c, b0Var5.d);
                                }
                                n0Var.f13459h = ((u2) this.d).f;
                                l0(n0Var);
                                i(n0Var, n0Var.f13459h);
                                boolean zT5 = T();
                                q0();
                                canvas2.save();
                                canvas2.concat(h(((u2) this.d).f, b0Var4, zVar2));
                                canvas2.drawBitmap(bitmapDecodeByteArray, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, new Paint(((u2) this.d).f13481a.M != h1.optimizeSpeed ? 2 : 0));
                                canvas2.restore();
                                if (zT5) {
                                    R(n0Var.f13459h);
                                }
                            }
                        }
                    }
                } else if (u1Var instanceof u0) {
                    u0 u0Var = (u0) u1Var;
                    if (u0Var.o != null) {
                        p0((u2) this.d, u0Var);
                        if (q() && r0()) {
                            u2 u2Var3 = (u2) this.d;
                            if (u2Var3.f13483c || u2Var3.f13482b) {
                                Matrix matrix5 = u0Var.f13383n;
                                if (matrix5 != null) {
                                    ((Canvas) this.f13499b).concat(matrix5);
                                }
                                Path path = new q2(u0Var.o).f13451a;
                                if (u0Var.f13459h == null) {
                                    u0Var.f13459h = f(path);
                                }
                                l0(u0Var);
                                j(u0Var);
                                i(u0Var, u0Var.f13459h);
                                boolean zT6 = T();
                                u2 u2Var4 = (u2) this.d;
                                if (u2Var4.f13482b) {
                                    d1 d1Var = u2Var4.f13481a.f13392c;
                                    path.setFillType((d1Var == null || d1Var != d1.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                    r(u0Var, path);
                                }
                                if (((u2) this.d).f13483c) {
                                    s(path);
                                }
                                Z(u0Var);
                                if (zT6) {
                                    R(u0Var.f13459h);
                                }
                            }
                        }
                    }
                } else if (u1Var instanceof a1) {
                    a1 a1Var = (a1) u1Var;
                    o0 o0Var11 = a1Var.f13302q;
                    if (o0Var11 != null && a1Var.f13303r != null && !o0Var11.h() && !a1Var.f13303r.h()) {
                        p0((u2) this.d, a1Var);
                        if (q() && r0()) {
                            Matrix matrix6 = a1Var.f13383n;
                            if (matrix6 != null) {
                                ((Canvas) this.f13499b).concat(matrix6);
                            }
                            Path pathM = M(a1Var);
                            l0(a1Var);
                            j(a1Var);
                            i(a1Var, a1Var.f13459h);
                            boolean zT7 = T();
                            if (((u2) this.d).f13482b) {
                                r(a1Var, pathM);
                            }
                            if (((u2) this.d).f13483c) {
                                s(pathM);
                            }
                            if (zT7) {
                                R(a1Var.f13459h);
                            }
                        }
                    }
                } else if (u1Var instanceof c0) {
                    c0 c0Var = (c0) u1Var;
                    o0 o0Var12 = c0Var.f13318q;
                    if (o0Var12 != null && !o0Var12.h()) {
                        p0((u2) this.d, c0Var);
                        if (q() && r0()) {
                            Matrix matrix7 = c0Var.f13383n;
                            if (matrix7 != null) {
                                ((Canvas) this.f13499b).concat(matrix7);
                            }
                            Path pathJ = J(c0Var);
                            l0(c0Var);
                            j(c0Var);
                            i(c0Var, c0Var.f13459h);
                            boolean zT8 = T();
                            if (((u2) this.d).f13482b) {
                                r(c0Var, pathJ);
                            }
                            if (((u2) this.d).f13483c) {
                                s(pathJ);
                            }
                            if (zT8) {
                                R(c0Var.f13459h);
                            }
                        }
                    }
                } else if (u1Var instanceof h0) {
                    h0 h0Var = (h0) u1Var;
                    o0 o0Var13 = h0Var.f13358q;
                    if (o0Var13 != null && h0Var.f13359r != null && !o0Var13.h() && !h0Var.f13359r.h()) {
                        p0((u2) this.d, h0Var);
                        if (q() && r0()) {
                            Matrix matrix8 = h0Var.f13383n;
                            if (matrix8 != null) {
                                ((Canvas) this.f13499b).concat(matrix8);
                            }
                            Path pathK = K(h0Var);
                            l0(h0Var);
                            j(h0Var);
                            i(h0Var, h0Var.f13459h);
                            boolean zT9 = T();
                            if (((u2) this.d).f13482b) {
                                r(h0Var, pathK);
                            }
                            if (((u2) this.d).f13483c) {
                                s(pathK);
                            }
                            if (zT9) {
                                R(h0Var.f13459h);
                            }
                        }
                    }
                } else if (u1Var instanceof p0) {
                    p0 p0Var = (p0) u1Var;
                    p0((u2) this.d, p0Var);
                    if (q() && r0() && ((u2) this.d).f13483c) {
                        Matrix matrix9 = p0Var.f13383n;
                        if (matrix9 != null) {
                            ((Canvas) this.f13499b).concat(matrix9);
                        }
                        o0 o0Var14 = p0Var.o;
                        float fE5 = o0Var14 == null ? 0.0f : o0Var14.e(this);
                        o0 o0Var15 = p0Var.f13435p;
                        float f5 = o0Var15 == null ? 0.0f : o0Var15.f(this);
                        o0 o0Var16 = p0Var.f13436q;
                        float fE6 = o0Var16 == null ? 0.0f : o0Var16.e(this);
                        o0 o0Var17 = p0Var.f13437r;
                        if (o0Var17 != null) {
                            f = o0Var17.f(this);
                        }
                        if (p0Var.f13459h == null) {
                            p0Var.f13459h = new b0(Math.min(fE5, fE6), Math.min(f5, f), Math.abs(fE6 - fE5), Math.abs(f - f5));
                        }
                        Path path2 = new Path();
                        path2.moveTo(fE5, f5);
                        path2.lineTo(fE6, f);
                        l0(p0Var);
                        j(p0Var);
                        i(p0Var, p0Var.f13459h);
                        boolean zT10 = T();
                        s(path2);
                        Z(p0Var);
                        if (zT10) {
                            R(p0Var.f13459h);
                        }
                    }
                } else if (u1Var instanceof z0) {
                    z0 z0Var = (z0) u1Var;
                    p0((u2) this.d, z0Var);
                    if (q() && r0()) {
                        u2 u2Var5 = (u2) this.d;
                        if (u2Var5.f13483c || u2Var5.f13482b) {
                            Matrix matrix10 = z0Var.f13383n;
                            if (matrix10 != null) {
                                ((Canvas) this.f13499b).concat(matrix10);
                            }
                            if (z0Var.o.length >= 2) {
                                Path pathL = L(z0Var);
                                l0(z0Var);
                                j(z0Var);
                                i(z0Var, z0Var.f13459h);
                                boolean zT11 = T();
                                if (((u2) this.d).f13482b) {
                                    r(z0Var, pathL);
                                }
                                if (((u2) this.d).f13483c) {
                                    s(pathL);
                                }
                                Z(z0Var);
                                if (zT11) {
                                    R(z0Var.f13459h);
                                }
                            }
                        }
                    }
                } else if (u1Var instanceof y0) {
                    y0 y0Var = (y0) u1Var;
                    p0((u2) this.d, y0Var);
                    if (q() && r0()) {
                        u2 u2Var6 = (u2) this.d;
                        if (u2Var6.f13483c || u2Var6.f13482b) {
                            Matrix matrix11 = y0Var.f13383n;
                            if (matrix11 != null) {
                                ((Canvas) this.f13499b).concat(matrix11);
                            }
                            if (y0Var.o.length >= 2) {
                                Path pathL2 = L(y0Var);
                                l0(y0Var);
                                d1 d1Var2 = ((u2) this.d).f13481a.f13392c;
                                pathL2.setFillType((d1Var2 == null || d1Var2 != d1.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                j(y0Var);
                                i(y0Var, y0Var.f13459h);
                                boolean zT12 = T();
                                if (((u2) this.d).f13482b) {
                                    r(y0Var, pathL2);
                                }
                                if (((u2) this.d).f13483c) {
                                    s(pathL2);
                                }
                                Z(y0Var);
                                if (zT12) {
                                    R(y0Var.f13459h);
                                }
                            }
                        }
                    }
                } else if (u1Var instanceof d2) {
                    d2 d2Var = (d2) u1Var;
                    p0((u2) this.d, d2Var);
                    if (q()) {
                        Matrix matrix12 = d2Var.f13322r;
                        if (matrix12 != null) {
                            ((Canvas) this.f13499b).concat(matrix12);
                        }
                        ArrayList arrayList = d2Var.f13360n;
                        float fE7 = (arrayList == null || arrayList.size() == 0) ? 0.0f : ((o0) d2Var.f13360n.get(0)).e(this);
                        ArrayList arrayList2 = d2Var.o;
                        float f6 = (arrayList2 == null || arrayList2.size() == 0) ? 0.0f : ((o0) d2Var.o.get(0)).f(this);
                        ArrayList arrayList3 = d2Var.f13361p;
                        float fE8 = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((o0) d2Var.f13361p.get(0)).e(this);
                        ArrayList arrayList4 = d2Var.f13362q;
                        if (arrayList4 != null && arrayList4.size() != 0) {
                            f = ((o0) d2Var.f13362q.get(0)).f(this);
                        }
                        i1 i1VarB = B();
                        if (i1VarB != i1.Start) {
                            float fG = g(d2Var);
                            if (i1VarB == i1.Middle) {
                                fG /= 2.0f;
                            }
                            fE7 -= fG;
                        }
                        if (d2Var.f13459h == null) {
                            t2 t2Var = new t2(this, fE7, f6);
                            t(d2Var, t2Var);
                            RectF rectF = (RectF) t2Var.e;
                            d2Var.f13459h = new b0(rectF.left, rectF.top, rectF.width(), ((RectF) t2Var.e).height());
                        }
                        l0(d2Var);
                        j(d2Var);
                        i(d2Var, d2Var.f13459h);
                        boolean zT13 = T();
                        t(d2Var, new s2(this, fE7 + fE8, f6 + f));
                        if (zT13) {
                            R(d2Var.f13459h);
                        }
                    }
                }
            }
        }
        h0();
    }

    public void W(p1 p1Var, boolean z) {
        if (z) {
            ((Stack) this.f).push(p1Var);
            ((Stack) this.f13501g).push(((Canvas) this.f13499b).getMatrix());
        }
        Iterator it8 = p1Var.i.iterator();
        while (it8.hasNext()) {
            V((u1) it8.next());
        }
        if (z) {
            ((Stack) this.f).pop();
            ((Stack) this.f13501g).pop();
        }
    }

    public void X(m2 m2Var, zjh.i iVar) {
        this.f13500c = m2Var;
        n1 n1Var = m2Var.f13407a;
        if (n1Var == null) {
            return;
        }
        b0 b0Var = n1Var.o;
        z zVar = n1Var.f13496n;
        this.d = new u2();
        this.e = new Stack();
        o0((u2) this.d, m1.a());
        u2 u2Var = (u2) this.d;
        u2Var.f = null;
        u2Var.f13485h = false;
        ((Stack) this.e).push(new u2(u2Var));
        this.f13501g = new Stack();
        this.f = new Stack();
        Boolean bool = n1Var.d;
        if (bool != null) {
            ((u2) this.d).f13485h = bool.booleanValue();
        }
        i0();
        b0 b0Var2 = new b0((b0) iVar.f322838b);
        o0 o0Var = n1Var.f13418r;
        if (o0Var != null) {
            b0Var2.f13311c = o0Var.b(this, b0Var2.f13311c);
        }
        o0 o0Var2 = n1Var.f13419s;
        if (o0Var2 != null) {
            b0Var2.d = o0Var2.b(this, b0Var2.d);
        }
        U(n1Var, b0Var2, b0Var, zVar);
        h0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00fb, code lost:
    
        if (r8 != 8) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Y(b9.q0 r13, b9.p2 r14) {
        /*
            Method dump skipped, instruction units count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b9.w2.Y(b9.q0, b9.p2):void");
    }

    public void Z(k0 k0Var) {
        q0 q0Var;
        q0 q0Var2;
        q0 q0Var3;
        int i;
        float f;
        float f4;
        float f5;
        ArrayList arrayList;
        int size;
        m1 m1Var = ((u2) this.d).f13481a;
        String str = m1Var.f13405x;
        if (str == null && m1Var.f13406y == null && m1Var.z == null) {
            return;
        }
        if (str == null) {
            q0Var = null;
        } else {
            s1 s1VarC = k0Var.f13479a.c(str);
            if (s1VarC != null) {
                q0Var = (q0) s1VarC;
            } else {
                u("Marker reference '%s' not found", ((u2) this.d).f13481a.f13405x);
                q0Var = null;
            }
        }
        String str2 = ((u2) this.d).f13481a.f13406y;
        if (str2 == null) {
            q0Var2 = null;
        } else {
            s1 s1VarC2 = k0Var.f13479a.c(str2);
            if (s1VarC2 != null) {
                q0Var2 = (q0) s1VarC2;
            } else {
                u("Marker reference '%s' not found", ((u2) this.d).f13481a.f13406y);
                q0Var2 = null;
            }
        }
        String str3 = ((u2) this.d).f13481a.z;
        if (str3 == null) {
            q0Var3 = null;
        } else {
            s1 s1VarC3 = k0Var.f13479a.c(str3);
            if (s1VarC3 != null) {
                q0Var3 = (q0) s1VarC3;
            } else {
                u("Marker reference '%s' not found", ((u2) this.d).f13481a.z);
                q0Var3 = null;
            }
        }
        boolean z = k0Var instanceof u0;
        float f6 = BitmapDescriptorFactory.HUE_RED;
        if (z) {
            arrayList = new o2(this, ((u0) k0Var).o).f13427a;
            f4 = 0.0f;
            i = 1;
        } else if (k0Var instanceof p0) {
            p0 p0Var = (p0) k0Var;
            o0 o0Var = p0Var.o;
            float fE = o0Var != null ? o0Var.e(this) : 0.0f;
            o0 o0Var2 = p0Var.f13435p;
            float f32 = o0Var2 != null ? o0Var2.f(this) : 0.0f;
            o0 o0Var3 = p0Var.f13436q;
            float fE2 = o0Var3 != null ? o0Var3.e(this) : 0.0f;
            o0 o0Var4 = p0Var.f13437r;
            float f35 = o0Var4 != null ? o0Var4.f(this) : 0.0f;
            ArrayList arrayList2 = new ArrayList(2);
            float f36 = fE2 - fE;
            i = 1;
            float f37 = f35 - f32;
            arrayList2.add(new p2(fE, f32, f36, f37));
            arrayList2.add(new p2(fE2, f35, f36, f37));
            f4 = 0.0f;
            arrayList = arrayList2;
        } else {
            i = 1;
            y0 y0Var = (y0) k0Var;
            int length = y0Var.o.length;
            if (length < 2) {
                arrayList = null;
                f4 = 0.0f;
            } else {
                ArrayList arrayList3 = new ArrayList();
                float[] fArr = y0Var.o;
                p2 p2Var = new p2(fArr[0], fArr[1], BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                int i2 = 2;
                float f41 = 0.0f;
                float f42 = 0.0f;
                while (true) {
                    f = p2Var.f13442b;
                    f4 = f6;
                    f5 = p2Var.f13441a;
                    if (i2 >= length) {
                        break;
                    }
                    float[] fArr2 = y0Var.o;
                    float f57 = fArr2[i2];
                    float f69 = fArr2[i2 + 1];
                    p2Var.a(f57, f69);
                    arrayList3.add(p2Var);
                    p2Var = new p2(f57, f69, f57 - f5, f69 - f);
                    i2 += 2;
                    f42 = f69;
                    f41 = f57;
                    f6 = f4;
                }
                if (y0Var instanceof z0) {
                    float[] fArr3 = y0Var.o;
                    float f75 = fArr3[0];
                    if (f41 != f75) {
                        float f77 = fArr3[1];
                        if (f42 != f77) {
                            p2Var.a(f75, f77);
                            arrayList3.add(p2Var);
                            p2 p2Var2 = new p2(f75, f77, f75 - f5, f77 - f);
                            p2Var2.b((p2) arrayList3.get(0));
                            arrayList3.add(p2Var2);
                            arrayList3.set(0, p2Var2);
                        }
                    }
                } else {
                    arrayList3.add(p2Var);
                }
                arrayList = arrayList3;
            }
        }
        if (arrayList == null || (size = arrayList.size()) == 0) {
            return;
        }
        m1 m1Var2 = ((u2) this.d).f13481a;
        m1Var2.z = null;
        m1Var2.f13406y = null;
        m1Var2.f13405x = null;
        if (q0Var != null) {
            Y(q0Var, (p2) arrayList.get(0));
        }
        if (q0Var2 != null && arrayList.size() > 2) {
            p2 p2Var3 = (p2) arrayList.get(0);
            p2 p2Var4 = (p2) arrayList.get(i);
            int i3 = 1;
            while (i3 < size - 1) {
                i3++;
                p2 p2Var5 = (p2) arrayList.get(i3);
                if (p2Var4.e) {
                    float f81 = p2Var4.f13443c;
                    float f82 = p2Var4.d;
                    float f93 = p2Var4.f13441a;
                    float f94 = f93 - p2Var3.f13441a;
                    float f99 = p2Var4.f13442b;
                    float f100 = ((f99 - p2Var3.f13442b) * f82) + (f94 * f81);
                    if (f100 == f4) {
                        f100 = ((p2Var5.f13441a - f93) * f81) + ((p2Var5.f13442b - f99) * f82);
                    }
                    if (f100 <= f4 && (f100 != f4 || (f81 <= f4 && f82 < f4))) {
                        p2Var4.f13443c = -f81;
                        p2Var4.d = -f82;
                    }
                }
                Y(q0Var2, p2Var4);
                p2Var3 = p2Var4;
                p2Var4 = p2Var5;
            }
        }
        if (q0Var3 != null) {
            Y(q0Var3, (p2) arrayList.get(size - 1));
        }
    }

    @Override // dm2.a
    public Flow a() {
        Flow flowA = ((qfe.b) this.f13499b).a();
        uke.a aVar = (uke.a) this.e;
        Continuation continuation = null;
        wkm.l lVarQ = vkm.q.Q(aVar.a(), new uec.d(continuation, aVar, 5));
        ji5.m mVar = (ji5.m) this.d;
        vkm.y yVar = new vkm.y(new amh.w(vkm.q.Q(mVar.b(), new ji5.k(continuation, mVar, 1)), 13), new im2.b(3, 0, continuation));
        u29.o oVar = (u29.o) this.f;
        return nim.a.v(zh9.u0.m(flowA, xam.a.h(new im2.c(this, null), zh9.u0.i(lVarQ, yVar, c6d.b.i(oVar.f276579a.b(), new p4(oVar, 19))))), new ijj.p(26));
    }

    public void a0(r0 r0Var, b0 b0Var) {
        float fE;
        float f;
        Canvas canvas = (Canvas) this.f13499b;
        Boolean bool = r0Var.f13456n;
        if (bool == null || !bool.booleanValue()) {
            o0 o0Var = r0Var.f13457p;
            float fB = o0Var != null ? o0Var.b(this, 1.0f) : 1.2f;
            o0 o0Var2 = r0Var.f13458q;
            float fB2 = o0Var2 != null ? o0Var2.b(this, 1.0f) : 1.2f;
            fE = fB * b0Var.f13311c;
            f = fB2 * b0Var.d;
        } else {
            o0 o0Var3 = r0Var.f13457p;
            fE = o0Var3 != null ? o0Var3.e(this) : b0Var.f13311c;
            o0 o0Var4 = r0Var.f13458q;
            f = o0Var4 != null ? o0Var4.f(this) : b0Var.d;
        }
        if (fE == BitmapDescriptorFactory.HUE_RED || f == BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        i0();
        u2 u2VarZ = z(r0Var);
        this.d = u2VarZ;
        u2VarZ.f13481a.f13397m = Float.valueOf(1.0f);
        boolean zT = T();
        canvas.save();
        Boolean bool2 = r0Var.o;
        if (bool2 != null && !bool2.booleanValue()) {
            canvas.translate(b0Var.f13309a, b0Var.f13310b);
            canvas.scale(b0Var.f13311c, b0Var.d);
        }
        W(r0Var, false);
        canvas.restore();
        if (zT) {
            R(b0Var);
        }
        h0();
    }

    public Set b0(a0e.r state) {
        Intrinsics.checkNotNullParameter(state, "state");
        Iterable iterable = (List) state.e.getContent();
        if (iterable == null) {
            iterable = zhm.f0.f322471a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : iterable) {
            lyd.q item = (lyd.q) obj2;
            a0e.w wVar = (a0e.w) this.f13501g;
            wxd.g configuration = state.f365b.f300858a;
            Intrinsics.checkNotNullParameter(item, "item");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            LocalDate localDateE = ((l80.f) wVar.f375a).e();
            LocalDate localDate = (LocalDate) kotlin.ranges.f.d(a0e.w.g(configuration.f300860a, localDateE), localDateE);
            List list = item.f200798c;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it8 = list.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        wxd.a aVar = (wxd.a) it8.next();
                        LocalDate localDate2 = aVar.f300854b;
                        LocalDate localDate3 = aVar.f300853a;
                        if (localDate2 == null || localDate3.compareTo((ChronoLocalDate) localDate2) <= 0) {
                            if (localDate3.compareTo((ChronoLocalDate) localDate) <= 0) {
                                arrayList.add(obj2);
                                break;
                            }
                        }
                    }
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
        Iterator it9 = arrayList.iterator();
        while (it9.hasNext()) {
            arrayList2.add(((lyd.q) it9.next()).f200796a);
        }
        return zhm.d0.i1(arrayList2);
    }

    public StatementPeriod c(a0e.r state, Set set) throws CustomFilterCalculationException {
        StatementPeriod statementPeriod;
        LocalDate localDate;
        LocalDate localDate2;
        LocalDate localDate3;
        l80.e eVar = ((a0e.w) this.f13501g).f375a;
        Intrinsics.checkNotNullParameter(state, "state");
        wxd.z zVar = state.f366c;
        wxd.g configuration = state.f365b.f300858a;
        Data data = state.f367g;
        if (zVar == null) {
            wxd.a productPeriod = (wxd.a) data.getContent();
            if (productPeriod == null) {
                throw new CustomFilterCalculationException("Product period is not available");
            }
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            Intrinsics.checkNotNullParameter(productPeriod, "productPeriod");
            LocalDate localDateE = ((l80.f) eVar).e();
            LocalDate localDate4 = productPeriod.f300853a;
            LocalDate localDate5 = productPeriod.f300854b;
            if (localDate5 == null || (localDate3 = (LocalDate) kotlin.ranges.f.d(localDate5, localDateE)) == null) {
                localDate3 = localDateE;
            }
            StatementPeriod statementPeriod2 = new StatementPeriod(localDate4, (LocalDate) cim.c.l(localDate3, (LocalDate) kotlin.ranges.f.d(a0e.w.g(configuration.f300860a, localDateE), localDateE)));
            if (statementPeriod2.getStart().compareTo((ChronoLocalDate) statementPeriod2.getEnd()) <= 0) {
                return statementPeriod2;
            }
        } else {
            List list = (List) state.e.getContent();
            if (list != null) {
                ArrayList selectedItems = new ArrayList();
                for (Object obj2 : list) {
                    if ((set == null ? zhm.h0.f322473a : set).contains(((lyd.q) obj2).f200796a)) {
                        selectedItems.add(obj2);
                    }
                }
                wxd.a productPeriod2 = (wxd.a) data.getContent();
                if (productPeriod2 == null) {
                    throw new CustomFilterCalculationException("Product period is not available");
                }
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                Intrinsics.checkNotNullParameter(productPeriod2, "productPeriod");
                Intrinsics.checkNotNullParameter(selectedItems, "selectedItems");
                if (!selectedItems.isEmpty()) {
                    LocalDate localDateE2 = ((l80.f) eVar).e();
                    ArrayList<wxd.a> arrayList = new ArrayList();
                    Iterator it8 = selectedItems.iterator();
                    while (it8.hasNext()) {
                        zhm.a0.x(((lyd.q) it8.next()).f200798c, arrayList);
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (wxd.a aVar : arrayList) {
                        LocalDate localDate6 = aVar.f300854b;
                        LocalDate localDate7 = aVar.f300853a;
                        if (localDate6 == null || (localDate2 = (LocalDate) kotlin.ranges.f.d(localDate6, localDateE2)) == null) {
                            localDate2 = localDateE2;
                        }
                        StatementPeriod statementPeriod3 = localDate7.compareTo((ChronoLocalDate) localDate2) <= 0 ? new StatementPeriod(localDate7, localDate2) : null;
                        if (statementPeriod3 != null) {
                            arrayList2.add(statementPeriod3);
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        arrayList2 = null;
                    }
                    if (arrayList2 != null) {
                        Iterator it9 = arrayList2.iterator();
                        if (!it9.hasNext()) {
                            throw new NoSuchElementException();
                        }
                        LocalDate start = ((StatementPeriod) it9.next()).getStart();
                        while (it9.hasNext()) {
                            LocalDate start2 = ((StatementPeriod) it9.next()).getStart();
                            if (start.compareTo((Object) start2) > 0) {
                                start = start2;
                            }
                        }
                        Iterator it10 = arrayList2.iterator();
                        if (!it10.hasNext()) {
                            throw new NoSuchElementException();
                        }
                        LocalDate end2 = ((StatementPeriod) it10.next()).getEnd();
                        while (it10.hasNext()) {
                            LocalDate end3 = ((StatementPeriod) it10.next()).getEnd();
                            if (end2.compareTo((Object) end3) < 0) {
                                end2 = end3;
                            }
                        }
                        statementPeriod = new StatementPeriod(start, end2);
                    } else {
                        statementPeriod = null;
                    }
                    if (statementPeriod != null) {
                        LocalDate localDate8 = (LocalDate) cim.c.k(productPeriod2.f300853a, statementPeriod.getStart());
                        LocalDate localDate9 = productPeriod2.f300854b;
                        if (localDate9 == null || (localDate = (LocalDate) kotlin.ranges.f.d(localDate9, localDateE2)) == null) {
                            localDate = localDateE2;
                        }
                        StatementPeriod statementPeriod4 = new StatementPeriod(localDate8, (LocalDate) cim.c.l((LocalDate) cim.c.l(localDate, (LocalDate) kotlin.ranges.f.d(a0e.w.g(configuration.f300860a, localDateE2), localDateE2)), statementPeriod.getEnd()));
                        if (statementPeriod4.getStart().compareTo((ChronoLocalDate) statementPeriod4.getEnd()) <= 0) {
                            return statementPeriod4;
                        }
                    }
                }
            }
        }
        return null;
    }

    public Set c0(a0e.r state, Set requestedItemIds) throws CustomFilterCalculationException {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(requestedItemIds, "requestedItemIds");
        List list = (List) state.e.getContent();
        if (list == null) {
            throw new CustomFilterCalculationException("Product filter items are not available");
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(((lyd.q) it8.next()).f200796a);
        }
        Set setA = a0e.c.a(requestedItemIds, zhm.d0.i1(arrayList));
        if (setA.isEmpty()) {
            throw new CustomFilterCalculationException("No eligible product filter items are available");
        }
        return setA;
    }

    public Path d(r1 r1Var, b0 b0Var) {
        Path pathO;
        s1 s1VarC = r1Var.f13479a.c(((u2) this.d).f13481a.E);
        if (s1VarC == null) {
            u("ClipPath reference '%s' not found", ((u2) this.d).f13481a.E);
            return null;
        }
        d0 d0Var = (d0) s1VarC;
        ((Stack) this.e).push((u2) this.d);
        this.d = z(d0Var);
        Boolean bool = d0Var.o;
        boolean z = bool == null || bool.booleanValue();
        Matrix matrix = new Matrix();
        if (!z) {
            matrix.preTranslate(b0Var.f13309a, b0Var.f13310b);
            matrix.preScale(b0Var.f13311c, b0Var.d);
        }
        Matrix matrix2 = d0Var.f13388n;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        Path path = new Path();
        for (u1 u1Var : d0Var.i) {
            if ((u1Var instanceof r1) && (pathO = O((r1) u1Var, true)) != null) {
                path.op(pathO, Path.Op.UNION);
            }
        }
        if (((u2) this.d).f13481a.E != null) {
            if (d0Var.f13459h == null) {
                d0Var.f13459h = f(path);
            }
            Path pathD = d(d0Var, d0Var.f13459h);
            if (pathD != null) {
                path.op(pathD, Path.Op.INTERSECT);
            }
        }
        path.transform(matrix);
        this.d = (u2) ((Stack) this.e).pop();
        return path;
    }

    public void d0(float f, float f4, float f5, float f6) {
        float fE = f5 + f;
        float f32 = f6 + f4;
        twg.c cVar = ((u2) this.d).f13481a.f13404w;
        if (cVar != null) {
            f += ((o0) cVar.d).e(this);
            f4 += ((o0) ((u2) this.d).f13481a.f13404w.f275017a).f(this);
            fE -= ((o0) ((u2) this.d).f13481a.f13404w.f275018b).e(this);
            f32 -= ((o0) ((u2) this.d).f13481a.f13404w.f275019c).f(this);
        }
        ((Canvas) this.f13499b).clipRect(f, f4, fE, f32);
    }

    public StatementPeriodSelection e(a0e.r state) throws CustomFilterCalculationException {
        Intrinsics.checkNotNullParameter(state, "state");
        Iterable iterable = (List) state.e.getContent();
        if (iterable == null) {
            iterable = zhm.f0.f322471a;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(zhm.w.t(iterable2, 10));
        Iterator it8 = iterable2.iterator();
        while (it8.hasNext()) {
            arrayList.add(((lyd.q) it8.next()).f200796a);
        }
        StatementPeriod statementPeriodC = c(state, zhm.d0.i1(arrayList));
        if (statementPeriodC == null) {
            return null;
        }
        return d0e.c.b(statementPeriodC);
    }

    public void e0(hw0.e eVar, hw0.q qVar) {
        TrendView trendView = (TrendView) this.f13499b;
        ht0.t tVarG = qVar == hw0.q.LOWEST ? G() : F();
        if (eVar == null) {
            trendView.removeView(tVarG.f155179b);
            k0();
            return;
        }
        boolean zA = tVarG.a();
        if (!zA) {
            trendView.addView(tVarG.f155179b);
        }
        tVarG.d = eVar.f155996a;
        tVarG.f155180c.onNext(Unit.f186387a);
        if (!zA) {
            k0();
        }
        tVarG.f = eVar.f155998c;
        tVarG.e = eVar.f155997b;
    }

    public float g(f2 f2Var) {
        v2 v2Var = new v2(this);
        t(f2Var, v2Var);
        return v2Var.f13491a;
    }

    public yxd.c g0(boolean z) {
        Object value;
        yxd.c cVarA;
        vkm.j2 j2Var = ((h0e.b) this.f).f148375a;
        do {
            value = j2Var.getValue();
            yxd.c cVar = (yxd.c) value;
            if (cVar == null) {
                throw new IllegalStateException("Statement settings are not initialised");
            }
            cVarA = yxd.c.a(cVar, null, null, z, 7);
        } while (!j2Var.h(value, cVarA));
        return cVarA;
    }

    @Override // com.onfido.javax.inject.Provider
    public Object get() {
        switch (this.f13498a) {
            case 10:
                return new nl.u((Navigator) ((Provider) this.f13499b).get(), (nl.x0) ((Provider) this.f13500c).get(), (nl.p) ((a5h.g) this.d).get(), (WorkflowSupportedDocumentsStore) ((il.b) this.e).get(), (NfcInteractor) ((il.f) this.f).get(), (OnfidoRemoteConfig) ((il.a) this.f13501g).get());
            default:
                return new sl.j((WorkflowApi) ((fmc.z) this.f13499b).get(), (WorkflowConfig) ((f4h.a) this.f13500c).get(), (sl.a0) ((prl.e) this.d).get(), (SchedulersProvider) ((il.g) this.e).get(), (k7i.i) ((kdh.b) this.f).get(), (ApplicantId) ((il.d) this.f13501g).get());
        }
    }

    public void h0() {
        ((Canvas) this.f13499b).restore();
        this.d = (u2) ((Stack) this.e).pop();
    }

    public void i(r1 r1Var, b0 b0Var) {
        Path pathD;
        if (((u2) this.d).f13481a.E == null || (pathD = d(r1Var, b0Var)) == null) {
            return;
        }
        ((Canvas) this.f13499b).clipPath(pathD);
    }

    public void i0() {
        ((Canvas) this.f13499b).save();
        ((Stack) this.e).push((u2) this.d);
        this.d = new u2((u2) this.d);
    }

    public void j(r1 r1Var) {
        v1 v1Var = ((u2) this.d).f13481a.f13391b;
        if (v1Var instanceof t0) {
            p(true, r1Var.f13459h, (t0) v1Var);
        }
        v1 v1Var2 = ((u2) this.d).f13481a.e;
        if (v1Var2 instanceof t0) {
            p(false, r1Var.f13459h, (t0) v1Var2);
        }
    }

    public String j0(String str, boolean z, boolean z3) {
        if (((u2) this.d).f13485h) {
            return str.replaceAll("[\\n\\t]", " ");
        }
        String strReplaceAll = str.replaceAll("\\n", "").replaceAll("\\t", " ");
        if (z) {
            strReplaceAll = strReplaceAll.replaceAll("^\\s+", "");
        }
        if (z3) {
            strReplaceAll = strReplaceAll.replaceAll("\\s+$", "");
        }
        return strReplaceAll.replaceAll("\\s{2,}", " ");
    }

    public void k0() {
        TrendView trendView = (TrendView) this.f13499b;
        float f = trendView.f;
        float f4 = trendView.e;
        trendView.e();
        if (f == trendView.f && f4 == trendView.e) {
            n0(this, 1);
            return;
        }
        trendView.setChartDirty$ui_kit_components_release(true);
        trendView.setNeedCalcChart$ui_kit_components_release(true);
        n0(this, 3);
        trendView.invalidate();
    }

    public void l0(r1 r1Var) {
        if (r1Var.f13480b == null || r1Var.f13459h == null) {
            return;
        }
        Matrix matrix = new Matrix();
        if (((Matrix) ((Stack) this.f13501g).peek()).invert(matrix)) {
            b0 b0Var = r1Var.f13459h;
            float f = b0Var.f13309a;
            float f4 = b0Var.f13310b;
            float fA = b0Var.a();
            b0 b0Var2 = r1Var.f13459h;
            float f5 = b0Var2.f13310b;
            float fA2 = b0Var2.a();
            float fB = r1Var.f13459h.b();
            b0 b0Var3 = r1Var.f13459h;
            float[] fArr = {f, f4, fA, f5, fA2, fB, b0Var3.f13309a, b0Var3.b()};
            matrix.preConcat(((Canvas) this.f13499b).getMatrix());
            matrix.mapPoints(fArr);
            float f6 = fArr[0];
            float f32 = fArr[1];
            RectF rectF = new RectF(f6, f32, f6, f32);
            for (int i = 2; i <= 6; i += 2) {
                float f35 = fArr[i];
                if (f35 < rectF.left) {
                    rectF.left = f35;
                }
                if (f35 > rectF.right) {
                    rectF.right = f35;
                }
                float f36 = fArr[i + 1];
                if (f36 < rectF.top) {
                    rectF.top = f36;
                }
                if (f36 > rectF.bottom) {
                    rectF.bottom = f36;
                }
            }
            r1 r1Var2 = (r1) ((Stack) this.f).peek();
            b0 b0Var4 = r1Var2.f13459h;
            if (b0Var4 == null) {
                float f37 = rectF.left;
                float f41 = rectF.top;
                r1Var2.f13459h = new b0(f37, f41, rectF.right - f37, rectF.bottom - f41);
                return;
            }
            float f42 = rectF.left;
            float f57 = rectF.top;
            float f69 = rectF.right - f42;
            float f75 = rectF.bottom - f57;
            if (f42 < b0Var4.f13309a) {
                b0Var4.f13309a = f42;
            }
            if (f57 < b0Var4.f13310b) {
                b0Var4.f13310b = f57;
            }
            if (f42 + f69 > b0Var4.a()) {
                b0Var4.f13311c = (f42 + f69) - b0Var4.f13309a;
            }
            if (f57 + f75 > b0Var4.b()) {
                b0Var4.d = (f57 + f75) - b0Var4.f13310b;
            }
        }
    }

    public osf.g m() {
        return new osf.g((asf.a) this.f13499b, (zof.f) this.f13500c, (k61.a) this.d, (csf.b) this.e, (isf.e) this.f, (ang.f) this.f13501g);
    }

    public void m0(ht0.t tVar, boolean z) {
        boolean zA = tVar.a();
        ht0.p pVar = tVar.f155179b;
        if (zA) {
            TrendView trendView = (TrendView) this.f13499b;
            float f = trendView.e;
            float f4 = trendView.f;
            pVar.offsetTopAndBottom(rim.d.c((((1 - ((tVar.d - f4) / (f - f4))) * trendView.a()) - pVar.getDottedLineY()) + trendView.A) - pVar.getTop());
            if (z) {
                pVar.invalidate();
            }
        }
    }

    public xv.h n(LinkedHashSet validators, xv.d framesProvider, LifecycleOwner lifecycleOwner, dx.l previewMetadata, boolean z, boolean z3, cx.c mlType) {
        kge.d dVarA;
        Intrinsics.checkNotNullParameter(validators, "validators");
        Intrinsics.checkNotNullParameter(framesProvider, "framesProvider");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(previewMetadata, "previewMetadata");
        Intrinsics.checkNotNullParameter("default", "analysisCollectionFolder");
        Intrinsics.checkNotNullParameter(mlType, "mlType");
        od0.a aVar = od0.a.f224253a;
        if (od0.a.i() || z) {
            return new nx.b(new kl.b0(framesProvider), (kotlin.jvm.internal.f0) new eki.e(1, 3, LifecycleOwnerKt.class, lifecycleOwner, "lifecycleScope", "getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;"));
        }
        if (mlType instanceof cx.b) {
            dVarA = nw.c.a(new jj2.a(this, 16));
        } else {
            if (!(mlType instanceof cx.a)) {
                throw new NoWhenBranchMatchedException();
            }
            dVarA = nw.c.a(new jnf.a(this, mlType, 15));
        }
        kl.b0 b0Var = new kl.b0(framesProvider);
        return new jx.d(dVarA, validators, new fn2.c(new qy5.a(new kx.a(), new kx.b())), b0Var, new eki.e(1, 4, LifecycleOwnerKt.class, lifecycleOwner, "lifecycleScope", "getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;"), (ex.b) this.d, previewMetadata, new jx.e((Context) this.e, (fx.a) this.f, z3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ht0.t o(hw0.q qVar) {
        TrendView trendView = (TrendView) this.f13499b;
        Context context = trendView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ht0.p pVar = new ht0.p(context, null, 6, 0);
        pVar.setListener(this);
        pVar.setLabelClickListener(new ap0.f(this, qVar, 14));
        pVar.setDraggableLimitType(qVar);
        Context context2 = pVar.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        pVar.setDottedLineColor(kli.a.s(R$attr.uikit_colorAccent, context2));
        Integer num = null;
        Object[] objArr = 0 == true ? 1 : 0;
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_pencil, (Integer) null, num, (Integer) objArr, (List) null, (ImageTransformations) null, (Clause) null, 254);
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        pVar.setIcons(resourceImage, new ResourceImage(R$drawable.uikit_icn_24_drag, num, (Integer) objArr2, (Integer) (0 == true ? 1 : 0), (List) (0 == true ? 1 : 0), (ImageTransformations) objArr3, (Clause) null, 254));
        pVar.setZ(10.0f);
        return new ht0.t(trendView, pVar);
    }

    public void o0(u2 u2Var, m1 m1Var) {
        if (I(m1Var, 4096L)) {
            u2Var.f13481a.f13398n = m1Var.f13398n;
        }
        if (I(m1Var, 2048L)) {
            u2Var.f13481a.f13397m = m1Var.f13397m;
        }
        boolean zI = I(m1Var, 1L);
        e0 e0Var = e0.f13340c;
        if (zI) {
            u2Var.f13481a.f13391b = m1Var.f13391b;
            v1 v1Var = m1Var.f13391b;
            u2Var.f13482b = (v1Var == null || v1Var == e0Var) ? false : true;
        }
        if (I(m1Var, 4L)) {
            u2Var.f13481a.d = m1Var.d;
        }
        if (I(m1Var, 6149L)) {
            f0(u2Var, true, u2Var.f13481a.f13391b);
        }
        if (I(m1Var, 2L)) {
            u2Var.f13481a.f13392c = m1Var.f13392c;
        }
        if (I(m1Var, 8L)) {
            u2Var.f13481a.e = m1Var.e;
            v1 v1Var2 = m1Var.e;
            u2Var.f13483c = (v1Var2 == null || v1Var2 == e0Var) ? false : true;
        }
        if (I(m1Var, 16L)) {
            u2Var.f13481a.f = m1Var.f;
        }
        if (I(m1Var, 6168L)) {
            f0(u2Var, false, u2Var.f13481a.e);
        }
        if (I(m1Var, 34359738368L)) {
            u2Var.f13481a.L = m1Var.L;
        }
        if (I(m1Var, 32L)) {
            m1 m1Var2 = u2Var.f13481a;
            o0 o0Var = m1Var.f13393g;
            m1Var2.f13393g = o0Var;
            u2Var.e.setStrokeWidth(o0Var.a(this));
        }
        if (I(m1Var, 64L)) {
            m1 m1Var3 = u2Var.f13481a;
            Paint paint = u2Var.e;
            m1Var3.f13394h = m1Var.f13394h;
            int i = n2.f13421b[m1Var.f13394h.ordinal()];
            if (i == 1) {
                paint.setStrokeCap(Paint.Cap.BUTT);
            } else if (i == 2) {
                paint.setStrokeCap(Paint.Cap.ROUND);
            } else if (i == 3) {
                paint.setStrokeCap(Paint.Cap.SQUARE);
            }
        }
        if (I(m1Var, 128L)) {
            m1 m1Var4 = u2Var.f13481a;
            Paint paint2 = u2Var.e;
            m1Var4.i = m1Var.i;
            int i2 = n2.f13422c[m1Var.i.ordinal()];
            if (i2 == 1) {
                paint2.setStrokeJoin(Paint.Join.MITER);
            } else if (i2 == 2) {
                paint2.setStrokeJoin(Paint.Join.ROUND);
            } else if (i2 == 3) {
                paint2.setStrokeJoin(Paint.Join.BEVEL);
            }
        }
        if (I(m1Var, 256L)) {
            u2Var.f13481a.f13395j = m1Var.f13395j;
            u2Var.e.setStrokeMiter(m1Var.f13395j.floatValue());
        }
        if (I(m1Var, 512L)) {
            u2Var.f13481a.k = m1Var.k;
        }
        if (I(m1Var, FileSize.KB_COEFFICIENT)) {
            u2Var.f13481a.f13396l = m1Var.f13396l;
        }
        Typeface typefaceK = null;
        if (I(m1Var, 1536L)) {
            m1 m1Var5 = u2Var.f13481a;
            Paint paint3 = u2Var.e;
            o0[] o0VarArr = m1Var5.k;
            if (o0VarArr == null) {
                paint3.setPathEffect(null);
            } else {
                int length = o0VarArr.length;
                int i3 = length % 2 == 0 ? length : length * 2;
                float[] fArr = new float[i3];
                float f = 0.0f;
                for (int i5 = 0; i5 < i3; i5++) {
                    float fA = m1Var5.k[i5 % length].a(this);
                    fArr[i5] = fA;
                    f += fA;
                }
                if (f == BitmapDescriptorFactory.HUE_RED) {
                    paint3.setPathEffect(null);
                } else {
                    float fA2 = m1Var5.f13396l.a(this);
                    if (fA2 < BitmapDescriptorFactory.HUE_RED) {
                        fA2 = (fA2 % f) + f;
                    }
                    paint3.setPathEffect(new DashPathEffect(fArr, fA2));
                }
            }
        }
        if (I(m1Var, 16384L)) {
            float textSize = ((u2) this.d).d.getTextSize();
            u2Var.f13481a.f13399p = m1Var.f13399p;
            u2Var.d.setTextSize(m1Var.f13399p.b(this, textSize));
            u2Var.e.setTextSize(m1Var.f13399p.b(this, textSize));
        }
        if (I(m1Var, FileAppender.DEFAULT_BUFFER_SIZE)) {
            u2Var.f13481a.o = m1Var.o;
        }
        if (I(m1Var, 32768L)) {
            if (m1Var.f13400q.intValue() == -1 && u2Var.f13481a.f13400q.intValue() > 100) {
                m1 m1Var6 = u2Var.f13481a;
                m1Var6.f13400q = Integer.valueOf(m1Var6.f13400q.intValue() - 100);
            } else if (m1Var.f13400q.intValue() != 1 || u2Var.f13481a.f13400q.intValue() >= 900) {
                u2Var.f13481a.f13400q = m1Var.f13400q;
            } else {
                m1 m1Var7 = u2Var.f13481a;
                m1Var7.f13400q = Integer.valueOf(m1Var7.f13400q.intValue() + 100);
            }
        }
        if (I(m1Var, 65536L)) {
            u2Var.f13481a.f13401r = m1Var.f13401r;
        }
        if (I(m1Var, 106496L)) {
            m1 m1Var8 = u2Var.f13481a;
            ArrayList arrayList = m1Var8.o;
            if (arrayList != null && ((m2) this.f13500c) != null) {
                Iterator it8 = arrayList.iterator();
                while (it8.hasNext() && (typefaceK = k((String) it8.next(), m1Var8.f13400q, m1Var8.f13401r)) == null) {
                }
            }
            if (typefaceK == null) {
                typefaceK = k("serif", m1Var8.f13400q, m1Var8.f13401r);
            }
            u2Var.d.setTypeface(typefaceK);
            u2Var.e.setTypeface(typefaceK);
        }
        if (I(m1Var, 131072L)) {
            m1 m1Var9 = u2Var.f13481a;
            Paint paint4 = u2Var.e;
            Paint paint5 = u2Var.d;
            m1Var9.f13402s = m1Var.f13402s;
            j1 j1Var = m1Var.f13402s;
            j1 j1Var2 = j1.LineThrough;
            paint5.setStrikeThruText(j1Var == j1Var2);
            j1 j1Var3 = m1Var.f13402s;
            j1 j1Var4 = j1.Underline;
            paint5.setUnderlineText(j1Var3 == j1Var4);
            paint4.setStrikeThruText(m1Var.f13402s == j1Var2);
            paint4.setUnderlineText(m1Var.f13402s == j1Var4);
        }
        if (I(m1Var, 68719476736L)) {
            u2Var.f13481a.f13403t = m1Var.f13403t;
        }
        if (I(m1Var, 262144L)) {
            u2Var.f13481a.u = m1Var.u;
        }
        if (I(m1Var, 524288L)) {
            u2Var.f13481a.v = m1Var.v;
        }
        if (I(m1Var, 2097152L)) {
            u2Var.f13481a.f13405x = m1Var.f13405x;
        }
        if (I(m1Var, 4194304L)) {
            u2Var.f13481a.f13406y = m1Var.f13406y;
        }
        if (I(m1Var, 8388608L)) {
            u2Var.f13481a.z = m1Var.z;
        }
        if (I(m1Var, 16777216L)) {
            u2Var.f13481a.A = m1Var.A;
        }
        if (I(m1Var, 33554432L)) {
            u2Var.f13481a.B = m1Var.B;
        }
        if (I(m1Var, FileSize.MB_COEFFICIENT)) {
            u2Var.f13481a.f13404w = m1Var.f13404w;
        }
        if (I(m1Var, 268435456L)) {
            u2Var.f13481a.E = m1Var.E;
        }
        if (I(m1Var, 536870912L)) {
            u2Var.f13481a.F = m1Var.F;
        }
        if (I(m1Var, FileSize.GB_COEFFICIENT)) {
            u2Var.f13481a.G = m1Var.G;
        }
        if (I(m1Var, 67108864L)) {
            u2Var.f13481a.C = m1Var.C;
        }
        if (I(m1Var, 134217728L)) {
            u2Var.f13481a.D = m1Var.D;
        }
        if (I(m1Var, 8589934592L)) {
            u2Var.f13481a.J = m1Var.J;
        }
        if (I(m1Var, 17179869184L)) {
            u2Var.f13481a.K = m1Var.K;
        }
        if (I(m1Var, 137438953472L)) {
            u2Var.f13481a.M = m1Var.M;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void p(boolean z, b0 b0Var, t0 t0Var) {
        float f;
        float fB;
        float f4;
        float f5;
        float fB2;
        float f6;
        float fB3;
        float f32;
        s1 s1VarC = ((m2) this.f13500c).c(t0Var.f13468a);
        if (s1VarC == null) {
            u("%s reference '%s' not found", z ? "Fill" : "Stroke", t0Var.f13468a);
            v1 v1Var = t0Var.f13469b;
            if (v1Var != null) {
                f0((u2) this.d, z, v1Var);
                return;
            } else if (z) {
                ((u2) this.d).f13482b = false;
                return;
            } else {
                ((u2) this.d).f13483c = false;
                return;
            }
        }
        boolean z3 = s1VarC instanceof t1;
        e0 e0Var = e0.f13339b;
        if (z3) {
            t1 t1Var = (t1) s1VarC;
            String str = t1Var.f13365l;
            if (str != null) {
                w(t1Var, str);
            }
            Boolean bool = t1Var.i;
            Object[] objArr = bool != null && bool.booleanValue();
            u2 u2Var = (u2) this.d;
            Paint paint = z ? u2Var.d : u2Var.e;
            if (objArr == true) {
                u2 u2Var2 = (u2) this.d;
                b0 b0Var2 = u2Var2.f13484g;
                if (b0Var2 == null) {
                    b0Var2 = u2Var2.f;
                }
                o0 o0Var = t1Var.f13470m;
                float fE = o0Var != null ? o0Var.e(this) : 0.0f;
                o0 o0Var2 = t1Var.f13471n;
                fB2 = o0Var2 != null ? o0Var2.f(this) : 0.0f;
                f5 = 256.0f;
                o0 o0Var3 = t1Var.o;
                float fE2 = o0Var3 != null ? o0Var3.e(this) : b0Var2.f13311c;
                o0 o0Var4 = t1Var.f13472p;
                f32 = fE2;
                f6 = fE;
                fB3 = o0Var4 != null ? o0Var4.f(this) : 0.0f;
            } else {
                f5 = 256.0f;
                o0 o0Var5 = t1Var.f13470m;
                float fB4 = o0Var5 != null ? o0Var5.b(this, 1.0f) : 0.0f;
                o0 o0Var6 = t1Var.f13471n;
                fB2 = o0Var6 != null ? o0Var6.b(this, 1.0f) : 0.0f;
                o0 o0Var7 = t1Var.o;
                float fB5 = o0Var7 != null ? o0Var7.b(this, 1.0f) : 1.0f;
                o0 o0Var8 = t1Var.f13472p;
                f6 = fB4;
                fB3 = o0Var8 != null ? o0Var8.b(this, 1.0f) : 0.0f;
                f32 = fB5;
            }
            float f35 = fB2;
            i0();
            this.d = z(t1Var);
            Matrix matrix = new Matrix();
            if (objArr == false) {
                matrix.preTranslate(b0Var.f13309a, b0Var.f13310b);
                matrix.preScale(b0Var.f13311c, b0Var.d);
            }
            Matrix matrix2 = t1Var.f13364j;
            if (matrix2 != null) {
                matrix.preConcat(matrix2);
            }
            int size = t1Var.f13363h.size();
            if (size == 0) {
                h0();
                if (z) {
                    ((u2) this.d).f13482b = false;
                    return;
                } else {
                    ((u2) this.d).f13483c = false;
                    return;
                }
            }
            int[] iArr = new int[size];
            float[] fArr = new float[size];
            Iterator it8 = t1Var.f13363h.iterator();
            int i = 0;
            float f36 = -1.0f;
            while (it8.hasNext()) {
                c1 c1Var = (c1) ((u1) it8.next());
                Float f37 = c1Var.f13319h;
                float fFloatValue = f37 != null ? f37.floatValue() : 0.0f;
                if (i == 0 || fFloatValue >= f36) {
                    fArr[i] = fFloatValue;
                    f36 = fFloatValue;
                } else {
                    fArr[i] = f36;
                }
                i0();
                p0((u2) this.d, c1Var);
                m1 m1Var = ((u2) this.d).f13481a;
                e0 e0Var2 = (e0) m1Var.C;
                if (e0Var2 == null) {
                    e0Var2 = e0Var;
                }
                iArr[i] = l(m1Var.D.floatValue(), e0Var2.f13341a);
                i++;
                h0();
            }
            if ((f6 == f32 && f35 == fB3) || size == 1) {
                h0();
                paint.setColor(iArr[size - 1]);
                return;
            }
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            j0 j0Var = t1Var.k;
            if (j0Var != null) {
                if (j0Var == j0.reflect) {
                    tileMode = Shader.TileMode.MIRROR;
                } else if (j0Var == j0.repeat) {
                    tileMode = Shader.TileMode.REPEAT;
                }
            }
            Shader.TileMode tileMode2 = tileMode;
            h0();
            LinearGradient linearGradient = new LinearGradient(f6, f35, f32, fB3, iArr, fArr, tileMode2);
            linearGradient.setLocalMatrix(matrix);
            paint.setShader(linearGradient);
            int iFloatValue = (int) (((u2) this.d).f13481a.d.floatValue() * f5);
            paint.setAlpha(iFloatValue >= 0 ? iFloatValue > 255 ? 255 : iFloatValue : 0);
            return;
        }
        if (!(s1VarC instanceof x1)) {
            if (s1VarC instanceof b1) {
                b1 b1Var = (b1) s1VarC;
                if (z) {
                    if (I(b1Var.e, 2147483648L)) {
                        u2 u2Var3 = (u2) this.d;
                        m1 m1Var2 = u2Var3.f13481a;
                        v1 v1Var2 = b1Var.e.H;
                        m1Var2.f13391b = v1Var2;
                        u2Var3.f13482b = v1Var2 != null;
                    }
                    if (I(b1Var.e, 4294967296L)) {
                        ((u2) this.d).f13481a.d = b1Var.e.I;
                    }
                    if (I(b1Var.e, 6442450944L)) {
                        u2 u2Var4 = (u2) this.d;
                        f0(u2Var4, z, u2Var4.f13481a.f13391b);
                        return;
                    }
                    return;
                }
                if (I(b1Var.e, 2147483648L)) {
                    u2 u2Var5 = (u2) this.d;
                    m1 m1Var3 = u2Var5.f13481a;
                    v1 v1Var3 = b1Var.e.H;
                    m1Var3.e = v1Var3;
                    u2Var5.f13483c = v1Var3 != null;
                }
                if (I(b1Var.e, 4294967296L)) {
                    ((u2) this.d).f13481a.f = b1Var.e.I;
                }
                if (I(b1Var.e, 6442450944L)) {
                    u2 u2Var6 = (u2) this.d;
                    f0(u2Var6, z, u2Var6.f13481a.e);
                    return;
                }
                return;
            }
            return;
        }
        x1 x1Var = (x1) s1VarC;
        String str2 = x1Var.f13365l;
        if (str2 != null) {
            w(x1Var, str2);
        }
        Boolean bool2 = x1Var.i;
        Object[] objArr2 = bool2 != null && bool2.booleanValue();
        u2 u2Var7 = (u2) this.d;
        Paint paint2 = z ? u2Var7.d : u2Var7.e;
        if (objArr2 == true) {
            o0 o0Var9 = new o0(50.0f, j2.percent);
            o0 o0Var10 = x1Var.f13508m;
            float fE3 = o0Var10 != null ? o0Var10.e(this) : o0Var9.e(this);
            o0 o0Var11 = x1Var.f13509n;
            float f41 = o0Var11 != null ? o0Var11.f(this) : o0Var9.f(this);
            o0 o0Var12 = x1Var.o;
            fB = o0Var12 != null ? o0Var12.a(this) : o0Var9.a(this);
            f = fE3;
            f4 = f41;
        } else {
            o0 o0Var13 = x1Var.f13508m;
            float fB6 = o0Var13 != null ? o0Var13.b(this, 1.0f) : 0.5f;
            o0 o0Var14 = x1Var.f13509n;
            float fB7 = o0Var14 != null ? o0Var14.b(this, 1.0f) : 0.5f;
            o0 o0Var15 = x1Var.o;
            f = fB6;
            fB = o0Var15 != null ? o0Var15.b(this, 1.0f) : 0.5f;
            f4 = fB7;
        }
        i0();
        this.d = z(x1Var);
        Matrix matrix3 = new Matrix();
        if (objArr2 == false) {
            matrix3.preTranslate(b0Var.f13309a, b0Var.f13310b);
            matrix3.preScale(b0Var.f13311c, b0Var.d);
        }
        Matrix matrix4 = x1Var.f13364j;
        if (matrix4 != null) {
            matrix3.preConcat(matrix4);
        }
        int size2 = x1Var.f13363h.size();
        if (size2 == 0) {
            h0();
            if (z) {
                ((u2) this.d).f13482b = false;
                return;
            } else {
                ((u2) this.d).f13483c = false;
                return;
            }
        }
        int[] iArr2 = new int[size2];
        float[] fArr2 = new float[size2];
        Iterator it9 = x1Var.f13363h.iterator();
        int i2 = 0;
        float f42 = -1.0f;
        while (it9.hasNext()) {
            c1 c1Var2 = (c1) ((u1) it9.next());
            Float f57 = c1Var2.f13319h;
            float fFloatValue2 = f57 != null ? f57.floatValue() : 0.0f;
            if (i2 == 0 || fFloatValue2 >= f42) {
                fArr2[i2] = fFloatValue2;
                f42 = fFloatValue2;
            } else {
                fArr2[i2] = f42;
            }
            i0();
            p0((u2) this.d, c1Var2);
            m1 m1Var4 = ((u2) this.d).f13481a;
            e0 e0Var3 = (e0) m1Var4.C;
            if (e0Var3 == null) {
                e0Var3 = e0Var;
            }
            iArr2[i2] = l(m1Var4.D.floatValue(), e0Var3.f13341a);
            i2++;
            h0();
        }
        if (fB == BitmapDescriptorFactory.HUE_RED || size2 == 1) {
            h0();
            paint2.setColor(iArr2[size2 - 1]);
            return;
        }
        Shader.TileMode tileMode3 = Shader.TileMode.CLAMP;
        j0 j0Var2 = x1Var.k;
        if (j0Var2 != null) {
            if (j0Var2 == j0.reflect) {
                tileMode3 = Shader.TileMode.MIRROR;
            } else if (j0Var2 == j0.repeat) {
                tileMode3 = Shader.TileMode.REPEAT;
            }
        }
        Shader.TileMode tileMode4 = tileMode3;
        h0();
        RadialGradient radialGradient = new RadialGradient(f, f4, fB, iArr2, fArr2, tileMode4);
        radialGradient.setLocalMatrix(matrix3);
        paint2.setShader(radialGradient);
        int iFloatValue2 = (int) (((u2) this.d).f13481a.d.floatValue() * 256.0f);
        paint2.setAlpha(iFloatValue2 >= 0 ? iFloatValue2 > 255 ? 255 : iFloatValue2 : 0);
    }

    public void p0(u2 u2Var, s1 s1Var) {
        boolean z = s1Var.f13480b == null;
        m1 m1Var = u2Var.f13481a;
        Float fValueOf = Float.valueOf(1.0f);
        Boolean bool = Boolean.TRUE;
        m1Var.A = bool;
        if (!z) {
            bool = Boolean.FALSE;
        }
        m1Var.v = bool;
        m1Var.f13404w = null;
        m1Var.E = null;
        m1Var.f13397m = fValueOf;
        m1Var.C = e0.f13339b;
        m1Var.D = fValueOf;
        m1Var.G = null;
        m1Var.H = null;
        m1Var.I = fValueOf;
        m1Var.J = null;
        m1Var.K = fValueOf;
        m1Var.L = l1.None;
        m1 m1Var2 = s1Var.e;
        if (m1Var2 != null) {
            o0(u2Var, m1Var2);
        }
        ArrayList arrayList = ((m2) this.f13500c).f13408b.f13445b;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (p pVar : ((m2) this.f13500c).f13408b.f13445b) {
                if (u.n(pVar.f13432a, s1Var)) {
                    o0(u2Var, pVar.f13433b);
                }
            }
        }
        m1 m1Var3 = s1Var.f;
        if (m1Var3 != null) {
            o0(u2Var, m1Var3);
        }
    }

    public boolean q() {
        Boolean bool = ((u2) this.d).f13481a.A;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public void q0() {
        int iL;
        m1 m1Var = ((u2) this.d).f13481a;
        v1 v1Var = m1Var.J;
        if (v1Var instanceof e0) {
            iL = ((e0) v1Var).f13341a;
        } else if (!(v1Var instanceof f0)) {
            return;
        } else {
            iL = m1Var.f13398n.f13341a;
        }
        Float f = m1Var.K;
        if (f != null) {
            iL = l(f.floatValue(), iL);
        }
        ((Canvas) this.f13499b).drawColor(iL);
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x0177  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void r(b9.r1 r23, android.graphics.Path r24) {
        /*
            Method dump skipped, instruction units count: 576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b9.w2.r(b9.r1, android.graphics.Path):void");
    }

    public boolean r0() {
        Boolean bool = ((u2) this.d).f13481a.B;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public void s(Path path) {
        Canvas canvas = (Canvas) this.f13499b;
        u2 u2Var = (u2) this.d;
        if (u2Var.f13481a.L != l1.NonScalingStroke) {
            canvas.drawPath(path, u2Var.e);
            return;
        }
        Matrix matrix = canvas.getMatrix();
        Path path2 = new Path();
        path.transform(matrix, path2);
        canvas.setMatrix(new Matrix());
        Shader shader = ((u2) this.d).e.getShader();
        Matrix matrix2 = new Matrix();
        if (shader != null) {
            shader.getLocalMatrix(matrix2);
            Matrix matrix3 = new Matrix(matrix2);
            matrix3.postConcat(matrix);
            shader.setLocalMatrix(matrix3);
        }
        canvas.drawPath(path2, ((u2) this.d).e);
        canvas.setMatrix(matrix);
        if (shader != null) {
            shader.setLocalMatrix(matrix2);
        }
    }

    public void t(f2 f2Var, g4i.a aVar) {
        float f;
        float f4;
        float fE;
        i1 i1VarB;
        if (q()) {
            Iterator it8 = f2Var.i.iterator();
            boolean z = true;
            while (it8.hasNext()) {
                u1 u1Var = (u1) it8.next();
                if (u1Var instanceof i2) {
                    aVar.r(j0(((i2) u1Var).f13366c, z, !it8.hasNext()));
                } else if (aVar.b((f2) u1Var)) {
                    boolean z3 = u1Var instanceof g2;
                    float f5 = BitmapDescriptorFactory.HUE_RED;
                    if (z3) {
                        i0();
                        g2 g2Var = (g2) u1Var;
                        p0((u2) this.d, g2Var);
                        if (q() && r0()) {
                            s1 s1VarC = g2Var.f13479a.c(g2Var.f13348n);
                            if (s1VarC == null) {
                                u("TextPath reference '%s' not found", g2Var.f13348n);
                            } else {
                                u0 u0Var = (u0) s1VarC;
                                q2 q2Var = new q2(u0Var.o);
                                Matrix matrix = u0Var.f13383n;
                                Path path = q2Var.f13451a;
                                if (matrix != null) {
                                    path.transform(matrix);
                                }
                                PathMeasure pathMeasure = new PathMeasure(path, false);
                                o0 o0Var = g2Var.o;
                                if (o0Var != null) {
                                    f5 = o0Var.b(this, pathMeasure.getLength());
                                }
                                i1 i1VarB2 = B();
                                if (i1VarB2 != i1.Start) {
                                    float fG = g(g2Var);
                                    if (i1VarB2 == i1.Middle) {
                                        fG /= 2.0f;
                                    }
                                    f5 -= fG;
                                }
                                j(g2Var.f13349p);
                                boolean zT = T();
                                t(g2Var, new r2(this, path, f5));
                                if (zT) {
                                    R(g2Var.f13459h);
                                }
                            }
                        }
                        h0();
                    } else if (u1Var instanceof c2) {
                        i0();
                        c2 c2Var = (c2) u1Var;
                        p0((u2) this.d, c2Var);
                        if (q()) {
                            ArrayList arrayList = c2Var.f13360n;
                            boolean z4 = arrayList != null && arrayList.size() > 0;
                            boolean z6 = aVar instanceof s2;
                            if (z6) {
                                float fE2 = !z4 ? ((s2) aVar).f13465a : ((o0) c2Var.f13360n.get(0)).e(this);
                                ArrayList arrayList2 = c2Var.o;
                                f4 = (arrayList2 == null || arrayList2.size() == 0) ? ((s2) aVar).f13466b : ((o0) c2Var.o.get(0)).f(this);
                                ArrayList arrayList3 = c2Var.f13361p;
                                fE = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((o0) c2Var.f13361p.get(0)).e(this);
                                ArrayList arrayList4 = c2Var.f13362q;
                                if (arrayList4 != null && arrayList4.size() != 0) {
                                    f5 = ((o0) c2Var.f13362q.get(0)).f(this);
                                }
                                float f6 = fE2;
                                f = f5;
                                f5 = f6;
                            } else {
                                f = 0.0f;
                                f4 = 0.0f;
                                fE = 0.0f;
                            }
                            if (z4 && (i1VarB = B()) != i1.Start) {
                                float fG2 = g(c2Var);
                                if (i1VarB == i1.Middle) {
                                    fG2 /= 2.0f;
                                }
                                f5 -= fG2;
                            }
                            j(c2Var.f13320r);
                            if (z6) {
                                s2 s2Var = (s2) aVar;
                                s2Var.f13465a = f5 + fE;
                                s2Var.f13466b = f4 + f;
                            }
                            boolean zT2 = T();
                            t(c2Var, aVar);
                            if (zT2) {
                                R(c2Var.f13459h);
                            }
                        }
                        h0();
                    } else if (u1Var instanceof b2) {
                        i0();
                        b2 b2Var = (b2) u1Var;
                        p0((u2) this.d, b2Var);
                        if (q()) {
                            j(b2Var.o);
                            s1 s1VarC2 = u1Var.f13479a.c(b2Var.f13312n);
                            if (s1VarC2 == null || !(s1VarC2 instanceof f2)) {
                                u("Tref reference '%s' not found", b2Var.f13312n);
                            } else {
                                StringBuilder sb6 = new StringBuilder();
                                v((f2) s1VarC2, sb6);
                                if (sb6.length() > 0) {
                                    aVar.r(sb6.toString());
                                }
                            }
                        }
                        h0();
                    }
                }
                z = false;
            }
        }
    }

    public void v(f2 f2Var, StringBuilder sb6) {
        Iterator it8 = f2Var.i.iterator();
        boolean z = true;
        while (it8.hasNext()) {
            u1 u1Var = (u1) it8.next();
            if (u1Var instanceof f2) {
                v((f2) u1Var, sb6);
            } else if (u1Var instanceof i2) {
                sb6.append(j0(((i2) u1Var).f13366c, z, !it8.hasNext()));
            }
            z = false;
        }
    }

    public u2 z(s1 s1Var) {
        u2 u2Var = new u2();
        o0(u2Var, m1.a());
        A(s1Var, u2Var);
        return u2Var;
    }

    public w2(String shortcutId, ipa.n user, String label, Bitmap bitmap, Intent shortcutIntent, ipa.a conversationType) {
        this.f13498a = 7;
        Intrinsics.checkNotNullParameter(shortcutId, "shortcutId");
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(shortcutIntent, "shortcutIntent");
        Intrinsics.checkNotNullParameter(conversationType, "conversationType");
        this.f13499b = shortcutId;
        this.f13500c = user;
        this.d = label;
        this.e = bitmap;
        this.f = shortcutIntent;
        this.f13501g = conversationType;
    }

    public w2(SurfaceTexture surfaceTexture) {
        this.f13498a = 9;
        Intrinsics.checkNotNullParameter(surfaceTexture, "surfaceTexture");
        this.f13499b = surfaceTexture;
        EGL egl2 = EGLContext.getEGL();
        Intrinsics.i(egl2, "null cannot be cast to non-null type javax.microedition.khronos.egl.EGL10");
        EGL10 egl3 = (EGL10) egl2;
        this.f13500c = egl3;
        Intrinsics.checkNotNullParameter(egl3, "egl");
        EGLDisplay display = egl3.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        egl3.eglInitialize(display, new int[3]);
        Intrinsics.checkNotNullExpressionValue(display, "also(...)");
        this.d = display;
        Intrinsics.checkNotNullParameter(egl3, "egl");
        Intrinsics.checkNotNullParameter(display, "display");
        int[] iArr = {12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 16, 12352, 4, 12344};
        int[] iArr2 = new int[1];
        egl3.eglChooseConfig(display, iArr, null, 0, iArr2);
        int iN = kotlin.collections.d.N(iArr2);
        if (iN != 0) {
            EGLConfig[] eGLConfigArr = new EGLConfig[iN];
            egl3.eglChooseConfig(display, iArr, eGLConfigArr, iN, iArr2);
            EGLConfig config = (EGLConfig) kotlin.collections.d.O(eGLConfigArr);
            if (config != null) {
                this.e = config;
                Intrinsics.checkNotNullParameter(egl3, "egl");
                Intrinsics.checkNotNullParameter(display, "display");
                Intrinsics.checkNotNullParameter(config, "config");
                EGLContext eGLContextEglCreateContext = egl3.eglCreateContext(display, config, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
                Intrinsics.checkNotNullExpressionValue(eGLContextEglCreateContext, "eglCreateContext(...)");
                this.f = eGLContextEglCreateContext;
                EGLSurface eGLSurfaceEglCreateWindowSurface = egl3.eglCreateWindowSurface(display, config, surfaceTexture, null);
                egl3.eglMakeCurrent(display, eGLSurfaceEglCreateWindowSurface, eGLSurfaceEglCreateWindowSurface, eGLContextEglCreateContext);
                Intrinsics.checkNotNullExpressionValue(eGLSurfaceEglCreateWindowSurface, "also(...)");
                this.f13501g = eGLSurfaceEglCreateWindowSurface;
                return;
            }
            throw new IllegalStateException("Error during EGL config");
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public w2(asf.a transferReasonsFeatureChecker, zof.f transferFeatureScreensProvider, k61.a transferInteractor, csf.b transferReasonsInteractor, isf.e reasonsRequestFactory, ang.f userInteractor) {
        this.f13498a = 12;
        Intrinsics.checkNotNullParameter(transferReasonsFeatureChecker, "transferReasonsFeatureChecker");
        Intrinsics.checkNotNullParameter(transferFeatureScreensProvider, "transferFeatureScreensProvider");
        Intrinsics.checkNotNullParameter(transferInteractor, "transferInteractor");
        Intrinsics.checkNotNullParameter(transferReasonsInteractor, "transferReasonsInteractor");
        Intrinsics.checkNotNullParameter(reasonsRequestFactory, "reasonsRequestFactory");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f13499b = transferReasonsFeatureChecker;
        this.f13500c = transferFeatureScreensProvider;
        this.d = transferInteractor;
        this.e = transferReasonsInteractor;
        this.f = reasonsRequestFactory;
        this.f13501g = userInteractor;
    }

    public w2(Json json, qf0.c exceptionsOverseer, g48.r0 jointAccountsInteractor, k38.d jointRepository, y48.g jointMcyErrorDialogMapper, gte.a featureToggleInteractor) {
        this.f13498a = 17;
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(exceptionsOverseer, "exceptionsOverseer");
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        Intrinsics.checkNotNullParameter(jointRepository, "jointRepository");
        Intrinsics.checkNotNullParameter(jointMcyErrorDialogMapper, "jointMcyErrorDialogMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f13499b = json;
        this.f13500c = exceptionsOverseer;
        this.d = jointAccountsInteractor;
        this.e = jointRepository;
        this.f = jointMcyErrorDialogMapper;
        this.f13501g = featureToggleInteractor;
    }

    public w2(vie.g defaultAccountResolver, vie.a accountVisibilityFilter, vie.f analyticsScreenNameProvider, rfe.e productSpacesSelectionPolicy, vie.e showSwitchingButtonPolicy, vfg.p tabNoContentLeftHandler) {
        this.f13498a = 13;
        Intrinsics.checkNotNullParameter(defaultAccountResolver, "defaultAccountResolver");
        Intrinsics.checkNotNullParameter(accountVisibilityFilter, "accountVisibilityFilter");
        Intrinsics.checkNotNullParameter(analyticsScreenNameProvider, "analyticsScreenNameProvider");
        Intrinsics.checkNotNullParameter(productSpacesSelectionPolicy, "productSpacesSelectionPolicy");
        Intrinsics.checkNotNullParameter(showSwitchingButtonPolicy, "showSwitchingButtonPolicy");
        Intrinsics.checkNotNullParameter(tabNoContentLeftHandler, "tabNoContentLeftHandler");
        this.f13499b = defaultAccountResolver;
        this.f13500c = accountVisibilityFilter;
        this.d = analyticsScreenNameProvider;
        this.e = productSpacesSelectionPolicy;
        this.f = showSwitchingButtonPolicy;
        this.f13501g = tabNoContentLeftHandler;
    }

    public w2(kye.e popularAssetListInstrumentProvider, jpc.e topMoversAssetListInstrumentProvider, r10.q collectionsAssetListInstrumentProvider, mnh.c recentlyViewedAssetListInstrumentProvider, kgm.c screenerAssetListInstrumentProvider, a61.a metaCollectionAssetListInstrumentProvider) {
        this.f13498a = 4;
        Intrinsics.checkNotNullParameter(popularAssetListInstrumentProvider, "popularAssetListInstrumentProvider");
        Intrinsics.checkNotNullParameter(topMoversAssetListInstrumentProvider, "topMoversAssetListInstrumentProvider");
        Intrinsics.checkNotNullParameter(collectionsAssetListInstrumentProvider, "collectionsAssetListInstrumentProvider");
        Intrinsics.checkNotNullParameter(recentlyViewedAssetListInstrumentProvider, "recentlyViewedAssetListInstrumentProvider");
        Intrinsics.checkNotNullParameter(screenerAssetListInstrumentProvider, "screenerAssetListInstrumentProvider");
        Intrinsics.checkNotNullParameter(metaCollectionAssetListInstrumentProvider, "metaCollectionAssetListInstrumentProvider");
        this.f13499b = popularAssetListInstrumentProvider;
        this.f13500c = topMoversAssetListInstrumentProvider;
        this.d = collectionsAssetListInstrumentProvider;
        this.e = recentlyViewedAssetListInstrumentProvider;
        this.f = screenerAssetListInstrumentProvider;
        this.f13501g = metaCollectionAssetListInstrumentProvider;
    }

    public w2(AdvertisingService advertisingService, ne0.j memoryCache, ue0.c storage, kgm.c requestBuilder) {
        this.f13498a = 11;
        Intrinsics.checkNotNullParameter(advertisingService, "advertisingService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(requestBuilder, "requestBuilder");
        this.f13499b = advertisingService;
        this.f13500c = memoryCache;
        this.d = storage;
        this.e = requestBuilder;
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: oid.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w2 f225630b;

            {
                this.f225630b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        i params = (i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        w2 w2Var = this.f225630b;
                        kgm.c cVar = (kgm.c) w2Var.e;
                        String campaignId = params.f225642a;
                        String source = params.f225643b;
                        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
                        Intrinsics.checkNotNullParameter(source, "source");
                        ufm.i iVar = new ufm.i(((jid.v) cVar.f184018b).b(), new oc8.e(27, new avj.o(campaignId, source, 25)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        ufm.i iVar2 = new ufm.i(iVar, new oc8.e(24, new g(w2Var, 0)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
                        break;
                    case 1:
                        i params2 = (i) obj2;
                        ShopsCampaignOffer shopsCampaign = (ShopsCampaignOffer) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(shopsCampaign, "shopsCampaign");
                        ((ne0.j) this.f225630b.f13500c).f("KEY_CAMPAIGN_CACHE" + params2.f225642a, shopsCampaign);
                        break;
                    case 2:
                        i params3 = (i) obj2;
                        ShopsCampaignOffer shopsCampaign2 = (ShopsCampaignOffer) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(shopsCampaign2, "shopsCampaign");
                        ((ue0.c) this.f225630b.d).G(lid.c.c(shopsCampaign2), j6.a.q("KEY_CAMPAIGN_CACHE", params3.f225642a), wim.z.d(o0.b(sid.f.class)));
                        break;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        h params4 = (h) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params4, "params");
                        efm.d0<eid.j> campaignByBrand = ((AdvertisingService) this.f225630b.f13499b).getCampaignByBrand(params4.f225638a);
                        oc8.e eVar = new oc8.e(25, new o9h.b(params4, 26));
                        campaignByBrand.getClass();
                        ufm.i iVar3 = new ufm.i(campaignByBrand, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        break;
                    case 4:
                        h params5 = (h) obj2;
                        ShopsCampaignOffer shopsCampaign3 = (ShopsCampaignOffer) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(shopsCampaign3, "shopsCampaign");
                        ((ne0.j) this.f225630b.f13500c).f("KEY_CAMPAIGN_BRAND_CACHE" + params5.f225638a, shopsCampaign3);
                        break;
                    default:
                        h params6 = (h) obj2;
                        ShopsCampaignOffer shopsCampaign4 = (ShopsCampaignOffer) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(shopsCampaign4, "shopsCampaign");
                        ((ue0.c) this.f225630b.d).G(lid.c.c(shopsCampaign4), j6.a.q("KEY_CAMPAIGN_BRAND_CACHE", params6.f225638a), wim.z.d(o0.b(sid.f.class)));
                        break;
                }
                return Unit.f186387a;
            }
        };
        final int i2 = 1;
        oid.g gVar = new oid.g(this, i2);
        Function2 function22 = new Function2(this) { // from class: oid.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w2 f225630b;

            {
                this.f225630b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        i params = (i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        w2 w2Var = this.f225630b;
                        kgm.c cVar = (kgm.c) w2Var.e;
                        String campaignId = params.f225642a;
                        String source = params.f225643b;
                        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
                        Intrinsics.checkNotNullParameter(source, "source");
                        ufm.i iVar = new ufm.i(((jid.v) cVar.f184018b).b(), new oc8.e(27, new avj.o(campaignId, source, 25)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        ufm.i iVar2 = new ufm.i(iVar, new oc8.e(24, new g(w2Var, 0)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
                        break;
                    case 1:
                        i params2 = (i) obj2;
                        ShopsCampaignOffer shopsCampaign = (ShopsCampaignOffer) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(shopsCampaign, "shopsCampaign");
                        ((ne0.j) this.f225630b.f13500c).f("KEY_CAMPAIGN_CACHE" + params2.f225642a, shopsCampaign);
                        break;
                    case 2:
                        i params3 = (i) obj2;
                        ShopsCampaignOffer shopsCampaign2 = (ShopsCampaignOffer) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(shopsCampaign2, "shopsCampaign");
                        ((ue0.c) this.f225630b.d).G(lid.c.c(shopsCampaign2), j6.a.q("KEY_CAMPAIGN_CACHE", params3.f225642a), wim.z.d(o0.b(sid.f.class)));
                        break;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        h params4 = (h) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params4, "params");
                        efm.d0<eid.j> campaignByBrand = ((AdvertisingService) this.f225630b.f13499b).getCampaignByBrand(params4.f225638a);
                        oc8.e eVar = new oc8.e(25, new o9h.b(params4, 26));
                        campaignByBrand.getClass();
                        ufm.i iVar3 = new ufm.i(campaignByBrand, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        break;
                    case 4:
                        h params5 = (h) obj2;
                        ShopsCampaignOffer shopsCampaign3 = (ShopsCampaignOffer) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(shopsCampaign3, "shopsCampaign");
                        ((ne0.j) this.f225630b.f13500c).f("KEY_CAMPAIGN_BRAND_CACHE" + params5.f225638a, shopsCampaign3);
                        break;
                    default:
                        h params6 = (h) obj2;
                        ShopsCampaignOffer shopsCampaign4 = (ShopsCampaignOffer) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(shopsCampaign4, "shopsCampaign");
                        ((ue0.c) this.f225630b.d).G(lid.c.c(shopsCampaign4), j6.a.q("KEY_CAMPAIGN_BRAND_CACHE", params6.f225638a), wim.z.d(o0.b(sid.f.class)));
                        break;
                }
                return Unit.f186387a;
            }
        };
        final int i3 = 2;
        this.f = new w4l.f(function2, gVar, function22, new oid.g(this, i3), new Function2(this) { // from class: oid.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w2 f225630b;

            {
                this.f225630b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        i params = (i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        w2 w2Var = this.f225630b;
                        kgm.c cVar = (kgm.c) w2Var.e;
                        String campaignId = params.f225642a;
                        String source = params.f225643b;
                        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
                        Intrinsics.checkNotNullParameter(source, "source");
                        ufm.i iVar = new ufm.i(((jid.v) cVar.f184018b).b(), new oc8.e(27, new avj.o(campaignId, source, 25)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        ufm.i iVar2 = new ufm.i(iVar, new oc8.e(24, new g(w2Var, 0)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
                        break;
                    case 1:
                        i params2 = (i) obj2;
                        ShopsCampaignOffer shopsCampaign = (ShopsCampaignOffer) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(shopsCampaign, "shopsCampaign");
                        ((ne0.j) this.f225630b.f13500c).f("KEY_CAMPAIGN_CACHE" + params2.f225642a, shopsCampaign);
                        break;
                    case 2:
                        i params3 = (i) obj2;
                        ShopsCampaignOffer shopsCampaign2 = (ShopsCampaignOffer) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(shopsCampaign2, "shopsCampaign");
                        ((ue0.c) this.f225630b.d).G(lid.c.c(shopsCampaign2), j6.a.q("KEY_CAMPAIGN_CACHE", params3.f225642a), wim.z.d(o0.b(sid.f.class)));
                        break;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        h params4 = (h) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params4, "params");
                        efm.d0<eid.j> campaignByBrand = ((AdvertisingService) this.f225630b.f13499b).getCampaignByBrand(params4.f225638a);
                        oc8.e eVar = new oc8.e(25, new o9h.b(params4, 26));
                        campaignByBrand.getClass();
                        ufm.i iVar3 = new ufm.i(campaignByBrand, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        break;
                    case 4:
                        h params5 = (h) obj2;
                        ShopsCampaignOffer shopsCampaign3 = (ShopsCampaignOffer) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(shopsCampaign3, "shopsCampaign");
                        ((ne0.j) this.f225630b.f13500c).f("KEY_CAMPAIGN_BRAND_CACHE" + params5.f225638a, shopsCampaign3);
                        break;
                    default:
                        h params6 = (h) obj2;
                        ShopsCampaignOffer shopsCampaign4 = (ShopsCampaignOffer) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(shopsCampaign4, "shopsCampaign");
                        ((ue0.c) this.f225630b.d).G(lid.c.c(shopsCampaign4), j6.a.q("KEY_CAMPAIGN_BRAND_CACHE", params6.f225638a), wim.z.d(o0.b(sid.f.class)));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
        final int i5 = 3;
        Function2 function23 = new Function2(this) { // from class: oid.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w2 f225630b;

            {
                this.f225630b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i5) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        i params = (i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        w2 w2Var = this.f225630b;
                        kgm.c cVar = (kgm.c) w2Var.e;
                        String campaignId = params.f225642a;
                        String source = params.f225643b;
                        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
                        Intrinsics.checkNotNullParameter(source, "source");
                        ufm.i iVar = new ufm.i(((jid.v) cVar.f184018b).b(), new oc8.e(27, new avj.o(campaignId, source, 25)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        ufm.i iVar2 = new ufm.i(iVar, new oc8.e(24, new g(w2Var, 0)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
                        break;
                    case 1:
                        i params2 = (i) obj2;
                        ShopsCampaignOffer shopsCampaign = (ShopsCampaignOffer) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(shopsCampaign, "shopsCampaign");
                        ((ne0.j) this.f225630b.f13500c).f("KEY_CAMPAIGN_CACHE" + params2.f225642a, shopsCampaign);
                        break;
                    case 2:
                        i params3 = (i) obj2;
                        ShopsCampaignOffer shopsCampaign2 = (ShopsCampaignOffer) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(shopsCampaign2, "shopsCampaign");
                        ((ue0.c) this.f225630b.d).G(lid.c.c(shopsCampaign2), j6.a.q("KEY_CAMPAIGN_CACHE", params3.f225642a), wim.z.d(o0.b(sid.f.class)));
                        break;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        h params4 = (h) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params4, "params");
                        efm.d0<eid.j> campaignByBrand = ((AdvertisingService) this.f225630b.f13499b).getCampaignByBrand(params4.f225638a);
                        oc8.e eVar = new oc8.e(25, new o9h.b(params4, 26));
                        campaignByBrand.getClass();
                        ufm.i iVar3 = new ufm.i(campaignByBrand, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        break;
                    case 4:
                        h params5 = (h) obj2;
                        ShopsCampaignOffer shopsCampaign3 = (ShopsCampaignOffer) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(shopsCampaign3, "shopsCampaign");
                        ((ne0.j) this.f225630b.f13500c).f("KEY_CAMPAIGN_BRAND_CACHE" + params5.f225638a, shopsCampaign3);
                        break;
                    default:
                        h params6 = (h) obj2;
                        ShopsCampaignOffer shopsCampaign4 = (ShopsCampaignOffer) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(shopsCampaign4, "shopsCampaign");
                        ((ue0.c) this.f225630b.d).G(lid.c.c(shopsCampaign4), j6.a.q("KEY_CAMPAIGN_BRAND_CACHE", params6.f225638a), wim.z.d(o0.b(sid.f.class)));
                        break;
                }
                return Unit.f186387a;
            }
        };
        oid.g gVar2 = new oid.g(this, i5);
        final int i6 = 4;
        Function2 function24 = new Function2(this) { // from class: oid.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w2 f225630b;

            {
                this.f225630b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i6) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        i params = (i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        w2 w2Var = this.f225630b;
                        kgm.c cVar = (kgm.c) w2Var.e;
                        String campaignId = params.f225642a;
                        String source = params.f225643b;
                        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
                        Intrinsics.checkNotNullParameter(source, "source");
                        ufm.i iVar = new ufm.i(((jid.v) cVar.f184018b).b(), new oc8.e(27, new avj.o(campaignId, source, 25)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        ufm.i iVar2 = new ufm.i(iVar, new oc8.e(24, new g(w2Var, 0)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
                        break;
                    case 1:
                        i params2 = (i) obj2;
                        ShopsCampaignOffer shopsCampaign = (ShopsCampaignOffer) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(shopsCampaign, "shopsCampaign");
                        ((ne0.j) this.f225630b.f13500c).f("KEY_CAMPAIGN_CACHE" + params2.f225642a, shopsCampaign);
                        break;
                    case 2:
                        i params3 = (i) obj2;
                        ShopsCampaignOffer shopsCampaign2 = (ShopsCampaignOffer) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(shopsCampaign2, "shopsCampaign");
                        ((ue0.c) this.f225630b.d).G(lid.c.c(shopsCampaign2), j6.a.q("KEY_CAMPAIGN_CACHE", params3.f225642a), wim.z.d(o0.b(sid.f.class)));
                        break;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        h params4 = (h) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params4, "params");
                        efm.d0<eid.j> campaignByBrand = ((AdvertisingService) this.f225630b.f13499b).getCampaignByBrand(params4.f225638a);
                        oc8.e eVar = new oc8.e(25, new o9h.b(params4, 26));
                        campaignByBrand.getClass();
                        ufm.i iVar3 = new ufm.i(campaignByBrand, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        break;
                    case 4:
                        h params5 = (h) obj2;
                        ShopsCampaignOffer shopsCampaign3 = (ShopsCampaignOffer) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(shopsCampaign3, "shopsCampaign");
                        ((ne0.j) this.f225630b.f13500c).f("KEY_CAMPAIGN_BRAND_CACHE" + params5.f225638a, shopsCampaign3);
                        break;
                    default:
                        h params6 = (h) obj2;
                        ShopsCampaignOffer shopsCampaign4 = (ShopsCampaignOffer) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(shopsCampaign4, "shopsCampaign");
                        ((ue0.c) this.f225630b.d).G(lid.c.c(shopsCampaign4), j6.a.q("KEY_CAMPAIGN_BRAND_CACHE", params6.f225638a), wim.z.d(o0.b(sid.f.class)));
                        break;
                }
                return Unit.f186387a;
            }
        };
        oid.g gVar3 = new oid.g(this, i6);
        final int i21 = 5;
        this.f13501g = new w4l.f(function23, gVar2, function24, gVar3, new Function2(this) { // from class: oid.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w2 f225630b;

            {
                this.f225630b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i21) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        i params = (i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        w2 w2Var = this.f225630b;
                        kgm.c cVar = (kgm.c) w2Var.e;
                        String campaignId = params.f225642a;
                        String source = params.f225643b;
                        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
                        Intrinsics.checkNotNullParameter(source, "source");
                        ufm.i iVar = new ufm.i(((jid.v) cVar.f184018b).b(), new oc8.e(27, new avj.o(campaignId, source, 25)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        ufm.i iVar2 = new ufm.i(iVar, new oc8.e(24, new g(w2Var, 0)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
                        break;
                    case 1:
                        i params2 = (i) obj2;
                        ShopsCampaignOffer shopsCampaign = (ShopsCampaignOffer) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(shopsCampaign, "shopsCampaign");
                        ((ne0.j) this.f225630b.f13500c).f("KEY_CAMPAIGN_CACHE" + params2.f225642a, shopsCampaign);
                        break;
                    case 2:
                        i params3 = (i) obj2;
                        ShopsCampaignOffer shopsCampaign2 = (ShopsCampaignOffer) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(shopsCampaign2, "shopsCampaign");
                        ((ue0.c) this.f225630b.d).G(lid.c.c(shopsCampaign2), j6.a.q("KEY_CAMPAIGN_CACHE", params3.f225642a), wim.z.d(o0.b(sid.f.class)));
                        break;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        h params4 = (h) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params4, "params");
                        efm.d0<eid.j> campaignByBrand = ((AdvertisingService) this.f225630b.f13499b).getCampaignByBrand(params4.f225638a);
                        oc8.e eVar = new oc8.e(25, new o9h.b(params4, 26));
                        campaignByBrand.getClass();
                        ufm.i iVar3 = new ufm.i(campaignByBrand, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        break;
                    case 4:
                        h params5 = (h) obj2;
                        ShopsCampaignOffer shopsCampaign3 = (ShopsCampaignOffer) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(shopsCampaign3, "shopsCampaign");
                        ((ne0.j) this.f225630b.f13500c).f("KEY_CAMPAIGN_BRAND_CACHE" + params5.f225638a, shopsCampaign3);
                        break;
                    default:
                        h params6 = (h) obj2;
                        ShopsCampaignOffer shopsCampaign4 = (ShopsCampaignOffer) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(shopsCampaign4, "shopsCampaign");
                        ((ue0.c) this.f225630b.d).G(lid.c.c(shopsCampaign4), j6.a.q("KEY_CAMPAIGN_BRAND_CACHE", params6.f225638a), wim.z.d(o0.b(sid.f.class)));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
    }

    public w2(TrendView trendView, TrendView listener) {
        this.f13498a = 5;
        Intrinsics.checkNotNullParameter(trendView, "trendView");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f13499b = trendView;
        this.f13500c = listener;
        final int i = 0;
        this.d = te0.w.y0(new Function0(this) { // from class: ht0.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w2 f155177b;

            {
                this.f155177b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return this.f155177b.o(hw0.q.HIGHEST);
                    default:
                        return this.f155177b.o(hw0.q.LOWEST);
                }
            }
        });
        final int i2 = 1;
        this.e = te0.w.y0(new Function0(this) { // from class: ht0.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w2 f155177b;

            {
                this.f155177b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return this.f155177b.o(hw0.q.HIGHEST);
                    default:
                        return this.f155177b.o(hw0.q.LOWEST);
                }
            }
        });
        this.f = new ifm.b();
        this.f13501g = v0.a.d("create(...)");
    }

    public w2(OrderDetailsScreenContract$InputData inputData, b3i.l orderSummaryMapper, ffk.t pricingPlanInteractor, ang.f userInteractor, sh5.d cryptoFcaDisclaimerWidget, kgm.c orderQuoteFeeAndLimitsInteractor) {
        this.f13498a = 2;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(orderSummaryMapper, "orderSummaryMapper");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(cryptoFcaDisclaimerWidget, "cryptoFcaDisclaimerWidget");
        Intrinsics.checkNotNullParameter(orderQuoteFeeAndLimitsInteractor, "orderQuoteFeeAndLimitsInteractor");
        this.f13499b = inputData;
        this.f13500c = orderSummaryMapper;
        this.d = pricingPlanInteractor;
        this.e = userInteractor;
        this.f = cryptoFcaDisclaimerWidget;
        this.f13501g = orderQuoteFeeAndLimitsInteractor;
    }

    public w2(qfe.b customisableAccountsProvider, bn2.p backgroundsInteractor, ji5.m cryptoPreferencesInteractor, uke.a investTabStateInteractor, u29.o lifestyleTabStateInteractor, ibb.d retailTabsUIInfo) {
        this.f13498a = 6;
        Intrinsics.checkNotNullParameter(customisableAccountsProvider, "customisableAccountsProvider");
        Intrinsics.checkNotNullParameter(backgroundsInteractor, "backgroundsInteractor");
        Intrinsics.checkNotNullParameter(cryptoPreferencesInteractor, "cryptoPreferencesInteractor");
        Intrinsics.checkNotNullParameter(investTabStateInteractor, "investTabStateInteractor");
        Intrinsics.checkNotNullParameter(lifestyleTabStateInteractor, "lifestyleTabStateInteractor");
        Intrinsics.checkNotNullParameter(retailTabsUIInfo, "retailTabsUIInfo");
        this.f13499b = customisableAccountsProvider;
        this.f13500c = backgroundsInteractor;
        this.d = cryptoPreferencesInteractor;
        this.e = investTabStateInteractor;
        this.f = lifestyleTabStateInteractor;
        this.f13501g = retailTabsUIInfo;
    }

    public w2(d4m.a revolutVisionFaceDetector, d4m.a detectorFactory, ex.b imageFormatConverter, Context context, fx.a currentDateTimeProvider, zw.e resourcesStorage, nw.c nullableLazyFactory) {
        this.f13498a = 8;
        Intrinsics.checkNotNullParameter(revolutVisionFaceDetector, "revolutVisionFaceDetector");
        Intrinsics.checkNotNullParameter(detectorFactory, "detectorFactory");
        Intrinsics.checkNotNullParameter(imageFormatConverter, "imageFormatConverter");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(currentDateTimeProvider, "currentDateTimeProvider");
        Intrinsics.checkNotNullParameter(resourcesStorage, "resourcesStorage");
        Intrinsics.checkNotNullParameter(nullableLazyFactory, "nullableLazyFactory");
        this.f13499b = revolutVisionFaceDetector;
        this.f13500c = detectorFactory;
        this.d = imageFormatConverter;
        this.e = context;
        this.f = currentDateTimeProvider;
        this.f13501g = resourcesStorage;
    }

    public w2(xua.a recurringPaymentInteractor, ang.f userInteractor, w0i.b transparentPricingFeatureStateChecker, whf.b transactionsListContentProvider, anf.b transactionSumCalculator, nva.a filterBuilder) {
        this.f13498a = 3;
        Intrinsics.checkNotNullParameter(recurringPaymentInteractor, "recurringPaymentInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(transparentPricingFeatureStateChecker, "transparentPricingFeatureStateChecker");
        Intrinsics.checkNotNullParameter(transactionsListContentProvider, "transactionsListContentProvider");
        Intrinsics.checkNotNullParameter(transactionSumCalculator, "transactionSumCalculator");
        Intrinsics.checkNotNullParameter(filterBuilder, "filterBuilder");
        this.f13499b = recurringPaymentInteractor;
        this.f13500c = userInteractor;
        this.d = transparentPricingFeatureStateChecker;
        this.e = transactionsListContentProvider;
        this.f = transactionSumCalculator;
        this.f13501g = filterBuilder;
    }

    public w2(jzi.a budgetInteractor, eqj.f analyticsCycleInteractor, ge3.e transactionCategorisationInteractor, wmd.f budgetSpentProvider, uc.d budgetUpcomingPaymentsProvider, wmd.c budgetAccountContextProvider) {
        this.f13498a = 16;
        Intrinsics.checkNotNullParameter(budgetInteractor, "budgetInteractor");
        Intrinsics.checkNotNullParameter(analyticsCycleInteractor, "analyticsCycleInteractor");
        Intrinsics.checkNotNullParameter(transactionCategorisationInteractor, "transactionCategorisationInteractor");
        Intrinsics.checkNotNullParameter(budgetSpentProvider, "budgetSpentProvider");
        Intrinsics.checkNotNullParameter(budgetUpcomingPaymentsProvider, "budgetUpcomingPaymentsProvider");
        Intrinsics.checkNotNullParameter(budgetAccountContextProvider, "budgetAccountContextProvider");
        this.f13499b = budgetInteractor;
        this.f13500c = analyticsCycleInteractor;
        this.d = transactionCategorisationInteractor;
        this.e = budgetSpentProvider;
        this.f = budgetUpcomingPaymentsProvider;
        this.f13501g = budgetAccountContextProvider;
    }

    public w2(kdh.b providerResolver, lyd.e mapperResolver, qd0.b languageProvider, zjh.i periodInteractor, d0e.c periodNormaliser, h0e.b settingsInteractor, a0e.w periodCalculator, a0e.c eligibilityCalculator) {
        this.f13498a = 1;
        Intrinsics.checkNotNullParameter(providerResolver, "providerResolver");
        Intrinsics.checkNotNullParameter(mapperResolver, "mapperResolver");
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        Intrinsics.checkNotNullParameter(periodInteractor, "periodInteractor");
        Intrinsics.checkNotNullParameter(periodNormaliser, "periodNormaliser");
        Intrinsics.checkNotNullParameter(settingsInteractor, "settingsInteractor");
        Intrinsics.checkNotNullParameter(periodCalculator, "periodCalculator");
        Intrinsics.checkNotNullParameter(eligibilityCalculator, "eligibilityCalculator");
        this.f13499b = providerResolver;
        this.f13500c = mapperResolver;
        this.d = languageProvider;
        this.e = periodInteractor;
        this.f = settingsInteractor;
        this.f13501g = periodCalculator;
    }

    public w2(uoh.g stocksProvider, uoh.h stocksStatsProvider, uoh.e etpProvider, uoh.a bondsProvider, uoh.c cfdProvider, ooh.b screenerContextMapper, ybl.l tradingConfigInteractor, ugl.c screenerInteractor, sph.o screenerInstrumentTypeMapper) {
        this.f13498a = 15;
        Intrinsics.checkNotNullParameter(stocksProvider, "stocksProvider");
        Intrinsics.checkNotNullParameter(stocksStatsProvider, "stocksStatsProvider");
        Intrinsics.checkNotNullParameter(etpProvider, "etpProvider");
        Intrinsics.checkNotNullParameter(bondsProvider, "bondsProvider");
        Intrinsics.checkNotNullParameter(cfdProvider, "cfdProvider");
        Intrinsics.checkNotNullParameter(screenerContextMapper, "screenerContextMapper");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        Intrinsics.checkNotNullParameter(screenerInteractor, "screenerInteractor");
        Intrinsics.checkNotNullParameter(screenerInstrumentTypeMapper, "screenerInstrumentTypeMapper");
        this.f13499b = stocksProvider;
        this.f13500c = stocksStatsProvider;
        this.d = etpProvider;
        this.e = cfdProvider;
        this.f = tradingConfigInteractor;
        this.f13501g = screenerInteractor;
    }

    public w2(Canvas canvas) {
        this.f13498a = 0;
        this.f13499b = canvas;
    }
}
