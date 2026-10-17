package pd;

import android.content.Context;
import android.os.Build;
import android.os.Parcel;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewParent;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.material.color.DynamicColors;
import com.google.mlkit.vision.face.FaceDetectorOptions;
import com.google.protobuf.w0;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.o;
import com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.models.AppTheme;
import com.revolut.feature.uipersonalisation.api.models.ColorThemeOption;
import com.revolut.kompot.navigable.flow.BaseFlow;
import com.revolut.kompot.navigable.root.RootFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.rxdata.core.CompositeException;
import com.youTransactor.uCube.rpc.Constants;
import dki.n;
import efm.r;
import gq0.j;
import gq0.l;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import or0.u;
import skm.g1;
import v3e.s;
import yhm.m;
import zhm.d0;
import zhm.r0;
import zhm.v;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static ThreadPoolExecutor f235014a;

    public static final void a(ViewController viewController, ek2.g listener) {
        Intrinsics.checkNotNullParameter(viewController, "<this>");
        Intrinsics.checkNotNullParameter(listener, "listener");
        zv0.a aVarD = d(viewController);
        if (aVarD == null) {
            return;
        }
        ((o) aVarD).b(listener);
        viewController.F.addObserver(new cwl.e(aVarD, listener, 2));
    }

    public static final void b(ViewController viewController, ebi.a listener) {
        Intrinsics.checkNotNullParameter(viewController, "<this>");
        Intrinsics.checkNotNullParameter(listener, "listener");
        zv0.a aVarD = d(viewController);
        if (aVarD == null) {
            return;
        }
        ((o) aVarD).c(listener);
        viewController.F.addObserver(new cwl.e(aVarD, listener, 3));
    }

    public static final Throwable c(Throwable th10, Throwable th11) {
        if (th10 != null && th11 != null) {
            return new CompositeException(v.k(th10, th11));
        }
        if (th10 != null) {
            return th10;
        }
        if (th11 == null) {
            return null;
        }
        return th11;
    }

    public static final zv0.a d(com.revolut.kompot.navigable.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        for (ViewParent parent = aVar.D2().getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof zv0.a) {
                return (zv0.a) parent;
            }
        }
        return null;
    }

    public static final RootFlow e(com.revolut.kompot.navigable.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        if (aVar instanceof RootFlow) {
            return (RootFlow) aVar;
        }
        com.revolut.kompot.navigable.a aVar2 = aVar.f98405m;
        while (aVar2 != null && !(aVar2 instanceof RootFlow)) {
            aVar2 = aVar2.f98405m;
        }
        RootFlow rootFlow = aVar2 instanceof RootFlow ? (RootFlow) aVar2 : null;
        if (rootFlow != null) {
            return rootFlow;
        }
        throw new IllegalStateException("There is no RootFlow in the tree");
    }

    public static oh.a f(FaceDetectorOptions faceDetectorOptions) {
        Preconditions.checkNotNull(faceDetectorOptions, "You must provide a valid FaceDetectorOptions.");
        oh.d dVar = (oh.d) ch.h.c().a(oh.d.class);
        dVar.getClass();
        Preconditions.checkNotNull(faceDetectorOptions, "You must provide a valid FaceDetectorOptions.");
        return new oh.a((oh.h) dVar.f225250a.get(faceDetectorOptions), dVar.f225251b, faceDetectorOptions);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean g(com.revolut.kompot.navigable.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        if (!(aVar instanceof yki.f) || !((yki.f) aVar).k().n0()) {
            if (!(aVar instanceof BaseFlow)) {
                return false;
            }
            BaseFlow baseFlow = (BaseFlow) aVar;
            n nVar = baseFlow.L;
            hli.e eVar = baseFlow.K;
            if (eVar == null) {
                Intrinsics.r("mainControllerContainer");
                throw null;
            }
            com.revolut.kompot.navigable.b bVarC = nVar.c(eVar.getContainerId());
            com.revolut.kompot.navigable.a aVar2 = bVarC != null ? bVarC.k : null;
            if (aVar2 == null || !g(aVar2)) {
                return false;
            }
        }
        return true;
    }

    public static final void h(View view, boolean z) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (l(view).a(z ? j.f145502a : null)) {
            view.sendAccessibilityEvent(2048);
        }
    }

    public static void i(View view, boolean z) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (l(view).a(new l(z))) {
            view.sendAccessibilityEvent(2048);
        }
    }

    public static final boolean j(Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean k(Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public static final gq0.i l(View view) {
        AccessibilityDelegateCompat accessibilityDelegate = ViewCompat.getAccessibilityDelegate(view);
        if (accessibilityDelegate instanceof gq0.i) {
            return (gq0.i) accessibilityDelegate;
        }
        gq0.i iVar = new gq0.i();
        ViewCompat.setAccessibilityDelegate(view, iVar);
        return iVar;
    }

    public static final w0 m(Parcel source) throws Throwable {
        Object objA;
        String string;
        Intrinsics.checkNotNullParameter(source, "source");
        if (source.readInt() == 0) {
            return null;
        }
        try {
            m.Companion aVar = m.INSTANCE;
            string = source.readString();
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th10) {
            m.Companion aVar2 = m.INSTANCE;
            objA = yhm.o.a(th10);
        }
        if (string == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Class<?> cls = Class.forName(string);
        byte[] bArr = new byte[source.readInt()];
        source.readByteArray(bArr);
        objA = com.google.protobuf.j.V(bArr, cls);
        Throwable thA = m.a(objA);
        if (thA != null) {
            hx7.e.n(thA);
        }
        return (w0) (objA instanceof yhm.n ? null : objA);
    }

    public static final pfm.h n(CoroutineContext coroutineContext, Function2 function2) {
        if (coroutineContext.get(g1.f263979a) == null) {
            return new pfm.h(new clm.i(coroutineContext, function2, 0), 0);
        }
        throw new IllegalArgumentException(("Completable context cannot contain job in it. Its lifecycle should be managed via Disposable handle. Had " + coroutineContext).toString());
    }

    public static final void o(View view, Clause clause) {
        SpannableStringBuilder spannableStringBuilderA;
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (clause != null) {
            ty0.c cVarB0 = u.k(view).b0();
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            spannableStringBuilderA = ty0.c.a(cVarB0, clause, context, null, null, null, null, Constants.TAG_FC_SPEED_MODE);
        } else {
            spannableStringBuilderA = null;
        }
        ViewCompat.setAccessibilityPaneTitle(view, spannableStringBuilderA);
    }

    public static final void p(View view, Clause clause) {
        Clause clause2;
        SpannableStringBuilder spannableStringBuilderA;
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (clause != null) {
            ty0.c cVarB0 = u.k(view).b0();
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            clause2 = clause;
            spannableStringBuilderA = ty0.c.a(cVarB0, clause2, context, null, null, null, null, Constants.TAG_FC_SPEED_MODE);
        } else {
            clause2 = clause;
            spannableStringBuilderA = null;
        }
        view.setContentDescription(spannableStringBuilderA);
        view.setTag(R$id.internal_content_description_clause, clause2);
    }

    public static final void q(View view, boolean z) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setImportantForAccessibility(z ? 1 : 2);
    }

    public static final r r(r rVar, Function1 block) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        r rVarDistinctUntilChanged = rVar.switchMap(new s(new tm.a(2, block), 4)).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        return rVarDistinctUntilChanged;
    }

    public static final r s(r rVar, Function1 block) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        r rVarSwitchMap = rVar.switchMap(new v4a.i(14, new v1.m(3, block)));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        return rVarSwitchMap;
    }

    public static final r t(r rVar, Function1 block) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        r rVarSwitchMapSingle = rVar.switchMapSingle(new s(new tm.a(3, block), 5));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMapSingle, "switchMapSingle(...)");
        return rVarSwitchMapSingle;
    }

    public static final AppTheme u(dkg.a aVar, k70.a themeCompatibilityProvider) {
        Object obj2;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(themeCompatibilityProvider, "themeCompatibilityProvider");
        GlobalThemeDeclaration globalThemeDeclaration = aVar.f115516a;
        xjg.m mVar = aVar.f115517b;
        xjg.m mVarL7 = globalThemeDeclaration.getD();
        if (mVarL7 != null) {
            mVar = mVarL7;
        }
        if (mVar == xjg.m.SYSTEM && Build.VERSION.SDK_INT < 29) {
            mVar = xjg.m.DAY;
        }
        xjg.j jVar = aVar.f115518c;
        List listY6 = aVar.f115516a.getF94559b();
        int size = listY6.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj2 = null;
                break;
            }
            obj2 = listY6.get(i);
            if (((ColorThemeOption) obj2).f94564a == xjg.j.DEFAULT) {
                break;
            }
            i++;
        }
        ColorThemeOption colorThemeOption = (ColorThemeOption) obj2;
        if (colorThemeOption != null) {
            listY6 = zhm.u.c(colorThemeOption);
        }
        if (!listY6.isEmpty()) {
            List list = listY6;
            if ((list instanceof Collection) && list.isEmpty()) {
                jVar = ((ColorThemeOption) d0.b0(listY6)).f94564a;
            } else {
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    if (((ColorThemeOption) it8.next()).f94564a == jVar) {
                        break;
                    }
                }
                jVar = ((ColorThemeOption) d0.b0(listY6)).f94564a;
            }
        }
        if (jVar == xjg.j.DYNAMIC && !DynamicColors.isDynamicColorAvailable()) {
            jVar = xjg.j.DEFAULT;
        }
        return new AppTheme(globalThemeDeclaration, mVar, jVar);
    }

    public static final Map v(String str, boolean z) {
        return r0.k(new Pair("BANKING_APP_ACTIVATION_RESPONSE", z ? "APPROVED" : "FAILURE"), new Pair("BANKING_APP_ACTIVATION_CODE", str));
    }

    public static final Map w(String str, boolean z) {
        return r0.k(new Pair("STEP_UP_RESPONSE", z ? "APPROVED" : "FAILURE"), new Pair("STEP_UP_AUTH_CODE", str));
    }

    public static final void x(w0 w0Var, Parcel dest) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        if (w0Var == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeString(w0Var.getClass().getName());
        byte[] byteArray = w0Var.toByteArray();
        dest.writeInt(byteArray.length);
        dest.writeByteArray(byteArray);
    }

    public static ThreadPoolExecutor y() {
        if (f235014a == null) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new e8.a(1));
            f235014a = threadPoolExecutor;
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        }
        return f235014a;
    }
}
