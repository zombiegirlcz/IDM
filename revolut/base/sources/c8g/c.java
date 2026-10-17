package c8g;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.WindowManager;
import androidx.core.graphics.drawable.DrawableCompat;
import aw0.l0;
import aw0.o9;
import cjl.n;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.multibanco.impl.via_verde.data.ViaVerdeEnrollment;
import com.revolut.feature.card_add_to_googlepay.api.models.RetailCardWrapper;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceFiltersSelection;
import com.revolut.rxdata.core.CompositeException;
import com.revolut.shared.cards.model.SharedRevolutCard;
import com.revolut.shared.feature.move_money.api.navigation.Action;
import cya.e;
import dx4.f;
import dx4.m1;
import dx4.n1;
import dx4.q;
import dx4.w;
import dx4.y;
import dx4.z;
import h93.f0;
import hx7.l;
import ip0.jm0;
import ip0.qo;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import jkl.o2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.flow.Flow;
import rd0.d;
import sx4.g;
import uh8.m;
import vkm.q0;
import w4l.h;
import w4l.i;
import w4l.j;
import w4l.k;
import zhm.h0;
import zhm.r0;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public abstract class c {
    public static final Map A(String str, boolean z) {
        return r0.k(new Pair("STEP_UP_RESPONSE", z ? "APPROVED" : "FAILURE"), new Pair("STEP_UP_AUTH_CODE", str));
    }

    public static final ResourceImage B(owa.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        switch (e.f110072a[aVar.ordinal()]) {
            case 1:
                return new ResourceImage(R$drawable.uikit_icn_24_arrow_right_left, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246);
            case 2:
                return new ResourceImage(R$drawable.uikit_icn_24_premium, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246);
            case 3:
                return new ResourceImage(R$drawable.uikit_icn_24_group_vault, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246);
            case 4:
                return new ResourceImage(R$drawable.uikit_icn_24_arrow_split, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246);
            case 5:
                return new ResourceImage(R$drawable.uikit_icn_24_bitcoin, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246);
            case 6:
                return new ResourceImage(R$drawable.uikit_icn_24_rocket, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246);
            case 7:
                return new ResourceImage(R$drawable.uikit_icn_24_shield, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246);
            case 8:
                return new ResourceImage(R$drawable.uikit_icn_24_newspaper, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246);
            case 9:
                return new ResourceImage(R$drawable.uikit_icn_24_lightbulb, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246);
            case 10:
                return new ResourceImage(R$drawable.uikit_icn_24_card, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246);
            case 11:
                return new ResourceImage(R$drawable.uikit_icn_24_vault, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final k C(sfe.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        int i = sfe.e.f262409a[aVar.ordinal()];
        if (i == 1) {
            return h.f294642c;
        }
        if (i == 2) {
            return i.f294643c;
        }
        if (i == 3) {
            return j.f294644c;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final Clause D(q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        int i = R$attr.uikit_colorAccent;
        int iV = v(qVar);
        Integer numValueOf = Integer.valueOf(i);
        Float fValueOf = Float.valueOf(16.0f);
        return yoj.b.w(new ImageClause(iV, numValueOf, fValueOf, fValueOf, 16), g.e(2));
    }

    public static final RetailCardWrapper E(f0 f0Var, String customisationUrl) {
        m5l.b bVar;
        Intrinsics.checkNotNullParameter(f0Var, "<this>");
        Intrinsics.checkNotNullParameter(customisationUrl, "customisationUrl");
        Intrinsics.checkNotNullParameter(f0Var, "<this>");
        Intrinsics.checkNotNullParameter(customisationUrl, "customisationUrl");
        String str = f0Var.f150110a;
        b93.j jVar = f0Var.f150114h;
        String str2 = jVar.f13640b;
        Intrinsics.checkNotNullParameter(str2, "<this>");
        e93.b bVar2 = (e93.b) l.j().get(str2);
        int i = bVar2 == null ? -1 : bw2.a.f19191a[bVar2.ordinal()];
        if (i != -1) {
            if (i == 1) {
                bVar = m5l.b.VISA;
            } else if (i == 2) {
                bVar = m5l.b.MASTERCARD;
            } else if (i == 3) {
                bVar = m5l.b.MAESTRO;
            } else if (i == 4) {
                bVar = m5l.b.MULTIBANCO;
            } else if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            return new RetailCardWrapper(new SharedRevolutCard(str, bVar, jVar.f13639a.f13615a, f0Var.I, f0Var.f150115j, customisationUrl, f0Var.f150112c), f0Var);
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(j6.a.q("Unexpected card brand = ", str2));
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
        d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
        throw illegalArgumentException;
    }

    public static final Clause F(q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        m70.a.t(t0.f186434a);
        TextClause textClause = new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        int i = R$attr.uikit_colorGreyTone50;
        int iV = v(qVar);
        Integer numValueOf = Integer.valueOf(i);
        Float fValueOf = Float.valueOf(16.0f);
        return yoj.b.w(textClause, new ImageClause(iV, numValueOf, fValueOf, fValueOf, 16));
    }

    public static final int G(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return Build.VERSION.SDK_INT >= 30 ? ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds().height() : context.getResources().getDisplayMetrics().heightPixels;
    }

    public static final int H(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return Build.VERSION.SDK_INT >= 30 ? ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds().width() : context.getResources().getDisplayMetrics().widthPixels;
    }

    public static final float J(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return H(context) / b(context);
    }

    public static final List K(jm0 jm0Var, l0 legend) {
        Intrinsics.checkNotNullParameter(jm0Var, "<this>");
        Intrinsics.checkNotNullParameter(legend, "legend");
        qo qoVar = new qo(a0.d.r(jm0Var.f164879a, "_legend"), legend, R$attr.uikit_dp16, 3836);
        int i = R$attr.uikit_dp16;
        jm0Var.C = i;
        jm0Var.D = i;
        Unit unit = Unit.f186387a;
        return v.k(qoVar, jm0Var);
    }

    public static final float b(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return Build.VERSION.SDK_INT >= 34 ? ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getDensity() : context.getResources().getDisplayMetrics().density;
    }

    public static final q0 c(Flow flow, Function1 onError) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(onError, "onError");
        return new q0(flow, new ex6.c(2, null, onError), 1);
    }

    public static final q0 d(Flow flow, Function1 onContent) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(onContent, "onContent");
        return new q0(flow, new ex6.c(3, null, onContent), 1);
    }

    public static final int e(Context context, float f) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (int) (b(context) * f);
    }

    public static final Bitmap f(Resources resources, int i, Resources.Theme theme, Integer num) {
        Intrinsics.checkNotNullParameter(resources, "<this>");
        Drawable drawable = resources.getDrawable(i, theme);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvasE = ch.qos.logback.core.util.a.e(bitmapCreateBitmap, "createBitmap(...)", bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvasE.getWidth(), canvasE.getHeight());
        if (num != null) {
            DrawableCompat.setTint(drawable, num.intValue());
        }
        drawable.draw(canvasE);
        return bitmapCreateBitmap;
    }

    public static final String h(b6i.j inputPosition) {
        Intrinsics.checkNotNullParameter(inputPosition, "inputPosition");
        return j6.a.q("EDIT_", inputPosition.name());
    }

    public static final void i(ax4.d dVar, dx4.l action) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof dx4.h) {
            dVar.I(((dx4.h) action).f120610a, null);
            return;
        }
        if (action instanceof dx4.g) {
            dVar.k0(((dx4.g) action).f120601a);
            return;
        }
        if (action instanceof dx4.i) {
            dVar.U(((dx4.i) action).f120619a);
            return;
        }
        if (action instanceof dx4.a) {
            dVar.i0(((dx4.a) action).f120542a);
            return;
        }
        if (action instanceof dx4.d) {
            z zVar = ((dx4.d) action).f120573a;
            if (zVar instanceof w) {
                dVar.H1((w) zVar);
                return;
            } else {
                if (!(zVar instanceof y)) {
                    throw new NoWhenBranchMatchedException();
                }
                dVar.n1((y) zVar);
                return;
            }
        }
        if (action instanceof dx4.e) {
            dVar.x1(((dx4.e) action).f120579a);
            return;
        }
        if (action instanceof f) {
            dVar.Q0(((f) action).f120588a);
            return;
        }
        if (action instanceof dx4.k) {
            dx4.k kVar = (dx4.k) action;
            dVar.E1(kVar.f120643a, kVar.f120644b);
        } else if (action instanceof dx4.c) {
            dVar.a0(((dx4.c) action).f120561a);
        } else if (action instanceof dx4.b) {
            dVar.a2(((dx4.b) action).f120550a);
        } else {
            if (!(action instanceof dx4.j)) {
                throw new NoWhenBranchMatchedException();
            }
            dVar.B1(((dx4.j) action).f120639a);
        }
    }

    public static final boolean k(TravelExperienceFiltersSelection travelExperienceFiltersSelection) {
        Intrinsics.checkNotNullParameter(travelExperienceFiltersSelection, "<this>");
        return travelExperienceFiltersSelection.f92822c.isEmpty() && travelExperienceFiltersSelection.f92820a == null && travelExperienceFiltersSelection.f92821b == null && !travelExperienceFiltersSelection.d;
    }

    public static final boolean l(Throwable th10) {
        if (!(th10 instanceof CompositeException)) {
            return tj0.a.a(th10);
        }
        List list = ((CompositeException) th10).f104678a;
        if (list.isEmpty()) {
            return false;
        }
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return true;
        }
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            if (!l((Throwable) it8.next())) {
                return false;
            }
        }
        return true;
    }

    public static final boolean m(Action action) {
        Intrinsics.checkNotNullParameter(action, "<this>");
        if ((action instanceof Action.OpenBalanceAutomation) || (action instanceof Action.Add) || (action instanceof Action.MoveWithFixedAccount) || (action instanceof Action.MoveMoney) || (action instanceof Action.AddNewScheduledPayment) || (action instanceof Action.Topup) || (action instanceof Action.Withdraw) || (action instanceof Action.Deposit) || (action instanceof Action.MoveMoneyWithAccountPair)) {
            return false;
        }
        if ((action instanceof Action.EditScheduledAutomation) || (action instanceof Action.EditScheduledPayment)) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final ImageClause n(boolean z) {
        Float fValueOf = Float.valueOf(15.0f);
        if (z) {
            return new ImageClause(R$drawable.uikit_icn_24_dot, Integer.valueOf(R$attr.uikit_colorOrange), fValueOf, fValueOf, 16);
        }
        return null;
    }

    public static final void o(ax4.d dVar, ty0.a clickData) {
        Object next;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        Object obj2 = clickData.d;
        String url2 = clickData.f275445a;
        dx4.l lVar = null;
        if (obj2 instanceof n1) {
            Intrinsics.checkNotNullParameter(url2, "url");
            Iterator it8 = ((n1) obj2).a().iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (Intrinsics.f("revolut://app/credit-application-action/" + ((m1) next).f120675a, url2)) {
                    break;
                }
            }
            m1 m1Var = (m1) next;
            if (m1Var != null) {
                lVar = m1Var.f120676b;
            }
        } else if (obj2 instanceof dx4.l) {
            lVar = (dx4.l) obj2;
        }
        if (lVar != null) {
            i(dVar, lVar);
        } else {
            dVar.Z1(clickData.f275446b, url2);
        }
    }

    public static final Clause p(Clause clause) {
        if (clause != null) {
            return clause;
        }
        m70.a.c(t0.f186434a);
        return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }

    public static final void q(Paint paint, Rect bounds, int[] colors, float[] positions) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        Intrinsics.checkNotNullParameter(colors, "colors");
        Intrinsics.checkNotNullParameter(positions, "positions");
        float fWidth = bounds.width();
        float fHeight = bounds.height();
        if (fWidth <= BitmapDescriptorFactory.HUE_RED || fHeight <= BitmapDescriptorFactory.HUE_RED) {
            paint.setShader(null);
            return;
        }
        float f = ((2.0f * fWidth) * fHeight) / ((fHeight * fHeight) + (fWidth * fWidth));
        float f4 = bounds.left;
        float f5 = bounds.top;
        paint.setShader(new LinearGradient(f4, f5, f4 + (fHeight * f), f5 + (fWidth * f), colors, positions, Shader.TileMode.CLAMP));
    }

    public static final ViaVerdeEnrollment r(f92.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return new ViaVerdeEnrollment(aVar.getId(), aVar.getCardId(), aVar.getContractNumber(), aVar.getPaymentReference(), aVar.getLabel(), z92.f.K(aVar.getCreationDate()));
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */
    public static final dgc.i s(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r18v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:407)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:303)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:299)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:288)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:272)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:159)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:88)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:126)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */

    public static final jl4.a t(kn4.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        xi0.a aVar2 = xi0.b.Companion;
        String currency = aVar.getCurrency();
        aVar2.getClass();
        xi0.b bVarA = xi0.a.a(currency);
        dj0.d dVar = new dj0.d(aVar.getCap(), bVarA);
        dj0.d dVar2 = new dj0.d(aVar.getStepAmount(), bVarA);
        dj0.d dVar3 = new dj0.d(aVar.getMinCap(), bVarA);
        dj0.d dVar4 = new dj0.d(aVar.getMidCap(), bVarA);
        dj0.d dVar5 = new dj0.d(aVar.getMaxCap(), bVarA);
        Long maxAdditionalCardholderLimit = aVar.getMaxAdditionalCardholderLimit();
        return new jl4.a(dVar, dVar2, dVar3, dVar4, dVar5, maxAdditionalCardholderLimit != null ? new dj0.d(maxAdditionalCardholderLimit.longValue(), bVarA) : null, bVarA);
    }

    public static final rel.a u(lgl.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        xi0.a aVar = xi0.b.Companion;
        String currency = bVar.getCurrency();
        aVar.getClass();
        xi0.b bVarA = xi0.a.a(currency);
        List bids = bVar.getBids();
        ArrayList arrayList = new ArrayList(bids.size());
        int size = bids.size();
        for (int i = 0; i < size; i++) {
            lgl.c cVar = (lgl.c) bids.get(i);
            Intrinsics.checkNotNullParameter(cVar, "<this>");
            arrayList.add(new rel.b(cVar.getPrice(), new BigDecimal(cVar.getVolume())));
        }
        List asks = bVar.getAsks();
        ArrayList arrayList2 = new ArrayList(asks.size());
        int size2 = asks.size();
        for (int i2 = 0; i2 < size2; i2++) {
            lgl.c cVar2 = (lgl.c) asks.get(i2);
            Intrinsics.checkNotNullParameter(cVar2, "<this>");
            arrayList2.add(new rel.b(cVar2.getPrice(), new BigDecimal(cVar2.getVolume())));
        }
        return new rel.a(bVarA, arrayList, arrayList2);
    }

    public static final int v(q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        switch (mx4.v.f210195a[qVar.ordinal()]) {
            case 1:
                return R$drawable.uikit_icn_16_info_outline;
            case 2:
                return R$drawable.uikit_icn_24_pencil;
            case 3:
                return R$drawable.uikit_icn_24_call;
            case 4:
                return R$drawable.uikit_icn_24_envelope;
            case 5:
                return R$drawable.uikit_icn_24_link;
            case 6:
                return R$drawable.uikit_icn_24_plus;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final String w(n nVar) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        int i = yjl.q.f314551a[nVar.ordinal()];
        if (i == 1) {
            o2.Companion.getClass();
            return "qr";
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        o2.Companion.getClass();
        return "qrdelegated";
    }

    public static final ArrayList x(Map map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new m((String) entry.getKey(), ((Boolean) entry.getValue()).booleanValue()));
        }
        return arrayList;
    }

    public static final Map y(String str, boolean z) {
        return r0.k(new Pair("BANKING_APP_ACTIVATION_RESPONSE", z ? "APPROVED" : "FAILURE"), new Pair("BANKING_APP_ACTIVATION_CODE", str));
    }

    public abstract c a(Serializable serializable);
}
