package ip0;

import com.revolut.core.ui_kit.delegates.ChatTilesCollectionDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class qa implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f165947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ChatTilesCollectionDelegate.Model f165948b;

    public /* synthetic */ qa(ChatTilesCollectionDelegate.Model model, int i) {
        this.f165947a = i;
        this.f165948b = model;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f165947a;
        ChatTilesCollectionDelegate.Model model = this.f165948b;
        switch (i) {
            case 0:
                ChatTilesCollectionDelegate.Companion aVar = ChatTilesCollectionDelegate.INSTANCE;
                Intrinsics.checkNotNullParameter((ListSubheaderDelegate.Model) obj2, "it");
                return new com.revolut.core.ui_kit.delegates.r3(model);
            default:
                VoucherSmallTileDelegate.Model it8 = (VoucherSmallTileDelegate.Model) obj2;
                ChatTilesCollectionDelegate.Companion aVar2 = ChatTilesCollectionDelegate.INSTANCE;
                Intrinsics.checkNotNullParameter(it8, "it");
                return new com.revolut.core.ui_kit.delegates.o3(model, it8);
        }
    }
}
