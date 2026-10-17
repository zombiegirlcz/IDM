package do3;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.provider.Settings;
import android.util.Base64;
import android.view.ContextThemeWrapper;
import androidx.exifinterface.media.ExifInterface;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.store.api.model.StoreExclusivesFiltersResponse;
import com.revolut.feature.store.api.model.StoreOfferFilter;
import com.revolut.retail.feature.analytics.models.income_sorter.IncomeSorterDestination;
import com.revolut.retail.feature.analytics.models.income_sorter.IncomeSorterDestinationId;
import com.revolut.retail.feature.esim.api.model.EsimGiftRecipient;
import com.revolut.retail.feature.esim.api.model.EsimProfileApn;
import d9.e1;
import f2e.b1;
import f2e.t3;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.function.BiFunction;
import kl7.g1;
import kl7.n2;
import kl7.o1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.t0;
import kotlin.text.d0;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import nkm.y;
import ntj.x;
import skm.e0;
import skm.e2;
import skm.l2;
import skm.z0;
import vkm.v1;
import zhm.a0;
import zhm.f0;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public abstract class q {
    public static final String A(Bitmap bitmap) throws IOException {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            String strEncodeToString = Base64.encodeToString(byteArray, 2);
            Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(...)");
            return strEncodeToString;
        } finally {
        }
    }

    public static final StoreExclusivesFiltersResponse B(b1 b1Var) {
        Intrinsics.checkNotNullParameter(b1Var, "<this>");
        List<t3> list = b1Var.f131543a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (t3 t3Var : list) {
            arrayList.add(new StoreOfferFilter(t3Var.f131716a, t3Var.f131717b));
        }
        return new StoreExclusivesFiltersResponse(arrayList);
    }

    public static final d0j.q C(x xVar) {
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        boolean z = xVar.f219140a;
        List list = xVar.f219141b;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(e1.U((ntj.r) it8.next()));
        }
        return new d0j.q(null, arrayList, z);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v0 i56.e, still in use, count: 3, list:
          (r2v0 i56.e) from 0x00a8: MOVE (r16v0 i56.e) = (r2v0 i56.e)
          (r2v0 i56.e) from 0x009f: MOVE (r16v2 i56.e) = (r2v0 i56.e)
          (r2v0 i56.e) from 0x008c: MOVE (r16v4 i56.e) = (r2v0 i56.e)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    public static final i56.e D(d56.o r17) {
        /*
            r0 = r17
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            i56.e r2 = new i56.e
            java.lang.String r3 = r0.f111385a
            com.revolut.feature.defi.common.models.dto.b r4 = r0.f111386b
            com.revolut.feature.defi.common.models.domain.DeFiAssetAmount r4 = hx7.e.s(r4)
            c36.n r5 = r0.f111387c
            com.revolut.feature.defi.common.models.domain.DeFiFiatAmount r5 = i26.l.u(r5)
            com.revolut.feature.defi.common.models.dto.b r6 = r0.d
            com.revolut.feature.defi.common.models.domain.DeFiAssetAmount r6 = hx7.e.s(r6)
            c36.n r7 = r0.e
            com.revolut.feature.defi.common.models.domain.DeFiFiatAmount r7 = i26.l.u(r7)
            c36.q r8 = r0.f
            com.revolut.feature.defi.common.models.domain.DeFiRate r8 = i2b.a.v(r8)
            java.lang.String r9 = r0.f111388g
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
            b36.d[] r1 = b36.d.values()
            int r10 = r1.length
            r11 = 0
        L34:
            r12 = 0
            if (r11 >= r10) goto L48
            r13 = r1[r11]
            java.lang.String r14 = r13.name()
            r15 = 1
            boolean r14 = kotlin.text.a0.z(r14, r9, r15)
            if (r14 == 0) goto L45
            goto L49
        L45:
            int r11 = r11 + 1
            goto L34
        L48:
            r13 = r12
        L49:
            if (r13 != 0) goto L5e
            zhm.h0 r1 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r10 = rd0.d.f253311a
            rd0.c r10 = rd0.c.ERROR
            java.lang.String r11 = "Unrecognised DeFi operation side value: "
            java.lang.String r9 = j6.a.q(r11, r9)
            java.lang.String r11 = "DeFiOperationSideMapper"
            rd0.d.a(r10, r11, r9, r12, r1)
            b36.d r13 = b36.d.UNKNOWN
        L5e:
            r9 = r13
            c36.k r1 = r0.f111389h
            com.revolut.feature.defi.common.models.domain.DeFiFee r10 = hx7.q.c0(r1)
            d56.n r1 = r0.i
            if (r1 == 0) goto La8
            i56.d r11 = new i56.d
            d56.m r13 = r1.f111382a
            if (r13 == 0) goto L83
            i56.c r14 = new i56.c
            java.lang.String r15 = r13.f111379a
            c36.q r12 = r13.f111380b
            com.revolut.feature.defi.common.models.domain.DeFiRate r12 = i2b.a.v(r12)
            c36.q r13 = r13.f111381c
            com.revolut.feature.defi.common.models.domain.DeFiRate r13 = i2b.a.v(r13)
            r14.<init>(r15, r12, r13)
            goto L84
        L83:
            r14 = 0
        L84:
            d56.j r12 = r1.f111383b
            if (r12 == 0) goto L9f
            i56.b r13 = new i56.b
            java.lang.String r15 = r12.f111375a
            r16 = r2
            com.revolut.feature.defi.common.models.dto.d r2 = r12.f111376b
            com.revolut.feature.defi.common.models.domain.DeFiAssetAmountWithFiat r2 = hx7.i.G(r2)
            com.revolut.feature.defi.common.models.dto.b r12 = r12.f111377c
            com.revolut.feature.defi.common.models.domain.DeFiAssetAmount r12 = hx7.e.s(r12)
            r13.<init>(r15, r2, r12)
            r12 = r13
            goto La2
        L9f:
            r16 = r2
            r12 = 0
        La2:
            java.lang.Boolean r1 = r1.f111384c
            r11.<init>(r14, r12, r1)
            goto Lab
        La8:
            r16 = r2
            r11 = 0
        Lab:
            long r1 = r0.f111390j
            java.time.Instant r12 = java.time.Instant.ofEpochMilli(r1)
            java.lang.String r1 = "ofEpochMilli(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r1)
            java.lang.String r13 = r0.k
            r2 = r16
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: do3.q.D(d56.o):i56.e");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList] */
    public static final z3l.a E(a4l.b bVar) {
        ?? arrayList;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        List listA = bVar.getTaxesBreakdownDto();
        if (listA != null) {
            List<a4l.a> list = listA;
            arrayList = new ArrayList(w.t(list, 10));
            for (a4l.a aVar : list) {
                arrayList.add(new z3l.b(mo3.a.o(aVar.getValue()), aVar.getType(), aVar.getTitle(), aVar.getShortDescription(), aVar.getDescription()));
            }
        } else {
            arrayList = f0.f322471a;
        }
        return new z3l.a(arrayList, mo3.a.o(bVar.getTotal()));
    }

    public static final x F(d0j.q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        boolean z = qVar.f110425a;
        ArrayList arrayList = qVar.f110426b;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(e1.Y((d0j.h) it8.next()));
        }
        return new x(arrayList2, z);
    }

    public static final kej.a G(EsimProfileApn esimProfileApn) {
        Intrinsics.checkNotNullParameter(esimProfileApn, "<this>");
        String str = esimProfileApn.f100429a;
        String str2 = esimProfileApn.f100430b;
        String str3 = esimProfileApn.f100431c;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = esimProfileApn.d;
        if (str4 == null) {
            str4 = "";
        }
        String str5 = esimProfileApn.e;
        if (str5 == null) {
            str5 = "";
        }
        String str6 = esimProfileApn.f;
        if (str6 == null) {
            str6 = "";
        }
        String str7 = esimProfileApn.f100432g;
        return new kej.a(str, str2, str3, str4, str5, str6, str7 == null ? "" : str7);
    }

    public static final byte[] H(Bitmap bitmap) throws IOException {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            Intrinsics.checkNotNullExpressionValue(byteArray, "use(...)");
            return byteArray;
        } finally {
        }
    }

    public static final Bitmap I(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        return o80.a.a(bitmap, 1.0f);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final Object J(Continuation frame) {
        Object obj2;
        CoroutineContext context = frame.getContext();
        e0.p(context);
        Continuation continuationB = fim.h.b(frame);
        zkm.f fVar = continuationB instanceof zkm.f ? (zkm.f) continuationB : null;
        if (fVar == null) {
            obj2 = Unit.f186387a;
        } else {
            CoroutineDispatcher coroutineDispatcher = fVar.d;
            if (zkm.g.e(coroutineDispatcher, context)) {
                fVar.f = Unit.f186387a;
                fVar.f263995c = 1;
                coroutineDispatcher.dispatchYield(context, fVar);
            } else {
                l2 l2Var = new l2(l2.f263992c);
                CoroutineContext coroutineContextPlus = context.plus(l2Var);
                Unit unit = Unit.f186387a;
                fVar.f = unit;
                fVar.f263995c = 1;
                coroutineDispatcher.dispatchYield(coroutineContextPlus, fVar);
                if (l2Var.f263993b) {
                    z0 z0VarA = e2.a();
                    ArrayDeque arrayDeque = z0VarA.d;
                    if (arrayDeque != null ? arrayDeque.isEmpty() : true) {
                        obj2 = Unit.f186387a;
                    } else {
                        if (z0VarA.f264022b >= 4294967296L) {
                            fVar.f = unit;
                            fVar.f263995c = 1;
                            z0VarA.q(fVar);
                            obj2 = fim.a.COROUTINE_SUSPENDED;
                        } else {
                            z0VarA.v(true);
                            try {
                                fVar.run();
                                do {
                                } while (z0VarA.x());
                            } finally {
                                try {
                                } finally {
                                }
                            }
                            obj2 = Unit.f186387a;
                        }
                    }
                }
            }
            obj2 = fim.a.COROUTINE_SUSPENDED;
        }
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (obj2 == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return obj2 == aVar ? obj2 : Unit.f186387a;
    }

    public static final void a(Activity activity, int i, boolean z) {
        int iY;
        if (!z || (iY = kli.a.y(new ContextThemeWrapper(activity, i), R$attr.internal_colorsThemeOverlayContrast, -1)) == -1) {
            return;
        }
        activity.getTheme().applyStyle(iY, true);
    }

    public static final String b(String str) {
        return j6.a.q("RETAIL_RESTAURANTS_RESERVATION_", str);
    }

    public static final String c(String str) {
        return j6.a.q("RETAIL_RESTAURANTS_RESERVATION_PAGE_", str);
    }

    public static final String d(String str, Long l2, Long l3) {
        if (str == null || d0.W(str)) {
            m70.a.c(t0.f186434a);
            return "";
        }
        StringBuilder sbS = p.a.s(str);
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        ref$BooleanRef.f186407a = d0.J(str, "?", false);
        if (l2 != null) {
            e(sbS, ref$BooleanRef, "amount", l2.longValue());
        }
        if (l3 != null) {
            e(sbS, ref$BooleanRef, "duration", l3.longValue());
        }
        return sbS.toString();
    }

    public static final void e(StringBuilder sb6, Ref$BooleanRef ref$BooleanRef, String str, long j2) {
        Object[] value = {ref$BooleanRef.f186407a ? "&" : "?", str, "=", Long.valueOf(j2)};
        Intrinsics.checkNotNullParameter(sb6, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        for (int i = 0; i < 4; i++) {
            sb6.append(value[i]);
        }
        ref$BooleanRef.f186407a = true;
    }

    public static final qe0.o f(x4l.c cVar, CoroutineScope appCoroutineScope) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(appCoroutineScope, "appCoroutineScope");
        return new qe0.o(cVar, appCoroutineScope);
    }

    public static final Bitmap g(Bitmap bitmap, String path) {
        Integer numValueOf;
        Bitmap bitmap2;
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        Intrinsics.checkNotNullParameter(path, "src");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(path, "src");
        Bitmap bitmap3 = null;
        try {
            Intrinsics.checkNotNullParameter(path, "path");
            numValueOf = Integer.valueOf(new ExifInterface(path).getAttributeInt("Orientation", 1));
        } catch (Exception e) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : 1;
        if (iIntValue == 1) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        switch (iIntValue) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                break;
            case 3:
                matrix.setRotate(180.0f);
                break;
            case 4:
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 5:
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 6:
                matrix.setRotate(90.0f);
                break;
            case 7:
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 8:
                matrix.setRotate(-90.0f);
                break;
            default:
                return bitmap;
        }
        try {
            bitmap2 = bitmap;
        } catch (Exception e2) {
            e = e2;
            bitmap2 = bitmap;
        }
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap2, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
            bitmap2.recycle();
            bitmap3 = bitmapCreateBitmap;
        } catch (Exception e4) {
            e = e4;
            Exception exc2 = e;
            h0 h0Var2 = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, exc2, h0Var2);
        }
        return bitmap3 == null ? bitmap2 : bitmap3;
    }

    public static final Object h(CompletableFuture completableFuture, gim.i frame) throws Throwable {
        CompletableFuture completableFuture2 = completableFuture.toCompletableFuture();
        if (completableFuture2.isDone()) {
            try {
                return completableFuture2.get();
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                if (cause == null) {
                    throw e;
                }
                throw cause;
            }
        }
        skm.l lVar = new skm.l(1, fim.h.b(frame));
        lVar.u();
        xkm.a aVar = new xkm.a();
        aVar.cont = lVar;
        completableFuture.handle((BiFunction) aVar);
        lVar.r(new nyb.q(completableFuture2, aVar, 29));
        Object objT = lVar.t();
        if (objT == fim.a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objT;
    }

    public static final ArrayList i(ArrayList arrayList) {
        ArrayList arrayListS = t61.a.s("<this>", arrayList);
        for (Object obj2 : arrayList) {
            IncomeSorterDestinationId incomeSorterDestinationId = ((IncomeSorterDestination) obj2).f99167b;
            if ((incomeSorterDestinationId instanceof IncomeSorterDestinationId.PeerToPeer) || (incomeSorterDestinationId instanceof IncomeSorterDestinationId.Beneficiary)) {
                arrayListS.add(obj2);
            }
        }
        return arrayListS;
    }

    public static final ArrayList j(List list, boolean z, xi0.b targetCurrency) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            a0.x(((he3.h) it8.next()).a(targetCurrency, z), arrayList);
        }
        return arrayList;
    }

    public static final String k(n nVar) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        return nVar.f116414l;
    }

    public static final o1 l(g1 g1Var, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(g1Var, "<this>");
        Intrinsics.checkNotNullParameter(g1Var, "<this>");
        n2 n2Var = z ? g1Var.e : g1Var.d;
        if (z3) {
            if (n2Var != null) {
                return n2Var.f185366c;
            }
            return null;
        }
        if (n2Var != null) {
            return n2Var.f185365b;
        }
        return null;
    }

    public static final Field m(Class cls, String... fieldNames) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        Intrinsics.checkNotNullParameter(fieldNames, "fieldNames");
        nkm.d0 d0VarX = y.x(kotlin.collections.d.E(fieldNames), new a35.o(cls, 1));
        Iterator it8 = d0VarX.f216835a.iterator();
        while (it8.hasNext()) {
            Field field = (Field) d0VarX.f216836b.invoke(it8.next());
            if (field != null) {
                return field;
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    public static final String n(EsimGiftRecipient esimGiftRecipient) {
        Intrinsics.checkNotNullParameter(esimGiftRecipient, "<this>");
        return com.google.android.gms.internal.mlkit_vision_face.a.o(esimGiftRecipient.d, " ", esimGiftRecipient.e);
    }

    public static final Float o(Context context, String name) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        try {
            return Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), name));
        } catch (Settings.SettingNotFoundException unused) {
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.b(rd0.c.DEBUG, "SettingsExt", "Unable to get float value for setting ".concat(name), null, null, 16);
            return null;
        }
    }

    public static final String p(Context context, String name) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        return Settings.Global.getString(context.getContentResolver(), name);
    }

    public static final String q(Context context, String name) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        return Settings.Secure.getString(context.getContentResolver(), name);
    }

    public static final Pair r(a6f.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        if (fVar instanceof a6f.e) {
            return new Pair(0, Integer.valueOf(((a6f.e) fVar).f1672a));
        }
        if (fVar instanceof a6f.c) {
            a6f.c cVar = (a6f.c) fVar;
            return new Pair(Integer.valueOf(cVar.f1669a), Integer.valueOf(cVar.f1670b));
        }
        if (Intrinsics.f(fVar, a6f.d.f1671a)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String s(Context context, String name) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        return Settings.System.getString(context.getContentResolver(), name);
    }

    public static final Object t(yji.l lVar, Function1 function1, Continuation continuation) {
        return vkm.q.x(w(new v1(new iji.d(7, (Continuation) null, function1)), lVar), continuation);
    }

    public static final Object u(yji.n controllerModelExtension, Function1 function1, Continuation continuation) {
        v1 v1Var = new v1(new iji.d(8, (Continuation) null, function1));
        Intrinsics.checkNotNullParameter(v1Var, "<this>");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        return vkm.q.x(v(v1Var, controllerModelExtension.r2()), continuation);
    }

    public static final Flow v(Flow flow, aii.o oVar) {
        aii.n nVarM0 = oVar.M0(new zhi.a(flow));
        Continuation continuation = null;
        zhi.b bVar = nVarM0 instanceof zhi.b ? (zhi.b) nVarM0 : null;
        if (bVar != null) {
            return new vkm.y(new hd2.b(2, 9, continuation), bVar.f322424a);
        }
        return flow;
    }

    public static final Flow w(Flow flow, yji.l controllerModel) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(controllerModel, "controllerModel");
        return v(flow, controllerModel.l1());
    }

    public static final Address x(n nVar) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        Address address = nVar.k;
        if (address != null) {
            return address;
        }
        throw new IllegalStateException("profile address can't be null");
    }

    public static final wi0.b y(n nVar) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        Address address = nVar.k;
        if (address != null) {
            return nz8.d.g(address);
        }
        throw new IllegalStateException("profile home country can't be null");
    }

    public static final dj0.d z(List list, xi0.b baseCurrency) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        Iterator it8 = list.iterator();
        long j2 = 0;
        while (it8.hasNext()) {
            dj0.d dVar = ((m71.a) it8.next()).f203278a;
            j2 += dVar != null ? dVar.f115082a : 0L;
        }
        return new dj0.d(j2, baseCurrency);
    }
}
