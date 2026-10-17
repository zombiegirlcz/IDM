package v1;

import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class p0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f285083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnnotatedString f285084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Modifier f285085c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ FontStyle f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ FontWeight f285086g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ FontFamily f285087h;
    public final /* synthetic */ long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ TextDecoration f285088j;
    public final /* synthetic */ TextAlign k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f285089l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f285090m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f285091n;
    public final /* synthetic */ int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f285092p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Map f285093q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Function1 f285094r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ TextStyle f285095s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f285096t;
    public final /* synthetic */ int u;
    public final /* synthetic */ int v;

    public /* synthetic */ p0(AnnotatedString annotatedString, Modifier modifier, long j2, long j3, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j5, TextDecoration textDecoration, TextAlign textAlign, long j16, int i, boolean z, int i2, int i3, Map map, Function1 function1, TextStyle textStyle, int i5, int i6, int i21, int i22) {
        this.f285083a = i22;
        this.f285084b = annotatedString;
        this.f285085c = modifier;
        this.d = j2;
        this.e = j3;
        this.f = fontStyle;
        this.f285086g = fontWeight;
        this.f285087h = fontFamily;
        this.i = j5;
        this.f285088j = textDecoration;
        this.k = textAlign;
        this.f285089l = j16;
        this.f285090m = i;
        this.f285091n = z;
        this.o = i2;
        this.f285092p = i3;
        this.f285093q = map;
        this.f285094r = function1;
        this.f285095s = textStyle;
        this.f285096t = i5;
        this.u = i6;
        this.v = i21;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        switch (this.f285083a) {
            case 0:
                return TextKt.Text_IbK3jfQ$lambda$3(this.f285084b, this.f285085c, this.d, this.e, this.f, this.f285086g, this.f285087h, this.i, this.f285088j, this.k, this.f285089l, this.f285090m, this.f285091n, this.o, this.f285092p, this.f285093q, this.f285094r, this.f285095s, this.f285096t, this.u, this.v, composer, ((Integer) obj3).intValue());
            default:
                return androidx.compose.material3.TextKt.Text_Z58ophY$lambda$8(this.f285084b, this.f285085c, this.d, null, this.e, this.f, this.f285086g, this.f285087h, this.i, this.f285088j, this.k, this.f285089l, this.f285090m, this.f285091n, this.o, this.f285092p, this.f285093q, this.f285094r, this.f285095s, this.f285096t, this.u, this.v, composer, ((Integer) obj3).intValue());
        }
    }
}
