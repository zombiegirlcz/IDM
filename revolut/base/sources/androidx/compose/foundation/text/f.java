package androidx.compose.foundation.text;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$BooleanRef;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnnotatedString.Range f7123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7124c;
    public final /* synthetic */ Object d;

    public /* synthetic */ f(Object obj2, AnnotatedString.Range range, Object obj3, int i) {
        this.f7122a = i;
        this.f7124c = obj2;
        this.f7123b = range;
        this.d = obj3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f7122a) {
            case 0:
                return TextAnnotatorScope.replaceStyle$lambda$0((Ref$BooleanRef) this.f7124c, this.f7123b, (SpanStyle) this.d, (AnnotatedString.Range) obj2);
            default:
                return TextLinkScope.LinksComposables$lambda$0$5$0((TextLinkScope) this.f7124c, this.f7123b, (LinkStateInteractionSourceObserver) this.d, (TextAnnotatorScope) obj2);
        }
    }
}
