package kwg;

import androidx.compose.foundation.text.contextmenu.internal.PlatformDefaultTextContextMenuProviders_androidKt;
import androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f190331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f190332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f190333c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ c(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.f190331a = i;
        this.f190332b = obj2;
        this.f190333c = obj3;
        this.d = obj4;
        this.e = obj5;
        this.f = obj6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f190331a) {
            case 0:
                l lVar = (l) this.f190332b;
                List list = (List) this.f190333c;
                eel.c cVar = (eel.c) this.d;
                iwg.c cVar2 = (iwg.c) this.e;
                String str = (String) this.f;
                String userId = (String) obj2;
                xi0.b currency = (xi0.b) obj3;
                Intrinsics.checkNotNullParameter(userId, "userId");
                Intrinsics.checkNotNullParameter(currency, "currency");
                return rd0.e.c(nim.a.v(lVar.f190364r.b(userId, list, cVar, currency, cVar2, str, w4l.i.f294643c), new kvg.j(lVar, 23)), kotlin.coroutines.g.f186406a);
            case 1:
                return PlatformDefaultTextContextMenuProviders_androidKt.ProvideBothDefaultProviders$lambda$4((Modifier) this.f190332b, (MutableState) this.f190333c, (Function2) this.d, (BasicTextContextMenuProvider) this.e, (Function0) this.f, (Composer) obj2, ((Integer) obj3).intValue());
            default:
                Data data = (Data) this.f190332b;
                tij.m mVar = (tij.m) this.f190333c;
                Data data2 = (Data) this.d;
                Data data3 = (Data) this.e;
                Data data4 = (Data) this.f;
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return tij.m.a(mVar, data2, data3, data4, data);
        }
    }
}
