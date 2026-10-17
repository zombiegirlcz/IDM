package te0;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CustomColors;
import com.revolut.core.ui_kit_core.displayers.image.transformation.HexagonalTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_core.displayers.image.transformation.MaskTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.MirrorTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.RoundedRectTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ShapeTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.SquareTransformation;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.address.models.Address;
import efm.d0;
import ix0.x1;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mic.a0;
import no.f2;
import org.reactivestreams.Publisher;
import qfm.i2;
import qfm.p0;
import qfm.r0;
import rp0.a1;
import rp0.f1;
import skm.g1;
import uyd.y;
import yp0.k0;
import zhm.h0;

/* JADX INFO: loaded from: classes.dex */
public abstract class w {
    public static final Lifecycle A(View view) {
        Lifecycle lifecycleA;
        Intrinsics.checkNotNullParameter(view, "<this>");
        View viewB = B(view);
        Object tag2 = viewB != null ? viewB.getTag(R$id.internal_view_screen_context_tag) : null;
        k0 k0Var = tag2 instanceof k0 ? (k0) tag2 : null;
        return (k0Var == null || (lifecycleA = k0Var.a()) == null) ? or0.u.g(view) : lifecycleA;
    }

    public static final pfm.t A0(v vVar, Object value) {
        Intrinsics.checkNotNullParameter(vVar, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        od0.i.Companion.getClass();
        return z0(vVar, od0.h.a(value));
    }

    public static final View B(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        do {
            Object tag2 = view.getTag(R$id.internal_view_screen_context_tag);
            k0 k0Var = tag2 instanceof k0 ? (k0) tag2 : null;
            if ((k0Var != null ? k0Var.a() : null) != null) {
                return view;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        } while (view != null);
        return null;
    }

    public static final efm.r B0(efm.r a7, efm.r b4) {
        Intrinsics.checkNotNullParameter(a7, "a");
        Intrinsics.checkNotNullParameter(b4, "b");
        efm.r rVarWithLatestFrom = a7.withLatestFrom(b4, new vf0.q(3));
        Intrinsics.checkNotNullExpressionValue(rVarWithLatestFrom, "withLatestFrom(...)");
        return rVarWithLatestFrom;
    }

    public static final d0 C(v vVar) {
        Intrinsics.checkNotNullParameter(vVar, "<this>");
        d0 d0VarFirstOrError = vVar.a().firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        return d0VarFirstOrError;
    }

    public static final ArrayList C0(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayListF1 = zhm.d0.f1(list);
        arrayListF1.removeIf(new fo.b(1, new an0.e(19)));
        return arrayListF1;
    }

    public static final r0 D(efm.r rVar, Function1 mapper) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        r0 r0VarG = rVar.toFlowable(efm.a.DROP).g(new vf0.r(0, mapper), 1);
        Intrinsics.checkNotNullExpressionValue(r0VarG, "flatMapCompletable(...)");
        return r0VarG;
    }

    public static final efm.k D0(efm.k a7, efm.k b4) {
        Intrinsics.checkNotNullParameter(a7, "a");
        Intrinsics.checkNotNullParameter(b4, "b");
        pd.h hVar = new pd.h(16);
        mfm.f.b(a7, "source1 is null");
        mfm.f.b(b4, "source2 is null");
        rfm.j jVar = new rfm.j(new efm.n[]{a7, b4}, mfm.f.c(hVar), 1);
        Intrinsics.checkNotNullExpressionValue(jVar, "zip(...)");
        return jVar;
    }

    public static final p0 E(efm.r rVar, Function1 mapper) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        efm.i flowable = rVar.toFlowable(efm.a.DROP);
        a0 a0Var = new a0(18, mapper);
        flowable.getClass();
        mfm.f.e(1, "maxConcurrency");
        p0 p0Var = new p0(flowable, a0Var, 1, (byte) 0);
        Intrinsics.checkNotNullExpressionValue(p0Var, "flatMapMaybe(...)");
        return p0Var;
    }

    public static final efm.k E0(efm.k a7, efm.k b4, efm.k c2) {
        Intrinsics.checkNotNullParameter(a7, "a");
        Intrinsics.checkNotNullParameter(b4, "b");
        Intrinsics.checkNotNullParameter(c2, "c");
        y yVar = new y(26);
        mfm.f.b(a7, "source1 is null");
        mfm.f.b(b4, "source2 is null");
        mfm.f.b(c2, "source3 is null");
        rfm.j jVar = new rfm.j(new efm.n[]{a7, b4, c2}, mfm.f.d(yVar), 1);
        Intrinsics.checkNotNullExpressionValue(jVar, "zip(...)");
        return jVar;
    }

    public static final p0 F(efm.r rVar, Function1 mapper) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        efm.i flowable = rVar.toFlowable(efm.a.DROP);
        a0 a0Var = new a0(16, mapper);
        flowable.getClass();
        mfm.f.e(1, "maxConcurrency");
        p0 p0Var = new p0(flowable, a0Var, 2, (byte) 0);
        Intrinsics.checkNotNullExpressionValue(p0Var, "flatMapSingle(...)");
        return p0Var;
    }

    public static final efm.r F0(efm.r a7, efm.r b4) {
        Intrinsics.checkNotNullParameter(a7, "a");
        Intrinsics.checkNotNullParameter(b4, "b");
        efm.r rVarZip = efm.r.zip(a7, b4, new y(17));
        Intrinsics.checkNotNullExpressionValue(rVarZip, "zip(...)");
        return rVarZip;
    }

    public static final efm.r G0(efm.r a7, efm.r b4, efm.r c2) {
        Intrinsics.checkNotNullParameter(a7, "a");
        Intrinsics.checkNotNullParameter(b4, "b");
        Intrinsics.checkNotNullParameter(c2, "c");
        efm.r rVarZip = efm.r.zip(a7, b4, c2, new vf0.q(1));
        Intrinsics.checkNotNullExpressionValue(rVarZip, "zip(...)");
        return rVarZip;
    }

    public static final d0 H0(d0 a7, d0 b4) {
        Intrinsics.checkNotNullParameter(a7, "a");
        Intrinsics.checkNotNullParameter(b4, "b");
        d0 d0VarD = d0.D(a7, b4, new pd.h(14));
        Intrinsics.checkNotNullExpressionValue(d0VarD, "zip(...)");
        return d0VarD;
    }

    public static final String I(do3.n nVar) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        String[] elements = {nVar.f116410c, nVar.e};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return nkm.y.u(nkm.y.o(kotlin.collections.d.E(elements), new dmj.a(9)), " ", null, 62);
    }

    public static final d0 I0(d0 a7, d0 b4, d0 c2) {
        Intrinsics.checkNotNullParameter(a7, "a");
        Intrinsics.checkNotNullParameter(b4, "b");
        Intrinsics.checkNotNullParameter(c2, "c");
        d0 d0VarC = d0.C(a7, b4, c2, new pd.h(15));
        Intrinsics.checkNotNullExpressionValue(d0VarC, "zip(...)");
        return d0VarC;
    }

    public static final List J(gz0.c cVar, Context context) {
        Object objC;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        ImageTransformations f59919c = cVar.getF60016c();
        Object uVar = null;
        if (f59919c == null) {
            return null;
        }
        aim.e eVarB = zhm.u.b();
        Integer num = f59919c.f;
        Integer num2 = f59919c.f60066g;
        if (num == null || num2 == null) {
            if (num2 != null) {
                int iIntValue = num2.intValue();
                wz0.j jVar = wz0.k.Companion;
                int iK = kli.a.k(context, iIntValue);
                jVar.getClass();
                eVarB.add(wz0.j.a(iK));
            }
            if (num != null) {
                int iIntValue2 = num.intValue();
                wz0.j jVar2 = wz0.k.Companion;
                int iK2 = kli.a.k(context, iIntValue2);
                jVar2.getClass();
                eVarB.add(wz0.j.b(iK2));
            }
        } else {
            eVarB.add(new wz0.k(kli.a.k(context, num.intValue()), kli.a.k(context, num2.intValue())));
        }
        Integer num3 = f59919c.f60063a;
        if (num3 != null) {
            eVarB.add(new wz0.p(num3.intValue()));
        }
        gz0.b bVar = f59919c.d;
        int i = bVar == null ? -1 : gz0.a.f147932a[bVar.ordinal()];
        if (i != -1) {
            if (i == 1) {
                uVar = new l8.u();
            } else if (i == 2) {
                uVar = new l8.g();
            } else if (i == 3) {
                uVar = wz0.d.f301316g;
            } else if (i == 4) {
                uVar = wz0.b.f301314g;
            } else if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
        }
        if (uVar != null) {
            eVarB.add(uVar);
        }
        CustomColors customColors = f59919c.f60065c;
        if (customColors != null) {
            Color color = customColors.f60060a;
            int iC = color != null ? io0.a.c(context, color) : 0;
            Color color2 = customColors.f60061b;
            eVarB.add(new wz0.i(iC, color2 != null ? io0.a.c(context, color2) : 0));
        }
        ShapeTransformation shapeTransformation = f59919c.f60064b;
        if (shapeTransformation != null) {
            Intrinsics.checkNotNullParameter(shapeTransformation, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            if (shapeTransformation instanceof CircleTransformation) {
                CircleTransformation circleTransformation = (CircleTransformation) shapeTransformation;
                Float f = circleTransformation.f60057a;
                Integer num4 = circleTransformation.f60058b;
                ArrayList arrayList = new ArrayList();
                if (!circleTransformation.d) {
                    arrayList.add(new wz0.s());
                }
                arrayList.add(new l8.i());
                objC = arrayList;
                objC = arrayList;
                if (f != null && num4 != null) {
                    arrayList.add(new wz0.g(kli.a.k(context, f.floatValue()), circleTransformation.f60059c, kli.a.s(num4.intValue(), context)));
                    objC = arrayList;
                }
            } else if (shapeTransformation instanceof RoundedRectTransformation) {
                aim.e eVarB2 = zhm.u.b();
                RoundedRectTransformation roundedRectTransformation = (RoundedRectTransformation) shapeTransformation;
                eVarB2.add(new l8.y(kli.a.k(context, roundedRectTransformation.getF60071a())));
                float fB = roundedRectTransformation.getF60072b();
                int iA = roundedRectTransformation.getF60073c();
                if (fB > BitmapDescriptorFactory.HUE_RED && iA != R$attr.uikit_colorTransparent) {
                    eVarB2.add(new wz0.r(kli.a.k(context, roundedRectTransformation.getF60071a()), kli.a.k(context, fB), kli.a.s(iA, context)));
                }
                objC = zhm.u.a(eVarB2);
            } else if (shapeTransformation instanceof MaskTransformation) {
                MaskTransformation maskTransformation = (MaskTransformation) shapeTransformation;
                objC = zhm.u.c(new wz0.m(maskTransformation.getF60067a(), maskTransformation.getF60068b(), maskTransformation.getF60069c(), maskTransformation.getD()));
            } else if (shapeTransformation.equals(HexagonalTransformation.f60062a)) {
                objC = zhm.u.c(new wz0.l());
            } else if (shapeTransformation.equals(MirrorTransformation.f60070a)) {
                objC = zhm.u.c(wz0.n.f301329g);
            } else {
                if (!shapeTransformation.equals(SquareTransformation.f60074a)) {
                    throw new NoWhenBranchMatchedException();
                }
                objC = zhm.u.c(new wz0.s());
            }
            eVarB.addAll((Collection) objC);
        }
        if (f59919c.e != null) {
            eVarB.add(new l8.y(kli.a.k(context, r7.intValue())));
        }
        return (List) ue0.e.M(zhm.u.a(eVarB));
    }

    public static final d0 J0(d0 a7, d0 b4, d0 c2, d0 d) {
        Intrinsics.checkNotNullParameter(a7, "a");
        Intrinsics.checkNotNullParameter(b4, "b");
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(d, "d");
        d0 d0VarB = d0.B(a7, b4, c2, d, new vf0.q(2));
        Intrinsics.checkNotNullExpressionValue(d0VarB, "zip(...)");
        return d0VarB;
    }

    public static final c8.o[] K(gz0.c cVar, Context context) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        List listJ = J(cVar, context);
        if (listJ != null) {
            return (c8.o[]) listJ.toArray(new c8.o[0]);
        }
        return null;
    }

    public static final d0 K0(d0 a7, d0 b4, d0 c2, d0 d, d0 e) {
        Intrinsics.checkNotNullParameter(a7, "a");
        Intrinsics.checkNotNullParameter(b4, "b");
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(d, "d");
        Intrinsics.checkNotNullParameter(e, "e");
        d0 d0VarA = d0.A(a7, b4, c2, d, e, new y(24));
        Intrinsics.checkNotNullExpressionValue(d0VarA, "zip(...)");
        return d0VarA;
    }

    public static final Object L(v vVar) {
        Intrinsics.checkNotNullParameter(vVar, "<this>");
        return ((od0.i) vVar.get()).f224257a;
    }

    public static final d0 L0(d0 a7, d0 b4, d0 c2, d0 d, d0 e, d0 f, d0 g3, d0 h2) {
        Intrinsics.checkNotNullParameter(a7, "a");
        Intrinsics.checkNotNullParameter(b4, "b");
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(d, "d");
        Intrinsics.checkNotNullParameter(e, "e");
        Intrinsics.checkNotNullParameter(f, "f");
        Intrinsics.checkNotNullParameter(g3, "g");
        Intrinsics.checkNotNullParameter(h2, "h");
        y yVar = new y(20);
        mfm.f.b(a7, "source1 is null");
        mfm.f.b(b4, "source2 is null");
        mfm.f.b(c2, "source3 is null");
        mfm.f.b(d, "source4 is null");
        mfm.f.b(e, "source5 is null");
        mfm.f.b(f, "source6 is null");
        mfm.f.b(g3, "source7 is null");
        mfm.f.b(h2, "source8 is null");
        d0 d0VarF = d0.F(new kye.e(yVar, 12), a7, b4, c2, d, e, f, g3, h2);
        Intrinsics.checkNotNullExpressionValue(d0VarF, "zip(...)");
        return d0VarF;
    }

    public static final Object M(v vVar, Object obj2) {
        Intrinsics.checkNotNullParameter(vVar, "<this>");
        Intrinsics.checkNotNullParameter(obj2, "default");
        return vVar.isInitialized() ? vVar.get() : obj2;
    }

    public static final ufm.c N(v vVar) {
        Intrinsics.checkNotNullParameter(vVar, "<this>");
        ufm.c cVar = new ufm.c(new qc0.v(vVar, 1), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        return cVar;
    }

    public static final Object O(v vVar) {
        Intrinsics.checkNotNullParameter(vVar, "<this>");
        if (vVar.isInitialized()) {
            return vVar.get();
        }
        return null;
    }

    public static final k0 P(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Object tag2 = view.getTag(R$id.internal_view_screen_context_tag);
        if (tag2 instanceof k0) {
            return (k0) tag2;
        }
        return null;
    }

    public static final x1 R(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Object tag2 = view.getTag(R$id.internal_transient_state_provider_tag);
        if (tag2 instanceof x1) {
            return (x1) tag2;
        }
        return null;
    }

    public static final boolean S(do3.n nVar, wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        String countryCode2 = countryCode.f297794a;
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        Intrinsics.checkNotNullParameter(countryCode2, "countryCode");
        Address address = nVar.k;
        return Intrinsics.f(address != null ? address.getCountry() : null, countryCode2);
    }

    public static final boolean T(do3.n nVar, wi0.b... countryCodes) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        Intrinsics.checkNotNullParameter(countryCodes, "countryCodes");
        for (wi0.b bVar : countryCodes) {
            if (S(nVar, bVar)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean U(do3.n nVar) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        return com.bumptech.glide.d.p(do3.q.y(nVar));
    }

    public static final boolean V(do3.n nVar) {
        if (nVar != null) {
            wi0.b.Companion.getClass();
            if (S(nVar, wi0.b.Y1)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean W(Throwable th10, b80.c cVar) {
        return tj0.a.a(th10) || cVar.a() == al0.a.OFFLINE;
    }

    public static final boolean Y(do3.n nVar) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        return nVar.f116422w.a() == do3.g.GRACE_PERIOD || nVar.f116422w.a() == do3.g.ACTIVE;
    }

    public static final boolean Z(do3.n nVar) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        wi0.b.Companion.getClass();
        return S(nVar, wi0.b.p0);
    }

    public static mii.f a(String id10, Clause message, TextLocalisedClause textLocalisedClause, Image image, f1 position, a1 a1Var, int i) {
        if ((i & 4) != 0) {
            textLocalisedClause = null;
        }
        if ((i & 16) != 0) {
            image = null;
        }
        if ((i & 32) != 0) {
            position = f1.BOTTOM;
        }
        if ((i & 64) != 0) {
            a1Var = a1.SHORT;
        }
        a1 duration = a1Var;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(duration, "duration");
        return new mii.f(id10, message, textLocalisedClause, image, position, duration);
    }

    public static final efm.r a0(efm.r rVar, Function1 block) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        efm.r rVarLift = rVar.lift(new v3e.s(new tm.a(4, block), 9));
        Intrinsics.checkNotNullExpressionValue(rVarLift, "lift(...)");
        return rVarLift;
    }

    public static final pfm.h b(efm.r rVar, Function1 mapper) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        d0 d0VarFirstOrError = rVar.firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        Intrinsics.checkNotNullParameter(d0VarFirstOrError, "<this>");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        v3e.s sVar = new v3e.s(new tm.a(5, mapper), 11);
        d0VarFirstOrError.getClass();
        pfm.t tVarM = new pfm.a(d0VarFirstOrError, sVar, 4).m(new v3e.s(new qza.q(22), 7));
        pfm.h hVar = new pfm.h(tVarM.B().l(Long.MAX_VALUE, new v3e.s(new qza.q(23), 8)), 3);
        Intrinsics.checkNotNullExpressionValue(hVar, "retry(...)");
        return hVar;
    }

    public static final efm.r b0(efm.r rVar, Function1 block) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        efm.r rVarLift = rVar.lift(new vf0.n(new v1.m(4, block), 7));
        Intrinsics.checkNotNullExpressionValue(rVarLift, "lift(...)");
        return rVarLift;
    }

    public static final void c(Throwable th10, Throwable cause) {
        Intrinsics.checkNotNullParameter(th10, "<this>");
        Intrinsics.checkNotNullParameter(cause, "cause");
        StackTraceElement[] stackTrace = th10.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
        StackTraceElement[] stackTrace2 = cause.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace2, "getStackTrace(...)");
        th10.setStackTrace((StackTraceElement[]) zhm.p.A(stackTrace, stackTrace2));
    }

    public static final efm.r c0(b80.c cVar) {
        return cVar.c(false).filter(new uhl.b(new ueg.p0(27), 13));
    }

    public static final com.bumptech.glide.j d(com.bumptech.glide.j jVar, Context context, gz0.c image) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(image, "image");
        c8.o[] oVarArrK = K(image, context);
        if (oVarArrK == null) {
            return jVar;
        }
        u8.a aVarL = jVar.L((c8.o[]) Arrays.copyOf(oVarArrK, oVarArrK.length));
        Intrinsics.h(aVarL);
        return (com.bumptech.glide.j) aVarL;
    }

    public static final efm.r d0(e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        efm.r map = eVar.c(s.f270018a).filter(new tcg.q(4, new tcg.a0(15))).map(new tcg.q(5, new tcg.a0(16)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public static final void e(u8.h hVar, Context context, gz0.c image) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(image, "image");
        c8.o[] oVarArrK = K(image, context);
        if (oVarArrK != null) {
            hVar.L((c8.o[]) Arrays.copyOf(oVarArrK, oVarArrK.length));
        }
    }

    public static final ufm.n e0(d0 d0Var) {
        Intrinsics.checkNotNullParameter(d0Var, "<this>");
        ufm.n nVarS = d0Var.s(hhm.f.f152430b);
        Intrinsics.checkNotNullExpressionValue(nVarS, "subscribeOn(...)");
        return nVarS;
    }

    public static final rfm.u f(Object obj2) {
        rfm.u uVarG = efm.k.g(obj2);
        Intrinsics.checkNotNullExpressionValue(uVarG, "just(...)");
        return uVarG;
    }

    public static final efm.r f0(efm.r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        efm.r rVarSubscribeOn = rVar.subscribeOn(hhm.f.f152431c);
        Intrinsics.checkNotNullExpressionValue(rVarSubscribeOn, "subscribeOn(...)");
        return rVarSubscribeOn;
    }

    public static final efm.k g(Object obj2) {
        if (obj2 == null) {
            rfm.h hVar = rfm.h.f253943a;
            Intrinsics.checkNotNullExpressionValue(hVar, "empty(...)");
            return hVar;
        }
        rfm.u uVarG = efm.k.g(obj2);
        Intrinsics.checkNotNullExpressionValue(uVarG, "just(...)");
        return uVarG;
    }

    public static final pfm.r g0(efm.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        pfm.r rVarY = bVar.y(hhm.f.f152431c);
        Intrinsics.checkNotNullExpressionValue(rVarY, "subscribeOn(...)");
        return rVarY;
    }

    public static final efm.r h(Object obj2) {
        Intrinsics.checkNotNullParameter(obj2, "<this>");
        efm.r rVarJust = efm.r.just(obj2);
        Intrinsics.checkNotNullExpressionValue(rVarJust, "just(...)");
        return rVarJust;
    }

    public static final rfm.w h0(efm.k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        rfm.w wVarK = kVar.k(hhm.f.f152431c);
        Intrinsics.checkNotNullExpressionValue(wVarK, "subscribeOn(...)");
        return wVarK;
    }

    public static final efm.r i(Object obj2) {
        efm.r rVarJust;
        String str;
        if (obj2 == null) {
            rVarJust = efm.r.empty();
            str = "empty(...)";
        } else {
            rVarJust = efm.r.just(obj2);
            str = "just(...)";
        }
        Intrinsics.checkNotNullExpressionValue(rVarJust, str);
        return rVarJust;
    }

    public static final ufm.n i0(d0 d0Var) {
        Intrinsics.checkNotNullParameter(d0Var, "<this>");
        ufm.n nVarS = d0Var.s(hhm.f.f152431c);
        Intrinsics.checkNotNullExpressionValue(nVarS, "subscribeOn(...)");
        return nVarS;
    }

    public static final ufm.b j(Object obj2) {
        ufm.b bVarM = d0.m(obj2);
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }

    public static final void j0(lfm.c cVar, ifm.c cVar2) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        if (cVar2 != null) {
            cVar.a(cVar2);
        }
    }

    public static final Object k(d0 d0Var) throws Throwable {
        Intrinsics.checkNotNullParameter(d0Var, "<this>");
        try {
            v3e.s sVar = new v3e.s(new qza.q(24), 10);
            d0Var.getClass();
            return new ufm.i(d0Var, sVar, 2).e();
        } catch (Throwable th10) {
            if (th10 instanceof vf0.c) {
                throw th10.getCause();
            }
            Throwable cause = th10.getCause();
            if (cause instanceof vf0.c) {
                throw ((vf0.c) cause).getCause();
            }
            if (cause == null) {
                throw th10;
            }
            throw cause;
        }
    }

    public static final uj0.b k0(b80.c connectivityRepository, Function1 fromNetwork) {
        Intrinsics.checkNotNullParameter(connectivityRepository, "connectivityRepository");
        Intrinsics.checkNotNullParameter(fromNetwork, "fromNetwork");
        return new uj0.b(connectivityRepository, fromNetwork);
    }

    public static final efm.r l(efm.r a7, efm.r b4) {
        Intrinsics.checkNotNullParameter(a7, "a");
        Intrinsics.checkNotNullParameter(b4, "b");
        efm.r rVarCombineLatest = efm.r.combineLatest(a7, b4, new y(28));
        Intrinsics.checkNotNullExpressionValue(rVarCombineLatest, "combineLatest(...)");
        return rVarCombineLatest;
    }

    public static final efm.r l0(efm.r rVar, b80.c connectivityRepository) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Intrinsics.checkNotNullParameter(connectivityRepository, "connectivityRepository");
        efm.r rVarRetryWhen = rVar.retryWhen(new uhl.b(new uj0.a(connectivityRepository, 0), 11));
        Intrinsics.checkNotNullExpressionValue(rVarRetryWhen, "retryWhen(...)");
        return rVarRetryWhen;
    }

    public static final efm.r m(efm.r a7, efm.r b4, efm.r c2) {
        Intrinsics.checkNotNullParameter(a7, "a");
        Intrinsics.checkNotNullParameter(b4, "b");
        Intrinsics.checkNotNullParameter(c2, "c");
        efm.r rVarCombineLatest = efm.r.combineLatest(a7, b4, c2, new vf0.q(4));
        Intrinsics.checkNotNullExpressionValue(rVarCombineLatest, "combineLatest(...)");
        return rVarCombineLatest;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0080, code lost:
    
        if (r8 == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0080 -> B:13:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m0(b80.c r6, kotlin.jvm.functions.Function1 r7, kotlin.coroutines.Continuation r8) throws java.lang.Exception {
        /*
            boolean r0 = r8 instanceof uj0.c
            if (r0 == 0) goto L13
            r0 = r8
            uj0.c r0 = (uj0.c) r0
            int r1 = r0.f280466x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f280466x = r1
            goto L18
        L13:
            uj0.c r0 = new uj0.c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f280465w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f280466x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L47
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            kotlin.jvm.functions.Function1 r6 = r0.v
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
            b80.c r7 = r0.u
            yhm.o.b(r8)
        L2f:
            r5 = r7
            r7 = r6
            r6 = r5
            goto L83
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            kotlin.jvm.functions.Function1 r6 = r0.v
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
            b80.c r7 = r0.u
            yhm.o.b(r8)     // Catch: java.lang.Exception -> L45
            return r8
        L45:
            r8 = move-exception
            goto L5f
        L47:
            yhm.o.b(r8)
        L4a:
            r0.u = r6     // Catch: java.lang.Exception -> L5b
            r8 = r7
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8     // Catch: java.lang.Exception -> L5b
            r0.v = r8     // Catch: java.lang.Exception -> L5b
            r0.f280466x = r4     // Catch: java.lang.Exception -> L5b
            java.lang.Object r6 = r7.invoke(r0)     // Catch: java.lang.Exception -> L5b
            if (r6 != r1) goto L5a
            goto L82
        L5a:
            return r6
        L5b:
            r8 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L5f:
            boolean r2 = r8 instanceof java.util.concurrent.CancellationException
            if (r2 != 0) goto L87
            boolean r2 = W(r8, r7)
            if (r2 == 0) goto L86
            efm.r r8 = c0(r7)
            java.lang.String r2 = "observeOnlineState(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r2)
            r0.u = r7
            r2 = r6
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            r0.v = r2
            r0.f280466x = r3
            java.lang.Object r8 = nim.a.c(r8, r0)
            if (r8 != r1) goto L2f
        L82:
            return r1
        L83:
            al0.a r8 = (al0.a) r8
            goto L4a
        L86:
            throw r8
        L87:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: te0.w.m0(b80.c, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final efm.r n(efm.r a7, efm.r b4, efm.r c2, efm.r d) {
        Intrinsics.checkNotNullParameter(a7, "a");
        Intrinsics.checkNotNullParameter(b4, "b");
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(d, "d");
        efm.r rVarCombineLatest = efm.r.combineLatest(a7, b4, c2, d, new y(15));
        Intrinsics.checkNotNullExpressionValue(rVarCombineLatest, "combineLatest(...)");
        return rVarCombineLatest;
    }

    public static final i2 n0(d0 d0Var, b80.c connectivityRepository) {
        Intrinsics.checkNotNullParameter(d0Var, "<this>");
        Intrinsics.checkNotNullParameter(connectivityRepository, "connectivityRepository");
        i2 i2VarP = d0Var.p(new pv9.b(new f2(connectivityRepository, 18), 26));
        Intrinsics.checkNotNullExpressionValue(i2VarP, "retryWhen(...)");
        return i2VarP;
    }

    public static final efm.r o(efm.r a7, efm.r b4, efm.r c2, efm.r d, efm.r e) {
        Intrinsics.checkNotNullParameter(a7, "a");
        Intrinsics.checkNotNullParameter(b4, "b");
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(d, "d");
        Intrinsics.checkNotNullParameter(e, "e");
        efm.r rVarCombineLatest = efm.r.combineLatest(a7, b4, c2, d, e, new y(16));
        Intrinsics.checkNotNullExpressionValue(rVarCombineLatest, "combineLatest(...)");
        return rVarCombineLatest;
    }

    public static final ufm.b o0(CoroutineContext coroutineContext, Function2 function2) {
        if (coroutineContext.get(g1.f263979a) == null) {
            return new ufm.b(new clm.i(coroutineContext, function2, 1), 0);
        }
        throw new IllegalArgumentException(("Single context cannot contain job in it.Its lifecycle should be managed via Disposable handle. Had " + coroutineContext).toString());
    }

    public static final efm.r p(efm.r a7, efm.r b4, efm.r c2, efm.r d, efm.r e, efm.r f) {
        Intrinsics.checkNotNullParameter(a7, "a");
        Intrinsics.checkNotNullParameter(b4, "b");
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(d, "d");
        Intrinsics.checkNotNullParameter(e, "e");
        Intrinsics.checkNotNullParameter(f, "f");
        efm.r rVarCombineLatest = efm.r.combineLatest(a7, b4, c2, d, e, f, new y(27));
        Intrinsics.checkNotNullExpressionValue(rVarCombineLatest, "combineLatest(...)");
        return rVarCombineLatest;
    }

    public static final void p0(ifm.c cVar) {
        if (cVar != null ? cVar.isDisposed() : true) {
            cVar = null;
        }
        if (cVar != null) {
            cVar.dispose();
            Unit unit = Unit.f186387a;
        }
    }

    public static final efm.r q(efm.r a7, efm.r b4, efm.r c2, efm.r d, efm.r e, efm.r f, efm.r g3) {
        Intrinsics.checkNotNullParameter(a7, "a");
        Intrinsics.checkNotNullParameter(b4, "b");
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(d, "d");
        Intrinsics.checkNotNullParameter(e, "e");
        Intrinsics.checkNotNullParameter(f, "f");
        Intrinsics.checkNotNullParameter(g3, "g");
        efm.r rVarCombineLatest = efm.r.combineLatest(a7, b4, c2, d, e, f, g3, new y(29));
        Intrinsics.checkNotNullExpressionValue(rVarCombineLatest, "combineLatest(...)");
        return rVarCombineLatest;
    }

    public static final efm.r q0(efm.r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        efm.r rVarScan = rVar.scan(new Pair(null, null), new vf0.n(new vea.b(6), 0));
        Intrinsics.checkNotNullExpressionValue(rVarScan, "scan(...)");
        return rVarScan;
    }

    public static final efm.r r(efm.r a7, efm.r b4, efm.r c2, efm.r d, efm.r e, efm.r f, efm.r g3, efm.r h2) {
        Intrinsics.checkNotNullParameter(a7, "a");
        Intrinsics.checkNotNullParameter(b4, "b");
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(d, "d");
        Intrinsics.checkNotNullParameter(e, "e");
        Intrinsics.checkNotNullParameter(f, "f");
        Intrinsics.checkNotNullParameter(g3, "g");
        Intrinsics.checkNotNullParameter(h2, "h");
        efm.r rVarCombineLatest = efm.r.combineLatest(a7, b4, c2, d, e, f, g3, h2, new y(21));
        Intrinsics.checkNotNullExpressionValue(rVarCombineLatest, "combineLatest(...)");
        return rVarCombineLatest;
    }

    public static final efm.r r0(efm.r rVar, Object obj2) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        efm.r rVarScan = rVar.scan(new Pair(obj2, obj2), new vf0.n(new vea.b(5), 2));
        Intrinsics.checkNotNullExpressionValue(rVarScan, "scan(...)");
        return rVarScan;
    }

    public static final efm.r s(efm.r a7, efm.r b4, efm.r c2, efm.r d, efm.r e, efm.r f, efm.r g3, efm.r h2, efm.r i) {
        Intrinsics.checkNotNullParameter(a7, "a");
        Intrinsics.checkNotNullParameter(b4, "b");
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(d, "d");
        Intrinsics.checkNotNullParameter(e, "e");
        Intrinsics.checkNotNullParameter(f, "f");
        Intrinsics.checkNotNullParameter(g3, "g");
        Intrinsics.checkNotNullParameter(h2, "h");
        Intrinsics.checkNotNullParameter(i, "i");
        efm.r rVarCombineLatest = efm.r.combineLatest(a7, b4, c2, d, e, f, g3, h2, i, new y(23));
        Intrinsics.checkNotNullExpressionValue(rVarCombineLatest, "combineLatest(...)");
        return rVarCombineLatest;
    }

    public static final void s0(e eVar, Object obj2) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        od0.i.Companion.getClass();
        eVar.set(od0.h.a(obj2));
    }

    public static final efm.r t(efm.r a7, efm.r b4, efm.r c2, efm.r d, efm.r e, efm.r f, efm.r g3, efm.r h2, efm.r i, efm.r j2) {
        Intrinsics.checkNotNullParameter(a7, "a");
        Intrinsics.checkNotNullParameter(b4, "b");
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(d, "d");
        Intrinsics.checkNotNullParameter(e, "e");
        Intrinsics.checkNotNullParameter(f, "f");
        Intrinsics.checkNotNullParameter(g3, "g");
        Intrinsics.checkNotNullParameter(h2, "h");
        Intrinsics.checkNotNullParameter(i, "i");
        Intrinsics.checkNotNullParameter(j2, "j");
        efm.r rVarCombineLatest = efm.r.combineLatest(zhm.v.k(a7, b4, c2, d, e, f, g3, h2, i, j2), new vf0.n(new vea.n(29), 6));
        Intrinsics.checkNotNullExpressionValue(rVarCombineLatest, "combineLatest(...)");
        return rVarCombineLatest;
    }

    public static final ofm.h t0(pfm.h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        pfm.a aVar = new pfm.a(hVar, new a31.a(new qza.x(new BreadcrumbException(), 26)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar.w(new bo.e(11, vf0.s.f288469a), vf0.t.f288470a);
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        return hVarW;
    }

    public static final efm.r u(efm.r a7, efm.r b4, efm.r c2, efm.r d, efm.r e, efm.r f, efm.r g3, efm.r h2, efm.r i, efm.r j2, efm.r k, efm.r l2, efm.r m3, efm.r n3) {
        Intrinsics.checkNotNullParameter(a7, "a");
        Intrinsics.checkNotNullParameter(b4, "b");
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(d, "d");
        Intrinsics.checkNotNullParameter(e, "e");
        Intrinsics.checkNotNullParameter(f, "f");
        Intrinsics.checkNotNullParameter(g3, "g");
        Intrinsics.checkNotNullParameter(h2, "h");
        Intrinsics.checkNotNullParameter(i, "i");
        Intrinsics.checkNotNullParameter(j2, "j");
        Intrinsics.checkNotNullParameter(k, "k");
        Intrinsics.checkNotNullParameter(l2, "l");
        Intrinsics.checkNotNullParameter(m3, "m");
        Intrinsics.checkNotNullParameter(n3, "n");
        efm.r rVarCombineLatest = efm.r.combineLatest(zhm.v.k(a7, b4, c2, d, e, f, g3, h2, i, j2, k, l2, m3, n3), new vf0.n(new vea.n(28), 4));
        Intrinsics.checkNotNullExpressionValue(rVarCombineLatest, "combineLatest(...)");
        return rVarCombineLatest;
    }

    public static final efm.r u0(efm.r rVar) {
        TimeUnit unit = TimeUnit.MILLISECONDS;
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Intrinsics.checkNotNullParameter(unit, "unit");
        efm.r rVarPublish = rVar.publish(new vf0.n(new vf0.p(), 11));
        Intrinsics.checkNotNullExpressionValue(rVarPublish, "publish(...)");
        return rVarPublish;
    }

    public static final efm.r v(efm.r a7, efm.r b4, Function2 combiner) {
        Intrinsics.checkNotNullParameter(a7, "a");
        Intrinsics.checkNotNullParameter(b4, "b");
        Intrinsics.checkNotNullParameter(combiner, "combiner");
        efm.r rVarCombineLatest = efm.r.combineLatest(a7, b4, new com.onfido.android.sdk.capture.internal.util.a(combiner));
        Intrinsics.checkNotNullExpressionValue(rVarCombineLatest, "combineLatest(...)");
        return rVarCombineLatest;
    }

    public static final efm.r v0(efm.r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        efm.r rVarObserveOn = rVar.observeOn(hhm.f.f152430b);
        Intrinsics.checkNotNullExpressionValue(rVarObserveOn, "observeOn(...)");
        return rVarObserveOn;
    }

    public static final efm.r w(List observables) {
        Intrinsics.checkNotNullParameter(observables, "observables");
        efm.r rVarCombineLatest = efm.r.combineLatest(observables, new vf0.n(new vea.n(26), 1));
        Intrinsics.checkNotNullExpressionValue(rVarCombineLatest, "combineLatest(...)");
        return rVarCombineLatest;
    }

    public static final efm.r w0(efm.r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        efm.r rVarObserveOn = rVar.observeOn(hhm.f.f152431c);
        Intrinsics.checkNotNullExpressionValue(rVarObserveOn, "observeOn(...)");
        return rVarObserveOn;
    }

    public static final void x(ihm.k kVar, lfm.c compositeDisposable) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        j0(compositeDisposable, new ifm.a(new lm.a(kVar, 4), 0));
    }

    public static boolean x0(Publisher publisher, dom.a aVar, kfm.o oVar) {
        if (!(publisher instanceof Callable)) {
            return false;
        }
        try {
            Object objCall = ((Callable) publisher).call();
            if (objCall == null) {
                yfm.d.c(aVar);
                return true;
            }
            try {
                Object objApply = oVar.apply(objCall);
                mfm.f.b(objApply, "The mapper returned a null Publisher");
                Publisher publisher2 = (Publisher) objApply;
                if (!(publisher2 instanceof Callable)) {
                    publisher2.a(aVar);
                    return true;
                }
                try {
                    Object objCall2 = ((Callable) publisher2).call();
                    if (objCall2 == null) {
                        yfm.d.c(aVar);
                        return true;
                    }
                    aVar.e(new yfm.e(aVar, objCall2));
                    return true;
                } catch (Throwable th10) {
                    m70.a.u(th10);
                    yfm.d.d(th10, aVar);
                    return true;
                }
            } catch (Throwable th11) {
                m70.a.u(th11);
                yfm.d.d(th11, aVar);
                return true;
            }
        } catch (Throwable th12) {
            m70.a.u(th12);
            yfm.d.d(th12, aVar);
            return true;
        }
    }

    public static final efm.r y(efm.r rVar, long j2) {
        TimeUnit unit = TimeUnit.MILLISECONDS;
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Intrinsics.checkNotNullParameter(unit, "unit");
        efm.r rVarDebounce = rVar.debounce(new cc.c(j2));
        Intrinsics.checkNotNullExpressionValue(rVarDebounce, "debounce(...)");
        return rVarDebounce;
    }

    public static final Lazy y0(Function0 initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        return yhm.j.c(yhm.k.NONE, initializer);
    }

    public static final efm.r z(efm.r rVar, Function1 onFirst) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Intrinsics.checkNotNullParameter(onFirst, "onFirst");
        efm.r rVarDefer = efm.r.defer(new to7.f(rVar, onFirst, 15));
        Intrinsics.checkNotNullExpressionValue(rVarDefer, "defer(...)");
        return rVarDefer;
    }

    public static final pfm.t z0(v vVar, Object value) {
        Intrinsics.checkNotNullParameter(vVar, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        efm.b bVarIgnoreElements = vVar.b(value).ignoreElements();
        Intrinsics.checkNotNullExpressionValue(bVarIgnoreElements, "ignoreElements(...)");
        return ue0.e.r(bVarIgnoreElements, h0.f322473a);
    }

    public abstract Method G(Class cls, Field field);

    public abstract Constructor H(Class cls);

    public abstract String[] Q(Class cls);

    public abstract boolean X(Class cls);
}
