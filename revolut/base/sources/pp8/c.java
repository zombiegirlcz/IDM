package pp8;

import ip0.vd;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c extends q implements Function1 {
    public static final c f = new c();

    public c() {
        super(1, e.class, "<init>", "<init>(Lcom/revolut/core/ui_kit/delegates/DatePickerDelegate$ClickData;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        vd p0 = (vd) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return new e(p0);
    }
}
