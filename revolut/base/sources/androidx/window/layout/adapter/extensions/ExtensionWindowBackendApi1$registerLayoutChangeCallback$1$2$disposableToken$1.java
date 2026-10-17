package androidx.window.layout.adapter.extensions;

import androidx.window.extensions.layout.WindowLayoutInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final /* synthetic */ class ExtensionWindowBackendApi1$registerLayoutChangeCallback$1$2$disposableToken$1 extends q implements Function1<WindowLayoutInfo, Unit> {
    public ExtensionWindowBackendApi1$registerLayoutChangeCallback$1$2$disposableToken$1(Object obj2) {
        super(1, 0, MulticastConsumer.class, obj2, "accept", "accept(Landroidx/window/extensions/layout/WindowLayoutInfo;)V");
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
        invoke((WindowLayoutInfo) obj2);
        return Unit.f186387a;
    }

    public final void invoke(WindowLayoutInfo p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((MulticastConsumer) this.receiver).accept(p0);
    }
}
