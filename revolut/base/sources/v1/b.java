package v1;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material.ButtonKt;
import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class b implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f284935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PaddingValues f284936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function3 f284937c;

    public /* synthetic */ b(PaddingValues paddingValues, Function3 function3, int i) {
        this.f284935a = i;
        this.f284936b = paddingValues;
        this.f284937c = function3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        int i = this.f284935a;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                return ButtonKt.Button$lambda$3$0(this.f284936b, this.f284937c, composer, iIntValue);
            default:
                return ButtonKt.Button$lambda$3$0$0(this.f284936b, this.f284937c, composer, iIntValue);
        }
    }
}
