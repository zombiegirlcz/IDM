package ip0;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class gr implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f164463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputTextDelegate.Model f164464b;

    public /* synthetic */ gr(InputTextDelegate.Model model, int i) {
        this.f164463a = i;
        this.f164464b = model;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f164463a) {
            case 0:
                CharSequence text = (CharSequence) obj2;
                Intrinsics.checkNotNullParameter(text, "text");
                return new InputTextDelegate.TextData(this.f164464b.f52580a, text);
            default:
                Boolean hasFocus = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(hasFocus, "hasFocus");
                return new aw0.f4(this.f164464b.f52580a, hasFocus.booleanValue());
        }
    }
}
