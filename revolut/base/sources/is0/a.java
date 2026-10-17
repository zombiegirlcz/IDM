package is0;

import android.graphics.Typeface;
import android.widget.TextView;
import aw0.i3;
import fc0.e;
import hsa.l;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import or0.u;
import skm.e0;

/* JADX INFO: loaded from: classes19.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f168076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Typeface f168077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i3 f168078c;

    public a(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "textView");
        this.f168076a = textView;
    }

    public final void a(i3 customFont) {
        this.f168078c = customFont;
        TextView textView = this.f168076a;
        if (customFont == null) {
            textView.setTypeface(this.f168077b);
            return;
        }
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        i01.b bVarD0 = u.k(textView).d0();
        l onSuccess = new l(ref$BooleanRef, 26, this, customFont);
        a2.a onError = new a2.a(ref$BooleanRef, 23, this, customFont);
        bVarD0.getClass();
        Intrinsics.checkNotNullParameter(customFont, "customFont");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        e0.C(bVarD0.f157277c, null, null, new e(7, customFont, bVarD0, onSuccess, onError, (Continuation) null), 3);
        if (ref$BooleanRef.f186407a) {
            return;
        }
        textView.setTypeface(this.f168077b);
    }
}
