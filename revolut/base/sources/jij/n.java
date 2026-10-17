package jij;

import android.content.Context;
import com.revolut.core.ui_kit.internal.views.switcher_button.SwitcherButtonView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class n extends kotlin.jvm.internal.a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f174587a = new n();

    public n() {
        super(1, SwitcherButtonView.class, "<init>", "<init>(Landroid/content/Context;Landroid/util/AttributeSet;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Context p0 = (Context) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return new SwitcherButtonView(p0, null);
    }
}
