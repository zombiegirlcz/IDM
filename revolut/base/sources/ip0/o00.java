package ip0;

import com.revolut.core.ui_kit.delegates.PhoneEditorDelegate;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class o00 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f165599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.core.ui_kit.delegates.ka f165600b;

    public /* synthetic */ o00(com.revolut.core.ui_kit.delegates.ka kaVar, int i) {
        this.f165599a = i;
        this.f165600b = kaVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f165599a) {
            case 0:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return this.f165600b.f54376a;
            default:
                CharSequence it8 = (CharSequence) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return new PhoneEditorDelegate.PhoneData(this.f165600b.f54376a, it8.toString());
        }
    }
}
