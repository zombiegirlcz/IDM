package jb9;

import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class k extends q implements Function1 {
    public static final k f = new k();

    public k() {
        super(1, ge9.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/passcode/databinding/FeatureScreenPasscodeBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ge9.a.a(p0);
    }
}
