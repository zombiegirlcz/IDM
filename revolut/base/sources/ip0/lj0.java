package ip0;

import com.revolut.core.ui_kit.delegates.TabsDelegate;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class lj0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f165212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TabsDelegate.Model f165213b;

    public /* synthetic */ lj0(TabsDelegate.Model model, int i) {
        this.f165212a = i;
        this.f165213b = model;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object it8) {
        switch (this.f165212a) {
            case 0:
                String it9 = (String) it8;
                Intrinsics.checkNotNullParameter(it9, "it");
                return new com.revolut.core.ui_kit.delegates.ai(it9, this.f165213b);
            case 1:
                String it10 = (String) it8;
                Intrinsics.checkNotNullParameter(it10, "it");
                return new com.revolut.core.ui_kit.delegates.ai(it10, this.f165213b);
            case 2:
                oj0 it11 = (oj0) it8;
                Intrinsics.checkNotNullParameter(it11, "it");
                return new com.revolut.core.ui_kit.delegates.zh(it11, this.f165213b);
            default:
                Intrinsics.checkNotNullParameter(it8, "it");
                return Boolean.valueOf(this.f165213b.f == null);
        }
    }
}
