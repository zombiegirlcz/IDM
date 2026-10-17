package dki;

import android.view.View;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.internal.mlkit_vision_text_common.zzot;
import com.google.android.gms.internal.mlkit_vision_text_common.zzou;
import com.google.android.gms.internal.mlkit_vision_text_common.zzow;
import com.google.android.gms.internal.mlkit_vision_text_common.zzru;
import com.google.android.gms.internal.mlkit_vision_text_common.zztr;
import com.google.android.gms.internal.mlkit_vision_text_common.zzub;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuf;
import com.revolut.kompot.navigable.root.RootFlow;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ml.j0;
import ml.k0;
import nl.x0;
import slm.i0;

/* JADX INFO: loaded from: classes10.dex */
public class h implements ke.k, lki.x, igm.g, zzub, tlm.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f115541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f115542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f115543c;

    public /* synthetic */ h(Object obj2, boolean z, int i) {
        this.f115541a = i;
        this.f115543c = obj2;
        this.f115542b = z;
    }

    public static h j() {
        return new h(null, true, 1);
    }

    public static View k(com.revolut.kompot.navigable.a aVar) {
        RootFlow rootFlowE = pd.b.e(aVar);
        com.revolut.kompot.navigable.b bVarE = rootFlowE.L.e(1);
        if (bVarE != null) {
            com.revolut.kompot.navigable.a aVar2 = bVarE.k;
            if (aVar2 != null) {
                return aVar2.D2();
            }
        } else {
            Object obj2 = rootFlowE.K;
            if (obj2 == null) {
                Intrinsics.r("mainControllerContainer");
                throw null;
            }
            if (obj2 instanceof View) {
                return (View) obj2;
            }
        }
        return null;
    }

    public static h z(Object obj2) {
        return new h(obj2, false, 1);
    }

    @Override // ke.k
    public void a(ke.j jVar, int i) {
        StringBuilder sb6 = (StringBuilder) this.f115543c;
        if (this.f115542b) {
            this.f115542b = false;
        } else {
            sb6.append(", ");
        }
        sb6.append(i);
    }

    @Override // igm.g
    public void accept(Object obj2) {
        k0 result = (k0) obj2;
        Intrinsics.checkNotNullParameter(result, "result");
        x0 x0Var = (x0) this.f115543c;
        x0Var.f216962a.exitCurrentScreen();
        if ((result instanceof j0) && this.f115542b) {
            x0Var.f216962a.exitCurrentScreen();
        }
    }

    @Override // tlm.g
    public void b(KClass baseClass, Function1 defaultDeserializerProvider) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(defaultDeserializerProvider, "defaultDeserializerProvider");
    }

    @Override // tlm.g
    public void c(KClass baseClass, Function1 defaultSerializerProvider) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(defaultSerializerProvider, "defaultSerializerProvider");
    }

    @Override // tlm.g
    public void d(KClass baseClass, KClass actualClass, KSerializer actualSerializer) {
        boolean z = this.f115542b;
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(actualClass, "actualClass");
        Intrinsics.checkNotNullParameter(actualSerializer, "actualSerializer");
        SerialDescriptor descriptor = actualSerializer.getDescriptor();
        com.bumptech.glide.d kind = descriptor.getKind();
        if ((kind instanceof olm.d) || Intrinsics.f(kind, olm.i.f226485b)) {
            throw new IllegalArgumentException("Serializer for " + actualClass.m() + " can't be registered as a subclass for polymorphic serialization because its kind " + kind + " is not concrete. To work with multiple hierarchies, register it as a base class.");
        }
        if (z && (Intrinsics.f(kind, olm.k.f226488c) || Intrinsics.f(kind, olm.k.d) || (kind instanceof olm.f) || (kind instanceof olm.j))) {
            throw new IllegalArgumentException("Serializer for " + actualClass.m() + " of kind " + kind + " cannot be serialized polymorphically with class discriminator.");
        }
        if (z) {
            int iC = descriptor.c();
            for (int i = 0; i < iC; i++) {
                String strD = descriptor.d(i);
                if (Intrinsics.f(strD, (String) this.f115543c)) {
                    throw new IllegalArgumentException("Polymorphic serializer for " + actualClass + " has property '" + strD + "' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
                }
            }
        }
    }

    @Override // lki.x
    public void e(View view, View view2, boolean z, lki.z transitionListener) {
        lki.r rVarM;
        lki.x xVar = (lki.x) this.f115543c;
        Intrinsics.checkNotNullParameter(transitionListener, "transitionListener");
        if (z) {
            com.revolut.kompot.navigable.a aVarN = view != null ? com.bumptech.glide.c.n(view) : null;
            xVar.e(view, aVarN != null ? k(aVarN) : null, true, transitionListener);
            return;
        }
        com.revolut.kompot.navigable.a aVarN2 = view2 != null ? com.bumptech.glide.c.n(view2) : null;
        if (view2 != null) {
            View view3 = view2;
            while (view3 != null) {
                rVarM = com.bumptech.glide.c.m(view3);
                if (rVarM != null) {
                    break;
                }
                Object parent = view3.getParent();
                view3 = parent instanceof View ? (View) parent : null;
            }
            rVarM = null;
        } else {
            rVarM = null;
        }
        if (rVarM == null) {
            throw new IllegalStateException("Required value was null.");
        }
        rVarM.f(lki.m.f196466a);
        rVarM.b();
        xVar.e(aVarN2 != null ? k(aVarN2) : null, view2, false, transitionListener);
        if (this.f115542b) {
            xVar.g();
        }
    }

    @Override // lki.x
    public void g() {
        ((lki.x) this.f115543c).g();
    }

    @Override // tlm.g
    public void i(KClass kClass, Function1 provider) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(provider, "provider");
    }

    public Function1 l() {
        return (Function1) this.f115543c;
    }

    public boolean m() {
        return this.f115542b;
    }

    public Object n() {
        return this.f115543c;
    }

    public boolean o() {
        return this.f115542b;
    }

    public void p() {
        this.f115542b = false;
    }

    public void q(byte b4) {
        ((a80.e) this.f115543c).q(String.valueOf(b4));
    }

    public void r(char c2) {
        a80.e eVar = (a80.e) this.f115543c;
        eVar.d(eVar.f1988b, 1);
        char[] cArr = (char[]) eVar.f1989c;
        int i = eVar.f1988b;
        eVar.f1988b = i + 1;
        cArr[i] = c2;
    }

    public void s(int i) {
        ((a80.e) this.f115543c).q(String.valueOf(i));
    }

    public void t(long j2) {
        ((a80.e) this.f115543c).q(String.valueOf(j2));
    }

    public String toString() {
        switch (this.f115541a) {
            case 1:
                return this.f115542b ? "FALL_THROUGH" : String.valueOf(this.f115543c);
            default:
                return super.toString();
        }
    }

    public void u(String v) {
        Intrinsics.checkNotNullParameter(v, "v");
        ((a80.e) this.f115543c).q(v);
    }

    public void v(short s2) {
        ((a80.e) this.f115543c).q(String.valueOf(s2));
    }

    public void w(String text) {
        byte b4;
        Intrinsics.checkNotNullParameter(text, "value");
        a80.e eVar = (a80.e) this.f115543c;
        Intrinsics.checkNotNullParameter(text, "text");
        eVar.d(eVar.f1988b, text.length() + 2);
        char[] cArr = (char[]) eVar.f1989c;
        int i = eVar.f1988b;
        int i2 = i + 1;
        cArr[i] = CoreConstants.DOUBLE_QUOTE_CHAR;
        int length = text.length();
        text.getChars(0, length, cArr, i2);
        int i3 = length + i2;
        int i5 = i2;
        while (i5 < i3) {
            char c2 = cArr[i5];
            byte[] bArr = i0.f264266b;
            if (c2 < bArr.length && bArr[c2] != 0) {
                int length2 = text.length();
                for (int i6 = i5 - i2; i6 < length2; i6++) {
                    eVar.d(i5, 2);
                    char cCharAt = text.charAt(i6);
                    byte[] bArr2 = i0.f264266b;
                    if (cCharAt >= bArr2.length || (b4 = bArr2[cCharAt]) == 0) {
                        int i21 = i5 + 1;
                        ((char[]) eVar.f1989c)[i5] = cCharAt;
                        i5 = i21;
                    } else {
                        if (b4 == 1) {
                            String str = i0.f264265a[cCharAt];
                            Intrinsics.h(str);
                            eVar.d(i5, str.length());
                            str.getChars(0, str.length(), (char[]) eVar.f1989c, i5);
                            int length3 = str.length() + i5;
                            eVar.f1988b = length3;
                            i5 = length3;
                        } else {
                            char[] cArr2 = (char[]) eVar.f1989c;
                            cArr2[i5] = CoreConstants.ESCAPE_CHAR;
                            cArr2[i5 + 1] = (char) b4;
                            i5 += 2;
                            eVar.f1988b = i5;
                        }
                    }
                }
                eVar.d(i5, 1);
                ((char[]) eVar.f1989c)[i5] = CoreConstants.DOUBLE_QUOTE_CHAR;
                eVar.f1988b = i5 + 1;
                return;
            }
            i5++;
        }
        cArr[i3] = CoreConstants.DOUBLE_QUOTE_CHAR;
        eVar.f1988b = i3 + 1;
    }

    public void x() {
    }

    public void y() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzub
    public zztr zza() {
        zzow zzowVar = new zzow();
        zzot zzotVar = this.f115542b ? zzot.TYPE_THICK : zzot.TYPE_THIN;
        zzou zzouVar = (zzou) this.f115543c;
        zzowVar.zze(zzotVar);
        zzru zzruVar = new zzru();
        zzruVar.zzb(zzouVar);
        zzowVar.zzg(zzruVar.zzc());
        return zzuf.zzf(zzowVar);
    }

    public /* synthetic */ h(boolean z, zzou zzouVar) {
        this.f115541a = 6;
        this.f115542b = z;
        this.f115543c = zzouVar;
    }

    public h(koi.h adapter) {
        this.f115541a = 2;
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.f115543c = adapter;
    }

    public h(rlm.h configuration) {
        this.f115541a = 8;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f115543c = configuration.f255107g;
        this.f115542b = configuration.f255109j != rlm.a.NONE;
    }

    public h(a80.e writer) {
        this.f115541a = 7;
        Intrinsics.checkNotNullParameter(writer, "writer");
        this.f115543c = writer;
        this.f115542b = true;
    }

    public h(lki.x transition, boolean z) {
        this.f115541a = 4;
        Intrinsics.checkNotNullParameter(transition, "transition");
        this.f115543c = transition;
        this.f115542b = z;
    }

    public h(Function1 condition, boolean z) {
        this.f115541a = 0;
        Intrinsics.checkNotNullParameter(condition, "condition");
        this.f115541a = 0;
        this.f115542b = z;
        this.f115543c = condition;
    }

    public h(StringBuilder sb6) {
        this.f115541a = 3;
        this.f115543c = sb6;
        this.f115542b = true;
    }
}
