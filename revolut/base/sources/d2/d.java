package d2;

import androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProviderKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;
import oim.o;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class d implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f110688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f110689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f110690c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ d(int i, int i2, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.f110688a = i2;
        this.f110690c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.f110689b = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f110688a) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return ComposableLambdaImpl.invoke$lambda$2((ComposableLambdaImpl) this.f110690c, this.d, this.e, this.f, this.f110689b, (Composer) obj2, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj3).intValue();
                return BasicTextContextMenuProviderKt.ProvideBasicTextContextMenu$lambda$5((Modifier) this.f110690c, (ProvidableCompositionLocal) this.d, (o) this.e, (Function2) this.f, this.f110689b, (Composer) obj2, iIntValue2);
        }
    }
}
