package s9h;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.data.model.Data;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pyb.m;
import q0h.i;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f261189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f261190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f261191c;
    public final /* synthetic */ dsh.e d;
    public final /* synthetic */ int e;
    public final /* synthetic */ i f;

    public g(h hVar, String str, String str2, dsh.e eVar, int i, i iVar) {
        this.f261189a = hVar;
        this.f261190b = str;
        this.f261191c = str2;
        this.d = eVar;
        this.e = i;
        this.f = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Data it8 = (Data) obj2;
        Intrinsics.checkNotNullParameter(it8, "it");
        String str = this.f261190b;
        h hVar = this.f261189a;
        return (BaseDraggableWidgetDelegate.Model) iii.c.f(it8, new q2k.b(28, str, hVar, this.f261191c, this.d), new qce.b(hVar, str, 14), new m(hVar, str, this.e, this.f, 2));
    }
}
