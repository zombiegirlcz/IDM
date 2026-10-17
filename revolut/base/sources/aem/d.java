package aem;

import android.util.Size;
import com.fourthline.core.internal.ExtensionsKt;
import com.fourthline.core.internal.TryKt;
import com.fourthline.core.location.internal.LocationFetcherImpl;
import com.fourthline.vision.internal.d9;
import com.fourthline.vision.internal.e3;
import com.fourthline.vision.internal.h6;
import com.fourthline.vision.internal.i3;
import com.fourthline.vision.internal.l9;
import com.fourthline.vision.internal.o6;
import com.fourthline.vision.internal.p6;
import com.fourthline.vision.internal.r5;
import com.fourthline.vision.internal.u2;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3705a;

    public /* synthetic */ d(int i) {
        this.f3705a = i;
    }

    /* JADX WARN: Type inference failed for: r0v53, types: [gim.i, kotlin.jvm.functions.Function2] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f3705a) {
            case 0:
                bem.b createClientPlugin = (bem.b) obj2;
                Intrinsics.checkNotNullParameter(createClientPlugin, "$this$createClientPlugin");
                createClientPlugin.a(b.f3692c, new e(3, (Continuation) null));
                createClientPlugin.a(b.f3691b, new f(2, null));
                return Unit.f186387a;
            case 1:
                y HttpResponseValidator = (y) obj2;
                Intrinsics.checkNotNullParameter(HttpResponseValidator, "$this$HttpResponseValidator");
                HttpResponseValidator.f3797c = false;
                l block = new l(2, null);
                Intrinsics.checkNotNullParameter(block, "block");
                HttpResponseValidator.f3795a.add(block);
                return Unit.f186387a;
            case 2:
                bem.b createClientPlugin2 = (bem.b) obj2;
                Intrinsics.checkNotNullParameter(createClientPlugin2, "$this$createClientPlugin");
                createClientPlugin2.f14873a.f288081g.f(hem.b.f, new a(3, null));
                return Unit.f186387a;
            case 3:
                bem.b createClientPlugin3 = (bem.b) obj2;
                Intrinsics.checkNotNullParameter(createClientPlugin3, "$this$createClientPlugin");
                ((g1) createClientPlugin3.f14874b).getClass();
                x.a().warn("The SaveBodyPlugin plugin is deprecated and can be safely removed. Request bodies are now saved in memory by default for all non-streaming responses.");
                return Unit.f186387a;
            case 4:
                bem.b createClientPlugin4 = (bem.b) obj2;
                Intrinsics.checkNotNullParameter(createClientPlugin4, "$this$createClientPlugin");
                List listI0 = zhm.d0.I0(((y) createClientPlugin4.f14874b).f3795a);
                y yVar = (y) createClientPlugin4.f14874b;
                List listI02 = zhm.d0.I0(yVar.f3796b);
                Continuation continuation = null;
                createClientPlugin4.a(bem.h.d, new b0(yVar.f3797c, null));
                createClientPlugin4.a(bem.h.f14887c, new c0(listI0, continuation, 0));
                createClientPlugin4.a(b.f, new d0(listI02, 0, continuation));
                createClientPlugin4.a(b.d, new d0(listI02, 1, continuation));
                return Unit.f186387a;
            case 5:
                bem.b createClientPlugin5 = (bem.b) obj2;
                Intrinsics.checkNotNullParameter(createClientPlugin5, "$this$createClientPlugin");
                List<Pair> listP0 = zhm.d0.P0(zhm.t0.C(((k0) createClientPlugin5.f14874b).f3740b), new o0(1));
                k0 k0Var = (k0) createClientPlugin5.f14874b;
                Charset charset = k0Var.f3741c;
                LinkedHashSet linkedHashSet = k0Var.f3739a;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : linkedHashSet) {
                    if (!k0Var.f3740b.containsKey((Charset) obj3)) {
                        arrayList.add(obj3);
                    }
                }
                List<Charset> listP02 = zhm.d0.P0(arrayList, new o0(0));
                StringBuilder sb6 = new StringBuilder();
                for (Charset charset2 : listP02) {
                    if (sb6.length() > 0) {
                        sb6.append(",");
                    }
                    sb6.append(a1m.e.w(charset2));
                }
                for (Pair pair : listP0) {
                    Charset charset3 = (Charset) pair.f186385a;
                    float fFloatValue = ((Number) pair.f186386b).floatValue();
                    if (sb6.length() > 0) {
                        sb6.append(",");
                    }
                    double d = fFloatValue;
                    if (0.0d > d || d > 1.0d) {
                        throw new IllegalStateException("Check failed.");
                    }
                    sb6.append(a1m.e.w(charset3) + ";q=" + (((double) rim.d.c(100 * fFloatValue)) / 100.0d));
                }
                if (sb6.length() == 0) {
                    sb6.append(a1m.e.w(charset));
                }
                String string = sb6.toString();
                Charset charset4 = (Charset) zhm.d0.d0(listP02);
                if (charset4 == null) {
                    Pair pair2 = (Pair) zhm.d0.d0(listP0);
                    charset4 = pair2 != null ? (Charset) pair2.f186385a : null;
                    if (charset4 == null) {
                        charset4 = Charsets.UTF_8;
                    }
                }
                createClientPlugin5.a(b.e, new m0(string, charset4, null));
                n0 block2 = new n0(charset, null);
                Intrinsics.checkNotNullParameter(block2, "block");
                createClientPlugin5.a(bem.h.e, block2);
                return Unit.f186387a;
            case 6:
                bem.b createClientPlugin6 = (bem.b) obj2;
                Intrinsics.checkNotNullParameter(createClientPlugin6, "$this$createClientPlugin");
                ((q0) createClientPlugin6.f14874b).getClass();
                ((q0) createClientPlugin6.f14874b).getClass();
                createClientPlugin6.a(bem.h.f14887c, new a(createClientPlugin6, null, 2));
                return Unit.f186387a;
            case 7:
                bem.b createClientPlugin7 = (bem.b) obj2;
                Intrinsics.checkNotNullParameter(createClientPlugin7, "$this$createClientPlugin");
                createClientPlugin7.a(b.f3693g, new c0(createClientPlugin7, null, 1));
                return Unit.f186387a;
            case 8:
                bem.b createClientPlugin8 = (bem.b) obj2;
                Intrinsics.checkNotNullParameter(createClientPlugin8, "$this$createClientPlugin");
                b1 b1Var = (b1) createClientPlugin8.f14874b;
                createClientPlugin8.a(bem.h.f14887c, new d1(b1Var.f3695a, b1Var.f3696b, b1Var.f3697c, null));
                return Unit.f186387a;
            case 9:
                bem.b createClientPlugin9 = (bem.b) obj2;
                Intrinsics.checkNotNullParameter(createClientPlugin9, "$this$createClientPlugin");
                l1 block3 = new l1(((j1) createClientPlugin9.f14874b).f3737a, null);
                Intrinsics.checkNotNullParameter(block3, "block");
                createClientPlugin9.a(bem.h.f14886b, block3);
                return Unit.f186387a;
            case 10:
                bem.b createClientPlugin10 = (bem.b) obj2;
                Intrinsics.checkNotNullParameter(createClientPlugin10, "$this$createClientPlugin");
                createClientPlugin10.a(cem.b.f23508a, new cem.g(createClientPlugin10, ((cem.d) createClientPlugin10.f14874b).f23509a, null));
                return Unit.f186387a;
            case 11:
                return ExtensionsKt.a(((Byte) obj2).byteValue());
            case 12:
                return TryKt.a((Throwable) obj2);
            case 13:
                return LocationFetcherImpl.a((Void) obj2);
            case 14:
                return Boolean.valueOf(d9._init_$lambda$0((com.google.mlkit.vision.text.a) obj2));
            case 15:
                return com.fourthline.vision.internal.i0.CameraPreviewContent$lambda$0$0((com.fourthline.vision.internal.l0) obj2);
            case 16:
                return com.fourthline.vision.internal.i0.CameraPreview$lambda$0$0((com.fourthline.vision.internal.l0) obj2);
            case 17:
                return i3.toText$lambda$0((e3.a) obj2);
            case 18:
                return l9.detect$lambda$0((e3.c) obj2);
            case 19:
                return o6.process$lambda$0((h6) obj2);
            case 20:
                return Float.valueOf(o6.process$lambda$2((Pair) obj2));
            case 21:
                return Boolean.valueOf(o6.process$lambda$3(((Float) obj2).floatValue()));
            case 22:
                return o6.process$lambda$4(((Float) obj2).floatValue());
            case 23:
                return p6.process$lambda$0((h6) obj2);
            case 24:
                return Float.valueOf(p6.process$lambda$2((Pair) obj2));
            case 25:
                return Boolean.valueOf(p6.process$lambda$3(((Float) obj2).floatValue()));
            case 26:
                return p6.process$lambda$4(((Float) obj2).floatValue());
            case 27:
                return com.fourthline.vision.internal.t.collect$lambda$1((Size) obj2);
            case 28:
                return com.fourthline.vision.internal.t.collect$lambda$2((Size) obj2);
            default:
                return u2.onSuccess$lambda$0((r5.b) obj2);
        }
    }

    public /* synthetic */ d(vdm.e eVar) {
        this.f3705a = 1;
    }
}
