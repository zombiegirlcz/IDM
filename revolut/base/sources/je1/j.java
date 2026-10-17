package je1;

import com.revolut.core.ui_kit.delegates.IconSelectorDelegate;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f173179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IconSelectorDelegate.SelectableIconModel f173180b;

    public /* synthetic */ j(IconSelectorDelegate.SelectableIconModel selectableIconModel, int i) {
        this.f173179a = i;
        this.f173180b = selectableIconModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f173179a) {
            case 0:
                f update = (f) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                Object obj3 = this.f173180b.f52505l;
                Intrinsics.i(obj3, "null cannot be cast to non-null type kotlin.String");
                return f.a(update, null, (String) obj3, 5);
            default:
                ye1.i update2 = (ye1.i) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                Object obj4 = this.f173180b.f52505l;
                Intrinsics.i(obj4, "null cannot be cast to non-null type kotlin.String");
                return ye1.i.a(update2, null, null, 0L, null, (String) obj4, null, null, null, null, null, false, 4079);
        }
    }
}
