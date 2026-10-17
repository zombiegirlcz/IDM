package kp0;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.graphics.RenderEffect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import androidx.core.graphics.Insets;
import aw0.o9;
import aw0.s8;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.core.models.multibanco.MultibancoWithdrawalCode;
import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import com.revolut.feature.junior_resources.R$string;
import com.revolut.feature.wealth.analytics.domain.models.complex_analytics.PerformanceChart;
import com.revolut.feature.wealth.analytics.domain.models.complex_analytics.PerformanceChartPoint;
import gwi.a3;
import gwi.d3;
import gwi.j3;
import gwi.u2;
import gwi.x2;
import java.io.IOException;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import tof.z6;

/* JADX INFO: loaded from: classes19.dex */
public abstract class w0 {
    public static final krf.c A(ysj.t tVar) {
        mrf.a aVar;
        Intrinsics.checkNotNullParameter(tVar, "<this>");
        ysj.v vVar = tVar.f316499a;
        String str = tVar.f316501c;
        int i = zsj.d.f324942a[vVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return new krf.d(str);
            }
            throw new NoWhenBranchMatchedException();
        }
        String str2 = tVar.f316500b;
        if (str2 == null) {
            throw new IllegalArgumentException("Code must exist for predefined reasons");
        }
        ysj.q qVar = tVar.d;
        if (qVar != null) {
            Intrinsics.checkNotNullParameter(qVar, "<this>");
            aVar = new mrf.a(qVar.f316495a, qVar.f316496b, qVar.f316497c, qVar.d);
        } else {
            aVar = null;
        }
        return new krf.e(str2, str, aVar);
    }

    public static final svi.o0 B(j3 j3Var) {
        svi.l0 l0Var;
        Intrinsics.checkNotNullParameter(j3Var, "<this>");
        List list = j3Var.f147432a.f147438b;
        svi.y yVar = null;
        List listA = list != null ? jwi.d.a(list) : null;
        if (listA == null) {
            listA = zhm.f0.f322471a;
        }
        d3 d3Var = j3Var.f147433b;
        Intrinsics.checkNotNullParameter(d3Var, "<this>");
        dj0.d dVarO = mo3.a.o(d3Var.f147371a);
        String str = d3Var.f147372b;
        List<a3> list2 = d3Var.f147373c;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        for (a3 a3Var : list2) {
            Intrinsics.checkNotNullParameter(a3Var, "<this>");
            dj0.d dVarO2 = mo3.a.o(a3Var.f147336a);
            u2 u2Var = a3Var.f147337b;
            Intrinsics.checkNotNullParameter(u2Var, "<this>");
            dj0.d dVarO3 = mo3.a.o(u2Var.f147529a);
            jo3.a aVar = u2Var.f147530b;
            svi.k0 k0Var = new svi.k0(dVarO3, aVar != null ? mo3.a.o(aVar) : null);
            x2 x2Var = a3Var.f147338c;
            if (x2Var != null) {
                Intrinsics.checkNotNullParameter(x2Var, "<this>");
                l0Var = new svi.l0(mo3.a.o(x2Var.f147559b), mo3.a.o(x2Var.f147560c), x2Var.f147558a);
            } else {
                l0Var = null;
            }
            arrayList.add(new svi.m0(dVarO2, k0Var, l0Var));
        }
        svi.n0 n0Var = new svi.n0(dVarO, str, arrayList, d3Var.d, d3Var.e);
        String str2 = j3Var.f147434c.f147401a;
        svi.y[] yVarArrValues = svi.y.values();
        int length = yVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            svi.y yVar2 = yVarArrValues[i];
            if (kotlin.text.a0.z(yVar2.name(), str2, true)) {
                yVar = yVar2;
                break;
            }
            i++;
        }
        if (yVar == null) {
            yVar = svi.y.UNKNOWN;
        }
        return new svi.o0(listA, n0Var, yVar);
    }

    public static final ArrayList C(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<hya.c> list2 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        for (hya.c cVar : list2) {
            arrayList.add(new fya.a(cVar.f156770a, cVar.f156771b));
        }
        return arrayList;
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
        */
    public static final vxb.f D(
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
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        */

    public static final ft3.h1 E(PluginPayload pluginPayload) {
        Intrinsics.checkNotNullParameter(pluginPayload, "<this>");
        it3.d dVar = pluginPayload.f66247a;
        return new ft3.h1(dVar.f168323a, new ft3.d1(dVar.f168328j, dVar.k, null), pluginPayload.f66248b);
    }

    public static final ft3.h1 F(CreditApplicationPluginFlowContract$Configuration creditApplicationPluginFlowContract$Configuration) {
        Intrinsics.checkNotNullParameter(creditApplicationPluginFlowContract$Configuration, "<this>");
        return new ft3.h1(creditApplicationPluginFlowContract$Configuration.f66892b, new ft3.d1(creditApplicationPluginFlowContract$Configuration.d, creditApplicationPluginFlowContract$Configuration.e, null), creditApplicationPluginFlowContract$Configuration.f);
    }

    public static Insets G(int i, Insets insets) {
        int i2 = insets.left;
        int i3 = (i & 2) != 0 ? insets.top : 0;
        int i5 = insets.right;
        int i6 = (i & 8) != 0 ? insets.bottom : 0;
        Intrinsics.checkNotNullParameter(insets, "<this>");
        Insets insetsOf = Insets.of(i2, i3, i5, i6);
        Intrinsics.checkNotNullExpressionValue(insetsOf, "of(...)");
        return insetsOf;
    }

    public static CompositeClause H(TextLocalisedClause textLocalisedClause) {
        Integer numValueOf = Integer.valueOf(R$attr.uikit_colorGrey50);
        Intrinsics.checkNotNullParameter(textLocalisedClause, "<this>");
        return new CompositeClause(zhm.v.k(textLocalisedClause, new ImageClause(R$drawable.uikit_icn_16_info_outline, numValueOf, (Float) null, (Float) null, 28)), new TextClause("  ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
    }

    public static final hh3.c I(XmlResourceParser xmlResourceParser, p9.q qVar) {
        while (xmlResourceParser.next() != 1) {
            try {
                if (xmlResourceParser.getEventType() == 2) {
                    if (xmlResourceParser.getName().equals("splits")) {
                        while (xmlResourceParser.next() != 3) {
                            if (xmlResourceParser.getEventType() == 2) {
                                if (xmlResourceParser.getName().equals("module")) {
                                    String strJ = J(xmlResourceParser, "name");
                                    if (strJ != null) {
                                        while (xmlResourceParser.next() != 3) {
                                            if (xmlResourceParser.getEventType() == 2) {
                                                if (xmlResourceParser.getName().equals("language")) {
                                                    while (xmlResourceParser.next() != 3) {
                                                        if (xmlResourceParser.getEventType() == 2) {
                                                            if (xmlResourceParser.getName().equals("entry")) {
                                                                String strJ2 = J(xmlResourceParser, "key");
                                                                String strJ3 = J(xmlResourceParser, "split");
                                                                K(xmlResourceParser);
                                                                if (strJ2 != null && strJ3 != null) {
                                                                    qVar.c(strJ, strJ2, strJ3);
                                                                }
                                                            } else {
                                                                K(xmlResourceParser);
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    K(xmlResourceParser);
                                                }
                                            }
                                        }
                                    } else {
                                        K(xmlResourceParser);
                                    }
                                } else {
                                    K(xmlResourceParser);
                                }
                            }
                        }
                    } else {
                        K(xmlResourceParser);
                    }
                }
            } catch (IOException | IllegalStateException | XmlPullParserException e) {
                return null;
            }
        }
        return qVar.d();
    }

    public static final String J(XmlPullParser xmlPullParser, String str) {
        for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    public static final void K(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i != 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    public static int a(String str, int i) {
        return p.a.c(i, 31, str);
    }

    public static final void b(View view, List layers, j70.a devicePerformance) {
        RenderEffect renderEffectB;
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(layers, "layers");
        Intrinsics.checkNotNullParameter(devicePerformance, "devicePerformance");
        if (n(devicePerformance)) {
            Lazy lazy = ro0.d0.f255743a;
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(layers, "layers");
            if (layers.isEmpty()) {
                return;
            }
            int size = layers.size();
            for (int i = 0; i < size; i++) {
                qo0.e eVar = (qo0.e) layers.get(i);
                if (eVar.f247969a != 0 || eVar.f247970b != view.getHeight() || eVar.f247971c != eVar.d) {
                    int width = view.getWidth();
                    int height = view.getHeight();
                    Intrinsics.checkNotNullParameter(layers, "layers");
                    renderEffectB = RenderEffect.createChainEffect(ro0.d0.a(width, height, layers, 0, 1.0f), ro0.d0.a(width, height, layers, 1, 1.0f));
                    Intrinsics.checkNotNullExpressionValue(renderEffectB, "createChainEffect(...)");
                    break;
                }
            }
            float fMax = ((qo0.e) zhm.d0.b0(layers)).f247971c;
            int size2 = layers.size();
            for (int i2 = 0; i2 < size2; i2++) {
                fMax = Math.max(fMax, ((qo0.e) layers.get(i2)).f247971c);
            }
            renderEffectB = fMax <= BitmapDescriptorFactory.HUE_RED ? null : ro0.d0.b(fMax);
            view.setRenderEffect(renderEffectB);
        }
    }

    public static final void c(ImageView imageView, ew0.c blurBackgroundType, float f, Drawable drawable, boolean z) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        Intrinsics.checkNotNullParameter(blurBackgroundType, "blurBackgroundType");
        imageView.setForeground(null);
        if (!Intrinsics.f(blurBackgroundType, ew0.a.f129982a)) {
            if (!Intrinsics.f(blurBackgroundType, ew0.b.f129983a)) {
                throw new NoWhenBranchMatchedException();
            }
            d(imageView, drawable);
            return;
        }
        Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        j70.a aVarA = wr0.a.a(context);
        if (aVarA == null) {
            d(imageView, drawable);
            return;
        }
        if (!n(aVarA)) {
            d(imageView, drawable);
            return;
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{new ColorDrawable(0), drawable});
        imageView.setImageDrawable(transitionDrawable);
        transitionDrawable.startTransition(200);
        Context context2 = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        float fK = kli.a.k(context2, f);
        List listC = zhm.u.c(new qo0.e(fK, fK, 0, imageView.getHeight()));
        if (z) {
            Context context3 = imageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            imageView.setForeground(new ColorDrawable(kli.a.s(R$attr.uikit_colorBlack_50, context3)));
        }
        b(imageView, listC, aVarA);
    }

    public static final void d(ImageView imageView, Drawable drawable) {
        Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TransitionDrawable transitionDrawable = new TransitionDrawable(new ColorDrawable[]{new ColorDrawable(0), new ColorDrawable(ix0.s0.d(drawable, context, s8.DEFAULT).f10611c)});
        imageView.setImageDrawable(transitionDrawable);
        transitionDrawable.startTransition(200);
    }

    public static final void e(View view, j70.a devicePerformance) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(devicePerformance, "devicePerformance");
        if (n(devicePerformance)) {
            Lazy lazy = ro0.d0.f255743a;
            Intrinsics.checkNotNullParameter(view, "view");
            view.setRenderEffect(null);
        }
    }

    public static final Object f(Class annotationClass, Map values, List methods) {
        Intrinsics.checkNotNullParameter(annotationClass, "annotationClass");
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(methods, "methods");
        int i = 0;
        Lazy lazyB = yhm.j.b(new ajm.d(values, i));
        Object objNewProxyInstance = Proxy.newProxyInstance(annotationClass.getClassLoader(), new Class[]{annotationClass}, new ajm.f(annotationClass, values, yhm.j.b(new ajm.e(annotationClass, values, i)), lazyB, methods));
        Intrinsics.i(objNewProxyInstance, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt.createAnnotationInstance");
        return objNewProxyInstance;
    }

    public static /* synthetic */ Object g(Class cls, Map map) {
        Set setKeySet = map.keySet();
        ArrayList arrayList = new ArrayList(zhm.w.t(setKeySet, 10));
        Iterator it8 = setKeySet.iterator();
        while (it8.hasNext()) {
            arrayList.add(cls.getDeclaredMethod((String) it8.next(), null));
        }
        return f(cls, map, arrayList);
    }

    public static final String h(String beneficiaryId) {
        Intrinsics.checkNotNullParameter(beneficiaryId, "beneficiaryId");
        return zhm.d0.k0(zhm.v.k("JISA", beneficiaryId), "_", null, null, 0, null, 62);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList i(java.util.List r16) {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kp0.w0.i(java.util.List):java.util.ArrayList");
    }

    public static final LayeredImage j(pcd.s sVar) {
        if (sVar == null) {
            return nib.a.a();
        }
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        return sVar.f234885h instanceof pcd.e0 ? nib.a.a() : fpg.a.a();
    }

    public static final TextLocalisedClause k(bj0.b bVar) {
        int i;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        int i2 = ci8.a.f24430a[bVar.ordinal()];
        if (i2 == 1) {
            i = R$string.junior_common_gender_boy;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.junior_common_gender_girl;
        }
        return new TextLocalisedClause(i, null, null, 14);
    }

    public static final cv3.u l(ax4.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        aim.f builder = new aim.f();
        Map map = bVar.f10861j;
        ArrayList arrayList = new ArrayList(map.size());
        Iterator it8 = map.entrySet().iterator();
        while (it8.hasNext()) {
            ax4.l lVar = (ax4.l) ((Map.Entry) it8.next()).getValue();
            arrayList.add(new Pair(lVar.f10887a, Long.valueOf(lVar.f10889c)));
        }
        zhm.r0.r(builder, arrayList);
        Map map2 = bVar.k;
        ArrayList arrayList2 = new ArrayList(map2.size());
        Iterator it9 = map2.entrySet().iterator();
        while (it9.hasNext()) {
            ax4.m mVar = (ax4.m) ((Map.Entry) it9.next()).getValue();
            arrayList2.add(new Pair(mVar.f10890a, Boolean.valueOf(mVar.f10891b)));
        }
        zhm.r0.r(builder, arrayList2);
        Map map3 = bVar.f10862l;
        ArrayList arrayList3 = new ArrayList(map3.size());
        Iterator it10 = map3.entrySet().iterator();
        while (it10.hasNext()) {
            ax4.n nVar = (ax4.n) ((Map.Entry) it10.next()).getValue();
            String str = nVar.f10892a;
            Long l2 = nVar.f10893b.e;
            if (l2 == null) {
                throw new IllegalArgumentException("parameterValue is required for selected state");
            }
            arrayList3.add(new Pair(str, l2));
        }
        zhm.r0.r(builder, arrayList3);
        builder.putAll(bVar.f10863m);
        Intrinsics.checkNotNullParameter(builder, "builder");
        return new cv3.u(builder.b());
    }

    public static final ed3.c m(List list, List list2, Function1 function1) {
        List list3 = list2;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator it8 = list3.iterator();
            while (it8.hasNext()) {
                if (((Boolean) function1.invoke(it8.next())).booleanValue()) {
                    List list4 = list;
                    if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                        Iterator it9 = list4.iterator();
                        while (it9.hasNext()) {
                            if (((Boolean) function1.invoke(it9.next())).booleanValue()) {
                                return ed3.c.UPGRADE_AVAILABLE;
                            }
                        }
                    }
                    return ed3.c.ALREADY_UPGRADED;
                }
            }
        }
        return ed3.c.PLAN_NOT_AVAILABLE;
    }

    public static final boolean n(j70.a devicePerformance) {
        Intrinsics.checkNotNullParameter(devicePerformance, "devicePerformance");
        if (Build.VERSION.SDK_INT < 33 || ((j70.c) devicePerformance).a().compareTo(j70.d.LOW) <= 0) {
            return false;
        }
        boolean z = jo0.m.f176847a;
        return jo0.m.e;
    }

    public static final boolean o(z6 z6Var) {
        Intrinsics.checkNotNullParameter(z6Var, "<this>");
        String str = z6Var.f273199g;
        if (str != null && str.length() != 0) {
            return true;
        }
        String str2 = z6Var.f273200h;
        return (str2 == null || str2.length() == 0) ? false : true;
    }

    public static final void p(Window window, yp0.f0... barsToMakeTransparent) {
        int i;
        Intrinsics.checkNotNullParameter(window, "<this>");
        Intrinsics.checkNotNullParameter(barsToMakeTransparent, "barsToMakeTransparent");
        if (barsToMakeTransparent.length == 0) {
            return;
        }
        if (kotlin.collections.d.I(barsToMakeTransparent, yp0.f0.STATUS)) {
            window.setStatusBarColor(0);
            i = 1280;
        } else {
            i = 256;
        }
        if (kotlin.collections.d.I(barsToMakeTransparent, yp0.f0.NAVIGATION)) {
            i |= 512;
            window.setNavigationBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            int i2 = Build.VERSION.SDK_INT;
            window.setNavigationBarDividerColor(0);
            if (i2 >= 29) {
                window.setNavigationBarContrastEnforced(false);
            }
        }
        window.getDecorView().setSystemUiVisibility(i);
    }

    public static final List q(zel.f fVar) {
        List listK;
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        int i = xzg.i0.f310001a[fVar.ordinal()];
        if (i == 1) {
            listK = zhm.v.k(xzg.a.ADR, xzg.a.EQUITY, xzg.a.SPAC, xzg.a.WARRANT);
        } else if (i == 2) {
            listK = zhm.u.c(xzg.a.ETF);
        } else if (i == 3) {
            listK = zhm.u.c(xzg.a.BOND);
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            listK = zhm.u.c(xzg.a.CFD);
        }
        return zhm.u.c(new xzg.b(listK));
    }

    public static final Pair r(PerformanceChart performanceChart, iwg.a analyticsProductType, eel.c timeSpan, xi0.b currency, iwg.c method, String str, String portfolioId) {
        String str2;
        String str3;
        Intrinsics.checkNotNullParameter(performanceChart, "<this>");
        Intrinsics.checkNotNullParameter(analyticsProductType, "analyticsProductType");
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        String str4 = currency.f306286a;
        if (str == null) {
            m70.a.c(kotlin.jvm.internal.t0.f186434a);
            str2 = "";
        } else {
            str2 = str;
        }
        pvg.w wVar = new pvg.w(analyticsProductType, timeSpan, str4, method, str2, portfolioId, performanceChart.f94991a, performanceChart.f94992b, performanceChart.d);
        List list = performanceChart.f94993c;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        for (Iterator it8 = list.iterator(); it8.hasNext(); it8 = it8) {
            PerformanceChartPoint performanceChartPoint = (PerformanceChartPoint) it8.next();
            String str5 = currency.f306286a;
            if (str == null) {
                m70.a.c(kotlin.jvm.internal.t0.f186434a);
                str3 = "";
            } else {
                str3 = str;
            }
            DateTime dateTime = performanceChartPoint.f94994a;
            float f = performanceChartPoint.f94995b;
            float f4 = performanceChartPoint.f94996c;
            Float f5 = performanceChartPoint.d;
            jo3.b bVarA = hx7.a.A(performanceChartPoint.e);
            ArrayList arrayList2 = arrayList;
            arrayList2.add(new pvg.x(analyticsProductType, timeSpan, str5, method, str3, portfolioId, dateTime, f, f4, f5, bVarA));
            arrayList = arrayList2;
        }
        return new Pair(wVar, arrayList);
    }

    public static final MultibancoWithdrawalCode s(e72.i iVar) {
        Object next;
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        String strE = iVar.getId();
        String strB = iVar.getCode();
        h02.e eVar = h02.f.Companion;
        String value = iVar.getState();
        eVar.getClass();
        Intrinsics.checkNotNullParameter(value, "value");
        Iterator<E> it8 = h02.f.a().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((h02.f) next).b(), value)) {
                break;
            }
        }
        h02.f fVar = (h02.f) next;
        if (fVar == null) {
            fVar = h02.f.UNKNOWN;
        }
        return new MultibancoWithdrawalCode(strE, strB, fVar, iVar.getOwnerId(), iVar.getRevolutCardId(), mo3.a.o(iVar.getAmount()), z92.f.t(iVar.getCreatedDate()), z92.f.t(iVar.getUpdatedDate()), z92.f.t(iVar.getExpirationDate()), iVar.getTransactionId());
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
        */
    public static final com.revolut.feature.rev_points.models.RevPointsBenefits t(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r22v0 ??
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
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        */

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
        */
    public static final com.revolut.feature.rev_points.models.RevPointsBenefits u(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r22v0 ??
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
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        */

    public static final PerformanceChart v(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        pvg.v vVar = (pvg.v) zhm.d0.d0(list);
        if (vVar == null) {
            return null;
        }
        DateTime dateTime = vVar.f240231g;
        DateTime dateTime2 = vVar.f240232h;
        List<pvg.v> list2 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        for (pvg.v vVar2 : list2) {
            arrayList.add(new PerformanceChartPoint(vVar2.f240233j, vVar2.k, vVar2.f240234l, vVar2.f240235m, hx7.a.v(vVar2.f240236n)));
        }
        return new PerformanceChart(dateTime, dateTime2, arrayList, vVar.i);
    }

    public static final PerformanceChart w(uvg.l lVar, String str) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        DateTime dateTimeC = lVar.getStart();
        DateTime dateTimeA = lVar.getEnd();
        List<uvg.n> listB = lVar.getPoints();
        ArrayList arrayList = new ArrayList(zhm.w.t(listB, 10));
        for (uvg.n nVar : listB) {
            arrayList.add(new PerformanceChartPoint(nVar.getTimestamp(), nVar.getReturns(), nVar.getTotalReturns(), nVar.getBenchmark(), mo3.a.o(nVar.getPnl())));
        }
        DateTime dateTime = DateTime.parse(str);
        Intrinsics.checkNotNullExpressionValue(dateTime, "parse(...)");
        return new PerformanceChart(dateTimeC, dateTimeA, arrayList, dateTime);
    }

    public static final dj0.d x(j3c.b0 b0Var) {
        Intrinsics.checkNotNullParameter(b0Var, "<this>");
        long jA = b0Var.getAmount();
        xi0.a aVar = xi0.b.Companion;
        String strB = b0Var.getCurrency();
        aVar.getClass();
        return new dj0.d(jA, xi0.a.a(strB));
    }

    public static final hha.q0 y(gfk.g0 g0Var) {
        hha.w0 w0Var;
        Intrinsics.checkNotNullParameter(g0Var, "<this>");
        List<gfk.c0> listA = g0Var.getSubscriptions();
        ArrayList arrayList = new ArrayList(zhm.w.t(listA, 10));
        for (gfk.c0 c0Var : listA) {
            gfk.f0 f0VarE = c0Var.getUser();
            String id10 = f0VarE.getId();
            wi0.a aVar = wi0.b.Companion;
            String country = f0VarE.getCountry();
            aVar.getClass();
            hha.o0 o0Var = new hha.o0(id10, wi0.a.a(country));
            gfk.e0 e0VarD = c0Var.getPlan();
            String id11 = e0VarD.getId();
            String tier = e0VarD.getTier();
            hha.w0[] w0VarArrValues = hha.w0.values();
            int length = w0VarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    w0Var = null;
                    break;
                }
                w0Var = w0VarArrValues[i];
                if (kotlin.text.a0.z(w0Var.name(), tier, true)) {
                    break;
                }
                i++;
            }
            if (w0Var == null) {
                w0Var = hha.w0.UNKNOWN;
            }
            hha.m0 m0Var = new hha.m0(w0Var, id11);
            gfk.d0 d0VarC = c0Var.getFamily();
            hha.k0 k0Var = d0VarC != null ? new hha.k0(d0VarC.getSeats()) : null;
            gfk.c cVarA = c0Var.getCharge();
            hha.o oVarE = cVarA != null ? nfk.e.e(cVarA) : null;
            List listB = c0Var.getDiscounts();
            ArrayList arrayList2 = new ArrayList();
            Iterator it8 = listB.iterator();
            while (it8.hasNext()) {
                hha.i0 i0VarH = nfk.e.h((gfk.q0) it8.next());
                if (i0VarH != null) {
                    arrayList2.add(i0VarH);
                }
            }
            arrayList.add(new hha.p0(o0Var, m0Var, k0Var, oVarE, arrayList2));
        }
        return new hha.q0(arrayList);
    }

    public static final ArrayList z(List list) {
        cgc.h hVar;
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            ahc.d dVar = (ahc.d) it8.next();
            Intrinsics.checkNotNullParameter(dVar, "<this>");
            String strD = dVar.getType();
            cgc.h[] hVarArrValues = cgc.h.values();
            int length = hVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    hVar = null;
                    break;
                }
                hVar = hVarArrValues[i];
                if (kotlin.text.a0.z(hVar.name(), strD, true)) {
                    break;
                }
                i++;
            }
            cgc.g gVar = hVar != null ? new cgc.g(dVar.getId(), dVar.getName(), dVar.getOrder(), hVar) : null;
            if (gVar != null) {
                arrayList.add(gVar);
            }
        }
        return arrayList;
    }
}
