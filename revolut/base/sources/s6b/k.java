package s6b;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import java.util.HashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f260204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HashMap f260205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InputTextDelegate.TextData f260206c;

    public /* synthetic */ k(HashMap map, InputTextDelegate.TextData textData, int i) {
        this.f260204a = i;
        this.f260205b = map;
        this.f260206c = textData;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f260204a) {
            case 0:
                g update = (g) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                InputTextDelegate.TextData textData = this.f260206c;
                String str = textData.f52597a;
                String string = textData.f52598b.toString();
                HashMap map = this.f260205b;
                map.put(str, string);
                return g.a(update, map, null, null, false, 14);
            default:
                u6b.e update2 = (u6b.e) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                InputTextDelegate.TextData textData2 = this.f260206c;
                String str2 = textData2.f52597a;
                String string2 = textData2.f52598b.toString();
                HashMap map2 = this.f260205b;
                map2.put(str2, string2);
                return u6b.e.a(update2, map2, null, null, false, 14);
        }
    }
}
