package v1;

import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class q0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f285101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f285102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Modifier f285103c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ FontStyle f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ FontWeight f285104g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ FontFamily f285105h;
    public final /* synthetic */ long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ TextDecoration f285106j;
    public final /* synthetic */ TextAlign k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f285107l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f285108m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f285109n;
    public final /* synthetic */ int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f285110p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Function1 f285111q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ TextStyle f285112r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f285113s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f285114t;
    public final /* synthetic */ int u;

    public /* synthetic */ q0(String str, Modifier modifier, long j2, long j3, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j5, TextDecoration textDecoration, TextAlign textAlign, long j16, int i, boolean z, int i2, int i3, Function1 function1, TextStyle textStyle, int i5, int i6, int i21, int i22) {
        this.f285101a = i22;
        this.f285102b = str;
        this.f285103c = modifier;
        this.d = j2;
        this.e = j3;
        this.f = fontStyle;
        this.f285104g = fontWeight;
        this.f285105h = fontFamily;
        this.i = j5;
        this.f285106j = textDecoration;
        this.k = textAlign;
        this.f285107l = j16;
        this.f285108m = i;
        this.f285109n = z;
        this.o = i2;
        this.f285110p = i3;
        this.f285111q = function1;
        this.f285112r = textStyle;
        this.f285113s = i5;
        this.f285114t = i6;
        this.u = i21;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        switch (this.f285101a) {
            case 0:
                return TextKt.Text__4IGK_g$lambda$1(this.f285102b, this.f285103c, this.d, this.e, this.f, this.f285104g, this.f285105h, this.i, this.f285106j, this.k, this.f285107l, this.f285108m, this.f285109n, this.o, this.f285110p, this.f285111q, this.f285112r, this.f285113s, this.f285114t, this.u, composer, ((Integer) obj3).intValue());
            case 1:
                return androidx.compose.material3.TextKt.Text__4IGK_g$lambda$9(this.f285102b, this.f285103c, this.d, this.e, this.f, this.f285104g, this.f285105h, this.i, this.f285106j, this.k, this.f285107l, this.f285108m, this.f285109n, this.o, this.f285110p, this.f285111q, this.f285112r, this.f285113s, this.f285114t, this.u, composer, ((Integer) obj3).intValue());
            default:
                return androidx.compose.material3.TextKt.Text_Nvy7gAk$lambda$2(this.f285102b, this.f285103c, this.d, null, this.e, this.f, this.f285104g, this.f285105h, this.i, this.f285106j, this.k, this.f285107l, this.f285108m, this.f285109n, this.o, this.f285110p, this.f285111q, this.f285112r, this.f285113s, this.f285114t, this.u, composer, ((Integer) obj3).intValue());
        }
    }
}
