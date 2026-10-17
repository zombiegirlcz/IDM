package n01;

import androidx.compose.foundation.text.ClickableTextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.glance.GlanceModifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class b implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f210843a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f210844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f210845c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ CharSequence f210846g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f210847h;
    public final /* synthetic */ Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f210848j;
    public final /* synthetic */ Object k;

    public /* synthetic */ b(AnnotatedString annotatedString, Modifier modifier, TextStyle textStyle, boolean z, int i, int i2, Function1 function1, Function1 function12, int i3, int i5) {
        this.f210846g = annotatedString;
        this.f210847h = modifier;
        this.i = textStyle;
        this.f210844b = z;
        this.f210845c = i;
        this.d = i2;
        this.f210848j = function1;
        this.k = function12;
        this.e = i3;
        this.f = i5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f210843a) {
            case 0:
                ((Integer) obj3).getClass();
                d.a(this.f210846g, (h) this.f210847h, this.f210845c, (a) this.i, (g) this.f210848j, this.d, this.f210844b, (GlanceModifier) this.k, (Composer) obj2, RecomposeScopeImplKt.updateChangedFlags(this.e | 1), this.f);
                return Unit.f186387a;
            default:
                int iIntValue = ((Integer) obj3).intValue();
                return ClickableTextKt.ClickableText_4YKlhWE$lambda$4((AnnotatedString) this.f210846g, (Modifier) this.f210847h, (TextStyle) this.i, this.f210844b, this.f210845c, this.d, (Function1) this.f210848j, (Function1) this.k, this.e, this.f, (Composer) obj2, iIntValue);
        }
    }

    public /* synthetic */ b(CharSequence charSequence, h hVar, int i, a aVar, g gVar, int i2, boolean z, GlanceModifier glanceModifier, int i3, int i5) {
        this.f210846g = charSequence;
        this.f210847h = hVar;
        this.f210845c = i;
        this.i = aVar;
        this.f210848j = gVar;
        this.d = i2;
        this.f210844b = z;
        this.k = glanceModifier;
        this.e = i3;
        this.f = i5;
    }
}
